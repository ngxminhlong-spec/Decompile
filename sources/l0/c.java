package l0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import h.C1692f;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends e implements Animatable {

    /* renamed from: q, reason: collision with root package name */
    public final Context f13881q;

    /* renamed from: r, reason: collision with root package name */
    public final C1692f f13882r = new C1692f(this);

    /* renamed from: p, reason: collision with root package name */
    public final b f13880p = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, l0.b] */
    public c(Context context) {
        this.f13881q = context;
    }

    @Override // l0.e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f13880p;
        bVar.f13878a.draw(canvas);
        if (bVar.f13879b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getAlpha() : this.f13880p.f13878a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f13880p.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getColorFilter() : this.f13880p.f13878a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f13884o == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new O2.a(this.f13884o.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f13880p.f13878a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f13880p.f13878a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getOpacity() : this.f13880p.f13878a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0182, code lost:
    
        if (r8.f13879b != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0184, code lost:
    
        r8.f13879b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x018b, code lost:
    
        r8.f13879b.playTogether(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0192, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Type inference failed for: r11v10, types: [r.e, r.i] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.isAutoMirrored() : this.f13880p.f13878a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f13884o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f13880p.f13879b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.isStateful() : this.f13880p.f13878a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f13880p.f13878a.setBounds(rect);
        }
    }

    @Override // l0.e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.setLevel(i4) : this.f13880p.f13878a.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.setState(iArr) : this.f13880p.f13878a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f13880p.f13878a.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f13880p.f13878a.setAutoMirrored(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13880p.f13878a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            android.support.v4.media.session.a.r(drawable, i4);
        } else {
            this.f13880p.f13878a.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f13880p.f13878a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f13880p.f13878a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            return drawable.setVisible(z4, z5);
        }
        this.f13880p.f13878a.setVisible(z4, z5);
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f13880p;
        if (bVar.f13879b.isStarted()) {
            return;
        }
        bVar.f13879b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f13880p.f13879b.end();
        }
    }
}
