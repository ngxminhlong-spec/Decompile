package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC1969a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1776k0 {

    /* renamed from: i, reason: collision with root package name */
    public static C1776k0 f13790i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f13792a;

    /* renamed from: b, reason: collision with root package name */
    public r.e f13793b;
    public r.j c;
    public final WeakHashMap d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f13794e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13795f;

    /* renamed from: g, reason: collision with root package name */
    public N1.l f13796g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f13789h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final C1774j0 f13791j = new b0.l0(6);

    public static synchronized C1776k0 d() {
        C1776k0 c1776k0;
        synchronized (C1776k0.class) {
            try {
                if (f13790i == null) {
                    C1776k0 c1776k02 = new C1776k0();
                    f13790i = c1776k02;
                    if (Build.VERSION.SDK_INT < 24) {
                        c1776k02.a("vector", new C1772i0(2));
                        c1776k02.a("animated-vector", new C1772i0(1));
                        c1776k02.a("animated-selector", new C1772i0(0));
                    }
                }
                c1776k0 = f13790i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1776k0;
    }

    public static synchronized PorterDuffColorFilter h(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1776k0.class) {
            C1774j0 c1774j0 = f13791j;
            c1774j0.getClass();
            int i5 = (31 + i4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c1774j0.g(Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [r.e, r.i] */
    public final void a(String str, C1772i0 c1772i0) {
        if (this.f13793b == null) {
            this.f13793b = new r.i(0);
        }
        this.f13793b.put(str, c1772i0);
    }

    public final synchronized void b(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                r.g gVar = (r.g) this.d.get(context);
                if (gVar == null) {
                    gVar = new r.g();
                    this.d.put(context, gVar);
                }
                gVar.g(j4, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i4) {
        if (this.f13794e == null) {
            this.f13794e = new TypedValue();
        }
        TypedValue typedValue = this.f13794e;
        context.getResources().getValue(i4, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e4 = e(context, j4);
        if (e4 != null) {
            return e4;
        }
        LayerDrawable layerDrawable = null;
        if (this.f13796g != null && i4 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j4, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j4) {
        r.g gVar = (r.g) this.d.get(context);
        if (gVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) gVar.d(j4);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b4 = AbstractC1969a.b(gVar.f14734p, gVar.f14736r, j4);
            if (b4 >= 0) {
                Object[] objArr = gVar.f14735q;
                Object obj = objArr[b4];
                Object obj2 = r.h.f14737a;
                if (obj != obj2) {
                    objArr[b4] = obj2;
                    gVar.f14733o = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i4) {
        return g(context, i4, false);
    }

    public final synchronized Drawable g(Context context, int i4, boolean z4) {
        Drawable j4;
        try {
            if (!this.f13795f) {
                this.f13795f = true;
                Drawable f4 = f(context, R.drawable.abc_vector_test);
                if (f4 == null || (!(f4 instanceof l0.n) && !"android.graphics.drawable.VectorDrawable".equals(f4.getClass().getName()))) {
                    this.f13795f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            j4 = j(context, i4);
            if (j4 == null) {
                j4 = c(context, i4);
            }
            if (j4 == null) {
                j4 = context.getDrawable(i4);
            }
            if (j4 != null) {
                j4 = m(context, i4, z4, j4);
            }
            if (j4 != null) {
                int i5 = T.f13674a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j4;
    }

    public final synchronized ColorStateList i(Context context, int i4) {
        ColorStateList colorStateList;
        r.j jVar;
        WeakHashMap weakHashMap = this.f13792a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (jVar = (r.j) weakHashMap.get(context)) == null) ? null : (ColorStateList) jVar.c(i4);
        if (colorStateList == null) {
            N1.l lVar = this.f13796g;
            if (lVar != null) {
                colorStateList2 = lVar.f(context, i4);
            }
            if (colorStateList2 != null) {
                if (this.f13792a == null) {
                    this.f13792a = new WeakHashMap();
                }
                r.j jVar2 = (r.j) this.f13792a.get(context);
                if (jVar2 == null) {
                    jVar2 = new r.j();
                    this.f13792a.put(context, jVar2);
                }
                jVar2.a(i4, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable j(Context context, int i4) {
        int next;
        r.e eVar = this.f13793b;
        if (eVar == null || eVar.isEmpty()) {
            return null;
        }
        r.j jVar = this.c;
        if (jVar != null) {
            String str = (String) jVar.c(i4);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f13793b.get(str) == null) {
                return null;
            }
        } else {
            this.c = new r.j();
        }
        if (this.f13794e == null) {
            this.f13794e = new TypedValue();
        }
        TypedValue typedValue = this.f13794e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e4 = e(context, j4);
        if (e4 != null) {
            return e4;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i4, name);
                C1772i0 c1772i0 = (C1772i0) this.f13793b.get(name);
                if (c1772i0 != null) {
                    e4 = c1772i0.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e4 != null) {
                    e4.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j4, e4);
                }
            } catch (Exception e5) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e5);
            }
        }
        if (e4 == null) {
            this.c.a(i4, "appcompat_skip_skip");
        }
        return e4;
    }

    public final synchronized void k(Context context) {
        r.g gVar = (r.g) this.d.get(context);
        if (gVar != null) {
            gVar.b();
        }
    }

    public final synchronized void l(N1.l lVar) {
        this.f13796g = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1776k0.m(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
