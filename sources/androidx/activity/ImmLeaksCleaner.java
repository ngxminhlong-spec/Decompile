package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements h {

    /* renamed from: p, reason: collision with root package name */
    public static int f2402p;

    /* renamed from: q, reason: collision with root package name */
    public static Field f2403q;

    /* renamed from: r, reason: collision with root package name */
    public static Field f2404r;

    /* renamed from: s, reason: collision with root package name */
    public static Field f2405s;

    /* renamed from: o, reason: collision with root package name */
    public d f2406o;

    @Override // androidx.lifecycle.h
    public final void a(i iVar, androidx.lifecycle.f fVar) {
        if (fVar != androidx.lifecycle.f.ON_DESTROY) {
            return;
        }
        if (f2402p == 0) {
            try {
                f2402p = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f2404r = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f2405s = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f2403q = declaredField3;
                declaredField3.setAccessible(true);
                f2402p = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f2402p == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f2406o.getSystemService("input_method");
            try {
                Object obj = f2403q.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) f2404r.get(inputMethodManager);
                        if (view != null) {
                            if (!view.isAttachedToWindow()) {
                                f2405s.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            }
                        }
                    } catch (IllegalAccessException unused2) {
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    } finally {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
