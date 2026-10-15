package V3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class g extends f {
    public static String V(String str) {
        S3.e.e(str, "<this>");
        S3.e.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        S3.e.d(substring, "substring(...)");
        return substring;
    }
}
