package p1;

import c1.C0234c;
import c1.C0237f;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1904B extends AbstractC1933t {

    /* renamed from: Y, reason: collision with root package name */
    public C0237f f14385Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0237f f14386Z;

    /* renamed from: a0, reason: collision with root package name */
    public C0237f f14387a0;

    @Override // p1.AbstractC1906D
    public final W0.a N(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2) {
        return new R0.a(j4, f4, f5, arrayList, arrayList2, 1);
    }

    @Override // p1.AbstractC1906D
    public final void O(C0237f c0237f) {
        Object obj;
        if (c0237f == this.f14387a0 && (obj = c0237f.f1252p) != null && ((Boolean) obj).booleanValue()) {
            Object obj2 = this.f14385Y.f1252p;
            boolean z4 = false;
            boolean z5 = obj2 != null && ((Boolean) obj2).booleanValue();
            Object obj3 = this.f14386Z.f1252p;
            if (obj3 != null && ((Boolean) obj3).booleanValue()) {
                z4 = true;
            }
            if (z5 ^ z4) {
                P(z5, z4);
            } else if (z5) {
                boolean z6 = this.f14396U;
                P(!z6, z6);
            }
        }
    }

    @Override // p1.AbstractC1906D
    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0237f c0237f = (C0237f) obj;
            C0234c c0234c = c0237f.f3553r;
            C0234c c0234c2 = c0237f.f3553r;
            if ("J".equals(c0234c.f3546o)) {
                this.f14385Y = c0237f;
            } else if ("K".equals(c0234c2.f3546o)) {
                this.f14386Z = c0237f;
            } else if ("CLK".equals(c0234c2.f3546o)) {
                this.f14387a0 = c0237f;
            }
        }
        P(false, true);
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 33;
    }
}
