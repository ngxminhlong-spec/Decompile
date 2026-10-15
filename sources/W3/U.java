package W3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U implements G {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2079b = AtomicIntegerFieldUpdater.newUpdater(U.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final X f2080a;

    public U(X x4, Throwable th) {
        this.f2080a = x4;
        this._rootCause$volatile = th;
    }

    @Override // W3.G
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            c.set(this, th);
            return;
        }
        if (th == c2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable c() {
        return (Throwable) c.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    @Override // W3.G
    public final X e() {
        return this.f2080a;
    }

    public final boolean f() {
        return f2079b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, r.f2116f);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + d.get(this) + ", list=" + this.f2080a + ']';
    }
}
