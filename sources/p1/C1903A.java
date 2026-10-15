package p1;

import h1.AbstractC1698a;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1903A extends C1912J {
    @Override // p1.C1912J, h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
    }

    @Override // p1.C1912J, h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14419F;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(this);
            arrayList3.add((O0.a) obj);
            arrayList.add(new E0.b(0, new E0.b(arrayList3)));
        }
        ArrayList arrayList4 = this.f14420G;
        int size2 = arrayList4.size();
        while (i4 < size2) {
            Object obj2 = arrayList4.get(i4);
            i4++;
            ((AbstractC1698a) obj2).u(arrayList);
        }
    }
}
