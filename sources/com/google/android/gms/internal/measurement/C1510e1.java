package com.google.android.gms.internal.measurement;

import H.C0034i;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC0751is;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.Am;
import com.google.android.gms.internal.ads.BinderC0854l9;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0255Cd;
import com.google.android.gms.internal.ads.C0273Fd;
import com.google.android.gms.internal.ads.C0315Oa;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0347Uc;
import com.google.android.gms.internal.ads.C0658gk;
import com.google.android.gms.internal.ads.C0759j0;
import com.google.android.gms.internal.ads.C0873lm;
import com.google.android.gms.internal.ads.C1134rq;
import com.google.android.gms.internal.ads.C1144s;
import com.google.android.gms.internal.ads.C1258ul;
import com.google.android.gms.internal.ads.C1316w;
import com.google.android.gms.internal.ads.C1434yp;
import com.google.android.gms.internal.ads.Cu;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.InterfaceC0351Vb;
import com.google.android.gms.internal.ads.InterfaceC0481ce;
import com.google.android.gms.internal.ads.InterfaceC0570ei;
import com.google.android.gms.internal.ads.InterfaceC0597f8;
import com.google.android.gms.internal.ads.InterfaceC0609fe;
import com.google.android.gms.internal.ads.InterfaceC0749iq;
import com.google.android.gms.internal.ads.InterfaceC1187t;
import com.google.android.gms.internal.ads.InterfaceC1283v9;
import com.google.android.gms.internal.ads.InterfaceC1399xx;
import com.google.android.gms.internal.ads.Kp;
import com.google.android.gms.internal.ads.M3;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.Og;
import com.google.android.gms.internal.ads.Pi;
import com.google.android.gms.internal.ads.Pp;
import com.google.android.gms.internal.ads.Px;
import com.google.android.gms.internal.ads.RunnableC0615fk;
import com.google.android.gms.internal.ads.RunnableC0744il;
import com.google.android.gms.internal.ads.Sr;
import com.google.android.gms.internal.ads.Y9;
import h0.C1694b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import m2.AbstractC1806a;
import n2.BinderC1813b;
import o1.InterfaceC1851a0;
import o1.InterfaceC1855c0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1510e1 implements InterfaceC1855c0, InterfaceC1851a0, InterfaceC1187t, com.google.android.gms.internal.ads.M2, S1.c, InterfaceC0351Vb, InterfaceC1399xx, InterfaceC0481ce, Mu, Cu, InterfaceC0749iq, InterfaceC0570ei {

    /* renamed from: r, reason: collision with root package name */
    public static C1510e1 f11912r;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11913o;

    /* renamed from: p, reason: collision with root package name */
    public Object f11914p;

    /* renamed from: q, reason: collision with root package name */
    public Object f11915q;

    public C1510e1(int i4) {
        this.f11913o = i4;
        switch (i4) {
            case 10:
                this.f11914p = new SparseIntArray();
                this.f11915q = new SparseIntArray();
                return;
            case 11:
                this.f11914p = new r.i(0);
                this.f11915q = new r.g();
                return;
            default:
                this.f11914p = null;
                this.f11915q = null;
                return;
        }
    }

    public /* synthetic */ C1510e1(int i4, Object obj, Object obj2) {
        this.f11913o = i4;
        this.f11914p = obj2;
        this.f11915q = obj;
    }

    public C1510e1(int i4, String str, ArrayList arrayList, byte[] bArr) {
        this.f11913o = 15;
        this.f11914p = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f11915q = bArr;
    }

    public C1510e1(Context context, int i4) {
        this.f11913o = i4;
        switch (i4) {
            case 16:
                this.f11914p = context;
                this.f11915q = null;
                return;
            default:
                this.f11914p = context;
                Y0 y02 = new Y0(null, 1);
                this.f11915q = y02;
                context.getContentResolver().registerContentObserver(Z0.f11859a, true, y02);
                return;
        }
    }

    public C1510e1(Uri uri) {
        this.f11913o = 7;
        this.f11915q = uri;
        Uri uri2 = F3.a.f742j;
        this.f11914p = uri2;
        Uri.Builder appendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String K2 = AbstractC1806a.K(uri.getPath());
        if (K2.length() > 0 && !"/".equals(K2)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(K2);
        }
        appendEncodedPath.build();
    }

    public /* synthetic */ C1510e1(Sr sr) {
        this.f11913o = 14;
        this.f11914p = sr;
        this.f11915q = new C1134rq();
    }

    public C1510e1(C0658gk c0658gk) {
        this.f11913o = 26;
        this.f11915q = c0658gk;
        this.f11914p = new ConcurrentHashMap();
    }

    public /* synthetic */ C1510e1(Object obj, Object obj2, int i4, boolean z4) {
        this.f11913o = i4;
        this.f11914p = obj;
        this.f11915q = obj2;
    }

    public static synchronized void D() {
        Context context;
        synchronized (C1510e1.class) {
            try {
                C1510e1 c1510e1 = f11912r;
                if (c1510e1 != null && (context = (Context) c1510e1.f11914p) != null && ((Y0) c1510e1.f11915q) != null) {
                    context.getContentResolver().unregisterContentObserver((Y0) f11912r.f11915q);
                }
                f11912r = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e4) {
            Log.w("SupportSQLite", "delete failed: ", e4);
        }
    }

    public static int n(int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i5 ? i7 + 1 : i7;
    }

    public static C1510e1 w() {
        byte b4 = 0;
        return new C1510e1(8, new C0347Uc(1, b4), new C0347Uc((int) b4, (byte) 0));
    }

    public static C1510e1 x(Context context) {
        C1510e1 c1510e1;
        synchronized (C1510e1.class) {
            try {
                if (f11912r == null) {
                    f11912r = com.google.android.gms.internal.play_billing.B.h(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1510e1(context, 0) : new C1510e1(0);
                }
                c1510e1 = f11912r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1510e1;
    }

    public void A(String str, String str2) {
        ((ConcurrentHashMap) this.f11914p).put(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r6.isUserRunning(android.os.Process.myUserHandle()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String B(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f11914p
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L9b
            android.os.UserManager r2 = com.google.android.gms.internal.measurement.AbstractC1490a1.f11875a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = 0
            if (r2 < r3) goto L68
            boolean r2 = com.google.android.gms.internal.measurement.AbstractC1490a1.f11876b
            if (r2 == 0) goto L15
            goto L68
        L15:
            java.lang.Class<com.google.android.gms.internal.measurement.a1> r2 = com.google.android.gms.internal.measurement.AbstractC1490a1.class
            monitor-enter(r2)
            boolean r3 = com.google.android.gms.internal.measurement.AbstractC1490a1.f11876b     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            goto L68
        L1e:
            r10 = move-exception
            goto L66
        L20:
            r3 = 1
            r5 = r3
        L22:
            r6 = 2
            if (r5 > r6) goto L4b
            android.os.UserManager r6 = com.google.android.gms.internal.measurement.AbstractC1490a1.f11875a     // Catch: java.lang.Throwable -> L1e
            if (r6 != 0) goto L33
            java.lang.Class<android.os.UserManager> r6 = android.os.UserManager.class
            java.lang.Object r6 = r0.getSystemService(r6)     // Catch: java.lang.Throwable -> L1e
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.measurement.AbstractC1490a1.f11875a = r6     // Catch: java.lang.Throwable -> L1e
        L33:
            android.os.UserManager r6 = com.google.android.gms.internal.measurement.AbstractC1490a1.f11875a     // Catch: java.lang.Throwable -> L1e
            if (r6 != 0) goto L39
            r0 = r3
            goto L5e
        L39:
            boolean r7 = D.g.y(r6)     // Catch: java.lang.Throwable -> L1e java.lang.NullPointerException -> L4d
            if (r7 != 0) goto L49
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L1e java.lang.NullPointerException -> L4d
            boolean r0 = r6.isUserRunning(r7)     // Catch: java.lang.Throwable -> L1e java.lang.NullPointerException -> L4d
            if (r0 != 0) goto L4b
        L49:
            r0 = r3
            goto L5a
        L4b:
            r0 = r4
            goto L5a
        L4d:
            r6 = move-exception
            java.lang.String r7 = "DirectBootUtils"
            java.lang.String r8 = "Failed to check if user is unlocked."
            android.util.Log.w(r7, r8, r6)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.measurement.AbstractC1490a1.f11875a = r1     // Catch: java.lang.Throwable -> L1e
            int r5 = r5 + 1
            goto L22
        L5a:
            if (r0 == 0) goto L5e
            com.google.android.gms.internal.measurement.AbstractC1490a1.f11875a = r1     // Catch: java.lang.Throwable -> L1e
        L5e:
            if (r0 == 0) goto L62
            com.google.android.gms.internal.measurement.AbstractC1490a1.f11876b = r3     // Catch: java.lang.Throwable -> L1e
        L62:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L68
            goto L9b
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r10
        L68:
            com.google.android.gms.internal.ads.Qw r0 = new com.google.android.gms.internal.ads.Qw     // Catch: java.lang.NullPointerException -> L81 java.lang.SecurityException -> L83 java.lang.IllegalStateException -> L85
            r2 = 7
            r0.<init>(r9, r10, r2, r4)     // Catch: java.lang.NullPointerException -> L81 java.lang.SecurityException -> L83 java.lang.IllegalStateException -> L85
            java.lang.Object r0 = r0.u()     // Catch: java.lang.SecurityException -> L73 java.lang.NullPointerException -> L81 java.lang.IllegalStateException -> L85
            goto L7e
        L73:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L81 java.lang.SecurityException -> L83 java.lang.IllegalStateException -> L85
            java.lang.Object r0 = r0.u()     // Catch: java.lang.Throwable -> L87
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L81 java.lang.SecurityException -> L83 java.lang.IllegalStateException -> L85
        L7e:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L81 java.lang.SecurityException -> L83 java.lang.IllegalStateException -> L85
            return r0
        L81:
            r0 = move-exception
            goto L8c
        L83:
            r0 = move-exception
            goto L8c
        L85:
            r0 = move-exception
            goto L8c
        L87:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L81 java.lang.SecurityException -> L83 java.lang.IllegalStateException -> L85
            throw r0     // Catch: java.lang.NullPointerException -> L81 java.lang.SecurityException -> L83 java.lang.IllegalStateException -> L85
        L8c:
            java.lang.String r2 = "GservicesLoader"
            java.lang.String r3 = "Unable to read GServices for: "
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r3.concat(r10)
            android.util.Log.e(r2, r10, r0)
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1510e1.B(java.lang.String):java.lang.String");
    }

    public void C(C1434yp c1434yp) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f11914p;
        concurrentHashMap.put("aai", c1434yp.f11540w);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.i6)).booleanValue()) {
            String str = c1434yp.f11525n0;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            concurrentHashMap.put("rid", str);
        }
    }

    public void E() {
        ((C0658gk) this.f11915q).f8858b.execute(new RunnableC0615fk(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        Pi pi = (Pi) this.f11914p;
        Map map = (Map) this.f11915q;
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        pi.f6594b.b(hashMap);
    }

    public void G(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", (String) this.f11915q);
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f11914p;
            if (interfaceC0308Md != null) {
                interfaceC0308Md.c("onError", put);
            }
        } catch (JSONException e4) {
            Y9.q("Error occurred while dispatching error event.", e4);
        }
    }

    public void H(int i4, int i5, int i6, int i7, float f4, int i8) {
        try {
            ((InterfaceC0308Md) this.f11914p).c("onScreenInfoChanged", new JSONObject().put("width", i4).put("height", i5).put("maxSizeWidth", i6).put("maxSizeHeight", i7).put("density", f4).put("rotation", i8));
        } catch (JSONException e4) {
            Y9.q("Error occurred while obtaining screen information.", e4);
        }
    }

    public void I(int i4, int i5, int i6, int i7) {
        try {
            ((InterfaceC0308Md) this.f11914p).c("onSizeChanged", new JSONObject().put("x", i4).put("y", i5).put("width", i6).put("height", i7));
        } catch (JSONException e4) {
            Y9.q("Error occurred while dispatching size change.", e4);
        }
    }

    public void J(String str) {
        try {
            ((InterfaceC0308Md) this.f11914p).c("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e4) {
            Y9.q("Error occurred while dispatching state change.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0351Vb
    public void a(InterfaceC0609fe interfaceC0609fe) {
        Activity activity = (Activity) this.f11914p;
        BinderC1813b binderC1813b = new BinderC1813b(activity);
        String str = (String) this.f11915q;
        String packageName = activity.getPackageName();
        BinderC0854l9 binderC0854l9 = (BinderC0854l9) interfaceC0609fe;
        binderC0854l9.getClass();
        Activity activity2 = (Activity) BinderC1813b.C2(binderC1813b);
        C1509e0 c1509e0 = (C1509e0) binderC0854l9.f9378o.f13386p;
        c1509e0.b(new S(c1509e0, activity2, str, packageName));
    }

    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b */
    public InterfaceFutureC0239a mo0b() {
        C0326Qb c0326Qb = (C0326Qb) this.f11914p;
        C0315Oa c0315Oa = (C0315Oa) this.f11915q;
        c0326Qb.getClass();
        long longValue = ((Long) O1.r.d.c.a(AbstractC1066q6.M9)).longValue();
        C1258ul c1258ul = (C1258ul) c0326Qb.f6661q;
        synchronized (c1258ul) {
            if (c1258ul.f10929p) {
                return Bs.o0(c1258ul.f10928o, longValue, TimeUnit.MILLISECONDS, c1258ul.f10934u);
            }
            c1258ul.f10929p = true;
            c1258ul.f10936w = c0315Oa;
            c1258ul.c();
            InterfaceFutureC0239a o02 = Bs.o0(c1258ul.f10928o, longValue, TimeUnit.MILLISECONDS, c1258ul.f10934u);
            o02.a(new RunnableC0744il(1, c1258ul), AbstractC0266Ec.f4900f);
            return o02;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399xx
    public Px b() {
        C0273Fd c0273Fd = (C0273Fd) this.f11914p;
        Px b4 = ((InterfaceC1399xx) this.f11915q).b();
        M3 m32 = new M3(21, c0273Fd);
        return new C0255Cd(c0273Fd.f5028o, b4, c0273Fd.f5021B, c0273Fd.f5022C, c0273Fd, m32);
    }

    @Override // com.google.android.gms.internal.ads.M2
    /* renamed from: b */
    public File mo2b() {
        if (((File) this.f11915q) == null) {
            this.f11915q = new File(((Context) this.f11914p).getCacheDir(), "volley");
        }
        return (File) this.f11915q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1187t
    public void c() {
        byte[] bArr = AbstractC0751is.f9074f;
        int length = bArr.length;
        ((C1134rq) this.f11915q).c(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1187t
    public C1144s d(com.google.android.gms.internal.ads.C c, long j4) {
        long d = c.d();
        int min = (int) Math.min(20000L, c.i() - d);
        C1134rq c1134rq = (C1134rq) this.f11915q;
        c1134rq.b(min);
        ((C1316w) c).E(c1134rq.f10536a, 0, min, false);
        int i4 = -1;
        int i5 = -1;
        long j5 = -9223372036854775807L;
        while (c1134rq.g() >= 4) {
            if (C0759j0.d(c1134rq.f10537b, c1134rq.f10536a) != 442) {
                c1134rq.f(1);
            } else {
                c1134rq.f(4);
                long a4 = com.google.android.gms.internal.ads.X1.a(c1134rq);
                if (a4 != -9223372036854775807L) {
                    long b4 = ((Sr) this.f11914p).b(a4);
                    if (b4 > j4) {
                        return j5 == -9223372036854775807L ? new C1144s(-1, b4, d) : new C1144s(0, -9223372036854775807L, d + i5);
                    }
                    if (b4 + 100000 > j4) {
                        return new C1144s(0, -9223372036854775807L, d + c1134rq.f10537b);
                    }
                    j5 = b4;
                    i5 = c1134rq.f10537b;
                }
                int i6 = c1134rq.c;
                if (c1134rq.g() >= 10) {
                    c1134rq.f(9);
                    int m4 = c1134rq.m() & 7;
                    if (c1134rq.g() >= m4) {
                        c1134rq.f(m4);
                        if (c1134rq.g() >= 4) {
                            if (C0759j0.d(c1134rq.f10537b, c1134rq.f10536a) == 443) {
                                c1134rq.f(4);
                                int q4 = c1134rq.q();
                                if (c1134rq.g() < q4) {
                                    c1134rq.e(i6);
                                } else {
                                    c1134rq.f(q4);
                                }
                            }
                            while (true) {
                                if (c1134rq.g() < 4) {
                                    break;
                                }
                                int d4 = C0759j0.d(c1134rq.f10537b, c1134rq.f10536a);
                                if (d4 == 442 || d4 == 441 || (d4 >>> 8) != 1) {
                                    break;
                                }
                                c1134rq.f(4);
                                if (c1134rq.g() < 2) {
                                    c1134rq.e(i6);
                                    break;
                                }
                                c1134rq.e(Math.min(c1134rq.c, c1134rq.f10537b + c1134rq.q()));
                            }
                        } else {
                            c1134rq.e(i6);
                        }
                    } else {
                        c1134rq.e(i6);
                    }
                } else {
                    c1134rq.e(i6);
                }
                i4 = c1134rq.f10537b;
            }
        }
        return j5 != -9223372036854775807L ? new C1144s(-2, j5, d + i4) : C1144s.d;
    }

    @Override // o1.InterfaceC1855c0
    public void e(int i4) {
        switch (this.f11913o) {
            case 2:
                C0.D d = (C0.D) this.f11915q;
                String.valueOf(n0.a.e(5));
                p1.i0 i0Var = (p1.i0) this.f11914p;
                d.f202i0.d(new G0.a(i0Var.f14549e0, i4, 1, i0Var.f13117A));
                d.a0();
                d.p0();
                return;
            default:
                p1.i0 i0Var2 = (p1.i0) this.f11914p;
                G0.a aVar = new G0.a(i0Var2.f14549e0, i4, 1, i0Var2.f13117A);
                D0.g gVar = (D0.g) this.f11915q;
                gVar.f566h0.d(aVar);
                gVar.Z();
                return;
        }
    }

    @Override // S1.c
    public void f(H1.a aVar) {
        switch (this.f11913o) {
            case 17:
                InterfaceC1283v9 interfaceC1283v9 = (InterfaceC1283v9) this.f11914p;
                try {
                    String canonicalName = ((S1.a) this.f11915q).getClass().getCanonicalName();
                    int i4 = aVar.f855p;
                    String str = (String) aVar.f856q;
                    Y9.m(canonicalName + "failed to load mediation ad: ErrorCode = " + i4 + ". ErrorMessage = " + str + ". ErrorDomain = " + ((String) aVar.f857r));
                    interfaceC1283v9.H1(aVar.a());
                    interfaceC1283v9.Z2(str, i4);
                    interfaceC1283v9.v(i4);
                    return;
                } catch (RemoteException e4) {
                    Y9.q("", e4);
                    return;
                }
            default:
                InterfaceC1283v9 interfaceC1283v92 = (InterfaceC1283v9) this.f11914p;
                try {
                    String canonicalName2 = ((G9) this.f11915q).f5136o.getClass().getCanonicalName();
                    int i5 = aVar.f855p;
                    String str2 = (String) aVar.f856q;
                    Y9.m(canonicalName2 + "failed to load mediation ad: ErrorCode = " + i5 + ". ErrorMessage = " + str2 + ". ErrorDomain = " + ((String) aVar.f857r));
                    interfaceC1283v92.H1(aVar.a());
                    interfaceC1283v92.Z2(str2, i5);
                    interfaceC1283v92.v(i5);
                    return;
                } catch (RemoteException e5) {
                    Y9.q("", e5);
                    return;
                }
        }
    }

    @Override // o1.InterfaceC1851a0
    public void g(m1.b bVar) {
        switch (this.f11913o) {
            case 3:
                C0.D d = (C0.D) this.f11915q;
                System.currentTimeMillis();
                d.h0(bVar);
                return;
            default:
                ((D0.g) this.f11915q).f0(bVar);
                return;
        }
    }

    @Override // o1.InterfaceC1851a0
    public void i() {
        switch (this.f11913o) {
            case 3:
                C0.D.R((C0.D) this.f11915q, (ArrayList) this.f11914p);
                return;
            default:
                D0.g.R((D0.g) this.f11915q, (ArrayList) this.f11914p);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
        Exception exc;
        Am am = (Am) this.f11914p;
        try {
            Object obj = ((C0873lm) this.f11915q).f9463b;
            ((Pp) obj).b(z4);
            if (((C0248Bc) am.d).f4086q < ((Integer) O1.r.d.c.a(AbstractC1066q6.f10304x0)).intValue()) {
                try {
                    ((Pp) obj).f6603a.d0();
                    return;
                } finally {
                }
            } else {
                try {
                    ((Pp) obj).f6603a.X0(new BinderC1813b(context));
                    return;
                } finally {
                }
            }
        } catch (Kp e4) {
            Y9.r("Cannot show interstitial.");
            throw new Exception(e4.getCause());
        }
        Y9.r("Cannot show interstitial.");
        throw new Exception(e4.getCause());
    }

    public void k(b0.c0 c0Var, C0034i c0034i) {
        r.i iVar = (r.i) this.f11914p;
        b0.o0 o0Var = (b0.o0) iVar.get(c0Var);
        if (o0Var == null) {
            o0Var = b0.o0.a();
            iVar.put(c0Var, o0Var);
        }
        o0Var.c = c0034i;
        o0Var.f3375a |= 8;
    }

    public void o() {
        ((SparseIntArray) this.f11914p).clear();
    }

    public void p(String str) {
        Y9.s("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        ((W1.a) this.f11915q).f1944b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", (String) this.f11914p, str), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071 A[EDGE_INSN: B:78:0x0071->B:62:0x0071 BREAK  A[LOOP:3: B:42:0x0022->B:63:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(h0.C1694b r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1510e1.q(h0.b, int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo4r(Object obj) {
        ((InterfaceC0308Md) obj).A0((String) this.f11914p, (InterfaceC0597f8) this.f11915q);
    }

    public C0034i s(b0.c0 c0Var, int i4) {
        b0.o0 o0Var;
        C0034i c0034i;
        r.i iVar = (r.i) this.f11914p;
        int d = iVar.d(c0Var);
        if (d >= 0 && (o0Var = (b0.o0) iVar.i(d)) != null) {
            int i5 = o0Var.f3375a;
            if ((i5 & i4) != 0) {
                int i6 = i5 & (~i4);
                o0Var.f3375a = i6;
                if (i4 == 4) {
                    c0034i = o0Var.f3376b;
                } else {
                    if (i4 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0034i = o0Var.c;
                }
                if ((i6 & 12) == 0) {
                    iVar.g(d);
                    o0Var.f3375a = 0;
                    o0Var.f3376b = null;
                    o0Var.c = null;
                    b0.o0.d.j(o0Var);
                }
                return c0034i;
            }
        }
        return null;
    }

    public void t(b0.c0 c0Var) {
        b0.o0 o0Var = (b0.o0) ((r.i) this.f11914p).get(c0Var);
        if (o0Var == null) {
            return;
        }
        o0Var.f3375a &= -2;
    }

    public void u(b0.c0 c0Var) {
        r.g gVar = (r.g) this.f11915q;
        int h4 = gVar.h() - 1;
        while (true) {
            if (h4 < 0) {
                break;
            }
            if (c0Var == gVar.i(h4)) {
                Object[] objArr = gVar.f14735q;
                Object obj = objArr[h4];
                Object obj2 = r.h.f14737a;
                if (obj != obj2) {
                    objArr[h4] = obj2;
                    gVar.f14733o = true;
                }
            } else {
                h4--;
            }
        }
        b0.o0 o0Var = (b0.o0) ((r.i) this.f11914p).remove(c0Var);
        if (o0Var != null) {
            o0Var.f3375a = 0;
            o0Var.f3376b = null;
            o0Var.c = null;
            b0.o0.d.j(o0Var);
        }
    }

    public void v(C1694b c1694b) {
        c1694b.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c1694b.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ff, code lost:
    
        com.google.android.gms.internal.ads.Y9.s("Received error HTTP response code: " + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
    
        throw new com.google.android.gms.internal.ads.Xk("Received error HTTP response code: " + r14, 1);
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.Fl l(com.google.android.gms.internal.ads.El r22) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1510e1.l(com.google.android.gms.internal.ads.El):com.google.android.gms.internal.ads.Fl");
    }
}
