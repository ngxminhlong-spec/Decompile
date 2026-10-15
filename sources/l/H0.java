package l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13616o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I0 f13617p;

    public /* synthetic */ H0(I0 i02, int i4) {
        this.f13616o = i4;
        this.f13617p = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13616o) {
            case 0:
                this.f13617p.c(false);
                return;
            default:
                this.f13617p.a();
                return;
        }
    }
}
