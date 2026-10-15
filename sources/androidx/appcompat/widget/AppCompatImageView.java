package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.Tw;
import l.C1789w;
import l.y0;
import l.z0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: o, reason: collision with root package name */
    public final Tw f2543o;

    /* renamed from: p, reason: collision with root package name */
    public final C1789w f2544p;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        y0.a(context);
        Tw tw = new Tw(this);
        this.f2543o = tw;
        tw.l(attributeSet, i4);
        C1789w c1789w = new C1789w(this, 1);
        this.f2544p = c1789w;
        c1789w.b(attributeSet, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Tw tw = this.f2543o;
        if (tw != null) {
            tw.a();
        }
        C1789w c1789w = this.f2544p;
        if (c1789w != null) {
            c1789w.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Tw tw = this.f2543o;
        if (tw != null) {
            return tw.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Tw tw = this.f2543o;
        if (tw != null) {
            return tw.j();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        z0 z0Var;
        C1789w c1789w = this.f2544p;
        if (c1789w == null || (z0Var = (z0) c1789w.c) == null) {
            return null;
        }
        return z0Var.f13867a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z0 z0Var;
        C1789w c1789w = this.f2544p;
        if (c1789w == null || (z0Var = (z0) c1789w.c) == null) {
            return null;
        }
        return z0Var.f13868b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2544p.f13839b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Tw tw = this.f2543o;
        if (tw != null) {
            tw.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        Tw tw = this.f2543o;
        if (tw != null) {
            tw.p(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1789w c1789w = this.f2544p;
        if (c1789w != null) {
            c1789w.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1789w c1789w = this.f2544p;
        if (c1789w != null) {
            c1789w.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        C1789w c1789w = this.f2544p;
        if (c1789w != null) {
            c1789w.c(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1789w c1789w = this.f2544p;
        if (c1789w != null) {
            c1789w.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Tw tw = this.f2543o;
        if (tw != null) {
            tw.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Tw tw = this.f2543o;
        if (tw != null) {
            tw.v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1789w c1789w = this.f2544p;
        if (c1789w != null) {
            if (((z0) c1789w.c) == null) {
                c1789w.c = new Object();
            }
            z0 z0Var = (z0) c1789w.c;
            z0Var.f13867a = colorStateList;
            z0Var.d = true;
            c1789w.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1789w c1789w = this.f2544p;
        if (c1789w != null) {
            if (((z0) c1789w.c) == null) {
                c1789w.c = new Object();
            }
            z0 z0Var = (z0) c1789w.c;
            z0Var.f13868b = mode;
            z0Var.c = true;
            c1789w.a();
        }
    }
}
