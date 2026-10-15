package Q1;

import O1.C0081p;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.AbstractC0587ez;
import com.google.android.gms.internal.ads.AbstractC0649gb;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.Ap;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1384xi;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.C1434yp;
import com.google.android.gms.internal.ads.C1437ys;
import com.google.android.gms.internal.ads.C1452z6;
import com.google.android.gms.internal.ads.GB;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.Js;
import com.google.android.gms.internal.ads.Ks;
import com.google.android.gms.internal.ads.Pj;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;
import com.google.android.gms.internal.ads.Ur;
import com.google.android.gms.internal.ads.Y9;
import d3.AbstractC1654b;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import l2.AbstractC1799b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: k, reason: collision with root package name */
    public static final J f1668k = new Ur(Looper.getMainLooper(), 0);

    /* renamed from: g, reason: collision with root package name */
    public String f1673g;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1669a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f1670b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(new Bundle());
    public final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1671e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1672f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f1674h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1675i = false;

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f1676j = Executors.newSingleThreadExecutor();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.N.A(android.view.View):boolean");
    }

    public static final void B(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String C(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return r(q(context));
    }

    public static final String D() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String E() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : n0.a.i(str, " ", str2);
    }

    public static final HashMap F(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        String optString = optJSONArray.optString(i4);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e4) {
            N1.n.f1204A.f1209g.h("AdUtil.getMapOfFileNamesToKeysFromJsonString", e4);
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long G(View view) {
        float f4 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f4 = Math.min(f4, view2.getAlpha());
            view = view2.getParent();
        } while (f4 > 0.0f);
        return Math.round((f4 >= 0.0f ? f4 : 0.0f) * 100.0f);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.r4, Q1.x] */
    public static final x H(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                Y9.p("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof x ? (x) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 0);
        } catch (Exception e4) {
            N1.n.f1204A.f1209g.h("Failed to instantiate WorkManagerUtil", e4);
            return null;
        }
    }

    public static final boolean I(Context context, String str) {
        int i4 = AbstractC0649gb.f8820a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return m2.c.a(context).f14053a.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean a(Context context) {
        try {
            if (AbstractC1799b.f13963h == null) {
                AbstractC1799b.f13963h = Boolean.valueOf(AbstractC1799b.g() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return AbstractC1799b.f13963h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean b(String str) {
        if (C1421yc.c()) {
            C0937n6 c0937n6 = AbstractC1066q6.n4;
            O1.r rVar = O1.r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                String str2 = (String) rVar.c.a(AbstractC1066q6.p4);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            break;
                        }
                    }
                }
                String str4 = (String) O1.r.d.c.a(AbstractC1066q6.o4);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            Y9.q("Error loading class.", th);
            N1.n.f1204A.f1209g.h("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean e(Context context) {
        try {
            Bundle q4 = q(context);
            String string = q4.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(r(q4))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean f(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void g(View view, int i4) {
        int i5;
        int i6;
        boolean z4;
        String str;
        String str2;
        ?? r6;
        C1434yp x4;
        String str3;
        Ap W4;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof Pj) {
                view2 = ((Pj) view2).getChildAt(0);
            }
            boolean z5 = view2 instanceof V1.e;
            String str4 = z5 ? "NATIVE" : "UNKNOWN";
            if (view2.getLocalVisibleRect(rect)) {
                i6 = rect.width();
                i5 = rect.height();
            } else {
                i5 = 0;
                i6 = 0;
            }
            N n4 = N1.n.f1204A.c;
            long G3 = G(view2);
            view2.getLocationOnScreen(iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            String str5 = "none";
            if (!(view2 instanceof InterfaceC0308Md) || (W4 = ((InterfaceC0308Md) view2).W()) == null) {
                z4 = z5;
                str = "UNKNOWN";
                str2 = "none";
            } else {
                str2 = W4.f3998b;
                int hashCode = view2.hashCode();
                z4 = z5;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                str = "UNKNOWN";
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if (!(view2 instanceof InterfaceC0308Md) || (x4 = ((InterfaceC0308Md) view2).x()) == null) {
                r6 = z4;
            } else {
                switch (x4.f11502b) {
                    case 1:
                        str3 = "BANNER";
                        break;
                    case 2:
                        str3 = "INTERSTITIAL";
                        break;
                    case 3:
                        str3 = "NATIVE_EXPRESS";
                        break;
                    case 4:
                        str3 = "NATIVE";
                        break;
                    case 5:
                        str3 = "REWARDED";
                        break;
                    case 6:
                        str3 = "APP_OPEN_AD";
                        break;
                    case 7:
                        str3 = "REWARDED_INTERSTITIAL";
                        break;
                    default:
                        str3 = str;
                        break;
                }
                int i9 = x4.f11506e;
                str5 = x4.f11479E;
                str4 = str3;
                r6 = i9;
            }
            Locale locale = Locale.US;
            Y9.r("<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str5 + ", gwsQueryId=" + str2 + ", format=" + str4 + ", impType=" + r6 + ", class=" + view2.getClass().getName() + ", x=" + i7 + ", y=" + i8 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i6 + ", vHeight=" + i5 + ", alpha=" + G3 + ", state=" + Integer.toString(i4, 2) + ">");
        } catch (Exception e4) {
            Y9.q("Failure getting view location.", e4);
        }
    }

    public static final AlertDialog.Builder h(Context context) {
        N1.n.f1204A.f1207e.getClass();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void i(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            new y(context, str, (String) obj).f();
        }
    }

    public static final int j(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            Y9.s("Could not parse value:".concat(e4.toString()));
            return 0;
        }
    }

    public static final HashMap k(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final int[] l(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] m(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getTop(), findViewById.getBottom()};
        C0081p c0081p = C0081p.f1374f;
        return new int[]{c0081p.f1375a.d(activity, iArr[0]), c0081p.f1375a.d(activity, iArr[1])};
    }

    public static final boolean n(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z4 = N1.n.f1204A.c.f1671e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || A(view);
        long G3 = G(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z4)) {
            C0937n6 c0937n6 = AbstractC1066q6.f10194Z0;
            O1.r rVar = O1.r.d;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
            if ((!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.W8)).booleanValue() || G3 >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.Y8)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static final void o(Context context, Intent intent) {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.o9)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e4) {
            Y9.t("", e4);
            N1.n.f1204A.f1209g.h("AdUtil.startActivityWithUnknownContext", e4);
        }
    }

    public static final void p(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            B(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            Y9.m("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e4) {
            Y9.q("No browser is found.", e4);
        }
    }

    public static Bundle q(Context context) {
        try {
            return m2.c.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e4) {
            I.x("Error getting metadata", e4);
            return null;
        }
    }

    public static String r(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static boolean s(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int t(int i4) {
        if (i4 >= 5000) {
            return i4;
        }
        if (i4 <= 0) {
            return 60000;
        }
        Y9.s("HTTP timeout too low: " + i4 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static ArrayList v() {
        C0937n6 c0937n6 = AbstractC1066q6.f10197a;
        ArrayList t4 = O1.r.d.f1379a.t();
        ArrayList arrayList = new ArrayList();
        int size = t4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = t4.get(i4);
            i4++;
            String str = (String) obj;
            C1384xi G02 = C1384xi.G0(new C1437ys(','));
            str.getClass();
            Iterator d = ((Ks) G02.f11290p).d(G02, str);
            while (true) {
                Js js = (Js) d;
                if (js.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) js.next()));
                    } catch (NumberFormatException unused) {
                        I.w("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, com.google.android.gms.internal.ads.z6] */
    public static int z(Context context, Uri uri) {
        int i4;
        String b4;
        if (context == null) {
            I.w("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i4 = 0;
        } else {
            I.w("Chrome Custom Tabs can only work with Activity context.");
            i4 = 2;
        }
        C0937n6 c0937n6 = AbstractC1066q6.f10163S3;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        Boolean bool = (Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6);
        C0937n6 c0937n62 = AbstractC1066q6.f10168T3;
        if (true == bool.equals(sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n62))) {
            i4 = 9;
        }
        if (i4 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i4;
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n6)).booleanValue()) {
            ?? obj = new Object();
            obj.d = new q2.e((C1452z6) obj, context, uri);
            Activity activity = (Activity) context;
            if (obj.f11574b == null && (b4 = AbstractC0587ez.b(activity)) != null) {
                GB gb = new GB(obj);
                obj.c = gb;
                gb.f5141p = activity.getApplicationContext();
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(b4)) {
                    intent2.setPackage(b4);
                }
                activity.bindService(intent2, gb, 33);
            }
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n62)).booleanValue()) {
            return 5;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent3.putExtras(bundle);
        }
        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent3.putExtras(new Bundle());
        intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent3.setPackage(AbstractC0587ez.b(context));
        intent3.setData(uri);
        context.startActivity(intent3, null);
        return 5;
    }

    public final String u(Context context, String str) {
        Context context2;
        synchronized (this.f1672f) {
            try {
                String str2 = this.f1673g;
                if (str2 != null) {
                    return str2;
                }
                if (str == null) {
                    return D();
                }
                try {
                    if (B0.f.f73q == null) {
                        B0.f.f73q = new B0.f(2);
                    }
                    B0.f fVar = B0.f.f73q;
                    if (TextUtils.isEmpty(fVar.f75p)) {
                        AtomicBoolean atomicBoolean = e2.h.f12754a;
                        try {
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        } catch (PackageManager.NameNotFoundException unused) {
                            context2 = null;
                        }
                        fVar.f75p = (String) AbstractC1654b.c0(context, new B0.v(1, context2, context));
                    }
                    this.f1673g = fVar.f75p;
                } catch (Exception unused2) {
                }
                if (TextUtils.isEmpty(this.f1673g)) {
                    this.f1673g = WebSettings.getDefaultUserAgent(context);
                }
                if (TextUtils.isEmpty(this.f1673g)) {
                    this.f1673g = D();
                }
                this.f1673g = this.f1673g + " (Mobile; " + str;
                try {
                    if (m2.c.a(context).c()) {
                        this.f1673g = this.f1673g + ";aia";
                    }
                } catch (Exception e4) {
                    N1.n.f1204A.f1209g.h("AdUtil.getUserAgent", e4);
                }
                String str3 = this.f1673g + ")";
                this.f1673g = str3;
                return str3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Context context, String str, HttpURLConnection httpURLConnection, int i4) {
        int t4 = t(i4);
        Y9.r("HTTP timeout: " + t4 + " milliseconds.");
        httpURLConnection.setConnectTimeout(t4);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(t4);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", u(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void x(Context context) {
        if (this.f1675i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC1066q6.a(context);
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.n9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new M(0), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new M(0), intentFilter, 4);
        }
        this.f1675i = true;
    }

    public final void y(Context context) {
        if (this.f1674h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC1066q6.a(context);
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.n9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new E(1, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new E(1, this), intentFilter, 4);
        }
        this.f1674h = true;
    }
}
