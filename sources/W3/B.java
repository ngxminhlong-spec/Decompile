package W3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class B extends C implements InterfaceC0142v {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2059t = AtomicReferenceFieldUpdater.newUpdater(B.class, Object.class, "_queue$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2060u = AtomicReferenceFieldUpdater.newUpdater(B.class, Object.class, "_delayed$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2061v = AtomicIntegerFieldUpdater.newUpdater(B.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // W3.AbstractC0134m
    public final void g(L3.i iVar, Runnable runnable) {
        m(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = W3.B.f2059t
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = W3.B.f2061v
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof Y3.m
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            Y3.m r2 = (Y3.m) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            Y3.m r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            B0.a r2 = W3.r.f2113a
            if (r1 != r2) goto L50
        L4a:
            W3.s r0 = W3.RunnableC0139s.f2119w
            r0.m(r6)
            return
        L50:
            Y3.m r2 = new Y3.m
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.j()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.B.m(java.lang.Runnable):void");
    }

    public final long n() {
        K3.a aVar = this.f2064s;
        if (((aVar == null || aVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            Object obj = f2059t.get(this);
            if (obj != null) {
                if (obj instanceof Y3.m) {
                    long j4 = Y3.m.f2244f.get((Y3.m) obj);
                    if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (obj == r.f2113a) {
                    return Long.MAX_VALUE;
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean o() {
        K3.a aVar = this.f2064s;
        if (aVar != null ? aVar.isEmpty() : true) {
            Object obj = f2059t.get(this);
            if (obj != null) {
                if (obj instanceof Y3.m) {
                    long j4 = Y3.m.f2244f.get((Y3.m) obj);
                    return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
                }
                if (obj == r.f2113a) {
                }
            }
            return true;
        }
        return false;
    }

    public final long p() {
        Runnable runnable;
        if (l()) {
            return 0L;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2059t;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof Y3.m)) {
                if (obj == r.f2113a) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop0;
            }
            Y3.m mVar = (Y3.m) obj;
            Object d = mVar.d();
            if (d != Y3.m.f2245g) {
                runnable = (Runnable) d;
                break;
            }
            Y3.m c = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable == null) {
            return n();
        }
        runnable.run();
        return 0L;
    }

    @Override // W3.C
    public void shutdown() {
        b0.f2088a.set(null);
        f2061v.set(this, 1);
        B0.a aVar = r.f2113a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2059t;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof Y3.m)) {
                    if (obj != aVar) {
                        Y3.m mVar = new Y3.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((Y3.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (p() <= 0);
        System.nanoTime();
    }
}
