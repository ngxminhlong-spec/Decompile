package t2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993A extends x {

    /* renamed from: s, reason: collision with root package name */
    public static final C1993A f14848s = new C1993A(0, new Object[0]);

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f14849q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f14850r;

    public C1993A(int i4, Object[] objArr) {
        this.f14849q = objArr;
        this.f14850r = i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        r.b(i4, this.f14850r);
        Object obj = this.f14849q[i4];
        obj.getClass();
        return obj;
    }

    @Override // t2.x, t2.u
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f14849q;
        int i4 = this.f14850r;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // t2.u
    public final int i() {
        return this.f14850r;
    }

    @Override // t2.u
    public final int j() {
        return 0;
    }

    @Override // t2.u
    public final Object[] k() {
        return this.f14849q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14850r;
    }
}
