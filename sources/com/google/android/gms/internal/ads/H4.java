package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class H4 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC0801k f5409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E4 f5410b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ H4(RunnableC0801k runnableC0801k, E4 e4, WebView webView, boolean z4) {
        this.f5409a = runnableC0801k;
        this.f5410b = e4;
        this.c = webView;
        this.d = z4;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        I4 i4 = (I4) this.f5409a.f9240r;
        E4 e4 = this.f5410b;
        WebView webView = this.c;
        String str = (String) obj;
        boolean z4 = this.d;
        synchronized (e4.f4839g) {
            e4.f4845m--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (i4.f5533B || TextUtils.isEmpty(webView.getTitle())) {
                    e4.b(optString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    e4.b(webView.getTitle() + "\n" + optString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (e4.e()) {
                i4.f5539r.n(e4);
            }
        } catch (JSONException unused) {
            Y9.m("Json string may be malformed.");
        } catch (Throwable th) {
            Y9.o("Failed to get webview content.", th);
            N1.n.f1204A.f1209g.h("ContentFetchTask.processWebViewContent", th);
        }
    }
}
