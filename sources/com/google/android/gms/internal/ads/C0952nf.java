package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0051a;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952nf implements Ig, Yg, Sg, InterfaceC0051a, Pg, Oh {

    /* renamed from: A, reason: collision with root package name */
    public final Op f9744A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9745B;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicBoolean f9746C = new AtomicBoolean();

    /* renamed from: o, reason: collision with root package name */
    public final Context f9747o;

    /* renamed from: p, reason: collision with root package name */
    public final Executor f9748p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f9749q;

    /* renamed from: r, reason: collision with root package name */
    public final ScheduledExecutorService f9750r;

    /* renamed from: s, reason: collision with root package name */
    public final Ep f9751s;

    /* renamed from: t, reason: collision with root package name */
    public final C1434yp f9752t;

    /* renamed from: u, reason: collision with root package name */
    public final Nq f9753u;

    /* renamed from: v, reason: collision with root package name */
    public final Lp f9754v;

    /* renamed from: w, reason: collision with root package name */
    public final I3 f9755w;

    /* renamed from: x, reason: collision with root package name */
    public final A6 f9756x;
    public final WeakReference y;

    /* renamed from: z, reason: collision with root package name */
    public final WeakReference f9757z;

    public C0952nf(Context context, C0260Dc c0260Dc, Executor executor, ScheduledExecutorService scheduledExecutorService, Ep ep, C1434yp c1434yp, Nq nq, Lp lp, View view, InterfaceC0308Md interfaceC0308Md, I3 i32, A6 a6, Op op) {
        this.f9747o = context;
        this.f9748p = c0260Dc;
        this.f9749q = executor;
        this.f9750r = scheduledExecutorService;
        this.f9751s = ep;
        this.f9752t = c1434yp;
        this.f9753u = nq;
        this.f9754v = lp;
        this.f9755w = i32;
        this.y = new WeakReference(view);
        this.f9757z = new WeakReference(interfaceC0308Md);
        this.f9756x = a6;
        this.f9744A = op;
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10230h0)).booleanValue();
        Ep ep = this.f9751s;
        if ((booleanValue && ((Ap) ep.f4943b.f6526q).f4001g) || !((Boolean) M6.d.r()).booleanValue()) {
            C1434yp c1434yp = this.f9752t;
            this.f9754v.c(true == N1.n.f1204A.f1209g.j(this.f9747o) ? 2 : 1, this.f9753u.a(ep, c1434yp, c1434yp.c));
        } else {
            A6 a6 = this.f9756x;
            a6.getClass();
            C0539du Z4 = Bs.Z(Ku.q((Ku) Bs.o0(Ku.q(Pu.f6608p), ((Long) M6.c.r()).longValue(), TimeUnit.MILLISECONDS, a6.c)), Throwable.class, C0932n1.f9695e, AbstractC0266Ec.f4900f);
            Z4.a(new Nu(0, Z4, new M3(23, this)), this.f9748p);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final synchronized void M() {
        Op op;
        try {
            if (this.f9745B) {
                ArrayList arrayList = new ArrayList(this.f9752t.d);
                arrayList.addAll(this.f9752t.f11508f);
                this.f9754v.a(this.f9753u.b(this.f9751s, this.f9752t, true, null, null, arrayList));
            } else {
                Lp lp = this.f9754v;
                Nq nq = this.f9753u;
                Ep ep = this.f9751s;
                C1434yp c1434yp = this.f9752t;
                lp.a(nq.a(ep, c1434yp, c1434yp.f11522m));
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10201a3)).booleanValue() && (op = this.f9744A) != null) {
                    List list = ((C1434yp) op.f6526q).f11522m;
                    String c = ((Um) op.f6527r).c();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Nq.c((String) it.next(), "@gw_adnetstatus@", c));
                    }
                    long a4 = ((Um) this.f9744A.f6527r).a();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        arrayList3.add(Nq.c((String) obj, "@gw_ttr@", Long.toString(a4, 10)));
                    }
                    Lp lp2 = this.f9754v;
                    Nq nq2 = this.f9753u;
                    Op op2 = this.f9744A;
                    lp2.a(nq2.a((Ep) op2.f6525p, (C1434yp) op2.f6526q, arrayList3));
                }
                Lp lp3 = this.f9754v;
                Nq nq3 = this.f9753u;
                Ep ep2 = this.f9751s;
                C1434yp c1434yp2 = this.f9752t;
                lp3.a(nq3.a(ep2, c1434yp2, c1434yp2.f11508f));
            }
            this.f9745B = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void a() {
        C1434yp c1434yp = this.f9752t;
        this.f9754v.a(this.f9753u.a(this.f9751s, c1434yp, c1434yp.f11514i));
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void d() {
        C1434yp c1434yp = this.f9752t;
        this.f9754v.a(this.f9753u.a(this.f9751s, c1434yp, c1434yp.f11510g));
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void e() {
    }

    public final void l() {
        int i4;
        List list;
        C0937n6 c0937n6 = AbstractC1066q6.P9;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue();
        C1434yp c1434yp = this.f9752t;
        if (booleanValue && ((list = c1434yp.d) == null || list.isEmpty())) {
            return;
        }
        String d = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10177V2)).booleanValue() ? this.f9755w.f5531b.d(this.f9747o, (View) this.y.get(), null) : null;
        if ((((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10230h0)).booleanValue() && ((Ap) this.f9751s.f4943b.f6526q).f4001g) || !((Boolean) M6.f6217h.r()).booleanValue()) {
            this.f9754v.a(this.f9753u.b(this.f9751s, c1434yp, false, d, null, c1434yp.d));
            return;
        }
        if (((Boolean) M6.f6216g.r()).booleanValue() && ((i4 = c1434yp.f11502b) == 1 || i4 == 2 || i4 == 5)) {
        }
        Ku ku = (Ku) Bs.o0(Ku.q(Pu.f6608p), ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10124K0)).longValue(), TimeUnit.MILLISECONDS, this.f9750r);
        ku.a(new Nu(0, ku, new C0258Da(this, d, 18, false)), this.f9748p);
    }

    public final void o(int i4, int i5) {
        View view;
        if (i4 <= 0 || !((view = (View) this.y.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            l();
        } else {
            this.f9750r.schedule(new RunnableC0866lf(this, i4, i5, 1), i5, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        if (this.f9746C.compareAndSet(false, true)) {
            C0937n6 c0937n6 = AbstractC1066q6.f10218e3;
            O1.r rVar = O1.r.d;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
            int intValue = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).intValue();
            if (intValue > 0) {
                o(intValue, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10223f3)).intValue());
            } else if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10213d3)).booleanValue()) {
                l();
            } else {
                this.f9749q.execute(new RunnableC0823kf(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Pg
    public final void r(C0101z0 c0101z0) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10236i1)).booleanValue()) {
            int i4 = c0101z0.f1405o;
            C1434yp c1434yp = this.f9752t;
            List list = c1434yp.f11526o;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Nq.c((String) it.next(), "@gw_mpe@", "2." + i4));
            }
            this.f9754v.a(this.f9753u.a(this.f9751s, c1434yp, arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.Oh
    public final void u() {
        C1434yp c1434yp = this.f9752t;
        this.f9754v.a(this.f9753u.a(this.f9751s, c1434yp, c1434yp.f11537t0));
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void y(BinderC0606fb binderC0606fb, String str, String str2) {
        Fp fp;
        C1434yp c1434yp = this.f9752t;
        List list = c1434yp.f11512h;
        Nq nq = this.f9753u;
        nq.getClass();
        ArrayList arrayList = new ArrayList();
        nq.f6400h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = binderC0606fb.f8704o;
            String num = Integer.toString(binderC0606fb.f8705p);
            boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10182W2)).booleanValue();
            Cs cs = C1394xs.f11307o;
            if (booleanValue) {
                Gp gp = nq.f6399g;
                if (gp != null && (fp = gp.f5339a) != null) {
                    cs = new Gs(fp);
                }
            } else {
                Fp fp2 = nq.f6398f;
                if (fp2 != null) {
                    cs = new Gs(fp2);
                }
            }
            String str4 = (String) cs.a(C0932n1.f9710t).b();
            String str5 = (String) cs.a(C0932n1.f9711u).b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1230u.I(nq.f6397e, Nq.c(Nq.c(Nq.c(Nq.c(Nq.c(Nq.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", nq.f6396b), c1434yp.f11496W));
            }
        } catch (RemoteException e4) {
            Y9.q("Unable to determine award type and amount.", e4);
        }
        this.f9754v.a(arrayList);
    }
}
