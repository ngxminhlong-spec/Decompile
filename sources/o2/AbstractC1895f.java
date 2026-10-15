package o2;

import A2.k;
import C0.DialogInterfaceOnDismissListenerC0015o;
import N1.l;
import O1.N;
import O1.U0;
import O1.r;
import W3.C0141u;
import W3.I;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0572ek;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.Jp;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.C1638t;
import f.AbstractActivityC1671f;
import g2.m;
import h2.y;
import j3.C1734a;
import j3.C1735b;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l3.InterfaceC1800a;
import m2.AbstractC1806a;
import n0.n;
import n0.o;
import o1.DialogC1878o;
import x.InterfaceC2054a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1895f {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f14327a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f14328b;
    public static Boolean c;
    public static Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f14329e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f14330f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f14331g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f14332h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f14333i;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f14334j;

    /* renamed from: k, reason: collision with root package name */
    public static Boolean f14335k;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader A() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.AbstractC1895f.A():java.lang.ClassLoader");
    }

    public static Object B(A2.h hVar) {
        if (hVar.j()) {
            return hVar.g();
        }
        if (hVar.h()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.f());
    }

    public static String C(C1638t c1638t) {
        StringBuilder sb = new StringBuilder(c1638t.j());
        for (int i4 = 0; i4 < c1638t.j(); i4++) {
            byte h4 = c1638t.h(i4);
            if (h4 == 34) {
                sb.append("\\\"");
            } else if (h4 == 39) {
                sb.append("\\'");
            } else if (h4 != 92) {
                switch (h4) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (h4 < 32 || h4 > 126) {
                            sb.append('\\');
                            sb.append((char) (((h4 >>> 6) & 3) + 48));
                            sb.append((char) (((h4 >>> 3) & 7) + 48));
                            sb.append((char) ((h4 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) h4);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static void E(int i4, int i5) {
        String y;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                y = android.support.v4.media.session.a.y("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(U.a.i("negative size: ", i5));
                }
                y = android.support.v4.media.session.a.y("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle F(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.AbstractC1895f.F(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public static String G(U0 u02) {
        Bundle bundle;
        return (u02 == null || (bundle = u02.f1308q) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void H(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(L(i4, i5, "index"));
        }
    }

    public static void I(C0828kk c0828kk, C0572ek c0572ek, String str, Pair... pairArr) {
        if (((Boolean) r.d.c.a(AbstractC1066q6.i6)).booleanValue()) {
            AbstractC0266Ec.f4897a.execute(new J1.a(c0828kk, c0572ek, str, pairArr));
        }
    }

    public static void J(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? L(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? L(i5, i6, "end index") : android.support.v4.media.session.a.y("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static int K(Jp jp) {
        if (jp.f5922q) {
            return 2;
        }
        U0 u02 = jp.d;
        N n4 = u02.f1299G;
        String str = u02.f1304L;
        if (n4 == null && str == null) {
            return 1;
        }
        if (n4 == null || str == null) {
            return n4 != null ? 3 : 4;
        }
        return 5;
    }

    public static String L(int i4, int i5, String str) {
        if (i4 < 0) {
            return android.support.v4.media.session.a.y("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return android.support.v4.media.session.a.y("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(U.a.i("negative size: ", i5));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [t.k, java.lang.Object] */
    public static t.j a(C0141u c0141u) {
        ?? obj = new Object();
        obj.c = new Object();
        t.j jVar = new t.j(obj);
        obj.f14833b = jVar;
        obj.f14832a = U.a.class;
        try {
            c0141u.s(false, true, new I(new U.b(obj, c0141u)));
            obj.f14832a = "Deferred.asListenableFuture";
            return jVar;
        } catch (Exception e4) {
            jVar.f14836p.k(e4);
            return jVar;
        }
    }

    public static Object b(A2.h hVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y.h("Must not be called on the main application thread");
        y.g();
        y.j(hVar, "Task must not be null");
        y.j(timeUnit, "TimeUnit must not be null");
        if (hVar.i()) {
            return B(hVar);
        }
        k kVar = new k();
        Executor executor = A2.j.f28b;
        hVar.d(executor, kVar);
        hVar.c(executor, kVar);
        hVar.a(executor, kVar);
        if (kVar.f29a.await(30000L, timeUnit)) {
            return B(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Object c(A2.r rVar) {
        y.h("Must not be called on the main application thread");
        y.g();
        if (rVar.i()) {
            return B(rVar);
        }
        k kVar = new k();
        Executor executor = A2.j.f28b;
        rVar.d(executor, kVar);
        rVar.c(executor, kVar);
        rVar.a(executor, kVar);
        kVar.f29a.await();
        return B(rVar);
    }

    public static A2.r f(Executor executor, Callable callable) {
        y.j(executor, "Executor must not be null");
        A2.r rVar = new A2.r();
        executor.execute(new Nu(7, rVar, callable));
        return rVar;
    }

    public static int g(Context context, String str) {
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new x.g(context).a() ? 0 : -1;
    }

    public static float[] h(float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = fArr[i4];
        }
        return fArr2;
    }

    public static boolean[][] i(boolean[][] zArr) {
        boolean[][] zArr2 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, zArr.length, zArr[0].length);
        for (int i4 = 0; i4 < zArr.length; i4++) {
            boolean[] zArr3 = new boolean[zArr[i4].length];
            int i5 = 0;
            while (true) {
                boolean[] zArr4 = zArr[i4];
                if (i5 < zArr4.length) {
                    zArr3[i5] = zArr4[i5];
                    i5++;
                }
            }
            zArr2[i4] = zArr3;
        }
        return zArr2;
    }

    public static boolean[][] j() {
        return new boolean[][]{new boolean[]{false, false, false, false, false, false, false, false}, new boolean[]{false, false, false, false, false, false, true, false}, new boolean[]{false, false, false, false, true, false, false, false}, new boolean[]{false, false, false, false, true, false, true, false}, new boolean[]{false, false, true, false, false, false, false, false}, new boolean[]{false, false, true, false, false, false, true, false}, new boolean[]{false, false, true, false, true, false, false, false}, new boolean[]{false, false, true, false, true, false, true, false}, new boolean[]{true, false, false, false, false, false, false, false}, new boolean[]{true, false, false, false, false, false, true, false}, new boolean[]{true, false, false, false, true, false, false, false}, new boolean[]{true, false, false, false, true, false, true, false}, new boolean[]{true, false, true, false, false, false, false, false}, new boolean[]{true, false, true, false, false, false, true, false}, new boolean[]{true, false, true, false, true, false, false, false}, new boolean[]{true, false, true, false, true, false, true, false}};
    }

    public static A2.r l(Object obj) {
        A2.r rVar = new A2.r();
        rVar.l(obj);
        return rVar;
    }

    public static int m(View view, int i4) {
        return B.N(i4, view.getContext(), view.getClass().getCanonicalName());
    }

    public static String n(InterfaceC1800a interfaceC1800a) {
        if (interfaceC1800a == null) {
            return null;
        }
        try {
            A2.h a4 = ((C1735b) interfaceC1800a).a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1734a c1734a = (C1734a) b(a4);
            if (c1734a.f13333b != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + c1734a.f13333b);
            }
            return c1734a.f13332a;
        } catch (InterruptedException e4) {
            e = e4;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e6) {
            e = e6;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    public static void o() {
        try {
            if (TextUtils.isEmpty(null)) {
                Log.w("StorageUtil", "no auth token for request");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            Log.e("StorageUtil", "error getting token " + e4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    public static final Class p(T3.b bVar) {
        S3.e.e(bVar, "<this>");
        Class a4 = ((S3.b) bVar).a();
        if (a4.isPrimitive()) {
            String name = a4.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a4;
    }

    public static String q(float f4) {
        String str;
        if (f4 >= 1000.0f) {
            f4 /= 1000.0f;
            str = "ms";
        } else {
            str = "u";
        }
        if (f4 >= 1000.0f) {
            f4 /= 1000.0f;
            if (f4 >= 60.0f) {
                f4 /= 60.0f;
                str = "m";
            } else {
                str = "s";
            }
        }
        return (Math.round(f4 * 100.0f) / 100.0f) + str;
    }

    public static int r(int i4, int i5, float f4) {
        return A.a.b(A.a.d(i5, Math.round(Color.alpha(i5) * f4)), i4);
    }

    public static Uri s(String str) {
        String str2;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = F3.a.f742j;
        str2 = "";
        if (str.toLowerCase().startsWith("gs://")) {
            String K2 = AbstractC1806a.K(str.substring(5));
            if (!TextUtils.isEmpty(K2)) {
                String encode = Uri.encode(K2);
                y.i(encode);
                str2 = encode.replace("%2F", "/");
            }
            return Uri.parse("gs://" + str2);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !(y.m(scheme.toLowerCase(), "http") || y.m(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String encodedPath = parse.getEncodedPath();
        y.i(encodedPath);
        String replace = encodedPath.replace("%2F", "/");
        if (indexOf == 0 && replace.startsWith("/")) {
            int indexOf2 = replace.indexOf("/b/", 0);
            int i4 = indexOf2 + 3;
            int indexOf3 = replace.indexOf("/", i4);
            int indexOf4 = replace.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = replace.substring(i4, indexOf3);
            replace = indexOf4 != -1 ? replace.substring(indexOf4 + 3) : "";
        } else {
            if (indexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = parse.getAuthority().substring(0, indexOf - 1);
        }
        y.f(substring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(substring).encodedPath(replace).build();
    }

    public static void t(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static L3.i u(L3.i iVar, L3.i iVar2) {
        S3.e.e(iVar2, "context");
        return iVar2 == L3.j.f1101o ? iVar : (L3.i) iVar2.d(iVar, L3.b.f1096r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(Activity activity, String[] strArr, int i4) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (TextUtils.isEmpty(strArr[i5])) {
                throw new IllegalArgumentException(n0.a.j(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i5));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    strArr2[i6] = strArr[i7];
                    i6++;
                }
            }
        }
        if ((activity instanceof InterfaceC2054a) && !((AbstractActivityC1671f) ((InterfaceC2054a) activity)).f12833B && i4 != -1) {
            AbstractActivityC1671f.m(i4);
        }
        activity.requestPermissions(strArr, i4);
    }

    public static void w(Activity activity, int i4, boolean z4, boolean z5) {
        if (z5) {
            SharedPreferences.Editor edit = activity.getPreferences(0).edit();
            edit.putBoolean("help" + i4, z4);
            edit.apply();
        }
        switch (i4) {
            case 0:
                c = Boolean.valueOf(z4);
                return;
            case 1:
                d = Boolean.valueOf(z4);
                return;
            case 2:
                f14329e = Boolean.valueOf(z4);
                return;
            case 3:
                f14330f = Boolean.valueOf(z4);
                return;
            case 4:
                f14331g = Boolean.valueOf(z4);
                return;
            case 5:
                f14332h = Boolean.valueOf(z4);
                return;
            case 6:
                f14333i = Boolean.valueOf(z4);
                return;
            case 7:
                f14334j = Boolean.valueOf(z4);
                return;
            case 8:
                f14335k = Boolean.valueOf(z4);
                return;
            default:
                return;
        }
    }

    public static boolean x(AbstractActivityC1671f abstractActivityC1671f, int i4) {
        Boolean bool;
        switch (i4) {
            case 0:
                bool = c;
                break;
            case 1:
                bool = d;
                break;
            case 2:
                bool = f14329e;
                break;
            case 3:
                bool = f14330f;
                break;
            case 4:
                bool = f14331g;
                break;
            case 5:
                bool = f14332h;
                break;
            case 6:
                bool = f14333i;
                break;
            case 7:
                bool = f14334j;
                break;
            case 8:
                bool = f14335k;
                break;
            default:
                bool = null;
                break;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z4 = abstractActivityC1671f.getPreferences(0).getBoolean("help" + i4, true);
        w(abstractActivityC1671f, i4, z4, true);
        return z4;
    }

    public static void y(AbstractActivityC1671f abstractActivityC1671f, int i4, DialogInterfaceOnDismissListenerC0015o dialogInterfaceOnDismissListenerC0015o) {
        if (x(abstractActivityC1671f, i4)) {
            w(abstractActivityC1671f, i4, false, false);
            DialogC1878o a4 = DialogC1878o.a(abstractActivityC1671f, i4);
            a4.setOnDismissListener(dialogInterfaceOnDismissListenerC0015o);
            a4.show();
        }
    }

    public static int z(int i4) {
        int[] iArr = {1, 2, 3};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr[i5];
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i7 == i4) {
                return i6;
            }
        }
        return 1;
    }

    public f2.c d(Context context, Looper looper, l lVar, Object obj, f2.g gVar, f2.h hVar) {
        return e(context, looper, lVar, obj, (m) gVar, (m) hVar);
    }

    public f2.c e(Context context, Looper looper, l lVar, Object obj, m mVar, m mVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public void k(o oVar) {
        List singletonList = Collections.singletonList(oVar);
        o0.l lVar = (o0.l) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        o0.e eVar = new o0.e(lVar, singletonList);
        if (eVar.f14161r0) {
            n.d().i(o0.e.f14156s0, U.a.k("Already enqueued work ids (", TextUtils.join(", ", eVar.f14159p0), ")"), new Throwable[0]);
        } else {
            lVar.f14176o.c(new x0.d(eVar));
        }
    }
}
