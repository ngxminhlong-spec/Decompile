package X;

import java.util.concurrent.Executor;
import m.C1801a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2127o;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2127o) {
            case 0:
                runnable.run();
                return;
            default:
                C1801a.j0().f13969h.f13973i.execute(runnable);
                return;
        }
    }
}
