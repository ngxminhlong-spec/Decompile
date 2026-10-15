package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xq implements InterfaceC0409ar {

    /* renamed from: s, reason: collision with root package name */
    public static final Xq f7703s = new Xq(new Object());

    /* renamed from: o, reason: collision with root package name */
    public boolean f7704o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7705p;

    /* renamed from: q, reason: collision with root package name */
    public Object f7706q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f7707r;

    public Xq(Op op, C1384xi c1384xi, C0450bp c0450bp) {
        this.f7704o = false;
        this.f7705p = false;
        this.f7706q = c0450bp;
        InterfaceFutureC0239a s4 = ((Xj) c1384xi.f11290p).s(c0450bp.f8287b, c0450bp.f8286a, null);
        C0727i9 c0727i9 = new C0727i9(this, c1384xi, op, c0450bp, 5);
        Executor executor = c0450bp.f8288e;
        this.f7707r = Bs.c0(Bs.n0(s4, c0727i9, executor), Exception.class, new C0512d8(this, c1384xi), executor);
    }

    public Xq(C0452br c0452br) {
        this.f7707r = c0452br;
    }

    public synchronized C0497cu a(C0450bp c0450bp) {
        Zp zp;
        Zp zp2;
        if (!this.f7705p && !this.f7704o && (zp = ((C0450bp) this.f7706q).f8290g) != null && (zp2 = c0450bp.f8290g) != null && zp.equals(zp2)) {
            this.f7704o = true;
            return (C0497cu) this.f7707r;
        }
        return null;
    }

    public synchronized void b(C0831kn c0831kn) {
        C1267uu n02 = Bs.n0((C0497cu) this.f7707r, C0364Xe.f7673s, ((C0450bp) this.f7706q).f8288e);
        n02.a(new Nu(0, n02, c0831kn), ((C0450bp) this.f7706q).f8288e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0409ar
    public void g(boolean z4) {
        if (!this.f7705p && z4) {
            Date date = new Date();
            Date date2 = (Date) this.f7706q;
            if (date2 == null || date.after(date2)) {
                this.f7706q = date;
                if (this.f7704o) {
                    Iterator it = Collections.unmodifiableCollection(Zq.c.f8056b).iterator();
                    while (it.hasNext()) {
                        AbstractC0579er abstractC0579er = ((Rq) it.next()).d;
                        Date date3 = (Date) this.f7706q;
                        abstractC0579er.c(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f7705p = z4;
    }
}
