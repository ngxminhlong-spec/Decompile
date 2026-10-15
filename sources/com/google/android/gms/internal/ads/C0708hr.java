package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708hr extends AbstractC0579er {
    public WebView d;

    /* renamed from: e, reason: collision with root package name */
    public Long f9000e = null;

    /* renamed from: f, reason: collision with root package name */
    public final Map f9001f;

    public C0708hr(Map map) {
        this.f9001f = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579er
    public final void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0744il(this), Math.max(4000 - (this.f9000e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f9000e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579er
    public final void d(Rq rq, l.J0 j02) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) j02.f13640r);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            unmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(rq, j02, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.pr, java.lang.ref.WeakReference] */
    @Override // com.google.android.gms.internal.ads.AbstractC0579er
    public final void f() {
        WebView webView = new WebView(C0536dr.f8514q.f8516p);
        this.d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.d.getSettings().setAllowContentAccess(false);
        this.d.getSettings().setAllowFileAccess(false);
        this.d.setWebViewClient(new C0665gr(this));
        this.f8649a = new WeakReference(this.d);
        Zf.c0(this.d, null);
        Map map = this.f9001f;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f9000e = Long.valueOf(System.nanoTime());
    }
}
