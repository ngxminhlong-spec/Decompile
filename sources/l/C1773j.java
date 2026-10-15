package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import k.InterfaceC1740A;
import k.InterfaceC1741B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773j implements k.z {

    /* renamed from: A, reason: collision with root package name */
    public boolean f13765A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13766B;

    /* renamed from: C, reason: collision with root package name */
    public int f13767C;

    /* renamed from: D, reason: collision with root package name */
    public int f13768D;

    /* renamed from: E, reason: collision with root package name */
    public int f13769E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f13770F;

    /* renamed from: H, reason: collision with root package name */
    public C1763e f13772H;

    /* renamed from: I, reason: collision with root package name */
    public C1763e f13773I;

    /* renamed from: J, reason: collision with root package name */
    public RunnableC1767g f13774J;

    /* renamed from: K, reason: collision with root package name */
    public C1765f f13775K;

    /* renamed from: M, reason: collision with root package name */
    public int f13777M;

    /* renamed from: o, reason: collision with root package name */
    public final Context f13778o;

    /* renamed from: p, reason: collision with root package name */
    public Context f13779p;

    /* renamed from: q, reason: collision with root package name */
    public k.m f13780q;

    /* renamed from: r, reason: collision with root package name */
    public final LayoutInflater f13781r;

    /* renamed from: s, reason: collision with root package name */
    public k.y f13782s;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1741B f13785v;

    /* renamed from: w, reason: collision with root package name */
    public int f13786w;

    /* renamed from: x, reason: collision with root package name */
    public C1769h f13787x;
    public Drawable y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13788z;

    /* renamed from: t, reason: collision with root package name */
    public final int f13783t = R.layout.abc_action_menu_layout;

    /* renamed from: u, reason: collision with root package name */
    public final int f13784u = R.layout.abc_action_menu_item_layout;

    /* renamed from: G, reason: collision with root package name */
    public final SparseBooleanArray f13771G = new SparseBooleanArray();

    /* renamed from: L, reason: collision with root package name */
    public final k.o f13776L = new k.o(1, this);

    public C1773j(Context context) {
        this.f13778o = context;
        this.f13781r = LayoutInflater.from(context);
    }

    @Override // k.z
    public final void a(k.m mVar, boolean z4) {
        e();
        C1763e c1763e = this.f13773I;
        if (c1763e != null && c1763e.b()) {
            c1763e.f13494i.dismiss();
        }
        k.y yVar = this.f13782s;
        if (yVar != null) {
            yVar.a(mVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.A] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(k.p pVar, View view, ViewGroup viewGroup) {
        View actionView = pVar.getActionView();
        if (actionView == null || pVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1740A ? (InterfaceC1740A) view : (InterfaceC1740A) this.f13781r.inflate(this.f13784u, viewGroup, false);
            actionMenuItemView.b(pVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f13785v);
            if (this.f13775K == null) {
                this.f13775K = new C1765f(this);
            }
            actionMenuItemView2.setPopupCallback(this.f13775K);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(pVar.f13455C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1777l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.z
    public final boolean c(k.p pVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.z
    public final boolean d(k.F f4) {
        boolean z4;
        if (f4.hasVisibleItems()) {
            k.F f5 = f4;
            while (true) {
                k.m mVar = f5.f13367z;
                if (mVar == this.f13780q) {
                    break;
                }
                f5 = (k.F) mVar;
            }
            k.p pVar = f5.f13366A;
            ViewGroup viewGroup = (ViewGroup) this.f13785v;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i4);
                    if ((childAt instanceof InterfaceC1740A) && ((InterfaceC1740A) childAt).getItemData() == pVar) {
                        view = childAt;
                        break;
                    }
                    i4++;
                }
            }
            if (view != null) {
                this.f13777M = f4.f13366A.f13456a;
                int size = f4.f13429f.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        z4 = false;
                        break;
                    }
                    MenuItem item = f4.getItem(i5);
                    if (item.isVisible() && item.getIcon() != null) {
                        z4 = true;
                        break;
                    }
                    i5++;
                }
                C1763e c1763e = new C1763e(this, this.f13779p, f4, view);
                this.f13773I = c1763e;
                c1763e.f13492g = z4;
                k.v vVar = c1763e.f13494i;
                if (vVar != null) {
                    vVar.q(z4);
                }
                C1763e c1763e2 = this.f13773I;
                if (!c1763e2.b()) {
                    if (c1763e2.f13490e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1763e2.d(0, 0, false, false);
                }
                k.y yVar = this.f13782s;
                if (yVar != null) {
                    yVar.d(f4);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC1767g runnableC1767g = this.f13774J;
        if (runnableC1767g != null && (obj = this.f13785v) != null) {
            ((View) obj).removeCallbacks(runnableC1767g);
            this.f13774J = null;
            return true;
        }
        C1763e c1763e = this.f13772H;
        if (c1763e == null) {
            return false;
        }
        if (c1763e.b()) {
            c1763e.f13494i.dismiss();
        }
        return true;
    }

    @Override // k.z
    public final boolean f(k.p pVar) {
        return false;
    }

    @Override // k.z
    public final void g(Parcelable parcelable) {
        int i4;
        MenuItem findItem;
        if ((parcelable instanceof C1771i) && (i4 = ((C1771i) parcelable).f13763o) > 0 && (findItem = this.f13780q.findItem(i4)) != null) {
            d((k.F) findItem.getSubMenu());
        }
    }

    @Override // k.z
    public final int getId() {
        return this.f13786w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.z
    public final void h() {
        int i4;
        ViewGroup viewGroup = (ViewGroup) this.f13785v;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            k.m mVar = this.f13780q;
            if (mVar != null) {
                mVar.i();
                ArrayList l4 = this.f13780q.l();
                int size = l4.size();
                i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    k.p pVar = (k.p) l4.get(i5);
                    if ((pVar.f13477x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i4);
                        k.p itemData = childAt instanceof InterfaceC1740A ? ((InterfaceC1740A) childAt).getItemData() : null;
                        View b4 = b(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            b4.setPressed(false);
                            b4.jumpDrawablesToCurrentState();
                        }
                        if (b4 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b4.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b4);
                            }
                            ((ViewGroup) this.f13785v).addView(b4, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i4) == this.f13787x) {
                    i4++;
                } else {
                    viewGroup.removeViewAt(i4);
                }
            }
        }
        ((View) this.f13785v).requestLayout();
        k.m mVar2 = this.f13780q;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f13432i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k.q qVar = ((k.p) arrayList2.get(i6)).f13453A;
            }
        }
        k.m mVar3 = this.f13780q;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f13433j;
        }
        if (this.f13765A && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((k.p) arrayList.get(0)).f13455C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f13787x == null) {
                this.f13787x = new C1769h(this, this.f13778o);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f13787x.getParent();
            if (viewGroup3 != this.f13785v) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f13787x);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13785v;
                C1769h c1769h = this.f13787x;
                actionMenuView.getClass();
                C1777l j4 = ActionMenuView.j();
                j4.c = true;
                actionMenuView.addView(c1769h, j4);
            }
        } else {
            C1769h c1769h2 = this.f13787x;
            if (c1769h2 != null) {
                Object parent = c1769h2.getParent();
                Object obj = this.f13785v;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f13787x);
                }
            }
        }
        ((ActionMenuView) this.f13785v).setOverflowReserved(this.f13765A);
    }

    public final boolean i() {
        C1763e c1763e = this.f13772H;
        return c1763e != null && c1763e.b();
    }

    @Override // k.z
    public final void j(k.y yVar) {
        throw null;
    }

    @Override // k.z
    public final void k(Context context, k.m mVar) {
        this.f13779p = context;
        LayoutInflater.from(context);
        this.f13780q = mVar;
        Resources resources = context.getResources();
        if (!this.f13766B) {
            this.f13765A = true;
        }
        int i4 = 2;
        this.f13767C = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i4 = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i4 = 4;
        } else if (i5 >= 360) {
            i4 = 3;
        }
        this.f13769E = i4;
        int i7 = this.f13767C;
        if (this.f13765A) {
            if (this.f13787x == null) {
                C1769h c1769h = new C1769h(this, this.f13778o);
                this.f13787x = c1769h;
                if (this.f13788z) {
                    c1769h.setImageDrawable(this.y);
                    this.y = null;
                    this.f13788z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13787x.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f13787x.getMeasuredWidth();
        } else {
            this.f13787x = null;
        }
        this.f13768D = i7;
        float f4 = resources.getDisplayMetrics().density;
    }

    @Override // k.z
    public final boolean l() {
        int i4;
        ArrayList arrayList;
        int i5;
        boolean z4;
        C1773j c1773j = this;
        k.m mVar = c1773j.f13780q;
        if (mVar != null) {
            arrayList = mVar.l();
            i4 = arrayList.size();
        } else {
            i4 = 0;
            arrayList = null;
        }
        int i6 = c1773j.f13769E;
        int i7 = c1773j.f13768D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1773j.f13785v;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z4 = true;
            if (i8 >= i4) {
                break;
            }
            k.p pVar = (k.p) arrayList.get(i8);
            int i11 = pVar.y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z5 = true;
            }
            if (c1773j.f13770F && pVar.f13455C) {
                i6 = 0;
            }
            i8++;
        }
        if (c1773j.f13765A && (z5 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = c1773j.f13771G;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i4) {
            k.p pVar2 = (k.p) arrayList.get(i13);
            int i15 = pVar2.y;
            boolean z6 = (i15 & 2) == i5 ? z4 : false;
            int i16 = pVar2.f13457b;
            if (z6) {
                View b4 = c1773j.b(pVar2, null, viewGroup);
                b4.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b4.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z4);
                }
                pVar2.g(z4);
            } else if ((i15 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i16);
                boolean z8 = ((i12 > 0 || z7) && i7 > 0) ? z4 : false;
                if (z8) {
                    View b5 = c1773j.b(pVar2, null, viewGroup);
                    b5.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b5.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z8 &= i7 + i14 > 0;
                }
                if (z8 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z7) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        k.p pVar3 = (k.p) arrayList.get(i17);
                        if (pVar3.f13457b == i16) {
                            if ((pVar3.f13477x & 32) == 32) {
                                i12++;
                            }
                            pVar3.g(false);
                        }
                    }
                }
                if (z8) {
                    i12--;
                }
                pVar2.g(z8);
            } else {
                pVar2.g(false);
                i13++;
                i5 = 2;
                c1773j = this;
                z4 = true;
            }
            i13++;
            i5 = 2;
            c1773j = this;
            z4 = true;
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, l.i, java.lang.Object] */
    @Override // k.z
    public final Parcelable m() {
        ?? obj = new Object();
        obj.f13763o = this.f13777M;
        return obj;
    }

    public final boolean n() {
        k.m mVar;
        if (!this.f13765A || i() || (mVar = this.f13780q) == null || this.f13785v == null || this.f13774J != null) {
            return false;
        }
        mVar.i();
        if (mVar.f13433j.isEmpty()) {
            return false;
        }
        RunnableC1767g runnableC1767g = new RunnableC1767g(this, new C1763e(this, this.f13779p, this.f13780q, this.f13787x));
        this.f13774J = runnableC1767g;
        ((View) this.f13785v).post(runnableC1767g);
        k.y yVar = this.f13782s;
        if (yVar == null) {
            return true;
        }
        yVar.d(null);
        return true;
    }
}
