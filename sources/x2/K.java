package x2;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K extends AbstractC2076h0 {
    public char c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public String f15393e;

    /* renamed from: f, reason: collision with root package name */
    public final I f15394f;

    /* renamed from: g, reason: collision with root package name */
    public final I f15395g;

    /* renamed from: h, reason: collision with root package name */
    public final I f15396h;

    /* renamed from: i, reason: collision with root package name */
    public final I f15397i;

    /* renamed from: j, reason: collision with root package name */
    public final I f15398j;

    /* renamed from: k, reason: collision with root package name */
    public final I f15399k;

    /* renamed from: l, reason: collision with root package name */
    public final I f15400l;

    /* renamed from: m, reason: collision with root package name */
    public final I f15401m;

    /* renamed from: n, reason: collision with root package name */
    public final I f15402n;

    public K(C2066c0 c2066c0) {
        super(c2066c0);
        this.c = (char) 0;
        this.d = -1L;
        this.f15394f = new I(this, 6, false, false);
        this.f15395g = new I(this, 6, true, false);
        this.f15396h = new I(this, 6, false, true);
        this.f15397i = new I(this, 5, false, false);
        this.f15398j = new I(this, 5, true, false);
        this.f15399k = new I(this, 5, false, true);
        this.f15400l = new I(this, 4, false, false);
        this.f15401m = new I(this, 3, false, false);
        this.f15402n = new I(this, 2, false, false);
    }

    public static J n(String str) {
        if (str == null) {
            return null;
        }
        return new J(str);
    }

    public static String o(boolean z4, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String p3 = p(obj, z4);
        String p4 = p(obj2, z4);
        String p5 = p(obj3, z4);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(p3)) {
            sb.append(str2);
            sb.append(p3);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(p4)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(p4);
        }
        if (!TextUtils.isEmpty(p5)) {
            sb.append(str3);
            sb.append(p5);
        }
        return sb.toString();
    }

    public static String p(Object obj, boolean z4) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z4) {
                return obj.toString();
            }
            Long l4 = (Long) obj;
            if (Math.abs(l4.longValue()) < 100) {
                return obj.toString();
            }
            String str = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l4.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof J ? ((J) obj).f15387a : z4 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z4 ? th.getClass().getName() : th.toString());
        String canonicalName = C2066c0.class.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            canonicalName = "";
        } else {
            int lastIndexOf = canonicalName.lastIndexOf(46);
            if (lastIndexOf != -1) {
                canonicalName = canonicalName.substring(0, lastIndexOf);
            }
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (TextUtils.isEmpty(className)) {
                    className = "";
                } else {
                    int lastIndexOf2 = className.lastIndexOf(46);
                    if (lastIndexOf2 != -1) {
                        className = className.substring(0, lastIndexOf2);
                    }
                }
                if (className.equals(canonicalName)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
            }
            i4++;
        }
        return sb.toString();
    }

    @Override // x2.AbstractC2076h0
    public final boolean h() {
        return false;
    }

    public final I k() {
        return this.f15394f;
    }

    public final I l() {
        return this.f15402n;
    }

    public final I m() {
        return this.f15397i;
    }

    public final String q() {
        String str;
        synchronized (this) {
            try {
                if (this.f15393e == null) {
                    C2066c0 c2066c0 = (C2066c0) this.f1719a;
                    String str2 = c2066c0.d;
                    if (str2 != null) {
                        this.f15393e = str2;
                    } else {
                        ((C2066c0) c2066c0.f15566g.f1719a).getClass();
                        this.f15393e = "FA";
                    }
                }
                h2.y.i(this.f15393e);
                str = this.f15393e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void r(int i4, boolean z4, boolean z5, String str, Object obj, Object obj2, Object obj3) {
        if (!z4 && Log.isLoggable(q(), i4)) {
            Log.println(i4, q(), o(false, str, obj, obj2, obj3));
        }
        if (z5 || i4 < 5) {
            return;
        }
        h2.y.i(str);
        C2064b0 c2064b0 = ((C2066c0) this.f1719a).f15569j;
        if (c2064b0 == null) {
            Log.println(6, q(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c2064b0.f15673b) {
                Log.println(6, q(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i4 >= 9) {
                i4 = 8;
            }
            c2064b0.o(new H(this, i4, str, obj, obj2, obj3));
        }
    }
}
