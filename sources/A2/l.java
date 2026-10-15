package A2;

import com.google.android.gms.internal.ads.Nu;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f31b;
    public final Object c;
    public final Object d;

    public l(Executor executor, a aVar, r rVar) {
        this.f30a = 0;
        this.f31b = executor;
        this.c = aVar;
        this.d = rVar;
    }

    public l(Executor executor, c cVar) {
        this.f30a = 1;
        this.c = new Object();
        this.f31b = executor;
        this.d = cVar;
    }

    public l(Executor executor, d dVar) {
        this.f30a = 2;
        this.c = new Object();
        this.f31b = executor;
        this.d = dVar;
    }

    public l(Executor executor, e eVar) {
        this.f30a = 3;
        this.c = new Object();
        this.f31b = executor;
        this.d = eVar;
    }

    public l(Executor executor, f fVar) {
        this.f30a = 4;
        this.c = new Object();
        this.f31b = executor;
        this.d = fVar;
    }

    private final void a(h hVar) {
        if (hVar.h()) {
            synchronized (this.c) {
            }
            this.f31b.execute(new A0.a(1, this));
        }
    }

    private final void b(h hVar) {
        synchronized (this.c) {
        }
        this.f31b.execute(new Nu(this, hVar, 4, false));
    }

    private final void c(h hVar) {
        if (hVar.j() || hVar.h()) {
            return;
        }
        synchronized (this.c) {
        }
        this.f31b.execute(new Nu(this, hVar, 5, false));
    }

    @Override // A2.n
    public final void d(h hVar) {
        switch (this.f30a) {
            case 0:
                this.f31b.execute(new Nu(this, hVar, 2, false));
                return;
            case 1:
                a(hVar);
                return;
            case 2:
                b(hVar);
                return;
            case 3:
                c(hVar);
                return;
            default:
                if (hVar.j()) {
                    synchronized (this.c) {
                    }
                    this.f31b.execute(new Nu(this, hVar, 6, false));
                    return;
                }
                return;
        }
    }
}
