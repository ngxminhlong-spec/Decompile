package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC1742C;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13282a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719a f13283b;

    public C1723e(Context context, AbstractC1719a abstractC1719a) {
        this.f13282a = context;
        this.f13283b = abstractC1719a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f13283b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f13283b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1742C(this.f13282a, this.f13283b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f13283b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f13283b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f13283b.f13272o;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f13283b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f13283b.f13273p;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f13283b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f13283b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f13283b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i4) {
        this.f13283b.l(i4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f13283b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f13283b.f13272o = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i4) {
        this.f13283b.n(i4);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f13283b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f13283b.p(z4);
    }
}
