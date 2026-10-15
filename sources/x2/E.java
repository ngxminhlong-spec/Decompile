package x2;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E extends S {
    public String c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public int f15351e;

    /* renamed from: f, reason: collision with root package name */
    public String f15352f;

    /* renamed from: g, reason: collision with root package name */
    public long f15353g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15354h;

    /* renamed from: i, reason: collision with root package name */
    public List f15355i;

    /* renamed from: j, reason: collision with root package name */
    public String f15356j;

    /* renamed from: k, reason: collision with root package name */
    public int f15357k;

    /* renamed from: l, reason: collision with root package name */
    public String f15358l;

    /* renamed from: m, reason: collision with root package name */
    public String f15359m;

    /* renamed from: n, reason: collision with root package name */
    public String f15360n;

    /* renamed from: o, reason: collision with root package name */
    public long f15361o;

    /* renamed from: p, reason: collision with root package name */
    public String f15362p;

    public E(C2066c0 c2066c0, long j4) {
        super(c2066c0);
        this.f15361o = 0L;
        this.f15362p = null;
        this.f15354h = j4;
    }

    @Override // x2.S
    public final boolean i() {
        return true;
    }

    public final String j() {
        e();
        h2.y.i(this.c);
        return this.c;
    }

    public final String k() {
        g();
        e();
        h2.y.i(this.f15358l);
        return this.f15358l;
    }

    public final void l() {
        String format;
        g();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        T t4 = c2066c0.f15567h;
        K k3 = c2066c0.f15568i;
        C2066c0.g(t4);
        if (t4.l().f(EnumC2075h.f15669q)) {
            byte[] bArr = new byte[16];
            b1 b1Var = c2066c0.f15571l;
            C2066c0.g(b1Var);
            b1Var.o().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C2066c0.i(k3);
            k3.f15401m.a("Analytics Storage consent is not granted");
            format = null;
        }
        C2066c0.i(k3);
        k3.f15401m.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.f15360n = format;
        c2066c0.f15573n.getClass();
        this.f15361o = System.currentTimeMillis();
    }
}
