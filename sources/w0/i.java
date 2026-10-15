package w0;

import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f15115a;

    /* renamed from: b, reason: collision with root package name */
    public int f15116b = 1;
    public String c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public n0.g f15117e;

    /* renamed from: f, reason: collision with root package name */
    public n0.g f15118f;

    /* renamed from: g, reason: collision with root package name */
    public long f15119g;

    /* renamed from: h, reason: collision with root package name */
    public long f15120h;

    /* renamed from: i, reason: collision with root package name */
    public long f15121i;

    /* renamed from: j, reason: collision with root package name */
    public n0.d f15122j;

    /* renamed from: k, reason: collision with root package name */
    public int f15123k;

    /* renamed from: l, reason: collision with root package name */
    public int f15124l;

    /* renamed from: m, reason: collision with root package name */
    public long f15125m;

    /* renamed from: n, reason: collision with root package name */
    public long f15126n;

    /* renamed from: o, reason: collision with root package name */
    public long f15127o;

    /* renamed from: p, reason: collision with root package name */
    public long f15128p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15129q;

    /* renamed from: r, reason: collision with root package name */
    public int f15130r;

    static {
        n.h("WorkSpec");
    }

    public i(String str, String str2) {
        n0.g gVar = n0.g.c;
        this.f15117e = gVar;
        this.f15118f = gVar;
        this.f15122j = n0.d.f14079i;
        this.f15124l = 1;
        this.f15125m = 30000L;
        this.f15128p = -1L;
        this.f15130r = 1;
        this.f15115a = str;
        this.c = str2;
    }

    public final long a() {
        int i4;
        if (this.f15116b == 1 && (i4 = this.f15123k) > 0) {
            return Math.min(18000000L, this.f15124l == 2 ? this.f15125m * i4 : Math.scalb((float) this.f15125m, i4 - 1)) + this.f15126n;
        }
        if (!c()) {
            long j4 = this.f15126n;
            if (j4 == 0) {
                j4 = System.currentTimeMillis();
            }
            return j4 + this.f15119g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = this.f15126n;
        if (j5 == 0) {
            j5 = this.f15119g + currentTimeMillis;
        }
        long j6 = this.f15121i;
        long j7 = this.f15120h;
        if (j6 != j7) {
            return j5 + j7 + (j5 == 0 ? j6 * (-1) : 0L);
        }
        return j5 + (j5 != 0 ? j7 : 0L);
    }

    public final boolean b() {
        return !n0.d.f14079i.equals(this.f15122j);
    }

    public final boolean c() {
        return this.f15120h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15119g != iVar.f15119g || this.f15120h != iVar.f15120h || this.f15121i != iVar.f15121i || this.f15123k != iVar.f15123k || this.f15125m != iVar.f15125m || this.f15126n != iVar.f15126n || this.f15127o != iVar.f15127o || this.f15128p != iVar.f15128p || this.f15129q != iVar.f15129q || !this.f15115a.equals(iVar.f15115a) || this.f15116b != iVar.f15116b || !this.c.equals(iVar.c)) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            if (!str.equals(iVar.d)) {
                return false;
            }
        } else if (iVar.d != null) {
            return false;
        }
        return this.f15117e.equals(iVar.f15117e) && this.f15118f.equals(iVar.f15118f) && this.f15122j.equals(iVar.f15122j) && this.f15124l == iVar.f15124l && this.f15130r == iVar.f15130r;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((Z.e.b(this.f15116b) + (this.f15115a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (this.f15118f.hashCode() + ((this.f15117e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j4 = this.f15119g;
        int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f15120h;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f15121i;
        int b4 = (Z.e.b(this.f15124l) + ((((this.f15122j.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31) + this.f15123k) * 31)) * 31;
        long j7 = this.f15125m;
        int i6 = (b4 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f15126n;
        int i7 = (i6 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f15127o;
        int i8 = (i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f15128p;
        return Z.e.b(this.f15130r) + ((((i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f15129q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return n0.a.j(new StringBuilder("{WorkSpec: "), this.f15115a, "}");
    }
}
