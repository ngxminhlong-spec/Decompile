package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768g0 extends V {

    /* renamed from: B, reason: collision with root package name */
    public final int f13756B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13757C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC1766f0 f13758D;

    /* renamed from: E, reason: collision with root package name */
    public k.p f13759E;

    public C1768g0(Context context, boolean z4) {
        super(context, z4);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f13756B = 21;
            this.f13757C = 22;
        } else {
            this.f13756B = 22;
            this.f13757C = 21;
        }
    }

    @Override // l.V, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.j jVar;
        int i4;
        int pointToPosition;
        int i5;
        if (this.f13758D != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i4 = headerViewListAdapter.getHeadersCount();
                jVar = (k.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (k.j) adapter;
                i4 = 0;
            }
            k.p item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= jVar.getCount()) ? null : jVar.getItem(i5);
            k.p pVar = this.f13759E;
            if (pVar != item) {
                k.m mVar = jVar.f13420o;
                if (pVar != null) {
                    this.f13758D.d(mVar, pVar);
                }
                this.f13759E = item;
                if (item != null) {
                    this.f13758D.a(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f13756B) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.f13757C) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        ((k.j) getAdapter()).f13420o.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1766f0 interfaceC1766f0) {
        this.f13758D = interfaceC1766f0;
    }

    @Override // l.V, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
