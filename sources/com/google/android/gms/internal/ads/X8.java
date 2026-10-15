package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X8 extends AbstractC0287Ic {
    public final Object c = new Object();
    public final Y8 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7605e;

    public X8(Y8 y8) {
        this.d = y8;
    }

    public final void n() {
        Q1.I.w("release: Trying to acquire lock");
        synchronized (this.c) {
            try {
                Q1.I.w("release: Lock acquired");
                if (this.f7605e) {
                    Q1.I.w("release: Lock already released");
                    return;
                }
                this.f7605e = true;
                m(new C1016p(12), new C1016p(28));
                m(new U8(this, 0), new V8(this, 0));
                Q1.I.w("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
