package Y3;

import W3.AbstractC0134m;
import W3.AbstractC0140t;
import W3.InterfaceC0142v;
import com.google.android.gms.internal.ads.Nu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends AbstractC0134m implements InterfaceC0142v {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2233u = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0134m f2234q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2235r;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: s, reason: collision with root package name */
    public final k f2236s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2237t;

    /* JADX WARN: Multi-variable type inference failed */
    public h(AbstractC0134m abstractC0134m, int i4) {
        this.f2234q = abstractC0134m;
        this.f2235r = i4;
        if ((abstractC0134m instanceof InterfaceC0142v ? (InterfaceC0142v) abstractC0134m : null) == null) {
            int i5 = AbstractC0140t.f2121a;
        }
        this.f2236s = new k();
        this.f2237t = new Object();
    }

    @Override // W3.AbstractC0134m
    public final void g(L3.i iVar, Runnable runnable) {
        this.f2236s.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2233u;
        if (atomicIntegerFieldUpdater.get(this) < this.f2235r) {
            synchronized (this.f2237t) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f2235r) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable i4 = i();
                if (i4 == null) {
                    return;
                }
                this.f2234q.g(this, new Nu(this, i4, 29, false));
            }
        }
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f2236s.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f2237t) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2233u;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2236s.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
