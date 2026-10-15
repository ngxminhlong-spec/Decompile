package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f13820b = PorterDuff.Mode.SRC_IN;
    public static r c;

    /* renamed from: a, reason: collision with root package name */
    public C1776k0 f13821a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (c == null) {
                    d();
                }
                rVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static synchronized PorterDuffColorFilter c(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter h4;
        synchronized (r.class) {
            h4 = C1776k0.h(i4, mode);
        }
        return h4;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.r, java.lang.Object] */
    public static synchronized void d() {
        synchronized (r.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.f13821a = C1776k0.d();
                c.f13821a.l(new N1.l());
            }
        }
    }

    public static void e(Drawable drawable, z0 z0Var, int[] iArr) {
        PorterDuff.Mode mode = C1776k0.f13789h;
        if (T.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z4 = z0Var.d;
        if (z4 || z0Var.c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z4 ? z0Var.f13867a : null;
            PorterDuff.Mode mode2 = z0Var.c ? z0Var.f13868b : C1776k0.f13789h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = C1776k0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i4) {
        return this.f13821a.f(context, i4);
    }
}
