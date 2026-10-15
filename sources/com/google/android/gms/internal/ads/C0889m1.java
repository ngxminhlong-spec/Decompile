package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889m1 implements B {

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f9528E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: F, reason: collision with root package name */
    public static final C0976o2 f9529F;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9533D;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f9537f;

    /* renamed from: g, reason: collision with root package name */
    public final C1134rq f9538g;

    /* renamed from: l, reason: collision with root package name */
    public int f9543l;

    /* renamed from: m, reason: collision with root package name */
    public int f9544m;

    /* renamed from: n, reason: collision with root package name */
    public long f9545n;

    /* renamed from: o, reason: collision with root package name */
    public int f9546o;

    /* renamed from: p, reason: collision with root package name */
    public C1134rq f9547p;

    /* renamed from: q, reason: collision with root package name */
    public long f9548q;

    /* renamed from: r, reason: collision with root package name */
    public int f9549r;

    /* renamed from: v, reason: collision with root package name */
    public C0846l1 f9553v;

    /* renamed from: w, reason: collision with root package name */
    public int f9554w;

    /* renamed from: x, reason: collision with root package name */
    public int f9555x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9556z;

    /* renamed from: a, reason: collision with root package name */
    public final List f9534a = Collections.unmodifiableList(Collections.EMPTY_LIST);

    /* renamed from: h, reason: collision with root package name */
    public final C0258Da f9539h = new C0258Da(12);

    /* renamed from: i, reason: collision with root package name */
    public final C1134rq f9540i = new C1134rq(16);
    public final C1134rq c = new C1134rq(Wj.f7530G);
    public final C1134rq d = new C1134rq(5);

    /* renamed from: e, reason: collision with root package name */
    public final C1134rq f9536e = new C1134rq();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f9541j = new ArrayDeque();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f9542k = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f9535b = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public long f9551t = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f9550s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f9552u = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    public D f9530A = D.d;

    /* renamed from: B, reason: collision with root package name */
    public V[] f9531B = new V[0];

    /* renamed from: C, reason: collision with root package name */
    public V[] f9532C = new V[0];

    static {
        L1 l12 = new L1();
        l12.f6101j = "application/x-emsg";
        f9529F = new C0976o2(l12);
    }

    public C0889m1() {
        byte[] bArr = new byte[16];
        this.f9537f = bArr;
        this.f9538g = new C1134rq(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.N a(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto La7
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.c1 r5 = (com.google.android.gms.internal.ads.C0462c1) r5
            int r6 = r5.f8436b
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto La3
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.rq r5 = r5.c
            byte[] r5 = r5.f10536a
            com.google.android.gms.internal.ads.rq r6 = new com.google.android.gms.internal.ads.rq
            r6.<init>(r5)
            int r8 = r6.c
            r9 = 32
            if (r8 >= r9) goto L2f
        L2d:
            r6 = r2
            goto L87
        L2f:
            r6.e(r1)
            int r8 = r6.h()
            int r9 = r6.g()
            int r9 = r9 + 4
            if (r8 == r9) goto L3f
            goto L2d
        L3f:
            int r8 = r6.h()
            if (r8 == r7) goto L46
            goto L2d
        L46:
            int r7 = r6.h()
            int r7 = com.google.android.gms.internal.ads.AbstractC0505d1.b(r7)
            r8 = 1
            if (r7 <= r8) goto L59
            java.lang.String r6 = "Unsupported pssh version: "
            java.lang.String r8 = "PsshAtomUtil"
            U.a.p(r7, r6, r8)
            goto L2d
        L59:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.t()
            long r12 = r6.t()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L71
            int r7 = r6.p()
            int r7 = r7 * 16
            r6.f(r7)
        L71:
            int r7 = r6.p()
            int r8 = r6.g()
            if (r7 == r8) goto L7c
            goto L2d
        L7c:
            byte[] r8 = new byte[r7]
            r6.a(r8, r1, r7)
            com.google.android.gms.internal.ads.ln r6 = new com.google.android.gms.internal.ads.ln
            r7 = 5
            r6.<init>(r7, r9)
        L87:
            if (r6 != 0) goto L8b
            r6 = r2
            goto L8f
        L8b:
            java.lang.Object r6 = r6.f9467p
            java.util.UUID r6 = (java.util.UUID) r6
        L8f:
            if (r6 != 0) goto L99
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.Wj.l(r5, r6)
            goto La3
        L99:
            com.google.android.gms.internal.ads.z r7 = new com.google.android.gms.internal.ads.z
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        La3:
            int r3 = r3 + 1
            goto L8
        La7:
            if (r4 != 0) goto Laa
            return r2
        Laa:
            com.google.android.gms.internal.ads.N r14 = new com.google.android.gms.internal.ads.N
            com.google.android.gms.internal.ads.z[] r0 = new com.google.android.gms.internal.ads.C1445z[r1]
            java.lang.Object[] r0 = r4.toArray(r0)
            com.google.android.gms.internal.ads.z[] r0 = (com.google.android.gms.internal.ads.C1445z[]) r0
            r14.<init>(r2, r1, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0889m1.a(java.util.List):com.google.android.gms.internal.ads.N");
    }

    public static void c(C1134rq c1134rq, int i4, C1146s1 c1146s1) {
        c1134rq.e(i4 + 8);
        int h4 = c1134rq.h();
        if ((h4 & 1) != 0) {
            throw C0907md.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (h4 & 2) != 0;
        int p3 = c1134rq.p();
        if (p3 == 0) {
            Arrays.fill(c1146s1.f10571l, 0, c1146s1.f10564e, false);
            return;
        }
        int i5 = c1146s1.f10564e;
        C1134rq c1134rq2 = c1146s1.f10573n;
        if (p3 != i5) {
            throw C0907md.a("Senc sample count " + p3 + " is different from fragment sample count" + i5, null);
        }
        Arrays.fill(c1146s1.f10571l, 0, p3, z4);
        c1134rq2.b(c1134rq.g());
        c1146s1.f10570k = true;
        c1146s1.f10574o = true;
        c1134rq.a(c1134rq2.f10536a, 0, c1134rq2.c);
        c1134rq2.e(0);
        c1146s1.f10574o = false;
    }

    public final void b() {
        this.f9543l = 0;
        this.f9546o = 0;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        return Y9.h(c, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:357:0x06e2, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x06e5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r48) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0889m1.e(long):void");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f9530A = d;
        b();
        V[] vArr = new V[2];
        this.f9531B = vArr;
        int i4 = 0;
        V[] vArr2 = (V[]) AbstractC0751is.g(0, vArr);
        this.f9531B = vArr2;
        for (V v4 : vArr2) {
            v4.a(f9529F);
        }
        List list = this.f9534a;
        this.f9532C = new V[list.size()];
        int i5 = 100;
        while (i4 < this.f9532C.length) {
            int i6 = i5 + 1;
            V z4 = this.f9530A.z(i5, 3);
            z4.a((C0976o2) list.get(i4));
            this.f9532C[i4] = z4;
            i4++;
            i5 = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x011c, code lost:
    
        if (r2.d.f10661a.f10074g != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x011e, code lost:
    
        r28.f9554w = r4 - 8;
        ((com.google.android.gms.internal.ads.C1316w) r29).f(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0138, code lost:
    
        if ("audio/ac4".equals(r2.d.f10661a.f10073f.f9813k) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x013a, code lost:
    
        r28.f9555x = r2.a(r28.f9554w, 7);
        r4 = r28.f9554w;
        r8 = r28.f9538g;
        com.google.android.gms.internal.ads.Y9.f(r4, r8);
        r2.f9348a.f(7, r8);
        r4 = r28.f9555x + 7;
        r28.f9555x = r4;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x015f, code lost:
    
        r28.f9554w += r4;
        r28.f9543l = 4;
        r28.y = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0156, code lost:
    
        r7 = 0;
        r4 = r2.a(r28.f9554w, 0);
        r28.f9555x = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d3, code lost:
    
        r4 = r3.f10567h[r2.f9351f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0169, code lost:
    
        r4 = r2.d;
        r7 = r4.f10661a;
        r8 = r2.f9348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0171, code lost:
    
        if (r2.f9357l != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0173, code lost:
    
        r10 = r4.f10664f[r2.f9351f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0181, code lost:
    
        r4 = r7.f10077j;
        r7 = r7.f10073f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0185, code lost:
    
        if (r4 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0187, code lost:
    
        r4 = r28.f9555x;
        r5 = r28.f9554w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018b, code lost:
    
        if (r4 >= r5) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018d, code lost:
    
        r28.f9555x += r8.b(r29, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0284, code lost:
    
        if (r2.f9357l != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0286, code lost:
    
        r0 = r2.d.f10665g[r2.f9351f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029e, code lost:
    
        if (r2.b() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a0, code lost:
    
        r0 = r0 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a3, code lost:
    
        r24 = r0;
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a9, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ab, code lost:
    
        r27 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b2, code lost:
    
        r22 = r10;
        r8.d(r22, r24, r28.f9554w, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c3, code lost:
    
        if (r13.isEmpty() != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c5, code lost:
    
        r0 = (com.google.android.gms.internal.ads.C0803k1) r13.removeFirst();
        r28.f9549r -= r0.c;
        r3 = r0.f9252a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d6, code lost:
    
        if (r0.f9253b == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02d8, code lost:
    
        r3 = r3 + r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02da, code lost:
    
        r6 = r3;
        r3 = r28.f9531B;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02df, code lost:
    
        if (r12 >= r4) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e1, code lost:
    
        r3[r12].d(r6, 1, r0.c, r28.f9549r, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f3, code lost:
    
        if (r2.d() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f5, code lost:
    
        r28.f9553v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f8, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b0, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0295, code lost:
    
        if (r3.f10569j[r2.f9351f] == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0297, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0299, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0199, code lost:
    
        r14 = r28.d;
        r15 = r14.f10536a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r30] = 0;
        r12 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01b0, code lost:
    
        if (r28.f9555x >= r28.f9554w) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01b2, code lost:
    
        r6 = r28.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01b6, code lost:
    
        if (r6 != 0) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0229, code lost:
    
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x022e, code lost:
    
        if (r28.f9556z == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0230, code lost:
    
        r5 = r28.f9536e;
        r5.b(r6);
        r21 = r12;
        r22 = r14;
        ((com.google.android.gms.internal.ads.C1316w) r29).C(r5.f10536a, 0, r28.y, false);
        r8.f(r28.y, r5);
        r4 = r28.y;
        r6 = com.google.android.gms.internal.ads.Wj.c(r5.c, r5.f10536a);
        r5.e("video/hevc".equals(r7.f9813k) ? 1 : 0);
        r5.d(r6);
        com.google.android.gms.internal.ads.AbstractC1230u.j(r10, r5, r28.f9532C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x026e, code lost:
    
        r28.f9555x += r4;
        r28.y -= r4;
        r4 = r30;
        r12 = r21;
        r14 = r22;
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0265, code lost:
    
        r21 = r12;
        r22 = r14;
        r4 = r8.b(r29, r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01b8, code lost:
    
        ((com.google.android.gms.internal.ads.C1316w) r29).C(r15, r4, r12, false);
        r14.e(0);
        r6 = r14.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01c6, code lost:
    
        if (r6 <= 0) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01c8, code lost:
    
        r28.y = r6 - 1;
        r6 = r28.c;
        r6.e(0);
        r8.f(4, r6);
        r8.f(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01dc, code lost:
    
        if (r28.f9532C.length <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01de, code lost:
    
        r6 = r7.f9813k;
        r21 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01e8, code lost:
    
        if ("video/avc".equals(r6) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01ea, code lost:
    
        r30 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01ef, code lost:
    
        if ((r21 & 31) == 6) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01f2, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x020e, code lost:
    
        r28.f9556z = r5;
        r28.f9555x += 5;
        r28.f9554w += r30;
        r5 = r4;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01fb, code lost:
    
        if ("video/hevc".equals(r6) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0205, code lost:
    
        if (((r21 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0208, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01f4, code lost:
    
        r30 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x020a, code lost:
    
        r30 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0228, code lost:
    
        throw com.google.android.gms.internal.ads.C0907md.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x017a, code lost:
    
        r10 = r3.f10568i[r2.f9351f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bf, code lost:
    
        r3 = r2.f9349b;
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c4, code lost:
    
        if (r28.f9543l != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c8, code lost:
    
        if (r2.f9357l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ca, code lost:
    
        r4 = r2.d.d[r2.f9351f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d9, code lost:
    
        r28.f9554w = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00df, code lost:
    
        if (r2.f9351f >= r2.f9354i) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e1, code lost:
    
        ((com.google.android.gms.internal.ads.C1316w) r29).f(r4);
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ea, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        r4 = r3.f10573n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f1, code lost:
    
        if (r0 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f3, code lost:
    
        r4.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f6, code lost:
    
        r0 = r2.f9351f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fa, code lost:
    
        if (r3.f10570k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0100, code lost:
    
        if (r3.f10571l[r0] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        r4.f(r4.q() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010e, code lost:
    
        if (r2.d() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0110, code lost:
    
        r28.f9553v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0112, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f9, code lost:
    
        r28.f9543l = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02fd, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r29, com.google.android.gms.internal.ads.F r30) {
        /*
            Method dump skipped, instructions count: 1941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0889m1.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        SparseArray sparseArray = this.f9535b;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0846l1) sparseArray.valueAt(i4)).c();
        }
        this.f9542k.clear();
        this.f9549r = 0;
        this.f9550s = j5;
        this.f9541j.clear();
        b();
    }
}
