package l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1778l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f13801a;

    /* renamed from: b, reason: collision with root package name */
    public int f13802b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f13803e;

    /* renamed from: f, reason: collision with root package name */
    public int f13804f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13805g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13806h;

    public final void a(int i4, int i5) {
        this.c = i4;
        this.d = i5;
        this.f13806h = true;
        if (this.f13805g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f13801a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f13802b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f13801a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f13802b = i5;
        }
    }
}
