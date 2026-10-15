package com.google.android.material.datepicker;

import H.A;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u.c(null);
        if (j.M(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        A.h(this, new J.f(3));
    }

    public final m a() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((m) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m mVar = (m) super.getAdapter();
        mVar.getClass();
        mVar.getItem(mVar.f12409o.c());
        mVar.getItem(mVar.b());
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z4, int i4, Rect rect) {
        if (!z4) {
            super.onFocusChanged(false, i4, rect);
            return;
        }
        if (i4 == 33) {
            setSelection(((m) super.getAdapter()).b());
        } else if (i4 == 130) {
            setSelection(((m) super.getAdapter()).f12409o.c());
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((m) super.getAdapter()).f12409o.c()) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(((m) super.getAdapter()).f12409o.c());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i4) {
        if (i4 < ((m) super.getAdapter()).f12409o.c()) {
            super.setSelection(((m) super.getAdapter()).f12409o.c());
        } else {
            super.setSelection(i4);
        }
    }
}
