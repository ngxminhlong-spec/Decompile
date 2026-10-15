package Z;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2285o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f2286p;

    public /* synthetic */ h(Context context, int i4) {
        this.f2285o = i4;
        this.f2286p = context;
    }

    public /* synthetic */ h(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f2285o = 0;
        this.f2286p = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2285o) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h(this.f2286p, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f2286p, 2));
                return;
            default:
                g.s(this.f2286p, new X.b(0), g.f2277a, false);
                return;
        }
    }
}
