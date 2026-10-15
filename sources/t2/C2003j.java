package t2;

import android.util.Log;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Jn;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k.C1748e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2003j {

    /* renamed from: a, reason: collision with root package name */
    public final k.o f14910a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f14911b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();

    public C2003j(k.o oVar, Executor executor) {
        this.f14910a = oVar;
        this.f14911b = executor;
    }

    public final void a() {
        C2004k c2004k = (C2004k) this.c.get();
        if (c2004k == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        C1748e c1748e = (C1748e) this.f14910a.c();
        c1748e.getClass();
        C1995b c1995b = (C1995b) c1748e.f13386p;
        E a4 = E.a(new C1748e(15, (G) c1995b.f14881p));
        G g4 = new G(c2004k);
        k.o oVar = new k.o(16);
        G g5 = (G) c1995b.f14881p;
        E e4 = (E) c1995b.f14885t;
        C1996c c1996c = (C1996c) c1995b.f14887v;
        E e5 = (E) c1995b.f14882q;
        E a5 = E.a(new N1.l(g5, (E) c1995b.f14883r, a4, e5, g4, new C0831kn(19, a4, new N1.l(g5, a4, e4, c1996c, oVar, e5, 5)), 4));
        if (((E) oVar.f13452p) != null) {
            throw new IllegalStateException();
        }
        oVar.f13452p = a5;
        C2000g c2000g = (C2000g) oVar.c();
        c2000g.f14905l = true;
        s.f14935a.post(new Jn(24, this, c2000g));
    }
}
