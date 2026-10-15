package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bl extends AbstractBinderC1149s4 implements InterfaceC0325Qa {

    /* renamed from: o, reason: collision with root package name */
    public final Context f4165o;

    /* renamed from: p, reason: collision with root package name */
    public final Su f4166p;

    /* renamed from: q, reason: collision with root package name */
    public final Xj f4167q;

    /* renamed from: r, reason: collision with root package name */
    public final C1423ye f4168r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayDeque f4169s;

    /* renamed from: t, reason: collision with root package name */
    public final Fq f4170t;

    public Bl(Context context, Su su, C1016p c1016p, C1423ye c1423ye, Xj xj, ArrayDeque arrayDeque, Fq fq) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        AbstractC1066q6.a(context);
        this.f4165o = context;
        this.f4166p = su;
        this.f4167q = xj;
        this.f4168r = c1423ye;
        this.f4169s = arrayDeque;
        this.f4170t = fq;
    }

    public static C0834kq P3(C0834kq c0834kq, C1006oq c1006oq, C0641g9 c0641g9, Eq eq, Aq aq) {
        C0727i9 a4 = c0641g9.a("AFMA_getAdDictionary", AbstractC0598f9.f8690b, C0782jh.f9195P);
        Zf.N(c0834kq, aq);
        C0834kq d = c1006oq.b(c0834kq, EnumC0877lq.f9488u).r(a4).d();
        if (!((Boolean) G6.c.r()).booleanValue()) {
            return d;
        }
        Ku q4 = Ku.q(d);
        C0831kn c0831kn = new C0831kn(2, eq, aq);
        q4.a(new Nu(0, q4, c0831kn), AbstractC0266Ec.f4900f);
        return d;
    }

    public static void R3(InterfaceFutureC0239a interfaceFutureC0239a, InterfaceC0360Xa interfaceC0360Xa) {
        C1267uu n02 = Bs.n0(interfaceFutureC0239a, new C0364Xe(19), AbstractC0266Ec.f4897a);
        Xj xj = new Xj(3, interfaceC0360Xa);
        n02.a(new Nu(0, n02, xj), AbstractC0266Ec.f4900f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void B2(C0370Za c0370Za, InterfaceC0360Xa interfaceC0360Xa) {
        R3(K3(c0370Za, Binder.getCallingUid()), interfaceC0360Xa);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void I1(C0370Za c0370Za, InterfaceC0360Xa interfaceC0360Xa) {
        R3(M3(c0370Za, Binder.getCallingUid()), interfaceC0360Xa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            AbstractC1192t4.b(parcel);
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i4 == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof InterfaceC0330Ra) {
                }
            }
            AbstractC1192t4.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        InterfaceC0360Xa interfaceC0360Xa = null;
        if (i4 == 4) {
            C0370Za c0370Za = (C0370Za) AbstractC1192t4.a(parcel, C0370Za.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                interfaceC0360Xa = queryLocalInterface2 instanceof InterfaceC0360Xa ? (InterfaceC0360Xa) queryLocalInterface2 : new C0355Wa(readStrongBinder2);
            }
            AbstractC1192t4.b(parcel);
            Q0(c0370Za, interfaceC0360Xa);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 5) {
            C0370Za c0370Za2 = (C0370Za) AbstractC1192t4.a(parcel, C0370Za.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                interfaceC0360Xa = queryLocalInterface3 instanceof InterfaceC0360Xa ? (InterfaceC0360Xa) queryLocalInterface3 : new C0355Wa(readStrongBinder3);
            }
            AbstractC1192t4.b(parcel);
            I1(c0370Za2, interfaceC0360Xa);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 6) {
            C0370Za c0370Za3 = (C0370Za) AbstractC1192t4.a(parcel, C0370Za.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                interfaceC0360Xa = queryLocalInterface4 instanceof InterfaceC0360Xa ? (InterfaceC0360Xa) queryLocalInterface4 : new C0355Wa(readStrongBinder4);
            }
            AbstractC1192t4.b(parcel);
            B2(c0370Za3, interfaceC0360Xa);
            parcel2.writeNoException();
            return true;
        }
        if (i4 != 7) {
            return false;
        }
        String readString = parcel.readString();
        IBinder readStrongBinder5 = parcel.readStrongBinder();
        if (readStrongBinder5 != null) {
            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
            interfaceC0360Xa = queryLocalInterface5 instanceof InterfaceC0360Xa ? (InterfaceC0360Xa) queryLocalInterface5 : new C0355Wa(readStrongBinder5);
        }
        AbstractC1192t4.b(parcel);
        v1(readString, interfaceC0360Xa);
        parcel2.writeNoException();
        return true;
    }

    public final InterfaceFutureC0239a K3(final C0370Za c0370Za, int i4) {
        if (!((Boolean) U6.f7142a.r()).booleanValue()) {
            return Bs.f0(new Exception("Split request is disabled."));
        }
        Xp xp = c0370Za.f7997w;
        if (xp == null) {
            return Bs.f0(new Exception("Pool configuration missing from request."));
        }
        if (xp.f7696r == 0 || xp.f7697s == 0) {
            return Bs.f0(new Exception("Caching is disabled."));
        }
        C0326Qb c0326Qb = N1.n.f1204A.f1218p;
        C0248Bc h4 = C0248Bc.h();
        Context context = this.f4165o;
        C0641g9 F2 = c0326Qb.F(context, h4, this.f4170t);
        C1423ye c1423ye = this.f4168r;
        c1423ye.getClass();
        C0326Qb c0326Qb2 = new C0326Qb(c1423ye.f11395b, new B0.r(i4, c0370Za));
        C1006oq c1006oq = (C1006oq) ((C1414yB) c0326Qb2.f6661q).c();
        final C0834kq d = c1006oq.b(Bs.h0(c0370Za.f7989o), EnumC0877lq.f9487t).r(new C0512d8(19, c0326Qb2)).p(C0782jh.f9194O).d();
        Eq eq = (Eq) ((C1414yB) c0326Qb2.f6660p).c();
        final Aq f4 = Zf.f(context, 9);
        final C0834kq P32 = P3(d, c1006oq, F2, eq, f4);
        return c1006oq.a(EnumC0877lq.f9481M, d, P32).h(new Callable() { // from class: com.google.android.gms.internal.ads.wl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bl bl = Bl.this;
                C0834kq c0834kq = P32;
                C0834kq c0834kq2 = d;
                C0370Za c0370Za2 = c0370Za;
                Aq aq = f4;
                String str = ((C0393ab) c0834kq.f9325q.get()).f8121i;
                C1473zl c1473zl = new C1473zl((C0393ab) c0834kq.f9325q.get(), (JSONObject) c0834kq2.f9325q.get(), c0370Za2.f7996v, aq);
                synchronized (bl) {
                    bl.Q3();
                    bl.f4169s.addLast(c1473zl);
                }
                return new ByteArrayInputStream(str.getBytes(AbstractC1480zs.c));
            }
        }).d();
    }

    public final C0834kq L3(C0370Za c0370Za, int i4) {
        C1473zl O32;
        boolean z4;
        C0834kq d;
        C0326Qb c0326Qb = N1.n.f1204A.f1218p;
        C0248Bc h4 = C0248Bc.h();
        Fq fq = this.f4170t;
        Context context = this.f4165o;
        C0641g9 F2 = c0326Qb.F(context, h4, fq);
        C1423ye c1423ye = this.f4168r;
        c1423ye.getClass();
        C0326Qb c0326Qb2 = new C0326Qb(c1423ye.f11395b, new B0.r(i4, c0370Za));
        C0727i9 a4 = F2.a("google.afma.response.normalize", Al.d, AbstractC0598f9.c);
        if (((Boolean) U6.f7142a.r()).booleanValue()) {
            O32 = O3(c0370Za.f7996v);
            if (O32 == null) {
                Q1.I.w("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c0370Za.f7998x;
            O32 = null;
            if (str != null && !str.isEmpty()) {
                Q1.I.w("Request contained a PoolKey but split request is disabled.");
            }
        }
        Aq f4 = O32 == null ? Zf.f(context, 9) : O32.d;
        Eq eq = (Eq) ((C1414yB) c0326Qb2.f6660p).c();
        eq.d(c0370Za.f7989o.getStringArrayList("ad_types"));
        Hl hl = new Hl(c0370Za.f7995u, eq, f4);
        C1510e1 c1510e1 = new C1510e1((Object) context, (Object) c0370Za.f7990p.f4084o, 28, false);
        C1006oq c1006oq = (C1006oq) ((C1414yB) c0326Qb2.f6661q).c();
        Aq f5 = Zf.f(context, 11);
        int i5 = 1;
        EnumC0877lq enumC0877lq = EnumC0877lq.y;
        EnumC0877lq enumC0877lq2 = EnumC0877lq.f9490w;
        if (O32 == null) {
            C0834kq d4 = c1006oq.b(Bs.h0(c0370Za.f7989o), EnumC0877lq.f9487t).r(new C0512d8(19, c0326Qb2)).p(C0782jh.f9194O).d();
            C0834kq P32 = P3(d4, c1006oq, F2, eq, f4);
            Aq f6 = Zf.f(context, 10);
            C0834kq d5 = c1006oq.a(enumC0877lq2, P32, d4).h(new B0.v(14, d4, P32)).p(hl).p(new Xj(17, f6)).p(c1510e1).d();
            Zf.Z(d5, eq, f6, false);
            Zf.N(d5, f5);
            d = c1006oq.a(enumC0877lq, d4, P32, d5).h(new CallableC0401aj(d5, d4, P32, i5)).r(a4).d();
            z4 = false;
        } else {
            Gl gl = new Gl(O32.f11650b, O32.f11649a);
            Aq f7 = Zf.f(context, 10);
            C0834kq d6 = c1006oq.b(Bs.h0(gl), enumC0877lq2).p(hl).p(new Xj(17, f7)).p(c1510e1).d();
            z4 = false;
            Zf.Z(d6, eq, f7, false);
            Pu h02 = Bs.h0(O32);
            Zf.N(d6, f5);
            d = c1006oq.a(enumC0877lq, d6, h02).h(new B0.v(13, d6, h02)).r(a4).d();
        }
        Zf.Z(d, eq, f5, z4);
        return d;
    }

    public final InterfaceFutureC0239a M3(C0370Za c0370Za, int i4) {
        C0326Qb c0326Qb = N1.n.f1204A.f1218p;
        C0248Bc h4 = C0248Bc.h();
        Fq fq = this.f4170t;
        Context context = this.f4165o;
        C0641g9 F2 = c0326Qb.F(context, h4, fq);
        if (!((Boolean) Z6.f7963a.r()).booleanValue()) {
            return Bs.f0(new Exception("Signal collection disabled."));
        }
        C1423ye c1423ye = this.f4168r;
        c1423ye.getClass();
        B0.r rVar = new B0.r(i4, c0370Za);
        C1423ye c1423ye2 = c1423ye.f11395b;
        C1414yB b4 = C1414yB.b(new Eo(c1423ye2.f11416q, 7));
        Qo qo = new Qo(rVar, 1);
        Qo qo2 = new Qo(rVar, 2);
        Qo qo3 = new Qo(rVar, 4);
        C0865le c0865le = c1423ye2.c;
        C1414yB c1414yB = c1423ye2.f11399e;
        C1252uf c1252uf = new C1252uf(c0865le, c1414yB, qo, qo2, qo3, 15);
        Qo qo4 = new Qo(rVar, 0);
        C0371Zb c0371Zb = new C0371Zb(c0865le, qo4, 25);
        C1414yB c1414yB2 = c1423ye2.f11377J;
        C0245Af c0245Af = new C0245Af(qo, c0865le, c1414yB2, c1414yB, qo4);
        Eo eo = new Eo(c0865le, 2);
        Lf lf = new Lf(17, qo4);
        Nf nf = new Nf(c1414yB, c0865le, 20);
        Hi hi = new Hi(28);
        C1252uf c1252uf2 = new C1252uf(c1414yB2, new Qo(rVar, 3), qo3, qo4, c1414yB);
        C1338wf c1338wf = new C1338wf((FB) qo4, (FB) c1414yB2, c1414yB, 14);
        Qo qo5 = new Qo(rVar, 5);
        C1414yB b5 = C1414yB.b(Wj.d);
        C1414yB b6 = C1414yB.b(Wj.c);
        C1414yB b7 = C1414yB.b(Wj.f7536e);
        C1414yB b8 = C1414yB.b(Wj.f7537f);
        int i5 = BB.f4037b;
        LinkedHashMap l4 = AbstractC0587ez.l(4);
        l4.put(EnumC0877lq.f9487t, b5);
        l4.put(EnumC0877lq.f9488u, b6);
        l4.put(EnumC0877lq.f9490w, b7);
        l4.put(EnumC0877lq.y, b8);
        C1414yB b9 = C1414yB.b(new C1338wf((InterfaceC1457zB) qo5, (FB) c1423ye2.c, (FB) new AbstractC1371xB(l4), 10));
        int i6 = DB.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b9);
        C1414yB b10 = C1414yB.b(new C0371Zb(c1423ye2.f11399e, new Hg(new DB(list, arrayList), 23), 26));
        Context context2 = c1423ye2.f11393a.f9164b;
        AbstractC0587ez.n(context2);
        Object c = c1423ye2.f11408i0.c();
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        Qn qn = new Qn(6, c0260Dc, Bs.O(((C0370Za) rVar.f113p).f7989o.getString("ms")));
        C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc2);
        List list2 = c0370Za.f7993s;
        AbstractC0587ez.n(list2);
        Qn qn2 = new Qn(7, c0260Dc2, list2);
        InterfaceC1328wB a4 = C1414yB.a(c1252uf);
        InterfaceC1328wB a5 = C1414yB.a(c0371Zb);
        InterfaceC1328wB a6 = C1414yB.a(c0245Af);
        InterfaceC1328wB a7 = C1414yB.a(eo);
        C1414yB.a(lf);
        InterfaceC1328wB a8 = C1414yB.a(nf);
        InterfaceC1328wB a9 = C1414yB.a(hi);
        C1414yB.a(c1252uf2);
        InterfaceC1328wB a10 = C1414yB.a(c1338wf);
        AbstractC0587ez.n(c0260Dc2);
        Eq eq = (Eq) b4.c();
        C0658gk c0658gk = (C0658gk) c1423ye2.f11370C.c();
        HashSet hashSet = new HashSet();
        hashSet.add((Po) c);
        hashSet.add(qn);
        hashSet.add(qn2);
        C0937n6 c0937n6 = AbstractC1066q6.V4;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = O1.r.d.c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            hashSet.add((Go) a4.c());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.W4)).booleanValue()) {
            hashSet.add((Go) a5.c());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.X4)).booleanValue()) {
            hashSet.add((Go) a6.c());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.Y4)).booleanValue()) {
            hashSet.add((Go) a7.c());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.a5)).booleanValue()) {
            hashSet.add((Go) a8.c());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.b5)).booleanValue()) {
            hashSet.add((Go) a9.c());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10283s2)).booleanValue()) {
            hashSet.add((Go) a10.c());
        }
        Io io = new Io(context2, c0260Dc2, hashSet, eq, c0658gk);
        C0727i9 a11 = F2.a("google.afma.request.getSignals", AbstractC0598f9.f8690b, AbstractC0598f9.c);
        Aq f4 = Zf.f(context, 22);
        C0381a5 r4 = ((C1006oq) b10.c()).b(Bs.h0(c0370Za.f7989o), EnumC0877lq.f9492z).p(new Xj(17, f4)).r(new C0512d8(20, io));
        C0834kq d = ((C1006oq) r4.f8081t).b(r4.d(), EnumC0877lq.f9469A).r(a11).d();
        Eq eq2 = (Eq) b4.c();
        eq2.d(c0370Za.f7989o.getStringArrayList("ad_types"));
        Zf.Z(d, eq2, f4, true);
        if (((Boolean) N6.f6306e.r()).booleanValue()) {
            Xj xj = this.f4167q;
            xj.getClass();
            d.a(new RunnableC1387xl(xj, 0), this.f4166p);
        }
        return d;
    }

    public final InterfaceFutureC0239a N3(String str) {
        if (((Boolean) U6.f7142a.r()).booleanValue()) {
            return O3(str) == null ? Bs.f0(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : Bs.h0(new InputStream());
        }
        return Bs.f0(new Exception("Split request is disabled."));
    }

    public final synchronized C1473zl O3(String str) {
        Iterator it = this.f4169s.iterator();
        while (it.hasNext()) {
            C1473zl c1473zl = (C1473zl) it.next();
            if (c1473zl.c.equals(str)) {
                it.remove();
                return c1473zl;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void Q0(C0370Za c0370Za, InterfaceC0360Xa interfaceC0360Xa) {
        C0834kq L32 = L3(c0370Za, Binder.getCallingUid());
        R3(L32, interfaceC0360Xa);
        if (((Boolean) N6.c.r()).booleanValue()) {
            Xj xj = this.f4167q;
            xj.getClass();
            L32.a(new RunnableC1387xl(xj, 0), this.f4166p);
        }
    }

    public final synchronized void Q3() {
        int intValue = ((Long) U6.c.r()).intValue();
        while (this.f4169s.size() >= intValue) {
            this.f4169s.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void v1(String str, InterfaceC0360Xa interfaceC0360Xa) {
        R3(N3(str), interfaceC0360Xa);
    }
}
