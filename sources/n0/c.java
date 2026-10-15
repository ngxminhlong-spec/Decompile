package n0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k.C1748e;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f14073a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new b(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f14074b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new b(true));
    public final t c;
    public final C2033d d;

    /* renamed from: e, reason: collision with root package name */
    public final C1748e f14075e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14076f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14077g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14078h;

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, n0.t] */
    public c(V2.e eVar) {
        String str = u.f14104a;
        this.c = new Object();
        this.d = new C2033d(22);
        this.f14075e = new C1748e(2);
        this.f14076f = 4;
        this.f14077g = Integer.MAX_VALUE;
        this.f14078h = 20;
    }
}
