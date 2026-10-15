package p1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h0 implements e1.e {

    /* renamed from: a, reason: collision with root package name */
    public long f14533a;

    /* renamed from: b, reason: collision with root package name */
    public long f14534b;
    public float c;
    public final /* synthetic */ i0 d;

    public h0(i0 i0Var) {
        this.d = i0Var;
    }

    @Override // e1.e
    public final float a() {
        return 40.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [g1.a, java.lang.Object] */
    @Override // e1.e
    public final void b(long j4) {
        i0 i0Var = this.d;
        h0 h0Var = i0Var.f14544Z;
        if (!i0Var.f14546b0) {
            this.f14533a = j4;
            return;
        }
        long j5 = j4 - this.f14533a;
        if (j5 < 0) {
            j5 = 0;
        }
        this.f14534b += j5;
        this.f14533a = j4;
        i0Var.f13118B.n(new Object());
        int i4 = i0Var.f14549e0 * 1000;
        long j6 = this.f14534b;
        this.c = ((float) j6) / i4;
        if (j6 >= i4) {
            if (!i0Var.f14543Y) {
                i0Var.Q(false);
                i0Var.f14546b0 = false;
                h0Var.c = 0.0f;
            } else {
                Object obj = i0Var.f14541W.f1252p;
                if (obj == null || !((Boolean) obj).booleanValue()) {
                    i0Var.Q(true);
                }
                i0Var.f14546b0 = false;
                h0Var.c = 0.0f;
            }
        }
    }
}
