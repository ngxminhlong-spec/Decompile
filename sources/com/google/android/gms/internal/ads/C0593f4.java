package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593f4 extends AbstractCallableC0892m4 {

    /* renamed from: h, reason: collision with root package name */
    public final long f8676h;

    public C0593f4(U3 u32, C0549e3 c0549e3, long j4, int i4) {
        super(u32, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", c0549e3, i4, 25);
        this.f8676h = j4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        long longValue = ((Long) this.f9562e.invoke(null, null)).longValue();
        synchronized (this.d) {
            try {
                C0549e3 c0549e3 = this.d;
                c0549e3.d();
                C0977o3.d0((C0977o3) c0549e3.f4561p, longValue);
                long j4 = this.f8676h;
                if (j4 != 0) {
                    C0549e3 c0549e32 = this.d;
                    c0549e32.d();
                    C0977o3.E0((C0977o3) c0549e32.f4561p, longValue - j4);
                    C0549e3 c0549e33 = this.d;
                    long j5 = this.f8676h;
                    c0549e33.d();
                    C0977o3.H0((C0977o3) c0549e33.f4561p, j5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
