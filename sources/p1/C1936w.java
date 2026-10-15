package p1;

import c1.C0238g;
import g1.InterfaceC1680a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1936w implements InterfaceC1680a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1939z f14592b;

    public C1936w(C1939z c1939z, boolean z4) {
        this.f14592b = c1939z;
        this.f14591a = z4;
    }

    @Override // g1.InterfaceC1680a
    public final void a() {
        C1939z c1939z = this.f14592b;
        boolean z4 = this.f14591a;
        c1939z.f14599Q = z4;
        C0238g c0238g = c1939z.f14598P;
        c0238g.f3557s = z4;
        c0238g.e(Boolean.valueOf(z4));
    }

    @Override // g1.InterfaceC1680a
    public final String getId() {
        return this.f14592b.f13120D;
    }
}
