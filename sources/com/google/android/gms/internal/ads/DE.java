package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class DE {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4599a;

    /* renamed from: b, reason: collision with root package name */
    public final Qw f4600b;
    public final C0882lv c;
    public final GE d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f4601e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4603g;

    /* renamed from: i, reason: collision with root package name */
    public long f4605i;

    /* renamed from: j, reason: collision with root package name */
    public C0757iz f4606j;

    /* renamed from: k, reason: collision with root package name */
    public KE f4607k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4608l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GE f4609m;

    /* renamed from: f, reason: collision with root package name */
    public final F f4602f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4604h = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.android.gms.internal.ads.F] */
    public DE(GE ge, Uri uri, Px px, C0882lv c0882lv, GE ge2, Y y) {
        this.f4609m = ge;
        this.f4599a = uri;
        this.f4600b = new Qw(px);
        this.c = c0882lv;
        this.d = ge2;
        this.f4601e = y;
        C0859lE.f9430a.getAndIncrement();
        this.f4606j = b(0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(5:11|12|13|14|(30:16|17|18|19|(1:21)(1:153)|22|(1:24)(1:152)|25|(1:27)(1:151)|28|(1:30)(1:150)|31|(4:33|34|35|(17:37|38|(1:40)|41|(1:141)(3:45|(1:47)(1:140)|48)|49|(1:56)|57|(1:59)|60|(1:(3:62|63|(8:65|66|1b8|74|(1:76)(1:85)|77|(4:79|80|81|82)(1:84)|83)(2:94|95))(1:139))|(5:97|(1:99)(1:108)|100|(3:102|(1:104)(1:106)|105)|107)|109|110|111|113|(2:115|116)(1:117))(2:142|143))|149|(0)|41|(1:43)|141|49|(3:51|54|56)|57|(0)|60|(2:(0)(0)|83)|(0)|109|110|111|113|(0)(0))(3:157|158|159))(1:166)|18|19|(0)(0)|22|(0)(0)|25|(0)(0)|28|(0)(0)|31|(0)|149|(0)|41|(0)|141|49|(0)|57|(0)|60|(2:(0)(0)|83)|(0)|109|110|111|113|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[LOOP:0: B:2:0x0006->B:117:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020c A[EDGE_INSN: B:139:0x020c->B:96:0x020c BREAK  A[LOOP:1: B:61:0x01b0->B:83:0x01b0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[Catch: all -> 0x016b, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x016b, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[Catch: all -> 0x016b, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[Catch: all -> 0x016b, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128 A[Catch: all -> 0x016b, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139 A[Catch: all -> 0x016b, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a A[Catch: all -> 0x016b, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #7 {all -> 0x016b, blocks: (B:19:0x008b, B:21:0x0096, B:22:0x00a2, B:24:0x00ac, B:25:0x00b8, B:27:0x00c2, B:28:0x00ce, B:30:0x00d8, B:31:0x00ea, B:33:0x00f4, B:35:0x00fa, B:40:0x0128, B:41:0x012f, B:43:0x0139, B:45:0x013d, B:48:0x0148, B:49:0x016f, B:51:0x018a, B:54:0x0193, B:56:0x0197, B:57:0x019b, B:59:0x019f, B:143:0x0104, B:146:0x011a, B:159:0x005e, B:163:0x0079), top: B:18:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, E0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DE.a():void");
    }

    public final C0757iz b(long j4) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = GE.f5143Y;
        Uri uri = this.f4599a;
        if (uri != null) {
            return new C0757iz(uri, 0L, map2, j4, -1L, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
