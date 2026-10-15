package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0993od implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9834o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9835p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9836q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9837r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1293vd f9838s;

    public RunnableC0993od(C1293vd c1293vd, String str, String str2, int i4, int i5) {
        this.f9838s = c1293vd;
        this.f9834o = str;
        this.f9835p = str2;
        this.f9836q = i4;
        this.f9837r = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f9834o);
        hashMap.put("cachedSrc", this.f9835p);
        hashMap.put("bytesLoaded", Integer.toString(this.f9836q));
        hashMap.put("totalBytes", Integer.toString(this.f9837r));
        hashMap.put("cacheReady", "0");
        AbstractC1250ud.j(this.f9838s, hashMap);
    }
}
