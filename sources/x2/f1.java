package x2;

import com.google.android.gms.internal.measurement.C1539k0;
import com.google.android.gms.internal.measurement.C1551n0;
import com.google.android.gms.internal.measurement.C1559p0;
import com.google.android.gms.internal.measurement.C1563q0;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.S2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15657a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15658b;
    public Boolean c;
    public Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public Long f15659e;

    /* renamed from: f, reason: collision with root package name */
    public Long f15660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2063b f15662h;

    /* renamed from: i, reason: collision with root package name */
    public final I1 f15663i;

    public f1(C2063b c2063b, String str, int i4, I1 i12, int i5) {
        this.f15661g = i5;
        this.f15662h = c2063b;
        this.f15657a = str;
        this.f15658b = i4;
        this.f15663i = i12;
    }

    public static Boolean c(BigDecimal bigDecimal, C1551n0 c1551n0, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        h2.y.i(c1551n0);
        if (c1551n0.q()) {
            if (c1551n0.v() != 1 && (c1551n0.v() != 5 ? c1551n0.r() : c1551n0.u() && c1551n0.t())) {
                int v4 = c1551n0.v();
                try {
                    if (c1551n0.v() == 5) {
                        if (O.P(c1551n0.o()) && O.P(c1551n0.n())) {
                            BigDecimal bigDecimal5 = new BigDecimal(c1551n0.o());
                            bigDecimal4 = new BigDecimal(c1551n0.n());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (O.P(c1551n0.m())) {
                        bigDecimal2 = new BigDecimal(c1551n0.m());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (v4 != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i4 = v4 - 1;
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, C1563q0 c1563q0, K k3) {
        List o4;
        h2.y.i(c1563q0);
        if (str != null && c1563q0.s() && c1563q0.t() != 1 && (c1563q0.t() != 7 ? c1563q0.r() : c1563q0.l() != 0)) {
            int t4 = c1563q0.t();
            boolean p3 = c1563q0.p();
            String n4 = (p3 || t4 == 2 || t4 == 7) ? c1563q0.n() : c1563q0.n().toUpperCase(Locale.ENGLISH);
            if (c1563q0.l() == 0) {
                o4 = null;
            } else {
                o4 = c1563q0.o();
                if (!p3) {
                    ArrayList arrayList = new ArrayList(o4.size());
                    Iterator it = o4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    o4 = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = t4 == 2 ? n4 : null;
            if (t4 != 7 ? n4 != null : o4 != null && !o4.isEmpty()) {
                if (!p3 && t4 != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (t4 - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != p3 ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (k3 != null) {
                                    k3.f15397i.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(n4));
                    case 3:
                        return Boolean.valueOf(str.endsWith(n4));
                    case 4:
                        return Boolean.valueOf(str.contains(n4));
                    case 5:
                        return Boolean.valueOf(str.equals(n4));
                    case 6:
                        if (o4 != null) {
                            return Boolean.valueOf(o4.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(Boolean bool, boolean z4) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r18, java.lang.Long r19, com.google.android.gms.internal.measurement.E0 r20, long r21, x2.C2091p r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.f1.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.E0, long, x2.p, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b(Long l4, Long l5, com.google.android.gms.internal.measurement.T0 t02, boolean z4) {
        S2.a();
        C2066c0 c2066c0 = (C2066c0) this.f15662h.f1719a;
        boolean p3 = c2066c0.f15566g.p(this.f15657a, B.f15283U);
        C1559p0 c1559p0 = (C1559p0) this.f15663i;
        boolean q4 = c1559p0.q();
        boolean r4 = c1559p0.r();
        boolean s4 = c1559p0.s();
        Object[] objArr = q4 || r4 || s4;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z4 && objArr != true) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15402n.c(Integer.valueOf(this.f15658b), c1559p0.t() ? Integer.valueOf(c1559p0.l()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C1539k0 m4 = c1559p0.m();
        boolean q5 = m4.q();
        if (t02.A()) {
            if (m4.s()) {
                try {
                    bool4 = c(new BigDecimal(t02.m()), m4.m(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                bool = e(bool4, q5);
            } else {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15397i.b(c2066c0.f15572m.f(t02.p()), "No number filter for long property. property");
            }
        } else if (t02.z()) {
            if (m4.s()) {
                double l6 = t02.l();
                try {
                    bool3 = c(new BigDecimal(l6), m4.m(), Math.ulp(l6));
                } catch (NumberFormatException unused2) {
                }
                bool = e(bool3, q5);
            } else {
                K k5 = c2066c0.f15568i;
                C2066c0.i(k5);
                k5.f15397i.b(c2066c0.f15572m.f(t02.p()), "No number filter for double property. property");
            }
        } else if (!t02.C()) {
            K k6 = c2066c0.f15568i;
            C2066c0.i(k6);
            k6.f15397i.b(c2066c0.f15572m.f(t02.p()), "User property has no value, property");
        } else if (m4.u()) {
            String q6 = t02.q();
            C1563q0 n4 = m4.n();
            K k7 = c2066c0.f15568i;
            C2066c0.i(k7);
            bool = e(d(q6, n4, k7), q5);
        } else if (!m4.s()) {
            K k8 = c2066c0.f15568i;
            C2066c0.i(k8);
            k8.f15397i.b(c2066c0.f15572m.f(t02.p()), "No string or number filter defined. property");
        } else if (O.P(t02.q())) {
            String q7 = t02.q();
            C1551n0 m5 = m4.m();
            if (O.P(q7)) {
                try {
                    bool2 = c(new BigDecimal(q7), m5, 0.0d);
                } catch (NumberFormatException unused3) {
                }
            }
            bool = e(bool2, q5);
        } else {
            K k9 = c2066c0.f15568i;
            C2066c0.i(k9);
            k9.f15397i.c(c2066c0.f15572m.f(t02.p()), t02.q(), "Invalid user property value for Numeric number filter. property, value");
        }
        K k10 = c2066c0.f15568i;
        C2066c0.i(k10);
        k10.f15402n.b(bool == null ? "null" : bool, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!s4 || bool.booleanValue()) {
            if (!z4 || c1559p0.q()) {
                this.d = bool;
            }
            if (bool.booleanValue() && objArr != false && t02.B()) {
                long n5 = t02.n();
                if (l4 != null) {
                    n5 = l4.longValue();
                }
                if (p3 && c1559p0.q() && !c1559p0.r() && l5 != null) {
                    n5 = l5.longValue();
                }
                if (c1559p0.r()) {
                    this.f15660f = Long.valueOf(n5);
                } else {
                    this.f15659e = Long.valueOf(n5);
                }
            }
        }
        return true;
    }
}
