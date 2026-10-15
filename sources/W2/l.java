package W2;

import H.A;
import H.AbstractC0044t;
import P2.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.WeakHashMap;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2043a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2044b;
    public final k c;
    public final m d;

    /* renamed from: e, reason: collision with root package name */
    public int f2045e;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f2047g;

    /* renamed from: h, reason: collision with root package name */
    public int f2048h;

    /* renamed from: i, reason: collision with root package name */
    public int f2049i;

    /* renamed from: j, reason: collision with root package name */
    public int f2050j;

    /* renamed from: k, reason: collision with root package name */
    public int f2051k;

    /* renamed from: l, reason: collision with root package name */
    public final AccessibilityManager f2052l;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f2041o = {R.attr.snackbarStyle};

    /* renamed from: p, reason: collision with root package name */
    public static final String f2042p = l.class.getSimpleName();

    /* renamed from: n, reason: collision with root package name */
    public static final Handler f2040n = new Handler(Looper.getMainLooper(), new Object());

    /* renamed from: f, reason: collision with root package name */
    public final d f2046f = new d(this, 0);

    /* renamed from: m, reason: collision with root package name */
    public final f f2053m = new f(this);

    public l(ViewGroup viewGroup, View view, m mVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f2043a = viewGroup;
        this.d = mVar;
        Context context = viewGroup.getContext();
        this.f2044b = context;
        w.c(context, w.f1609a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2041o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        k kVar = (k) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.c = kVar;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = kVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f12452p.setTextColor(AbstractC1895f.r(AbstractC1895f.m(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f12452p.getCurrentTextColor(), actionTextColorAlpha));
            }
        }
        kVar.addView(view);
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f2047g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        WeakHashMap weakHashMap = A.f779a;
        kVar.setAccessibilityLiveRegion(1);
        kVar.setImportantForAccessibility(1);
        kVar.setFitsSystemWindows(true);
        AbstractC0044t.k(kVar, new e(this));
        A.h(kVar, new O.b(3, this));
        this.f2052l = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final void a(int i4) {
        C0326Qb p3 = C0326Qb.p();
        f fVar = this.f2053m;
        synchronized (p3.f6659o) {
            try {
                if (p3.q(fVar)) {
                    p3.i((p) p3.f6661q, i4);
                } else {
                    p pVar = (p) p3.f6662r;
                    if (pVar != null && pVar.f2057a.get() == fVar) {
                        p3.i((p) p3.f6662r, i4);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        C0326Qb p3 = C0326Qb.p();
        f fVar = this.f2053m;
        synchronized (p3.f6659o) {
            try {
                if (p3.q(fVar)) {
                    p3.f6661q = null;
                    if (((p) p3.f6662r) != null) {
                        p3.z();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public final void c() {
        C0326Qb p3 = C0326Qb.p();
        f fVar = this.f2053m;
        synchronized (p3.f6659o) {
            try {
                if (p3.q(fVar)) {
                    p3.w((p) p3.f6661q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        Rect rect;
        k kVar = this.c;
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f2047g) == null) {
            Log.w(f2042p, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.f2048h;
        marginLayoutParams.leftMargin = rect.left + this.f2049i;
        marginLayoutParams.rightMargin = rect.right + this.f2050j;
        kVar.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.f2051k <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = kVar.getLayoutParams();
        if ((layoutParams2 instanceof v.e) && (((v.e) layoutParams2).f14996a instanceof SwipeDismissBehavior)) {
            d dVar = this.f2046f;
            kVar.removeCallbacks(dVar);
            kVar.post(dVar);
        }
    }
}
