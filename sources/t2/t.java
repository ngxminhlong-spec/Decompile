package t2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Gh;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f14937a;

    public static Gh a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new Gh(str2, str3);
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String i6 = n0.a.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(i6), (Throwable) e4);
                    str2 = "<" + i6 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i7 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i7)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i7, indexOf);
            sb.append(objArr[i4]);
            i4++;
            i7 = indexOf + 2;
        }
        sb.append((CharSequence) str, i7, str.length());
        if (i4 < length2) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i8 = i4 + 1; i8 < objArr.length; i8++) {
                sb.append(", ");
                sb.append(objArr[i8]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
