package x2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2082k0 {

    /* renamed from: A, reason: collision with root package name */
    public long f15690A;

    /* renamed from: B, reason: collision with root package name */
    public String f15691B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15692C;

    /* renamed from: D, reason: collision with root package name */
    public long f15693D;

    /* renamed from: E, reason: collision with root package name */
    public long f15694E;

    /* renamed from: a, reason: collision with root package name */
    public final C2066c0 f15695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15696b;
    public String c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f15697e;

    /* renamed from: f, reason: collision with root package name */
    public String f15698f;

    /* renamed from: g, reason: collision with root package name */
    public long f15699g;

    /* renamed from: h, reason: collision with root package name */
    public long f15700h;

    /* renamed from: i, reason: collision with root package name */
    public long f15701i;

    /* renamed from: j, reason: collision with root package name */
    public String f15702j;

    /* renamed from: k, reason: collision with root package name */
    public long f15703k;

    /* renamed from: l, reason: collision with root package name */
    public String f15704l;

    /* renamed from: m, reason: collision with root package name */
    public long f15705m;

    /* renamed from: n, reason: collision with root package name */
    public long f15706n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15707o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15708p;

    /* renamed from: q, reason: collision with root package name */
    public String f15709q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f15710r;

    /* renamed from: s, reason: collision with root package name */
    public long f15711s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f15712t;

    /* renamed from: u, reason: collision with root package name */
    public String f15713u;

    /* renamed from: v, reason: collision with root package name */
    public long f15714v;

    /* renamed from: w, reason: collision with root package name */
    public long f15715w;

    /* renamed from: x, reason: collision with root package name */
    public long f15716x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public long f15717z;

    public C2082k0(C2066c0 c2066c0, String str) {
        h2.y.i(c2066c0);
        h2.y.e(str);
        this.f15695a = c2066c0;
        this.f15696b = str;
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
    }

    public final boolean A() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.f15708p;
    }

    public final long B() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.f15703k;
    }

    public final long C() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.f15711s;
    }

    public final String D() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.f15709q;
    }

    public final String E() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        String str = this.f15691B;
        t(null);
        return str;
    }

    public final String F() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.f15696b;
    }

    public final String G() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.c;
    }

    public final String H() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.f15702j;
    }

    public final String I() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.f15698f;
    }

    public final String J() {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        return this.d;
    }

    public final void a() {
        C2066c0 c2066c0 = this.f15695a;
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        long j4 = this.f15699g + 1;
        if (j4 > 2147483647L) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(K.n(this.f15696b), "Bundle index overflow. appId");
            j4 = 0;
        }
        this.f15692C = true;
        this.f15699g = j4;
    }

    public final void b(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f15692C |= true ^ AbstractC2080j0.d(this.f15709q, str);
        this.f15709q = str;
    }

    public final void c(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= !AbstractC2080j0.d(this.c, str);
        this.c = str;
    }

    public final void d(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= !AbstractC2080j0.d(this.f15704l, str);
        this.f15704l = str;
    }

    public final void e(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= !AbstractC2080j0.d(this.f15702j, str);
        this.f15702j = str;
    }

    public final void f(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15703k != j4;
        this.f15703k = j4;
    }

    public final void g(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15693D != j4;
        this.f15693D = j4;
    }

    public final void h(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.y != j4;
        this.y = j4;
    }

    public final void i(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15717z != j4;
        this.f15717z = j4;
    }

    public final void j(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15716x != j4;
        this.f15716x = j4;
    }

    public final void k(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15715w != j4;
        this.f15715w = j4;
    }

    public final void l(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15690A != j4;
        this.f15690A = j4;
    }

    public final void m(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15714v != j4;
        this.f15714v = j4;
    }

    public final void n(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15706n != j4;
        this.f15706n = j4;
    }

    public final void o(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15711s != j4;
        this.f15711s = j4;
    }

    public final void p(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15694E != j4;
        this.f15694E = j4;
    }

    public final void q(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= !AbstractC2080j0.d(this.f15698f, str);
        this.f15698f = str;
    }

    public final void r(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f15692C |= true ^ AbstractC2080j0.d(this.d, str);
        this.d = str;
    }

    public final void s(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15705m != j4;
        this.f15705m = j4;
    }

    public final void t(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= !AbstractC2080j0.d(this.f15691B, str);
        this.f15691B = str;
    }

    public final void u(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15701i != j4;
        this.f15701i = j4;
    }

    public final void v(long j4) {
        h2.y.b(j4 >= 0);
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15699g != j4;
        this.f15699g = j4;
    }

    public final void w(long j4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15700h != j4;
        this.f15700h = j4;
    }

    public final void x(boolean z4) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= this.f15707o != z4;
        this.f15707o = z4;
    }

    public final void y(String str) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        this.f15692C |= !AbstractC2080j0.d(this.f15697e, str);
        this.f15697e = str;
    }

    public final void z(List list) {
        C2064b0 c2064b0 = this.f15695a.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        if (AbstractC2080j0.d(this.f15712t, list)) {
            return;
        }
        this.f15692C = true;
        this.f15712t = list != null ? new ArrayList(list) : null;
    }
}
