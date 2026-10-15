package p1;

import c1.C0238g;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1922h extends Y {

    /* renamed from: T, reason: collision with root package name */
    public float[] f14531T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f14532U;

    @Override // p1.Y
    public final void N() {
        float[] fArr = this.f14532U;
        ArrayList arrayList = this.f14486P;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C0238g c0238g = (C0238g) obj;
            boolean z4 = fArr[i4] > 0.0f;
            if (z4 != c0238g.f3557s) {
                c0238g.f3557s = z4;
                c0238g.e(Boolean.valueOf(z4));
            }
            this.f14531T[i4] = fArr[i4];
            i4++;
        }
    }

    @Override // p1.Y
    public final int O() {
        return 3;
    }

    @Override // p1.Y
    public final C1915a P() {
        return new C1915a(this, 2);
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 57;
    }
}
