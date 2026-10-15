package l;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e.AbstractC1657a;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753A extends C1789w {

    /* renamed from: e, reason: collision with root package name */
    public final C1792z f13573e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f13574f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f13575g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f13576h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13577i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13578j;

    public C1753A(C1792z c1792z) {
        super(c1792z, 0);
        this.f13575g = null;
        this.f13576h = null;
        this.f13577i = false;
        this.f13578j = false;
        this.f13573e = c1792z;
    }

    @Override // l.C1789w
    public final void b(AttributeSet attributeSet, int i4) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C1792z c1792z = this.f13573e;
        q2.e w2 = q2.e.w(c1792z.getContext(), attributeSet, AbstractC1657a.f12639g, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) w2.f14710q;
        Drawable q4 = w2.q(0);
        if (q4 != null) {
            c1792z.setThumb(q4);
        }
        Drawable p3 = w2.p(1);
        Drawable drawable = this.f13574f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f13574f = p3;
        if (p3 != null) {
            p3.setCallback(c1792z);
            WeakHashMap weakHashMap = H.A.f779a;
            p3.setLayoutDirection(c1792z.getLayoutDirection());
            if (p3.isStateful()) {
                p3.setState(c1792z.getDrawableState());
            }
            e();
        }
        c1792z.invalidate();
        if (typedArray.hasValue(3)) {
            this.f13576h = T.b(typedArray.getInt(3, -1), this.f13576h);
            this.f13578j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f13575g = w2.o(2);
            this.f13577i = true;
        }
        w2.y();
        e();
    }

    public final void e() {
        Drawable drawable = this.f13574f;
        if (drawable != null) {
            if (this.f13577i || this.f13578j) {
                Drawable mutate = drawable.mutate();
                this.f13574f = mutate;
                if (this.f13577i) {
                    mutate.setTintList(this.f13575g);
                }
                if (this.f13578j) {
                    this.f13574f.setTintMode(this.f13576h);
                }
                if (this.f13574f.isStateful()) {
                    this.f13574f.setState(this.f13573e.getDrawableState());
                }
            }
        }
    }

    public final void f(Canvas canvas) {
        if (this.f13574f != null) {
            int max = this.f13573e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f13574f.getIntrinsicWidth();
                int intrinsicHeight = this.f13574f.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f13574f.setBounds(-i4, -i5, i4, i5);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f13574f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
