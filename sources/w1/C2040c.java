package w1;

import java.util.Collections;
import java.util.HashMap;
import t3.C2008a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2040c implements q3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2040c f15138a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final q3.c f15139b;
    public static final q3.c c;

    /* JADX WARN: Type inference failed for: r0v0, types: [w1.c, java.lang.Object] */
    static {
        C2008a c2008a = new C2008a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(t3.d.class, c2008a);
        f15139b = new q3.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)));
        C2008a c2008a2 = new C2008a(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(t3.d.class, c2008a2);
        c = new q3.c("reason", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // q3.a
    public final void a(Object obj, Object obj2) {
        z1.d dVar = (z1.d) obj;
        q3.e eVar = (q3.e) obj2;
        eVar.a(f15139b, dVar.f15959a);
        eVar.d(c, dVar.f15960b);
    }
}
