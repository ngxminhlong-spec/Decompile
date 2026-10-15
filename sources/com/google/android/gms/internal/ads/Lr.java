package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.util.SparseArray;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lr implements InterfaceC0749iq {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f6169t = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6170o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f6171p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f6172q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f6173r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f6174s;

    public /* synthetic */ Lr(B0.q qVar, boolean z4, ArrayList arrayList, L5 l5, Q5 q5) {
        this.f6171p = qVar;
        this.f6170o = z4;
        this.f6172q = arrayList;
        this.f6173r = l5;
        this.f6174s = q5;
    }

    public Lr(Context context, int i4, Cr cr, boolean z4) {
        this.f6170o = false;
        this.f6171p = context;
        this.f6173r = Integer.toString(i4 - 1);
        this.f6172q = context.getSharedPreferences("pcvmspf", 0);
        this.f6174s = cr;
        this.f6170o = z4;
    }

    public static String d(C0978o4 c0978o4) {
        C1021p4 y = C1064q4.y();
        String D4 = c0978o4.w().D();
        y.d();
        C1064q4.E((C1064q4) y.f4561p, D4);
        String C4 = c0978o4.w().C();
        y.d();
        C1064q4.G((C1064q4) y.f4561p, C4);
        long v4 = c0978o4.w().v();
        y.d();
        C1064q4.I((C1064q4) y.f4561p, v4);
        long x4 = c0978o4.w().x();
        y.d();
        C1064q4.F((C1064q4) y.f4561p, x4);
        long w2 = c0978o4.w().w();
        y.d();
        C1064q4.H((C1064q4) y.f4561p, w2);
        return AbstractC1799b.b(((C1064q4) y.b()).e());
    }

    public boolean a(C0978o4 c0978o4) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f6169t) {
            try {
                if (!Zf.T(new File(c(c0978o4.w().D()), "pcbc"), c0978o4.x().h())) {
                    e(4020, currentTimeMillis);
                    return false;
                }
                String d = d(c0978o4);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f6172q).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f6173r)), d);
                boolean commit = edit.commit();
                if (commit) {
                    e(5015, currentTimeMillis);
                } else {
                    e(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(C0978o4 c0978o4, C1016p c1016p) {
        boolean z4;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f6169t) {
            try {
                C1064q4 f4 = f(1);
                String D4 = c0978o4.w().D();
                if (f4 != null && f4.D().equals(D4)) {
                    e(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File c = c(D4);
                if (c.exists()) {
                    ((Cr) this.f6174s).h(4023, currentTimeMillis2, "d:" + (true != c.isDirectory() ? "0" : "1") + ",f:" + (true != c.isFile() ? "0" : "1"));
                    e(4015, currentTimeMillis2);
                } else if (!c.mkdirs()) {
                    ((Cr) this.f6174s).h(4024, currentTimeMillis2, "cw:".concat(true != c.canWrite() ? "0" : "1"));
                    e(4015, currentTimeMillis2);
                    return false;
                }
                File c2 = c(D4);
                File file = new File(c2, "pcam.jar");
                File file2 = new File(c2, "pcbc");
                if (!Zf.T(file, c0978o4.y().h())) {
                    e(4016, currentTimeMillis);
                    return false;
                }
                if (!Zf.T(file2, c0978o4.x().h())) {
                    e(4017, currentTimeMillis);
                    return false;
                }
                if (c1016p != null) {
                    try {
                        z4 = C1475zn.a(file);
                    } catch (GeneralSecurityException unused) {
                        z4 = false;
                    }
                    if (!z4) {
                        e(4018, currentTimeMillis);
                        Zf.Q(c2);
                        return false;
                    }
                }
                String d = d(c0978o4);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = ((SharedPreferences) this.f6172q).getString("LATMTD".concat(String.valueOf((String) this.f6173r)), null);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f6172q).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f6173r)), d);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf((String) this.f6173r)), string);
                }
                if (!edit.commit()) {
                    e(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C1064q4 f5 = f(1);
                if (f5 != null) {
                    hashSet.add(f5.D());
                }
                C1064q4 f6 = f(2);
                if (f6 != null) {
                    hashSet.add(f6.D());
                }
                for (File file3 : new File(((Context) this.f6171p).getDir("pccache", 0), (String) this.f6173r).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        Zf.Q(file3);
                    }
                }
                e(5014, currentTimeMillis);
                return true;
            } finally {
            }
        }
    }

    public File c(String str) {
        return new File(new File(((Context) this.f6171p).getDir("pccache", 0), (String) this.f6173r), str);
    }

    public void e(int i4, long j4) {
        ((Cr) this.f6174s).d(i4, j4);
    }

    public C1064q4 f(int i4) {
        String str = (String) this.f6173r;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f6172q;
        String string = i4 == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] k3 = AbstractC1799b.k(string);
                return C1064q4.B(AbstractC0886lz.A(k3, 0, k3.length), this.f6170o ? C1315vz.f11096b : C1315vz.a());
            } catch (Oz unused) {
            } catch (NullPointerException unused2) {
                e(2029, currentTimeMillis);
            } catch (RuntimeException unused3) {
                e(2032, currentTimeMillis);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        long j4;
        B0.q qVar = (B0.q) this.f6171p;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((Q1.K) ((Tl) qVar.f111p).f5574a).q()) {
            return null;
        }
        Q5 q5 = (Q5) this.f6174s;
        L5 l5 = (L5) this.f6173r;
        ArrayList arrayList = (ArrayList) this.f6172q;
        boolean z4 = this.f6170o;
        Tl tl = (Tl) qVar.f111p;
        SparseArray sparseArray = Tl.f7071h;
        N5 D4 = O5.D();
        D4.d();
        O5.K((O5) D4.f4561p, arrayList);
        int i4 = Settings.Global.getInt(tl.c.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        D4.d();
        O5.v((O5) D4.f4561p, i4);
        N1.n nVar = N1.n.f1204A;
        int f4 = nVar.f1207e.f(tl.c, tl.f7072e);
        D4.d();
        O5.w((O5) D4.f4561p, f4);
        Rl rl = tl.f7073f;
        synchronized (rl.f6838h) {
            j4 = rl.c;
        }
        D4.d();
        O5.I((O5) D4.f4561p, j4);
        long b4 = tl.f7073f.b();
        D4.d();
        O5.J((O5) D4.f4561p, b4);
        int a4 = tl.f7073f.a();
        D4.d();
        O5.M((O5) D4.f4561p, a4);
        D4.d();
        O5.N((O5) D4.f4561p, q5);
        D4.d();
        O5.L((O5) D4.f4561p, l5);
        int i5 = tl.f7074g;
        D4.d();
        O5.x((O5) D4.f4561p, i5);
        int i6 = z4 ? 2 : 1;
        D4.d();
        O5.U((O5) D4.f4561p, i6);
        long d = tl.f7073f.d();
        D4.d();
        O5.O((O5) D4.f4561p, d);
        nVar.f1212j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        D4.d();
        O5.H((O5) D4.f4561p, currentTimeMillis);
        int i7 = Settings.Global.getInt(tl.c.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        D4.d();
        O5.V((O5) D4.f4561p, i7);
        byte[] e4 = ((O5) D4.b()).e();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z4) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        Zf.M(sQLiteDatabase, ((Tl) qVar.f111p).f7073f.d(), e4);
        return null;
    }
}
