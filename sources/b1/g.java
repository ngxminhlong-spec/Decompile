package b1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p1.AbstractC1906D;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1906D f3480o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f3481p;

    /* renamed from: q, reason: collision with root package name */
    public final Drawable f3482q;

    /* renamed from: r, reason: collision with root package name */
    public final Drawable f3483r;

    /* renamed from: s, reason: collision with root package name */
    public final float f3484s;

    /* renamed from: t, reason: collision with root package name */
    public final float f3485t;

    public g(Context context, AbstractC1906D abstractC1906D, int i4, int i5, int i6) {
        this.f3480o = abstractC1906D;
        this.f3481p = context.getDrawable(i4);
        this.f3482q = context.getDrawable(i5);
        this.f3483r = context.getDrawable(i6);
        this.f3484s = r2.getIntrinsicWidth() / r2.getIntrinsicHeight();
        this.f3485t = r1.getIntrinsicWidth() / r1.getIntrinsicHeight();
    }

    @Override // b1.e
    public final void j(Canvas canvas) {
        AbstractC1906D abstractC1906D = this.f3480o;
        boolean z4 = abstractC1906D.f14393R.f3557s;
        float G3 = abstractC1906D.G();
        float F2 = abstractC1906D.F();
        int i4 = (int) (F2 / 4.0f);
        float f4 = i4;
        int i5 = (int) (this.f3484s * f4);
        float f5 = (int) (F2 / 5.0f);
        canvas.translate((int) ((G3 - i5) / 2.0f), f5);
        if (z4) {
            Drawable drawable = this.f3482q;
            drawable.setBounds(0, 0, i5, i4);
            drawable.draw(canvas);
        } else {
            Drawable drawable2 = this.f3481p;
            drawable2.setBounds(0, 0, i5, i4);
            drawable2.draw(canvas);
        }
        canvas.translate(-r6, -r8);
        int i6 = (int) ((F2 / 7.0f) + f4 + f5);
        int i7 = (int) (G3 / 2.5d);
        float f6 = i7;
        int i8 = (int) (f6 / this.f3485t);
        canvas.translate((int) ((G3 - f6) / 2.0f), i6);
        Drawable drawable3 = this.f3483r;
        drawable3.setBounds(0, 0, i7, i8);
        drawable3.draw(canvas);
        canvas.translate(-r2, -i6);
    }
}
