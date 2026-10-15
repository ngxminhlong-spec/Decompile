package H1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final f f864h = new f(320, 50, "320x50_mb");

    /* renamed from: i, reason: collision with root package name */
    public static final f f865i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f866j;

    /* renamed from: a, reason: collision with root package name */
    public final int f867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f868b;
    public final String c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f869e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f870f;

    /* renamed from: g, reason: collision with root package name */
    public int f871g;

    static {
        new f(468, 60, "468x60_as");
        new f(320, 100, "320x100_as");
        new f(728, 90, "728x90_as");
        new f(300, 250, "300x250_as");
        new f(160, 600, "160x600_as");
        new f(-1, -2, "smart_banner");
        f865i = new f(-3, -4, "fluid");
        f866j = new f(0, 0, "invalid");
        new f(50, 50, "50x50_mb");
        new f(-3, 0, "search_v2");
    }

    public f(int i4, int i5) {
        this(i4, i5, (i4 == -1 ? "FULL" : String.valueOf(i4)) + "x" + (i5 == -2 ? "AUTO" : String.valueOf(i5)) + "_as");
    }

    public f(int i4, int i5, String str) {
        if (i4 < 0 && i4 != -1 && i4 != -3) {
            throw new IllegalArgumentException(U.a.i("Invalid width for AdSize: ", i4));
        }
        if (i5 < 0 && i5 != -2 && i5 != -4) {
            throw new IllegalArgumentException(U.a.i("Invalid height for AdSize: ", i5));
        }
        this.f867a = i4;
        this.f868b = i5;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f867a == fVar.f867a && this.f868b == fVar.f868b && this.c.equals(fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
