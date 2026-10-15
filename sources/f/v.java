package f;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0831kn;
import j.AbstractC1719a;
import j.C1726h;
import java.lang.ref.WeakReference;
import l.C1773j;
import l.G0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v extends AbstractC1719a implements k.k {

    /* renamed from: q, reason: collision with root package name */
    public final Context f12923q;

    /* renamed from: r, reason: collision with root package name */
    public final k.m f12924r;

    /* renamed from: s, reason: collision with root package name */
    public C0831kn f12925s;

    /* renamed from: t, reason: collision with root package name */
    public WeakReference f12926t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f12927u;

    public v(w wVar, Context context, C0831kn c0831kn) {
        this.f12927u = wVar;
        this.f12923q = context;
        this.f12925s = c0831kn;
        k.m mVar = new k.m(context);
        mVar.f13435l = 1;
        this.f12924r = mVar;
        mVar.f13428e = this;
    }

    @Override // j.AbstractC1719a
    public final void a() {
        w wVar = this.f12927u;
        if (wVar.f12943p != this) {
            return;
        }
        if (wVar.f12950w) {
            wVar.f12944q = this;
            wVar.f12945r = this.f12925s;
        } else {
            this.f12925s.t(this);
        }
        this.f12925s = null;
        wVar.j0(false);
        ActionBarContextView actionBarContextView = wVar.f12940m;
        if (actionBarContextView.y == null) {
            actionBarContextView.removeAllViews();
            actionBarContextView.f2505z = null;
            actionBarContextView.f2497q = null;
        }
        ((G0) wVar.f12939l).f13603a.sendAccessibilityEvent(32);
        wVar.f12937j.setHideOnContentScrollEnabled(wVar.f12931B);
        wVar.f12943p = null;
    }

    @Override // j.AbstractC1719a
    public final View b() {
        WeakReference weakReference = this.f12926t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC1719a
    public final k.m c() {
        return this.f12924r;
    }

    @Override // j.AbstractC1719a
    public final MenuInflater d() {
        return new C1726h(this.f12923q);
    }

    @Override // j.AbstractC1719a
    public final CharSequence e() {
        return this.f12927u.f12940m.getSubtitle();
    }

    @Override // j.AbstractC1719a
    public final CharSequence f() {
        return this.f12927u.f12940m.getTitle();
    }

    @Override // k.k
    public final boolean g(k.m mVar, MenuItem menuItem) {
        C0831kn c0831kn = this.f12925s;
        if (c0831kn != null) {
            return ((C0326Qb) c0831kn.f9319p).s(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC1719a
    public final void h() {
        if (this.f12927u.f12943p != this) {
            return;
        }
        k.m mVar = this.f12924r;
        mVar.w();
        try {
            this.f12925s.u(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // k.k
    public final void i(k.m mVar) {
        if (this.f12925s == null) {
            return;
        }
        h();
        C1773j c1773j = this.f12927u.f12940m.f2498r;
        if (c1773j != null) {
            c1773j.n();
        }
    }

    @Override // j.AbstractC1719a
    public final boolean j() {
        return this.f12927u.f12940m.f2493F;
    }

    @Override // j.AbstractC1719a
    public final void k(View view) {
        this.f12927u.f12940m.setCustomView(view);
        this.f12926t = new WeakReference(view);
    }

    @Override // j.AbstractC1719a
    public final void l(int i4) {
        m(this.f12927u.f12935h.getResources().getString(i4));
    }

    @Override // j.AbstractC1719a
    public final void m(CharSequence charSequence) {
        this.f12927u.f12940m.setSubtitle(charSequence);
    }

    @Override // j.AbstractC1719a
    public final void n(int i4) {
        o(this.f12927u.f12935h.getResources().getString(i4));
    }

    @Override // j.AbstractC1719a
    public final void o(CharSequence charSequence) {
        this.f12927u.f12940m.setTitle(charSequence);
    }

    @Override // j.AbstractC1719a
    public final void p(boolean z4) {
        this.f13273p = z4;
        this.f12927u.f12940m.setTitleOptional(z4);
    }
}
