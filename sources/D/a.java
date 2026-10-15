package D;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {
    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            B.c.b(30);
        }
        if (i4 >= 30) {
            B.c.b(31);
        }
        if (i4 >= 30) {
            B.c.b(33);
        }
        if (i4 >= 30) {
            B.c.b(1000000);
        }
    }

    public static final boolean a() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            return true;
        }
        if (i4 >= 30) {
            String str = Build.VERSION.CODENAME;
            S3.e.d(str, "CODENAME");
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                S3.e.d(upperCase, "toUpperCase(...)");
                Integer num = upperCase.equals("BAKLAVA") ? r1 : null;
                String upperCase2 = "S".toUpperCase(locale);
                S3.e.d(upperCase2, "toUpperCase(...)");
                r1 = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num == null || r1 == null) {
                    if (num == null && r1 == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        S3.e.d(upperCase3, "toUpperCase(...)");
                        String upperCase4 = "S".toUpperCase(locale);
                        S3.e.d(upperCase4, "toUpperCase(...)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= r1.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
