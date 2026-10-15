package A;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import z.C2126e;
import z.C2127f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: m, reason: collision with root package name */
    public final Class f16m;

    /* renamed from: n, reason: collision with root package name */
    public final Constructor f17n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f18o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f19p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f20q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f21r;

    /* renamed from: s, reason: collision with root package name */
    public final Method f22s;

    public j() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = o0(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = p0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f16m = cls;
        this.f17n = constructor;
        this.f18o = method2;
        this.f19p = method3;
        this.f20q = method4;
        this.f21r = method5;
        this.f22s = method;
    }

    public static Method o0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // A.h, com.google.android.gms.internal.play_billing.B
    public final Typeface k(Context context, C2126e c2126e, Resources resources, int i4) {
        Object obj;
        Method method = this.f18o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.k(context, c2126e, resources, i4);
        }
        try {
            obj = this.f17n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C2127f[] c2127fArr = c2126e.f15927a;
            int length = c2127fArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    C2127f c2127f = c2127fArr[i5];
                    Context context2 = context;
                    if (l0(context2, obj, c2127f.f15928a, c2127f.f15930e, c2127f.f15929b, c2127f.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c2127f.d))) {
                        i5++;
                        context = context2;
                    } else {
                        try {
                            this.f21r.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (n0(obj)) {
                    return m0(obj);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[SYNTHETIC] */
    @Override // A.h, com.google.android.gms.internal.play_billing.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface l(android.content.Context r18, E.j[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.j.l(android.content.Context, E.j[], int):android.graphics.Typeface");
    }

    public final boolean l0(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface m0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f16m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f22s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean n0(Object obj) {
        try {
            return ((Boolean) this.f20q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface o(Context context, Resources resources, int i4, String str, int i5) {
        Object obj;
        Method method = this.f18o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.o(context, resources, i4, str, i5);
        }
        try {
            obj = this.f17n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!l0(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f21r.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (n0(obj)) {
                return m0(obj);
            }
        }
        return null;
    }

    public Method p0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
