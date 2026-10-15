package androidx.work.impl;

import B0.c;
import C1.l;
import android.content.Context;
import c0.C0220a;
import c0.C0223d;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.Wl;
import com.google.android.gms.internal.measurement.C1510e1;
import g0.b;
import java.util.HashMap;
import k.C1748e;
import t3.g;
import w0.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f3137s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile l f3138l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Wl f3139m;

    /* renamed from: n, reason: collision with root package name */
    public volatile Wl f3140n;

    /* renamed from: o, reason: collision with root package name */
    public volatile g f3141o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Qw f3142p;

    /* renamed from: q, reason: collision with root package name */
    public volatile u0.g f3143q;

    /* renamed from: r, reason: collision with root package name */
    public volatile C0831kn f3144r;

    @Override // c0.AbstractC0227h
    public final C0223d d() {
        return new C0223d(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // c0.AbstractC0227h
    public final b e(C0220a c0220a) {
        C1510e1 c1510e1 = new C1510e1((Object) c0220a, (Object) new C1748e(3, this), 12, false);
        Context context = c0220a.f3498b;
        String str = c0220a.c;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return c0220a.f3497a.a(new c(context, str, c1510e1, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Wl i() {
        Wl wl;
        if (this.f3139m != null) {
            return this.f3139m;
        }
        synchronized (this) {
            try {
                if (this.f3139m == null) {
                    this.f3139m = new Wl(this, 22);
                }
                wl = this.f3139m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0831kn j() {
        C0831kn c0831kn;
        if (this.f3144r != null) {
            return this.f3144r;
        }
        synchronized (this) {
            try {
                if (this.f3144r == null) {
                    this.f3144r = new C0831kn(this);
                }
                c0831kn = this.f3144r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0831kn;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, t3.g] */
    @Override // androidx.work.impl.WorkDatabase
    public final g k() {
        g gVar;
        if (this.f3141o != null) {
            return this.f3141o;
        }
        synchronized (this) {
            try {
                if (this.f3141o == null) {
                    ?? obj = new Object();
                    obj.f14961o = this;
                    obj.f14962p = new w0.b(this, 2);
                    obj.f14963q = new e(this, 0);
                    this.f3141o = obj;
                }
                gVar = this.f3141o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Qw l() {
        Qw qw;
        if (this.f3142p != null) {
            return this.f3142p;
        }
        synchronized (this) {
            try {
                if (this.f3142p == null) {
                    this.f3142p = new Qw(this);
                }
                qw = this.f3142p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qw;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final u0.g m() {
        u0.g gVar;
        if (this.f3143q != null) {
            return this.f3143q;
        }
        synchronized (this) {
            try {
                if (this.f3143q == null) {
                    this.f3143q = new u0.g(this);
                }
                gVar = this.f3143q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l n() {
        l lVar;
        if (this.f3138l != null) {
            return this.f3138l;
        }
        synchronized (this) {
            try {
                if (this.f3138l == null) {
                    this.f3138l = new l(this);
                }
                lVar = this.f3138l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Wl o() {
        Wl wl;
        if (this.f3140n != null) {
            return this.f3140n;
        }
        synchronized (this) {
            try {
                if (this.f3140n == null) {
                    this.f3140n = new Wl(this, 23);
                }
                wl = this.f3140n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wl;
    }
}
