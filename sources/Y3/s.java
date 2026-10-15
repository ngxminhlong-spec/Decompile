package Y3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class s extends S3.f implements R3.o {

    /* renamed from: q, reason: collision with root package name */
    public static final s f2251q;

    /* renamed from: r, reason: collision with root package name */
    public static final s f2252r;

    /* renamed from: s, reason: collision with root package name */
    public static final s f2253s;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2254p;

    static {
        int i4 = 2;
        f2251q = new s(i4, 0);
        f2252r = new s(i4, 1);
        f2253s = new s(i4, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i4, int i5) {
        super(i4);
        this.f2254p = i5;
    }

    @Override // R3.o
    public final Object d(Object obj, Object obj2) {
        switch (this.f2254p) {
            case 0:
                return obj;
            case 1:
                U.a.t(obj);
                return null;
            default:
                return (u) obj;
        }
    }
}
