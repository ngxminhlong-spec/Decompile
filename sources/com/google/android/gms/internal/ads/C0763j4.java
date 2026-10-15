package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763j4 extends AbstractCallableC0892m4 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9122h;

    public C0763j4(U3 u32, C0549e3 c0549e3, int i4) {
        super(u32, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", c0549e3, i4, 61);
        this.f9122h = u32.f7141q.f6784a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        long longValue = ((Long) this.f9562e.invoke(null, this.f9560a.f7127a, Boolean.valueOf(this.f9122h))).longValue();
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            c0549e3.d();
            C0977o3.R((C0977o3) c0549e3.f4561p, longValue);
        }
    }
}
