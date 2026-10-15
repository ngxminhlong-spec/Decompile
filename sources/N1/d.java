package N1;

import O1.r;
import Q1.I;
import Q1.K;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC0598f9;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0260Dc;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0641g9;
import com.google.android.gms.internal.ads.C0727i9;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C0949nc;
import com.google.android.gms.internal.ads.C1016p;
import com.google.android.gms.internal.ads.C1188t0;
import com.google.android.gms.internal.ads.C1267uu;
import com.google.android.gms.internal.ads.C1316w;
import com.google.android.gms.internal.ads.D;
import com.google.android.gms.internal.ads.Fq;
import com.google.android.gms.internal.ads.InterfaceC0749iq;
import com.google.android.gms.internal.ads.N5;
import com.google.android.gms.internal.ads.O5;
import com.google.android.gms.internal.ads.P;
import com.google.android.gms.internal.ads.Sl;
import com.google.android.gms.internal.ads.V;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Zf;
import h2.y;
import java.util.ArrayList;
import l2.C1798a;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements C, D, InterfaceC0749iq {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1156o;

    /* renamed from: p, reason: collision with root package name */
    public long f1157p;

    /* renamed from: q, reason: collision with root package name */
    public Object f1158q;

    public d(int i4) {
        this.f1156o = i4;
        switch (i4) {
            case 5:
                this.f1158q = new ArrayList();
                return;
            case 6:
            default:
                this.f1157p = 0L;
                return;
            case 7:
                this.f1158q = null;
                this.f1157p = -1L;
                return;
        }
    }

    public /* synthetic */ d(int i4, boolean z4) {
        this.f1156o = i4;
    }

    public /* synthetic */ d(long j4, Object obj, int i4) {
        this.f1156o = i4;
        this.f1157p = j4;
        this.f1158q = obj;
    }

    public d(C c, long j4) {
        this.f1156o = 3;
        this.f1158q = c;
        Zf.O(c.d() >= j4);
        this.f1157p = j4;
    }

    public /* synthetic */ d(Object obj, long j4, int i4) {
        this.f1156o = i4;
        this.f1158q = obj;
        this.f1157p = j4;
    }

    public d(C1798a c1798a) {
        this.f1156o = 9;
        y.i(c1798a);
        this.f1158q = c1798a;
    }

    @Override // com.google.android.gms.internal.ads.C
    public void A(byte[] bArr, int i4, int i5) {
        ((C1316w) ((C) this.f1158q)).E(bArr, i4, i5, false);
    }

    @Override // com.google.android.gms.internal.ads.D
    public void B(P p3) {
        ((D) this.f1158q).B(new C1188t0(this, p3, p3));
    }

    @Override // com.google.android.gms.internal.ads.C
    public boolean C(byte[] bArr, int i4, int i5, boolean z4) {
        return ((C) this.f1158q).C(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.C
    public int D(byte[] bArr, int i4, int i5) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.C
    public boolean E(byte[] bArr, int i4, int i5, boolean z4) {
        return ((C) this.f1158q).E(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.C
    public long a() {
        return ((C) this.f1158q).a() - this.f1157p;
    }

    public void c(int i4) {
        if (i4 < 64) {
            this.f1157p &= ~(1 << i4);
            return;
        }
        d dVar = (d) this.f1158q;
        if (dVar != null) {
            dVar.c(i4 - 64);
        }
    }

    @Override // com.google.android.gms.internal.ads.C
    public long d() {
        return ((C) this.f1158q).d() - this.f1157p;
    }

    @Override // com.google.android.gms.internal.ads.C
    public int e() {
        throw null;
    }

    public int f(int i4) {
        d dVar = (d) this.f1158q;
        if (dVar == null) {
            return i4 >= 64 ? Long.bitCount(this.f1157p) : Long.bitCount(this.f1157p & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.f1157p & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f1157p) + dVar.f(i4 - 64);
    }

    public void g() {
        if (((d) this.f1158q) == null) {
            this.f1158q = new d(1);
        }
    }

    public boolean h(int i4) {
        if (i4 < 64) {
            return (this.f1157p & (1 << i4)) != 0;
        }
        g();
        return ((d) this.f1158q).h(i4 - 64);
    }

    @Override // com.google.android.gms.internal.ads.C
    public long i() {
        return ((C) this.f1158q).i() - this.f1157p;
    }

    @Override // com.google.android.gms.internal.ads.C
    public void j() {
        ((C) this.f1158q).j();
    }

    public void k(int i4, boolean z4) {
        if (i4 >= 64) {
            g();
            ((d) this.f1158q).k(i4 - 64, z4);
            return;
        }
        long j4 = this.f1157p;
        boolean z5 = (Long.MIN_VALUE & j4) != 0;
        long j5 = (1 << i4) - 1;
        this.f1157p = ((j4 & (~j5)) << 1) | (j4 & j5);
        if (z4) {
            p(i4);
        } else {
            c(i4);
        }
        if (z5 || ((d) this.f1158q) != null) {
            g();
            ((d) this.f1158q).k(0, z5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((K) ((Sl) this.f1158q).f5574a).q()) {
            return null;
        }
        long j4 = this.f1157p;
        N5 D4 = O5.D();
        D4.d();
        O5.O((O5) D4.f4561p, j4);
        byte[] e4 = ((O5) D4.b()).e();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        Zf.M(sQLiteDatabase, j4, e4);
        return null;
    }

    public boolean m(int i4) {
        if (i4 >= 64) {
            g();
            return ((d) this.f1158q).m(i4 - 64);
        }
        long j4 = 1 << i4;
        long j5 = this.f1157p;
        boolean z4 = (j5 & j4) != 0;
        long j6 = j5 & (~j4);
        this.f1157p = j6;
        long j7 = j4 - 1;
        this.f1157p = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
        d dVar = (d) this.f1158q;
        if (dVar != null) {
            if (dVar.h(0)) {
                p(63);
            }
            ((d) this.f1158q).m(0);
        }
        return z4;
    }

    public void n() {
        this.f1157p = 0L;
        d dVar = (d) this.f1158q;
        if (dVar != null) {
            dVar.n();
        }
    }

    public void p(int i4) {
        if (i4 < 64) {
            this.f1157p |= 1 << i4;
        } else {
            g();
            ((d) this.f1158q).p(i4 - 64);
        }
    }

    public void q(Context context, C0248Bc c0248Bc, boolean z4, C0949nc c0949nc, String str, String str2, Runnable runnable, Fq fq) {
        PackageInfo b4;
        n nVar = n.f1204A;
        C1798a c1798a = nVar.f1212j;
        C1798a c1798a2 = nVar.f1212j;
        c1798a.getClass();
        if (SystemClock.elapsedRealtime() - this.f1157p < 5000) {
            Y9.s("Not retrying to fetch app settings");
            return;
        }
        c1798a2.getClass();
        this.f1157p = SystemClock.elapsedRealtime();
        if (c0949nc != null && !TextUtils.isEmpty(c0949nc.f9735e)) {
            long j4 = c0949nc.f9736f;
            c1798a2.getClass();
            if (System.currentTimeMillis() - j4 <= ((Long) r.d.c.a(AbstractC1066q6.A3)).longValue() && c0949nc.f9738h) {
                return;
            }
        }
        if (context == null) {
            Y9.s("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            Y9.s("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f1158q = applicationContext;
        Aq f4 = Zf.f(context, 4);
        f4.f();
        C0641g9 B4 = nVar.f1218p.B((Context) this.f1158q, c0248Bc, fq);
        C1016p c1016p = AbstractC0598f9.f8690b;
        C0727i9 a4 = B4.a("google.afma.config.fetchAppSettings", c1016p, c1016p);
        int i4 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z4);
            jSONObject.put("pn", context.getPackageName());
            C0937n6 c0937n6 = AbstractC1066q6.f10197a;
            jSONObject.put("experiment_ids", TextUtils.join(",", r.d.f1379a.m()));
            jSONObject.put("js", c0248Bc.f4084o);
            try {
                ApplicationInfo applicationInfo = ((Context) this.f1158q).getApplicationInfo();
                if (applicationInfo != null && (b4 = m2.c.a(context).b(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", b4.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                I.w("Error fetching PackageInfo.");
            }
            InterfaceFutureC0239a a5 = a4.a(jSONObject);
            c cVar = new c(i4, fq, f4);
            C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
            C1267uu n02 = Bs.n0(a5, cVar, c0260Dc);
            if (runnable != null) {
                ((C0272Fc) a5).f5017o.a(runnable, c0260Dc);
            }
            AbstractC1230u.k(n02, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e4) {
            Y9.q("Error requesting application settings", e4);
            f4.d(e4);
            f4.b(false);
            fq.b(f4.l());
        }
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public int r(byte[] bArr, int i4, int i5) {
        return ((C) this.f1158q).r(bArr, i4, i5);
    }

    public void s(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f1158q) == null) {
            this.f1158q = exc;
            this.f1157p = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f1157p) {
            Exception exc2 = (Exception) this.f1158q;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = (Exception) this.f1158q;
            this.f1158q = null;
            throw exc3;
        }
    }

    public String toString() {
        switch (this.f1156o) {
            case 1:
                if (((d) this.f1158q) == null) {
                    return Long.toBinaryString(this.f1157p);
                }
                return ((d) this.f1158q).toString() + "xx" + Long.toBinaryString(this.f1157p);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.C
    public void v(int i4) {
        ((C1316w) ((C) this.f1158q)).c(i4, false);
    }

    @Override // com.google.android.gms.internal.ads.C
    public void w(int i4) {
        ((C1316w) ((C) this.f1158q)).f(i4);
    }

    @Override // com.google.android.gms.internal.ads.D
    public void x() {
        ((D) this.f1158q).x();
    }

    @Override // com.google.android.gms.internal.ads.C
    public void y(byte[] bArr, int i4, int i5) {
        ((C1316w) ((C) this.f1158q)).C(bArr, i4, i5, false);
    }

    @Override // com.google.android.gms.internal.ads.D
    public V z(int i4, int i5) {
        return ((D) this.f1158q).z(i4, i5);
    }
}
