package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0831kn;
import java.lang.ref.WeakReference;
import k.k;
import k.m;
import l.C1773j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1722d extends AbstractC1719a implements k {

    /* renamed from: q, reason: collision with root package name */
    public Context f13276q;

    /* renamed from: r, reason: collision with root package name */
    public ActionBarContextView f13277r;

    /* renamed from: s, reason: collision with root package name */
    public C0831kn f13278s;

    /* renamed from: t, reason: collision with root package name */
    public WeakReference f13279t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13280u;

    /* renamed from: v, reason: collision with root package name */
    public m f13281v;

    @Override // j.AbstractC1719a
    public final void a() {
        if (this.f13280u) {
            return;
        }
        this.f13280u = true;
        this.f13277r.sendAccessibilityEvent(32);
        this.f13278s.t(this);
    }

    @Override // j.AbstractC1719a
    public final View b() {
        WeakReference weakReference = this.f13279t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC1719a
    public final m c() {
        return this.f13281v;
    }

    @Override // j.AbstractC1719a
    public final MenuInflater d() {
        return new C1726h(this.f13277r.getContext());
    }

    @Override // j.AbstractC1719a
    public final CharSequence e() {
        return this.f13277r.getSubtitle();
    }

    @Override // j.AbstractC1719a
    public final CharSequence f() {
        return this.f13277r.getTitle();
    }

    @Override // k.k
    public final boolean g(m mVar, MenuItem menuItem) {
        return ((C0326Qb) this.f13278s.f9319p).s(this, menuItem);
    }

    @Override // j.AbstractC1719a
    public final void h() {
        this.f13278s.u(this, this.f13281v);
    }

    @Override // k.k
    public final void i(m mVar) {
        h();
        C1773j c1773j = this.f13277r.f2498r;
        if (c1773j != null) {
            c1773j.n();
        }
    }

    @Override // j.AbstractC1719a
    public final boolean j() {
        return this.f13277r.f2493F;
    }

    @Override // j.AbstractC1719a
    public final void k(View view) {
        this.f13277r.setCustomView(view);
        this.f13279t = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC1719a
    public final void l(int i4) {
        m(this.f13276q.getString(i4));
    }

    @Override // j.AbstractC1719a
    public final void m(CharSequence charSequence) {
        this.f13277r.setSubtitle(charSequence);
    }

    @Override // j.AbstractC1719a
    public final void n(int i4) {
        o(this.f13276q.getString(i4));
    }

    @Override // j.AbstractC1719a
    public final void o(CharSequence charSequence) {
        this.f13277r.setTitle(charSequence);
    }

    @Override // j.AbstractC1719a
    public final void p(boolean z4) {
        this.f13273p = z4;
        this.f13277r.setTitleOptional(z4);
    }
}
