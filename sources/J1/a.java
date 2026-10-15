package J1;

import A2.o;
import H1.e;
import R1.b;
import W1.h;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.C0247Bb;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C0281Hb;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0405an;
import com.google.android.gms.internal.ads.C0424b5;
import com.google.android.gms.internal.ads.C0466c5;
import com.google.android.gms.internal.ads.C0509d5;
import com.google.android.gms.internal.ads.C0551e5;
import com.google.android.gms.internal.ads.C0567ef;
import com.google.android.gms.internal.ads.C0572ek;
import com.google.android.gms.internal.ads.C0594f5;
import com.google.android.gms.internal.ads.C0637g5;
import com.google.android.gms.internal.ads.C0680h5;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0873lm;
import com.google.android.gms.internal.ads.C1434yp;
import com.google.android.gms.internal.ads.Ep;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.Op;
import com.google.android.gms.internal.ads.Oq;
import com.google.android.gms.internal.ads.Rk;
import com.google.android.gms.internal.ads.Y4;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import e2.f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k.C1748e;
import k.C1749f;
import k.g;
import k.m;
import k.p;
import n0.n;
import t2.N;
import w0.i;
import x0.q;
import x2.C2066c0;
import x2.C2096s;
import x2.C2103v0;
import x2.D;
import x2.J0;
import x2.K;
import x2.b1;
import y0.j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f955o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f956p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f957q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f958r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f959s;

    public /* synthetic */ a(Op op, Throwable th, Oq oq, String str) {
        this.f955o = 8;
        this.f956p = op;
        this.f958r = th;
        this.f959s = oq;
        this.f957q = str;
    }

    public /* synthetic */ a(C0828kk c0828kk, C0572ek c0572ek, String str, Pair[] pairArr) {
        this.f955o = 3;
        this.f956p = c0828kk;
        this.f958r = c0572ek;
        this.f957q = str;
        this.f959s = pairArr;
    }

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, J j4, C2096s c2096s, String str) {
        this.f955o = 13;
        this.f959s = appMeasurementDynamiteService;
        this.f956p = j4;
        this.f958r = c2096s;
        this.f957q = str;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f955o = i4;
        this.f956p = obj;
        this.f957q = obj2;
        this.f958r = obj3;
        this.f959s = obj4;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i4, boolean z4) {
        this.f955o = i4;
        this.f959s = obj;
        this.f956p = obj2;
        this.f957q = obj3;
        this.f958r = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        C0424b5 c0424b5;
        i h4;
        int i4 = this.f955o;
        byte[] bArr = null;
        Object obj = this.f958r;
        Object obj2 = this.f957q;
        Object obj3 = this.f956p;
        Object obj4 = this.f959s;
        switch (i4) {
            case 0:
                Context context = (Context) obj3;
                try {
                    new Y4(context, (String) obj2, ((e) obj).f863a, (Rk) obj4).a();
                    return;
                } catch (IllegalStateException e4) {
                    C0275Ga.b(context).g("AppOpenAd.load", e4);
                    return;
                }
            case 1:
                Context context2 = (Context) obj3;
                try {
                    new H8(context2, (String) obj2).c(((e) obj).f863a, (b) obj4);
                    return;
                } catch (IllegalStateException e5) {
                    C0275Ga.b(context2).g("InterstitialAd.load", e5);
                    return;
                }
            case 2:
                h hVar = (h) obj3;
                C0572ek c0572ek = (C0572ek) obj2;
                hVar.d(c0572ek, (ArrayDeque) obj, "to");
                hVar.d(c0572ek, (ArrayDeque) obj4, "of");
                return;
            case 3:
                C0828kk c0828kk = (C0828kk) obj3;
                C0572ek c0572ek2 = (C0572ek) obj;
                String str = (String) obj2;
                Pair[] pairArr = (Pair[]) obj4;
                if (c0572ek2 == null) {
                    c0828kk.getClass();
                    concurrentHashMap = new ConcurrentHashMap(c0828kk.f9308a);
                } else {
                    concurrentHashMap = c0572ek2.f8633a;
                }
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str)) {
                    concurrentHashMap.put("action", str);
                }
                for (Pair pair : pairArr) {
                    String str2 = (String) pair.first;
                    String str3 = (String) pair.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMap.put(str2, str3);
                    }
                }
                c0828kk.a(concurrentHashMap, false);
                return;
            case 4:
                ((W1.b) obj3).f1953A.a((String) obj2, (String) obj, (C0572ek) obj4);
                return;
            case 5:
                Context context3 = (Context) obj3;
                try {
                    new C0247Bb(context3, (String) obj2).b(((e) obj).f863a, (Rk) obj4);
                    return;
                } catch (IllegalStateException e6) {
                    C0275Ga.b(context3).g("RewardedAd.load", e6);
                    return;
                }
            case 6:
                Context context4 = (Context) obj3;
                try {
                    new C0281Hb(context4, (String) obj2).b(((e) obj).f863a, (Rk) obj4);
                    return;
                } catch (IllegalStateException e7) {
                    C0275Ga.b(context4).g("RewardedInterstitialAd.load", e7);
                    return;
                }
            case 7:
                Op op = (Op) obj3;
                o oVar = (o) op.f6527r;
                C0466c5 c0466c5 = (C0466c5) obj2;
                C0594f5 c0594f5 = (C0594f5) obj4;
                try {
                    C0551e5 c0551e5 = (C0551e5) c0466c5.t();
                    C0509d5 c0509d5 = (C0509d5) obj;
                    if (c0466c5.A()) {
                        Parcel Q3 = c0551e5.Q();
                        AbstractC1192t4.c(Q3, c0509d5);
                        Parcel q12 = c0551e5.q1(Q3, 2);
                        c0424b5 = (C0424b5) AbstractC1192t4.a(q12, C0424b5.CREATOR);
                        q12.recycle();
                    } else {
                        Parcel Q4 = c0551e5.Q();
                        AbstractC1192t4.c(Q4, c0509d5);
                        Parcel q13 = c0551e5.q1(Q4, 1);
                        c0424b5 = (C0424b5) AbstractC1192t4.a(q13, C0424b5.CREATOR);
                        q13.recycle();
                    }
                    if (!c0424b5.k()) {
                        c0594f5.c(new RuntimeException("No entry contents."));
                        o.n(oVar);
                        return;
                    }
                    C0637g5 c0637g5 = new C0637g5(op, c0424b5.i());
                    int read = c0637g5.read();
                    if (read == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    c0637g5.unread(read);
                    c0594f5.b(new C0680h5(c0637g5, c0424b5.j(), c0424b5.n(), c0424b5.h(), c0424b5.l()));
                    return;
                } catch (RemoteException e8) {
                    e = e8;
                    Y9.q("Unable to obtain a cache service instance.", e);
                    c0594f5.c(e);
                    o.n(oVar);
                    return;
                } catch (IOException e9) {
                    e = e9;
                    Y9.q("Unable to obtain a cache service instance.", e);
                    c0594f5.c(e);
                    o.n(oVar);
                    return;
                }
            case 8:
                C0567ef c0567ef = (C0567ef) ((Op) obj3).f6527r;
                c0567ef.f8628h = C0275Ga.b(c0567ef.f8623a);
                c0567ef.f8628h.g("AttributionReporting.registerSourceAndPingClickUrl", (Throwable) obj);
                ((Oq) obj4).a((String) obj2, null);
                return;
            case 9:
                Object obj5 = ((C0326Qb) obj3).f6662r;
                C0405an.c((Ep) obj2, (C1434yp) obj, (C0873lm) obj4);
                return;
            case 10:
                g gVar = (g) ((C1748e) obj4).f13386p;
                p pVar = (p) obj2;
                C1749f c1749f = (C1749f) obj3;
                if (c1749f != null) {
                    gVar.N = true;
                    c1749f.f13388b.c(false);
                    gVar.N = false;
                }
                if (pVar.isEnabled() && pVar.hasSubMenu()) {
                    ((m) obj).q(pVar, null, 4);
                    return;
                }
                return;
            case 11:
                j jVar = (j) obj;
                UUID uuid = (UUID) obj3;
                String uuid2 = uuid.toString();
                n d = n.d();
                String str4 = q.c;
                n0.g gVar2 = (n0.g) obj2;
                d.a(str4, "Updating progress for " + uuid + " (" + gVar2 + ")", new Throwable[0]);
                q qVar = (q) obj4;
                WorkDatabase workDatabase = qVar.f15240a;
                WorkDatabase workDatabase2 = qVar.f15240a;
                workDatabase.c();
                try {
                    h4 = workDatabase2.n().h(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h4 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (h4.f15116b == 2) {
                    w0.g gVar3 = new w0.g(uuid2, gVar2);
                    u0.g m4 = workDatabase2.m();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m4.f14983p;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((w0.b) m4.f14984q).e(gVar3);
                        workDatabase_Impl.h();
                        workDatabase_Impl.f();
                    } catch (Throwable th) {
                        workDatabase_Impl.f();
                        throw th;
                    }
                } else {
                    n.d().i(str4, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.", new Throwable[0]);
                }
                jVar.i(null);
                workDatabase2.h();
                return;
            case 12:
                J0 q4 = ((C2066c0) ((C2103v0) obj4).f1719a).q();
                q4.g();
                q4.e();
                q4.r(new N(q4, (AtomicReference) obj3, (String) obj2, (String) obj, q4.o(false), 2));
                return;
            case 13:
                J0 q5 = ((AppMeasurementDynamiteService) obj4).f12272o.q();
                J j4 = (J) obj3;
                C2096s c2096s = (C2096s) obj;
                String str5 = (String) obj2;
                q5.g();
                q5.e();
                C2066c0 c2066c0 = (C2066c0) q5.f1719a;
                b1 b1Var = c2066c0.f15571l;
                C2066c0.g(b1Var);
                if (f.f12753b.c(((C2066c0) b1Var.f1719a).f15562a, 12451000) == 0) {
                    q5.r(new a(q5, c2096s, str5, j4, 14, false));
                    return;
                }
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15397i.a("Not bundling data. Service unavailable or out of date");
                b1 b1Var2 = c2066c0.f15571l;
                C2066c0.g(b1Var2);
                b1Var2.C(j4, new byte[0]);
                return;
            case 14:
                J j5 = (J) obj;
                J0 j02 = (J0) obj4;
                C2066c0 c2066c02 = (C2066c0) j02.f1719a;
                try {
                    D d4 = j02.d;
                    if (d4 == null) {
                        K k4 = c2066c02.f15568i;
                        C2066c0.i(k4);
                        k4.f15394f.a("Discarding data. Failed to send event to service to bundle");
                    } else {
                        bArr = d4.e1((C2096s) obj3, (String) obj2);
                        j02.q();
                        b1 b1Var3 = c2066c02.f15571l;
                        C2066c0.g(b1Var3);
                        b1Var3.C(j5, bArr);
                    }
                    return;
                } catch (RemoteException e10) {
                    K k5 = c2066c02.f15568i;
                    C2066c0.i(k5);
                    k5.f15394f.b(e10, "Failed to send event to the service to bundle");
                    return;
                } finally {
                    b1 b1Var4 = c2066c02.f15571l;
                    C2066c0.g(b1Var4);
                    b1Var4.C(j5, bArr);
                }
            default:
                J0 q6 = ((AppMeasurementDynamiteService) obj4).f12272o.q();
                q6.g();
                q6.e();
                q6.r(new N(q6, (String) obj2, (String) obj, q6.o(false), (J) obj3, 3));
                return;
        }
    }
}
