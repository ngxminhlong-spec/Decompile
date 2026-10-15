package p1;

import c1.C0237f;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V extends X {

    /* renamed from: a0, reason: collision with root package name */
    public C0237f f14482a0;

    @Override // p1.X, p1.AbstractC1906D
    public final W0.a N(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2) {
        return new R0.a(j4, f4, f5, arrayList, arrayList2, 2);
    }

    @Override // p1.X, p1.AbstractC1906D
    public final void O(C0237f c0237f) {
        Object obj;
        if (c0237f == this.f14482a0 && (obj = c0237f.f1252p) != null && ((Boolean) obj).booleanValue()) {
            super.O(c0237f);
        }
    }

    @Override // p1.X, p1.AbstractC1906D
    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0237f c0237f = (C0237f) obj;
            if ("CLK".equals(c0237f.f3553r.f3546o)) {
                this.f14482a0 = c0237f;
            }
        }
        super.Q(arrayList, arrayList2);
    }

    @Override // p1.X, h1.AbstractC1698a
    public final int r() {
        return 30;
    }
}
