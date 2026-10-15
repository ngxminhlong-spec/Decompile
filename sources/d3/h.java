package d3;

import W3.E;
import com.google.android.gms.internal.ads.C0326Qb;
import java.util.concurrent.Executor;
import n3.InterfaceC1817d;
import n3.q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h implements InterfaceC1817d {

    /* renamed from: p, reason: collision with root package name */
    public static final h f12624p = new h(0);

    /* renamed from: q, reason: collision with root package name */
    public static final h f12625q = new h(1);

    /* renamed from: r, reason: collision with root package name */
    public static final h f12626r = new h(2);

    /* renamed from: s, reason: collision with root package name */
    public static final h f12627s = new h(3);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12628o;

    public /* synthetic */ h(int i4) {
        this.f12628o = i4;
    }

    @Override // n3.InterfaceC1817d
    public final Object c(C0326Qb c0326Qb) {
        switch (this.f12628o) {
            case 0:
                Object d = c0326Qb.d(new q(h3.a.class, Executor.class));
                S3.e.d(d, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d);
            case 1:
                Object d4 = c0326Qb.d(new q(h3.c.class, Executor.class));
                S3.e.d(d4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d4);
            case 2:
                Object d5 = c0326Qb.d(new q(h3.b.class, Executor.class));
                S3.e.d(d5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d5);
            default:
                Object d6 = c0326Qb.d(new q(h3.d.class, Executor.class));
                S3.e.d(d6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new E((Executor) d6);
        }
    }
}
