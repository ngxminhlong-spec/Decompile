package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1036pd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9981o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9982p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f9983q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f9984r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f9985s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f9986t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f9987u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f9988v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9989w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9990x;
    public final /* synthetic */ AbstractC1250ud y;

    public RunnableC1036pd(AbstractC1250ud abstractC1250ud, String str, String str2, long j4, long j5, long j6, long j7, long j8, boolean z4, int i4, int i5) {
        this.y = abstractC1250ud;
        this.f9981o = str;
        this.f9982p = str2;
        this.f9983q = j4;
        this.f9984r = j5;
        this.f9985s = j6;
        this.f9986t = j7;
        this.f9987u = j8;
        this.f9988v = z4;
        this.f9989w = i4;
        this.f9990x = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f9981o);
        hashMap.put("cachedSrc", this.f9982p);
        hashMap.put("bufferedDuration", Long.toString(this.f9983q));
        hashMap.put("totalDuration", Long.toString(this.f9984r));
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f9985s));
            hashMap.put("qoeCachedBytes", Long.toString(this.f9986t));
            hashMap.put("totalBytes", Long.toString(this.f9987u));
            N1.n.f1204A.f1212j.getClass();
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.f9988v ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f9989w));
        hashMap.put("playerPreparedCount", Integer.toString(this.f9990x));
        AbstractC1250ud.j(this.y, hashMap);
    }
}
