package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665gr extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final String f8873a = "OMID NativeBridge WebViewClient";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0708hr f8874b;

    public C0665gr(C0708hr c0708hr) {
        this.f8874b = c0708hr;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.pr, java.lang.ref.WeakReference] */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String concat = "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString()));
        String str = this.f8873a;
        Log.w(str, concat);
        C0708hr c0708hr = this.f8874b;
        if (c0708hr.a() != webView) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        Log.w(str, "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
        c0708hr.f8649a = new WeakReference(null);
        webView.destroy();
        return true;
    }
}
