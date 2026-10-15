package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0336Sb implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6966b;

    public /* synthetic */ CallableC0336Sb(int i4, Object obj) {
        this.f6965a = i4;
        this.f6966b = obj;
    }

    public /* synthetic */ CallableC0336Sb(Pu pu) {
        this.f6965a = 25;
        Pu pu2 = Pu.f6608p;
        this.f6966b = pu;
    }

    private final Object a() {
        long j4;
        C0255Cd c0255Cd = (C0255Cd) this.f6966b;
        c0255Cd.getClass();
        C0381a5 c0381a5 = N1.n.f1204A.f1211i;
        C0509d5 c0509d5 = c0255Cd.f4446A;
        synchronized (c0381a5.f8079r) {
            try {
                j4 = -2;
                if (((C0551e5) c0381a5.f8081t) != null) {
                    if (((C0466c5) c0381a5.f8080s).A()) {
                        try {
                            C0551e5 c0551e5 = (C0551e5) c0381a5.f8081t;
                            Parcel Q3 = c0551e5.Q();
                            AbstractC1192t4.c(Q3, c0509d5);
                            Parcel q12 = c0551e5.q1(Q3, 3);
                            long readLong = q12.readLong();
                            q12.recycle();
                            j4 = readLong;
                        } catch (RemoteException e4) {
                            Y9.q("Unable to call into cache service.", e4);
                        }
                    }
                }
            } finally {
            }
        }
        return Long.valueOf(j4);
    }

    private final Object b() {
        Sn sn = (Sn) this.f6966b;
        int i4 = 0;
        String str = null;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r6)).booleanValue() && "requester_type_2".equals(AbstractC1895f.G(sn.c.d))) {
            C0800jz c0800jz = AbstractC0886lz.f9510p;
            C0843kz c0843kz = new C0843kz();
            try {
                C1357wy c1357wy = (C1357wy) C0882lv.q(Bs.g(Gw.f5352b.a())).f9507q;
                try {
                    int f4 = c1357wy.f();
                    Logger logger = AbstractC1229tz.c;
                    if (f4 > 4096) {
                        f4 = 4096;
                    }
                    C1186sz c1186sz = new C1186sz(c0843kz, f4);
                    c1357wy.a(c1186sz);
                    if (c1186sz.f10658g > 0) {
                        c1186sz.U();
                    }
                    c0843kz.close();
                } catch (Throwable th) {
                    c0843kz.close();
                    throw th;
                }
            } catch (IOException | GeneralSecurityException e4) {
                Q1.I.w("Failed to generate key".concat(e4.toString()));
                N1.n.f1204A.f1209g.h("CryptoUtils.generateKey", e4);
            }
            str = Base64.encodeToString(c0843kz.a().h(), 11);
            synchronized (c0843kz) {
                c0843kz.f9340p.clear();
                c0843kz.f9341q = 0;
                c0843kz.f9343s = 0;
            }
        }
        return new Tn(str, i4);
    }

    private final Object c() {
        O1.r rVar;
        String str;
        Qn qn = (Qn) this.f6966b;
        Ok ok = (Ok) qn.c;
        synchronized (ok) {
            C0937n6 c0937n6 = AbstractC1066q6.P7;
            rVar = O1.r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && ok.f()) {
                long j4 = ok.f6505n;
                N1.n.f1204A.f1212j.getClass();
                if (j4 < System.currentTimeMillis() / 1000) {
                    ok.f6503l = "{}";
                    ok.f6505n = Long.MAX_VALUE;
                    str = "";
                } else if (!ok.f6503l.equals("{}")) {
                    str = ok.f6503l;
                }
            }
            str = "";
        }
        boolean g4 = ok.g();
        boolean j5 = N1.n.f1204A.f1215m.j();
        Ok ok2 = (Ok) qn.c;
        return new C1047po(str, g4, j5, ok2.f6504m != null, ok2.f6511t < ((Long) rVar.c.a(AbstractC1066q6.k8)).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.u2)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r9 = com.google.android.gms.internal.ads.Wr.f(r0);
        r10 = ((java.lang.Long) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10113H2)).longValue();
        r14 = N1.n.f1204A.f1209g.c().q();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Wr.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        r5 = r9.a(r10, null, null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Wr.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
    
        if (((java.lang.Boolean) r6.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10297v2)).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r0 = com.google.android.gms.internal.ads.Xr.g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (((com.google.android.gms.internal.ads.C0248Bc) r1.f7185e).f4086q < ((java.lang.Integer) r6.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10095D2)).intValue()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0102, code lost:
    
        r3 = r0.f(N1.n.f1204A.f1209g.c().q(), ((java.lang.Long) r6.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10117I2)).longValue());
        r5 = ((android.content.SharedPreferences) r0.f7305f.f4619q).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        r7 = ((android.content.SharedPreferences) r0.f7305f.f4619q).getBoolean("paidv2_user_option", true);
        r6 = r5;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        if (((java.lang.Boolean) r6.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10306x2)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0061, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.w2)).booleanValue() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CallableC0336Sb.d():java.lang.Object");
    }

    private final Object e() {
        String str;
        Ao ao = (Ao) this.f6966b;
        if (!((C0356Wb) ao.c).j((Context) ao.d)) {
            return new Bo(null, null, null, null, null);
        }
        String h4 = ((C0356Wb) ao.c).h((Context) ao.d);
        if (h4 == null) {
            h4 = "";
        }
        String str2 = h4;
        String g4 = ((C0356Wb) ao.c).g((Context) ao.d);
        if (g4 == null) {
            g4 = "";
        }
        String str3 = g4;
        String f4 = ((C0356Wb) ao.c).f((Context) ao.d);
        if (f4 == null) {
            f4 = "";
        }
        String str4 = f4;
        C0356Wb c0356Wb = (C0356Wb) ao.c;
        Context context = (Context) ao.d;
        Long l4 = null;
        if (c0356Wb.j(context)) {
            synchronized (c0356Wb.f7448b) {
                try {
                    str = c0356Wb.d;
                    if (str == null) {
                        if (C0356Wb.k(context)) {
                            c0356Wb.d = (String) c0356Wb.l("getAppIdOrigin", c0356Wb.d, BF.f4080z);
                        } else {
                            c0356Wb.d = "fa";
                        }
                        str = c0356Wb.d;
                    }
                } finally {
                }
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if ("TIME_OUT".equals(str3)) {
            l4 = (Long) O1.r.d.c.a(AbstractC1066q6.f10193Z);
        }
        return new Bo(str2, str3, str4, str, l4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:21|(3:23|(1:26)|27)|28|(3:81|82|(20:84|85|31|32|33|(15:35|36|37|(3:40|(3:43|(11:46|47|48|(1:73)(1:52)|53|(3:65|66|(1:70))(1:55)|56|(1:58)(1:64)|(1:60)(1:63)|61|62)(1:45)|41)|74)|75|48|(1:50)|73|53|(0)(0)|56|(0)(0)|(0)(0)|61|62)|77|37|(3:40|(1:41)|74)|75|48|(0)|73|53|(0)(0)|56|(0)(0)|(0)(0)|61|62))|30|31|32|33|(0)|77|37|(0)|75|48|(0)|73|53|(0)(0)|56|(0)(0)|(0)(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ea, code lost:
    
        if (r0.contains("banner") == false) goto L119;
     */
    /* JADX WARN: Incorrect condition in loop: B:25:0x00f1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c A[Catch: Exception -> 0x0165, TRY_LEAVE, TryCatch #11 {Exception -> 0x0165, blocks: (B:33:0x0140, B:35:0x014c), top: B:32:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v14, types: [org.json.JSONObject] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CallableC0336Sb.call():java.lang.Object");
    }
}
