package P2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class s extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public Drawable f1600o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f1601p;

    /* renamed from: q, reason: collision with root package name */
    public Rect f1602q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1603r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1604s;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect = this.f1602q;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1601p == null || this.f1600o == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f1603r) {
            rect.set(0, 0, width, this.f1601p.top);
            this.f1600o.setBounds(rect);
            this.f1600o.draw(canvas);
        }
        if (this.f1604s) {
            rect.set(0, height - this.f1601p.bottom, width, height);
            this.f1600o.setBounds(rect);
            this.f1600o.draw(canvas);
        }
        Rect rect2 = this.f1601p;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f1600o.setBounds(rect);
        this.f1600o.draw(canvas);
        Rect rect3 = this.f1601p;
        rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
        this.f1600o.setBounds(rect);
        this.f1600o.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f1600o;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f1600o;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z4) {
        this.f1604s = z4;
    }

    public void setDrawTopInsetForeground(boolean z4) {
        this.f1603r = z4;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f1600o = drawable;
    }
}
