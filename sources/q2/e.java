package q2;

import A2.h;
import C0.N;
import H.A;
import Q1.AbstractC0115n;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import b0.C0170D;
import b0.C0206s;
import b0.c0;
import b2.InterfaceC0218a;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.C1452z6;
import com.google.android.gms.internal.ads.Gh;
import com.google.android.gms.internal.ads.Jn;
import com.google.android.gms.internal.ads.Tw;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.datepicker.i;
import d3.AbstractC1654b;
import e2.g;
import g.AbstractC1678a;
import g2.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;
import k.C1748e;
import l.J0;
import m2.AbstractC1806a;
import n0.o;
import o1.C1836L;
import o1.InterfaceC1858e;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.C1923i;
import p1.C1930p;
import p1.P;
import p1.a0;
import p1.j0;
import p1.l0;
import t1.EnumC1992c;
import t2.C1996c;
import t2.C1997d;
import t2.C2001h;
import t2.C2003j;
import t2.E;
import t2.EnumC2007n;
import t2.F;
import t2.G;
import t2.I;
import t2.J;
import t2.K;
import t2.L;
import t2.p;
import t2.r;
import v3.C2033d;
import w1.C2046i;
import z.AbstractC2130i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements InterfaceC0218a, y1.b, b1.e, InterfaceC1858e, F, I {

    /* renamed from: s, reason: collision with root package name */
    public static e f14706s;

    /* renamed from: t, reason: collision with root package name */
    public static e f14707t;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14708o;

    /* renamed from: p, reason: collision with root package name */
    public Object f14709p;

    /* renamed from: q, reason: collision with root package name */
    public Object f14710q;

    /* renamed from: r, reason: collision with root package name */
    public Object f14711r;

    public e(int i4) {
        this.f14708o = i4;
        switch (i4) {
            case 4:
                this.f14709p = new ArrayList();
                this.f14710q = new ArrayList();
                this.f14711r = new ArrayList();
                return;
            case 21:
                List list = Collections.EMPTY_LIST;
                this.f14709p = list;
                this.f14710q = list;
                return;
            default:
                this.f14709p = new ArrayList();
                this.f14710q = null;
                this.f14711r = new E2.a(3, this);
                return;
        }
    }

    public /* synthetic */ e(int i4, boolean z4) {
        this.f14708o = i4;
    }

    public e(Context context, int i4) {
        this.f14708o = i4;
        switch (i4) {
            case 15:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(B.N(R.attr.materialCalendarStyle, context, i.class.getCanonicalName()), B2.a.f146l);
                Tw.e(context, obtainStyledAttributes.getResourceId(3, 0));
                this.f14711r = Tw.e(context, obtainStyledAttributes.getResourceId(1, 0));
                Tw.e(context, obtainStyledAttributes.getResourceId(2, 0));
                Tw.e(context, obtainStyledAttributes.getResourceId(4, 0));
                ColorStateList u2 = AbstractC1654b.u(context, obtainStyledAttributes, 5);
                this.f14709p = Tw.e(context, obtainStyledAttributes.getResourceId(7, 0));
                Tw.e(context, obtainStyledAttributes.getResourceId(6, 0));
                this.f14710q = Tw.e(context, obtainStyledAttributes.getResourceId(8, 0));
                new Paint().setColor(u2.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f14710q = newSingleThreadScheduledExecutor;
                this.f14711r = Executors.newSingleThreadExecutor();
                this.f14709p = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new x(11, this), 0L, 86400L, TimeUnit.SECONDS);
                return;
        }
    }

    public e(Context context, TypedArray typedArray) {
        this.f14708o = 19;
        this.f14709p = context;
        this.f14710q = typedArray;
    }

    public e(Context context, LocationManager locationManager) {
        this.f14708o = 17;
        this.f14711r = new Object();
        this.f14709p = context;
        this.f14710q = locationManager;
    }

    public e(l lVar) {
        this.f14708o = 6;
        this.f14709p = new k(lVar);
        this.f14710q = new Handler();
    }

    public e(v vVar, t tVar) {
        this.f14708o = 7;
        S3.e.e(vVar, "store");
        R.a aVar = R.a.f1749b;
        S3.e.e(aVar, "defaultCreationExtras");
        this.f14709p = vVar;
        this.f14710q = tVar;
        this.f14711r = aVar;
    }

    public e(C0170D c0170d) {
        this.f14708o = 8;
        this.f14709p = c0170d;
        this.f14710q = new N1.d(1);
        this.f14711r = new ArrayList();
    }

    public e(TimeDiagramLayout timeDiagramLayout, m1.c cVar, AlertDialog alertDialog) {
        this.f14708o = 22;
        this.f14711r = timeDiagramLayout;
        this.f14709p = cVar;
        this.f14710q = alertDialog;
    }

    public e(C1452z6 c1452z6, Context context, Uri uri) {
        this.f14708o = 5;
        this.f14710q = c1452z6;
        this.f14709p = context;
        this.f14711r = uri;
    }

    public e(Class cls) {
        this.f14708o = 20;
        HashSet hashSet = new HashSet();
        this.f14711r = hashSet;
        this.f14709p = UUID.randomUUID();
        this.f14710q = new w0.i(((UUID) this.f14709p).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((w0.i) this.f14710q).d = OverwritingInputMerger.class.getName();
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i4) {
        this.f14708o = i4;
        this.f14709p = obj;
        this.f14710q = obj2;
        this.f14711r = obj3;
    }

    public static final SharedPreferences F(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void G(Context context) {
        if (F(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new Exception("Failed to store the app set ID last used time.");
    }

    public static e w(Context context, AttributeSet attributeSet, int[] iArr, int i4) {
        return new e(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    public void A(View view) {
        if (((ArrayList) this.f14711r).remove(view)) {
            C0170D c0170d = (C0170D) this.f14709p;
            c0 J4 = RecyclerView.J(view);
            if (J4 != null) {
                RecyclerView recyclerView = c0170d.f3175a;
                int i4 = J4.f3257p;
                if (recyclerView.M()) {
                    J4.f3258q = i4;
                    recyclerView.f3038G0.add(J4);
                } else {
                    View view2 = J4.f3244a;
                    WeakHashMap weakHashMap = A.f779a;
                    view2.setImportantForAccessibility(i4);
                }
                J4.f3257p = 0;
            }
        }
    }

    public e B() {
        return new e((J) ((E) this.f14709p).c(), ((C1996c) this.f14710q).c(), (C1997d) ((E) this.f14711r).c(), 23);
    }

    public void C(String str, double d, double d4) {
        ArrayList arrayList = (ArrayList) this.f14710q;
        ArrayList arrayList2 = (ArrayList) this.f14711r;
        ArrayList arrayList3 = (ArrayList) this.f14709p;
        int i4 = 0;
        while (i4 < arrayList3.size()) {
            double doubleValue = ((Double) arrayList2.get(i4)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(i4)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d4 < doubleValue2)) {
                break;
            } else {
                i4++;
            }
        }
        arrayList3.add(i4, str);
        arrayList2.add(i4, Double.valueOf(d));
        arrayList.add(i4, Double.valueOf(d4));
    }

    public e D() {
        return new e((Application) ((G) this.f14709p).f14862o, ((C1748e) this.f14710q).v(), (C1997d) ((E) this.f14711r).c(), 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t2.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [androidx.activity.result.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, t2.o] */
    public p E(Activity activity, C2033d c2033d) {
        Bundle bundle;
        String string;
        String str;
        ArrayList arrayList;
        PackageInfo packageInfo;
        List<Rect> boundingRects;
        c2033d.getClass();
        Application application = (Application) this.f14709p;
        boolean z4 = r.d() || new ArrayList().contains(r.a(application.getApplicationContext()));
        ?? obj = new Object();
        obj.f14926f = Collections.EMPTY_MAP;
        obj.f14930j = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new K("The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">", 3);
            }
        } else {
            string = null;
        }
        obj.f14923a = string;
        C1748e c1748e = (C1748e) this.f14710q;
        c1748e.getClass();
        try {
            str = L1.b.a((Application) c1748e.f13386p).f1075a;
        } catch (g | IOException e4) {
            Log.d("UserMessagingPlatform", "Failed to get ad id.", e4);
            str = null;
        }
        if (str != null) {
            obj.f14924b = str;
        }
        if (z4) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(EnumC2007n.f14919o);
            arrayList = arrayList2;
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        obj.f14930j = arrayList;
        obj.f14926f = ((C1997d) this.f14711r).a();
        obj.f14925e = Boolean.FALSE;
        int i4 = Build.VERSION.SDK_INT;
        obj.d = Locale.getDefault().toLanguageTag();
        ?? obj2 = new Object();
        obj2.f2431a = 1;
        obj2.c = Integer.valueOf(i4);
        obj2.f2432b = Build.MODEL;
        obj2.f2431a = 2;
        obj.c = obj2;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        u0.g gVar = new u0.g(21, false);
        ?? r6 = Collections.EMPTY_LIST;
        gVar.f14986s = r6;
        gVar.f14983p = Integer.valueOf(configuration.screenWidthDp);
        gVar.f14984q = Integer.valueOf(configuration.screenHeightDp);
        gVar.f14985r = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i4 >= 28) {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                r6 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        ?? obj3 = new Object();
                        obj3.f14922b = Integer.valueOf(rect.left);
                        obj3.c = Integer.valueOf(rect.right);
                        obj3.f14921a = Integer.valueOf(rect.top);
                        obj3.d = Integer.valueOf(rect.bottom);
                        r6.add(obj3);
                    }
                }
            }
        }
        gVar.f14986s = r6;
        obj.f14927g = gVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        e eVar = new e(26, false);
        eVar.f14709p = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        eVar.f14710q = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            eVar.f14711r = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        obj.f14928h = eVar;
        obj.f14929i = new C2001h(2);
        return obj;
    }

    @Override // t2.I
    public boolean a(String str, JSONObject jSONObject) {
        C1997d c1997d = (C1997d) this.f14710q;
        Application application = (Application) this.f14709p;
        int hashCode = str.hashCode();
        if (hashCode == 94746189) {
            if (str.equals("clear")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("keys");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
                    return true;
                }
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    String optString = optJSONArray.optString(i4);
                    if (TextUtils.isEmpty(optString)) {
                        Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i4);
                    } else {
                        hashSet.add(optString);
                    }
                }
                HashMap hashMap = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Gh a4 = t2.t.a(application, str2);
                    if (a4 == null) {
                        Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str2)));
                    } else {
                        String str3 = a4.f5313o;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, application.getSharedPreferences(str3, 0).edit());
                        }
                        ((SharedPreferences.Editor) hashMap.get(str3)).remove(a4.f5314p);
                    }
                }
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    ((SharedPreferences.Editor) it2.next()).apply();
                }
                return true;
            }
            return false;
        }
        if (hashCode == 113399775 && str.equals("write")) {
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
                Gh a5 = t2.t.a(application, next);
                if (a5 != null) {
                    String str4 = a5.f5314p;
                    String str5 = a5.f5313o;
                    if (!hashMap2.containsKey(str5)) {
                        hashMap2.put(str5, application.getSharedPreferences(str5, 0).edit());
                    }
                    SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap2.get(str5);
                    if (opt instanceof Integer) {
                        editor.putInt(str4, ((Integer) opt).intValue());
                    } else if (opt instanceof Long) {
                        editor.putLong(str4, ((Long) opt).longValue());
                    } else if (opt instanceof Double) {
                        editor.putFloat(str4, ((Double) opt).floatValue());
                    } else if (opt instanceof Float) {
                        editor.putFloat(str4, ((Float) opt).floatValue());
                    } else if (opt instanceof Boolean) {
                        editor.putBoolean(str4, ((Boolean) opt).booleanValue());
                    } else if (opt instanceof String) {
                        editor.putString(str4, (String) opt);
                    }
                    c1997d.c.add(next);
                }
                Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
            }
            c1997d.f14891b.edit().putStringSet("written_values", c1997d.c).apply();
            Iterator it3 = hashMap2.values().iterator();
            while (it3.hasNext()) {
                ((SharedPreferences.Editor) it3.next()).apply();
            }
            return true;
        }
        return false;
    }

    @Override // t2.I
    public Executor b() {
        return (Executor) this.f14711r;
    }

    @Override // t2.H
    public /* bridge */ /* synthetic */ Object c() {
        switch (this.f14708o) {
            case 24:
                return B();
            case 27:
                return new L((C1997d) ((E) this.f14709p).c(), ((J0) this.f14710q).c(), (C2003j) ((E) this.f14711r).c());
            default:
                return D();
        }
    }

    @Override // o1.InterfaceC1858e
    public void d(int i4) {
        ((m1.c) this.f14709p).c = i4;
        ((AlertDialog) this.f14710q).dismiss();
        TimeDiagramLayout timeDiagramLayout = (TimeDiagramLayout) this.f14711r;
        timeDiagramLayout.setTimeDiagram(timeDiagramLayout.f3725o);
    }

    public void e(int[] iArr, ValueAnimator valueAnimator) {
        V2.e eVar = new V2.e(iArr, valueAnimator);
        valueAnimator.addListener((E2.a) this.f14711r);
        ((ArrayList) this.f14709p).add(eVar);
    }

    @Override // b2.InterfaceC0218a
    public h f() {
        A2.i iVar = new A2.i();
        ((ExecutorService) this.f14711r).execute(new Jn(23, this, iVar));
        return iVar.f26a;
    }

    public void g(View view, int i4, boolean z4) {
        RecyclerView recyclerView = ((C0170D) this.f14709p).f3175a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : s(i4);
        ((N1.d) this.f14710q).k(childCount, z4);
        if (z4) {
            v(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.J(view);
        ArrayList arrayList = recyclerView.f3047O;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0206s) recyclerView.f3047O.get(size)).getClass();
            }
        }
    }

    @Override // I3.a
    public Object get() {
        return new e((Context) ((I3.a) this.f14709p).get(), (D1.d) ((I3.a) this.f14710q).get(), (C1.b) ((C2033d) this.f14711r).get(), 2);
    }

    public void h(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = ((C0170D) this.f14709p).f3175a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : s(i4);
        ((N1.d) this.f14710q).k(childCount, z4);
        if (z4) {
            v(view);
        }
        c0 J4 = RecyclerView.J(view);
        if (J4 != null) {
            if (!J4.k() && !J4.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + J4 + recyclerView.z());
            }
            J4.f3251j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [n0.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [w0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, n0.d] */
    public o i() {
        UUID uuid = (UUID) this.f14709p;
        w0.i iVar = (w0.i) this.f14710q;
        HashSet hashSet = (HashSet) this.f14711r;
        ?? obj = new Object();
        obj.f14099a = uuid;
        obj.f14100b = iVar;
        obj.c = hashSet;
        n0.d dVar = iVar.f15122j;
        boolean z4 = (Build.VERSION.SDK_INT >= 24 && dVar.f14085h.f14088a.size() > 0) || dVar.d || dVar.f14081b || dVar.c;
        w0.i iVar2 = (w0.i) this.f14710q;
        if (iVar2.f15129q) {
            if (z4) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (iVar2.f15119g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        this.f14709p = UUID.randomUUID();
        w0.i iVar3 = (w0.i) this.f14710q;
        ?? obj2 = new Object();
        obj2.f15116b = 1;
        n0.g gVar = n0.g.c;
        obj2.f15117e = gVar;
        obj2.f15118f = gVar;
        obj2.f15122j = n0.d.f14079i;
        obj2.f15124l = 1;
        obj2.f15125m = 30000L;
        obj2.f15128p = -1L;
        obj2.f15130r = 1;
        obj2.f15115a = iVar3.f15115a;
        obj2.c = iVar3.c;
        obj2.f15116b = iVar3.f15116b;
        obj2.d = iVar3.d;
        obj2.f15117e = new n0.g(iVar3.f15117e);
        obj2.f15118f = new n0.g(iVar3.f15118f);
        obj2.f15119g = iVar3.f15119g;
        obj2.f15120h = iVar3.f15120h;
        obj2.f15121i = iVar3.f15121i;
        n0.d dVar2 = iVar3.f15122j;
        ?? obj3 = new Object();
        obj3.f14080a = 1;
        obj3.f14083f = -1L;
        obj3.f14084g = -1L;
        obj3.f14085h = new n0.f();
        obj3.f14081b = dVar2.f14081b;
        obj3.c = dVar2.c;
        obj3.f14080a = dVar2.f14080a;
        obj3.d = dVar2.d;
        obj3.f14082e = dVar2.f14082e;
        obj3.f14085h = dVar2.f14085h;
        obj2.f15122j = obj3;
        obj2.f15123k = iVar3.f15123k;
        obj2.f15124l = iVar3.f15124l;
        obj2.f15125m = iVar3.f15125m;
        obj2.f15126n = iVar3.f15126n;
        obj2.f15127o = iVar3.f15127o;
        obj2.f15128p = iVar3.f15128p;
        obj2.f15129q = iVar3.f15129q;
        obj2.f15130r = iVar3.f15130r;
        this.f14710q = obj2;
        obj2.f15115a = ((UUID) this.f14709p).toString();
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v27, types: [o1.L, java.lang.Object] */
    @Override // b1.e
    public void j(Canvas canvas) {
        Paint paint;
        int i4;
        int i5;
        Paint paint2;
        int i6;
        switch (this.f14708o) {
            case 9:
                Drawable drawable = (Drawable) this.f14710q;
                C1923i c1923i = (C1923i) this.f14709p;
                int i7 = c1923i.f14536Q;
                if (i7 == -16777216) {
                    return;
                }
                ((Paint) this.f14711r).setColor(Color.argb(205, Color.red(i7), Color.green(i7), Color.blue(i7)));
                int G3 = (int) c1923i.G();
                float f4 = 0;
                canvas.translate(f4, f4);
                drawable.setTint(i7);
                int i8 = (int) (G3 / 4.5d);
                int i9 = -i8;
                int i10 = G3 + i8;
                drawable.setBounds(i9, (int) (i9 * 2.0f), i10, i10);
                drawable.draw(canvas);
                canvas.translate(f4, f4);
                return;
            case 10:
                C1930p c1930p = (C1930p) this.f14709p;
                int G4 = (int) c1930p.G();
                int F2 = (int) c1930p.F();
                int i11 = G4 / 2;
                float f5 = (G4 - i11) / 2;
                float f6 = F2 * 0.82f;
                int i12 = F2 / 9;
                if (((C1836L) this.f14711r) == null) {
                    C1836L c1836l = new C1836L();
                    this.f14711r = c1836l;
                    c1836l.b(i11 / 100, i11, i12, i11 / 4, 0.5f);
                }
                ((C1836L) this.f14711r).c = (int) ((c1930p.f14576T / 9.0f) * i12);
                canvas.translate(f5, f6);
                ((C1836L) this.f14711r).a(canvas, (Paint) this.f14710q, true);
                canvas.translate(-f5, -f6);
                return;
            case 11:
                Paint paint3 = (Paint) this.f14711r;
                Paint paint4 = (Paint) this.f14710q;
                P p3 = (P) this.f14709p;
                boolean[][] zArr = p3.f14439T;
                boolean[][] zArr2 = p3.f14440U;
                float G5 = p3.G();
                float F4 = p3.F();
                int i13 = (int) (G5 / 1.8f);
                int i14 = i13 / 2;
                int i15 = 0;
                int min = Math.min(((int) (F4 / 1.4f)) / zArr.length, i14 / zArr[0].length);
                int i16 = min / 2;
                int length = (i14 - (zArr[0].length * min)) - i16;
                int length2 = (int) ((F4 - (zArr.length * min)) / 2.0f);
                canvas.translate((int) ((G5 - i13) / 2.0f), length2);
                int i17 = 0;
                while (i17 < zArr.length) {
                    int i18 = i15;
                    while (true) {
                        boolean[] zArr3 = zArr[i17];
                        if (i18 < zArr3.length) {
                            int i19 = (i18 * min) + length;
                            int i20 = i17 * min;
                            if (zArr3[i18]) {
                                i4 = i17;
                                i5 = i18;
                                i6 = length2;
                                canvas.drawRect(i19, i20, i19 + min, i20 + min, paint4);
                                paint2 = paint4;
                            } else {
                                i4 = i17;
                                i5 = i18;
                                paint2 = paint4;
                                i6 = length2;
                                canvas.drawRect(i19, i20, i19 + min, i20 + min, paint3);
                            }
                            i18 = i5 + 1;
                            length2 = i6;
                            i17 = i4;
                            paint4 = paint2;
                        }
                    }
                    i17++;
                    i15 = 0;
                }
                int i21 = length2;
                Paint paint5 = paint4;
                int i22 = i14 + i16;
                for (int i23 = 0; i23 < zArr2.length; i23++) {
                    int i24 = 0;
                    while (true) {
                        boolean[] zArr4 = zArr2[i23];
                        if (i24 < zArr4.length) {
                            int i25 = (i24 * min) + i22;
                            int i26 = i23 * min;
                            if (zArr4[i24]) {
                                canvas.drawRect(i25, i26, i25 + min, i26 + min, paint5);
                                paint = paint3;
                            } else {
                                paint = paint3;
                                canvas.drawRect(i25, i26, i25 + min, i26 + min, paint);
                            }
                            i24++;
                            paint3 = paint;
                        }
                    }
                }
                canvas.translate(-r15, -i21);
                return;
            case 12:
                a0 a0Var = (a0) this.f14709p;
                int G6 = (int) a0Var.G();
                int i27 = (int) (G6 * 0.95f);
                float f7 = (G6 - i27) / 2;
                float F5 = (int) a0Var.F();
                float f8 = F5 / 2.1f;
                int i28 = (int) (F5 / 7.0f);
                boolean[] zArr5 = a0Var.f14498Q;
                int i29 = 0;
                if (((C1836L[]) this.f14711r) == null) {
                    this.f14711r = new C1836L[zArr5.length];
                    int i30 = 0;
                    while (true) {
                        C1836L[] c1836lArr = (C1836L[]) this.f14711r;
                        if (i30 < c1836lArr.length) {
                            ?? obj = new Object();
                            obj.f14215a = 0.0f;
                            obj.b(i27 / 100, i27, i28, (int) (((c1836lArr.length - i30) * i27) / c1836lArr.length), (i30 / c1836lArr.length) + 0.03f);
                            c1836lArr[i30] = obj;
                            i30++;
                        }
                    }
                }
                canvas.translate(f7, f8);
                while (true) {
                    C1836L[] c1836lArr2 = (C1836L[]) this.f14711r;
                    if (i29 >= c1836lArr2.length) {
                        canvas.translate(-f7, -f8);
                        return;
                    } else {
                        if (zArr5[i29]) {
                            c1836lArr2[i29].a(canvas, (Paint) this.f14710q, true);
                        }
                        i29++;
                    }
                }
            case 13:
                Paint paint6 = (Paint) this.f14710q;
                j0 j0Var = (j0) this.f14709p;
                int G7 = (int) j0Var.G();
                int F6 = (int) j0Var.F();
                int i31 = G7 / 2;
                float f9 = (G7 - i31) / 2;
                float f10 = F6 / 2;
                if (!j0Var.f14556Q) {
                    canvas.translate(f9, f10);
                    canvas.drawLine(0.0f, 0.0f, i31, 0.0f, paint6);
                    canvas.translate(-f9, -f10);
                    return;
                }
                int i32 = F6 / 8;
                if (((C1836L) this.f14711r) == null) {
                    C1836L c1836l2 = new C1836L();
                    this.f14711r = c1836l2;
                    c1836l2.b(i31 / 100, i31, i32, i31 / 4, 0.5f);
                }
                canvas.translate(f9, f10);
                ((C1836L) this.f14711r).a(canvas, paint6, true);
                canvas.translate(-f9, -f10);
                return;
            default:
                l0 l0Var = (l0) this.f14709p;
                if (l0Var.f14562Q) {
                    int G8 = (int) l0Var.G();
                    int i33 = (int) (G8 * 0.8f);
                    float f11 = (G8 - i33) / 2;
                    float f12 = (-r2) * 0.05f;
                    int F7 = ((int) l0Var.F()) / 8;
                    if (((C1836L) this.f14711r) == null) {
                        C1836L c1836l3 = new C1836L();
                        this.f14711r = c1836l3;
                        c1836l3.b(i33 / 100, i33, F7, i33 / 4, 0.5f);
                    }
                    canvas.translate(f11, f12);
                    ((C1836L) this.f14711r).a(canvas, (Paint) this.f14710q, true);
                    canvas.translate(-f11, -f12);
                    return;
                }
                return;
        }
    }

    public void k(int i4) {
        c0 J4;
        int s4 = s(i4);
        ((N1.d) this.f14710q).m(s4);
        RecyclerView recyclerView = ((C0170D) this.f14709p).f3175a;
        View childAt = recyclerView.getChildAt(s4);
        if (childAt != null && (J4 = RecyclerView.J(childAt)) != null) {
            if (J4.k() && !J4.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + J4 + recyclerView.z());
            }
            J4.a(256);
        }
        recyclerView.detachViewFromParent(s4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [Q1.n, R.b] */
    public s l(Class cls) {
        s b4;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        t tVar = (t) this.f14710q;
        S3.e.e(concat, "key");
        v vVar = (v) this.f14709p;
        vVar.getClass();
        LinkedHashMap linkedHashMap = vVar.f2994a;
        s sVar = (s) linkedHashMap.get(concat);
        if (cls.isInstance(sVar)) {
            S3.e.c(sVar, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return sVar;
        }
        AbstractC0115n abstractC0115n = (AbstractC0115n) this.f14711r;
        S3.e.e(abstractC0115n, "initialExtras");
        ?? abstractC0115n2 = new AbstractC0115n(1);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) abstractC0115n2.f1719a;
        linkedHashMap2.putAll((LinkedHashMap) abstractC0115n.f1719a);
        linkedHashMap2.put(u.f2993a, concat);
        try {
            b4 = tVar.e(cls, abstractC0115n2);
        } catch (AbstractMethodError unused) {
            b4 = tVar.b();
        }
        S3.e.e(b4, "viewModel");
        s sVar2 = (s) linkedHashMap.put(concat, b4);
        if (sVar2 != null) {
            sVar2.a();
        }
        return b4;
    }

    public View m(int i4) {
        return ((C0170D) this.f14709p).f3175a.getChildAt(s(i4));
    }

    public int n() {
        return ((C0170D) this.f14709p).f3175a.getChildCount() - ((ArrayList) this.f14711r).size();
    }

    public ColorStateList o(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f14710q;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            Context context = (Context) this.f14709p;
            Object obj = AbstractC1678a.f12977a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i4);
    }

    public Drawable p(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f14710q;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) ? typedArray.getDrawable(i4) : AbstractC1678a.a((Context) this.f14709p, resourceId);
    }

    public Drawable q(int i4) {
        int resourceId;
        Drawable g4;
        if (!((TypedArray) this.f14710q).hasValue(i4) || (resourceId = ((TypedArray) this.f14710q).getResourceId(i4, 0)) == 0) {
            return null;
        }
        l.r a4 = l.r.a();
        Context context = (Context) this.f14709p;
        synchronized (a4) {
            g4 = a4.f13821a.g(context, resourceId, true);
        }
        return g4;
    }

    public Typeface r(int i4, int i5, l.K k3) {
        int resourceId = ((TypedArray) this.f14710q).getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f14711r) == null) {
            this.f14711r = new TypedValue();
        }
        Context context = (Context) this.f14709p;
        TypedValue typedValue = (TypedValue) this.f14711r;
        Object obj = AbstractC2130i.f15936a;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC2130i.a(context, resourceId, typedValue, i5, k3, true);
    }

    public int s(int i4) {
        N1.d dVar = (N1.d) this.f14710q;
        if (i4 < 0) {
            return -1;
        }
        int childCount = ((C0170D) this.f14709p).f3175a.getChildCount();
        int i5 = i4;
        while (i5 < childCount) {
            int f4 = i4 - (i5 - dVar.f(i5));
            if (f4 == 0) {
                while (dVar.h(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += f4;
        }
        return -1;
    }

    public View t(int i4) {
        return ((C0170D) this.f14709p).f3175a.getChildAt(i4);
    }

    public String toString() {
        switch (this.f14708o) {
            case 8:
                return ((N1.d) this.f14710q).toString() + ", hidden list:" + ((ArrayList) this.f14711r).size();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((C0170D) this.f14709p).f3175a.getChildCount();
    }

    public void v(View view) {
        ((ArrayList) this.f14711r).add(view);
        C0170D c0170d = (C0170D) this.f14709p;
        c0 J4 = RecyclerView.J(view);
        if (J4 != null) {
            View view2 = J4.f3244a;
            RecyclerView recyclerView = c0170d.f3175a;
            int i4 = J4.f3258q;
            if (i4 != -1) {
                J4.f3257p = i4;
            } else {
                WeakHashMap weakHashMap = A.f779a;
                J4.f3257p = view2.getImportantForAccessibility();
            }
            if (recyclerView.M()) {
                J4.f3258q = 4;
                recyclerView.f3038G0.add(J4);
            } else {
                WeakHashMap weakHashMap2 = A.f779a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void x(androidx.lifecycle.f fVar) {
        N n4 = (N) this.f14711r;
        if (n4 != null) {
            n4.run();
        }
        N n5 = new N((k) this.f14709p, fVar);
        this.f14711r = n5;
        ((Handler) this.f14710q).postAtFrontOfQueue(n5);
    }

    public void y() {
        ((TypedArray) this.f14710q).recycle();
    }

    public void z(C2046i c2046i, int i4, boolean z4) {
        char c;
        C1.b bVar = (C1.b) this.f14711r;
        Context context = (Context) this.f14709p;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c2046i.f15151a;
        String str2 = c2046i.f15151a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        EnumC1992c enumC1992c = c2046i.c;
        adler32.update(allocate.putInt(G1.a.a(enumC1992c)).array());
        byte[] bArr = c2046i.f15152b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z4) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i5 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i5 >= i4) {
                        AbstractC1806a.i(c2046i, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((D1.h) ((D1.d) this.f14710q)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(G1.a.a(enumC1992c))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(enumC1992c, longValue, i4));
            Set set = ((C1.c) bVar.f469b.get(enumC1992c)).c;
            if (set.contains(C1.e.f475o)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(C1.e.f477q)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(C1.e.f476p)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i4);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", G1.a.a(enumC1992c));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(bVar.a(enumC1992c, longValue, i4));
            Integer valueOf4 = Integer.valueOf(i4);
            Object[] objArr = new Object[5];
            objArr[c] = c2046i;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String s4 = AbstractC1806a.s("JobInfoScheduler");
            if (Log.isLoggable(s4, 3)) {
                Log.d(s4, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
