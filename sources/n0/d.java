package n0;

import android.os.Build;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f14079i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14081b;
    public boolean c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14082e;

    /* renamed from: a, reason: collision with root package name */
    public int f14080a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f14083f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f14084g = -1;

    /* renamed from: h, reason: collision with root package name */
    public f f14085h = new f();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, n0.d] */
    static {
        f fVar = new f();
        ?? obj = new Object();
        obj.f14080a = 1;
        obj.f14083f = -1L;
        obj.f14084g = -1L;
        obj.f14085h = new f();
        obj.f14081b = false;
        int i4 = Build.VERSION.SDK_INT;
        obj.c = false;
        obj.f14080a = 1;
        obj.d = false;
        obj.f14082e = false;
        if (i4 >= 24) {
            obj.f14085h = fVar;
            obj.f14083f = -1L;
            obj.f14084g = -1L;
        }
        f14079i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f14081b == dVar.f14081b && this.c == dVar.c && this.d == dVar.d && this.f14082e == dVar.f14082e && this.f14083f == dVar.f14083f && this.f14084g == dVar.f14084g && this.f14080a == dVar.f14080a) {
            return this.f14085h.equals(dVar.f14085h);
        }
        return false;
    }

    public final int hashCode() {
        int b4 = ((((((((Z.e.b(this.f14080a) * 31) + (this.f14081b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f14082e ? 1 : 0)) * 31;
        long j4 = this.f14083f;
        int i4 = (b4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f14084g;
        return this.f14085h.f14088a.hashCode() + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }
}
