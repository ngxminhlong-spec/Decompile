package P2;

import H.A;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class d extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    public int f1563o;

    /* renamed from: p, reason: collision with root package name */
    public int f1564p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1565q;

    /* renamed from: r, reason: collision with root package name */
    public int f1566r;

    public int getItemSpacing() {
        return this.f1564p;
    }

    public int getLineSpacing() {
        return this.f1563o;
    }

    public int getRowCount() {
        return this.f1566r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (getChildCount() == 0) {
            this.f1566r = 0;
            return;
        }
        this.f1566r = 1;
        WeakHashMap weakHashMap = A.f779a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingRight = z5 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z5 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i10 = (i6 - i4) - paddingLeft;
        int i11 = paddingRight;
        int i12 = paddingTop;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i9 = marginLayoutParams.getMarginStart();
                    i8 = marginLayoutParams.getMarginEnd();
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i11 + i9;
                if (!this.f1565q && measuredWidth > i10) {
                    i12 = this.f1563o + paddingTop;
                    this.f1566r++;
                    i11 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f1566r - 1));
                int i14 = i11 + i9;
                int measuredWidth2 = childAt.getMeasuredWidth() + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z5) {
                    childAt.layout(i10 - measuredWidth2, i12, (i10 - i11) - i9, measuredHeight);
                } else {
                    childAt.layout(i14, i12, measuredWidth2, measuredHeight);
                }
                i11 += childAt.getMeasuredWidth() + i9 + i8 + this.f1564p;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int i9 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i9 - getPaddingRight();
        int i10 = paddingTop;
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i8 = marginLayoutParams.leftMargin;
                    i7 = marginLayoutParams.rightMargin;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i13 = i7;
                if (childAt.getMeasuredWidth() + paddingLeft + i8 > paddingRight && !((ChipGroup) this).f1565q) {
                    paddingLeft = getPaddingLeft();
                    i10 = paddingTop + this.f1563o;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                if (measuredWidth > i11) {
                    i11 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i8 + i13 + this.f1564p + paddingLeft;
                if (i12 == getChildCount() - 1) {
                    i11 += i13;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i11;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i6 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i6 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i6) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i4) {
        this.f1564p = i4;
    }

    public void setLineSpacing(int i4) {
        this.f1563o = i4;
    }

    public void setSingleLine(boolean z4) {
        this.f1565q = z4;
    }
}
