package com.google.android.gms.internal.ads;

import Q1.C0111j;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pj extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public final C0111j f6595o;

    public Pj(Context context, View view, C0111j c0111j) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f6595o = c0111j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6595o.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            KeyEvent.Callback childAt = getChildAt(i4);
            if (childAt != null && (childAt instanceof InterfaceC0308Md)) {
                arrayList.add((InterfaceC0308Md) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((InterfaceC0308Md) arrayList.get(i5)).destroy();
        }
    }
}
