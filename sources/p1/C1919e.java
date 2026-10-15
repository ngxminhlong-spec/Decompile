package p1;

import android.util.Pair;
import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import java.util.ArrayList;
import java.util.Iterator;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919e extends AbstractC1935v {

    /* renamed from: S, reason: collision with root package name */
    public final /* synthetic */ int f14516S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1919e(long j4, float f4, float f5, ArrayList arrayList, C0238g c0238g, C1995b c1995b, int i4) {
        super(j4, f4, f5, arrayList, c0238g, c1995b);
        this.f14516S = i4;
    }

    @Override // p1.AbstractC1913K
    public Pair C() {
        switch (this.f14516S) {
            case 1:
                return this.f13118B.j(11);
            case 2:
            default:
                return super.C();
            case 3:
                return this.f13118B.j(7);
        }
    }

    @Override // p1.AbstractC1935v
    public final boolean N() {
        switch (this.f14516S) {
            case 0:
                Iterator it = this.f14588P.iterator();
                if (!it.hasNext()) {
                    return false;
                }
                Object obj = ((C0237f) it.next()).f1252p;
                return obj == null || ((Boolean) obj).booleanValue();
            case 1:
                Iterator it2 = this.f14588P.iterator();
                if (!it2.hasNext()) {
                    return false;
                }
                Object obj2 = ((C0237f) it2.next()).f1252p;
                return obj2 == null || !((Boolean) obj2).booleanValue();
            case 2:
                ArrayList arrayList = this.f14588P;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    Object obj4 = ((C0237f) obj3).f1252p;
                    if (obj4 == null || !((Boolean) obj4).booleanValue()) {
                        return false;
                    }
                }
                return true;
            case 3:
                ArrayList arrayList2 = this.f14588P;
                int size2 = arrayList2.size();
                boolean z4 = false;
                boolean z5 = false;
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        Object obj5 = arrayList2.get(i5);
                        i5++;
                        Object obj6 = ((C0237f) obj5).f1252p;
                        if (obj6 != null && ((Boolean) obj6).booleanValue()) {
                            if (!z5) {
                                z5 = true;
                            }
                        }
                    } else {
                        z4 = z5;
                    }
                }
                return !z4;
            default:
                ArrayList arrayList3 = this.f14588P;
                int size3 = arrayList3.size();
                boolean z6 = false;
                int i6 = 0;
                while (i6 < size3) {
                    Object obj7 = arrayList3.get(i6);
                    i6++;
                    Object obj8 = ((C0237f) obj7).f1252p;
                    if (obj8 != null && ((Boolean) obj8).booleanValue()) {
                        if (z6) {
                            return false;
                        }
                        z6 = true;
                    }
                }
                return z6;
        }
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        switch (this.f14516S) {
            case 0:
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
                return new S0.a(j4, this.f13122o, this.f13123p, arrayList2, new C0234c(c0234c2.f3547p, c0234c2.f3548q, c0234c2.f3546o, c0234c2.f3549r), 1);
            case 1:
                ArrayList arrayList3 = this.f14588P;
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList3.get(i5);
                    i5++;
                    C0234c c0234c3 = ((C0237f) obj2).f3553r;
                    arrayList4.add(new C0234c(c0234c3.f3547p, c0234c3.f3548q, c0234c3.f3546o, c0234c3.f3549r));
                }
                C0234c c0234c4 = this.f14589Q.f3556r;
                return new S0.a(j4, this.f13122o, this.f13123p, arrayList4, new C0234c(c0234c4.f3547p, c0234c4.f3548q, c0234c4.f3546o, c0234c4.f3549r), 4);
            case 2:
                ArrayList arrayList5 = this.f14588P;
                ArrayList arrayList6 = new ArrayList(arrayList5.size());
                int size3 = arrayList5.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList5.get(i6);
                    i6++;
                    C0234c c0234c5 = ((C0237f) obj3).f3553r;
                    arrayList6.add(new C0234c(c0234c5.f3547p, c0234c5.f3548q, c0234c5.f3546o, c0234c5.f3549r));
                }
                C0234c c0234c6 = this.f14589Q.f3556r;
                return new S0.a(j4, this.f13122o, this.f13123p, arrayList6, new C0234c(c0234c6.f3547p, c0234c6.f3548q, c0234c6.f3546o, c0234c6.f3549r), 6);
            case 3:
                ArrayList arrayList7 = this.f14588P;
                ArrayList arrayList8 = new ArrayList(arrayList7.size());
                int size4 = arrayList7.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj4 = arrayList7.get(i7);
                    i7++;
                    C0234c c0234c7 = ((C0237f) obj4).f3553r;
                    arrayList8.add(new C0234c(c0234c7.f3547p, c0234c7.f3548q, c0234c7.f3546o, c0234c7.f3549r));
                }
                C0234c c0234c8 = this.f14589Q.f3556r;
                return new S0.a(j4, this.f13122o, this.f13123p, arrayList8, new C0234c(c0234c8.f3547p, c0234c8.f3548q, c0234c8.f3546o, c0234c8.f3549r), 7);
            default:
                ArrayList arrayList9 = this.f14588P;
                ArrayList arrayList10 = new ArrayList(arrayList9.size());
                int size5 = arrayList9.size();
                int i8 = 0;
                while (i8 < size5) {
                    Object obj5 = arrayList9.get(i8);
                    i8++;
                    C0234c c0234c9 = ((C0237f) obj5).f3553r;
                    arrayList10.add(new C0234c(c0234c9.f3547p, c0234c9.f3548q, c0234c9.f3546o, c0234c9.f3549r));
                }
                C0234c c0234c10 = this.f14589Q.f3556r;
                return new S0.a(j4, this.f13122o, this.f13123p, arrayList10, new C0234c(c0234c10.f3547p, c0234c10.f3548q, c0234c10.f3546o, c0234c10.f3549r), 8);
        }
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        switch (this.f14516S) {
            case 0:
                return 11;
            case 1:
                return 6;
            case 2:
                return 51;
            case 3:
                return 10;
            default:
                return 7;
        }
    }
}
