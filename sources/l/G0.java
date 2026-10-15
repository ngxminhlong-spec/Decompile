package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G0 implements S {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f13603a;

    /* renamed from: b, reason: collision with root package name */
    public int f13604b;
    public View c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f13605e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f13606f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13607g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f13608h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f13609i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f13610j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f13611k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13612l;

    /* renamed from: m, reason: collision with root package name */
    public C1773j f13613m;

    /* renamed from: n, reason: collision with root package name */
    public int f13614n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f13615o;

    public final void a(int i4) {
        View view;
        Toolbar toolbar = this.f13603a;
        int i5 = this.f13604b ^ i4;
        this.f13604b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    b();
                }
                if ((this.f13604b & 4) != 0) {
                    Drawable drawable = this.f13606f;
                    if (drawable == null) {
                        drawable = this.f13615o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    toolbar.setTitle(this.f13608h);
                    toolbar.setSubtitle(this.f13609i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f13603a;
        if ((this.f13604b & 4) != 0) {
            if (TextUtils.isEmpty(this.f13610j)) {
                toolbar.setNavigationContentDescription(this.f13614n);
            } else {
                toolbar.setNavigationContentDescription(this.f13610j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i4 = this.f13604b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f13605e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f13603a.setLogo(drawable);
    }
}
