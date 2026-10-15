package A2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.Ur;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f38o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f39p;

    public q() {
        this.f38o = 0;
        Ur ur = new Ur(Looper.getMainLooper(), 4, false);
        Looper.getMainLooper();
        this.f39p = ur;
    }

    public /* synthetic */ q(int i4, Object obj) {
        this.f38o = i4;
        this.f39p = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f38o) {
            case 0:
                ((Ur) this.f39p).post(runnable);
                return;
            case 1:
                ((Executor) this.f39p).execute(new o3.j(runnable, 1));
                return;
            default:
                ((Handler) ((t3.g) this.f39p).f14962p).post(runnable);
                return;
        }
    }
}
