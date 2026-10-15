package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.C1748e;
import k.InterfaceC1741B;
import k.l;
import k.m;
import k.p;
import l.AbstractC1756a0;
import l.C1763e;
import l.C1769h;
import l.C1773j;
import l.C1777l;
import l.InterfaceC1775k;
import l.InterfaceC1779m;
import l.M0;
import l.Z;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1756a0 implements l, InterfaceC1741B {

    /* renamed from: D, reason: collision with root package name */
    public m f2532D;

    /* renamed from: E, reason: collision with root package name */
    public Context f2533E;

    /* renamed from: F, reason: collision with root package name */
    public int f2534F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2535G;

    /* renamed from: H, reason: collision with root package name */
    public C1773j f2536H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2537I;

    /* renamed from: J, reason: collision with root package name */
    public int f2538J;

    /* renamed from: K, reason: collision with root package name */
    public final int f2539K;

    /* renamed from: L, reason: collision with root package name */
    public final int f2540L;

    /* renamed from: M, reason: collision with root package name */
    public InterfaceC1779m f2541M;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f2539K = (int) (56.0f * f4);
        this.f2540L = (int) (f4 * 4.0f);
        this.f2533E = context;
        this.f2534F = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.Z, l.l] */
    public static C1777l j() {
        ?? z4 = new Z(-2);
        z4.c = false;
        z4.f13701b = 16;
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.Z, l.l] */
    public static C1777l k(ViewGroup.LayoutParams layoutParams) {
        C1777l c1777l;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C1777l) {
            C1777l c1777l2 = (C1777l) layoutParams;
            ?? z4 = new Z(c1777l2);
            z4.c = c1777l2.c;
            c1777l = z4;
        } else {
            c1777l = new Z(layoutParams);
        }
        if (c1777l.f13701b <= 0) {
            c1777l.f13701b = 16;
        }
        return c1777l;
    }

    @Override // k.l
    public final boolean a(p pVar) {
        return this.f2532D.q(pVar, null, 0);
    }

    @Override // k.InterfaceC1741B
    public final void c(m mVar) {
        this.f2532D = mVar;
    }

    @Override // l.AbstractC1756a0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1777l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC1756a0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Z generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC1756a0
    /* renamed from: g */
    public final Z generateLayoutParams(AttributeSet attributeSet) {
        return new Z(getContext(), attributeSet);
    }

    @Override // l.AbstractC1756a0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC1756a0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new Z(getContext(), attributeSet);
    }

    @Override // l.AbstractC1756a0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f2532D == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f2532D = mVar;
            mVar.f13428e = new C1748e(1, this);
            C1773j c1773j = new C1773j(context);
            this.f2536H = c1773j;
            c1773j.f13765A = true;
            c1773j.f13766B = true;
            c1773j.f13782s = new C2033d(21);
            this.f2532D.b(c1773j, this.f2533E);
            C1773j c1773j2 = this.f2536H;
            c1773j2.f13785v = this;
            this.f2532D = c1773j2.f13780q;
        }
        return this.f2532D;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1773j c1773j = this.f2536H;
        C1769h c1769h = c1773j.f13787x;
        if (c1769h != null) {
            return c1769h.getDrawable();
        }
        if (c1773j.f13788z) {
            return c1773j.y;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2534F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC1756a0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Z generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i4) {
        boolean z4 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof InterfaceC1775k)) {
            z4 = ((InterfaceC1775k) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof InterfaceC1775k)) ? z4 : ((InterfaceC1775k) childAt2).c() | z4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1773j c1773j = this.f2536H;
        if (c1773j != null) {
            c1773j.h();
            if (this.f2536H.i()) {
                this.f2536H.e();
                this.f2536H.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1773j c1773j = this.f2536H;
        if (c1773j != null) {
            c1773j.e();
            C1763e c1763e = c1773j.f13773I;
            if (c1763e == null || !c1763e.b()) {
                return;
            }
            c1763e.f13494i.dismiss();
        }
    }

    @Override // l.AbstractC1756a0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int width;
        int i8;
        if (!this.f2537I) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i4;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a4 = M0.a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C1777l c1777l = (C1777l) childAt.getLayoutParams();
                if (c1777l.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a4) {
                        i8 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1777l).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1777l).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1777l).leftMargin) + ((ViewGroup.MarginLayoutParams) c1777l).rightMargin;
                    l(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        int max = Math.max(0, i17 > 0 ? paddingRight / i17 : 0);
        if (a4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C1777l c1777l2 = (C1777l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1777l2.c) {
                    int i19 = width2 - ((ViewGroup.MarginLayoutParams) c1777l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1777l2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C1777l c1777l3 = (C1777l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1777l3.c) {
                int i22 = paddingLeft + ((ViewGroup.MarginLayoutParams) c1777l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c1777l3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // l.AbstractC1756a0, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        ?? r11;
        int i8;
        int i9;
        m mVar;
        boolean z4 = this.f2537I;
        boolean z5 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f2537I = z5;
        if (z4 != z5) {
            this.f2538J = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f2537I && (mVar = this.f2532D) != null && size != this.f2538J) {
            this.f2538J = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f2537I || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C1777l c1777l = (C1777l) getChildAt(i10).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c1777l).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1777l).leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i4);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i11 = size2 - paddingRight;
        int i12 = this.f2539K;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = (i14 / i13) + i12;
        int childCount2 = getChildCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z6 = false;
        int i20 = 0;
        long j4 = 0;
        while (true) {
            i6 = this.f2540L;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i8 = i15;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                i17++;
                if (z7) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C1777l c1777l2 = (C1777l) childAt.getLayoutParams();
                c1777l2.f13800h = false;
                c1777l2.f13797e = 0;
                c1777l2.d = 0;
                c1777l2.f13798f = false;
                ((ViewGroup.MarginLayoutParams) c1777l2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1777l2).rightMargin = 0;
                c1777l2.f13799g = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c1777l2.c ? 1 : i13;
                C1777l c1777l3 = (C1777l) childAt.getLayoutParams();
                int i24 = i13;
                i8 = i15;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i22, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z9 = z8;
                if (i23 <= 0 || (z8 && i23 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i23, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i9++;
                    }
                    if (z9 && i9 < 2) {
                        i9 = 2;
                    }
                }
                c1777l3.f13798f = !c1777l3.c && z9;
                c1777l3.d = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), makeMeasureSpec);
                i18 = Math.max(i18, i9);
                if (c1777l2.f13798f) {
                    i20++;
                }
                if (c1777l2.c) {
                    z6 = true;
                }
                i13 = i24 - i9;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j4 |= 1 << i19;
                }
            }
            i19++;
            size3 = i21;
            paddingBottom = i22;
            i15 = i8;
        }
        int i25 = size3;
        int i26 = i13;
        int i27 = i15;
        boolean z10 = z6 && i17 == 2;
        int i28 = i26;
        boolean z11 = false;
        while (i20 > 0 && i28 > 0) {
            int i29 = Integer.MAX_VALUE;
            long j5 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i31 < childCount2) {
                int i32 = i16;
                C1777l c1777l4 = (C1777l) getChildAt(i31).getLayoutParams();
                boolean z12 = z10;
                if (c1777l4.f13798f) {
                    int i33 = c1777l4.d;
                    if (i33 < i29) {
                        j5 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        j5 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z10 = z12;
                i16 = i32;
            }
            i7 = i16;
            boolean z13 = z10;
            j4 |= j5;
            if (i30 > i28) {
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C1777l c1777l5 = (C1777l) childAt2.getLayoutParams();
                boolean z14 = z6;
                long j6 = 1 << i35;
                if ((j5 & j6) != 0) {
                    if (z13 && c1777l5.f13799g) {
                        r11 = 1;
                        r11 = 1;
                        if (i28 == 1) {
                            childAt2.setPadding(i6 + i27, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1777l5.d += r11;
                    c1777l5.f13800h = r11;
                    i28--;
                } else if (c1777l5.d == i34) {
                    j4 |= j6;
                }
                i35++;
                z6 = z14;
            }
            z10 = z13;
            i16 = i7;
            z11 = true;
        }
        i7 = i16;
        boolean z15 = !z6 && i17 == 1;
        if (i28 > 0 && j4 != 0 && (i28 < i17 - 1 || z15 || i18 > 1)) {
            float bitCount = Long.bitCount(j4);
            if (!z15) {
                if ((j4 & 1) != 0 && !((C1777l) getChildAt(0).getLayoutParams()).f13799g) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j4 & (1 << i36)) != 0 && !((C1777l) getChildAt(i36).getLayoutParams()).f13799g) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i28 * i27) / bitCount) : 0;
            boolean z16 = z11;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j4 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    C1777l c1777l6 = (C1777l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1777l6.f13797e = i37;
                        c1777l6.f13800h = true;
                        if (i38 == 0 && !c1777l6.f13799g) {
                            ((ViewGroup.MarginLayoutParams) c1777l6).leftMargin = (-i37) / 2;
                        }
                        z16 = true;
                    } else if (c1777l6.c) {
                        c1777l6.f13797e = i37;
                        c1777l6.f13800h = true;
                        ((ViewGroup.MarginLayoutParams) c1777l6).rightMargin = (-i37) / 2;
                        z16 = true;
                    } else {
                        if (i38 != 0) {
                            ((ViewGroup.MarginLayoutParams) c1777l6).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c1777l6).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z11 = z16;
        }
        if (z11) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                C1777l c1777l7 = (C1777l) childAt4.getLayoutParams();
                if (c1777l7.f13800h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1777l7.d * i27) + c1777l7.f13797e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i7 : i25);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f2536H.f13770F = z4;
    }

    public void setOnMenuItemClickListener(InterfaceC1779m interfaceC1779m) {
        this.f2541M = interfaceC1779m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1773j c1773j = this.f2536H;
        C1769h c1769h = c1773j.f13787x;
        if (c1769h != null) {
            c1769h.setImageDrawable(drawable);
        } else {
            c1773j.f13788z = true;
            c1773j.y = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f2535G = z4;
    }

    public void setPopupTheme(int i4) {
        if (this.f2534F != i4) {
            this.f2534F = i4;
            if (i4 == 0) {
                this.f2533E = getContext();
            } else {
                this.f2533E = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(C1773j c1773j) {
        this.f2536H = c1773j;
        c1773j.f13785v = this;
        this.f2532D = c1773j.f13780q;
    }
}
