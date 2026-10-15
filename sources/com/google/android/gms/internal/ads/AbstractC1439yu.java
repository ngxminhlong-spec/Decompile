package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1439yu extends Bu {

    /* renamed from: C, reason: collision with root package name */
    public static final Logger f11546C = Logger.getLogger(AbstractC1439yu.class.getName());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f11547A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f11548B;

    /* renamed from: z, reason: collision with root package name */
    public AbstractC0923mt f11549z;

    public AbstractC1439yu(AbstractC0923mt abstractC0923mt, boolean z4, boolean z5) {
        int size = abstractC0923mt.size();
        this.f4205v = null;
        this.f4206w = size;
        this.f11549z = abstractC0923mt;
        this.f11547A = z4;
        this.f11548B = z5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final String d() {
        AbstractC0923mt abstractC0923mt = this.f11549z;
        return abstractC0923mt != null ? "futures=".concat(abstractC0923mt.toString()) : super.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final void e() {
        AbstractC0923mt abstractC0923mt = this.f11549z;
        w(1);
        if ((abstractC0923mt != null) && (this.f10548o instanceof C0625fu)) {
            boolean l4 = l();
            Tt l5 = abstractC0923mt.l();
            while (l5.hasNext()) {
                ((Future) l5.next()).cancel(l4);
            }
        }
    }

    public final void q(int i4, Future future) {
        try {
            t(i4, Bs.p0(future));
        } catch (Error e4) {
            e = e4;
            s(e);
        } catch (RuntimeException e5) {
            e = e5;
            s(e);
        } catch (ExecutionException e6) {
            s(e6.getCause());
        }
    }

    public final void r(AbstractC0923mt abstractC0923mt) {
        int c = Bu.f4204x.c(this);
        int i4 = 0;
        Bs.j0("Less than 0 remaining futures", c >= 0);
        if (c == 0) {
            if (abstractC0923mt != null) {
                Tt l4 = abstractC0923mt.l();
                while (l4.hasNext()) {
                    Future future = (Future) l4.next();
                    if (!future.isCancelled()) {
                        q(i4, future);
                    }
                    i4++;
                }
            }
            this.f4205v = null;
            u();
            w(2);
        }
    }

    public final void s(Throwable th) {
        th.getClass();
        if (this.f11547A && !g(th)) {
            Set set = this.f4205v;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f10548o instanceof C0625fu)) {
                    Throwable b4 = b();
                    b4.getClass();
                    while (b4 != null && newSetFromMap.add(b4)) {
                        b4 = b4.getCause();
                    }
                }
                Bu.f4204x.E(this, newSetFromMap);
                set = this.f4205v;
                set.getClass();
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            f11546C.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z4 = th instanceof Error;
        if (z4) {
            f11546C.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z4 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public abstract void t(int i4, Object obj);

    public abstract void u();

    public final void v() {
        AbstractC0923mt abstractC0923mt = this.f11549z;
        abstractC0923mt.getClass();
        if (abstractC0923mt.isEmpty()) {
            u();
            return;
        }
        boolean z4 = this.f11547A;
        Iu iu = Iu.f5747o;
        if (!z4) {
            Jn jn = new Jn(11, this, this.f11548B ? this.f11549z : null);
            Tt l4 = this.f11549z.l();
            while (l4.hasNext()) {
                ((InterfaceFutureC0239a) l4.next()).a(jn, iu);
            }
            return;
        }
        Tt l5 = this.f11549z.l();
        int i4 = 0;
        while (l5.hasNext()) {
            InterfaceFutureC0239a interfaceFutureC0239a = (InterfaceFutureC0239a) l5.next();
            interfaceFutureC0239a.a(new RunnableC1004oo(this, interfaceFutureC0239a, i4), iu);
            i4++;
        }
    }

    public abstract void w(int i4);
}
