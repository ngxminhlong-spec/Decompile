package m2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import h2.y;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14053a;

    public b(Context context, int i4) {
        switch (i4) {
            case 1:
                y.i(context);
                Context applicationContext = context.getApplicationContext();
                y.i(applicationContext);
                this.f14053a = applicationContext;
                return;
            default:
                this.f14053a = context;
                return;
        }
    }

    public ApplicationInfo a(String str, int i4) {
        return this.f14053a.getPackageManager().getApplicationInfo(str, i4);
    }

    public PackageInfo b(String str, int i4) {
        return this.f14053a.getPackageManager().getPackageInfo(str, i4);
    }

    public boolean c() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f14053a;
        if (callingUid == myUid) {
            return AbstractC1806a.F(context);
        }
        if (!AbstractC1799b.f() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }
}
