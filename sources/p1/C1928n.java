package p1;

import c1.C0237f;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1928n extends AbstractC1906D {

    /* renamed from: Y, reason: collision with root package name */
    public C0237f f14565Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0237f f14566Z;

    @Override // p1.AbstractC1906D
    public final W0.a N(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2) {
        return new R0.a(j4, f4, f5, arrayList, arrayList2, 4);
    }

    @Override // p1.AbstractC1906D
    public final void O(C0237f c0237f) {
        Object obj = this.f14566Z.f1252p;
        if (obj == null || !((Boolean) obj).booleanValue()) {
            return;
        }
        Object obj2 = this.f14565Y.f1252p;
        boolean z4 = obj2 != null && ((Boolean) obj2).booleanValue();
        P(z4, !z4);
    }

    @Override // p1.AbstractC1906D
    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0237f c0237f = (C0237f) obj;
            if ("D".equals(c0237f.f3553r.f3546o)) {
                this.f14565Y = c0237f;
            } else if ("E".equals(c0237f.f3553r.f3546o)) {
                this.f14566Z = c0237f;
            }
        }
        P(false, true);
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 27;
    }
}
