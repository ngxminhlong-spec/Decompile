package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413av extends Ru {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8176q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RunnableFutureC0498cv f8177r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f8178s;

    public C0413av(RunnableFutureC0498cv runnableFutureC0498cv, Cu cu) {
        this.f8177r = runnableFutureC0498cv;
        this.f8178s = cu;
    }

    public C0413av(RunnableFutureC0498cv runnableFutureC0498cv, Callable callable) {
        this.f8177r = runnableFutureC0498cv;
        callable.getClass();
        this.f8178s = callable;
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final Object a() {
        int i4 = this.f8176q;
        Object obj = this.f8178s;
        switch (i4) {
            case 0:
                Cu cu = (Cu) obj;
                InterfaceFutureC0239a mo0b = cu.mo0b();
                if (mo0b != null) {
                    return mo0b;
                }
                throw new NullPointerException(Bs.B("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", cu));
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final String b() {
        switch (this.f8176q) {
            case 0:
                return ((Cu) this.f8178s).toString();
            default:
                return ((Callable) this.f8178s).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final void d(Throwable th) {
        switch (this.f8176q) {
            case 0:
                this.f8177r.g(th);
                return;
            default:
                this.f8177r.g(th);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final void e(Object obj) {
        switch (this.f8176q) {
            case 0:
                this.f8177r.k((InterfaceFutureC0239a) obj);
                return;
            default:
                this.f8177r.f(obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final boolean f() {
        switch (this.f8176q) {
            case 0:
                return this.f8177r.isDone();
            default:
                return this.f8177r.isDone();
        }
    }
}
