package androidx.appcompat.widget;

import H.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e.AbstractC1657a;
import java.util.WeakHashMap;
import l.AbstractC1780m0;
import l.C1755a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public boolean f2479o;

    /* renamed from: p, reason: collision with root package name */
    public View f2480p;

    /* renamed from: q, reason: collision with root package name */
    public View f2481q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f2482r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f2483s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f2484t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2485u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2486v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2487w;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1755a c1755a = new C1755a(this);
        WeakHashMap weakHashMap = A.f779a;
        setBackground(c1755a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12635a);
        boolean z4 = false;
        this.f2482r = obtainStyledAttributes.getDrawable(0);
        this.f2483s = obtainStyledAttributes.getDrawable(2);
        this.f2487w = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f2485u = true;
            this.f2484t = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2485u ? !(this.f2482r != null || this.f2483s != null) : this.f2484t == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2482r;
        if (drawable != null && drawable.isStateful()) {
            this.f2482r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2483s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2483s.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2484t;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2484t.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2482r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2483s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2484t;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2480p = findViewById(R.id.action_bar);
        this.f2481q = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2479o || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        boolean z5 = true;
        if (this.f2485u) {
            Drawable drawable = this.f2484t;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f2482r == null) {
                z5 = false;
            } else if (this.f2480p.getVisibility() == 0) {
                this.f2482r.setBounds(this.f2480p.getLeft(), this.f2480p.getTop(), this.f2480p.getRight(), this.f2480p.getBottom());
            } else {
                View view = this.f2481q;
                if (view == null || view.getVisibility() != 0) {
                    this.f2482r.setBounds(0, 0, 0, 0);
                } else {
                    this.f2482r.setBounds(this.f2481q.getLeft(), this.f2481q.getTop(), this.f2481q.getRight(), this.f2481q.getBottom());
                }
            }
            this.f2486v = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f2480p == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f2487w) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f2480p == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2482r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2482r);
        }
        this.f2482r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2480p;
            if (view != null) {
                this.f2482r.setBounds(view.getLeft(), this.f2480p.getTop(), this.f2480p.getRight(), this.f2480p.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f2485u ? !(this.f2482r != null || this.f2483s != null) : this.f2484t == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2484t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2484t);
        }
        this.f2484t = drawable;
        boolean z4 = this.f2485u;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f2484t) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f2482r != null || this.f2483s != null) : this.f2484t == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f2483s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2483s);
        }
        this.f2483s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2486v && this.f2483s != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f2485u ? !(this.f2482r != null || this.f2483s != null) : this.f2484t == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC1780m0 abstractC1780m0) {
    }

    public void setTransitioning(boolean z4) {
        this.f2479o = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f2482r;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f2483s;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f2484t;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2482r;
        boolean z4 = this.f2485u;
        if (drawable == drawable2 && !z4) {
            return true;
        }
        if (drawable == this.f2483s && this.f2486v) {
            return true;
        }
        return (drawable == this.f2484t && z4) || super.verifyDrawable(drawable);
    }
}
