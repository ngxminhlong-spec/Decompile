package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class C extends AbstractC0134m {

    /* renamed from: q, reason: collision with root package name */
    public long f2062q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2063r;

    /* renamed from: s, reason: collision with root package name */
    public K3.a f2064s;

    public final void i() {
        long j4 = this.f2062q - 4294967296L;
        this.f2062q = j4;
        if (j4 <= 0 && this.f2063r) {
            shutdown();
        }
    }

    public abstract Thread j();

    public final void k(boolean z4) {
        this.f2062q = (z4 ? 4294967296L : 1L) + this.f2062q;
        if (z4) {
            return;
        }
        this.f2063r = true;
    }

    public final boolean l() {
        K3.a aVar = this.f2064s;
        if (aVar == null) {
            return false;
        }
        AbstractC0143w abstractC0143w = (AbstractC0143w) (aVar.isEmpty() ? null : aVar.removeFirst());
        if (abstractC0143w == null) {
            return false;
        }
        abstractC0143w.run();
        return true;
    }

    public abstract void shutdown();
}
