package com.google.android.material.chip;

import J2.f;
import J2.g;
import J2.h;
import J2.i;
import P2.d;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ChipGroup extends d {

    /* renamed from: s */
    public int f12351s;

    /* renamed from: t */
    public int f12352t;

    /* renamed from: u */
    public boolean f12353u;

    /* renamed from: v */
    public boolean f12354v;

    /* renamed from: w */
    public final f f12355w;

    /* renamed from: x */
    public final i f12356x;
    public int y;

    /* renamed from: z */
    public boolean f12357z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r0 = 2131821208(0x7f110298, float:1.9275153E38)
            r4 = 2130903174(0x7f030086, float:1.7413159E38)
            android.content.Context r10 = Z2.a.a(r10, r11, r4, r0)
            r9.<init>(r10, r11, r4)
            r0 = 0
            r9.f1565q = r0
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r1 = B2.a.f141g
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1, r0, r0)
            r7 = 1
            int r1 = r10.getDimensionPixelSize(r7, r0)
            r9.f1563o = r1
            int r1 = r10.getDimensionPixelSize(r0, r0)
            r9.f1564p = r1
            r10.recycle()
            J2.f r10 = new J2.f
            r10.<init>(r0, r9)
            r9.f12355w = r10
            J2.i r10 = new J2.i
            r10.<init>(r9)
            r9.f12356x = r10
            r8 = -1
            r9.y = r8
            r9.f12357z = r0
            android.content.Context r1 = r9.getContext()
            r5 = 2131821208(0x7f110298, float:1.9275153E38)
            int[] r6 = new int[r0]
            int[] r3 = B2.a.c
            r2 = r11
            android.content.res.TypedArray r11 = P2.w.d(r1, r2, r3, r4, r5, r6)
            int r1 = r11.getDimensionPixelOffset(r7, r0)
            r2 = 2
            int r2 = r11.getDimensionPixelOffset(r2, r1)
            r9.setChipSpacingHorizontal(r2)
            r2 = 3
            int r1 = r11.getDimensionPixelOffset(r2, r1)
            r9.setChipSpacingVertical(r1)
            r1 = 5
            boolean r1 = r11.getBoolean(r1, r0)
            r9.setSingleLine(r1)
            r1 = 6
            boolean r1 = r11.getBoolean(r1, r0)
            r9.setSingleSelection(r1)
            r1 = 4
            boolean r1 = r11.getBoolean(r1, r0)
            r9.setSelectionRequired(r1)
            int r0 = r11.getResourceId(r0, r8)
            if (r0 == r8) goto L81
            r9.y = r0
        L81:
            r11.recycle()
            super.setOnHierarchyChangeListener(r10)
            java.util.WeakHashMap r10 = H.A.f779a
            r9.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getChipCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                i4++;
            }
        }
        return i4;
    }

    public void setCheckedId(int i4) {
        this.y = i4;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i5 = this.y;
                if (i5 != -1 && this.f12353u) {
                    b(i5, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i4, layoutParams);
    }

    public final void b(int i4, boolean z4) {
        View findViewById = findViewById(i4);
        if (findViewById instanceof Chip) {
            this.f12357z = true;
            ((Chip) findViewById).setChecked(z4);
            this.f12357z = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f12353u) {
            return this.y;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f12353u) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f12351s;
    }

    public int getChipSpacingVertical() {
        return this.f12352t;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.y;
        if (i4 != -1) {
            b(i4, true);
            setCheckedId(this.y);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.f1565q ? getChipCount() : -1, false, this.f12353u ? 1 : 2));
    }

    public void setChipSpacing(int i4) {
        setChipSpacingHorizontal(i4);
        setChipSpacingVertical(i4);
    }

    public void setChipSpacingHorizontal(int i4) {
        if (this.f12351s != i4) {
            this.f12351s = i4;
            setItemSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i4) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingResource(int i4) {
        setChipSpacing(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingVertical(int i4) {
        if (this.f12352t != i4) {
            this.f12352t = i4;
            setLineSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i4) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i4));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i4) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(h hVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f12356x.f1025o = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z4) {
        this.f12354v = z4;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i4) {
        setSingleLine(getResources().getBoolean(i4));
    }

    @Override // P2.d
    public void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }

    public void setSingleSelection(boolean z4) {
        if (this.f12353u != z4) {
            this.f12353u = z4;
            this.f12357z = true;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f12357z = false;
            setCheckedId(-1);
        }
    }
}
