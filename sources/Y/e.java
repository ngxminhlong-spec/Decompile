package Y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends N3.b {

    /* renamed from: r, reason: collision with root package name */
    public f f2142r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2143s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f2144t;

    /* renamed from: u, reason: collision with root package name */
    public int f2145u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, L3.d dVar) {
        super(dVar);
        this.f2144t = fVar;
    }

    @Override // N3.b
    public final Object f(Object obj) {
        this.f2143s = obj;
        this.f2145u |= Integer.MIN_VALUE;
        return f.c(this.f2144t, null, this);
    }
}
