package o3;

import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14362o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f14363p;

    public /* synthetic */ j(Runnable runnable, int i4) {
        this.f14362o = i4;
        this.f14363p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14362o) {
            case 0:
                this.f14363p.run();
                return;
            default:
                try {
                    this.f14363p.run();
                    return;
                } catch (Exception e4) {
                    AbstractC1806a.k("Executor", "Background execution failure.", e4);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f14362o) {
            case 0:
                return this.f14363p.toString();
            default:
                return super.toString();
        }
    }
}
