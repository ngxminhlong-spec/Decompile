package p1;

import c1.C0238g;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k0 extends Y {

    /* renamed from: T, reason: collision with root package name */
    public int f14557T;

    /* renamed from: U, reason: collision with root package name */
    public int f14558U;

    @Override // p1.Y
    public final void N() {
        ArrayList arrayList = this.f14486P;
        C0238g c0238g = (C0238g) arrayList.get(0);
        C0238g c0238g2 = (C0238g) arrayList.get(1);
        int i4 = this.f14558U;
        boolean z4 = i4 == 1 || i4 == 3;
        boolean z5 = i4 == 2 || i4 == 3;
        if (z4 != c0238g.f3557s) {
            c0238g.f3557s = z4;
            c0238g.e(Boolean.valueOf(z4));
        }
        if (z5 != c0238g2.f3557s) {
            c0238g2.f3557s = z5;
            c0238g2.e(Boolean.valueOf(z5));
        }
        this.f14557T = this.f14558U;
    }

    @Override // p1.Y
    public final int O() {
        return 2;
    }

    @Override // p1.Y
    public final C1915a P() {
        return new C1915a(this, 10);
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 56;
    }
}
