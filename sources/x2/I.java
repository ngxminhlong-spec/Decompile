package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final int f15382a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15383b;
    public final boolean c;
    public final /* synthetic */ K d;

    public I(K k3, int i4, boolean z4, boolean z5) {
        this.d = k3;
        this.f15382a = i4;
        this.f15383b = z4;
        this.c = z5;
    }

    public final void a(String str) {
        this.d.r(this.f15382a, this.f15383b, this.c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.d.r(this.f15382a, this.f15383b, this.c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.d.r(this.f15382a, this.f15383b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.r(this.f15382a, this.f15383b, this.c, str, obj, obj2, obj3);
    }
}
