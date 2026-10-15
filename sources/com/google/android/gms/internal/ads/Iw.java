package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Iw {

    /* renamed from: b, reason: collision with root package name */
    public static final Iw f5771b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5772a = new AtomicReference(new Zw(new C0326Qb(17)));

    static {
        try {
            Iw iw = new Iw();
            iw.d(new C1355ww(Aw.class));
            f5771b = iw;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public final Bs a(Tw tw) {
        AtomicReference atomicReference = this.f5772a;
        Zw zw = (Zw) atomicReference.get();
        zw.getClass();
        Zy zy = (Zy) tw.c;
        if (!zw.f8066b.containsKey(new Xw(Tw.class, zy))) {
            return new Aw(tw);
        }
        Zw zw2 = (Zw) atomicReference.get();
        zw2.getClass();
        Xw xw = new Xw(Tw.class, zy);
        HashMap hashMap = zw2.f8066b;
        if (hashMap.containsKey(xw)) {
            return ((C1269uw) hashMap.get(xw)).f10955b.g(tw);
        }
        throw new GeneralSecurityException(U.a.k("No Key Parser for requested key type ", xw.toString(), " available"));
    }

    public final Ww b(AbstractC1054pv abstractC1054pv) {
        Zw zw = (Zw) this.f5772a.get();
        zw.getClass();
        Yw yw = new Yw(abstractC1054pv.getClass(), Uw.class);
        HashMap hashMap = zw.c;
        if (hashMap.containsKey(yw)) {
            return ((Lw) hashMap.get(yw)).f6184b.f(abstractC1054pv);
        }
        throw new GeneralSecurityException(U.a.k("No Key Format serializer for ", yw.toString(), " available"));
    }

    public final synchronized void c(C1269uw c1269uw) {
        C0326Qb c0326Qb = new C0326Qb((Zw) this.f5772a.get());
        c0326Qb.E(c1269uw);
        this.f5772a.set(new Zw(c0326Qb));
    }

    public final synchronized void d(C1355ww c1355ww) {
        C0326Qb c0326Qb = new C0326Qb((Zw) this.f5772a.get());
        c0326Qb.J(c1355ww);
        this.f5772a.set(new Zw(c0326Qb));
    }

    public final synchronized void e(Jw jw) {
        C0326Qb c0326Qb = new C0326Qb((Zw) this.f5772a.get());
        c0326Qb.M(jw);
        this.f5772a.set(new Zw(c0326Qb));
    }

    public final synchronized void f(Lw lw) {
        C0326Qb c0326Qb = new C0326Qb((Zw) this.f5772a.get());
        c0326Qb.P(lw);
        this.f5772a.set(new Zw(c0326Qb));
    }
}
