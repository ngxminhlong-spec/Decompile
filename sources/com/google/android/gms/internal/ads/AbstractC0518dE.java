package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0518dE {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8479a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f8480b = new HashMap();
    public static int c = -1;

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i4;
        int i5 = c;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        List d = d("video/avc", false, false);
        SD sd = d.isEmpty() ? null : (SD) d.get(0);
        if (sd != null) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = sd.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (i6 < length) {
                int i8 = codecProfileLevelArr[i6].level;
                if (i8 != 1 && i8 != 2) {
                    switch (i8) {
                        case 8:
                        case 16:
                        case 32:
                            i4 = 101376;
                            break;
                        case 64:
                            i4 = 202752;
                            break;
                        case 128:
                        case 256:
                            i4 = 414720;
                            break;
                        case 512:
                            i4 = 921600;
                            break;
                        case 1024:
                            i4 = 1310720;
                            break;
                        case 2048:
                        case 4096:
                            i4 = 2097152;
                            break;
                        case 8192:
                            i4 = 2228224;
                            break;
                        case 16384:
                            i4 = 5652480;
                            break;
                        case 32768:
                        case 65536:
                            i4 = 9437184;
                            break;
                        case 131072:
                        case 262144:
                        case 524288:
                            i4 = 35651584;
                            break;
                        default:
                            i4 = -1;
                            break;
                    }
                } else {
                    i4 = 25344;
                }
                i7 = Math.max(i4, i7);
                i6++;
            }
            i6 = Math.max(i7, AbstractC0751is.f9071a >= 21 ? 345600 : 172800);
        }
        c = i6;
        return i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0329, code lost:
    
        if (r1.equals("hvc1") != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0334, code lost:
    
        r0 = r26.f9825w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0338, code lost:
    
        if (r11.length >= 4) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x033a, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0347, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0348, code lost:
    
        r1 = com.google.android.gms.internal.ads.AbstractC0518dE.f8479a.matcher(r11[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0354, code lost:
    
        if (r1.matches() != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0356, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0363, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0364, code lost:
    
        r1 = r1.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x036e, code lost:
    
        if ("1".equals(r1) == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0370, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0383, code lost:
    
        r0 = r11[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0385, code lost:
    
        if (r0 != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0387, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04ec, code lost:
    
        if (r2 != null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04ee, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MediaCodecUtil", "Unknown HEVC level string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04fb, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0505, code lost:
    
        return new android.util.Pair(java.lang.Integer.valueOf(r7), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x038f, code lost:
    
        switch(r0.hashCode()) {
            case 70821: goto L309;
            case 70914: goto L306;
            case 70917: goto L303;
            case 71007: goto L300;
            case 71010: goto L297;
            case 74665: goto L294;
            case 74758: goto L291;
            case 74761: goto L288;
            case 74851: goto L285;
            case 74854: goto L282;
            case 2193639: goto L279;
            case 2193642: goto L276;
            case 2193732: goto L273;
            case 2193735: goto L270;
            case 2193738: goto L267;
            case 2193825: goto L264;
            case 2193828: goto L261;
            case 2193831: goto L258;
            case 2312803: goto L255;
            case 2312806: goto L252;
            case 2312896: goto L249;
            case 2312899: goto L246;
            case 2312902: goto L243;
            case 2312989: goto L240;
            case 2312992: goto L237;
            case 2312995: goto L234;
            default: goto L230;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0399, code lost:
    
        if (r0.equals("L186") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x039b, code lost:
    
        r2 = 16777216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03a9, code lost:
    
        if (r0.equals("L183") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03ab, code lost:
    
        r2 = 4194304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03b9, code lost:
    
        if (r0.equals("L180") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03bb, code lost:
    
        r2 = 1048576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03c9, code lost:
    
        if (r0.equals("L156") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03cb, code lost:
    
        r2 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03d9, code lost:
    
        if (r0.equals("L153") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03db, code lost:
    
        r2 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03e9, code lost:
    
        if (r0.equals("L150") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03eb, code lost:
    
        r2 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x03f9, code lost:
    
        if (r0.equals("L123") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03fb, code lost:
    
        r2 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0405, code lost:
    
        if (r0.equals("L120") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x040f, code lost:
    
        if (r0.equals("H186") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0411, code lost:
    
        r2 = 33554432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x041f, code lost:
    
        if (r0.equals("H183") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0421, code lost:
    
        r2 = 8388608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x042f, code lost:
    
        if (r0.equals("H180") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0431, code lost:
    
        r2 = 2097152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x043f, code lost:
    
        if (r0.equals("H156") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0441, code lost:
    
        r2 = 524288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x044f, code lost:
    
        if (r0.equals("H153") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0451, code lost:
    
        r2 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x045f, code lost:
    
        if (r0.equals("H150") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0461, code lost:
    
        r2 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0470, code lost:
    
        if (r0.equals("H123") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0472, code lost:
    
        r2 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x047e, code lost:
    
        if (r0.equals("H120") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0480, code lost:
    
        r2 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0489, code lost:
    
        if (r0.equals("L93") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x048b, code lost:
    
        r2 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0494, code lost:
    
        if (r0.equals("L90") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0496, code lost:
    
        r2 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x049e, code lost:
    
        if (r0.equals("L63") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04a0, code lost:
    
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04a9, code lost:
    
        if (r0.equals("L60") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04ab, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04b4, code lost:
    
        if (r0.equals("L30") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04b6, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x04bf, code lost:
    
        if (r0.equals("H93") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x04c1, code lost:
    
        r2 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04c9, code lost:
    
        if (r0.equals("H90") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04cb, code lost:
    
        r2 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x04d3, code lost:
    
        if (r0.equals("H63") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x04d5, code lost:
    
        r2 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04dd, code lost:
    
        if (r0.equals("H60") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04df, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04e8, code lost:
    
        if (r0.equals("H30") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x04ea, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0378, code lost:
    
        if ("2".equals(r1) == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x037a, code lost:
    
        if (r0 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x037f, code lost:
    
        if (r0.c != 6) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0381, code lost:
    
        r7 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0506, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MediaCodecUtil", "Unknown HEVC profile string: ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0513, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0332, code lost:
    
        if (r1.equals("hev1") != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x051a, code lost:
    
        if (r1.equals("avc2") != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0525, code lost:
    
        r0 = r11.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0528, code lost:
    
        if (r0 >= 2) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x052a, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0535, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x053d, code lost:
    
        if (r11[1].length() != 6) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x053f, code lost:
    
        r2 = 16;
        r0 = java.lang.Integer.parseInt(r11[1].substring(0, 2), 16);
        r1 = java.lang.Integer.parseInt(r11[1].substring(4), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x056b, code lost:
    
        if (r0 == 66) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x056f, code lost:
    
        if (r0 == 77) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0573, code lost:
    
        if (r0 == 88) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0577, code lost:
    
        if (r0 == 100) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x057b, code lost:
    
        if (r0 == 110) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x057f, code lost:
    
        if (r0 == 122) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0583, code lost:
    
        if (r0 == 244) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0585, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0587, code lost:
    
        r7 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x058a, code lost:
    
        r7 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x058d, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x058f, code lost:
    
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0592, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0595, code lost:
    
        if (r7 != (-1)) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0597, code lost:
    
        U.a.p(r0, "Unknown AVC profile: ", "MediaCodecUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x059c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x059d, code lost:
    
        switch(r1) {
            case 10: goto L379;
            case 11: goto L378;
            case 12: goto L377;
            case 13: goto L376;
            default: goto L359;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x05a0, code lost:
    
        switch(r1) {
            case 20: goto L375;
            case 21: goto L374;
            case 22: goto L373;
            default: goto L360;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x05a3, code lost:
    
        switch(r1) {
            case 30: goto L372;
            case 31: goto L371;
            case 32: goto L370;
            default: goto L361;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x05a6, code lost:
    
        switch(r1) {
            case 40: goto L369;
            case 41: goto L368;
            case 42: goto L367;
            default: goto L362;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05a9, code lost:
    
        switch(r1) {
            case 50: goto L366;
            case 51: goto L365;
            case 52: goto L364;
            default: goto L363;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05ac, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x05db, code lost:
    
        if (r0 != (-1)) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05dd, code lost:
    
        U.a.p(r1, "Unknown AVC level: ", "MediaCodecUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x05e2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x05f0, code lost:
    
        return new android.util.Pair(java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x05ae, code lost:
    
        r0 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x05b1, code lost:
    
        r0 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x05b5, code lost:
    
        r0 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x05b8, code lost:
    
        r0 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x05bb, code lost:
    
        r0 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x05be, code lost:
    
        r0 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x05c1, code lost:
    
        r0 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x05c4, code lost:
    
        r0 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x05c7, code lost:
    
        r0 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x05ca, code lost:
    
        r0 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x05cd, code lost:
    
        r0 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x05d0, code lost:
    
        r0 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x05d3, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x05d5, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05d8, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x05da, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0594, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0559, code lost:
    
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x055b, code lost:
    
        if (r0 < 3) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x055d, code lost:
    
        r0 = java.lang.Integer.parseInt(r11[1]);
        r1 = java.lang.Integer.parseInt(r11[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x05f1, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MediaCodecUtil", "Ignoring malformed AVC codec string: " + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0600, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0601, code lost:
    
        com.google.android.gms.internal.ads.Wj.l("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0523, code lost:
    
        if (r1.equals("avc1") != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0151, code lost:
    
        if (r0.equals("11") != false) goto L100;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x01df. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(com.google.android.gms.internal.ads.C0976o2 r26) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0518dE.b(com.google.android.gms.internal.ads.o2):android.util.Pair");
    }

    public static String c(C0976o2 c0976o2) {
        Pair b4;
        if ("audio/eac3-joc".equals(c0976o2.f9813k)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c0976o2.f9813k) || (b4 = b(c0976o2)) == null) {
            return null;
        }
        int intValue = ((Integer) b4.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, B0.r] */
    public static synchronized List d(String str, boolean z4, boolean z5) {
        UC uc;
        synchronized (AbstractC0518dE.class) {
            try {
                YD yd = new YD(str, z4, z5);
                HashMap hashMap = f8480b;
                List list = (List) hashMap.get(yd);
                if (list != null) {
                    return list;
                }
                int i4 = AbstractC0751is.f9071a;
                if (i4 >= 21) {
                    ?? obj = new Object();
                    int i5 = 1;
                    if (!z4 && !z5) {
                        i5 = 0;
                    }
                    obj.f112o = i5;
                    uc = obj;
                } else {
                    uc = new UC(8);
                }
                ArrayList e4 = e(yd, uc);
                if (z4 && e4.isEmpty() && i4 >= 21 && i4 <= 23) {
                    e4 = e(yd, new UC(8));
                    if (!e4.isEmpty()) {
                        Wj.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((SD) e4.get(0)).f6957a);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (i4 < 26 && AbstractC0751is.f9072b.equals("R9") && e4.size() == 1 && ((SD) e4.get(0)).f6957a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        e4.add(SD.b("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                    }
                    Collections.sort(e4, new XD(Yv.f7920R));
                }
                if (i4 < 21 && e4.size() > 1) {
                    String str2 = ((SD) e4.get(0)).f6957a;
                    if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                        Collections.sort(e4, new XD(Yv.f7921S));
                    }
                }
                if (i4 < 32 && e4.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((SD) e4.get(0)).f6957a)) {
                    e4.add((SD) e4.remove(0));
                }
                AbstractC1137rt r4 = AbstractC1137rt.r(e4);
                hashMap.put(yd, r4);
                return r4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        if ("SCV31".equals(r15) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0129, code lost:
    
        if (r10.startsWith("t0") == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fd A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:98:0x01dc, B:102:0x01e7, B:106:0x01f7, B:108:0x01fd, B:109:0x020f, B:111:0x0218, B:114:0x0241, B:145:0x021c, B:147:0x022c, B:149:0x0234, B:150:0x0206), top: B:97:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:98:0x01dc, B:102:0x01e7, B:106:0x01f7, B:108:0x01fd, B:109:0x020f, B:111:0x0218, B:114:0x0241, B:145:0x021c, B:147:0x022c, B:149:0x0234, B:150:0x0206), top: B:97:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021c A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:98:0x01dc, B:102:0x01e7, B:106:0x01f7, B:108:0x01fd, B:109:0x020f, B:111:0x0218, B:114:0x0241, B:145:0x021c, B:147:0x022c, B:149:0x0234, B:150:0x0206), top: B:97:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0206 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:98:0x01dc, B:102:0x01e7, B:106:0x01f7, B:108:0x01fd, B:109:0x020f, B:111:0x0218, B:114:0x0241, B:145:0x021c, B:147:0x022c, B:149:0x0234, B:150:0x0206), top: B:97:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(com.google.android.gms.internal.ads.YD r20, com.google.android.gms.internal.ads.InterfaceC0433bE r21) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0518dE.e(com.google.android.gms.internal.ads.YD, com.google.android.gms.internal.ads.bE):java.util.ArrayList");
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (AbstractC0751is.f9071a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if ("audio".equals(AbstractC0438bd.f(str))) {
            return true;
        }
        String i4 = Zf.i(mediaCodecInfo.getName());
        if (i4.startsWith("arc.")) {
            return false;
        }
        if (i4.startsWith("omx.google.") || i4.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((i4.startsWith("omx.sec.") && i4.contains(".sw.")) || i4.equals("omx.qcom.video.decoder.hevcswvdec") || i4.startsWith("c2.android.") || i4.startsWith("c2.google.")) {
            return true;
        }
        return (i4.startsWith("omx.") || i4.startsWith("c2.")) ? false : true;
    }
}
