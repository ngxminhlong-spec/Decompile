package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.AbstractC1657a;
import java.lang.ref.WeakReference;
import l.L0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: o, reason: collision with root package name */
    public int f2635o;

    /* renamed from: p, reason: collision with root package name */
    public int f2636p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f2637q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f2638r;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2635o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12634A, 0, 0);
        this.f2636p = obtainStyledAttributes.getResourceId(2, -1);
        this.f2635o = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f2635o == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f2638r;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f2635o, viewGroup, false);
        int i4 = this.f2636p;
        if (i4 != -1) {
            inflate.setId(i4);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f2637q = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2636p;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2638r;
    }

    public int getLayoutResource() {
        return this.f2635o;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f2636p = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2638r = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f2635o = i4;
    }

    public void setOnInflateListener(L0 l02) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.f2637q;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            a();
        }
    }
}
