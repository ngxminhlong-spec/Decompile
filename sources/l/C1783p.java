package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.gms.internal.ads.Tw;
import g.AbstractC1678a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1783p extends CheckBox {

    /* renamed from: o, reason: collision with root package name */
    public final Q1.H f13814o;

    /* renamed from: p, reason: collision with root package name */
    public final Tw f13815p;

    /* renamed from: q, reason: collision with root package name */
    public final L f13816q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783p(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        y0.a(context);
        Q1.H h4 = new Q1.H(this);
        this.f13814o = h4;
        h4.b(attributeSet, i4);
        Tw tw = new Tw(this);
        this.f13815p = tw;
        tw.l(attributeSet, i4);
        L l4 = new L(this);
        this.f13816q = l4;
        l4.d(attributeSet, i4);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Tw tw = this.f13815p;
        if (tw != null) {
            tw.a();
        }
        L l4 = this.f13816q;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        Q1.H h4 = this.f13814o;
        if (h4 != null) {
            h4.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        Tw tw = this.f13815p;
        if (tw != null) {
            return tw.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Tw tw = this.f13815p;
        if (tw != null) {
            return tw.j();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        Q1.H h4 = this.f13814o;
        if (h4 != null) {
            return (ColorStateList) h4.f1635e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        Q1.H h4 = this.f13814o;
        if (h4 != null) {
            return (PorterDuff.Mode) h4.f1636f;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Tw tw = this.f13815p;
        if (tw != null) {
            tw.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        Tw tw = this.f13815p;
        if (tw != null) {
            tw.p(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(AbstractC1678a.a(getContext(), i4));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        Q1.H h4 = this.f13814o;
        if (h4 != null) {
            if (h4.c) {
                h4.c = false;
            } else {
                h4.c = true;
                h4.a();
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Tw tw = this.f13815p;
        if (tw != null) {
            tw.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Tw tw = this.f13815p;
        if (tw != null) {
            tw.v(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        Q1.H h4 = this.f13814o;
        if (h4 != null) {
            h4.f1635e = colorStateList;
            h4.f1633a = true;
            h4.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        Q1.H h4 = this.f13814o;
        if (h4 != null) {
            h4.f1636f = mode;
            h4.f1634b = true;
            h4.a();
        }
    }
}
