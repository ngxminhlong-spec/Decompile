package S2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import d3.AbstractC1654b;
import m2.AbstractC1806a;
import z.AbstractC2130i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1769a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f1770b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1771e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorStateList f1772f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1773g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1774h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1775i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1776j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1777k = false;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f1778l;

    public d(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, B2.a.f158x);
        this.f1769a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f1770b = AbstractC1654b.u(context, obtainStyledAttributes, 3);
        AbstractC1654b.u(context, obtainStyledAttributes, 4);
        AbstractC1654b.u(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i5 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1776j = obtainStyledAttributes.getResourceId(i5, 0);
        this.f1771e = obtainStyledAttributes.getString(i5);
        obtainStyledAttributes.getBoolean(14, false);
        this.f1772f = AbstractC1654b.u(context, obtainStyledAttributes, 6);
        this.f1773g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f1774h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f1775i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1778l;
        int i4 = this.c;
        if (typeface == null && (str = this.f1771e) != null) {
            this.f1778l = Typeface.create(str, i4);
        }
        if (this.f1778l == null) {
            int i5 = this.d;
            if (i5 == 1) {
                this.f1778l = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.f1778l = Typeface.SERIF;
            } else if (i5 != 3) {
                this.f1778l = Typeface.DEFAULT;
            } else {
                this.f1778l = Typeface.MONOSPACE;
            }
            this.f1778l = Typeface.create(this.f1778l, i4);
        }
    }

    public final void b(Context context, AbstractC1806a abstractC1806a) {
        a();
        int i4 = this.f1776j;
        if (i4 == 0) {
            this.f1777k = true;
        }
        if (this.f1777k) {
            abstractC1806a.M(this.f1778l, true);
            return;
        }
        try {
            b bVar = new b(this, abstractC1806a);
            Object obj = AbstractC2130i.f15936a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                AbstractC2130i.a(context, i4, new TypedValue(), 0, bVar, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1777k = true;
            abstractC1806a.L(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f1771e, e4);
            this.f1777k = true;
            abstractC1806a.L(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, AbstractC1806a abstractC1806a) {
        a();
        d(textPaint, this.f1778l);
        b(context, new c(this, textPaint, abstractC1806a));
        ColorStateList colorStateList = this.f1770b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1772f;
        textPaint.setShadowLayer(this.f1775i, this.f1773g, this.f1774h, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1769a);
    }
}
