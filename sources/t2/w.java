package t2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: q, reason: collision with root package name */
    public final transient int f14942q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f14943r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f14944s;

    public w(x xVar, int i4, int i5) {
        this.f14944s = xVar;
        this.f14942q = i4;
        this.f14943r = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        r.b(i4, this.f14943r);
        return this.f14944s.get(i4 + this.f14942q);
    }

    @Override // t2.u
    public final int i() {
        return this.f14944s.j() + this.f14942q + this.f14943r;
    }

    @Override // t2.u
    public final int j() {
        return this.f14944s.j() + this.f14942q;
    }

    @Override // t2.u
    public final Object[] k() {
        return this.f14944s.k();
    }

    @Override // t2.x, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final x subList(int i4, int i5) {
        r.e(i4, i5, this.f14943r);
        int i6 = this.f14942q;
        return this.f14944s.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14943r;
    }
}
