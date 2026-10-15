package l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC1720b;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B0 implements k.z {

    /* renamed from: o, reason: collision with root package name */
    public k.m f13580o;

    /* renamed from: p, reason: collision with root package name */
    public k.p f13581p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Toolbar f13582q;

    public B0(Toolbar toolbar) {
        this.f13582q = toolbar;
    }

    @Override // k.z
    public final void a(k.m mVar, boolean z4) {
    }

    @Override // k.z
    public final boolean c(k.p pVar) {
        Toolbar toolbar = this.f13582q;
        toolbar.c();
        ViewParent parent = toolbar.f2631v.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2631v);
            }
            toolbar.addView(toolbar.f2631v);
        }
        View actionView = pVar.getActionView();
        toolbar.f2632w = actionView;
        this.f13581p = pVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2632w);
            }
            C0 h4 = Toolbar.h();
            h4.f13587a = (toolbar.f2600B & 112) | 8388611;
            h4.f13588b = 2;
            toolbar.f2632w.setLayoutParams(h4);
            toolbar.addView(toolbar.f2632w);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C0) childAt.getLayoutParams()).f13588b != 2 && childAt != toolbar.f2624o) {
                toolbar.removeViewAt(childCount);
                toolbar.f2616S.add(childAt);
            }
        }
        toolbar.requestLayout();
        pVar.f13455C = true;
        pVar.f13467n.p(false);
        KeyEvent.Callback callback = toolbar.f2632w;
        if (callback instanceof InterfaceC1720b) {
            ((InterfaceC1720b) callback).onActionViewExpanded();
        }
        return true;
    }

    @Override // k.z
    public final boolean d(k.F f4) {
        return false;
    }

    @Override // k.z
    public final boolean f(k.p pVar) {
        Toolbar toolbar = this.f13582q;
        KeyEvent.Callback callback = toolbar.f2632w;
        if (callback instanceof InterfaceC1720b) {
            ((InterfaceC1720b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2632w);
        toolbar.removeView(toolbar.f2631v);
        toolbar.f2632w = null;
        ArrayList arrayList = toolbar.f2616S;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13581p = null;
        toolbar.requestLayout();
        pVar.f13455C = false;
        pVar.f13467n.p(false);
        return true;
    }

    @Override // k.z
    public final void g(Parcelable parcelable) {
    }

    @Override // k.z
    public final int getId() {
        return 0;
    }

    @Override // k.z
    public final void h() {
        if (this.f13581p != null) {
            k.m mVar = this.f13580o;
            if (mVar != null) {
                int size = mVar.f13429f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f13580o.getItem(i4) == this.f13581p) {
                        return;
                    }
                }
            }
            f(this.f13581p);
        }
    }

    @Override // k.z
    public final void k(Context context, k.m mVar) {
        k.p pVar;
        k.m mVar2 = this.f13580o;
        if (mVar2 != null && (pVar = this.f13581p) != null) {
            mVar2.d(pVar);
        }
        this.f13580o = mVar;
    }

    @Override // k.z
    public final boolean l() {
        return false;
    }

    @Override // k.z
    public final Parcelable m() {
        return null;
    }
}
