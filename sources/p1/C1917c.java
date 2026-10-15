package p1;

import c1.C0234c;
import c1.C0237f;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1917c extends AbstractC1935v {
    @Override // p1.AbstractC1935v
    public final boolean N() {
        ArrayList arrayList = this.f14588P;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Object obj2 = ((C0237f) obj).f1252p;
            if (obj2 == null || !((Boolean) obj2).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        ArrayList arrayList = this.f14588P;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0234c c0234c = ((C0237f) obj).f3553r;
            arrayList2.add(new C0234c(c0234c.f3547p, c0234c.f3548q, c0234c.f3546o, c0234c.f3549r));
        }
        C0234c c0234c2 = this.f14589Q.f3556r;
        return new S0.a(j4, this.f13122o, this.f13123p, arrayList2, new C0234c(c0234c2.f3547p, c0234c2.f3548q, c0234c2.f3546o, c0234c2.f3549r), 0);
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 0;
    }
}
