package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Dl extends AbstractBinderC1149s4 implements InterfaceC0340Ta {

    /* renamed from: o, reason: collision with root package name */
    public final Context f4779o;

    /* renamed from: p, reason: collision with root package name */
    public final C1337we f4780p;

    /* renamed from: q, reason: collision with root package name */
    public final C1294ve f4781q;

    /* renamed from: r, reason: collision with root package name */
    public final Xj f4782r;

    /* renamed from: s, reason: collision with root package name */
    public final Su f4783s;

    public Dl(Context context, C1337we c1337we, C1294ve c1294ve, Xj xj, Su su, C1016p c1016p) {
        super("com.google.android.gms.ads.internal.request.IAdsService");
        this.f4779o = context;
        this.f4780p = c1337we;
        this.f4781q = c1294ve;
        this.f4782r = xj;
        this.f4783s = su;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0340Ta
    public final void E2(C0315Oa c0315Oa, InterfaceC0350Va interfaceC0350Va) {
        Binder.getCallingUid();
        C1267uu n02 = Bs.n0(Ku.q(K3(c0315Oa)), new C0364Xe(20), AbstractC0266Ec.f4897a);
        C1384xi c1384xi = new C1384xi(11, interfaceC0350Va);
        n02.a(new Nu(0, n02, c1384xi), AbstractC0266Ec.f4900f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC0350Va interfaceC0350Va = null;
        if (i4 == 1) {
            C0305Ma c0305Ma = (C0305Ma) AbstractC1192t4.a(parcel, C0305Ma.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                interfaceC0350Va = queryLocalInterface instanceof InterfaceC0350Va ? (InterfaceC0350Va) queryLocalInterface : new C0345Ua(readStrongBinder);
            }
            AbstractC1192t4.b(parcel);
            z1(c0305Ma, interfaceC0350Va);
        } else if (i4 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof InterfaceC0350Va) {
                }
            }
            AbstractC1192t4.b(parcel);
        } else {
            if (i4 != 3) {
                return false;
            }
            C0315Oa c0315Oa = (C0315Oa) AbstractC1192t4.a(parcel, C0315Oa.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                interfaceC0350Va = queryLocalInterface3 instanceof InterfaceC0350Va ? (InterfaceC0350Va) queryLocalInterface3 : new C0345Ua(readStrongBinder3);
            }
            AbstractC1192t4.b(parcel);
            E2(c0315Oa, interfaceC0350Va);
        }
        parcel2.writeNoException();
        return true;
    }

    public final C1267uu K3(C0315Oa c0315Oa) {
        InterfaceFutureC0239a h02;
        Js js;
        HashMap hashMap = new HashMap();
        Bundle bundle = c0315Oa.f6459q;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        int i4 = c0315Oa.f6458p;
        String str2 = c0315Oa.f6457o;
        byte[] bArr = c0315Oa.f6460r;
        boolean z4 = c0315Oa.f6461s;
        El el = new El(str2, i4, hashMap, bArr, "", z4);
        C1384xi c1384xi = new C1384xi(17, c0315Oa);
        C1294ve c1294ve = this.f4781q;
        c1294ve.getClass();
        C1423ye c1423ye = c1294ve.f11035a;
        C1414yB c1414yB = c1423ye.f11399e;
        Lf lf = new Lf(18, c1384xi);
        C1414yB b4 = C1414yB.b(Wj.d);
        C1414yB b5 = C1414yB.b(Wj.c);
        C1414yB b6 = C1414yB.b(Wj.f7536e);
        C1414yB b7 = C1414yB.b(Wj.f7537f);
        int i5 = BB.f4037b;
        LinkedHashMap l4 = AbstractC0587ez.l(4);
        l4.put(EnumC0877lq.f9487t, b4);
        l4.put(EnumC0877lq.f9488u, b5);
        EnumC0877lq enumC0877lq = EnumC0877lq.f9490w;
        l4.put(enumC0877lq, b6);
        l4.put(EnumC0877lq.y, b7);
        C1414yB b8 = C1414yB.b(new C1338wf((InterfaceC1457zB) lf, (FB) c1423ye.c, (FB) new AbstractC1371xB(l4), 10));
        int i6 = DB.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b8);
        C1414yB b9 = C1414yB.b(new C0371Zb(c1414yB, new Hg(new DB(list, arrayList), 23), 26));
        C1414yB b10 = C1414yB.b(new Eo(c1423ye.f11416q, 7));
        Su su = this.f4783s;
        if (z4) {
            String str3 = c0315Oa.f6457o;
            String str4 = (String) U6.f7143b.r();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    C1384xi G02 = C1384xi.G0(new C1437ys(';'));
                    str4.getClass();
                    Iterator d = ((Ks) G02.f11290p).d(G02, str4);
                    do {
                        js = (Js) d;
                        if (js.hasNext()) {
                        }
                    } while (!host.endsWith((String) js.next()));
                    Context context = c1423ye.f11393a.f9164b;
                    AbstractC0587ez.n(context);
                    C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                    AbstractC0587ez.n(c0260Dc);
                    AbstractC0587ez.n(((C0315Oa) c1384xi.f11290p).f6462t);
                    Ro ro = new Ro(2);
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c1414yB.c();
                    Eq eq = (Eq) b10.c();
                    C0658gk c0658gk = (C0658gk) c1423ye.f11370C.c();
                    HashSet hashSet = new HashSet();
                    hashSet.add(new C1175so(ro, 0L, scheduledExecutorService));
                    h02 = Bs.m0(new Io(context, c0260Dc, hashSet, eq, c0658gk).a(new JSONObject()), new C0563eb(2, el), su);
                    C1006oq c1006oq = (C1006oq) b9.c();
                    return Bs.n0(c1006oq.b(h02, enumC0877lq).p(new C1510e1((Object) this.f4779o, (Object) "", 28, false)).d(), C0364Xe.f7666l, su);
                }
            }
        }
        h02 = Bs.h0(el);
        C1006oq c1006oq2 = (C1006oq) b9.c();
        return Bs.n0(c1006oq2.b(h02, enumC0877lq).p(new C1510e1((Object) this.f4779o, (Object) "", 28, false)).d(), C0364Xe.f7666l, su);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0340Ta
    public final void z1(C0305Ma c0305Ma, InterfaceC0350Va interfaceC0350Va) {
        B0.r rVar = new B0.r(Binder.getCallingUid(), c0305Ma);
        C1337we c1337we = this.f4780p;
        c1337we.getClass();
        u0.g gVar = new u0.g(c1337we.f11179a, rVar);
        C1006oq c1006oq = (C1006oq) ((C1414yB) gVar.f14986s).c();
        C0834kq d = c1006oq.b(Pu.f6608p, EnumC0877lq.f9487t).r(new C0512d8(21, gVar)).p(C0782jh.f9196Q).r(C0364Xe.f7667m).d();
        C1267uu n02 = Bs.n0(Ku.q(d), new C0364Xe(20), AbstractC0266Ec.f4897a);
        C1384xi c1384xi = new C1384xi(11, interfaceC0350Va);
        n02.a(new Nu(0, n02, c1384xi), AbstractC0266Ec.f4900f);
        if (((Boolean) N6.d.r()).booleanValue()) {
            Xj xj = this.f4782r;
            xj.getClass();
            d.a(new RunnableC1387xl(xj, 1), this.f4783s);
        }
    }
}
