package p1;

import c1.C0237f;
import c1.C0238g;
import g1.InterfaceC1680a;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920f implements InterfaceC1680a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1913K f14526b;

    public /* synthetic */ C1920f(AbstractC1913K abstractC1913K, int i4) {
        this.f14525a = i4;
        this.f14526b = abstractC1913K;
    }

    @Override // g1.InterfaceC1680a
    public final void a() {
        switch (this.f14525a) {
            case 0:
                C1921g c1921g = (C1921g) this.f14526b;
                C0238g c0238g = c1921g.f14529P;
                boolean z4 = c1921g.f14530Q;
                c0238g.f3557s = z4;
                c0238g.e(Boolean.valueOf(z4));
                return;
            case 1:
                C1929o c1929o = (C1929o) this.f14526b;
                ArrayList arrayList = c1929o.f14569R;
                ArrayList arrayList2 = c1929o.f14568Q;
                int size = arrayList2.size();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    Object obj2 = ((C0237f) obj).f1252p;
                    if (obj2 != null && ((Boolean) obj2).booleanValue()) {
                        i4 = (int) (Math.pow(2.0d, i5) + i4);
                    }
                    i5++;
                }
                c1929o.f14574W = i4;
                Boolean bool = (Boolean) c1929o.f14567P.f1252p;
                boolean booleanValue = bool.booleanValue();
                C0238g c0238g2 = (C0238g) arrayList.get(i4);
                if (booleanValue != c0238g2.f3557s) {
                    c0238g2.f3557s = booleanValue;
                    c0238g2.e(bool);
                }
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    C0238g c0238g3 = (C0238g) obj3;
                    if (c0238g3 != c0238g2 && c0238g3.f3557s) {
                        c0238g3.f3557s = false;
                        c0238g3.e(Boolean.FALSE);
                    }
                }
                c1929o.f14575X = booleanValue;
                c1929o.f14571T = true;
                return;
            case 2:
                r rVar = (r) this.f14526b;
                HashSet hashSet = (HashSet) rVar.f14580S.get(Integer.valueOf(rVar.f14581T));
                ArrayList arrayList3 = rVar.f14578Q;
                int size3 = arrayList3.size();
                int i8 = 0;
                int i9 = 0;
                while (i9 < size3) {
                    Object obj4 = arrayList3.get(i9);
                    i9++;
                    C0238g c0238g4 = (C0238g) obj4;
                    boolean contains = hashSet.contains(Integer.valueOf(i8));
                    if (contains != c0238g4.f3557s) {
                        c0238g4.f3557s = contains;
                        c0238g4.e(Boolean.valueOf(contains));
                    }
                    i8++;
                }
                rVar.f14582U = true;
                return;
            case 3:
                AbstractC1935v abstractC1935v = (AbstractC1935v) this.f14526b;
                C0238g c0238g5 = abstractC1935v.f14589Q;
                boolean z5 = abstractC1935v.f14590R;
                c0238g5.f3557s = z5;
                c0238g5.e(Boolean.valueOf(z5));
                return;
            case 4:
                AbstractC1906D abstractC1906D = (AbstractC1906D) this.f14526b;
                boolean z6 = abstractC1906D.f14396U;
                C0238g c0238g6 = abstractC1906D.f14393R;
                if (z6 != c0238g6.f3557s) {
                    c0238g6.f3557s = z6;
                    c0238g6.e(Boolean.valueOf(z6));
                }
                boolean z7 = abstractC1906D.f14397V;
                C0238g c0238g7 = abstractC1906D.f14394S;
                if (z7 != c0238g7.f3557s) {
                    c0238g7.f3557s = z7;
                    c0238g7.e(Boolean.valueOf(z7));
                    return;
                }
                return;
            case 5:
                C1909G c1909g = (C1909G) this.f14526b;
                ArrayList arrayList4 = c1909g.f14407Q;
                int size4 = arrayList4.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size4) {
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    Object obj6 = ((C0237f) obj5).f1252p;
                    if (obj6 != null && ((Boolean) obj6).booleanValue()) {
                        i10 = (int) (Math.pow(2.0d, i11) + i10);
                    }
                    i11++;
                }
                c1909g.f14413W = i10;
                Boolean bool2 = (Boolean) ((C0237f) c1909g.f14406P.get(i10)).f1252p;
                boolean booleanValue2 = bool2.booleanValue();
                C0238g c0238g8 = c1909g.f14408R;
                if (booleanValue2 != c0238g8.f3557s) {
                    c0238g8.f3557s = booleanValue2;
                    c0238g8.e(bool2);
                }
                c1909g.f14414X = booleanValue2;
                c1909g.f14410T = true;
                return;
            case 6:
                P p3 = (P) this.f14526b;
                ArrayList arrayList5 = p3.f14436Q;
                int size5 = arrayList5.size();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    boolean z8 = true;
                    if (i14 >= size5) {
                        p3.f14438S = true;
                        return;
                    }
                    Object obj7 = arrayList5.get(i14);
                    i14++;
                    C0238g c0238g9 = (C0238g) obj7;
                    int i15 = 0;
                    while (true) {
                        boolean[][] zArr = p3.f14440U;
                        if (i15 < zArr.length) {
                            if (zArr[i15][i13]) {
                                int i16 = 0;
                                boolean z9 = false;
                                while (true) {
                                    boolean[] zArr2 = p3.f14439T[i15];
                                    if (i16 < zArr2.length) {
                                        if (zArr2[i16]) {
                                            boolean z10 = i16 % 2 == 0;
                                            Object obj8 = ((C0237f) p3.f14435P.get(i16 / 2)).f1252p;
                                            boolean z11 = obj8 != null && ((Boolean) obj8).booleanValue();
                                            if (!z10) {
                                                z11 = !z11;
                                            }
                                            if (z11) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                        }
                                        i16++;
                                    }
                                }
                                if (z9) {
                                }
                            }
                            i15++;
                        } else {
                            z8 = false;
                        }
                    }
                    if (z8 != c0238g9.f3557s) {
                        c0238g9.f3557s = z8;
                        c0238g9.e(Boolean.valueOf(z8));
                    }
                    i13++;
                }
                break;
            case 7:
                Y y = (Y) this.f14526b;
                y.N();
                y.f14489S = true;
                return;
            case 8:
                b0 b0Var = (b0) this.f14526b;
                C0238g c0238g10 = b0Var.f14502P;
                boolean z12 = b0Var.f14503Q;
                c0238g10.f3557s = z12;
                c0238g10.e(Boolean.valueOf(z12));
                return;
            default:
                i0 i0Var = (i0) this.f14526b;
                boolean z13 = i0Var.f14547c0;
                C0238g c0238g11 = i0Var.f14598P;
                if (z13 == c0238g11.f3557s) {
                    return;
                }
                i0Var.f14599Q = z13;
                c0238g11.f3557s = z13;
                c0238g11.e(Boolean.valueOf(z13));
                i0Var.f14545a0 = true;
                return;
        }
    }

    @Override // g1.InterfaceC1680a
    public final String getId() {
        switch (this.f14525a) {
            case 0:
                return ((C1921g) this.f14526b).f13120D;
            case 1:
                return ((C1929o) this.f14526b).f13120D;
            case 2:
                return ((r) this.f14526b).f13120D;
            case 3:
                return ((AbstractC1935v) this.f14526b).f13120D;
            case 4:
                return ((AbstractC1906D) this.f14526b).f13120D;
            case 5:
                return ((C1909G) this.f14526b).f13120D;
            case 6:
                return ((P) this.f14526b).f13120D;
            case 7:
                return ((Y) this.f14526b).f13120D;
            case 8:
                return ((b0) this.f14526b).f13120D;
            default:
                return ((i0) this.f14526b).f13120D;
        }
    }
}
