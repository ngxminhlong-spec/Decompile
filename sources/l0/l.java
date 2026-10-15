package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f13920a;

    /* renamed from: b, reason: collision with root package name */
    public k f13921b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13922e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f13923f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f13924g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f13925h;

    /* renamed from: i, reason: collision with root package name */
    public int f13926i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13927j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13928k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f13929l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f13920a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new n(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new n(this);
    }
}
