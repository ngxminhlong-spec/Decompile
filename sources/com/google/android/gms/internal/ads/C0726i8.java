package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726i8 implements InterfaceC0597f8 {

    /* renamed from: r, reason: collision with root package name */
    public static final Map f9026r;

    /* renamed from: o, reason: collision with root package name */
    public final N1.a f9027o;

    /* renamed from: p, reason: collision with root package name */
    public final C0648ga f9028p;

    /* renamed from: q, reason: collision with root package name */
    public final C1384xi f9029q;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, r.i] */
    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        ?? iVar = new r.i(7);
        for (int i4 = 0; i4 < 7; i4++) {
            iVar.put(strArr[i4], numArr[i4]);
        }
        f9026r = Collections.unmodifiableMap(iVar);
    }

    public C0726i8(N1.a aVar, C0648ga c0648ga, C1384xi c1384xi) {
        this.f9027o = aVar;
        this.f9028p = c0648ga;
        this.f9029q = c1384xi;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0421 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:91:0x01bc, B:93:0x01c0, B:94:0x01c5, B:96:0x01ca, B:98:0x01d2, B:99:0x01d7, B:101:0x01d9, B:103:0x01e5, B:104:0x01ea, B:106:0x01ec, B:108:0x01f4, B:109:0x01f9, B:111:0x01fb, B:113:0x0209, B:114:0x021b, B:116:0x0229, B:117:0x023b, B:119:0x0249, B:120:0x025b, B:122:0x0269, B:123:0x027b, B:125:0x0289, B:126:0x0297, B:128:0x02a5, B:129:0x02a7, B:131:0x02ab, B:133:0x02af, B:135:0x02b7, B:138:0x02bf, B:142:0x02f3, B:148:0x02ff, B:151:0x0421, B:152:0x0426, B:154:0x0428, B:156:0x0444, B:158:0x0448, B:160:0x0455, B:161:0x048e, B:166:0x04fc, B:167:0x0557, B:169:0x0570, B:170:0x0589, B:172:0x0591, B:173:0x059c, B:174:0x05c1, B:178:0x05c4, B:180:0x05e4, B:181:0x05f9, B:185:0x050d, B:188:0x051e, B:191:0x052d, B:194:0x053c, B:198:0x054d, B:199:0x0551, B:200:0x048b, B:201:0x05fb, B:202:0x0600, B:204:0x0307, B:206:0x030b, B:210:0x031e, B:213:0x03a7, B:215:0x03aa, B:217:0x03ae, B:220:0x03b5, B:223:0x0336, B:224:0x0341, B:228:0x0350, B:231:0x0363, B:234:0x0373, B:235:0x03a2, B:239:0x0385, B:240:0x0398, B:241:0x03c4, B:244:0x03fc, B:247:0x040c, B:248:0x0402, B:250:0x040a, B:251:0x03f4, B:253:0x03fa, B:254:0x0411, B:255:0x0418, B:256:0x0602, B:257:0x0607, B:259:0x0609, B:260:0x060e), top: B:90:0x01bc, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0428 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:91:0x01bc, B:93:0x01c0, B:94:0x01c5, B:96:0x01ca, B:98:0x01d2, B:99:0x01d7, B:101:0x01d9, B:103:0x01e5, B:104:0x01ea, B:106:0x01ec, B:108:0x01f4, B:109:0x01f9, B:111:0x01fb, B:113:0x0209, B:114:0x021b, B:116:0x0229, B:117:0x023b, B:119:0x0249, B:120:0x025b, B:122:0x0269, B:123:0x027b, B:125:0x0289, B:126:0x0297, B:128:0x02a5, B:129:0x02a7, B:131:0x02ab, B:133:0x02af, B:135:0x02b7, B:138:0x02bf, B:142:0x02f3, B:148:0x02ff, B:151:0x0421, B:152:0x0426, B:154:0x0428, B:156:0x0444, B:158:0x0448, B:160:0x0455, B:161:0x048e, B:166:0x04fc, B:167:0x0557, B:169:0x0570, B:170:0x0589, B:172:0x0591, B:173:0x059c, B:174:0x05c1, B:178:0x05c4, B:180:0x05e4, B:181:0x05f9, B:185:0x050d, B:188:0x051e, B:191:0x052d, B:194:0x053c, B:198:0x054d, B:199:0x0551, B:200:0x048b, B:201:0x05fb, B:202:0x0600, B:204:0x0307, B:206:0x030b, B:210:0x031e, B:213:0x03a7, B:215:0x03aa, B:217:0x03ae, B:220:0x03b5, B:223:0x0336, B:224:0x0341, B:228:0x0350, B:231:0x0363, B:234:0x0373, B:235:0x03a2, B:239:0x0385, B:240:0x0398, B:241:0x03c4, B:244:0x03fc, B:247:0x040c, B:248:0x0402, B:250:0x040a, B:251:0x03f4, B:253:0x03fa, B:254:0x0411, B:255:0x0418, B:256:0x0602, B:257:0x0607, B:259:0x0609, B:260:0x060e), top: B:90:0x01bc, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r18, java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0726i8.h(java.lang.Object, java.util.Map):void");
    }
}
