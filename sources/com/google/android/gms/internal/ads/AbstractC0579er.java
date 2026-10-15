package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Date;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0579er {

    /* renamed from: b, reason: collision with root package name */
    public long f8650b = System.nanoTime();
    public int c = 1;

    /* renamed from: a, reason: collision with root package name */
    public C1050pr f8649a = new WeakReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f8649a.get();
    }

    public void b() {
        this.f8649a.clear();
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC0750ir.c(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        Zf.B(a(), "setLastActivity", jSONObject);
    }

    public void d(Rq rq, l.J0 j02) {
        e(rq, j02, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.ads.Rq r11, l.J0 r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0579er.e(com.google.android.gms.internal.ads.Rq, l.J0, org.json.JSONObject):void");
    }

    public void f() {
    }
}
