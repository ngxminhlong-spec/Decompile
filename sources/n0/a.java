package n0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final boolean a(int i4) {
        return i4 == 3 || i4 == 4 || i4 == 6;
    }

    public static boolean b(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final int c(int i4) {
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 3) {
            return 4;
        }
        return i4 == 4 ? 3 : 1;
    }

    public static /* synthetic */ float d(int i4) {
        if (i4 == 1) {
            return 1.0f;
        }
        if (i4 == 2) {
            return 0.04f;
        }
        throw null;
    }

    public static /* synthetic */ char e(int i4) {
        if (i4 == 1) {
            return '0';
        }
        if (i4 == 2) {
            return '1';
        }
        if (i4 == 3) {
            return '2';
        }
        if (i4 == 4) {
            return '3';
        }
        if (i4 == 5) {
            return '4';
        }
        throw null;
    }

    public static /* synthetic */ float f(int i4) {
        if (i4 == 1) {
            return 0.03937008f;
        }
        if (i4 == 2) {
            return 1.0f;
        }
        throw null;
    }

    public static float g(float f4, float f5, float f6, float f7) {
        return ((f4 - f5) * f6) + f7;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String l(int i4) {
        if (i4 == 1) {
            return "MM";
        }
        if (i4 == 2) {
            return "INCH";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i4) {
        switch (i4) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String n(int i4) {
        switch (i4) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
