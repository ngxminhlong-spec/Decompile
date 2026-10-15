package U;

import C0.C0012l;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.AbstractComponentCallbacksC0157f;
import com.google.android.gms.internal.ads.AbstractC1229tz;
import com.google.android.gms.internal.ads.Wj;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1595y1;
import com.google.android.gms.internal.play_billing.C1640u;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String a(int i4) {
        if (i4 == 1) {
            return "htmlDisplay";
        }
        if (i4 == 2) {
            return "nativeDisplay";
        }
        if (i4 == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i4) {
        if (i4 == 1) {
            return "beginToRender";
        }
        if (i4 == 2) {
            return "definedByJavascript";
        }
        if (i4 == 3) {
            return "onePixel";
        }
        if (i4 == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static int c(int i4, int i5, int i6) {
        return AbstractC1229tz.z(i4) + i5 + i6;
    }

    public static int d(int i4, int i5, int i6, int i7) {
        return C1595y1.L(i4) + i5 + i6 + i7;
    }

    public static RemoteException e(String str, Throwable th) {
        Y9.q(str, th);
        return new RemoteException();
    }

    public static Integer f(int i4, C0012l c0012l, Integer num, int i5) {
        c0012l.put(num, Integer.valueOf(i4));
        return Integer.valueOf(i5);
    }

    public static String g(int i4, int i5, String str, String str2) {
        return str + i4 + str2 + i5;
    }

    public static String h(int i4, String str, String str2) {
        return str + i4 + str2;
    }

    public static String i(String str, int i4) {
        return str + i4;
    }

    public static String j(String str, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, String str2) {
        return str + abstractComponentCallbacksC0157f + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, int i4, String str) {
        sb.append(i4);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder m(String str, int i4, String str2, int i5, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i4);
        sb.append(str2);
        sb.append(i5);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static InterfaceC1812a o(Parcel parcel) {
        InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
        parcel.recycle();
        return G12;
    }

    public static void p(int i4, String str, String str2) {
        Wj.l(str2, str + i4);
    }

    public static /* synthetic */ boolean q(Object obj) {
        return obj != null;
    }

    public static int r(int i4, int i5, int i6) {
        return C1595y1.L(i4) + i5 + i6;
    }

    public static int s(int i4, int i5, int i6, int i7) {
        return C1640u.l0(i4) + i5 + i6 + i7;
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static int u(int i4, int i5, int i6) {
        return (C1595y1.c0(i4) * i5) + i6;
    }

    public static int v(int i4, int i5, int i6) {
        return C1640u.l0(i4) + i5 + i6;
    }

    public static /* synthetic */ String w(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }
}
