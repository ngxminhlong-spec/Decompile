package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075qF implements InterfaceC0989oF, NB {

    /* renamed from: F, reason: collision with root package name */
    public static C1075qF f10340F;

    /* renamed from: o, reason: collision with root package name */
    public final Lt f10342o;

    /* renamed from: p, reason: collision with root package name */
    public final C0388aC f10343p = new C0388aC();

    /* renamed from: q, reason: collision with root package name */
    public final b0.l0 f10344q = new b0.l0();

    /* renamed from: r, reason: collision with root package name */
    public int f10345r;

    /* renamed from: s, reason: collision with root package name */
    public long f10346s;

    /* renamed from: t, reason: collision with root package name */
    public long f10347t;

    /* renamed from: u, reason: collision with root package name */
    public long f10348u;

    /* renamed from: v, reason: collision with root package name */
    public long f10349v;

    /* renamed from: w, reason: collision with root package name */
    public long f10350w;

    /* renamed from: x, reason: collision with root package name */
    public long f10351x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public static final Gt f10341z = AbstractC1137rt.u(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: A, reason: collision with root package name */
    public static final Gt f10335A = AbstractC1137rt.u(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: B, reason: collision with root package name */
    public static final Gt f10336B = AbstractC1137rt.u(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: C, reason: collision with root package name */
    public static final Gt f10337C = AbstractC1137rt.u(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: D, reason: collision with root package name */
    public static final Gt f10338D = AbstractC1137rt.u(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: E, reason: collision with root package name */
    public static final Gt f10339E = AbstractC1137rt.u(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    public C1075qF(Context context, HashMap hashMap) {
        this.f10342o = Lt.a(hashMap);
        if (context == null) {
            this.y = 0;
            this.f10350w = d(0);
            return;
        }
        C0621fq d = C0621fq.d(context);
        int a4 = d.a();
        this.y = a4;
        this.f10350w = d(a4);
        C1032pF c1032pF = new C1032pF(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) d.f8748q;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c1032pF));
        ((Handler) d.f8747p).post(new Jn(3, d, c1032pF));
    }

    public static synchronized C1075qF a(Context context) {
        C1075qF c1075qF;
        String y;
        TelephonyManager telephonyManager;
        synchronized (C1075qF.class) {
            try {
                if (f10340F == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    int i4 = AbstractC0751is.f9071a;
                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (!TextUtils.isEmpty(networkCountryIso)) {
                            y = Zf.y(networkCountryIso);
                            int[] g4 = g(y);
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            Gt gt = f10341z;
                            hashMap.put(2, (Long) gt.get(g4[0]));
                            hashMap.put(3, (Long) f10335A.get(g4[1]));
                            hashMap.put(4, (Long) f10336B.get(g4[2]));
                            hashMap.put(5, (Long) f10337C.get(g4[3]));
                            hashMap.put(10, (Long) f10338D.get(g4[4]));
                            hashMap.put(9, (Long) f10339E.get(g4[5]));
                            hashMap.put(7, (Long) gt.get(g4[0]));
                            f10340F = new C1075qF(applicationContext, hashMap);
                        }
                    }
                    y = Zf.y(Locale.getDefault().getCountry());
                    int[] g42 = g(y);
                    HashMap hashMap2 = new HashMap(8);
                    hashMap2.put(0, 1000000L);
                    Gt gt2 = f10341z;
                    hashMap2.put(2, (Long) gt2.get(g42[0]));
                    hashMap2.put(3, (Long) f10335A.get(g42[1]));
                    hashMap2.put(4, (Long) f10336B.get(g42[2]));
                    hashMap2.put(5, (Long) f10337C.get(g42[3]));
                    hashMap2.put(10, (Long) f10338D.get(g42[4]));
                    hashMap2.put(9, (Long) f10339E.get(g42[5]));
                    hashMap2.put(7, (Long) gt2.get(g42[0]));
                    f10340F = new C1075qF(applicationContext, hashMap2);
                }
                c1075qF = f10340F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1075qF;
    }

    public static void b(C1075qF c1075qF, int i4) {
        C1075qF c1075qF2;
        Throwable th;
        int i5;
        synchronized (c1075qF) {
            try {
                if (c1075qF.y != i4) {
                    c1075qF.y = i4;
                    if (i4 != 1 && i4 != 0 && i4 != 8) {
                        c1075qF.f10350w = c1075qF.d(i4);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (c1075qF.f10345r > 0) {
                            try {
                                i5 = (int) (elapsedRealtime - c1075qF.f10346s);
                            } catch (Throwable th2) {
                                th = th2;
                                c1075qF2 = c1075qF;
                                throw th;
                            }
                        } else {
                            i5 = 0;
                        }
                        c1075qF2 = c1075qF;
                        try {
                            c1075qF2.e(i5, c1075qF.f10347t, c1075qF.f10350w);
                            c1075qF2.f10346s = elapsedRealtime;
                            c1075qF2.f10347t = 0L;
                            c1075qF2.f10349v = 0L;
                            c1075qF2.f10348u = 0L;
                            b0.l0 l0Var = c1075qF2.f10344q;
                            try {
                                ((ArrayList) l0Var.f3351b).clear();
                                l0Var.c = -1;
                                l0Var.d = 0;
                                l0Var.f3352e = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                c1075qF2 = c1075qF;
                th = th5;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0034. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] g(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1075qF.g(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final synchronized void c(C0757iz c0757iz, boolean z4, int i4) {
        boolean z5;
        if (z4) {
            c0757iz.getClass();
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f10347t += i4;
        }
    }

    public final long d(int i4) {
        Integer valueOf = Integer.valueOf(i4);
        Lt lt = this.f10342o;
        Long l4 = (Long) lt.get(valueOf);
        if (l4 == null) {
            l4 = (Long) lt.get(0);
        }
        if (l4 == null) {
            l4 = 1000000L;
        }
        return l4.longValue();
    }

    public final void e(int i4, long j4, final long j5) {
        final int i5;
        final long j6;
        if (i4 == 0) {
            if (j4 != 0) {
                j6 = j4;
            } else if (j5 == this.f10351x) {
                return;
            } else {
                j6 = 0;
            }
            i5 = 0;
        } else {
            i5 = i4;
            j6 = j4;
        }
        this.f10351x = j5;
        Iterator it = ((CopyOnWriteArrayList) this.f10343p.f8087p).iterator();
        while (it.hasNext()) {
            final C0946nF c0946nF = (C0946nF) it.next();
            if (!c0946nF.c) {
                c0946nF.f9729a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mF
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.QC, java.lang.Object, com.google.android.gms.internal.ads.ro] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object next;
                        Object obj;
                        C1202tE c1202tE;
                        VC vc = C0946nF.this.f9730b;
                        C0381a5 c0381a5 = vc.f7251r;
                        if (((AbstractC1137rt) c0381a5.f8078q).isEmpty()) {
                            c1202tE = null;
                        } else {
                            AbstractC1137rt abstractC1137rt = (AbstractC1137rt) c0381a5.f8078q;
                            if (abstractC1137rt == null) {
                                C1052pt listIterator = abstractC1137rt.listIterator(0);
                                do {
                                    next = listIterator.next();
                                } while (listIterator.hasNext());
                                obj = next;
                            } else {
                                if (abstractC1137rt.isEmpty()) {
                                    throw new NoSuchElementException();
                                }
                                obj = abstractC1137rt.get(abstractC1137rt.size() - 1);
                            }
                            c1202tE = (C1202tE) obj;
                        }
                        OC f4 = vc.f(c1202tE);
                        ?? obj2 = new Object();
                        obj2.f6652q = f4;
                        obj2.f6650o = i5;
                        obj2.f6651p = j6;
                        vc.e(f4, 1006, obj2);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r10.f10349v >= 524288) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.NB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(com.google.android.gms.internal.ads.C0757iz r11, boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto Lf
            r11.getClass()     // Catch: java.lang.Throwable -> La
            r11 = r1
            goto L10
        La:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        Lf:
            r11 = r0
        L10:
            if (r11 != 0) goto L14
            monitor-exit(r10)
            return
        L14:
            int r11 = r10.f10345r     // Catch: java.lang.Throwable -> L71
            if (r11 <= 0) goto L19
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.Zf.X(r0)     // Catch: java.lang.Throwable -> L71
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L71
            long r0 = r10.f10346s     // Catch: java.lang.Throwable -> L71
            long r0 = r11 - r0
            long r2 = r10.f10348u     // Catch: java.lang.Throwable -> L71
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L71
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L71
            long r2 = r2 + r0
            r10.f10348u = r2     // Catch: java.lang.Throwable -> L71
            long r0 = r10.f10349v     // Catch: java.lang.Throwable -> L71
            long r2 = r10.f10347t     // Catch: java.lang.Throwable -> L71
            long r0 = r0 + r2
            r10.f10349v = r0     // Catch: java.lang.Throwable -> L71
            if (r5 <= 0) goto L74
            float r0 = (float) r2     // Catch: java.lang.Throwable -> L71
            b0.l0 r1 = r10.f10344q     // Catch: java.lang.Throwable -> L71
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L71
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L71
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L71
            r3 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r3
            float r3 = (float) r5     // Catch: java.lang.Throwable -> L71
            float r0 = r0 / r3
            r1.o(r2, r0)     // Catch: java.lang.Throwable -> L71
            long r0 = r10.f10348u     // Catch: java.lang.Throwable -> L71
            r2 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L56
            long r0 = r10.f10349v     // Catch: java.lang.Throwable -> La
            r2 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L5f
        L56:
            b0.l0 r0 = r10.f10344q     // Catch: java.lang.Throwable -> L71
            float r0 = r0.n()     // Catch: java.lang.Throwable -> L71
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L71
            r10.f10350w = r0     // Catch: java.lang.Throwable -> L71
        L5f:
            long r6 = r10.f10347t     // Catch: java.lang.Throwable -> L71
            long r8 = r10.f10350w     // Catch: java.lang.Throwable -> L71
            r4 = r10
            r4.e(r5, r6, r8)     // Catch: java.lang.Throwable -> L6e
            r4.f10346s = r11     // Catch: java.lang.Throwable -> L6e
            r11 = 0
            r4.f10347t = r11     // Catch: java.lang.Throwable -> L6e
            goto L75
        L6e:
            r0 = move-exception
        L6f:
            r11 = r0
            goto L7d
        L71:
            r0 = move-exception
            r4 = r10
            goto L6f
        L74:
            r4 = r10
        L75:
            int r11 = r4.f10345r     // Catch: java.lang.Throwable -> L6e
            int r11 = r11 + (-1)
            r4.f10345r = r11     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r10)
            return
        L7d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6e
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1075qF.f(com.google.android.gms.internal.ads.iz, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final synchronized void k(AbstractC1398xw abstractC1398xw, C0757iz c0757iz, boolean z4) {
        boolean z5;
        if (z4) {
            c0757iz.getClass();
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (this.f10345r == 0) {
                this.f10346s = SystemClock.elapsedRealtime();
            }
            this.f10345r++;
        }
    }
}
