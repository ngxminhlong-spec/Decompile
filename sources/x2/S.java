package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class S extends AbstractC2110z {

    /* renamed from: b, reason: collision with root package name */
    public boolean f15437b;

    public S(C2066c0 c2066c0) {
        super(c2066c0);
        ((C2066c0) this.f1719a).f15559E++;
    }

    @Override // Q1.AbstractC0115n
    public final void e() {
        if (!this.f15437b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.f15437b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        ((C2066c0) this.f1719a).a();
        this.f15437b = true;
    }

    public abstract boolean i();
}
