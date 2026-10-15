package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.InterfaceC1741B;
import k.l;
import k.m;
import k.p;
import q2.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, InterfaceC1741B, AdapterView.OnItemClickListener {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f2461p = {R.attr.background, R.attr.divider};

    /* renamed from: o, reason: collision with root package name */
    public m f2462o;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        e w2 = e.w(context, attributeSet, f2461p, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) w2.f14710q;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(w2.p(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(w2.p(1));
        }
        w2.y();
    }

    @Override // k.l
    public final boolean a(p pVar) {
        return this.f2462o.q(pVar, null, 0);
    }

    @Override // k.InterfaceC1741B
    public final void c(m mVar) {
        this.f2462o = mVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        a((p) getAdapter().getItem(i4));
    }
}
