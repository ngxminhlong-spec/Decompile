package Y3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2243e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2244f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final B0.a f2245g = new B0.a("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f2246a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2247b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public m(int i4, boolean z4) {
        this.f2246a = i4;
        this.f2247b = z4;
        int i5 = i4 - 1;
        this.c = i5;
        this.d = new AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i4 & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2244f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (2305843009213693952L & j4) != 0 ? 2 : 1;
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            int i6 = this.c;
            if (((i5 + 2) & i6) == (i4 & i6)) {
                return 1;
            }
            boolean z4 = this.f2247b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z4 || atomicReferenceArray.get(i5 & i6) == null) {
                if (f2244f.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((i5 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i5 & i6, obj);
                    m mVar = this;
                    while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                        mVar = mVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = mVar.d;
                        int i7 = mVar.c & i5;
                        Object obj2 = atomicReferenceArray2.get(i7);
                        if ((obj2 instanceof l) && ((l) obj2).f2242a == i5) {
                            atomicReferenceArray2.set(i7, obj);
                        } else {
                            mVar = null;
                        }
                        if (mVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i8 = this.f2246a;
                if (i8 < 1024 || ((i5 - i4) & 1073741823) > (i8 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f2244f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f2244f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j5 = 1152921504606846976L | j4;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j4, j5)) {
                j4 = j5;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2243e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f2246a * 2, mVar.f2247b);
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i6 = mVar.c;
                int i7 = i4 & i6;
                if (i7 == (i6 & i5)) {
                    break;
                }
                Object obj = mVar.d.get(i7);
                if (obj == null) {
                    obj = new l(i4);
                }
                mVar3.d.set(mVar3.c & i4, obj);
                i4++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2244f;
            long j4 = atomicLongFieldUpdater.get(mVar);
            if ((j4 & 1152921504606846976L) != 0) {
                return f2245g;
            }
            int i4 = (int) (j4 & 1073741823);
            int i5 = mVar.c;
            int i6 = i4 & i5;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i5) == i6) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.d;
            Object obj = atomicReferenceArray.get(i6);
            boolean z4 = mVar.f2247b;
            if (obj == null) {
                if (z4) {
                    break;
                }
            } else {
                if (obj instanceof l) {
                    break;
                }
                long j5 = (i4 + 1) & 1073741823;
                if (f2244f.compareAndSet(mVar, j4, (j4 & (-1073741824)) | j5)) {
                    atomicReferenceArray.set(i6, null);
                    return obj;
                }
                mVar = this;
                if (z4) {
                    while (true) {
                        long j6 = atomicLongFieldUpdater.get(mVar);
                        int i7 = (int) (j6 & 1073741823);
                        if ((j6 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f2244f.compareAndSet(mVar2, j6, (j6 & (-1073741824)) | j5)) {
                                mVar2.d.set(i7 & mVar2.c, null);
                                mVar = null;
                            } else {
                                mVar = mVar2;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
