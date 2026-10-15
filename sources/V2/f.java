package V2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f1854a;

    /* renamed from: b, reason: collision with root package name */
    public M2.a f1855b;
    public ColorStateList c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1856e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1857f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f1858g;

    /* renamed from: h, reason: collision with root package name */
    public float f1859h;

    /* renamed from: i, reason: collision with root package name */
    public float f1860i;

    /* renamed from: j, reason: collision with root package name */
    public float f1861j;

    /* renamed from: k, reason: collision with root package name */
    public int f1862k;

    /* renamed from: l, reason: collision with root package name */
    public float f1863l;

    /* renamed from: m, reason: collision with root package name */
    public float f1864m;

    /* renamed from: n, reason: collision with root package name */
    public int f1865n;

    /* renamed from: o, reason: collision with root package name */
    public int f1866o;

    /* renamed from: p, reason: collision with root package name */
    public int f1867p;

    /* renamed from: q, reason: collision with root package name */
    public Paint.Style f1868q;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f1884s = true;
        return gVar;
    }
}
