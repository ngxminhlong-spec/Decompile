package A2;

import com.google.android.gms.internal.ads.Nu;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m implements f, e, c, n {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f32a;

    /* renamed from: b, reason: collision with root package name */
    public final a f33b;
    public final r c;

    public m(Executor executor, a aVar, r rVar) {
        this.f32a = executor;
        this.f33b = aVar;
        this.c = rVar;
    }

    @Override // A2.c
    public final void a() {
        this.c.m();
    }

    @Override // A2.f
    public final void b(Object obj) {
        this.c.l(obj);
    }

    @Override // A2.e
    public final void c(Exception exc) {
        this.c.k(exc);
    }

    @Override // A2.n
    public final void d(h hVar) {
        this.f32a.execute(new Nu(this, hVar, 3, false));
    }
}
