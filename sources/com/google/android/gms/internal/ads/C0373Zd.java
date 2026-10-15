package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import b0.RunnableC0203p;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373Zd {

    /* renamed from: a, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0358Wd f8017a;

    /* renamed from: b, reason: collision with root package name */
    public final M3 f8018b;

    public C0373Zd(ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd, M3 m32) {
        this.f8018b = m32;
        this.f8017a = viewTreeObserverOnGlobalLayoutListenerC0358Wd;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            Q1.I.w("Click string is empty, not proceeding.");
            return "";
        }
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f8017a;
        I3 i32 = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7499p;
        if (i32 == null) {
            Q1.I.w("Signal utils is empty, ignoring.");
            return "";
        }
        G3 g32 = i32.f5531b;
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.getContext() != null) {
            return g32.h(viewTreeObserverOnGlobalLayoutListenerC0358Wd.getContext(), str, viewTreeObserverOnGlobalLayoutListenerC0358Wd, viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7498o.f8621a);
        }
        Q1.I.w("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = this.f8017a;
        I3 i32 = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7499p;
        if (i32 == null) {
            Q1.I.w("Signal utils is empty, ignoring.");
            return "";
        }
        G3 g32 = i32.f5531b;
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.getContext() != null) {
            return g32.d(viewTreeObserverOnGlobalLayoutListenerC0358Wd.getContext(), viewTreeObserverOnGlobalLayoutListenerC0358Wd, viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7498o.f8621a);
        }
        Q1.I.w("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            Y9.s("URL is empty, ignoring message");
        } else {
            Q1.N.f1668k.post(new RunnableC0203p(16, this, str));
        }
    }
}
