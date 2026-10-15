package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286vC {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11009a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11010b;
    public final LE[] c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11011e;

    /* renamed from: f, reason: collision with root package name */
    public C1329wC f11012f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11013g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f11014h;

    /* renamed from: i, reason: collision with root package name */
    public final WD[] f11015i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0774jF f11016j;

    /* renamed from: k, reason: collision with root package name */
    public final EC f11017k;

    /* renamed from: l, reason: collision with root package name */
    public C1286vC f11018l;

    /* renamed from: m, reason: collision with root package name */
    public RE f11019m;

    /* renamed from: n, reason: collision with root package name */
    public C0817kF f11020n;

    /* renamed from: o, reason: collision with root package name */
    public long f11021o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.gE] */
    public C1286vC(WD[] wdArr, long j4, AbstractC0774jF abstractC0774jF, C1058pz c1058pz, EC ec, C1329wC c1329wC, C0817kF c0817kF) {
        this.f11015i = wdArr;
        this.f11021o = j4;
        this.f11016j = abstractC0774jF;
        this.f11017k = ec;
        C1202tE c1202tE = c1329wC.f11118a;
        this.f11010b = c1202tE.f10688a;
        this.f11012f = c1329wC;
        this.f11019m = RE.d;
        this.f11020n = c0817kF;
        this.c = new LE[2];
        this.f11014h = new boolean[2];
        long j5 = c1329wC.f11119b;
        long j6 = c1329wC.d;
        ec.getClass();
        int i4 = JC.f5789k;
        Pair pair = (Pair) c1202tE.f10688a;
        Object obj = pair.first;
        C1202tE a4 = c1202tE.a(pair.second);
        DC dc = (DC) ec.d.get(obj);
        dc.getClass();
        ec.f4860g.add(dc);
        CC cc = (CC) ec.f4859f.get(dc);
        if (cc != null) {
            cc.f4409a.g(cc.f4410b);
        }
        dc.c.add(a4);
        C0902mE b4 = dc.f4595a.b(a4, c1058pz, j5);
        ec.c.put(b4, dc);
        ec.j();
        this.f11009a = j6 != -9223372036854775807L ? new C0646gE(b4, j6) : b4;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    public final long a(C0817kF c0817kF, long j4, boolean z4, boolean[] zArr) {
        WD[] wdArr;
        int i4 = 0;
        while (true) {
            boolean z5 = true;
            if (i4 >= c0817kF.f9284o) {
                break;
            }
            if (z4 || !c0817kF.a(this.f11020n, i4)) {
                z5 = false;
            }
            this.f11014h[i4] = z5;
            i4++;
        }
        int i5 = 0;
        while (true) {
            wdArr = this.f11015i;
            if (i5 >= 2) {
                break;
            }
            wdArr[i5].getClass();
            i5++;
        }
        i();
        this.f11020n = c0817kF;
        if (this.f11018l == null) {
            int i6 = 0;
            while (true) {
                C0817kF c0817kF2 = this.f11020n;
                if (i6 >= c0817kF2.f9284o) {
                    break;
                }
                c0817kF2.b(i6);
                InterfaceC0690hF interfaceC0690hF = ((InterfaceC0690hF[]) this.f11020n.f9286q)[i6];
                i6++;
            }
        }
        long n4 = this.f11009a.n((InterfaceC0690hF[]) c0817kF.f9286q, this.f11014h, this.c, zArr, j4);
        for (int i7 = 0; i7 < 2; i7++) {
            wdArr[i7].getClass();
        }
        this.f11011e = false;
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.c[i8] != null) {
                Zf.X(c0817kF.b(i8));
                wdArr[i8].getClass();
                this.f11011e = true;
            } else {
                Zf.X(((InterfaceC0690hF[]) c0817kF.f9286q)[i8] == null);
            }
        }
        return n4;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    public final long b() {
        if (!this.d) {
            return this.f11012f.f11119b;
        }
        long c = this.f11011e ? this.f11009a.c() : Long.MIN_VALUE;
        return c == Long.MIN_VALUE ? this.f11012f.f11120e : c;
    }

    public final long c() {
        return this.f11012f.f11119b + this.f11021o;
    }

    public final C0817kF d() {
        return this.f11020n;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.ot] */
    public final C0817kF e(AbstractC0484ch abstractC0484ch) {
        WD[] wdArr;
        boolean z4;
        int[] iArr;
        RE re = this.f11019m;
        AbstractC0774jF abstractC0774jF = this.f11016j;
        abstractC0774jF.getClass();
        int[] iArr2 = new int[3];
        C0997oh[][] c0997ohArr = new C0997oh[3];
        int[][][] iArr3 = new int[3][];
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = re.f6797a;
            c0997ohArr[i4] = new C0997oh[i5];
            iArr3[i4] = new int[i5];
        }
        int i6 = 2;
        int[] iArr4 = new int[2];
        int i7 = 0;
        while (true) {
            wdArr = this.f11015i;
            if (i7 >= 2) {
                break;
            }
            wdArr[i7].getClass();
            iArr4[i7] = 8;
            i7++;
        }
        int i8 = 0;
        while (i8 < re.f6797a) {
            C0997oh a4 = re.a(i8);
            int i9 = a4.f9847b;
            C0976o2[] c0976o2Arr = a4.c;
            int i10 = i6;
            int i11 = 0;
            int i12 = 0;
            boolean z5 = true;
            while (i12 < i6) {
                WD wd = wdArr[i12];
                int i13 = 0;
                int i14 = 0;
                while (i14 <= 0) {
                    i13 = Math.max(i13, wd.q(c0976o2Arr[i14]) & 7);
                    i14++;
                    re = re;
                }
                RE re2 = re;
                boolean z6 = iArr2[i12] == 0;
                if (i13 > i11) {
                    i11 = i13;
                    z5 = z6;
                    i10 = i12;
                } else if (i13 == i11 && i9 == 5 && !z5 && z6) {
                    i11 = i13;
                    i10 = i12;
                    z5 = true;
                }
                i12++;
                re = re2;
                i6 = 2;
            }
            RE re3 = re;
            if (i10 == i6) {
                iArr = new int[1];
            } else {
                WD wd2 = wdArr[i10];
                int[] iArr5 = new int[1];
                for (int i15 = 0; i15 <= 0; i15++) {
                    iArr5[i15] = wd2.q(c0976o2Arr[i15]);
                }
                iArr = iArr5;
            }
            int i16 = iArr2[i10];
            c0997ohArr[i10][i16] = a4;
            iArr3[i10][i16] = iArr;
            iArr2[i10] = i16 + 1;
            i8++;
            re = re3;
            i6 = 2;
        }
        int i17 = i6;
        RE[] reArr = new RE[i17];
        String[] strArr = new String[i17];
        int[] iArr6 = new int[i17];
        int i18 = 0;
        while (i18 < i17) {
            int i19 = iArr2[i18];
            reArr[i18] = new RE((C0997oh[]) AbstractC0751is.g(i19, c0997ohArr[i18]));
            iArr3[i18] = (int[][]) AbstractC0751is.g(i19, iArr3[i18]);
            strArr[i18] = wdArr[i18].m();
            iArr6[i18] = wdArr[i18].f7410p;
            i18++;
            i17 = 2;
        }
        int i20 = i17;
        C0733iF c0733iF = new C0733iF(iArr6, reArr, iArr4, iArr3, new RE((C0997oh[]) AbstractC0751is.g(iArr2[i20], c0997ohArr[i20])));
        Pair a5 = abstractC0774jF.a(c0733iF, iArr3, iArr4);
        InterfaceC0690hF[] interfaceC0690hFArr = (InterfaceC0690hF[]) a5.second;
        List[] listArr = new List[interfaceC0690hFArr.length];
        for (int i21 = 0; i21 < interfaceC0690hFArr.length; i21++) {
            InterfaceC0690hF interfaceC0690hF = interfaceC0690hFArr[i21];
            listArr[i21] = interfaceC0690hF != null ? AbstractC1137rt.t(interfaceC0690hF) : Gt.f5344s;
        }
        int i22 = 4;
        ?? abstractC0880lt = new AbstractC0880lt(4);
        int i23 = 0;
        while (i23 < 2) {
            RE re4 = reArr[i23];
            List list = listArr[i23];
            int i24 = 0;
            while (i24 < re4.f6797a) {
                C0997oh a6 = re4.a(i24);
                reArr[i23].a(i24);
                int[] iArr7 = new int[1];
                int i25 = 0;
                for (char c = 0; c <= 0; c = 1) {
                    if ((iArr3[i23][i24][0] & 7) == i22) {
                        iArr7[i25] = 0;
                        i25++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i25);
                String str = null;
                int i26 = 16;
                int i27 = 0;
                boolean z7 = false;
                int i28 = 0;
                while (i27 < copyOf.length) {
                    List[] listArr2 = listArr;
                    String str2 = reArr[i23].a(i24).c[copyOf[i27]].f9813k;
                    int i29 = i28 + 1;
                    if (i28 == 0) {
                        str = str2;
                    } else {
                        z7 |= !AbstractC0751is.c(str, str2);
                    }
                    i26 = Math.min(i26, iArr3[i23][i24][i27] & 24);
                    i27++;
                    i28 = i29;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                if (z7) {
                    Math.min(i26, c0733iF.c[i23]);
                }
                int[] iArr8 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i30 = 0; i30 <= 0; i30++) {
                    iArr8[i30] = iArr3[i23][i24][i30] & 7;
                    int i31 = 0;
                    while (true) {
                        if (i31 >= list.size()) {
                            z4 = false;
                            break;
                        }
                        InterfaceC0690hF interfaceC0690hF2 = (InterfaceC0690hF) list.get(i31);
                        if (interfaceC0690hF2.a().equals(a6) && interfaceC0690hF2.u(i30) != -1) {
                            z4 = true;
                            break;
                        }
                        i31++;
                    }
                    zArr[i30] = z4;
                }
                abstractC0880lt.a(new Ri(a6, iArr8, zArr));
                i24++;
                listArr = listArr3;
                i22 = 4;
            }
            i23++;
            i22 = 4;
        }
        int i32 = 0;
        while (true) {
            RE re5 = c0733iF.d;
            if (i32 >= re5.f6797a) {
                break;
            }
            C0997oh a7 = re5.a(i32);
            int[] iArr9 = new int[1];
            Arrays.fill(iArr9, 0);
            abstractC0880lt.a(new Ri(a7, iArr9, new boolean[1]));
            i32++;
        }
        C0817kF c0817kF = new C0817kF((KC[]) a5.first, (InterfaceC0690hF[]) a5.second, new C0486cj(abstractC0880lt.f()), c0733iF);
        for (InterfaceC0690hF interfaceC0690hF3 : (InterfaceC0690hF[]) c0817kF.f9286q) {
        }
        return c0817kF;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    public final void f(AbstractC0484ch abstractC0484ch) {
        this.d = true;
        this.f11019m = this.f11009a.g();
        C0817kF e4 = e(abstractC0484ch);
        C1329wC c1329wC = this.f11012f;
        long j4 = c1329wC.f11119b;
        long j5 = c1329wC.f11120e;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        long a4 = a(e4, j4, false, new boolean[2]);
        long j6 = this.f11021o;
        C1329wC c1329wC2 = this.f11012f;
        long j7 = c1329wC2.f11119b;
        this.f11021o = (j7 - a4) + j6;
        if (a4 != j7) {
            c1329wC2 = new C1329wC(c1329wC2.f11118a, a4, c1329wC2.c, c1329wC2.d, c1329wC2.f11120e, c1329wC2.f11121f, c1329wC2.f11122g, c1329wC2.f11123h);
        }
        this.f11012f = c1329wC2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    public final void g() {
        i();
        ?? r02 = this.f11009a;
        try {
            boolean z4 = r02 instanceof C0646gE;
            EC ec = this.f11017k;
            if (z4) {
                ec.d(((C0646gE) r02).f8796o);
            } else {
                ec.d(r02);
            }
        } catch (RuntimeException e4) {
            Wj.i("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    public final boolean h() {
        if (this.d) {
            return !this.f11011e || this.f11009a.c() == Long.MIN_VALUE;
        }
        return false;
    }

    public final void i() {
        if (this.f11018l != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            C0817kF c0817kF = this.f11020n;
            if (i4 >= c0817kF.f9284o) {
                return;
            }
            c0817kF.b(i4);
            InterfaceC0690hF interfaceC0690hF = ((InterfaceC0690hF[]) this.f11020n.f9286q)[i4];
            i4++;
        }
    }
}
