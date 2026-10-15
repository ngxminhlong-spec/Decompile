package x2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b1 extends AbstractC2076h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f15540g = {"firebase_", "google_", "ga_"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f15541h = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;

    /* renamed from: e, reason: collision with root package name */
    public int f15542e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f15543f;

    public b1(C2066c0 c2066c0) {
        super(c2066c0);
        this.f15543f = null;
        this.d = new AtomicLong(0L);
    }

    public static boolean P(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean R(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean S(String str) {
        h2.y.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean T(Context context) {
        ActivityInfo receiverInfo;
        h2.y.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean U(Context context) {
        ServiceInfo serviceInfo;
        ServiceInfo serviceInfo2;
        h2.y.i(context);
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (serviceInfo2 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                    if (serviceInfo2.enabled) {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 != null && (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }

    public static boolean V(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            h2.y.i(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] W(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean X(int i4, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i4);
        return true;
    }

    public static boolean a0(String str, String[] strArr) {
        h2.y.i(strArr);
        for (Object obj : strArr) {
            if (str == obj) {
                return true;
            }
            if (str != null && str.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static long h0(byte[] bArr) {
        h2.y.i(bArr);
        int length = bArr.length;
        int i4 = 0;
        h2.y.l(length > 0);
        long j4 = 0;
        for (int i5 = length - 1; i5 >= 0 && i5 >= bArr.length - 8; i5--) {
            j4 += (bArr[i5] & 255) << i4;
            i4 += 8;
        }
        return j4;
    }

    public static String m(int i4, String str, boolean z4) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i4) {
            return str;
        }
        if (z4) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i4))).concat("...");
        }
        return null;
    }

    public static MessageDigest n() {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList p(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2065c c2065c = (C2065c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c2065c.f15544o);
            bundle.putString("origin", c2065c.f15545p);
            bundle.putLong("creation_timestamp", c2065c.f15547r);
            bundle.putString("name", c2065c.f15546q.f15508p);
            Object h4 = c2065c.f15546q.h();
            h2.y.i(h4);
            AbstractC2080j0.g(bundle, h4);
            bundle.putBoolean("active", c2065c.f15548s);
            String str = c2065c.f15549t;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C2096s c2096s = c2065c.f15550u;
            if (c2096s != null) {
                bundle.putString("timed_out_event_name", c2096s.f15781o);
                r rVar = c2096s.f15782p;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.h());
                }
            }
            bundle.putLong("trigger_timeout", c2065c.f15551v);
            C2096s c2096s2 = c2065c.f15552w;
            if (c2096s2 != null) {
                bundle.putString("triggered_event_name", c2096s2.f15781o);
                r rVar2 = c2096s2.f15782p;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.h());
                }
            }
            bundle.putLong("triggered_timestamp", c2065c.f15546q.f15509q);
            bundle.putLong("time_to_live", c2065c.f15553x);
            C2096s c2096s3 = c2065c.y;
            if (c2096s3 != null) {
                bundle.putString("expired_event_name", c2096s3.f15781o);
                r rVar3 = c2096s3.f15782p;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.h());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void s(C2111z0 c2111z0, Bundle bundle, boolean z4) {
        if (bundle != null && c2111z0 != null) {
            if (!bundle.containsKey("_sc") || z4) {
                String str = c2111z0.f15861a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c2111z0.f15862b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c2111z0.c);
                return;
            }
            z4 = false;
        }
        if (bundle != null && c2111z0 == null && z4) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void x(a1 a1Var, String str, int i4, String str2, String str3, int i5) {
        Bundle bundle = new Bundle();
        X(i4, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i4 == 6 || i4 == 7 || i4 == 2) {
            bundle.putLong("_el", i5);
        }
        a1Var.l(bundle, str);
    }

    public final void A(com.google.android.gms.internal.measurement.J j4, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning bundle list to wrapper");
        }
    }

    public final void B(com.google.android.gms.internal.measurement.J j4, Bundle bundle) {
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning bundle value to wrapper");
        }
    }

    public final void C(com.google.android.gms.internal.measurement.J j4, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning byte array to wrapper");
        }
    }

    public final void D(com.google.android.gms.internal.measurement.J j4, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i4);
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning int value to wrapper");
        }
    }

    public final void E(com.google.android.gms.internal.measurement.J j4, long j5) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j5);
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning long value to wrapper");
        }
    }

    public final void F(String str, com.google.android.gms.internal.measurement.J j4) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning string value to wrapper");
        }
    }

    public final void G(String str, String str2, Bundle bundle, List list, boolean z4) {
        int e02;
        int K2;
        List list2 = list;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (bundle == null) {
            return;
        }
        c2066c0.getClass();
        G g4 = c2066c0.f15572m;
        K k3 = c2066c0.f15568i;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i4 = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list2 == null || !list2.contains(str3)) {
                e02 = !z4 ? e0(str3) : 0;
                if (e02 == 0) {
                    e02 = d0(str3);
                }
            } else {
                e02 = 0;
            }
            if (e02 != 0) {
                r(bundle, e02, str3, e02 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (P(bundle.get(str3))) {
                    C2066c0.i(k3);
                    k3.f15399k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    K2 = 22;
                } else {
                    K2 = K(str, str3, bundle.get(str3), bundle, list2, z4, false);
                }
                if (K2 != 0 && !"_ev".equals(str3)) {
                    r(bundle, K2, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (S(str3) && !a0(str3, AbstractC2080j0.f15684h) && (i4 = i4 + 1) > 0) {
                    C2066c0.i(k3);
                    k3.f15396h.c(g4.d(str), g4.b(bundle), "Item cannot contain custom parameters");
                    X(23, bundle);
                    bundle.remove(str3);
                }
            }
            list2 = list;
        }
    }

    public final boolean H(String str, String str2) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (!TextUtils.isEmpty(str)) {
            h2.y.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(c2066c0.f15563b)) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15396h.b(K.n(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                h2.y.i(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15396h.b(K.n(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            if (TextUtils.isEmpty(c2066c0.f15563b)) {
                K k5 = c2066c0.f15568i;
                C2066c0.i(k5);
                k5.f15396h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean I(int i4, String str, String str2) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (str2 == null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15396h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i4) {
            return true;
        }
        K k4 = c2066c0.f15568i;
        C2066c0.i(k4);
        k4.f15396h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i4), str2);
        return false;
    }

    public final boolean J(String str, String[] strArr, String[] strArr2, String str2) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (str2 == null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15396h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            if (str2.startsWith(f15540g[i4])) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15396h.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !a0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && a0(str2, strArr2)) {
            return true;
        }
        K k5 = c2066c0.f15568i;
        C2066c0.i(k5);
        k5.f15396h.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.b1.K(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean L(String str, String str2, int i4, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15399k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final boolean M(String str, String str2) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (str2 == null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15396h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15396h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                K k5 = c2066c0.f15568i;
                C2066c0.i(k5);
                k5.f15396h.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                K k6 = c2066c0.f15568i;
                C2066c0.i(k6);
                k6.f15396h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean N(String str, String str2) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (str2 == null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15396h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15396h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            K k5 = c2066c0.f15568i;
            C2066c0.i(k5);
            k5.f15396h.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                K k6 = c2066c0.f15568i;
                C2066c0.i(k6);
                k6.f15396h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean O(String str) {
        g();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (m2.c.a(c2066c0.f15562a).f14053a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15401m.b(str, "Permission not granted");
        return false;
    }

    public final boolean Q(Context context, String str) {
        Signature[] signatureArr;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b4 = m2.c.a(context).b(str, 64);
            if (b4 == null || (signatureArr = b4.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e4) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.b(e4, "Package name not found");
            return true;
        } catch (CertificateException e5) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.b(e5, "Error obtaining certificate");
            return true;
        }
    }

    public final int Y(String str) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if ("_ldl".equals(str)) {
            c2066c0.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c2066c0.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            c2066c0.getClass();
            return 100;
        }
        c2066c0.getClass();
        return 36;
    }

    public final Object Z(int i4, Object obj, boolean z4, boolean z5) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m(i4, obj.toString(), z4);
        }
        if (!z5) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle k02 = k0((Bundle) parcelable);
                if (!k02.isEmpty()) {
                    arrayList.add(k02);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int b0(Object obj, String str) {
        return "_ldl".equals(str) ? L("user property referrer", str, Y(str), obj) : L("user property", str, Y(str), obj) ? 0 : 7;
    }

    public final int c0(String str) {
        if (!M("event", str)) {
            return 2;
        }
        if (!J("event", AbstractC2080j0.f15679a, AbstractC2080j0.f15680b, str)) {
            return 13;
        }
        ((C2066c0) this.f1719a).getClass();
        return !I(40, "event", str) ? 2 : 0;
    }

    public final int d0(String str) {
        if (!M("event param", str)) {
            return 3;
        }
        if (!J("event param", null, null, str)) {
            return 14;
        }
        ((C2066c0) this.f1719a).getClass();
        return !I(40, "event param", str) ? 3 : 0;
    }

    public final int e0(String str) {
        if (!N("event param", str)) {
            return 3;
        }
        if (!J("event param", null, null, str)) {
            return 14;
        }
        ((C2066c0) this.f1719a).getClass();
        return !I(40, "event param", str) ? 3 : 0;
    }

    public final int f0(String str) {
        if (!M("user property", str)) {
            return 6;
        }
        if (!J("user property", AbstractC2080j0.f15685i, null, str)) {
            return 15;
        }
        ((C2066c0) this.f1719a).getClass();
        return !I(24, "user property", str) ? 6 : 0;
    }

    public final int g0() {
        if (this.f15543f == null) {
            e2.f fVar = e2.f.f12753b;
            Context context = ((C2066c0) this.f1719a).f15562a;
            fVar.getClass();
            this.f15543f = Integer.valueOf(e2.f.a(context) / 1000);
        }
        return this.f15543f.intValue();
    }

    @Override // x2.AbstractC2076h0
    public final boolean h() {
        return true;
    }

    public final long i0() {
        long andIncrement;
        long j4;
        if (this.d.get() != 0) {
            synchronized (this.d) {
                this.d.compareAndSet(-1L, 1L);
                andIncrement = this.d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.d) {
            long nanoTime = System.nanoTime();
            ((C2066c0) this.f1719a).f15573n.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i4 = this.f15542e + 1;
            this.f15542e = i4;
            j4 = nextLong + i4;
        }
        return j4;
    }

    public final Bundle j0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("campaign_id", str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e4) {
                K k3 = ((C2066c0) this.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15397i.b(e4, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final Object k(Object obj, String str) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        int i4 = 256;
        if ("_ev".equals(str)) {
            c2066c0.getClass();
            return Z(256, obj, true, true);
        }
        if (R(str)) {
            c2066c0.getClass();
        } else {
            c2066c0.getClass();
            i4 = 100;
        }
        return Z(i4, obj, false, true);
    }

    public final Bundle k0(Bundle bundle) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object k3 = k(bundle.get(str), str);
                if (k3 == null) {
                    K k4 = c2066c0.f15568i;
                    C2066c0.i(k4);
                    k4.f15399k.b(c2066c0.f15572m.e(str), "Param value can't be null");
                } else {
                    y(bundle2, str, k3);
                }
            }
        }
        return bundle2;
    }

    public final Object l(Object obj, String str) {
        return "_ldl".equals(str) ? Z(Y(str), obj, true, false) : Z(Y(str), obj, false, false);
    }

    public final Bundle l0(String str, Bundle bundle, List list, boolean z4) {
        int e02;
        List list2 = list;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        boolean a02 = a0(str, AbstractC2080j0.d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C2073g c2073g = c2066c0.f15566g;
        G g4 = c2066c0.f15572m;
        int j4 = c2073g.j();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i4 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                e02 = !z4 ? e0(str2) : 0;
                if (e02 == 0) {
                    e02 = d0(str2);
                }
            } else {
                e02 = 0;
            }
            if (e02 != 0) {
                r(bundle2, e02, str2, e02 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int K2 = K(str, str2, bundle.get(str2), bundle2, list2, z4, a02);
                if (K2 == 17) {
                    r(bundle2, 17, str2, Boolean.FALSE);
                } else if (K2 != 0 && !"_ev".equals(str2)) {
                    r(bundle2, K2, K2 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (S(str2) && (i4 = i4 + 1) > j4) {
                    K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15396h.c(g4.d(str), g4.b(bundle), "Event can't contain more than " + j4 + " params");
                    X(5, bundle2);
                    bundle2.remove(str2);
                    list2 = list;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final C2096s m0(String str, Bundle bundle, String str2, long j4, boolean z4) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (c0(str) != 0) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.b(c2066c0.f15572m.f(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle l02 = l0(str, bundle2, Collections.singletonList("_o"), true);
        if (z4) {
            l02 = k0(l02);
        }
        h2.y.i(l02);
        return new C2096s(str, new r(l02), str2, j4);
    }

    public final SecureRandom o() {
        g();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final void q(Bundle bundle, long j4) {
        long j5 = bundle.getLong("_et");
        if (j5 != 0) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(Long.valueOf(j5), "Params already contained engagement");
        } else {
            j5 = 0;
        }
        bundle.putLong("_et", j4 + j5);
    }

    public final void r(Bundle bundle, int i4, String str, Object obj) {
        if (X(i4, bundle)) {
            ((C2066c0) this.f1719a).getClass();
            bundle.putString("_ev", m(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void u(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                b1 b1Var = ((C2066c0) this.f1719a).f15571l;
                C2066c0.g(b1Var);
                b1Var.y(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void v(L l4, int i4) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        Bundle bundle = (Bundle) l4.f15407e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (S(str) && (i5 = i5 + 1) > i4) {
                K k3 = c2066c0.f15568i;
                G g4 = c2066c0.f15572m;
                C2066c0.i(k3);
                k3.f15396h.c(g4.d((String) l4.c), g4.b(bundle), "Event can't contain more than " + i4 + " params");
                X(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void y(Bundle bundle, String str, Object obj) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15399k.c(c2066c0.f15572m.e(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final void z(com.google.android.gms.internal.measurement.J j4, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z4);
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning boolean value to wrapper");
        }
    }
}
