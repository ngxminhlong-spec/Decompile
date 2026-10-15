package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0773jE extends AbstractC0560eE {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9144h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f9145i;

    /* renamed from: j, reason: collision with root package name */
    public NB f9146j;

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void f() {
        for (C0732iE c0732iE : this.f9144h.values()) {
            c0732iE.f9038a.e(c0732iE.f9039b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void h() {
        for (C0732iE c0732iE : this.f9144h.values()) {
            c0732iE.f9038a.g(c0732iE.f9039b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public void m() {
        HashMap hashMap = this.f9144h;
        for (C0732iE c0732iE : hashMap.values()) {
            AbstractC0560eE abstractC0560eE = c0732iE.f9038a;
            C0326Qb c0326Qb = c0732iE.c;
            abstractC0560eE.l(c0732iE.f9039b);
            abstractC0560eE.o(c0326Qb);
            abstractC0560eE.n(c0326Qb);
        }
        hashMap.clear();
    }

    public abstract void s(Object obj, AbstractC0560eE abstractC0560eE, AbstractC0484ch abstractC0484ch);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.uE, com.google.android.gms.internal.ads.hE] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.Qb, com.google.android.gms.internal.ads.ED, java.lang.Object, com.google.android.gms.internal.ads.xE] */
    public final void t(final Integer num, AbstractC0560eE abstractC0560eE) {
        HashMap hashMap = this.f9144h;
        Zf.O(!hashMap.containsKey(num));
        ?? r1 = new InterfaceC1245uE() { // from class: com.google.android.gms.internal.ads.hE
            @Override // com.google.android.gms.internal.ads.InterfaceC1245uE
            public final void a(AbstractC0560eE abstractC0560eE2, AbstractC0484ch abstractC0484ch) {
                AbstractC0773jE.this.s(num, abstractC0560eE2, abstractC0484ch);
            }
        };
        ?? obj = new Object();
        obj.f6662r = this;
        Object obj2 = null;
        obj.f6660p = new C0831kn((CopyOnWriteArrayList) this.c.f9320q, obj2, 8, false);
        obj.f6661q = new Qw(4, (CopyOnWriteArrayList) this.d.f6711q, obj2);
        obj.f6659o = num;
        hashMap.put(num, new C0732iE(abstractC0560eE, r1, obj));
        Handler handler = this.f9145i;
        handler.getClass();
        C0831kn c0831kn = abstractC0560eE.c;
        c0831kn.getClass();
        ((CopyOnWriteArrayList) c0831kn.f9320q).add(new C1331wE(handler, obj));
        this.f9145i.getClass();
        Qw qw = abstractC0560eE.d;
        qw.getClass();
        ((CopyOnWriteArrayList) qw.f6711q).add(new DD(obj));
        NB nb = this.f9146j;
        C0474cD c0474cD = this.f8597g;
        Zf.C(c0474cD);
        abstractC0560eE.i(r1, nb, c0474cD);
        if (this.f8594b.isEmpty()) {
            abstractC0560eE.e(r1);
        }
    }

    public void u(Object obj) {
    }

    public void v(long j4, Object obj) {
    }

    public abstract C1202tE w(Object obj, C1202tE c1202tE);
}
