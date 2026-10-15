package w1;

import java.util.Collections;
import java.util.HashMap;
import t3.C2008a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038a implements q3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2038a f15133a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final q3.c f15134b;
    public static final q3.c c;
    public static final q3.c d;

    /* renamed from: e, reason: collision with root package name */
    public static final q3.c f15135e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w1.a] */
    static {
        C2008a c2008a = new C2008a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(t3.d.class, c2008a);
        f15134b = new q3.c("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        C2008a c2008a2 = new C2008a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(t3.d.class, c2008a2);
        c = new q3.c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        C2008a c2008a3 = new C2008a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(t3.d.class, c2008a3);
        d = new q3.c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        C2008a c2008a4 = new C2008a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(t3.d.class, c2008a4);
        f15135e = new q3.c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // q3.a
    public final void a(Object obj, Object obj2) {
        z1.a aVar = (z1.a) obj;
        q3.e eVar = (q3.e) obj2;
        eVar.d(f15134b, aVar.f15947a);
        eVar.d(c, aVar.f15948b);
        eVar.d(d, aVar.c);
        eVar.d(f15135e, aVar.d);
    }
}
