package e0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final int f12666o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12667p;

    /* renamed from: q, reason: collision with root package name */
    public final String f12668q;

    /* renamed from: r, reason: collision with root package name */
    public final String f12669r;

    public c(int i4, int i5, String str, String str2) {
        this.f12666o = i4;
        this.f12667p = i5;
        this.f12668q = str;
        this.f12669r = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i4 = this.f12666o - cVar.f12666o;
        return i4 == 0 ? this.f12667p - cVar.f12667p : i4;
    }
}
