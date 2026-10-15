package A2;

import h2.y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o f41b = new o(0);
    public boolean c;
    public volatile boolean d;

    /* renamed from: e, reason: collision with root package name */
    public Object f42e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f43f;

    @Override // A2.h
    public final h a(Executor executor, c cVar) {
        this.f41b.e(new l(executor, cVar));
        p();
        return this;
    }

    @Override // A2.h
    public final h b(Executor executor, d dVar) {
        this.f41b.e(new l(executor, dVar));
        p();
        return this;
    }

    @Override // A2.h
    public final h c(Executor executor, e eVar) {
        this.f41b.e(new l(executor, eVar));
        p();
        return this;
    }

    @Override // A2.h
    public final h d(Executor executor, f fVar) {
        this.f41b.e(new l(executor, fVar));
        p();
        return this;
    }

    @Override // A2.h
    public final r e(Executor executor, a aVar) {
        r rVar = new r();
        this.f41b.e(new l(executor, aVar, rVar));
        p();
        return rVar;
    }

    @Override // A2.h
    public final Exception f() {
        Exception exc;
        synchronized (this.f40a) {
            exc = this.f43f;
        }
        return exc;
    }

    @Override // A2.h
    public final Object g() {
        Object obj;
        synchronized (this.f40a) {
            try {
                y.k("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f43f;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                obj = this.f42e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // A2.h
    public final boolean h() {
        return this.d;
    }

    @Override // A2.h
    public final boolean i() {
        boolean z4;
        synchronized (this.f40a) {
            z4 = this.c;
        }
        return z4;
    }

    @Override // A2.h
    public final boolean j() {
        boolean z4;
        synchronized (this.f40a) {
            try {
                z4 = false;
                if (this.c && !this.d && this.f43f == null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public final void k(Exception exc) {
        y.j(exc, "Exception must not be null");
        synchronized (this.f40a) {
            o();
            this.c = true;
            this.f43f = exc;
        }
        this.f41b.g(this);
    }

    public final void l(Object obj) {
        synchronized (this.f40a) {
            o();
            this.c = true;
            this.f42e = obj;
        }
        this.f41b.g(this);
    }

    public final void m() {
        synchronized (this.f40a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.f41b.g(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n(Object obj) {
        synchronized (this.f40a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f42e = obj;
                this.f41b.g(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.c) {
            int i4 = b.f25o;
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception f4 = f();
        }
    }

    public final void p() {
        synchronized (this.f40a) {
            try {
                if (this.c) {
                    this.f41b.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
