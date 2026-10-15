package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.WeakHashMap;
import l.C1764e0;
import l.C1770h0;
import l.C1788v;
import l.V;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E extends v implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public View f13348A;

    /* renamed from: B, reason: collision with root package name */
    public y f13349B;

    /* renamed from: C, reason: collision with root package name */
    public ViewTreeObserver f13350C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f13351D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f13352E;

    /* renamed from: F, reason: collision with root package name */
    public int f13353F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f13355H;

    /* renamed from: p, reason: collision with root package name */
    public final Context f13356p;

    /* renamed from: q, reason: collision with root package name */
    public final m f13357q;

    /* renamed from: r, reason: collision with root package name */
    public final j f13358r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13359s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13360t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13361u;

    /* renamed from: v, reason: collision with root package name */
    public final C1770h0 f13362v;
    public PopupWindow.OnDismissListener y;

    /* renamed from: z, reason: collision with root package name */
    public View f13365z;

    /* renamed from: w, reason: collision with root package name */
    public final Q2.a f13363w = new Q2.a(2, this);

    /* renamed from: x, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1747d f13364x = new ViewOnAttachStateChangeListenerC1747d(this, 1);

    /* renamed from: G, reason: collision with root package name */
    public int f13354G = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [l.h0, l.e0] */
    public E(Context context, m mVar, View view, int i4, boolean z4) {
        this.f13356p = context;
        this.f13357q = mVar;
        this.f13359s = z4;
        this.f13358r = new j(mVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f13361u = i4;
        Resources resources = context.getResources();
        this.f13360t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f13365z = view;
        this.f13362v = new C1764e0(context, null, i4, 0);
        mVar.b(this, context);
    }

    @Override // k.z
    public final void a(m mVar, boolean z4) {
        if (mVar != this.f13357q) {
            return;
        }
        dismiss();
        y yVar = this.f13349B;
        if (yVar != null) {
            yVar.a(mVar, z4);
        }
    }

    @Override // k.InterfaceC1743D
    public final boolean b() {
        return !this.f13351D && this.f13362v.f13740M.isShowing();
    }

    @Override // k.z
    public final boolean d(F f4) {
        boolean z4;
        if (f4.hasVisibleItems()) {
            x xVar = new x(this.f13356p, f4, this.f13348A, this.f13359s, this.f13361u, 0);
            y yVar = this.f13349B;
            xVar.f13493h = yVar;
            v vVar = xVar.f13494i;
            if (vVar != null) {
                vVar.j(yVar);
            }
            int size = f4.f13429f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = f4.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i4++;
            }
            xVar.f13492g = z4;
            v vVar2 = xVar.f13494i;
            if (vVar2 != null) {
                vVar2.q(z4);
            }
            xVar.f13495j = this.y;
            this.y = null;
            this.f13357q.c(false);
            C1770h0 c1770h0 = this.f13362v;
            int i5 = c1770h0.f13746t;
            int n4 = c1770h0.n();
            int i6 = this.f13354G;
            View view = this.f13365z;
            WeakHashMap weakHashMap = H.A.f779a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i5 += this.f13365z.getWidth();
            }
            if (!xVar.b()) {
                if (xVar.f13490e != null) {
                    xVar.d(i5, n4, true, true);
                }
            }
            y yVar2 = this.f13349B;
            if (yVar2 != null) {
                yVar2.d(f4);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC1743D
    public final void dismiss() {
        if (b()) {
            this.f13362v.dismiss();
        }
    }

    @Override // k.InterfaceC1743D
    public final void e() {
        View view;
        if (b()) {
            return;
        }
        if (this.f13351D || (view = this.f13365z) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f13348A = view;
        C1770h0 c1770h0 = this.f13362v;
        C1788v c1788v = c1770h0.f13740M;
        C1788v c1788v2 = c1770h0.f13740M;
        c1788v.setOnDismissListener(this);
        c1770h0.f13731D = this;
        c1770h0.f13739L = true;
        c1788v2.setFocusable(true);
        View view2 = this.f13348A;
        boolean z4 = this.f13350C == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f13350C = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f13363w);
        }
        view2.addOnAttachStateChangeListener(this.f13364x);
        c1770h0.f13730C = view2;
        c1770h0.f13751z = this.f13354G;
        boolean z5 = this.f13352E;
        Context context = this.f13356p;
        j jVar = this.f13358r;
        if (!z5) {
            this.f13353F = v.o(jVar, context, this.f13360t);
            this.f13352E = true;
        }
        c1770h0.r(this.f13353F);
        c1788v2.setInputMethodMode(2);
        Rect rect = this.f13486o;
        c1770h0.f13738K = rect != null ? new Rect(rect) : null;
        c1770h0.e();
        V v4 = c1770h0.f13743q;
        v4.setOnKeyListener(this);
        if (this.f13355H) {
            m mVar = this.f13357q;
            if (mVar.f13436m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) v4, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f13436m);
                }
                frameLayout.setEnabled(false);
                v4.addHeaderView(frameLayout, null, false);
            }
        }
        c1770h0.p(jVar);
        c1770h0.e();
    }

    @Override // k.z
    public final void g(Parcelable parcelable) {
    }

    @Override // k.z
    public final void h() {
        this.f13352E = false;
        j jVar = this.f13358r;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC1743D
    public final V i() {
        return this.f13362v.f13743q;
    }

    @Override // k.z
    public final void j(y yVar) {
        this.f13349B = yVar;
    }

    @Override // k.z
    public final boolean l() {
        return false;
    }

    @Override // k.z
    public final Parcelable m() {
        return null;
    }

    @Override // k.v
    public final void n(m mVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f13351D = true;
        this.f13357q.c(true);
        ViewTreeObserver viewTreeObserver = this.f13350C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f13350C = this.f13348A.getViewTreeObserver();
            }
            this.f13350C.removeGlobalOnLayoutListener(this.f13363w);
            this.f13350C = null;
        }
        this.f13348A.removeOnAttachStateChangeListener(this.f13364x);
        PopupWindow.OnDismissListener onDismissListener = this.y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.v
    public final void p(View view) {
        this.f13365z = view;
    }

    @Override // k.v
    public final void q(boolean z4) {
        this.f13358r.f13422q = z4;
    }

    @Override // k.v
    public final void r(int i4) {
        this.f13354G = i4;
    }

    @Override // k.v
    public final void s(int i4) {
        this.f13362v.f13746t = i4;
    }

    @Override // k.v
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    @Override // k.v
    public final void u(boolean z4) {
        this.f13355H = z4;
    }

    @Override // k.v
    public final void v(int i4) {
        this.f13362v.j(i4);
    }
}
