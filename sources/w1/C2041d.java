package w1;

import java.util.Collections;
import java.util.HashMap;
import t3.C2008a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041d implements q3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2041d f15140a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final q3.c f15141b;
    public static final q3.c c;

    /* JADX WARN: Type inference failed for: r0v0, types: [w1.d, java.lang.Object] */
    static {
        C2008a c2008a = new C2008a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(t3.d.class, c2008a);
        f15141b = new q3.c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        C2008a c2008a2 = new C2008a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(t3.d.class, c2008a2);
        c = new q3.c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // q3.a
    public final void a(Object obj, Object obj2) {
        z1.e eVar = (z1.e) obj;
        q3.e eVar2 = (q3.e) obj2;
        eVar2.d(f15141b, eVar.f15961a);
        eVar2.d(c, eVar.f15962b);
    }
}
