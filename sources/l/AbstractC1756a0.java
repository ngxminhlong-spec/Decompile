package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import e.AbstractC1657a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1756a0 extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f13703A;

    /* renamed from: B, reason: collision with root package name */
    public int f13704B;

    /* renamed from: C, reason: collision with root package name */
    public int f13705C;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13706o;

    /* renamed from: p, reason: collision with root package name */
    public int f13707p;

    /* renamed from: q, reason: collision with root package name */
    public int f13708q;

    /* renamed from: r, reason: collision with root package name */
    public int f13709r;

    /* renamed from: s, reason: collision with root package name */
    public int f13710s;

    /* renamed from: t, reason: collision with root package name */
    public int f13711t;

    /* renamed from: u, reason: collision with root package name */
    public float f13712u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13713v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f13714w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f13715x;
    public Drawable y;

    /* renamed from: z, reason: collision with root package name */
    public int f13716z;

    public AbstractC1756a0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f13706o = true;
        this.f13707p = -1;
        this.f13708q = 0;
        this.f13710s = 8388659;
        q2.e w2 = q2.e.w(context, attributeSet, AbstractC1657a.f12645m, i4);
        TypedArray typedArray = (TypedArray) w2.f14710q;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f13712u = typedArray.getFloat(4, -1.0f);
        this.f13707p = typedArray.getInt(3, -1);
        this.f13713v = typedArray.getBoolean(7, false);
        setDividerDrawable(w2.p(5));
        this.f13704B = typedArray.getInt(8, 0);
        this.f13705C = typedArray.getDimensionPixelSize(6, 0);
        w2.y();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Z;
    }

    public final void d(Canvas canvas, int i4) {
        this.y.setBounds(getPaddingLeft() + this.f13705C, i4, (getWidth() - getPaddingRight()) - this.f13705C, this.f13703A + i4);
        this.y.draw(canvas);
    }

    public final void e(Canvas canvas, int i4) {
        this.y.setBounds(i4, getPaddingTop() + this.f13705C, this.f13716z + i4, (getHeight() - getPaddingBottom()) - this.f13705C);
        this.y.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Z generateDefaultLayoutParams() {
        int i4 = this.f13709r;
        if (i4 == 0) {
            return new Z(-2);
        }
        if (i4 == 1) {
            return new Z(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Z generateLayoutParams(AttributeSet attributeSet) {
        return new Z(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f13707p < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f13707p;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f13707p == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f13708q;
        if (this.f13709r == 1 && (i4 = this.f13710s & 112) != 48) {
            if (i4 == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f13711t) / 2;
            } else if (i4 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f13711t;
            }
        }
        return i6 + ((ViewGroup.MarginLayoutParams) ((Z) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f13707p;
    }

    public Drawable getDividerDrawable() {
        return this.y;
    }

    public int getDividerPadding() {
        return this.f13705C;
    }

    public int getDividerWidth() {
        return this.f13716z;
    }

    public int getGravity() {
        return this.f13710s;
    }

    public int getOrientation() {
        return this.f13709r;
    }

    public int getShowDividers() {
        return this.f13704B;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f13712u;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Z generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new Z(layoutParams);
    }

    public final boolean i(int i4) {
        if (i4 == 0) {
            return (this.f13704B & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.f13704B & 4) != 0;
        }
        if ((this.f13704B & 2) != 0) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i4;
        if (this.y == null) {
            return;
        }
        int i5 = 0;
        if (this.f13709r == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && i(i5)) {
                    d(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((Z) childAt.getLayoutParams())).topMargin) - this.f13703A);
                }
                i5++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f13703A : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((Z) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a4 = M0.a(this);
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i5)) {
                Z z4 = (Z) childAt3.getLayoutParams();
                e(canvas, a4 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) z4).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) z4).leftMargin) - this.f13716z);
            }
            i5++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                Z z5 = (Z) childAt4.getLayoutParams();
                if (a4) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) z5).leftMargin;
                    i4 = this.f13716z;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) z5).rightMargin;
                }
            } else if (a4) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f13716z;
                right = left - i4;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC1756a0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC1756a0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z4) {
        this.f13706o = z4;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f13707p = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.y) {
            return;
        }
        this.y = drawable;
        if (drawable != null) {
            this.f13716z = drawable.getIntrinsicWidth();
            this.f13703A = drawable.getIntrinsicHeight();
        } else {
            this.f13716z = 0;
            this.f13703A = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f13705C = i4;
    }

    public void setGravity(int i4) {
        if (this.f13710s != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f13710s = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.f13710s;
        if ((8388615 & i6) != i5) {
            this.f13710s = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f13713v = z4;
    }

    public void setOrientation(int i4) {
        if (this.f13709r != i4) {
            this.f13709r = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f13704B) {
            requestLayout();
        }
        this.f13704B = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f13710s;
        if ((i6 & 112) != i5) {
            this.f13710s = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.f13712u = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
