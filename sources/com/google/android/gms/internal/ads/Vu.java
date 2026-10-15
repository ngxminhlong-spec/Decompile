package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Vu extends AbstractC0967nu implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f7308v;

    public Vu(Runnable runnable) {
        runnable.getClass();
        this.f7308v = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final String d() {
        return U.a.k("task=[", this.f7308v.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7308v.run();
        } catch (Error | RuntimeException e4) {
            g(e4);
            throw e4;
        }
    }
}
