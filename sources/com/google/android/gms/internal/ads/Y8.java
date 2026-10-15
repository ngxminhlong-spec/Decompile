package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y8 extends AbstractC0287Ic {
    public final Object c = new Object();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f7749e = 0;

    public final X8 n() {
        X8 x8 = new X8(this);
        Q1.I.w("createNewReference: Trying to acquire lock");
        synchronized (this.c) {
            Q1.I.w("createNewReference: Lock acquired");
            m(new U8(x8, 1), new V8(x8, 1));
            h2.y.l(this.f7749e >= 0);
            this.f7749e++;
        }
        Q1.I.w("createNewReference: Lock released");
        return x8;
    }

    public final void o() {
        Q1.I.w("markAsDestroyable: Trying to acquire lock");
        synchronized (this.c) {
            Q1.I.w("markAsDestroyable: Lock acquired");
            h2.y.l(this.f7749e >= 0);
            Q1.I.w("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.d = true;
            p();
        }
        Q1.I.w("markAsDestroyable: Lock released");
    }

    public final void p() {
        Q1.I.w("maybeDestroy: Trying to acquire lock");
        synchronized (this.c) {
            try {
                Q1.I.w("maybeDestroy: Lock acquired");
                h2.y.l(this.f7749e >= 0);
                if (this.d && this.f7749e == 0) {
                    Q1.I.w("No reference is left (including root). Cleaning up engine.");
                    m(new C1016p(13), new C1016p(28));
                } else {
                    Q1.I.w("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Q1.I.w("maybeDestroy: Lock released");
    }

    public final void q() {
        Q1.I.w("releaseOneReference: Trying to acquire lock");
        synchronized (this.c) {
            Q1.I.w("releaseOneReference: Lock acquired");
            h2.y.l(this.f7749e > 0);
            Q1.I.w("Releasing 1 reference for JS Engine");
            this.f7749e--;
            p();
        }
        Q1.I.w("releaseOneReference: Lock released");
    }
}
