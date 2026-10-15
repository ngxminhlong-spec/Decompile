package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1353wu extends Ju implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f11219x = 0;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceFutureC0239a f11220v;

    /* renamed from: w, reason: collision with root package name */
    public Object f11221w;

    public AbstractRunnableC1353wu(InterfaceFutureC0239a interfaceFutureC0239a, Object obj) {
        interfaceFutureC0239a.getClass();
        this.f11220v = interfaceFutureC0239a;
        this.f11221w = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final String d() {
        InterfaceFutureC0239a interfaceFutureC0239a = this.f11220v;
        Object obj = this.f11221w;
        String d = super.d();
        String k3 = interfaceFutureC0239a != null ? U.a.k("inputFuture=[", interfaceFutureC0239a.toString(), "], ") : "";
        if (obj == null) {
            if (d != null) {
                return k3.concat(d);
            }
            return null;
        }
        return k3 + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final void e() {
        j(this.f11220v);
        this.f11220v = null;
        this.f11221w = null;
    }

    public abstract Object r(Object obj, Object obj2);

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC0239a interfaceFutureC0239a = this.f11220v;
        Object obj = this.f11221w;
        if (((this.f10548o instanceof C0625fu) | (interfaceFutureC0239a == null)) || (obj == null)) {
            return;
        }
        this.f11220v = null;
        if (interfaceFutureC0239a.isCancelled()) {
            k(interfaceFutureC0239a);
            return;
        }
        try {
            try {
                Object r4 = r(obj, Bs.p0(interfaceFutureC0239a));
                this.f11221w = null;
                s(r4);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    g(th);
                } finally {
                    this.f11221w = null;
                }
            }
        } catch (Error e4) {
            g(e4);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e5) {
            g(e5);
        } catch (ExecutionException e6) {
            g(e6.getCause());
        }
    }

    public abstract void s(Object obj);
}
