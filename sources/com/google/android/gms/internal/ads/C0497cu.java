package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497cu extends AbstractRunnableC0582eu {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC0582eu
    public final Object r(Object obj, Throwable th) {
        Du du = (Du) obj;
        InterfaceFutureC0239a l4 = du.l(th);
        if (l4 != null) {
            return l4;
        }
        throw new NullPointerException(Bs.B("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", du));
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC0582eu
    public final /* synthetic */ void s(Object obj) {
        k((InterfaceFutureC0239a) obj);
    }
}
