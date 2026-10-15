package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class T0 extends S0 {
    public boolean c;

    public T0(X0 x02) {
        super(x02);
        this.f15438b.f15496q++;
    }

    public final void h() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f15438b.f15497r++;
        this.c = true;
    }

    public abstract void j();
}
