package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1402y implements E {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f11317p = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};

    /* renamed from: q, reason: collision with root package name */
    public static final C0783ji f11318q = new C0783ji(BF.f4071p);

    /* renamed from: r, reason: collision with root package name */
    public static final C0783ji f11319r = new C0783ji(BF.f4072q);

    /* renamed from: o, reason: collision with root package name */
    public Gt f11320o;

    /* JADX WARN: Type inference failed for: r5v20, types: [com.google.android.gms.internal.ads.k2, java.lang.Object] */
    public final void a(int i4, ArrayList arrayList) {
        switch (i4) {
            case 0:
                arrayList.add(new C1361x1(1));
                return;
            case 1:
                arrayList.add(new C1361x1(2));
                return;
            case 2:
                arrayList.add(new F1());
                return;
            case 3:
                arrayList.add(new Z());
                return;
            case 4:
                B t4 = f11318q.t(0);
                if (t4 != null) {
                    arrayList.add(t4);
                    return;
                } else {
                    arrayList.add(new C0802k0());
                    return;
                }
            case 5:
                arrayList.add(new C0888m0());
                return;
            case 6:
                arrayList.add(new S0());
                return;
            case 7:
                arrayList.add(new W0());
                return;
            case 8:
                arrayList.add(new C0889m1());
                arrayList.add(new C1018p1());
                return;
            case 9:
                arrayList.add(new C1361x1(0));
                return;
            case 10:
                arrayList.add(new Z1());
                return;
            case 11:
                if (this.f11320o == null) {
                    C1052pt c1052pt = AbstractC1137rt.f10543p;
                    this.f11320o = Gt.f5344s;
                }
                arrayList.add(new C0506d2(new Sr(), new M3(4, this.f11320o)));
                return;
            case 12:
                ?? obj = new Object();
                obj.c = 0;
                obj.d = -1L;
                obj.f9257f = -1;
                obj.f9258g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new C0718i0(2));
                return;
            case 15:
                B t5 = f11319r.t(new Object[0]);
                if (t5 != null) {
                    arrayList.add(t5);
                    return;
                }
                return;
            case 16:
                arrayList.add(new C0419b0());
                return;
            case 17:
                arrayList.add(new C0718i0(1));
                return;
            case 18:
                arrayList.add(new C1060q0(1));
                return;
            case 19:
                arrayList.add(new C0718i0(0));
                return;
            case 20:
                arrayList.add(new C1060q0(0));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x036a, code lost:
    
        if (r12 == r4) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x036c, code lost:
    
        a(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0172, code lost:
    
        if (r4.equals("application/mp4") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x019c, code lost:
    
        if (r4.equals("audio/amr-wb") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01a6, code lost:
    
        if (r4.equals("video/webm") != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01c5, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ca A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ca, B:15:0x01cd, B:20:0x036c, B:21:0x036f, B:23:0x0374, B:26:0x037a, B:28:0x037d, B:32:0x0380, B:33:0x0387, B:35:0x038d, B:42:0x01d6, B:44:0x01de, B:46:0x01e9, B:49:0x01f5, B:51:0x01ff, B:54:0x0208, B:57:0x0213, B:60:0x021e, B:63:0x0229, B:65:0x0231, B:67:0x0239, B:69:0x0245, B:71:0x0253, B:74:0x025d, B:77:0x0268, B:79:0x0270, B:81:0x027e, B:83:0x028c, B:85:0x029e, B:87:0x02ac, B:89:0x02b8, B:91:0x02c0, B:93:0x02c8, B:95:0x02d0, B:97:0x02dc, B:99:0x02e4, B:101:0x02f5, B:103:0x02fd, B:105:0x0309, B:107:0x0311, B:109:0x031b, B:111:0x0323, B:113:0x032d, B:116:0x0337, B:119:0x0341, B:122:0x034c, B:124:0x0354, B:126:0x035f, B:139:0x004c, B:146:0x0082, B:147:0x0086, B:149:0x008a, B:153:0x0094, B:156:0x009e, B:159:0x00a9, B:162:0x00b5, B:165:0x00c0, B:169:0x00ca, B:173:0x00d4, B:177:0x00de, B:180:0x00ea, B:183:0x00f6, B:186:0x0100, B:189:0x010a, B:192:0x0116, B:195:0x0120, B:198:0x012b, B:201:0x0135, B:204:0x013f, B:207:0x014a, B:210:0x0156, B:213:0x0161, B:216:0x016c, B:218:0x0177, B:221:0x0182, B:224:0x018c, B:227:0x0196, B:229:0x01a0, B:231:0x01aa, B:234:0x01b4, B:237:0x01bf, B:239:0x0062, B:242:0x006d, B:245:0x0078), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0374 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ca, B:15:0x01cd, B:20:0x036c, B:21:0x036f, B:23:0x0374, B:26:0x037a, B:28:0x037d, B:32:0x0380, B:33:0x0387, B:35:0x038d, B:42:0x01d6, B:44:0x01de, B:46:0x01e9, B:49:0x01f5, B:51:0x01ff, B:54:0x0208, B:57:0x0213, B:60:0x021e, B:63:0x0229, B:65:0x0231, B:67:0x0239, B:69:0x0245, B:71:0x0253, B:74:0x025d, B:77:0x0268, B:79:0x0270, B:81:0x027e, B:83:0x028c, B:85:0x029e, B:87:0x02ac, B:89:0x02b8, B:91:0x02c0, B:93:0x02c8, B:95:0x02d0, B:97:0x02dc, B:99:0x02e4, B:101:0x02f5, B:103:0x02fd, B:105:0x0309, B:107:0x0311, B:109:0x031b, B:111:0x0323, B:113:0x032d, B:116:0x0337, B:119:0x0341, B:122:0x034c, B:124:0x0354, B:126:0x035f, B:139:0x004c, B:146:0x0082, B:147:0x0086, B:149:0x008a, B:153:0x0094, B:156:0x009e, B:159:0x00a9, B:162:0x00b5, B:165:0x00c0, B:169:0x00ca, B:173:0x00d4, B:177:0x00de, B:180:0x00ea, B:183:0x00f6, B:186:0x0100, B:189:0x010a, B:192:0x0116, B:195:0x0120, B:198:0x012b, B:201:0x0135, B:204:0x013f, B:207:0x014a, B:210:0x0156, B:213:0x0161, B:216:0x016c, B:218:0x0177, B:221:0x0182, B:224:0x018c, B:227:0x0196, B:229:0x01a0, B:231:0x01aa, B:234:0x01b4, B:237:0x01bf, B:239:0x0062, B:242:0x006d, B:245:0x0078), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x038d A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ca, B:15:0x01cd, B:20:0x036c, B:21:0x036f, B:23:0x0374, B:26:0x037a, B:28:0x037d, B:32:0x0380, B:33:0x0387, B:35:0x038d, B:42:0x01d6, B:44:0x01de, B:46:0x01e9, B:49:0x01f5, B:51:0x01ff, B:54:0x0208, B:57:0x0213, B:60:0x021e, B:63:0x0229, B:65:0x0231, B:67:0x0239, B:69:0x0245, B:71:0x0253, B:74:0x025d, B:77:0x0268, B:79:0x0270, B:81:0x027e, B:83:0x028c, B:85:0x029e, B:87:0x02ac, B:89:0x02b8, B:91:0x02c0, B:93:0x02c8, B:95:0x02d0, B:97:0x02dc, B:99:0x02e4, B:101:0x02f5, B:103:0x02fd, B:105:0x0309, B:107:0x0311, B:109:0x031b, B:111:0x0323, B:113:0x032d, B:116:0x0337, B:119:0x0341, B:122:0x034c, B:124:0x0354, B:126:0x035f, B:139:0x004c, B:146:0x0082, B:147:0x0086, B:149:0x008a, B:153:0x0094, B:156:0x009e, B:159:0x00a9, B:162:0x00b5, B:165:0x00c0, B:169:0x00ca, B:173:0x00d4, B:177:0x00de, B:180:0x00ea, B:183:0x00f6, B:186:0x0100, B:189:0x010a, B:192:0x0116, B:195:0x0120, B:198:0x012b, B:201:0x0135, B:204:0x013f, B:207:0x014a, B:210:0x0156, B:213:0x0161, B:216:0x016c, B:218:0x0177, B:221:0x0182, B:224:0x018c, B:227:0x0196, B:229:0x01a0, B:231:0x01aa, B:234:0x01b4, B:237:0x01bf, B:239:0x0062, B:242:0x006d, B:245:0x0078), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d6 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ca, B:15:0x01cd, B:20:0x036c, B:21:0x036f, B:23:0x0374, B:26:0x037a, B:28:0x037d, B:32:0x0380, B:33:0x0387, B:35:0x038d, B:42:0x01d6, B:44:0x01de, B:46:0x01e9, B:49:0x01f5, B:51:0x01ff, B:54:0x0208, B:57:0x0213, B:60:0x021e, B:63:0x0229, B:65:0x0231, B:67:0x0239, B:69:0x0245, B:71:0x0253, B:74:0x025d, B:77:0x0268, B:79:0x0270, B:81:0x027e, B:83:0x028c, B:85:0x029e, B:87:0x02ac, B:89:0x02b8, B:91:0x02c0, B:93:0x02c8, B:95:0x02d0, B:97:0x02dc, B:99:0x02e4, B:101:0x02f5, B:103:0x02fd, B:105:0x0309, B:107:0x0311, B:109:0x031b, B:111:0x0323, B:113:0x032d, B:116:0x0337, B:119:0x0341, B:122:0x034c, B:124:0x0354, B:126:0x035f, B:139:0x004c, B:146:0x0082, B:147:0x0086, B:149:0x008a, B:153:0x0094, B:156:0x009e, B:159:0x00a9, B:162:0x00b5, B:165:0x00c0, B:169:0x00ca, B:173:0x00d4, B:177:0x00de, B:180:0x00ea, B:183:0x00f6, B:186:0x0100, B:189:0x010a, B:192:0x0116, B:195:0x0120, B:198:0x012b, B:201:0x0135, B:204:0x013f, B:207:0x014a, B:210:0x0156, B:213:0x0161, B:216:0x016c, B:218:0x0177, B:221:0x0182, B:224:0x018c, B:227:0x0196, B:229:0x01a0, B:231:0x01aa, B:234:0x01b4, B:237:0x01bf, B:239:0x0062, B:242:0x006d, B:245:0x0078), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.B[] c(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1402y.c(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.B[]");
    }
}
