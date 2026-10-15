package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545e implements DisplayManager.DisplayListener, InterfaceC0503d {

    /* renamed from: o, reason: collision with root package name */
    public final DisplayManager f8531o;

    /* renamed from: p, reason: collision with root package name */
    public M3 f8532p;

    public C0545e(DisplayManager displayManager) {
        this.f8531o = displayManager;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503d
    public final void a(M3 m32) {
        this.f8532p = m32;
        Handler y = AbstractC0751is.y();
        DisplayManager displayManager = this.f8531o;
        displayManager.registerDisplayListener(this, y);
        C0631g.a((C0631g) m32.f6208p, displayManager.getDisplay(0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503d
    public final void b() {
        this.f8531o.unregisterDisplayListener(this);
        this.f8532p = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i4) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        M3 m32 = this.f8532p;
        if (m32 == null || i4 != 0) {
            return;
        }
        C0631g.a((C0631g) m32.f6208p, this.f8531o.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i4) {
    }
}
