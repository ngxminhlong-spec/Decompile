package s3;

import java.util.Date;
import java.util.HashMap;
import q3.f;
import q3.g;
import r3.InterfaceC1968a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1984d implements InterfaceC1968a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1982b f14804f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1982b f14805g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14807a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14808b;
    public final C1981a c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1981a f14803e = new C1981a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final C1983c f14806h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [s3.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [s3.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [s3.c, java.lang.Object] */
    static {
        final int i4 = 0;
        f14804f = new f() { // from class: s3.b
            @Override // q3.a
            public final void a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        return;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i5 = 1;
        f14805g = new f() { // from class: s3.b
            @Override // q3.a
            public final void a(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        return;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public C1984d() {
        HashMap hashMap = new HashMap();
        this.f14807a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f14808b = hashMap2;
        this.c = f14803e;
        this.d = false;
        hashMap2.put(String.class, f14804f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f14805g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f14806h);
        hashMap.remove(Date.class);
    }

    public final InterfaceC1968a a(Class cls, q3.d dVar) {
        this.f14807a.put(cls, dVar);
        this.f14808b.remove(cls);
        return this;
    }
}
