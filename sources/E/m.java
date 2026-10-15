package E;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f701o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f702p;

    public /* synthetic */ m(Handler handler, int i4) {
        this.f701o = i4;
        this.f702p = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f701o) {
            case 0:
                runnable.getClass();
                Handler handler = this.f702p;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                this.f702p.post(runnable);
                return;
            default:
                this.f702p.post(runnable);
                return;
        }
    }
}
