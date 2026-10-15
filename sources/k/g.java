package k;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C1770h0;
import l.C1788v;
import l.V;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends v implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    public View f13390B;

    /* renamed from: C, reason: collision with root package name */
    public View f13391C;

    /* renamed from: D, reason: collision with root package name */
    public int f13392D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f13393E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f13394F;

    /* renamed from: G, reason: collision with root package name */
    public int f13395G;

    /* renamed from: H, reason: collision with root package name */
    public int f13396H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f13398J;

    /* renamed from: K, reason: collision with root package name */
    public y f13399K;

    /* renamed from: L, reason: collision with root package name */
    public ViewTreeObserver f13400L;

    /* renamed from: M, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13401M;
    public boolean N;

    /* renamed from: p, reason: collision with root package name */
    public final Context f13402p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13403q;

    /* renamed from: r, reason: collision with root package name */
    public final int f13404r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13405s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f13406t;

    /* renamed from: x, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1747d f13410x;
    public final C1748e y;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f13407u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f13408v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final Q2.a f13409w = new Q2.a(1, this);

    /* renamed from: z, reason: collision with root package name */
    public int f13411z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f13389A = 0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f13397I = false;

    public g(Context context, View view, int i4, boolean z4) {
        int i5 = 0;
        this.f13410x = new ViewOnAttachStateChangeListenerC1747d(this, i5);
        this.y = new C1748e(i5, this);
        this.f13402p = context;
        this.f13390B = view;
        this.f13404r = i4;
        this.f13405s = z4;
        WeakHashMap weakHashMap = H.A.f779a;
        this.f13392D = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f13403q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f13406t = new Handler();
    }

    @Override // k.z
    public final void a(m mVar, boolean z4) {
        ArrayList arrayList = this.f13408v;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((C1749f) arrayList.get(i4)).f13388b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            return;
        }
        int i5 = i4 + 1;
        if (i5 < arrayList.size()) {
            ((C1749f) arrayList.get(i5)).f13388b.c(false);
        }
        C1749f c1749f = (C1749f) arrayList.remove(i4);
        m mVar2 = c1749f.f13388b;
        C1770h0 c1770h0 = c1749f.f13387a;
        C1788v c1788v = c1770h0.f13740M;
        mVar2.r(this);
        if (this.N) {
            c1788v.setExitTransition(null);
            c1788v.setAnimationStyle(0);
        }
        c1770h0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f13392D = ((C1749f) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.f13390B;
            WeakHashMap weakHashMap = H.A.f779a;
            this.f13392D = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((C1749f) arrayList.get(0)).f13388b.c(false);
                return;
            }
            return;
        }
        dismiss();
        y yVar = this.f13399K;
        if (yVar != null) {
            yVar.a(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f13400L;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f13400L.removeGlobalOnLayoutListener(this.f13409w);
            }
            this.f13400L = null;
        }
        this.f13391C.removeOnAttachStateChangeListener(this.f13410x);
        this.f13401M.onDismiss();
    }

    @Override // k.InterfaceC1743D
    public final boolean b() {
        ArrayList arrayList = this.f13408v;
        return arrayList.size() > 0 && ((C1749f) arrayList.get(0)).f13387a.f13740M.isShowing();
    }

    @Override // k.z
    public final boolean d(F f4) {
        ArrayList arrayList = this.f13408v;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1749f c1749f = (C1749f) obj;
            if (f4 == c1749f.f13388b) {
                c1749f.f13387a.f13743q.requestFocus();
                return true;
            }
        }
        if (!f4.hasVisibleItems()) {
            return false;
        }
        n(f4);
        y yVar = this.f13399K;
        if (yVar != null) {
            yVar.d(f4);
        }
        return true;
    }

    @Override // k.InterfaceC1743D
    public final void dismiss() {
        ArrayList arrayList = this.f13408v;
        int size = arrayList.size();
        if (size > 0) {
            C1749f[] c1749fArr = (C1749f[]) arrayList.toArray(new C1749f[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                C1749f c1749f = c1749fArr[i4];
                if (c1749f.f13387a.f13740M.isShowing()) {
                    c1749f.f13387a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC1743D
    public final void e() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f13407u;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            w((m) obj);
        }
        arrayList.clear();
        View view = this.f13390B;
        this.f13391C = view;
        if (view != null) {
            boolean z4 = this.f13400L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f13400L = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13409w);
            }
            this.f13391C.addOnAttachStateChangeListener(this.f13410x);
        }
    }

    @Override // k.z
    public final void g(Parcelable parcelable) {
    }

    @Override // k.z
    public final void h() {
        ArrayList arrayList = this.f13408v;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ListAdapter adapter = ((C1749f) obj).f13387a.f13743q.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC1743D
    public final V i() {
        ArrayList arrayList = this.f13408v;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1749f) arrayList.get(arrayList.size() - 1)).f13387a.f13743q;
    }

    @Override // k.z
    public final void j(y yVar) {
        this.f13399K = yVar;
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
        mVar.b(this, this.f13402p);
        if (b()) {
            w(mVar);
        } else {
            this.f13407u.add(mVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1749f c1749f;
        ArrayList arrayList = this.f13408v;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                c1749f = null;
                break;
            }
            c1749f = (C1749f) arrayList.get(i4);
            if (!c1749f.f13387a.f13740M.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (c1749f != null) {
            c1749f.f13388b.c(false);
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
        if (this.f13390B != view) {
            this.f13390B = view;
            int i4 = this.f13411z;
            WeakHashMap weakHashMap = H.A.f779a;
            this.f13389A = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // k.v
    public final void q(boolean z4) {
        this.f13397I = z4;
    }

    @Override // k.v
    public final void r(int i4) {
        if (this.f13411z != i4) {
            this.f13411z = i4;
            View view = this.f13390B;
            WeakHashMap weakHashMap = H.A.f779a;
            this.f13389A = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // k.v
    public final void s(int i4) {
        this.f13393E = true;
        this.f13395G = i4;
    }

    @Override // k.v
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f13401M = onDismissListener;
    }

    @Override // k.v
    public final void u(boolean z4) {
        this.f13398J = z4;
    }

    @Override // k.v
    public final void v(int i4) {
        this.f13394F = true;
        this.f13396H = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0163, code lost:
    
        if (((r2.getWidth() + r9[r16]) + r5) > r7.right) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0165, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0169, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        if ((r9[r16] - r5) < 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [l.h0, l.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(k.m r19) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.w(k.m):void");
    }
}
