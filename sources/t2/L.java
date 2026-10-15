package t2;

import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final C1997d f14864a;

    /* renamed from: b, reason: collision with root package name */
    public final C1995b f14865b;
    public final C2003j c;
    public final Object d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final Object f14866e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f14867f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14868g = false;

    /* renamed from: h, reason: collision with root package name */
    public C2033d f14869h = new C2033d(17);

    public L(C1997d c1997d, C1995b c1995b, C2003j c2003j) {
        this.f14864a = c1997d;
        this.f14865b = c1995b;
        this.c = c2003j;
    }

    public final boolean a() {
        int i4 = !d() ? 0 : this.f14864a.f14891b.getInt("consent_status", 0);
        return i4 == 1 || i4 == 3;
    }

    public final int b() {
        if (!d()) {
            return 1;
        }
        String string = this.f14864a.f14891b.getString("privacy_options_requirement_status", "UNKNOWN");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("UNKNOWN")) {
            return 1;
        }
        if (string.equals("NOT_REQUIRED")) {
            return 2;
        }
        if (string.equals("REQUIRED")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.".concat(string));
    }

    public final void c(boolean z4) {
        synchronized (this.f14866e) {
            this.f14868g = z4;
        }
    }

    public final boolean d() {
        boolean z4;
        synchronized (this.d) {
            z4 = this.f14867f;
        }
        return z4;
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.f14866e) {
            z4 = this.f14868g;
        }
        return z4;
    }
}
