package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class XC {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f7616h = new Random();
    public C0389aD d;

    /* renamed from: f, reason: collision with root package name */
    public String f7620f;

    /* renamed from: a, reason: collision with root package name */
    public final Rg f7617a = new Rg();

    /* renamed from: b, reason: collision with root package name */
    public final C1210tg f7618b = new C1210tg();
    public final HashMap c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0484ch f7619e = AbstractC0484ch.f8374a;

    /* renamed from: g, reason: collision with root package name */
    public long f7621g = -1;

    public final synchronized String a(AbstractC0484ch abstractC0484ch, C1202tE c1202tE) {
        return e(abstractC0484ch.n(c1202tE.f10688a, this.f7618b).c, c1202tE).f7353a;
    }

    public final synchronized void b(OC oc) {
        C0389aD c0389aD;
        try {
            String str = this.f7620f;
            if (str != null) {
                WC wc = (WC) this.c.get(str);
                if (wc == null) {
                    throw null;
                }
                f(wc);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                WC wc2 = (WC) it.next();
                it.remove();
                if (wc2.f7355e && (c0389aD = this.d) != null) {
                    c0389aD.c(oc, wc2.f7353a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:12:0x0015, B:14:0x0019, B:16:0x0027, B:19:0x0033, B:21:0x0039, B:23:0x0045, B:25:0x004b, B:28:0x002e, B:29:0x0055, B:31:0x0061, B:32:0x0065, B:34:0x006a, B:36:0x0070, B:38:0x0085, B:39:0x00a5, B:41:0x00a9, B:42:0x00ab, B:44:0x00b5, B:46:0x00b9, B:48:0x00c6, B:53:0x00cd, B:55:0x00ec), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(com.google.android.gms.internal.ads.OC r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XC.c(com.google.android.gms.internal.ads.OC):void");
    }

    public final synchronized void d(OC oc, int i4) {
        try {
            if (this.d == null) {
                throw null;
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                WC wc = (WC) it.next();
                if (wc.a(oc)) {
                    it.remove();
                    if (wc.f7355e) {
                        if (wc.f7353a.equals(this.f7620f)) {
                            f(wc);
                        }
                        this.d.c(oc, wc.f7353a);
                    }
                }
            }
            g(oc);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.WC e(int r19, com.google.android.gms.internal.ads.C1202tE r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.ads.WC r8 = (com.google.android.gms.internal.ads.WC) r8
            long r9 = r8.c
            com.google.android.gms.internal.ads.tE r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.f7354b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.XC r9 = r8.f7357g
            long r14 = r2.d
            java.util.HashMap r10 = r9.c
            r16 = r12
            java.lang.String r12 = r9.f7620f
            java.lang.Object r10 = r10.get(r12)
            com.google.android.gms.internal.ads.WC r10 = (com.google.android.gms.internal.ads.WC) r10
            if (r10 == 0) goto L4b
            long r12 = r10.c
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 == 0) goto L4b
            goto L50
        L4b:
            long r9 = r9.f7621g
            r12 = 1
            long r12 = r12 + r9
        L50:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 < 0) goto L59
            r8.c = r14
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 != 0) goto L60
            int r9 = r8.f7354b
            if (r1 != r9) goto L16
            goto L83
        L60:
            long r9 = r2.d
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L83
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.f10689b
            int r10 = r11.f10689b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
        L83:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9b
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 >= 0) goto L8e
            goto L9b
        L8e:
            if (r12 != 0) goto L16
            int r9 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            com.google.android.gms.internal.ads.tE r9 = r7.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r7 = r8
            goto L16
        L9b:
            r7 = r8
            r5 = r9
            goto L16
        L9f:
            if (r7 != 0) goto Lb9
            r4 = 12
            byte[] r4 = new byte[r4]
            java.util.Random r5 = com.google.android.gms.internal.ads.XC.f7616h
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            com.google.android.gms.internal.ads.WC r5 = new com.google.android.gms.internal.ads.WC
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XC.e(int, com.google.android.gms.internal.ads.tE):com.google.android.gms.internal.ads.WC");
    }

    public final void f(WC wc) {
        long j4 = wc.c;
        if (j4 != -1) {
            this.f7621g = j4;
        }
        this.f7620f = null;
    }

    public final void g(OC oc) {
        C1202tE c1202tE;
        AbstractC0484ch abstractC0484ch = oc.f6444b;
        int i4 = oc.c;
        C1202tE c1202tE2 = oc.d;
        boolean o4 = abstractC0484ch.o();
        HashMap hashMap = this.c;
        if (o4) {
            String str = this.f7620f;
            if (str != null) {
                WC wc = (WC) hashMap.get(str);
                wc.getClass();
                f(wc);
                return;
            }
            return;
        }
        WC wc2 = (WC) hashMap.get(this.f7620f);
        this.f7620f = e(i4, c1202tE2).f7353a;
        c(oc);
        if (c1202tE2 != null) {
            long j4 = c1202tE2.d;
            if (c1202tE2.b()) {
                if (wc2 != null && wc2.c == j4 && (c1202tE = wc2.d) != null && c1202tE.f10689b == c1202tE2.f10689b && c1202tE.c == c1202tE2.c) {
                    return;
                }
                e(i4, new C1202tE(j4, c1202tE2.f10688a));
            }
        }
    }
}
