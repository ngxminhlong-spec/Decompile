package L3;

import R3.o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends S3.f implements o {

    /* renamed from: q, reason: collision with root package name */
    public static final b f1095q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f1096r;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1097p;

    static {
        int i4 = 2;
        f1095q = new b(i4, 0);
        f1096r = new b(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, int i5) {
        super(i4);
        this.f1097p = i5;
    }

    @Override // R3.o
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f1097p) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                S3.e.e(str, "acc");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                S3.e.e(iVar, "acc");
                i f4 = iVar.f(gVar2.getKey());
                j jVar = j.f1101o;
                if (f4 == jVar) {
                    return gVar2;
                }
                e eVar = e.f1100o;
                f fVar = (f) f4.b(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, f4);
                } else {
                    i f5 = f4.f(eVar);
                    if (f5 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, f5));
                }
                return cVar;
        }
    }
}
