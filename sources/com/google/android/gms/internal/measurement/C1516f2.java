package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0544dz;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1516f2 implements InterfaceC1549m2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1571s1 f11932a;

    /* renamed from: b, reason: collision with root package name */
    public final C1561p2 f11933b;
    public final B1 c;

    public C1516f2(C1561p2 c1561p2, B1 b12, AbstractC1571s1 abstractC1571s1) {
        this.f11933b = c1561p2;
        this.c = b12;
        this.f11932a = abstractC1571s1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final Object a() {
        return ((H1) ((I1) this.f11932a).k(5)).e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void b(Object obj) {
        this.f11933b.getClass();
        ((I1) obj).zzc.f11995e = false;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final boolean c(Object obj) {
        this.c.getClass();
        U.a.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void d(Object obj, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        I1 i12 = (I1) obj;
        if (i12.zzc == C1557o2.f11992f) {
            i12.zzc = C1557o2.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void e(Object obj, C1599z1 c1599z1) {
        this.c.getClass();
        U.a.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final int f(I1 i12) {
        this.f11933b.getClass();
        return i12.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void g(I1 i12, I1 i13) {
        AbstractC1553n2.a(this.f11933b, i12, i13);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final boolean h(I1 i12, I1 i13) {
        this.f11933b.getClass();
        return i12.zzc.equals(i13.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final int l(Object obj) {
        this.f11933b.getClass();
        C1557o2 c1557o2 = ((I1) obj).zzc;
        int i4 = c1557o2.d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < c1557o2.f11993a; i6++) {
            int i7 = c1557o2.f11994b[i6];
            C1591x1 c1591x1 = (C1591x1) c1557o2.c[i6];
            int L4 = C1595y1.L(8);
            int j4 = c1591x1.j();
            i5 += C1595y1.L(j4) + j4 + C1595y1.L(24) + U.a.r(i7 >>> 3, C1595y1.L(16), L4 + L4);
        }
        c1557o2.d = i5;
        return i5;
    }
}
