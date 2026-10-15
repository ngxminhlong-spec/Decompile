package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15370o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D f15371p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I0 f15372q;

    public /* synthetic */ G0(I0 i02, D d, int i4) {
        this.f15370o = i4;
        this.f15372q = i02;
        this.f15371p = d;
    }

    private final void a() {
        synchronized (this.f15372q) {
            try {
                this.f15372q.f15384o = false;
                if (!this.f15372q.f15386q.l()) {
                    K k3 = ((C2066c0) this.f15372q.f15386q.f1719a).f15568i;
                    C2066c0.i(k3);
                    k3.f15402n.a("Connected to service");
                    J0 j02 = this.f15372q.f15386q;
                    D d = this.f15371p;
                    j02.g();
                    j02.d = d;
                    j02.q();
                    j02.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15370o) {
            case 0:
                a();
                return;
            default:
                synchronized (this.f15372q) {
                    try {
                        this.f15372q.f15384o = false;
                        if (!this.f15372q.f15386q.l()) {
                            K k3 = ((C2066c0) this.f15372q.f15386q.f1719a).f15568i;
                            C2066c0.i(k3);
                            k3.f15401m.a("Connected to remote service");
                            J0 j02 = this.f15372q.f15386q;
                            D d = this.f15371p;
                            j02.g();
                            j02.d = d;
                            j02.q();
                            j02.p();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
