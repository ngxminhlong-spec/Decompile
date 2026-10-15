package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417yE implements InterfaceC0690hF {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0690hF f11352a;

    /* renamed from: b, reason: collision with root package name */
    public final C0997oh f11353b;

    public C1417yE(InterfaceC0690hF interfaceC0690hF, C0997oh c0997oh) {
        this.f11352a = interfaceC0690hF;
        this.f11353b = c0997oh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final C0997oh a() {
        return this.f11353b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final int b() {
        return this.f11352a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final C0976o2 c(int i4) {
        return this.f11352a.c(i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final int e() {
        return this.f11352a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1417yE)) {
            return false;
        }
        C1417yE c1417yE = (C1417yE) obj;
        return this.f11352a.equals(c1417yE.f11352a) && this.f11353b.equals(c1417yE.f11353b);
    }

    public final int hashCode() {
        return this.f11352a.hashCode() + ((this.f11353b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final int u(int i4) {
        return this.f11352a.u(i4);
    }
}
