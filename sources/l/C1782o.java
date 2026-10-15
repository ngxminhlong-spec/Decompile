package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.gms.internal.ads.Tw;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1782o extends Button implements J.b {

    /* renamed from: o, reason: collision with root package name */
    public final Tw f13810o;

    /* renamed from: p, reason: collision with root package name */
    public final L f13811p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1782o(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        y0.a(context);
        Tw tw = new Tw(this);
        this.f13810o = tw;
        tw.l(attributeSet, i4);
        L l4 = new L(this);
        this.f13811p = l4;
        l4.d(attributeSet, i4);
        l4.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Tw tw = this.f13810o;
        if (tw != null) {
            tw.a();
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (J.b.f931b) {
            return super.getAutoSizeMaxTextSize();
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            return Math.round(l4.f13654i.f13668e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (J.b.f931b) {
            return super.getAutoSizeMinTextSize();
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            return Math.round(l4.f13654i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (J.b.f931b) {
            return super.getAutoSizeStepGranularity();
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            return Math.round(l4.f13654i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (J.b.f931b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        L l4 = this.f13811p;
        return l4 != null ? l4.f13654i.f13669f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (J.b.f931b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            return l4.f13654i.f13666a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        Tw tw = this.f13810o;
        if (tw != null) {
            return tw.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Tw tw = this.f13810o;
        if (tw != null) {
            return tw.j();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        L l4 = this.f13811p;
        if (l4 == null || J.b.f931b) {
            return;
        }
        l4.f13654i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        L l4 = this.f13811p;
        if (l4 != null) {
            N n4 = l4.f13654i;
            if (J.b.f931b || !n4.f()) {
                return;
            }
            n4.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (J.b.f931b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            l4.f(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (J.b.f931b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            l4.g(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (J.b.f931b) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            l4.h(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Tw tw = this.f13810o;
        if (tw != null) {
            tw.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        Tw tw = this.f13810o;
        if (tw != null) {
            tw.p(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.gms.internal.play_billing.B.U(callback, this));
    }

    public void setSupportAllCaps(boolean z4) {
        L l4 = this.f13811p;
        if (l4 != null) {
            l4.f13648a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Tw tw = this.f13810o;
        if (tw != null) {
            tw.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Tw tw = this.f13810o;
        if (tw != null) {
            tw.v(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        L l4 = this.f13811p;
        if (l4 != null) {
            l4.e(context, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        boolean z4 = J.b.f931b;
        if (z4) {
            super.setTextSize(i4, f4);
            return;
        }
        L l4 = this.f13811p;
        if (l4 != null) {
            N n4 = l4.f13654i;
            if (z4 || n4.f()) {
                return;
            }
            n4.g(i4, f4);
        }
    }
}
