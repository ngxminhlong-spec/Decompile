package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qo implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6698a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.r f6699b;

    public /* synthetic */ Qo(B0.r rVar, int i4) {
        this.f6698a = i4;
        this.f6699b = rVar;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6698a) {
            case 0:
                String str = ((C0370Za) this.f6699b.f113p).f7992r;
                AbstractC0587ez.n(str);
                return str;
            case 1:
                return Integer.valueOf(this.f6699b.f112o);
            case 2:
                return Boolean.valueOf(((C0370Za) this.f6699b.f113p).f7999z);
            case 3:
                return Boolean.valueOf(((C0370Za) this.f6699b.f113p).f7989o.getBoolean("is_gbid"));
            case 4:
                return Boolean.valueOf(((C0370Za) this.f6699b.f113p).y);
            default:
                String str2 = ((C0370Za) this.f6699b.f113p).f7996v;
                AbstractC0587ez.n(str2);
                return str2;
        }
    }
}
