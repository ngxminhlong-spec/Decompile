package W3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132k extends S3.f implements R3.o, R3.k {

    /* renamed from: q, reason: collision with root package name */
    public static final C0132k f2102q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0132k f2103r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0132k f2104s = new C0132k(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2105p;

    static {
        int i4 = 2;
        f2102q = new C0132k(i4, 0);
        f2103r = new C0132k(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0132k(int i4, int i5) {
        super(i4);
        this.f2105p = i5;
    }

    @Override // R3.k
    public Object b(Object obj) {
        L3.g gVar = (L3.g) obj;
        if (gVar instanceof AbstractC0134m) {
            return (AbstractC0134m) gVar;
        }
        return null;
    }

    @Override // R3.o
    public Object d(Object obj, Object obj2) {
        switch (this.f2105p) {
            case 0:
                return ((L3.i) obj).e((L3.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((L3.i) obj).e((L3.g) obj2);
        }
    }
}
