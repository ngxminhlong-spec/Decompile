package m2;

import B0.m;
import B0.n;
import B0.p;
import B0.t;
import B0.u;
import B0.v;
import H.G;
import L3.d;
import L3.f;
import L3.i;
import S3.e;
import W3.AbstractC0134m;
import Y3.g;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import c3.InterfaceFutureC0239a;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.J6;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Tw;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import f.AbstractActivityC1671f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import l.J;
import l2.AbstractC1799b;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.C1915a;
import p1.Y;
import q1.AbstractC1959n;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1806a implements G {

    /* renamed from: A, reason: collision with root package name */
    public static String f13992A = null;

    /* renamed from: B, reason: collision with root package name */
    public static Paint f13993B = null;

    /* renamed from: C, reason: collision with root package name */
    public static Field f13994C = null;

    /* renamed from: D, reason: collision with root package name */
    public static boolean f13995D = false;

    /* renamed from: E, reason: collision with root package name */
    public static Class f13996E = null;

    /* renamed from: F, reason: collision with root package name */
    public static boolean f13997F = false;

    /* renamed from: G, reason: collision with root package name */
    public static Field f13998G = null;

    /* renamed from: H, reason: collision with root package name */
    public static boolean f13999H = false;

    /* renamed from: I, reason: collision with root package name */
    public static Field f14000I = null;

    /* renamed from: J, reason: collision with root package name */
    public static boolean f14001J = false;

    /* renamed from: K, reason: collision with root package name */
    public static long f14002K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static Method f14003L = null;

    /* renamed from: M, reason: collision with root package name */
    public static int f14004M = -1;
    public static B0.b N;

    /* renamed from: O, reason: collision with root package name */
    public static HashMap f14005O;

    /* renamed from: P, reason: collision with root package name */
    public static boolean f14006P;

    /* renamed from: Q, reason: collision with root package name */
    public static boolean f14007Q;

    /* renamed from: R, reason: collision with root package name */
    public static boolean f14008R;

    /* renamed from: S, reason: collision with root package name */
    public static boolean f14009S;

    /* renamed from: T, reason: collision with root package name */
    public static boolean f14010T;

    /* renamed from: U, reason: collision with root package name */
    public static boolean f14011U;

    /* renamed from: V, reason: collision with root package name */
    public static Boolean f14012V;

    /* renamed from: W, reason: collision with root package name */
    public static Integer f14013W;

    /* renamed from: X, reason: collision with root package name */
    public static Bitmap f14014X;

    /* renamed from: Y, reason: collision with root package name */
    public static String f14015Y;

    /* renamed from: Z, reason: collision with root package name */
    public static Boolean f14016Z;

    /* renamed from: a, reason: collision with root package name */
    public static Context f14017a;

    /* renamed from: a0, reason: collision with root package name */
    public static Boolean f14018a0;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f14019b;

    /* renamed from: b0, reason: collision with root package name */
    public static Boolean f14020b0;
    public static String c;

    /* renamed from: c0, reason: collision with root package name */
    public static Boolean f14021c0;
    public static String d;

    /* renamed from: d0, reason: collision with root package name */
    public static Boolean f14022d0;

    /* renamed from: e, reason: collision with root package name */
    public static String f14023e;

    /* renamed from: e0, reason: collision with root package name */
    public static Boolean f14024e0;

    /* renamed from: f, reason: collision with root package name */
    public static String f14025f;

    /* renamed from: f0, reason: collision with root package name */
    public static String f14026f0;

    /* renamed from: g, reason: collision with root package name */
    public static String f14027g;

    /* renamed from: g0, reason: collision with root package name */
    public static Long f14028g0;

    /* renamed from: h, reason: collision with root package name */
    public static String f14029h;

    /* renamed from: h0, reason: collision with root package name */
    public static Integer f14030h0;

    /* renamed from: i, reason: collision with root package name */
    public static String f14031i;

    /* renamed from: i0, reason: collision with root package name */
    public static Boolean f14032i0;

    /* renamed from: j, reason: collision with root package name */
    public static String f14033j;

    /* renamed from: j0, reason: collision with root package name */
    public static Integer f14034j0;

    /* renamed from: k, reason: collision with root package name */
    public static String f14035k;

    /* renamed from: k0, reason: collision with root package name */
    public static Boolean f14036k0;

    /* renamed from: l, reason: collision with root package name */
    public static String f14037l;

    /* renamed from: l0, reason: collision with root package name */
    public static Boolean f14038l0;

    /* renamed from: m, reason: collision with root package name */
    public static String f14039m;

    /* renamed from: m0, reason: collision with root package name */
    public static int f14040m0;

    /* renamed from: n, reason: collision with root package name */
    public static String f14041n;

    /* renamed from: o, reason: collision with root package name */
    public static String f14042o;

    /* renamed from: p, reason: collision with root package name */
    public static String f14043p;

    /* renamed from: q, reason: collision with root package name */
    public static String f14044q;

    /* renamed from: r, reason: collision with root package name */
    public static String f14045r;

    /* renamed from: s, reason: collision with root package name */
    public static String f14046s;

    /* renamed from: t, reason: collision with root package name */
    public static String f14047t;

    /* renamed from: u, reason: collision with root package name */
    public static String f14048u;

    /* renamed from: v, reason: collision with root package name */
    public static String f14049v;

    /* renamed from: w, reason: collision with root package name */
    public static String f14050w;

    /* renamed from: x, reason: collision with root package name */
    public static String f14051x;
    public static String y;

    /* renamed from: z, reason: collision with root package name */
    public static String f14052z;

    public static int A(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 == 4) {
            return 5;
        }
        if (i4 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(U.a.h(i4, "Could not convert ", " to State"));
    }

    public static d B(d dVar) {
        e.e(dVar, "<this>");
        N3.b bVar = dVar instanceof N3.b ? (N3.b) dVar : null;
        if (bVar == null || (dVar = bVar.f1233q) != null) {
            return dVar;
        }
        i iVar = bVar.f1232p;
        e.b(iVar);
        f fVar = (f) iVar.b(L3.e.f1100o);
        d gVar = fVar != null ? new g((AbstractC0134m) fVar, bVar) : bVar;
        bVar.f1233q = gVar;
        return gVar;
    }

    public static boolean C(Activity activity) {
        Boolean bool = f14012V;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(activity.getPreferences(0).getBoolean("dark_mode", false));
        f14012V = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean D() {
        if (Build.VERSION.SDK_INT >= 29) {
            return j0.a.a();
        }
        try {
            if (f14003L == null) {
                f14002K = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f14003L = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f14003L.invoke(null, Long.valueOf(f14002K))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean E(Activity activity) {
        Boolean bool = f14016Z;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(activity.getPreferences(0).getBoolean("show_grid", true));
        f14016Z = valueOf;
        return valueOf.booleanValue();
    }

    public static synchronized boolean F(Context context) {
        Boolean bool;
        synchronized (AbstractC1806a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f14017a;
            if (context2 != null && (bool = f14019b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f14019b = null;
            if (AbstractC1799b.f()) {
                f14019b = Boolean.valueOf(J.q(applicationContext.getPackageManager()));
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f14019b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f14019b = Boolean.FALSE;
                }
            }
            f14017a = applicationContext;
            return f14019b.booleanValue();
        }
    }

    public static boolean G(Activity activity) {
        Boolean bool = f14018a0;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(activity.getPreferences(0).getBoolean("enable_snapping", true));
        f14018a0 = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean H(Context context) {
        return context.getResources().getBoolean(R.bool.isTablet);
    }

    public static boolean I(Activity activity) {
        Boolean bool = f14020b0;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(activity.getPreferences(0).getBoolean("enable_vibration", true));
        f14020b0 = valueOf;
        return valueOf.booleanValue();
    }

    public static int J(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static String K(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public static void N(Context context, Bitmap bitmap) {
        File file;
        FileOutputStream fileOutputStream;
        try {
            File file2 = new File(context.getFilesDir() + "/avatar");
            if (file2.exists()) {
                file = new File(file2 + "/avatar.png");
            } else {
                file2.mkdirs();
                file = new File(file2 + "/avatar.png");
                file.delete();
                file.createNewFile();
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                file.delete();
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
            }
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            f14014X = bitmap;
        } catch (Throwable unused2) {
        }
    }

    public static boolean O(Activity activity) {
        int i4;
        if (!AbstractC1959n.d(activity) && !AbstractC1959n.b(activity) && !AbstractC1959n.c(activity)) {
            Integer num = AbstractC1959n.d;
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = activity.getPreferences(0).getInt("billing_result", 0);
                AbstractC1959n.d = Integer.valueOf(i4);
            }
            if (i4 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int P(int i4) {
        int b4 = Z.e.b(i4);
        if (b4 == 0) {
            return 0;
        }
        int i5 = 1;
        if (b4 != 1) {
            i5 = 2;
            if (b4 != 2) {
                i5 = 3;
                if (b4 != 3) {
                    i5 = 4;
                    if (b4 != 4) {
                        if (b4 == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + n0.a.n(i4) + " to int");
                    }
                }
            }
        }
        return i5;
    }

    public static void Q() {
        f14004M++;
        f14008R = false;
        f14009S = false;
        f14010T = false;
        f14011U = false;
        f14005O = new HashMap();
        f14006P = false;
        f14007Q = false;
        B0.b bVar = N;
        if (bVar == null) {
            return;
        }
        bVar.getClass();
        bVar.i(n.b(12));
        try {
            try {
                if (bVar.d != null) {
                    u uVar = bVar.d;
                    t tVar = (t) uVar.f120s;
                    Context context = (Context) uVar.f117p;
                    tVar.c(context);
                    ((t) uVar.f121t).c(context);
                }
                if (bVar.f51h != null) {
                    m mVar = bVar.f51h;
                    synchronized (mVar.f88o) {
                        mVar.f90q = null;
                        mVar.f89p = true;
                    }
                }
                if (bVar.f51h != null && bVar.f50g != null) {
                    AbstractC1629o.d("BillingClient", "Unbinding from service.");
                    bVar.f48e.unbindService(bVar.f51h);
                    bVar.f51h = null;
                }
                bVar.f50g = null;
                ExecutorService executorService = bVar.f65v;
                if (executorService != null) {
                    executorService.shutdownNow();
                    bVar.f65v = null;
                }
            } catch (Exception e4) {
                AbstractC1629o.f("BillingClient", "There was an exception while ending connection!", e4);
            }
            bVar.f46a = 3;
            N = null;
        } catch (Throwable th) {
            bVar.f46a = 3;
            throw th;
        }
    }

    public static final void R(Object obj) {
        if (obj instanceof J3.d) {
            throw ((J3.d) obj).f1031o;
        }
    }

    public static ArrayList S(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            Object obj = jSONArray.get(i4);
            if (obj instanceof JSONArray) {
                obj = S((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = T((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r.e, r.i] */
    public static r.e T(JSONObject jSONObject) {
        ?? iVar = new r.i(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = S((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = T((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            iVar.put(next, obj);
        }
        return iVar;
    }

    public static void U(Context context) {
        boolean z4;
        Object obj = C1421yc.f11357b;
        if (((Boolean) J6.f5785a.r()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (C1421yc.f11357b) {
                        z4 = C1421yc.c;
                    }
                    if (z4) {
                        return;
                    }
                    InterfaceFutureC0239a f4 = new P1.e(context).f();
                    Y9.r("Updating ad debug logging enablement.");
                    AbstractC1230u.k(f4, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e4) {
                Y9.t("Fail to determine debug setting.", e4);
            }
        }
    }

    public static void d(B0.b bVar, Purchase purchase) {
        JSONObject jSONObject = purchase.c;
        String optString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        if (optString == null) {
            throw new IllegalArgumentException("Purchase token must be set");
        }
        B0.a aVar = new B0.a();
        aVar.f45b = optString;
        V2.e eVar = new V2.e(26);
        if (!bVar.a()) {
            bVar.h(n.a(2, 3, p.f102k));
            return;
        }
        if (TextUtils.isEmpty(aVar.f45b)) {
            AbstractC1629o.e("BillingClient", "Please provide a valid purchase token.");
            bVar.h(n.a(26, 3, p.f99h));
        } else if (!bVar.f55l) {
            bVar.h(n.a(27, 3, p.f95b));
        } else if (bVar.g(new v(bVar, aVar, eVar), 30000L, new Nu(11, bVar, eVar), bVar.d()) == null) {
            bVar.h(n.a(25, 3, bVar.f()));
        }
    }

    public static boolean e(Activity activity) {
        Boolean bool = f14021c0;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(activity.getPreferences(0).getBoolean("labels_visible", true));
        f14021c0 = valueOf;
        return valueOf.booleanValue();
    }

    public static void f(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n0.f g(byte[] r7) {
        /*
            n0.f r0 = new n0.f
            r0.<init>()
            if (r7 != 0) goto L8
            goto L55
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            n0.e r5 = new n0.e     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f14088a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L56
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L55
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L55
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L56
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            goto L36
        L55:
            return r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            r1.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.AbstractC1806a.g(byte[]):n0.f");
    }

    public static final J3.d h(Throwable th) {
        e.e(th, "exception");
        return new J3.d(th);
    }

    public static void i(Object obj, String str, String str2) {
        String s4 = s(str);
        if (Log.isLoggable(s4, 3)) {
            Log.d(s4, String.format(str2, obj));
        }
    }

    public static void j(Canvas canvas, Y y4, boolean z4) {
        f13993B.setTextAlign(z4 ? Paint.Align.RIGHT : Paint.Align.LEFT);
        canvas.save();
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(" ");
        C1915a c1915a = y4.f14488R;
        sb.append(c1915a.f14494b);
        String sb2 = sb.toString();
        if (sb2.length() > 25) {
            sb2 = sb2.substring(0, 22) + "...";
        }
        String str = d + " " + c1915a.c;
        if (str.length() > 25) {
            str = str.substring(0, 22) + "...";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f14023e);
        sb3.append(" ");
        int i4 = c1915a.f14493a;
        sb3.append(i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? f14027g : f14035k : f14033j : f14031i : f14029h);
        String sb4 = sb3.toString();
        if (sb4.length() > 25) {
            sb4 = sb4.substring(0, 22) + "...";
        }
        String str2 = f14025f + " " + c1915a.d + "mA";
        if (str2.length() > 25) {
            str2 = str2.substring(0, 22) + "...";
        }
        canvas.drawText(sb2, 0.0f, 0.0f, f13993B);
        canvas.translate(0.0f, f13993B.getTextSize());
        canvas.drawText(str, 0.0f, 0.0f, f13993B);
        canvas.translate(0.0f, f13993B.getTextSize());
        canvas.drawText(sb4, 0.0f, 0.0f, f13993B);
        canvas.translate(0.0f, f13993B.getTextSize());
        canvas.drawText(str2, 0.0f, 0.0f, f13993B);
        canvas.restore();
    }

    public static void k(String str, String str2, Exception exc) {
        String s4 = s(str);
        if (Log.isLoggable(s4, 6)) {
            Log.e(s4, str2, exc);
        }
    }

    public static void l(Object obj) {
        LongSparseArray longSparseArray;
        if (!f13997F) {
            try {
                f13996E = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e4) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e4);
            }
            f13997F = true;
        }
        Class cls = f13996E;
        if (cls == null) {
            return;
        }
        if (!f13999H) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f13998G = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e5);
            }
            f13999H = true;
        }
        Field field = f13998G;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e6) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e6);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static Bitmap m(Context context) {
        if (f14014X == null) {
            try {
                f14014X = BitmapFactory.decodeFile(context.getFilesDir() + "/avatar/avatar.png");
            } catch (Throwable unused) {
            }
        }
        if (f14014X == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.profile_edit_change_size);
            Drawable drawable = context.getDrawable(R.drawable.ic_user);
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i4 = dimensionPixelSize / 2;
            drawable.setBounds(0, 0, i4, i4);
            float f4 = dimensionPixelSize / 4;
            canvas.translate(f4, f4);
            canvas.drawColor(0);
            drawable.draw(canvas);
            f14014X = createBitmap;
            N(context, createBitmap);
        }
        return f14014X;
    }

    public static int n(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static int o(MainActivity mainActivity) {
        Integer num = f14030h0;
        if (num != null) {
            return num.intValue();
        }
        int i4 = mainActivity.getPreferences(0).getInt("launch_times", -1);
        f14030h0 = Integer.valueOf(i4);
        return i4;
    }

    public static ArrayList p(HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        SkuDetails skuDetails = (SkuDetails) hashMap.get("lcs_1.59_monthly");
        if (skuDetails != null) {
            arrayList.add(skuDetails);
        }
        SkuDetails skuDetails2 = (SkuDetails) hashMap.get("lcs_2.99_new_sixmonths2");
        if (skuDetails2 != null) {
            arrayList.add(skuDetails2);
        }
        SkuDetails skuDetails3 = (SkuDetails) hashMap.get("lcs_4.59_oneoff");
        if (skuDetails3 != null) {
            arrayList.add(skuDetails3);
        }
        return arrayList;
    }

    public static String q(AbstractActivityC1671f abstractActivityC1671f) {
        String str = f14015Y;
        if (str != null) {
            return str;
        }
        String string = abstractActivityC1671f.getPreferences(0).getString("username", abstractActivityC1671f.getString(R.string.user));
        f14015Y = string;
        return string;
    }

    public static int r(String str) {
        if (Objects.equals(str, "lcs_1.59_monthly") || Objects.equals(str, "lcs_2.99_monthly")) {
            return 0;
        }
        return Objects.equals(str, "lcs_2.99_new_sixmonths2") ? 1 : 2;
    }

    public static String s(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static int t(Activity activity) {
        int i4;
        Integer num = f14013W;
        if (num != null) {
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(activity.getPreferences(0).getInt("theme", 1));
        f14013W = valueOf;
        switch (valueOf.intValue()) {
            case 2:
                i4 = R.style.AppTheme2;
                break;
            case 3:
                i4 = R.style.AppTheme3;
                break;
            case 4:
                i4 = R.style.AppTheme4;
                break;
            case 5:
                i4 = R.style.AppTheme5;
                break;
            case 6:
                i4 = R.style.AppTheme6;
                break;
            case 7:
                i4 = R.style.AppTheme7;
                break;
            case 8:
                i4 = R.style.AppTheme8;
                break;
            default:
                i4 = R.style.AppTheme;
                break;
        }
        Integer valueOf2 = Integer.valueOf(i4);
        f14013W = valueOf2;
        return valueOf2.intValue();
    }

    public static int u(int i4) {
        switch (i4) {
            case R.id.theme2_container /* 2131296917 */:
                return R.style.AppTheme2;
            case R.id.theme3 /* 2131296918 */:
            case R.id.theme4 /* 2131296920 */:
            case R.id.theme5 /* 2131296922 */:
            case R.id.theme6 /* 2131296924 */:
            case R.id.theme7 /* 2131296926 */:
            case R.id.theme8 /* 2131296928 */:
            default:
                return R.style.AppTheme;
            case R.id.theme3_container /* 2131296919 */:
                return R.style.AppTheme3;
            case R.id.theme4_container /* 2131296921 */:
                return R.style.AppTheme4;
            case R.id.theme5_container /* 2131296923 */:
                return R.style.AppTheme5;
            case R.id.theme6_container /* 2131296925 */:
                return R.style.AppTheme6;
            case R.id.theme7_container /* 2131296927 */:
                return R.style.AppTheme7;
            case R.id.theme8_container /* 2131296929 */:
                return R.style.AppTheme8;
        }
    }

    public static int v(Activity activity) {
        int i4;
        int i5 = f14040m0;
        if (i5 != 0) {
            return i5;
        }
        String string = activity.getPreferences(0).getString("units", "MM");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("MM")) {
            i4 = 1;
        } else {
            if (!string.equals("INCH")) {
                throw new IllegalArgumentException("No enum constant com.duracodefactory.logiccircuitsimulatorpro.view.Grid.Units.".concat(string));
            }
            i4 = 2;
        }
        f14040m0 = i4;
        return i4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.activity.result.c, java.lang.Object] */
    public static void w(MainActivity mainActivity, Runnable runnable) {
        Q();
        Handler handler = new Handler();
        int i4 = f14004M;
        int i5 = 1;
        boolean[] zArr = new boolean[1];
        B1.a aVar = new B1.a(mainActivity, zArr, runnable);
        C2033d c2033d = new C2033d(2);
        ?? obj = new Object();
        obj.f2432b = handler;
        obj.f2431a = i4;
        obj.c = mainActivity;
        B0.b bVar = new B0.b(c2033d, mainActivity, obj);
        Tw tw = new Tw(i4, mainActivity, bVar, handler, zArr, aVar);
        if (bVar.a()) {
            AbstractC1629o.d("BillingClient", "Service connection is valid. No need to re-initialize.");
            bVar.i(n.b(6));
            tw.n(p.f101j);
        } else if (bVar.f46a == 1) {
            AbstractC1629o.e("BillingClient", "Client is already in the process of connecting to billing service.");
            B0.d dVar = p.d;
            bVar.h(n.a(37, 6, dVar));
            tw.n(dVar);
        } else if (bVar.f46a == 3) {
            AbstractC1629o.e("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            B0.d dVar2 = p.f102k;
            bVar.h(n.a(38, 6, dVar2));
            tw.n(dVar2);
        } else {
            bVar.f46a = 1;
            AbstractC1629o.d("BillingClient", "Starting in-app billing setup.");
            bVar.f51h = new m(bVar, tw);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = bVar.f48e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i5 = 41;
            } else {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        AbstractC1629o.e("BillingClient", "The device doesn't have valid Play Store.");
                        i5 = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", bVar.f47b);
                        if (bVar.f48e.bindService(intent2, bVar.f51h, 1)) {
                            AbstractC1629o.d("BillingClient", "Service was bonded successfully.");
                        } else {
                            AbstractC1629o.e("BillingClient", "Connection to Billing service is blocked.");
                            i5 = 39;
                        }
                    }
                }
            }
            bVar.f46a = 0;
            AbstractC1629o.d("BillingClient", "Billing service unavailable on device.");
            B0.d dVar3 = p.c;
            bVar.h(n.a(i5, 6, dVar3));
            tw.n(dVar3);
        }
        N = bVar;
    }

    public static int x(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(U.a.h(i4, "Could not convert ", " to BackoffPolicy"));
    }

    public static int y(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i4 != 5) {
            throw new IllegalArgumentException(U.a.h(i4, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int z(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(U.a.h(i4, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public abstract void L(int i4);

    public abstract void M(Typeface typeface, boolean z4);

    @Override // H.G
    public void b() {
    }

    @Override // H.G
    public void c() {
    }
}
