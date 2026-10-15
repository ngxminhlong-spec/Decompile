package p1;

import c1.C0237f;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class X extends AbstractC1906D {

    /* renamed from: Y, reason: collision with root package name */
    public C0237f f14484Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0237f f14485Z;

    @Override // p1.AbstractC1906D
    public W0.a N(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2) {
        return new R0.a(j4, f4, f5, arrayList, arrayList2, 7);
    }

    @Override // p1.AbstractC1906D
    public void O(C0237f c0237f) {
        Object obj = this.f14484Y.f1252p;
        boolean z4 = obj != null && ((Boolean) obj).booleanValue();
        Object obj2 = this.f14485Z.f1252p;
        boolean z5 = obj2 != null && ((Boolean) obj2).booleanValue();
        if (z4 ^ z5) {
            P(z4, z5);
        } else if (z4) {
            P(false, false);
        }
    }

    @Override // p1.AbstractC1906D
    public void Q(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0237f c0237f = (C0237f) obj;
            if ("S".equals(c0237f.f3553r.f3546o)) {
                this.f14484Y = c0237f;
            } else if ("R".equals(c0237f.f3553r.f3546o)) {
                this.f14485Z = c0237f;
            }
        }
        P(false, true);
    }

    @Override // h1.AbstractC1698a
    public int r() {
        return 25;
    }
}
