package Z3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2303w = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public final m f2304o;

    /* renamed from: p, reason: collision with root package name */
    public final S3.h f2305p;

    /* renamed from: q, reason: collision with root package name */
    public b f2306q;

    /* renamed from: r, reason: collision with root package name */
    public long f2307r;

    /* renamed from: s, reason: collision with root package name */
    public long f2308s;

    /* renamed from: t, reason: collision with root package name */
    public int f2309t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2310u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f2311v;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, S3.h] */
    public a(c cVar, int i4) {
        this.f2311v = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f2304o = new m();
        this.f2305p = new Object();
        this.f2306q = b.f2315r;
        this.nextParkedWorker = c.y;
        int nanoTime = (int) System.nanoTime();
        this.f2309t = nanoTime == 0 ? 42 : nanoTime;
        f(i4);
    }

    public final i a(boolean z4) {
        i e4;
        i e5;
        long j4;
        b bVar = this.f2306q;
        c cVar = this.f2311v;
        i iVar = null;
        m mVar = this.f2304o;
        b bVar2 = b.f2312o;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f2319w;
            do {
                j4 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f2343b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || iVar2.f2334p.f14098p != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i4 = m.d.get(mVar);
                    int i5 = m.c.get(mVar);
                    while (true) {
                        if (i4 == i5 || m.f2344e.get(mVar) == 0) {
                            break;
                        }
                        i5--;
                        i b4 = mVar.b(i5, true);
                        if (b4 != null) {
                            iVar = b4;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f2326t.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f2319w.compareAndSet(cVar, j4, j4 - 4398046511104L));
            this.f2306q = bVar2;
        }
        if (z4) {
            boolean z5 = d(cVar.f2321o * 2) == 0;
            if (z5 && (e5 = e()) != null) {
                return e5;
            }
            mVar.getClass();
            i iVar4 = (i) m.f2343b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z5 && (e4 = e()) != null) {
                return e4;
            }
        } else {
            i e6 = e();
            if (e6 != null) {
                return e6;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i4) {
        int i5 = this.f2309t;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f2309t = i8;
        int i9 = i4 - 1;
        return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
    }

    public final i e() {
        int d = d(2);
        c cVar = this.f2311v;
        if (d == 0) {
            i iVar = (i) cVar.f2325s.d();
            return iVar != null ? iVar : (i) cVar.f2326t.d();
        }
        i iVar2 = (i) cVar.f2326t.d();
        return iVar2 != null ? iVar2 : (i) cVar.f2325s.d();
    }

    public final void f(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2311v.f2324r);
        sb.append("-worker-");
        sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
        setName(sb.toString());
        this.indexInArray = i4;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f2306q;
        boolean z4 = bVar2 == b.f2312o;
        if (z4) {
            c.f2319w.addAndGet(this.f2311v, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f2306q = bVar;
        }
        return z4;
    }

    public final i i(int i4) {
        long j4;
        i iVar;
        long j5;
        long j6;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f2319w;
        c cVar = this.f2311v;
        int i5 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i5 < 2) {
            return null;
        }
        int d = d(i5);
        int i6 = 0;
        long j7 = Long.MAX_VALUE;
        while (i6 < i5) {
            d++;
            if (d > i5) {
                d = 1;
            }
            a aVar = (a) cVar.f2327u.b(d);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f2304o;
                if (i4 == 3) {
                    iVar = mVar.a();
                    j4 = 0;
                } else {
                    mVar.getClass();
                    int i7 = m.d.get(mVar);
                    int i8 = m.c.get(mVar);
                    boolean z4 = i4 == 1;
                    while (true) {
                        if (i7 == i8) {
                            j4 = 0;
                            break;
                        }
                        j4 = 0;
                        if (!z4 || m.f2344e.get(mVar) != 0) {
                            int i9 = i7 + 1;
                            iVar = mVar.b(i7, z4);
                            if (iVar != null) {
                                break;
                            }
                            i7 = i9;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                S3.h hVar = this.f2305p;
                if (iVar != null) {
                    hVar.f1790o = iVar;
                    iVar2 = iVar3;
                    j6 = -1;
                    j5 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f2343b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j5 = -1;
                            break;
                        }
                        j5 = -1;
                        if (((iVar4.f2334p.f14098p == 1 ? 1 : 2) & i4) == 0) {
                            break;
                        }
                        k.f2339f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f2333o;
                        long j8 = k.f2337b;
                        if (nanoTime < j8) {
                            j6 = j8 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                hVar.f1790o = iVar4;
                                j6 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j6 = -2;
                    iVar2 = iVar3;
                }
                if (j6 == j5) {
                    i iVar5 = (i) hVar.f1790o;
                    hVar.f1790o = iVar2;
                    return iVar5;
                }
                if (j6 > j4) {
                    j7 = Math.min(j7, j6);
                }
            }
            i6++;
            iVar3 = null;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = 0;
        }
        this.f2308s = j7;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.a.run():void");
    }
}
