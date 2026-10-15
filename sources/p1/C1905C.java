package p1;

import c1.C0234c;
import c1.C0237f;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1905C extends AbstractC1906D {

    /* renamed from: Y, reason: collision with root package name */
    public C0237f f14388Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0237f f14389Z;

    /* renamed from: a0, reason: collision with root package name */
    public C0237f f14390a0;

    @Override // p1.AbstractC1906D
    public final W0.a N(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2) {
        return new R0.a(j4, f4, f5, arrayList, arrayList2, 5);
    }

    @Override // p1.AbstractC1906D
    public final void O(C0237f c0237f) {
        Object obj = this.f14390a0.f1252p;
        if (obj == null || !((Boolean) obj).booleanValue()) {
            return;
        }
        Object obj2 = this.f14388Y.f1252p;
        boolean z4 = false;
        boolean z5 = obj2 != null && ((Boolean) obj2).booleanValue();
        Object obj3 = this.f14389Z.f1252p;
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
                this.f14388Y = c0237f;
            } else if ("K".equals(c0234c2.f3546o)) {
                this.f14389Z = c0237f;
            } else if ("E".equals(c0234c2.f3546o)) {
                this.f14390a0 = c0237f;
            }
        }
        P(false, true);
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 28;
    }
}
