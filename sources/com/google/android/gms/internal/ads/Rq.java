package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rq extends Pq {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f6856h = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final l.J0 f6857a;
    public AbstractC0579er d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6858b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6859e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6860f = false;

    /* renamed from: g, reason: collision with root package name */
    public final String f6861g = UUID.randomUUID().toString();
    public C1050pr c = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.pr, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.pr, java.lang.ref.WeakReference] */
    public Rq(u0.g gVar, l.J0 j02) {
        this.f6857a = j02;
        Qq qq = (Qq) j02.f13643u;
        if (qq == Qq.f6702p || qq == Qq.f6703q) {
            WebView webView = (WebView) j02.f13638p;
            AbstractC0579er abstractC0579er = new AbstractC0579er();
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            abstractC0579er.f8649a = new WeakReference(webView);
            this.d = abstractC0579er;
        } else {
            this.d = new C0708hr(Collections.unmodifiableMap((HashMap) j02.f13640r));
        }
        this.d.f();
        Zq.c.f8055a.add(this);
        WebView a4 = this.d.a();
        JSONObject jSONObject = new JSONObject();
        AbstractC0750ir.c(jSONObject, "impressionOwner", (Vq) gVar.f14983p);
        AbstractC0750ir.c(jSONObject, "mediaEventsOwner", (Vq) gVar.f14984q);
        AbstractC0750ir.c(jSONObject, "creativeType", (Sq) gVar.f14985r);
        AbstractC0750ir.c(jSONObject, "impressionType", (Uq) gVar.f14986s);
        AbstractC0750ir.c(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        Zf.B(a4, "init", jSONObject);
    }
}
