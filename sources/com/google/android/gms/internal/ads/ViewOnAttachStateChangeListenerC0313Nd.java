package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0313Nd implements View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0301Lb f6336o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0396ae f6337p;

    public ViewOnAttachStateChangeListenerC0313Nd(C0396ae c0396ae, InterfaceC0301Lb interfaceC0301Lb) {
        this.f6337p = c0396ae;
        this.f6336o = interfaceC0301Lb;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6337p.y(view, this.f6336o, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
