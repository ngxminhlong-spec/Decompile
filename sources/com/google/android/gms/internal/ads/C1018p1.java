package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018p1 implements B, P {

    /* renamed from: a, reason: collision with root package name */
    public final C1134rq f9880a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f9881b;
    public final C1134rq c;
    public final C1134rq d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f9882e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9883f;

    /* renamed from: g, reason: collision with root package name */
    public int f9884g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f9885h;

    /* renamed from: i, reason: collision with root package name */
    public long f9886i;

    /* renamed from: j, reason: collision with root package name */
    public int f9887j;

    /* renamed from: k, reason: collision with root package name */
    public C1134rq f9888k;

    /* renamed from: l, reason: collision with root package name */
    public int f9889l;

    /* renamed from: m, reason: collision with root package name */
    public int f9890m;

    /* renamed from: n, reason: collision with root package name */
    public int f9891n;

    /* renamed from: o, reason: collision with root package name */
    public int f9892o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9893p;

    /* renamed from: q, reason: collision with root package name */
    public D f9894q;

    /* renamed from: r, reason: collision with root package name */
    public C0975o1[] f9895r;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f9896s;

    /* renamed from: t, reason: collision with root package name */
    public int f9897t;

    /* renamed from: u, reason: collision with root package name */
    public long f9898u;

    /* renamed from: v, reason: collision with root package name */
    public int f9899v;

    public C1018p1() {
        new ArrayList();
        this.f9883f = new ArrayList();
        this.d = new C1134rq(16);
        this.f9882e = new ArrayDeque();
        this.f9880a = new C1134rq(Wj.f7530G);
        this.f9881b = new C1134rq(4);
        this.c = new C1134rq();
        this.f9889l = -1;
        this.f9894q = D.d;
        this.f9895r = new C0975o1[0];
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.f9898u;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6 A[EDGE_INSN: B:70:0x00e6->B:71:0x00e6 BREAK  A[LOOP:1: B:29:0x006a->B:59:0x00e1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    @Override // com.google.android.gms.internal.ads.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.O c(long r21) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1018p1.c(long):com.google.android.gms.internal.ads.O");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        return Y9.h(c, false);
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f9894q = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0371, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r37, com.google.android.gms.internal.ads.F r38) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1018p1.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        this.f9882e.clear();
        this.f9887j = 0;
        this.f9889l = -1;
        this.f9890m = 0;
        this.f9891n = 0;
        this.f9892o = 0;
        if (j4 == 0) {
            j();
            return;
        }
        for (C0975o1 c0975o1 : this.f9895r) {
            C1189t1 c1189t1 = c0975o1.f9796b;
            int k3 = AbstractC0751is.k(c1189t1.f10664f, j5, false);
            while (true) {
                if (k3 < 0) {
                    k3 = -1;
                    break;
                } else if ((c1189t1.f10665g[k3] & 1) != 0) {
                    break;
                } else {
                    k3--;
                }
            }
            if (k3 == -1) {
                k3 = c1189t1.a(j5);
            }
            c0975o1.f9797e = k3;
            W w2 = c0975o1.d;
            if (w2 != null) {
                w2.f7315b = false;
                w2.c = 0;
            }
        }
    }

    public final void j() {
        this.f9884g = 0;
        this.f9887j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.g(1885823344, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fd, code lost:
    
        if (r13 != 1936683886) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ff, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1936683886, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (r13 != 1953919848) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1953919848, "TVSHOW", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0217, code lost:
    
        if (r13 != 757935405) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0219, code lost:
    
        r0 = null;
        r11 = null;
        r2 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021d, code lost:
    
        r13 = r7.f10537b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        if (r13 >= r8) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0221, code lost:
    
        r15 = r7.h();
        r12 = r7.h();
        r30 = r10;
        r7.f(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0232, code lost:
    
        if (r12 != 1835360622) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0234, code lost:
    
        r11 = r7.y(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023a, code lost:
    
        r10 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023e, code lost:
    
        r10 = r15 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0245, code lost:
    
        if (r12 != 1851878757) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0247, code lost:
    
        r0 = r7.y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024f, code lost:
    
        if (r12 != 1684108385) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0254, code lost:
    
        if (r12 != 1684108385) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0256, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0258, code lost:
    
        r7.f(r10);
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0252, code lost:
    
        r15 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025d, code lost:
    
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025f, code lost:
    
        if (r11 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0261, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0264, code lost:
    
        if (r2 != (-1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0268, code lost:
    
        r7.e(r2);
        r7.f(16);
        r2 = new com.google.android.gms.internal.ads.G0(r11, r0, r7.y(r30 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0320, code lost:
    
        com.google.android.gms.internal.ads.Wj.f("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.AbstractC0505d1.c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00cf, code lost:
    
        r10 = com.google.android.gms.internal.ads.Y9.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00d3, code lost:
    
        if (r10 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00d7, code lost:
    
        if (r10 > 192) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00d9, code lost:
    
        r10 = com.google.android.gms.internal.ads.Y9.f7788w[r10 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00e4, code lost:
    
        if (r10 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00e6, code lost:
    
        r2 = new com.google.android.gms.internal.ads.J0("TCON", null, com.google.android.gms.internal.ads.AbstractC1137rt.t(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00f2, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00e3, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00e0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0359, code lost:
    
        r7.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x035c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x027e, code lost:
    
        r11 = r13 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0283, code lost:
    
        if (r11 != 6516084) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0285, code lost:
    
        r0 = r7.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0290, code lost:
    
        if (r7.h() != 1684108385) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0292, code lost:
    
        r7.f(8);
        r0 = r7.y(r0 - 16);
        r2 = new com.google.android.gms.internal.ads.C0("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a6, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.AbstractC0505d1.c(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b8, code lost:
    
        if (r11 == 7233901) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02bd, code lost:
    
        if (r11 != 7631467) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c4, code lost:
    
        if (r11 == 6516589) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c9, code lost:
    
        if (r11 != 7828084) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02d0, code lost:
    
        if (r11 != 6578553) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02d2, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02dd, code lost:
    
        if (r11 != 4280916) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02df, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02e9, code lost:
    
        if (r11 != 7630703) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02eb, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02f5, code lost:
    
        if (r11 != 6384738) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f7, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0301, code lost:
    
        if (r11 != 7108978) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0303, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x030d, code lost:
    
        if (r11 != 6776174) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x030f, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0317, code lost:
    
        if (r11 != 6779504) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0319, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0335, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x033c, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(r13, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x035d, code lost:
    
        r31 = r0;
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0365, code lost:
    
        if (r4.isEmpty() == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0369, code lost:
    
        r11 = new com.google.android.gms.internal.ads.C1120rc(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        r7.e(r4);
        r7.f(r13);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        r8 = r7.f10537b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r8 >= r14) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        r8 = r7.h() + r8;
        r13 = r7.h();
        r15 = (r13 >> 24) & 255;
        r31 = r0;
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r15 == 169) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r15 != 253) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (r13 != 1735291493) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        if (r13 != 1684632427) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.j(1684632427, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0345, code lost:
    
        if (r2 == null) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0347, code lost:
    
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x034a, code lost:
    
        r0 = r31;
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
    
        if (r13 != 1953655662) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.j(1953655662, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        if (r13 != 1953329263) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0119, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.g(1953329263, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0127, code lost:
    
        if (r13 != 1668311404) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.g(1668311404, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        if (r13 != 1668249202) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
    
        r0 = r7.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0141, code lost:
    
        if (r7.h() != 1684108385) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0143, code lost:
    
        r10 = r7.h() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r10 != 13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r11 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MetadataUtil", "Unrecognized cover art flags: " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f7, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        r7.f(4);
        r0 = r0 - 16;
        r2 = new byte[r0];
        r7.a(r2, 0, r0);
        r2 = new com.google.android.gms.internal.ads.C1403y0(r11, null, 3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0152, code lost:
    
        if (r10 != 14) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        r11 = "image/png";
        r10 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0185, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MetadataUtil", "Failed to parse cover art attribute");
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0192, code lost:
    
        if (r13 != 1631670868) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0194, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1631670868, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019f, code lost:
    
        if (r13 != 1936682605) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1936682605, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ac, code lost:
    
        if (r13 != 1936679276) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ae, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1936679276, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b9, code lost:
    
        if (r13 != 1936679282) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bb, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1936679282, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
    
        if (r13 != 1936679265) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1936679265, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d3, code lost:
    
        if (r13 != 1936679791) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d5, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.l(1936679791, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e0, code lost:
    
        if (r13 != 1920233063) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e2, code lost:
    
        r2 = com.google.android.gms.internal.ads.Y9.g(1920233063, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        if (r13 != 1885823344) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x071f A[LOOP:13: B:374:0x071c->B:376:0x071f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x05a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r36) {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1018p1.k(long):void");
    }
}
