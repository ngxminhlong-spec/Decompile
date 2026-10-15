package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Y9 {

    /* renamed from: A, reason: collision with root package name */
    public static final C1384xi f7750A;

    /* renamed from: G, reason: collision with root package name */
    public static final C4 f7756G;

    /* renamed from: P, reason: collision with root package name */
    public static final Hi f7764P;

    /* renamed from: z, reason: collision with root package name */
    public static final C4 f7790z;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7768a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f7769b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7770e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f7771f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f7772g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f7773h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f7774i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f7775j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f7776k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f7777l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f7778m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7779n = {44100, 48000, 32000};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f7780o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f7781p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f7782q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f7783r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f7784s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f7785t = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f7786u = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f7787v = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f7788w = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f7789x = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final C4 y = new C4(0);

    /* renamed from: B, reason: collision with root package name */
    public static final C4 f7751B = new C4(4);

    /* renamed from: C, reason: collision with root package name */
    public static final C4 f7752C = new C4(10);

    /* renamed from: D, reason: collision with root package name */
    public static final C4 f7753D = new C4(11);

    /* renamed from: E, reason: collision with root package name */
    public static final C4 f7754E = new C4(12);

    /* renamed from: F, reason: collision with root package name */
    public static final C4 f7755F = new C4(13);

    /* renamed from: H, reason: collision with root package name */
    public static final C4 f7757H = new C4(15);

    /* renamed from: I, reason: collision with root package name */
    public static final C4 f7758I = new C4(16);

    /* renamed from: J, reason: collision with root package name */
    public static final C4 f7759J = new C4(17);

    /* renamed from: K, reason: collision with root package name */
    public static final C4 f7760K = new C4(25);

    /* renamed from: L, reason: collision with root package name */
    public static final C4 f7761L = new C4(26);

    /* renamed from: M, reason: collision with root package name */
    public static final C4 f7762M = new C4(27);
    public static final C4 N = new C4(28);

    /* renamed from: O, reason: collision with root package name */
    public static final C4 f7763O = new C4(29);

    /* renamed from: Q, reason: collision with root package name */
    public static final Hi f7765Q = new Hi(5);

    /* renamed from: R, reason: collision with root package name */
    public static final Hi f7766R = new Hi(6);

    /* renamed from: S, reason: collision with root package name */
    public static final Hi f7767S = new Hi(7);

    static {
        int i4 = 1;
        int i5 = 14;
        f7790z = new C4(i4);
        f7750A = new C1384xi(27, new C0347Uc(i5, (byte) 0));
        f7756G = new C4(i5);
        f7764P = new Hi(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r10.t() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r10.f(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r10.t() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r10.f(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r10.s(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (true == r10.t()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r10 = r10.f(4);
        r9 = com.google.android.gms.internal.ads.Y9.f7774i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r10 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        r10 = r9[13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        return new com.google.android.gms.internal.ads.C0887m(r5, r0, r10, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r5 != 48000) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r10 >= 14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        r6 = r9[r10];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r2 == 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r2 == 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if (r2 == 3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r2 == 4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r10 == 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r10 == 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r10 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if (r10 == 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r10 == 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r10 != 8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0056, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r10.f(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r10.f(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.C0887m a(com.google.android.gms.internal.ads.X r10) {
        /*
            r0 = 16
            int r1 = r10.f(r0)
            int r0 = r10.f(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.f(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.f(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.f(r1)
            boolean r2 = r10.t()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.f(r2)
            boolean r5 = r10.t()
            if (r5 == 0) goto L47
            int r5 = r10.f(r4)
            if (r5 <= 0) goto L47
            r10.s(r1)
        L47:
            boolean r5 = r10.t()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r7
            goto L57
        L56:
            r5 = r6
        L57:
            int r10 = r10.f(r3)
            int[] r9 = com.google.android.gms.internal.ads.Y9.f7774i
            if (r5 != r7) goto L66
            r7 = 13
            if (r10 != r7) goto L66
            r10 = r9[r7]
            goto L94
        L66:
            r7 = 0
            if (r5 != r6) goto L93
            r6 = 14
            if (r10 >= r6) goto L93
            r6 = r9[r10]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L7e
            goto L91
        L7e:
            if (r10 == r4) goto L84
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
        L84:
            int r10 = r6 + 1
            goto L94
        L87:
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
            goto L84
        L8c:
            if (r10 == r4) goto L84
            if (r10 != r7) goto L91
            goto L84
        L91:
            r10 = r6
            goto L94
        L93:
            r10 = r7
        L94:
            com.google.android.gms.internal.ads.m r1 = new com.google.android.gms.internal.ads.m
            r2 = 0
            r1.<init>(r5, r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Y9.a(com.google.android.gms.internal.ads.X):com.google.android.gms.internal.ads.m");
    }

    public static int b(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i4 & (-2097152)) != -2097152 || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = i7 - 1;
        int i10 = f7779n[i8];
        if (i5 == 2) {
            i10 /= 2;
        } else if (i5 == 0) {
            i10 /= 4;
        }
        int i11 = (i4 >>> 9) & 1;
        if (i6 == 3) {
            return ((((i5 == 3 ? f7780o[i9] : f7781p[i9]) * 12) / i10) + i11) * 4;
        }
        int i12 = i5 == 3 ? i6 == 2 ? f7782q[i9] : f7783r[i9] : f7784s[i9];
        if (i5 == 3) {
            return ((i12 * 144) / i10) + i11;
        }
        return (((i6 == 1 ? 72 : 144) * i12) / i10) + i11;
    }

    public static int c(C1134rq c1134rq) {
        c1134rq.f(4);
        if (c1134rq.h() == 1684108385) {
            c1134rq.f(8);
            return c1134rq.m();
        }
        Wj.l("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, com.google.android.gms.internal.ads.T0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.T0 d(com.google.android.gms.internal.ads.X r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Y9.d(com.google.android.gms.internal.ads.X, boolean):com.google.android.gms.internal.ads.T0");
    }

    public static Gt e(XmlPullParser xmlPullParser, String str, String str2) {
        Object[] objArr = new Object[4];
        int i4 = 0;
        while (true) {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (Zf.K(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String k3 = Zf.k(xmlPullParser, concat2);
                String k4 = Zf.k(xmlPullParser, concat3);
                String k5 = Zf.k(xmlPullParser, concat4);
                String k6 = Zf.k(xmlPullParser, concat5);
                if (k3 == null || k4 == null) {
                    break;
                }
                C1145s0 c1145s0 = new C1145s0(k5 != null ? Long.parseLong(k5) : 0L, k6 != null ? Long.parseLong(k6) : 0L, k3);
                int i5 = i4 + 1;
                int length = objArr.length;
                if (length < i5) {
                    objArr = Arrays.copyOf(objArr, AbstractC0880lt.d(length, i5));
                }
                objArr[i4] = c1145s0;
                i4 = i5;
            }
            String concat6 = str.concat(":Directory");
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(concat6)) {
                return AbstractC1137rt.q(i4, objArr);
            }
        }
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        return Gt.f5344s;
    }

    public static void f(int i4, C1134rq c1134rq) {
        c1134rq.b(7);
        byte[] bArr = c1134rq.f10536a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i4 >> 16) & 255);
        bArr[5] = (byte) ((i4 >> 8) & 255);
        bArr[6] = (byte) (i4 & 255);
    }

    public static F0 g(int i4, String str, C1134rq c1134rq, boolean z4, boolean z5) {
        int c2 = c(c1134rq);
        if (z5) {
            c2 = Math.min(1, c2);
        }
        if (c2 >= 0) {
            return z4 ? new J0(str, null, AbstractC1137rt.t(Integer.toString(c2))) : new C0("und", str, Integer.toString(c2));
        }
        Wj.l("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC0505d1.c(i4)));
        return null;
    }

    public static boolean h(C c2, boolean z4) {
        long j4;
        C1134rq c1134rq;
        int i4;
        boolean z5;
        long i5 = c2.i();
        long j5 = -1;
        long j6 = 4096;
        if (i5 != -1 && i5 <= 4096) {
            j6 = i5;
        }
        C1134rq c1134rq2 = new C1134rq(64);
        int i6 = (int) j6;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        while (i8 < i6) {
            c1134rq2.b(8);
            if (!c2.E(c1134rq2.f10536a, i7, 8, true)) {
                break;
            }
            long u2 = c1134rq2.u();
            int h4 = c1134rq2.h();
            if (u2 == 1) {
                c2.A(c1134rq2.f10536a, 8, 8);
                i4 = 16;
                c1134rq2.d(16);
                c1134rq = c1134rq2;
                j4 = c1134rq2.t();
            } else {
                if (u2 == 0) {
                    long i9 = c2.i();
                    if (i9 != j5) {
                        u2 = (i9 - c2.a()) + 8;
                    }
                }
                j4 = u2;
                c1134rq = c1134rq2;
                i4 = 8;
            }
            long j7 = i4;
            if (j4 < j7) {
                return false;
            }
            i8 += i4;
            if (h4 != 1836019574) {
                if (h4 == 1836019558) {
                    i7 = 1;
                    break;
                }
                if (h4 == 1836475768) {
                    i7 = 1;
                    break;
                }
                z6 |= !(h4 != 1835295092);
                C1134rq c1134rq3 = c1134rq;
                if ((i8 + j4) - j7 >= i6) {
                    break;
                }
                int i10 = (int) (j4 - j7);
                i8 += i10;
                if (h4 != 1718909296) {
                    c1134rq = c1134rq3;
                    if (i10 != 0) {
                        c2.v(i10);
                    }
                } else {
                    if (i10 < 8) {
                        return false;
                    }
                    c1134rq = c1134rq3;
                    c1134rq.b(i10);
                    c2.A(c1134rq.f10536a, 0, i10);
                    int i11 = i10 >> 2;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (i12 != 1) {
                            int h5 = c1134rq.h();
                            if ((h5 >>> 8) != 3368816) {
                                if (h5 == 1751476579) {
                                    h5 = 1751476579;
                                }
                                for (int i13 = 0; i13 < 29; i13++) {
                                    if (f7789x[i13] != h5) {
                                    }
                                }
                            }
                            z5 = true;
                            break;
                        }
                        c1134rq.f(4);
                    }
                    z5 = z6;
                    if (!z5) {
                        return false;
                    }
                    z6 = z5;
                }
            } else {
                i6 += (int) j4;
                if (i5 != -1 && i6 > i5) {
                    i6 = (int) i5;
                }
            }
            c1134rq2 = c1134rq;
            j5 = -1;
            i7 = 0;
        }
        i7 = 0;
        return z6 && z4 == i7;
    }

    public static int i(X x4) {
        int f4 = x4.f(4);
        if (f4 == 15) {
            if (x4.a() >= 24) {
                return x4.f(24);
            }
            throw C0907md.a("AAC header insufficient data", null);
        }
        if (f4 < 13) {
            return f7768a[f4];
        }
        throw C0907md.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static J0 j(int i4, String str, C1134rq c1134rq) {
        int h4 = c1134rq.h();
        if (c1134rq.h() == 1684108385 && h4 >= 22) {
            c1134rq.f(10);
            int q4 = c1134rq.q();
            if (q4 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(q4);
                String sb2 = sb.toString();
                int q5 = c1134rq.q();
                if (q5 > 0) {
                    sb2 = sb2 + "/" + q5;
                }
                return new J0(str, null, AbstractC1137rt.t(sb2));
            }
        }
        Wj.l("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC0505d1.c(i4)));
        return null;
    }

    public static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static J0 l(int i4, String str, C1134rq c1134rq) {
        int h4 = c1134rq.h();
        if (c1134rq.h() == 1684108385) {
            c1134rq.f(8);
            return new J0(str, null, AbstractC1137rt.t(c1134rq.y(h4 - 16)));
        }
        Wj.l("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC0505d1.c(i4)));
        return null;
    }

    public static void m(String str) {
        if (!v(3)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        C1384xi c1384xi = f7750A;
        Iterator d4 = ((Ks) c1384xi.f11290p).d(c1384xi, str);
        boolean z4 = true;
        while (true) {
            Js js = (Js) d4;
            if (!js.hasNext()) {
                return;
            }
            String str2 = (String) js.next();
            if (z4) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z4 = false;
        }
    }

    public static int n(int i4, int i5) {
        int i6;
        if (i4 < 0 || i4 >= 3 || i5 < 0 || (i6 = i5 >> 1) >= 19) {
            return -1;
        }
        int i7 = d[i4];
        if (i7 == 44100) {
            int i8 = f7773h[i6] + (i5 & 1);
            return i8 + i8;
        }
        int i9 = f7772g[i6];
        return i7 == 32000 ? i9 * 6 : i9 * 4;
    }

    public static void o(String str, Throwable th) {
        if (v(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void p(String str) {
        if (!v(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        C1384xi c1384xi = f7750A;
        Iterator d4 = ((Ks) c1384xi.f11290p).d(c1384xi, str);
        boolean z4 = true;
        while (true) {
            Js js = (Js) d4;
            if (!js.hasNext()) {
                return;
            }
            String str2 = (String) js.next();
            if (z4) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z4 = false;
        }
    }

    public static void q(String str, Throwable th) {
        if (v(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void r(String str) {
        if (!v(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        C1384xi c1384xi = f7750A;
        Iterator d4 = ((Ks) c1384xi.f11290p).d(c1384xi, str);
        boolean z4 = true;
        while (true) {
            Js js = (Js) d4;
            if (!js.hasNext()) {
                return;
            }
            String str2 = (String) js.next();
            if (z4) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z4 = false;
        }
    }

    public static void s(String str) {
        if (!v(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        C1384xi c1384xi = f7750A;
        Iterator d4 = ((Ks) c1384xi.f11290p).d(c1384xi, str);
        boolean z4 = true;
        while (true) {
            Js js = (Js) d4;
            if (!js.hasNext()) {
                return;
            }
            String str2 = (String) js.next();
            if (z4) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z4 = false;
        }
    }

    public static void t(String str, Throwable th) {
        if (v(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void u(String str, Exception exc) {
        if (v(5)) {
            if (exc != null) {
                t(k(str), exc);
            } else {
                s(k(str));
            }
        }
    }

    public static boolean v(int i4) {
        return i4 >= 5 || Log.isLoggable("Ads", i4);
    }
}
