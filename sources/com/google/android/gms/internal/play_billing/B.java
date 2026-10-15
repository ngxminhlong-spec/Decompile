package com.google.android.gms.internal.play_billing;

import O1.C0081p;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.C1384xi;
import com.google.android.gms.internal.ads.C1434yp;
import com.google.android.gms.internal.ads.C1437ys;
import com.google.android.gms.internal.ads.Js;
import com.google.android.gms.internal.ads.Ks;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;
import com.google.android.gms.internal.ads.Y9;
import d3.AbstractC1654b;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import z.C2126e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static o3.i f12128a = null;

    /* renamed from: b, reason: collision with root package name */
    public static o3.i f12129b = null;
    public static o3.k c = null;
    public static Executor d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Field f12130e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f12131f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f12132g = true;

    public B() {
        new ConcurrentHashMap();
    }

    public static boolean A(int i4, Rect rect, Rect rect2) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    public static void B(Activity activity) {
        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService("connectivity");
        if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null) {
            return;
        }
        connectivityManager.getActiveNetworkInfo().isConnected();
    }

    public static int C(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return Math.max(0, i5 - i6);
    }

    public static int D(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void E(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            j4 = Math.max(j4, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j4);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static boolean H(Parcel parcel, int i4) {
        Z(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder I(Parcel parcel, int i4) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + L4);
        return readStrongBinder;
    }

    public static int J(Parcel parcel, int i4) {
        Z(parcel, i4, 4);
        return parcel.readInt();
    }

    public static long K(Parcel parcel, int i4) {
        Z(parcel, i4, 8);
        return parcel.readLong();
    }

    public static int L(Parcel parcel, int i4) {
        return (i4 & (-65536)) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    public static TypedValue M(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int N(int i4, Context context, String str) {
        TypedValue M4 = M(context, i4);
        if (M4 != null) {
            return M4.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static void O(TextView textView, int i4) {
        f(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            B.b.n(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void P(TextView textView, int i4) {
        f(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void S(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + L(parcel, i4));
    }

    public static int T(Parcel parcel) {
        int readInt = parcel.readInt();
        int L4 = L(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new i2.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i4 = L4 + dataPosition;
        if (i4 < dataPosition || i4 > parcel.dataSize()) {
            throw new i2.b(U.a.g(dataPosition, i4, "Size read is invalid start=", " end="), parcel);
        }
        return i4;
    }

    public static ActionMode.Callback U(ActionMode.Callback callback, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof J.k) || callback == null) ? callback : new J.k(callback, textView);
    }

    public static int V(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    public static void W(Parcel parcel, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        throw new i2.b(n0.a.j(U.a.m("Expected size ", i5, " got ", i4, " (0x"), Integer.toHexString(i4), ")"), parcel);
    }

    public static WindowManager.LayoutParams X() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) O1.r.d.c.a(AbstractC1066q6.Y6)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static AbstractC1644w Y() {
        String str;
        ClassLoader classLoader = B.class.getClassLoader();
        if (AbstractC1644w.class.equals(AbstractC1644w.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!AbstractC1644w.class.getPackage().equals(B.class.getPackage())) {
                throw new IllegalArgumentException(AbstractC1644w.class.getName());
            }
            str = AbstractC1644w.class.getPackage().getName() + ".BlazeGenerated" + AbstractC1644w.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    U.a.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e4) {
                    throw new IllegalStateException(e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(e5);
                }
            } catch (InstantiationException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new B[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() != null) {
                            throw new ClassCastException();
                            break;
                        }
                        throw null;
                    } catch (ServiceConfigurationError e8) {
                        Logger.getLogger(C1640u.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(AbstractC1644w.class.getSimpleName()), (Throwable) e8);
                    }
                }
                if (arrayList.size() == 1) {
                    return (AbstractC1644w) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (AbstractC1644w) AbstractC1644w.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(e9);
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static void Z(Parcel parcel, int i4, int i5) {
        int L4 = L(parcel, i4);
        if (L4 == i5) {
            return;
        }
        throw new i2.b(n0.a.j(U.a.m("Expected size ", i5, " got ", L4, " (0x"), Integer.toHexString(L4), ")"), parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = C(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = b(r8, r9, r10)
            boolean r1 = b(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = C(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.B.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static JSONObject a0(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e4) {
            e = e4;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i4 = point2.x;
                C0081p c0081p = C0081p.f1374f;
                jSONObject3.put("x", c0081p.f1375a.d(context, i4));
                jSONObject3.put("y", c0081p.f1375a.d(context, point2.y));
                jSONObject3.put("start_x", c0081p.f1375a.d(context, point.x));
                jSONObject3.put("start_y", c0081p.f1375a.d(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e5) {
                Y9.q("Error occurred while putting signals into JSON object.", e5);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e6) {
            e = e6;
            jSONObject2 = jSONObject;
            Y9.q("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static boolean b(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static JSONObject b0(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        int[] iArr;
        int measuredWidth;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i4 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i4];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                    } catch (JSONException unused) {
                        iArr = iArr2;
                    }
                    try {
                        C0081p c0081p = C0081p.f1374f;
                        jSONObject4.put("width", c0081p.f1375a.d(context, measuredWidth));
                        jSONObject4.put("height", c0081p.f1375a.d(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", c0081p.f1375a.d(context, iArr3[0] - iArr[0]));
                        jSONObject4.put("y", c0081p.f1375a.d(context, iArr3[1] - iArr[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = h0(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", c0081p.f1375a.d(context, iArr3[0] - iArr[0]));
                            jSONObject.put("y", c0081p.f1375a.d(context, iArr3[1] - iArr[1]));
                            jSONObject.put("relative_to", "ad_view");
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (((String) entry.getKey()).equals("3010")) {
                            C0937n6 c0937n6 = AbstractC1066q6.S6;
                            O1.r rVar = O1.r.d;
                            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                                jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) rVar.c.a(AbstractC1066q6.T6)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject3.put("view_width_layout_type", i0(layoutParams.width) - 1);
                                jSONObject3.put("view_height_layout_type", i0(layoutParams.height) - 1);
                            }
                            if (((Boolean) rVar.c.a(AbstractC1066q6.U6)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.V6)).booleanValue() && scaleType != null) {
                                jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        Y9.s("Unable to get asset views information");
                        it = it2;
                        iArr2 = iArr;
                        i4 = 2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i4 = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject c0(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                Q1.N n4 = N1.n.f1204A.c;
                jSONObject.put("can_show_on_lock_screen", Q1.N.A(view));
                boolean z4 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z4 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z4);
                return jSONObject;
            } catch (JSONException unused) {
                Y9.s("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject d0(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.R6)).booleanValue()) {
                    Q1.N n4 = N1.n.f1204A.c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                Q1.N n5 = N1.n.f1204A.c;
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    r2 = false;
                }
                jSONObject.put("contained_in_scroll_view", r2);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:16|(8:38|39|19|20|21|(2:23|(3:27|28|29))(2:32|(3:34|35|29))|31|29)|18|19|20|21|(0)(0)|31|29) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0143, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0157, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0157 -> B:29:0x015c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject e0(android.content.Context r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.B.e0(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static void f(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean f0(Context context, C1434yp c1434yp) {
        Js js;
        if (!c1434yp.N) {
            return false;
        }
        C0937n6 c0937n6 = AbstractC1066q6.W6;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            return ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.Z6)).booleanValue();
        }
        String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.X6);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        C1384xi G02 = C1384xi.G0(new C1437ys(';'));
        Iterator d4 = ((Ks) G02.f11290p).d(G02, str);
        do {
            js = (Js) d4;
            if (!js.hasNext()) {
                return false;
            }
        } while (!((String) js.next()).equals(packageName));
        return true;
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean g0(int i4) {
        C0937n6 c0937n6 = AbstractC1066q6.f10167T2;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            return ((Boolean) rVar.c.a(AbstractC1066q6.f10172U2)).booleanValue() || i4 <= 15299999;
        }
        return true;
    }

    public static int h(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, A.c.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static JSONObject h0(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i4 = rect.right - rect.left;
        C0081p c0081p = C0081p.f1374f;
        jSONObject.put("width", c0081p.f1375a.d(context, i4));
        int i5 = rect.bottom - rect.top;
        C1335wc c1335wc = c0081p.f1375a;
        jSONObject.put("height", c1335wc.d(context, i5));
        jSONObject.put("x", c1335wc.d(context, rect.left));
        jSONObject.put("y", c1335wc.d(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static Bundle i(Parcel parcel, int i4) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + L4);
        return readBundle;
    }

    public static int i0(int i4) {
        if (i4 != -2) {
            return i4 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static byte[] j(Parcel parcel, int i4) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + L4);
        return createByteArray;
    }

    public static Parcelable p(Parcel parcel, int i4, Parcelable.Creator creator) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + L4);
        return parcelable;
    }

    public static String q(Parcel parcel, int i4) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + L4);
        return readString;
    }

    public static String[] r(Parcel parcel, int i4) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + L4);
        return createStringArray;
    }

    public static ArrayList s(Parcel parcel, int i4) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + L4);
        return createStringArrayList;
    }

    public static Object[] t(Parcel parcel, int i4, Parcelable.Creator creator) {
        int L4 = L(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (L4 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + L4);
        return createTypedArray;
    }

    public static void u(Parcel parcel, int i4) {
        if (parcel.dataPosition() != i4) {
            throw new i2.b(U.a.i("Overread allowed size end=", i4), parcel);
        }
    }

    public static F.d x(l.M m4) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new F.d(B.b.k(m4));
        }
        TextPaint textPaint = new TextPaint(m4.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = m4.getBreakStrategy();
        int hyphenationFrequency = m4.getHyphenationFrequency();
        if (m4.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i4 < 28 || (m4.getInputType() & 15) != 3) {
                boolean z4 = m4.getLayoutDirection() == 1;
                switch (m4.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z4) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(B.b.c(D.b.d(m4.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new F.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void z(List list, androidx.lifecycle.i iVar, androidx.lifecycle.f fVar, androidx.lifecycle.h hVar) {
        int size;
        if (list == null || list.size() - 1 < 0) {
            return;
        }
        ((androidx.lifecycle.a) list.get(size)).getClass();
        throw null;
    }

    public abstract void F(t.f fVar, t.f fVar2);

    public abstract void G(t.f fVar, Thread thread);

    public void Q(View view, float f4) {
        if (f12132g) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f12132g = false;
            }
        }
        view.setAlpha(f4);
    }

    public void R(View view, int i4) {
        if (!f12131f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12130e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f12131f = true;
        }
        Field field = f12130e;
        if (field != null) {
            try {
                f12130e.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean c(t.g gVar, t.c cVar, t.c cVar2);

    public abstract boolean d(t.g gVar, Object obj, Object obj2);

    public abstract boolean e(t.g gVar, t.f fVar, t.f fVar2);

    public abstract Typeface k(Context context, C2126e c2126e, Resources resources, int i4);

    public abstract Typeface l(Context context, E.j[] jVarArr, int i4);

    public Typeface m(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface n(Context context, InputStream inputStream) {
        File y = AbstractC1654b.y(context);
        if (y == null) {
            return null;
        }
        try {
            if (AbstractC1654b.m(y, inputStream)) {
                return Typeface.createFromFile(y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            y.delete();
        }
    }

    public Typeface o(Context context, Resources resources, int i4, String str, int i5) {
        File y = AbstractC1654b.y(context);
        if (y == null) {
            return null;
        }
        try {
            if (AbstractC1654b.l(y, resources, i4)) {
                return Typeface.createFromFile(y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            y.delete();
        }
    }

    public E.j v(E.j[] jVarArr, int i4) {
        new V2.e(1);
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z4 = (i4 & 2) != 0;
        E.j jVar = null;
        int i6 = Integer.MAX_VALUE;
        for (E.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.c - i5) * 2) + (jVar2.d == z4 ? 0 : 1);
            if (jVar == null || i6 > abs) {
                jVar = jVar2;
                i6 = abs;
            }
        }
        return jVar;
    }

    public abstract void w(V2.t tVar, float f4, float f5);

    public float y(View view) {
        float transitionAlpha;
        if (f12132g) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f12132g = false;
            }
        }
        return view.getAlpha();
    }
}
