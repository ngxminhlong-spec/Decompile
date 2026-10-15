package W3;

import d3.AbstractC1654b;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0143w extends Z3.i {

    /* renamed from: q, reason: collision with root package name */
    public int f2123q;

    public AbstractC0143w(int i4) {
        super(0L, Z3.k.f2340g);
        this.f2123q = i4;
    }

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract L3.d d();

    public Throwable e(Object obj) {
        C0130i c0130i = obj instanceof C0130i ? (C0130i) obj : null;
        if (c0130i != null) {
            return c0130i.f2101a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1654b.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        S3.e.b(th);
        r.e(d().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r5 = (W3.M) r5.b(W3.C0135n.f2110p);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            J3.f r0 = J3.f.f1032a
            n0.n r1 = r12.f2334p
            L3.d r2 = r12.d()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            S3.e.c(r2, r3)     // Catch: java.lang.Throwable -> L24
            Y3.g r2 = (Y3.g) r2     // Catch: java.lang.Throwable -> L24
            N3.b r3 = r2.f2230s     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.f2232u     // Catch: java.lang.Throwable -> L24
            L3.i r4 = r3.f1232p     // Catch: java.lang.Throwable -> L24
            S3.e.b(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = Y3.a.f(r4, r2)     // Catch: java.lang.Throwable -> L24
            B0.a r5 = Y3.a.f2222e     // Catch: java.lang.Throwable -> L24
            if (r2 == r5) goto L27
            W3.r.i(r3, r4)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r2 = move-exception
            goto L91
        L27:
            L3.i r5 = r3.f1232p     // Catch: java.lang.Throwable -> L4c
            S3.e.b(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r12.h()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r7 = r12.e(r6)     // Catch: java.lang.Throwable -> L4c
            r8 = 0
            if (r7 != 0) goto L4e
            int r9 = r12.f2123q     // Catch: java.lang.Throwable -> L4c
            r10 = 1
            if (r9 == r10) goto L41
            r11 = 2
            if (r9 != r11) goto L40
            goto L41
        L40:
            r10 = 0
        L41:
            if (r10 == 0) goto L4e
            W3.n r9 = W3.C0135n.f2110p     // Catch: java.lang.Throwable -> L4c
            L3.g r5 = r5.b(r9)     // Catch: java.lang.Throwable -> L4c
            W3.M r5 = (W3.M) r5     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r3 = move-exception
            goto L8d
        L4e:
            r5 = r8
        L4f:
            if (r5 == 0) goto L68
            boolean r9 = r5.a()     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L68
            W3.W r5 = (W3.W) r5     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.CancellationException r5 = r5.m()     // Catch: java.lang.Throwable -> L4c
            r12.a(r6, r5)     // Catch: java.lang.Throwable -> L4c
            J3.d r5 = m2.AbstractC1806a.h(r5)     // Catch: java.lang.Throwable -> L4c
            r3.c(r5)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L68:
            if (r7 == 0) goto L72
            J3.d r5 = m2.AbstractC1806a.h(r7)     // Catch: java.lang.Throwable -> L4c
            r3.c(r5)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L72:
            java.lang.Object r5 = r12.f(r6)     // Catch: java.lang.Throwable -> L4c
            r3.c(r5)     // Catch: java.lang.Throwable -> L4c
        L79:
            Y3.a.b(r4, r2)     // Catch: java.lang.Throwable -> L24
            r1.getClass()     // Catch: java.lang.Throwable -> L80
            goto L85
        L80:
            r0 = move-exception
            J3.d r0 = m2.AbstractC1806a.h(r0)
        L85:
            java.lang.Throwable r0 = J3.e.a(r0)
            r12.g(r8, r0)
            goto La1
        L8d:
            Y3.a.b(r4, r2)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L91:
            r1.getClass()     // Catch: java.lang.Throwable -> L95
            goto L9a
        L95:
            r0 = move-exception
            J3.d r0 = m2.AbstractC1806a.h(r0)
        L9a:
            java.lang.Throwable r0 = J3.e.a(r0)
            r12.g(r2, r0)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.AbstractC0143w.run():void");
    }
}
