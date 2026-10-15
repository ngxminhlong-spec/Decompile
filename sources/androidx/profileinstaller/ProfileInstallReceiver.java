package androidx.profileinstaller;

import D3.d;
import X.b;
import Z.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            g.s(context, new b(0), new d(23, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                d dVar = new d(23, this);
                try {
                    g.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    dVar.n(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e4) {
                    dVar.n(7, e4);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            d dVar2 = new d(23, this);
            if (Build.VERSION.SDK_INT < 24) {
                dVar2.n(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                dVar2.n(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        d dVar3 = new d(23, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            dVar3.n(16, null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
        } else {
            codeCacheDir = context.getCodeCacheDir();
        }
        if (g.c(codeCacheDir)) {
            dVar3.n(14, null);
        } else {
            dVar3.n(15, null);
        }
    }
}
