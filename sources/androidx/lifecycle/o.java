package androidx.lifecycle;

import android.os.Looper;
import m.C1801a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class o {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2984h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2985a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n.f f2986b = new n.f();
    public volatile Object c;
    public volatile Object d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2987e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2988f;

    /* renamed from: g, reason: collision with root package name */
    public final D0.o f2989g;

    public o() {
        Object obj = f2984h;
        this.d = obj;
        this.f2989g = new D0.o(18, this);
        this.c = obj;
    }

    public final void a(Object obj) {
        C1801a.j0().f13969h.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke setValue on a background thread");
        }
        this.c = obj;
        if (this.f2987e) {
            this.f2988f = true;
            return;
        }
        this.f2987e = true;
        do {
            this.f2988f = false;
            n.f fVar = this.f2986b;
            fVar.getClass();
            n.d dVar = new n.d(fVar);
            fVar.f14069q.put(dVar, Boolean.FALSE);
            if (dVar.hasNext()) {
                throw null;
            }
        } while (this.f2988f);
        this.f2987e = false;
    }
}
