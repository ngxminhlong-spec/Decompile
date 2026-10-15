package Y3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2241a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2241a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a4 = mVar.a(runnable);
            if (a4 == 0) {
                return true;
            }
            if (a4 == 1) {
                m c = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a4 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2241a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f2241a.get(this);
        mVar.getClass();
        long j4 = m.f2244f.get(mVar);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2241a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d = mVar.d();
            if (d != m.f2245g) {
                return d;
            }
            m c = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
