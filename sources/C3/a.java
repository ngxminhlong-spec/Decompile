package C3;

import S3.e;
import W3.E;
import com.google.android.gms.internal.ads.C0326Qb;
import h3.b;
import h3.c;
import h3.d;
import java.util.concurrent.Executor;
import n3.InterfaceC1817d;
import n3.q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements InterfaceC1817d {

    /* renamed from: p, reason: collision with root package name */
    public static final a f517p = new a(0);

    /* renamed from: q, reason: collision with root package name */
    public static final a f518q = new a(1);

    /* renamed from: r, reason: collision with root package name */
    public static final a f519r = new a(2);

    /* renamed from: s, reason: collision with root package name */
    public static final a f520s = new a(3);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f521o;

    public /* synthetic */ a(int i4) {
        this.f521o = i4;
    }

    @Override // n3.InterfaceC1817d
    public final Object c(C0326Qb c0326Qb) {
        switch (this.f521o) {
            case 0:
                Object d = c0326Qb.d(new q(h3.a.class, Executor.class));
                e.d(d, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d);
            case 1:
                Object d4 = c0326Qb.d(new q(c.class, Executor.class));
                e.d(d4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d4);
            case 2:
                Object d5 = c0326Qb.d(new q(b.class, Executor.class));
                e.d(d5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d5);
            default:
                Object d6 = c0326Qb.d(new q(d.class, Executor.class));
                e.d(d6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d6);
        }
    }
}
