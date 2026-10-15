package Y3;

import W3.AbstractC0131j;
import W3.AbstractC0134m;
import W3.AbstractC0143w;
import W3.C;
import W3.C0130i;
import W3.b0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends AbstractC0143w implements N3.c, L3.d {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2228v = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0134m f2229r;

    /* renamed from: s, reason: collision with root package name */
    public final N3.b f2230s;

    /* renamed from: t, reason: collision with root package name */
    public Object f2231t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2232u;

    public g(AbstractC0134m abstractC0134m, N3.b bVar) {
        super(-1);
        this.f2229r = abstractC0134m;
        this.f2230s = bVar;
        this.f2231t = a.f2221b;
        L3.i iVar = bVar.f1232p;
        S3.e.b(iVar);
        Object d = iVar.d(0, s.f2251q);
        S3.e.b(d);
        this.f2232u = d;
    }

    @Override // W3.AbstractC0143w
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0131j) {
            throw null;
        }
    }

    @Override // N3.c
    public final N3.c b() {
        N3.b bVar = this.f2230s;
        if (U.a.q(bVar)) {
            return bVar;
        }
        return null;
    }

    @Override // L3.d
    public final void c(Object obj) {
        N3.b bVar = this.f2230s;
        L3.i iVar = bVar.f1232p;
        S3.e.b(iVar);
        Throwable a4 = J3.e.a(obj);
        Object c0130i = a4 == null ? obj : new C0130i(a4);
        AbstractC0134m abstractC0134m = this.f2229r;
        if (abstractC0134m.h()) {
            this.f2231t = c0130i;
            this.f2123q = 0;
            abstractC0134m.g(iVar, this);
            return;
        }
        C a5 = b0.a();
        if (a5.f2062q >= 4294967296L) {
            this.f2231t = c0130i;
            this.f2123q = 0;
            K3.a aVar = a5.f2064s;
            if (aVar == null) {
                aVar = new K3.a();
                a5.f2064s = aVar;
            }
            aVar.addLast(this);
            return;
        }
        a5.k(true);
        try {
            L3.i iVar2 = bVar.f1232p;
            S3.e.b(iVar2);
            Object f4 = a.f(iVar2, this.f2232u);
            try {
                bVar.c(obj);
                do {
                } while (a5.l());
            } finally {
                a.b(iVar2, f4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // W3.AbstractC0143w
    public final L3.d d() {
        return this;
    }

    @Override // L3.d
    public final L3.i getContext() {
        L3.i iVar = this.f2230s.f1232p;
        S3.e.b(iVar);
        return iVar;
    }

    @Override // W3.AbstractC0143w
    public final Object h() {
        Object obj = this.f2231t;
        this.f2231t = a.f2221b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2229r + ", " + W3.r.h(this.f2230s) + ']';
    }
}
