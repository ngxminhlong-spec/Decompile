package p1;

import c1.C0238g;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1908F extends Y {

    /* renamed from: T, reason: collision with root package name */
    public int f14402T;

    /* renamed from: U, reason: collision with root package name */
    public int f14403U;

    /* renamed from: V, reason: collision with root package name */
    public float f14404V;

    /* renamed from: W, reason: collision with root package name */
    public int f14405W;

    @Override // p1.Y
    public final void N() {
        ArrayList arrayList = this.f14486P;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C0238g c0238g = (C0238g) obj;
            boolean z4 = i4 == this.f14403U;
            if (z4 != c0238g.f3557s) {
                c0238g.f3557s = z4;
                c0238g.e(Boolean.valueOf(z4));
            }
            i4++;
        }
        this.f14402T = this.f14403U;
    }

    @Override // p1.Y
    public final int O() {
        return 1;
    }

    @Override // p1.Y
    public final C1915a P() {
        return new C1915a(this, 4);
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 55;
    }
}
