package com.google.android.gms.internal.ads;

import O1.C0081p;
import O1.C0101z0;
import Q1.C0116o;
import android.app.UiModeManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import c3.InterfaceFutureC0239a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import l2.AbstractC1799b;
import o2.AbstractC1895f;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Zf {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f8021a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f8022b = 2;

    public static void A(MediaFormat mediaFormat, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            mediaFormat.setByteBuffer(U.a.i("csd-", i4), ByteBuffer.wrap((byte[]) list.get(i4)));
        }
    }

    public static void B(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                c0(webView, sb2);
            } else {
                handler.post(new Jn(9, webView, sb2));
            }
        }
    }

    public static void C(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void D(String str, boolean z4) {
        if (!z4) {
            throw new Exception(str);
        }
    }

    public static boolean E(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                String optString = jSONArray.optString(i4);
                try {
                } catch (PatternSyntaxException e4) {
                    N1.n.f1204A.f1209g.h("RtbAdapterMap.hasAtleastOneRegexMatch", e4);
                }
                if ((((Boolean) O1.r.d.c.a(AbstractC1066q6.j9)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C0101z0 F(int i4, C0101z0 c0101z0) {
        if (i4 == 0) {
            throw null;
        }
        if (i4 == 8) {
            if (((Integer) O1.r.d.c.a(AbstractC1066q6.k7)).intValue() > 0) {
                return c0101z0;
            }
            i4 = 8;
        }
        return L(i4, null, c0101z0);
    }

    public static File G(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        p(file2, false);
        return file2;
    }

    public static ArrayList H(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(O5.E(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (Oz e4) {
                Y9.p("Unable to deserialize proto from offline signals database:");
                Y9.p(e4.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static void I(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean J(java.lang.String r6, java.lang.CharSequence r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L30
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 != r1) goto L32
            r1 = r2
        Lf:
            if (r1 >= r0) goto L30
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1c
            goto L2d
        L1c:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L32
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 == r4) goto L2d
            goto L32
        L2d:
            int r1 = r1 + 1
            goto Lf
        L30:
            r6 = 1
            return r6
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Zf.J(java.lang.String, java.lang.CharSequence):boolean");
    }

    public static boolean K(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x005b. Please report as an issue. */
    public static C0101z0 L(int i4, String str, C0101z0 c0101z0) {
        String str2;
        int i5 = i4 - 1;
        if (str == null) {
            if (i4 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i5) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) O1.r.d.c.a(AbstractC1066q6.n7)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i4 == 0) {
            throw null;
        }
        int i6 = 0;
        int i7 = 2;
        switch (i5) {
            case 0:
            case 11:
            case 15:
                i7 = i6;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i7 = 1;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 2:
            case 10:
            case 18:
                i7 = 3;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 3:
                i6 = 8;
                i7 = i6;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 4:
            case 8:
            case 17:
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 7:
                i6 = 4;
                i7 = i6;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 12:
                if (((Integer) O1.r.d.c.a(AbstractC1066q6.n7)).intValue() <= 0) {
                    i6 = 9;
                    i7 = i6;
                    return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
                }
                i7 = 3;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 13:
                i6 = 10;
                i7 = i6;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            case 14:
                i6 = 11;
                i7 = i6;
                return new C0101z0(i7, str3, "com.google.android.gms.ads", c0101z0, null);
            default:
                switch (i4) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static void M(SQLiteDatabase sQLiteDatabase, long j4, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j4));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j4)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void N(InterfaceFutureC0239a interfaceFutureC0239a, Aq aq) {
        if (((Boolean) G6.c.r()).booleanValue()) {
            Ku q4 = Ku.q(interfaceFutureC0239a);
            C1384xi c1384xi = new C1384xi(25, aq);
            q4.a(new Nu(0, q4, c1384xi), AbstractC0266Ec.f4900f);
        }
    }

    public static void O(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static final void P(byte[] bArr, String str, B0.c cVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        cVar.g(4007, 0L, null, null, sb.toString());
    }

    public static boolean Q(File file) {
        boolean z4;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z4 = true;
            for (int i4 = 0; i4 < listFiles.length; i4++) {
                File file2 = listFiles[i4];
                z4 = file2 != null && Q(file2) && z4;
            }
        } else {
            z4 = true;
        }
        return file.delete() && z4;
    }

    public static TextView R(Context context, String str, int i4, int i5, float f4, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        W(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f4, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i4);
        textView.setTextColor(i5);
        textView.setText(str);
        return textView;
    }

    public static void S(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean T(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                AbstractC1799b.c(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                AbstractC1799b.c(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                AbstractC1799b.c(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int U(Jp jp) {
        int K2 = AbstractC1895f.K(jp) - 1;
        return (K2 == 0 || K2 == 1) ? 7 : 23;
    }

    public static void V(Bundle bundle, String str, String str2, boolean z4) {
        if (!z4 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void W(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i4;
        layoutParams2.width = i5;
        view.setLayoutParams(layoutParams2);
    }

    public static void X(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void Y(Bundle bundle, String str, boolean z4, boolean z5) {
        if (z5) {
            bundle.putBoolean(str, z4);
        }
    }

    public static void Z(InterfaceFutureC0239a interfaceFutureC0239a, Eq eq, Aq aq, boolean z4) {
        if (((Boolean) G6.c.r()).booleanValue()) {
            Ku q4 = Ku.q(interfaceFutureC0239a);
            A2.o oVar = new A2.o(eq, aq, z4);
            q4.a(new Nu(0, q4, oVar), AbstractC0266Ec.f4900f);
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i4) {
        int i5 = 0;
        if (i4 == 2) {
            return 0;
        }
        Cursor a02 = a0(sQLiteDatabase, i4);
        if (a02.getCount() > 0) {
            a02.moveToNext();
            i5 = a02.getInt(a02.getColumnIndexOrThrow("value"));
        }
        a02.close();
        return i5;
    }

    public static Cursor a0(SQLiteDatabase sQLiteDatabase, int i4) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i4 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i4 == 1) {
            strArr2[0] = "total_requests";
        } else if (i4 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static C0101z0 b(Throwable th) {
        if (th instanceof C0916mm) {
            C0916mm c0916mm = (C0916mm) th;
            return F(c0916mm.f7688o, c0916mm.f9653p);
        }
        if (th instanceof Xk) {
            return th.getMessage() == null ? L(((Xk) th).f7688o, null, null) : L(((Xk) th).f7688o, th.getMessage(), null);
        }
        if (!(th instanceof C0116o)) {
            return L(1, null, null);
        }
        C0116o c0116o = (C0116o) th;
        return new C0101z0(c0116o.f1720o, Bs.O(c0116o.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static void b0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static O1.X0 c(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1477zp c1477zp = (C1477zp) it.next();
            if (c1477zp.c) {
                arrayList.add(H1.f.f865i);
            } else {
                arrayList.add(new H1.f(c1477zp.f11687a, c1477zp.f11688b));
            }
        }
        return new O1.X0(context, (H1.f[]) arrayList.toArray(new H1.f[arrayList.size()]));
    }

    public static final void c0(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        }
    }

    public static Bundle d(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static final Set d0(C1043pk c1043pk, C0260Dc c0260Dc) {
        return ((Boolean) Q6.f6646a.r()).booleanValue() ? Collections.singleton(new Ph(c1043pk, c0260Dc)) : Collections.EMPTY_SET;
    }

    public static C0977o3 e(Context context, String str, String str2) {
        C0977o3 c0977o3;
        try {
            c0977o3 = (C0977o3) ((LinkedBlockingQueue) new C0275Ga(context, str, str2).f5186s).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c0977o3 = null;
        }
        return c0977o3 == null ? C0275Ga.a() : c0977o3;
    }

    public static void e0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.Aq, java.lang.Object] */
    public static Aq f(Context context, int i4) {
        boolean booleanValue;
        if (Fq.a()) {
            int i5 = i4 - 2;
            if (i5 != 20 && i5 != 21) {
                switch (i5) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) G6.c.r()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) G6.d.r()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) G6.f5134b.r()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) G6.f5135e.r()).booleanValue();
            }
            if (booleanValue) {
                return new Bq(context, i4);
            }
        }
        return new Object();
    }

    public static Kr g(Context context, int i4, String str, String str2, B0.c cVar) {
        Kr kr;
        C1178sr c1178sr = new C1178sr(context, i4, str, str2, cVar);
        try {
            kr = (Kr) c1178sr.f10644r.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            c1178sr.b(2009, c1178sr.f10647u, e4);
            kr = null;
        }
        c1178sr.b(3004, c1178sr.f10647u, null);
        if (kr != null) {
            if (kr.f6075q == 7) {
                B0.c.f66s = 3;
            } else {
                B0.c.f66s = 2;
            }
        }
        return kr == null ? new Kr(null, 1, 1) : kr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Zr, java.lang.Object] */
    public static Zr h(A2.h hVar) {
        final ?? obj = new Object();
        obj.f8057v = hVar;
        hVar.b(Iu.f5747o, new A2.d() { // from class: com.google.android.gms.internal.ads.Yr
            @Override // A2.d
            public final void a(A2.h hVar2) {
                boolean h4 = hVar2.h();
                Zr zr = Zr.this;
                if (h4) {
                    zr.cancel(false);
                    return;
                }
                if (hVar2.j()) {
                    zr.f(hVar2.g());
                    return;
                }
                Exception f4 = hVar2.f();
                if (f4 == null) {
                    throw new IllegalStateException();
                }
                zr.g(f4);
            }
        });
        return obj;
    }

    public static String i(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c = charArray[i4];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i4] = (char) (c ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static String j(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (E(optJSONArray2, str) && !E(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static String k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if (xmlPullParser.getAttributeName(i4).equals(str)) {
                return xmlPullParser.getAttributeValue(i4);
            }
        }
        return null;
    }

    public static void l() {
        StringBuilder sb = new StringBuilder();
        boolean z4 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z4) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z4 = true;
        }
        if (z4) {
            throw new Exception(sb.toString());
        }
    }

    public static void m(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void n(Context context, boolean z4) {
        if (z4) {
            Y9.r("This request is sent from a test device.");
            return;
        }
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        Y9.r("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + C1335wc.m(context) + "\")) to get test ads on this device.");
    }

    public static void o(MediaFormat mediaFormat, String str, int i4) {
        if (i4 != -1) {
            mediaFormat.setInteger(str, i4);
        }
    }

    public static void p(File file, boolean z4) {
        if (z4 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void q(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void r(AtomicReference atomicReference, InterfaceC0577ep interfaceC0577ep) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC0577ep.l(obj);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    public static /* synthetic */ boolean s(String str, String str2) {
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int t(android.content.Context r16, B0.c r17) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Zf.t(android.content.Context, B0.c):int");
    }

    public static C0101z0 u(Throwable th, C0959nm c0959nm) {
        C0101z0 c0101z0;
        C0101z0 b4 = b(th);
        int i4 = b4.f1405o;
        if ((i4 == 3 || i4 == 0) && (c0101z0 = b4.f1408r) != null && !c0101z0.f1407q.equals("com.google.android.gms.ads")) {
            b4.f1408r = null;
        }
        if (c0959nm != null) {
            b4.f1409s = new Fg(c0959nm.f9775e, "", c0959nm, c0959nm.d, c0959nm.c);
        }
        return b4;
    }

    public static Aq v(Context context, int i4, int i5, O1.U0 u02) {
        boolean matches;
        Aq f4 = f(context, i4);
        if (f4 instanceof Bq) {
            Bq bq = (Bq) f4;
            bq.e();
            bq.a(i5);
            String str = u02.f1296D;
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) O1.r.d.c.a(AbstractC1066q6.J7), str);
            }
            if (matches) {
                bq.Y(u02.f1296D);
            }
        }
        return f4;
    }

    public static File w(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(G(file, str), str2);
    }

    public static String x(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static String y(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c = charArray[i4];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i4] = (char) (c ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static void z(int i4, Throwable th, String str) {
        Y9.r("Ad failed to load : " + i4);
        Q1.I.x(str, th);
        if (i4 == 3) {
            return;
        }
        N1.n.f1204A.f1209g.g(str, th);
    }
}
