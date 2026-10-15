package Z3;

import W3.r;
import Y3.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2318v = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2319w = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2320x = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final B0.a y = new B0.a("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: o, reason: collision with root package name */
    public final int f2321o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2322p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: q, reason: collision with root package name */
    public final long f2323q;

    /* renamed from: r, reason: collision with root package name */
    public final String f2324r;

    /* renamed from: s, reason: collision with root package name */
    public final f f2325s;

    /* renamed from: t, reason: collision with root package name */
    public final f f2326t;

    /* renamed from: u, reason: collision with root package name */
    public final q f2327u;

    /* JADX WARN: Type inference failed for: r4v10, types: [Z3.f, Y3.k] */
    /* JADX WARN: Type inference failed for: r4v9, types: [Z3.f, Y3.k] */
    public c(int i4, int i5, long j4, String str) {
        this.f2321o = i4;
        this.f2322p = i5;
        this.f2323q = j4;
        this.f2324r = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(U.a.h(i4, "Core pool size ", " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(U.a.g(i5, i4, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(U.a.h(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f2325s = new Y3.k();
        this.f2326t = new Y3.k();
        this.f2327u = new q((i4 + 1) * 2);
        this.controlState$volatile = i4 << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.f2327u) {
            try {
                if (f2320x.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f2319w;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int i5 = i4 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f2321o) {
                    return 0;
                }
                if (i4 >= this.f2322p) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f2327u.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f2327u.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, n nVar) {
        i jVar;
        b bVar;
        k.f2339f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f2333o = nanoTime;
            jVar.f2334p = nVar;
        } else {
            jVar = new j(runnable, nanoTime, nVar);
        }
        boolean z4 = jVar.f2334p.f14098p == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2319w;
        long addAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !S3.e.a(aVar.f2311v, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f2306q) != b.f2316s && (jVar.f2334p.f14098p != 0 || bVar != b.f2313p)) {
            aVar.f2310u = true;
            m mVar = aVar.f2304o;
            mVar.getClass();
            jVar = (i) m.f2343b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f2345a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f2334p.f14098p == 1) {
                        m.f2344e.incrementAndGet(mVar);
                    }
                    int i4 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i4) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i4, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f2334p.f14098p == 1 ? this.f2326t.a(jVar) : this.f2325s.a(jVar))) {
                throw new RejectedExecutionException(n0.a.j(new StringBuilder(), this.f2324r, " was terminated"));
            }
        }
        if (z4) {
            if (f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Z3.c.f2320x
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof Z3.a
            r3 = 0
            if (r1 == 0) goto L17
            Z3.a r0 = (Z3.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            Z3.c r1 = r0.f2311v
            boolean r1 = S3.e.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            Y3.q r1 = r8.f2327u
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = Z3.c.f2319w     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            Y3.q r5 = r8.f2327u
            java.lang.Object r5 = r5.b(r1)
            S3.e.b(r5)
            Z3.a r5 = (Z3.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            Z3.m r5 = r5.f2304o
            Z3.f r6 = r8.f2326t
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = Z3.m.f2343b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            Z3.i r7 = (Z3.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            Z3.i r7 = r5.a()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            Z3.f r1 = r8.f2326t
            r1.b()
            Z3.f r1 = r8.f2325s
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            Z3.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            Z3.f r1 = r8.f2325s
            java.lang.Object r1 = r1.d()
            Z3.i r1 = (Z3.i) r1
            if (r1 != 0) goto Lb2
            Z3.f r1 = r8.f2326t
            java.lang.Object r1 = r1.d()
            Z3.i r1 = (Z3.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            Z3.b r1 = Z3.b.f2316s
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Z3.c.f2318v
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Z3.c.f2319w
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.c.close():void");
    }

    public final void d(a aVar, int i4, int i5) {
        while (true) {
            long j4 = f2318v.get(this);
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i6 == i4) {
                if (i5 == 0) {
                    Object c = aVar.c();
                    while (true) {
                        if (c == y) {
                            i6 = -1;
                            break;
                        }
                        if (c == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) c;
                        int b4 = aVar2.b();
                        if (b4 != 0) {
                            i6 = b4;
                            break;
                        }
                        c = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f2318v.compareAndSet(this, j4, i6 | j5)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j4) {
        int i4 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = this.f2321o;
        if (i4 < i5) {
            int a4 = a();
            if (a4 == 1 && i5 > 1) {
                a();
            }
            if (a4 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f2340g);
    }

    public final boolean f() {
        B0.a aVar;
        int i4;
        while (true) {
            long j4 = f2318v.get(this);
            a aVar2 = (a) this.f2327u.b((int) (2097151 & j4));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j5 = (2097152 + j4) & (-2097152);
                Object c = aVar2.c();
                while (true) {
                    aVar = y;
                    if (c == aVar) {
                        i4 = -1;
                        break;
                    }
                    if (c == null) {
                        i4 = 0;
                        break;
                    }
                    a aVar3 = (a) c;
                    i4 = aVar3.b();
                    if (i4 != 0) {
                        break;
                    }
                    c = aVar3.c();
                }
                if (i4 >= 0) {
                    if (f2318v.compareAndSet(this, j4, i4 | j5)) {
                        aVar2.g(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f2303w.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f2327u;
        int a4 = qVar.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a4; i9++) {
            a aVar = (a) qVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f2304o;
                mVar.getClass();
                int i10 = m.f2343b.get(mVar) != null ? (m.c.get(mVar) - m.d.get(mVar)) + 1 : m.c.get(mVar) - m.d.get(mVar);
                int ordinal = aVar.f2306q.ordinal();
                if (ordinal == 0) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i6++;
                } else if (ordinal == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i8++;
                }
            }
        }
        long j4 = f2319w.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2324r);
        sb4.append('@');
        sb4.append(r.d(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f2321o;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f2322p);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i4);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f2325s.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f2326t.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
