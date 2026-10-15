package androidx.appcompat.widget;

import H.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e.AbstractC1657a;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public boolean f2545o;

    /* renamed from: p, reason: collision with root package name */
    public int f2546p;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2546p = -1;
        int[] iArr = AbstractC1657a.f12643k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f2545o = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z4) {
        setOrientation(z4 ? 1 : 0);
        setGravity(z4 ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z4 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z4;
        int i7;
        int size = View.MeasureSpec.getSize(i4);
        if (this.f2545o) {
            if (size > this.f2546p && getOrientation() == 1) {
                setStacked(false);
            }
            this.f2546p = size;
        }
        if (getOrientation() != 1 && View.MeasureSpec.getMode(i4) == 1073741824) {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        } else {
            i6 = i4;
            z4 = false;
        }
        super.onMeasure(i6, i5);
        if (this.f2545o && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i4, i5);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i7 = -1;
            if (i8 >= childCount) {
                i8 = -1;
                break;
            } else if (getChildAt(i8).getVisibility() == 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((getOrientation() == 1 ? 1 : 0) != 0) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
                r3 = i7 >= 0 ? getChildAt(i7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                r3 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = A.f779a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f2545o != z4) {
            this.f2545o = z4;
            if (!z4 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
