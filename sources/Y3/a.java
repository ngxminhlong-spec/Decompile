package Y3;

import W3.AbstractC0134m;
import W3.C;
import W3.C0130i;
import W3.C0135n;
import W3.M;
import W3.W;
import W3.a0;
import W3.b0;
import d3.AbstractC1654b;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final B0.a f2220a = new B0.a("NO_DECISION", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final B0.a f2221b = new B0.a("UNDEFINED", 3);
    public static final B0.a c = new B0.a("REUSABLE_CLAIMED", 3);
    public static final B0.a d = new B0.a("CONDITION_FALSE", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final B0.a f2222e = new B0.a("NO_THREAD_ELEMENTS", 3);

    public static final void a(L3.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = e.f2226a.iterator();
        while (it.hasNext()) {
            try {
                ((X3.b) it.next()).g(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC1654b.b(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC1654b.b(th, new f(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void b(L3.i iVar, Object obj) {
        if (obj == f2222e) {
            return;
        }
        if (!(obj instanceof u)) {
            Object d4 = iVar.d(null, s.f2252r);
            S3.e.c(d4, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            U.a.t(d4);
            throw null;
        }
        u uVar = (u) obj;
        a0[] a0VarArr = uVar.f2257b;
        int length = a0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        a0 a0Var = a0VarArr[length];
        S3.e.b(null);
        Object obj2 = uVar.f2256a[length];
        throw null;
    }

    public static final void c(L3.d dVar) {
        boolean z4 = dVar instanceof g;
        J3.f fVar = J3.f.f1032a;
        if (!z4) {
            dVar.c(fVar);
            return;
        }
        g gVar = (g) dVar;
        AbstractC0134m abstractC0134m = gVar.f2229r;
        N3.b bVar = gVar.f2230s;
        Throwable a4 = J3.e.a(fVar);
        Object c0130i = a4 == null ? fVar : new C0130i(a4);
        bVar.getContext();
        L3.i iVar = bVar.f1232p;
        if (abstractC0134m.h()) {
            gVar.f2231t = c0130i;
            gVar.f2123q = 1;
            S3.e.b(iVar);
            abstractC0134m.g(iVar, gVar);
            return;
        }
        C a5 = b0.a();
        if (a5.f2062q >= 4294967296L) {
            gVar.f2231t = c0130i;
            gVar.f2123q = 1;
            K3.a aVar = a5.f2064s;
            if (aVar == null) {
                aVar = new K3.a();
                a5.f2064s = aVar;
            }
            aVar.addLast(gVar);
            return;
        }
        a5.k(true);
        try {
            S3.e.b(iVar);
            M m4 = (M) iVar.b(C0135n.f2110p);
            if (m4 == null || m4.a()) {
                Object obj = gVar.f2232u;
                S3.e.b(iVar);
                Object f4 = f(iVar, obj);
                if (f4 != f2222e) {
                    W3.r.i(bVar, iVar);
                }
                try {
                    bVar.c(fVar);
                } finally {
                    b(iVar, f4);
                }
            } else {
                CancellationException m5 = ((W) m4).m();
                gVar.a(c0130i, m5);
                gVar.c(AbstractC1806a.h(m5));
            }
            do {
            } while (a5.l());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long d(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.a.d(java.lang.String, long, long, long):long");
    }

    public static int e(int i4, int i5, String str) {
        return (int) d(str, i4, 1, (i5 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object f(L3.i iVar, Object obj) {
        if (obj == null) {
            obj = iVar.d(0, s.f2251q);
            S3.e.b(obj);
        }
        if (obj == 0) {
            return f2222e;
        }
        if (obj instanceof Integer) {
            return iVar.d(new u(iVar, ((Number) obj).intValue()), s.f2253s);
        }
        U.a.t(obj);
        throw null;
    }
}
