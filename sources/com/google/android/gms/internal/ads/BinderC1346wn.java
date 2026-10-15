package com.google.android.gms.internal.ads;

import O1.InterfaceC0096x;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1346wn extends O1.E {

    /* renamed from: o, reason: collision with root package name */
    public final Context f11197o;

    /* renamed from: p, reason: collision with root package name */
    public final C1423ye f11198p;

    /* renamed from: q, reason: collision with root package name */
    public final Ip f11199q;

    /* renamed from: r, reason: collision with root package name */
    public final l.J0 f11200r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0096x f11201s;

    public BinderC1346wn(C1423ye c1423ye, Context context, String str) {
        Ip ip = new Ip();
        this.f11199q = ip;
        this.f11200r = new l.J0();
        this.f11198p = c1423ye;
        ip.c = str;
        this.f11197o = context;
    }

    @Override // O1.F
    public final void Q2(D7 d7) {
        this.f11200r.f13638p = d7;
    }

    @Override // O1.F
    public final void S0(M7 m7) {
        this.f11200r.f13639q = m7;
    }

    @Override // O1.F
    public final O1.C a() {
        l.J0 j02 = this.f11200r;
        j02.getClass();
        Gi gi = new Gi(j02);
        ArrayList arrayList = new ArrayList();
        if (gi.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (gi.f5316a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (gi.f5317b != null) {
            arrayList.add(Integer.toString(2));
        }
        r.i iVar = gi.f5319f;
        if (!iVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (gi.f5318e != null) {
            arrayList.add(Integer.toString(7));
        }
        Ip ip = this.f11199q;
        ip.f5730f = arrayList;
        ArrayList arrayList2 = new ArrayList(iVar.f14741q);
        for (int i4 = 0; i4 < iVar.f14741q; i4++) {
            arrayList2.add((String) iVar.f(i4));
        }
        ip.f5731g = arrayList2;
        if (ip.f5728b == null) {
            ip.f5728b = O1.X0.i();
        }
        return new BinderC1389xn(this.f11197o, this.f11198p, this.f11199q, gi, this.f11201s);
    }

    @Override // O1.F
    public final void a2(String str, I7 i7, G7 g7) {
        l.J0 j02 = this.f11200r;
        ((r.i) j02.f13642t).put(str, i7);
        if (g7 != null) {
            ((r.i) j02.f13643u).put(str, g7);
        }
    }

    @Override // O1.F
    public final void c2(C0766j7 c0766j7) {
        this.f11199q.f5732h = c0766j7;
    }

    @Override // O1.F
    public final void c3(G8 g8) {
        this.f11200r.f13641s = g8;
    }

    @Override // O1.F
    public final void d2(K1.d dVar) {
        Ip ip = this.f11199q;
        ip.f5735k = dVar;
        if (dVar != null) {
            ip.f5729e = dVar.f1058o;
            ip.f5736l = dVar.f1059p;
        }
    }

    @Override // O1.F
    public final void h1(C8 c8) {
        Ip ip = this.f11199q;
        ip.f5738n = c8;
        ip.d = new O1.R0(false, true, false);
    }

    @Override // O1.F
    public final void m0(InterfaceC0096x interfaceC0096x) {
        this.f11201s = interfaceC0096x;
    }

    @Override // O1.F
    public final void m1(K1.a aVar) {
        Ip ip = this.f11199q;
        ip.f5734j = aVar;
        if (aVar != null) {
            ip.f5729e = aVar.f1051o;
        }
    }

    @Override // O1.F
    public final void r0(O1.S s4) {
        this.f11199q.f5743s = s4;
    }

    @Override // O1.F
    public final void u1(K7 k7, O1.X0 x02) {
        this.f11200r.f13640r = k7;
        this.f11199q.f5728b = x02;
    }

    @Override // O1.F
    public final void y2(E7 e7) {
        this.f11200r.f13637o = e7;
    }
}
