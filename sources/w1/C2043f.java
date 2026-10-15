package w1;

import java.util.Collections;
import java.util.HashMap;
import t3.C2008a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2043f implements q3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2043f f15143a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final q3.c f15144b;
    public static final q3.c c;

    /* JADX WARN: Type inference failed for: r0v0, types: [w1.f, java.lang.Object] */
    static {
        C2008a c2008a = new C2008a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(t3.d.class, c2008a);
        f15144b = new q3.c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)));
        C2008a c2008a2 = new C2008a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(t3.d.class, c2008a2);
        c = new q3.c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // q3.a
    public final void a(Object obj, Object obj2) {
        z1.f fVar = (z1.f) obj;
        q3.e eVar = (q3.e) obj2;
        eVar.a(f15144b, fVar.f15963a);
        eVar.a(c, fVar.f15964b);
    }
}
