package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460zE implements InterfaceC1159sE, InterfaceC1116rE {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1159sE[] f11585o;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1116rE f11589s;

    /* renamed from: t, reason: collision with root package name */
    public RE f11590t;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f11587q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f11588r = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public C0388aC f11592v = new C0388aC(7, new ME[0]);

    /* renamed from: p, reason: collision with root package name */
    public final IdentityHashMap f11586p = new IdentityHashMap();

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1159sE[] f11591u = new InterfaceC1159sE[0];

    public C1460zE(long[] jArr, InterfaceC1159sE... interfaceC1159sEArr) {
        this.f11585o = interfaceC1159sEArr;
        for (int i4 = 0; i4 < interfaceC1159sEArr.length; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                this.f11585o[i4] = new QE(interfaceC1159sEArr[i4], j4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final /* bridge */ /* synthetic */ void a(ME me) {
        InterfaceC1116rE interfaceC1116rE = this.f11589s;
        interfaceC1116rE.getClass();
        interfaceC1116rE.a(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final void b(InterfaceC1159sE interfaceC1159sE) {
        InterfaceC1159sE[] interfaceC1159sEArr;
        ArrayList arrayList = this.f11587q;
        arrayList.remove(interfaceC1159sE);
        if (arrayList.isEmpty()) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                interfaceC1159sEArr = this.f11585o;
                if (i4 >= interfaceC1159sEArr.length) {
                    break;
                }
                i5 += interfaceC1159sEArr[i4].g().f6797a;
                i4++;
            }
            C0997oh[] c0997ohArr = new C0997oh[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < interfaceC1159sEArr.length; i7++) {
                RE g4 = interfaceC1159sEArr[i7].g();
                int i8 = g4.f6797a;
                int i9 = 0;
                while (i9 < i8) {
                    C0997oh a4 = g4.a(i9);
                    C0997oh c0997oh = new C0997oh(i7 + ":" + a4.f9846a, a4.c);
                    this.f11588r.put(c0997oh, a4);
                    c0997ohArr[i6] = c0997oh;
                    i9++;
                    i6++;
                }
            }
            this.f11590t = new RE(c0997ohArr);
            InterfaceC1116rE interfaceC1116rE = this.f11589s;
            interfaceC1116rE.getClass();
            interfaceC1116rE.b(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long c() {
        return this.f11592v.c();
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final void d(long j4) {
        this.f11592v.d(j4);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long e() {
        return this.f11592v.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void f() {
        int i4 = 0;
        while (true) {
            InterfaceC1159sE[] interfaceC1159sEArr = this.f11585o;
            if (i4 >= interfaceC1159sEArr.length) {
                return;
            }
            interfaceC1159sEArr[i4].f();
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final RE g() {
        RE re = this.f11590t;
        re.getClass();
        return re;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long h(long j4) {
        long h4 = this.f11591u[0].h(j4);
        int i4 = 1;
        while (true) {
            InterfaceC1159sE[] interfaceC1159sEArr = this.f11591u;
            if (i4 >= interfaceC1159sEArr.length) {
                return h4;
            }
            if (interfaceC1159sEArr[i4].h(h4) != h4) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long i() {
        long j4 = -9223372036854775807L;
        for (InterfaceC1159sE interfaceC1159sE : this.f11591u) {
            long i4 = interfaceC1159sE.i();
            if (i4 != -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    for (InterfaceC1159sE interfaceC1159sE2 : this.f11591u) {
                        if (interfaceC1159sE2 == interfaceC1159sE) {
                            break;
                        }
                        if (interfaceC1159sE2.h(i4) != i4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j4 = i4;
                } else if (i4 != j4) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j4 != -9223372036854775807L && interfaceC1159sE.h(j4) != j4) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void j(InterfaceC1116rE interfaceC1116rE, long j4) {
        this.f11589s = interfaceC1116rE;
        ArrayList arrayList = this.f11587q;
        InterfaceC1159sE[] interfaceC1159sEArr = this.f11585o;
        Collections.addAll(arrayList, interfaceC1159sEArr);
        for (InterfaceC1159sE interfaceC1159sE : interfaceC1159sEArr) {
            interfaceC1159sE.j(this, j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean k(C1200tC c1200tC) {
        ArrayList arrayList = this.f11587q;
        if (arrayList.isEmpty()) {
            return this.f11592v.k(c1200tC);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((InterfaceC1159sE) arrayList.get(i4)).k(c1200tC);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void m(long j4) {
        for (InterfaceC1159sE interfaceC1159sE : this.f11591u) {
            interfaceC1159sE.m(j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long n(InterfaceC0690hF[] interfaceC0690hFArr, boolean[] zArr, LE[] leArr, boolean[] zArr2, long j4) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = interfaceC0690hFArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = interfaceC0690hFArr.length;
            identityHashMap = this.f11586p;
            if (i5 >= length) {
                break;
            }
            LE le = leArr[i5];
            Integer num = le == null ? null : (Integer) identityHashMap.get(le);
            iArr3[i5] = num == null ? -1 : num.intValue();
            InterfaceC0690hF interfaceC0690hF = interfaceC0690hFArr[i5];
            if (interfaceC0690hF != null) {
                String str = interfaceC0690hF.a().f9846a;
                iArr4[i5] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i5] = -1;
            }
            i5++;
        }
        identityHashMap.clear();
        LE[] leArr2 = new LE[length];
        LE[] leArr3 = new LE[length];
        InterfaceC0690hF[] interfaceC0690hFArr2 = new InterfaceC0690hF[length];
        InterfaceC1159sE[] interfaceC1159sEArr = this.f11585o;
        ArrayList arrayList = new ArrayList(interfaceC1159sEArr.length);
        long j5 = j4;
        int i6 = 0;
        while (i6 < interfaceC1159sEArr.length) {
            int i7 = i4;
            while (i7 < interfaceC0690hFArr.length) {
                leArr3[i7] = iArr3[i7] == i6 ? leArr[i7] : null;
                if (iArr4[i7] == i6) {
                    InterfaceC0690hF interfaceC0690hF2 = interfaceC0690hFArr[i7];
                    interfaceC0690hF2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    C0997oh c0997oh = (C0997oh) this.f11588r.get(interfaceC0690hF2.a());
                    c0997oh.getClass();
                    interfaceC0690hFArr2[i7] = new C1417yE(interfaceC0690hF2, c0997oh);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    interfaceC0690hFArr2[i7] = null;
                }
                i7++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            InterfaceC1159sE[] interfaceC1159sEArr2 = interfaceC1159sEArr;
            int i8 = i6;
            long n4 = interfaceC1159sEArr[i6].n(interfaceC0690hFArr2, zArr, leArr3, zArr2, j5);
            if (i8 == 0) {
                j5 = n4;
            } else if (n4 != j5) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i9 = 0; i9 < interfaceC0690hFArr.length; i9++) {
                if (iArr5[i9] == i8) {
                    LE le2 = leArr3[i9];
                    le2.getClass();
                    leArr2[i9] = le2;
                    identityHashMap.put(le2, Integer.valueOf(i8));
                    z4 = true;
                } else if (iArr6[i9] == i8) {
                    Zf.X(leArr3[i9] == null);
                }
            }
            if (z4) {
                arrayList2.add(interfaceC1159sEArr2[i8]);
            }
            i6 = i8 + 1;
            arrayList = arrayList2;
            interfaceC1159sEArr = interfaceC1159sEArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i4 = 0;
        }
        int i10 = i4;
        System.arraycopy(leArr2, i10, leArr, i10, length);
        InterfaceC1159sE[] interfaceC1159sEArr3 = (InterfaceC1159sE[]) arrayList.toArray(new InterfaceC1159sE[i10]);
        this.f11591u = interfaceC1159sEArr3;
        this.f11592v = new C0388aC(7, interfaceC1159sEArr3);
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean o() {
        return this.f11592v.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long p(long j4, LC lc) {
        InterfaceC1159sE[] interfaceC1159sEArr = this.f11591u;
        return (interfaceC1159sEArr.length > 0 ? interfaceC1159sEArr[0] : this.f11585o[0]).p(j4, lc);
    }
}
