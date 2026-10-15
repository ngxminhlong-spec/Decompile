package w1;

import java.util.Collections;
import java.util.HashMap;
import t3.C2008a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039b implements q3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2039b f15136a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final q3.c f15137b;

    /* JADX WARN: Type inference failed for: r0v0, types: [w1.b, java.lang.Object] */
    static {
        C2008a c2008a = new C2008a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(t3.d.class, c2008a);
        f15137b = new q3.c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // q3.a
    public final void a(Object obj, Object obj2) {
        ((q3.e) obj2).d(f15137b, ((z1.b) obj).f15949a);
    }
}
