package C0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f371o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D f372p;

    public /* synthetic */ r(D d, int i4) {
        this.f371o = i4;
        this.f372p = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f371o) {
            case 0:
                this.f372p.f222u0.setPressed(false);
                return;
            default:
                this.f372p.f175H0.setVisibility(8);
                return;
        }
    }
}
