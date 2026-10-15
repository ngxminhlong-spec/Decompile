package f;

import H.A;
import H.AbstractC0044t;
import H.F;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.play_billing.B;
import e.AbstractC1657a;
import j.C1727i;
import j.C1728j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.G0;
import l.InterfaceC1759c;
import l.S;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w extends B implements InterfaceC1759c {

    /* renamed from: F, reason: collision with root package name */
    public static final AccelerateInterpolator f12928F = new AccelerateInterpolator();

    /* renamed from: G, reason: collision with root package name */
    public static final DecelerateInterpolator f12929G = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public boolean f12930A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f12931B;

    /* renamed from: C, reason: collision with root package name */
    public final u f12932C;

    /* renamed from: D, reason: collision with root package name */
    public final u f12933D;

    /* renamed from: E, reason: collision with root package name */
    public final x0.f f12934E;

    /* renamed from: h, reason: collision with root package name */
    public Context f12935h;

    /* renamed from: i, reason: collision with root package name */
    public Context f12936i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarOverlayLayout f12937j;

    /* renamed from: k, reason: collision with root package name */
    public ActionBarContainer f12938k;

    /* renamed from: l, reason: collision with root package name */
    public S f12939l;

    /* renamed from: m, reason: collision with root package name */
    public ActionBarContextView f12940m;

    /* renamed from: n, reason: collision with root package name */
    public final View f12941n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12942o;

    /* renamed from: p, reason: collision with root package name */
    public v f12943p;

    /* renamed from: q, reason: collision with root package name */
    public v f12944q;

    /* renamed from: r, reason: collision with root package name */
    public C0831kn f12945r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12946s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f12947t;

    /* renamed from: u, reason: collision with root package name */
    public int f12948u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12949v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12950w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12951x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public C1728j f12952z;

    public w(Activity activity, boolean z4) {
        new ArrayList();
        this.f12947t = new ArrayList();
        this.f12948u = 0;
        this.f12949v = true;
        this.y = true;
        this.f12932C = new u(this, 0);
        this.f12933D = new u(this, 1);
        this.f12934E = new x0.f(28, this);
        View decorView = activity.getWindow().getDecorView();
        l0(decorView);
        if (z4) {
            return;
        }
        this.f12941n = decorView.findViewById(R.id.content);
    }

    public w(Dialog dialog) {
        new ArrayList();
        this.f12947t = new ArrayList();
        this.f12948u = 0;
        this.f12949v = true;
        this.y = true;
        this.f12932C = new u(this, 0);
        this.f12933D = new u(this, 1);
        this.f12934E = new x0.f(28, this);
        l0(dialog.getWindow().getDecorView());
    }

    public final void j0(boolean z4) {
        F h4;
        F f4;
        if (z4) {
            if (!this.f12951x) {
                this.f12951x = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12937j;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                o0(false);
            }
        } else if (this.f12951x) {
            this.f12951x = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12937j;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            o0(false);
        }
        ActionBarContainer actionBarContainer = this.f12938k;
        WeakHashMap weakHashMap = A.f779a;
        if (!actionBarContainer.isLaidOut()) {
            if (z4) {
                ((G0) this.f12939l).f13603a.setVisibility(4);
                this.f12940m.setVisibility(0);
                return;
            } else {
                ((G0) this.f12939l).f13603a.setVisibility(0);
                this.f12940m.setVisibility(8);
                return;
            }
        }
        if (z4) {
            G0 g02 = (G0) this.f12939l;
            h4 = A.a(g02.f13603a);
            h4.a(0.0f);
            h4.c(100L);
            h4.d(new C1727i(g02, 4));
            f4 = this.f12940m.h(0, 200L);
        } else {
            G0 g03 = (G0) this.f12939l;
            F a4 = A.a(g03.f13603a);
            a4.a(1.0f);
            a4.c(200L);
            a4.d(new C1727i(g03, 0));
            h4 = this.f12940m.h(8, 100L);
            f4 = a4;
        }
        C1728j c1728j = new C1728j();
        ArrayList arrayList = c1728j.f13322a;
        arrayList.add(h4);
        View view = (View) h4.f787a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) f4.f787a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(f4);
        c1728j.b();
    }

    public final Context k0() {
        if (this.f12936i == null) {
            TypedValue typedValue = new TypedValue();
            this.f12935h.getTheme().resolveAttribute(com.duracodefactory.logiccircuitsimulatorpro.R.attr.actionBarWidgetTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f12936i = new ContextThemeWrapper(this.f12935h, i4);
            } else {
                this.f12936i = this.f12935h;
            }
        }
        return this.f12936i;
    }

    public final void l0(View view) {
        S wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.decor_content_parent);
        this.f12937j = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.action_bar);
        if (findViewById instanceof S) {
            wrapper = (S) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f12939l = wrapper;
        this.f12940m = (ActionBarContextView) view.findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.action_bar_container);
        this.f12938k = actionBarContainer;
        S s4 = this.f12939l;
        if (s4 == null || this.f12940m == null || actionBarContainer == null) {
            throw new IllegalStateException(w.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((G0) s4).f13603a.getContext();
        this.f12935h = context;
        if ((((G0) this.f12939l).f13604b & 4) != 0) {
            this.f12942o = true;
        }
        int i4 = context.getApplicationInfo().targetSdkVersion;
        this.f12939l.getClass();
        n0(context.getResources().getBoolean(com.duracodefactory.logiccircuitsimulatorpro.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f12935h.obtainStyledAttributes(null, AbstractC1657a.f12635a, com.duracodefactory.logiccircuitsimulatorpro.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12937j;
            if (!actionBarOverlayLayout2.f2528v) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f12931B = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f12938k;
            WeakHashMap weakHashMap = A.f779a;
            AbstractC0044t.j(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void m0(boolean z4) {
        if (this.f12942o) {
            return;
        }
        int i4 = z4 ? 4 : 0;
        G0 g02 = (G0) this.f12939l;
        int i5 = g02.f13604b;
        this.f12942o = true;
        g02.a((i4 & 4) | (i5 & (-5)));
    }

    public final void n0(boolean z4) {
        if (z4) {
            this.f12938k.setTabContainer(null);
            ((G0) this.f12939l).getClass();
        } else {
            ((G0) this.f12939l).getClass();
            this.f12938k.setTabContainer(null);
        }
        this.f12939l.getClass();
        ((G0) this.f12939l).f13603a.setCollapsible(false);
        this.f12937j.setHasNonEmbeddedTabs(false);
    }

    public final void o0(boolean z4) {
        boolean z5 = this.f12950w;
        boolean z6 = this.f12951x;
        final x0.f fVar = this.f12934E;
        View view = this.f12941n;
        if (!z6 && z5) {
            if (this.y) {
                this.y = false;
                C1728j c1728j = this.f12952z;
                if (c1728j != null) {
                    c1728j.a();
                }
                int i4 = this.f12948u;
                u uVar = this.f12932C;
                if (i4 != 0 || (!this.f12930A && !z4)) {
                    uVar.a();
                    return;
                }
                this.f12938k.setAlpha(1.0f);
                this.f12938k.setTransitioning(true);
                C1728j c1728j2 = new C1728j();
                float f4 = -this.f12938k.getHeight();
                if (z4) {
                    this.f12938k.getLocationInWindow(new int[]{0, 0});
                    f4 -= r12[1];
                }
                F a4 = A.a(this.f12938k);
                a4.e(f4);
                final View view2 = (View) a4.f787a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(fVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: H.D
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((f.w) x0.f.this.f15212p).f12938k.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z7 = c1728j2.f13324e;
                ArrayList arrayList = c1728j2.f13322a;
                if (!z7) {
                    arrayList.add(a4);
                }
                if (this.f12949v && view != null) {
                    F a5 = A.a(view);
                    a5.e(f4);
                    if (!c1728j2.f13324e) {
                        arrayList.add(a5);
                    }
                }
                boolean z8 = c1728j2.f13324e;
                if (!z8) {
                    c1728j2.c = f12928F;
                }
                if (!z8) {
                    c1728j2.f13323b = 250L;
                }
                if (!z8) {
                    c1728j2.d = uVar;
                }
                this.f12952z = c1728j2;
                c1728j2.b();
                return;
            }
            return;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        C1728j c1728j3 = this.f12952z;
        if (c1728j3 != null) {
            c1728j3.a();
        }
        this.f12938k.setVisibility(0);
        int i5 = this.f12948u;
        u uVar2 = this.f12933D;
        if (i5 == 0 && (this.f12930A || z4)) {
            this.f12938k.setTranslationY(0.0f);
            float f5 = -this.f12938k.getHeight();
            if (z4) {
                this.f12938k.getLocationInWindow(new int[]{0, 0});
                f5 -= r12[1];
            }
            this.f12938k.setTranslationY(f5);
            C1728j c1728j4 = new C1728j();
            F a6 = A.a(this.f12938k);
            a6.e(0.0f);
            final View view3 = (View) a6.f787a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(fVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: H.D
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((f.w) x0.f.this.f15212p).f12938k.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z9 = c1728j4.f13324e;
            ArrayList arrayList2 = c1728j4.f13322a;
            if (!z9) {
                arrayList2.add(a6);
            }
            if (this.f12949v && view != null) {
                view.setTranslationY(f5);
                F a7 = A.a(view);
                a7.e(0.0f);
                if (!c1728j4.f13324e) {
                    arrayList2.add(a7);
                }
            }
            boolean z10 = c1728j4.f13324e;
            if (!z10) {
                c1728j4.c = f12929G;
            }
            if (!z10) {
                c1728j4.f13323b = 250L;
            }
            if (!z10) {
                c1728j4.d = uVar2;
            }
            this.f12952z = c1728j4;
            c1728j4.b();
        } else {
            this.f12938k.setAlpha(1.0f);
            this.f12938k.setTranslationY(0.0f);
            if (this.f12949v && view != null) {
                view.setTranslationY(0.0f);
            }
            uVar2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f12937j;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = A.f779a;
            H.r.c(actionBarOverlayLayout);
        }
    }
}
