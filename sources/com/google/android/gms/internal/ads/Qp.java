package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qp {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f6700a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Callable f6701b;
    public final Su c;

    public Qp(CallableC1428yj callableC1428yj, Su su) {
        this.f6701b = callableC1428yj;
        this.c = su;
    }

    public final synchronized InterfaceFutureC0239a a() {
        b(1);
        return (InterfaceFutureC0239a) this.f6700a.poll();
    }

    public final synchronized void b(int i4) {
        int size = i4 - this.f6700a.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f6700a.add(((C0260Dc) this.c).b(this.f6701b));
        }
    }
}
