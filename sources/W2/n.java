package W2;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2054r = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: q, reason: collision with root package name */
    public final AccessibilityManager f2055q;

    public n(ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f2055q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static n e(View view, CharSequence charSequence) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(f2054r);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        n nVar = new n(viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) nVar.c.getChildAt(0)).getMessageView().setText(charSequence);
        nVar.f2045e = -1;
        return nVar;
    }

    public final void f() {
        C0326Qb p3 = C0326Qb.p();
        int i4 = this.f2045e;
        if (i4 == -2) {
            i4 = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            i4 = this.f2055q.getRecommendedTimeoutMillis(i4, 3);
        }
        f fVar = this.f2053m;
        synchronized (p3.f6659o) {
            try {
                if (p3.q(fVar)) {
                    p pVar = (p) p3.f6661q;
                    pVar.f2058b = i4;
                    ((Handler) p3.f6660p).removeCallbacksAndMessages(pVar);
                    p3.w((p) p3.f6661q);
                    return;
                }
                p pVar2 = (p) p3.f6662r;
                if (pVar2 != null && pVar2.f2057a.get() == fVar) {
                    ((p) p3.f6662r).f2058b = i4;
                } else {
                    p3.f6662r = new p(i4, fVar);
                }
                p pVar3 = (p) p3.f6661q;
                if (pVar3 == null || !p3.i(pVar3, 4)) {
                    p3.f6661q = null;
                    p3.z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
