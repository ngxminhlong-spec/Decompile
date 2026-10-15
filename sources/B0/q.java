package B0;

import Q1.K;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0381a5;
import com.google.android.gms.internal.ads.C0764j5;
import com.google.android.gms.internal.ads.C1220tq;
import com.google.android.gms.internal.ads.C1481zt;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.G5;
import com.google.android.gms.internal.ads.InterfaceC0749iq;
import com.google.android.gms.internal.ads.InterfaceC1263uq;
import com.google.android.gms.internal.ads.L5;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.O5;
import com.google.android.gms.internal.ads.P5;
import com.google.android.gms.internal.ads.Q0;
import com.google.android.gms.internal.ads.R5;
import com.google.android.gms.internal.ads.X5;
import com.google.android.gms.internal.ads.Xj;
import com.google.android.gms.internal.ads.Y5;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Zf;
import com.google.android.gms.internal.measurement.C1535j1;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.P0;
import java.io.Serializable;
import java.util.ArrayList;
import m2.AbstractC1806a;
import p1.f0;
import t1.C1990a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q implements b1.e, Mu, InterfaceC0749iq {

    /* renamed from: o, reason: collision with root package name */
    public boolean f110o;

    /* renamed from: p, reason: collision with root package name */
    public Object f111p;

    public q() {
        this.f111p = new SparseBooleanArray();
    }

    public q(F.f fVar, boolean z4) {
        this.f111p = fVar;
        this.f110o = z4;
    }

    public q(Uri uri, boolean z4, boolean z5) {
        this.f111p = uri;
        this.f110o = z4;
    }

    public /* synthetic */ q(Object obj, boolean z4) {
        this.f111p = obj;
        this.f110o = z4;
    }

    public static q c(Object obj) {
        return new q(obj, false);
    }

    public static q d(Serializable serializable) {
        return new q((Object) serializable, true);
    }

    public boolean a() {
        return this.f110o;
    }

    public boolean b(CharSequence charSequence, int i4) {
        if (charSequence == null || i4 < 0 || charSequence.length() - i4 < 0) {
            throw new IllegalArgumentException();
        }
        F.f fVar = (F.f) this.f111p;
        if (fVar == null) {
            return a();
        }
        fVar.getClass();
        char c = 2;
        for (int i5 = 0; i5 < i4 && c == 2; i5++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i5));
            q qVar = F.g.f737a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return a();
        }
        return false;
    }

    public void e(int i4) {
        Zf.X(!this.f110o);
        ((SparseBooleanArray) this.f111p).append(i4, true);
    }

    public void f(P0 p02) {
        if (this.f110o) {
            AbstractC1629o.e("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((t3.g) this.f111p).g(new C1990a(p02));
        } catch (Throwable unused) {
            AbstractC1629o.e("BillingLogger", "logging failed.");
        }
    }

    public Q0 g() {
        Zf.X(!this.f110o);
        this.f110o = true;
        return new Q0((SparseBooleanArray) this.f111p);
    }

    public C1535j1 h(String str, long j4) {
        return new C1535j1(this, str, Long.valueOf(j4), 0);
    }

    public C1535j1 i(String str, String str2) {
        return new C1535j1(this, str, str2, 3);
    }

    @Override // b1.e
    public void j(Canvas canvas) {
        f0 f0Var = (f0) this.f111p;
        float G3 = f0Var.G();
        int i4 = (int) (0.28f * G3);
        int F2 = (int) (f0Var.F() * 0.2f);
        boolean z4 = this.f110o;
        if (z4) {
            i4 = (int) (G3 - i4);
        }
        canvas.translate(i4, F2);
        AbstractC1806a.j(canvas, f0Var, z4);
        canvas.translate(-i4, -F2);
    }

    public C1535j1 k(String str, boolean z4) {
        return new C1535j1(this, str, Boolean.valueOf(z4), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        C0381a5 c0381a5 = (C0381a5) this.f111p;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f110o) {
            ((Context) c0381a5.f8076o).deleteDatabase("OfflineUpload.db");
            return null;
        }
        long j4 = 0;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue()) {
            C1220tq b4 = C1220tq.b("oa_upload");
            b4.a("oa_failed_reqs", String.valueOf(Zf.a(sQLiteDatabase, 0)));
            b4.a("oa_total_reqs", String.valueOf(Zf.a(sQLiteDatabase, 1)));
            N1.n.f1204A.f1212j.getClass();
            b4.a("oa_upload_time", String.valueOf(System.currentTimeMillis()));
            Cursor a02 = Zf.a0(sQLiteDatabase, 2);
            if (a02.getCount() > 0) {
                a02.moveToNext();
                j4 = a02.getLong(a02.getColumnIndexOrThrow("value"));
            }
            a02.close();
            b4.a("oa_last_successful_time", String.valueOf(j4));
            b4.a("oa_session_id", ((K) c0381a5.f8081t).q() ? "" : (String) c0381a5.f8079r);
            ((InterfaceC1263uq) c0381a5.f8080s).b(b4);
            ArrayList H3 = Zf.H(sQLiteDatabase);
            C0381a5.m(sQLiteDatabase, H3);
            int size = H3.size();
            for (int i4 = 0; i4 < size; i4++) {
                O5 o5 = (O5) H3.get(i4);
                K k3 = (K) c0381a5.f8081t;
                C1220tq b5 = C1220tq.b("oa_signals");
                b5.a("oa_session_id", k3.q() ? "" : (String) c0381a5.f8079r);
                L5 C4 = o5.C();
                String valueOf = C4.y() ? String.valueOf(C4.A() - 1) : "-1";
                String obj2 = new C1481zt(o5.G()).toString();
                b5.a("oa_sig_ts", String.valueOf(o5.B()));
                b5.a("oa_sig_status", String.valueOf(o5.S() - 1));
                b5.a("oa_sig_resp_lat", String.valueOf(o5.A()));
                b5.a("oa_sig_render_lat", String.valueOf(o5.z()));
                b5.a("oa_sig_formats", obj2);
                b5.a("oa_sig_nw_type", valueOf);
                b5.a("oa_sig_wifi", String.valueOf(o5.T() - 1));
                b5.a("oa_sig_airplane", String.valueOf(o5.P() - 1));
                b5.a("oa_sig_data", String.valueOf(o5.Q() - 1));
                b5.a("oa_sig_nw_resp", String.valueOf(o5.y()));
                b5.a("oa_sig_offline", String.valueOf(o5.R() - 1));
                b5.a("oa_sig_nw_state", String.valueOf(o5.F().f6645o));
                if (C4.x() && C4.y() && C4.A() == 2) {
                    b5.a("oa_sig_cell_type", String.valueOf(C4.z() - 1));
                }
                ((InterfaceC1263uq) c0381a5.f8080s).b(b5);
            }
        } else {
            ArrayList H4 = Zf.H(sQLiteDatabase);
            Context context = (Context) c0381a5.f8076o;
            P5 v4 = R5.v();
            String packageName = context.getPackageName();
            v4.d();
            R5.A((R5) v4.f4561p, packageName);
            String str = Build.MODEL;
            v4.d();
            R5.B((R5) v4.f4561p);
            int a4 = Zf.a(sQLiteDatabase, 0);
            v4.d();
            R5.x((R5) v4.f4561p, a4);
            v4.d();
            R5.w((R5) v4.f4561p, H4);
            int a5 = Zf.a(sQLiteDatabase, 1);
            v4.d();
            R5.y((R5) v4.f4561p, a5);
            int a6 = Zf.a(sQLiteDatabase, 3);
            v4.d();
            R5.D((R5) v4.f4561p, a6);
            N1.n.f1204A.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            v4.d();
            R5.z((R5) v4.f4561p, currentTimeMillis);
            Cursor a03 = Zf.a0(sQLiteDatabase, 2);
            if (a03.getCount() > 0) {
                a03.moveToNext();
                j4 = a03.getLong(a03.getColumnIndexOrThrow("value"));
            }
            a03.close();
            v4.d();
            R5.C((R5) v4.f4561p, j4);
            R5 r5 = (R5) v4.b();
            C0381a5.m(sQLiteDatabase, H4);
            C0764j5 c0764j5 = (C0764j5) c0381a5.f8077p;
            synchronized (c0764j5) {
                if (c0764j5.c) {
                    try {
                        F5 f5 = c0764j5.f9124b;
                        f5.d();
                        G5.E((G5) f5.f4561p, r5);
                    } catch (NullPointerException e4) {
                        N1.n.f1204A.f1209g.h("AdMobClearcutLogger.modify", e4);
                    }
                }
            }
            C0248Bc c0248Bc = (C0248Bc) c0381a5.f8078q;
            X5 v5 = Y5.v();
            int i5 = c0248Bc.f4085p;
            v5.d();
            Y5.w((Y5) v5.f4561p, i5);
            int i6 = ((C0248Bc) c0381a5.f8078q).f4086q;
            v5.d();
            Y5.x((Y5) v5.f4561p, i6);
            int i7 = true == ((C0248Bc) c0381a5.f8078q).f4087r ? 0 : 2;
            v5.d();
            Y5.y((Y5) v5.f4561p, i7);
            ((C0764j5) c0381a5.f8077p).a(new Xj(5, (Y5) v5.b()));
            ((C0764j5) c0381a5.f8077p).b(10004);
        }
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        Zf.e0(sQLiteDatabase, "failed_requests");
        Zf.e0(sQLiteDatabase, "total_requests");
        Zf.e0(sQLiteDatabase, "completed_requests");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4r(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.q.mo4r(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        Y9.p("Failed to get signals bundle");
    }
}
