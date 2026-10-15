package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1079qd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f10361o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f10362p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f10363q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10365s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f10366t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f10367u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10368v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10369w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1379xd f10370x;

    public RunnableC1079qd(C1379xd c1379xd, String str, String str2, int i4, int i5, long j4, long j5, boolean z4, int i6, int i7) {
        this.f10370x = c1379xd;
        this.f10361o = str;
        this.f10362p = str2;
        this.f10363q = i4;
        this.f10364r = i5;
        this.f10365s = j4;
        this.f10366t = j5;
        this.f10367u = z4;
        this.f10368v = i6;
        this.f10369w = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f10361o);
        hashMap.put("cachedSrc", this.f10362p);
        hashMap.put("bytesLoaded", Integer.toString(this.f10363q));
        hashMap.put("totalBytes", Integer.toString(this.f10364r));
        hashMap.put("bufferedDuration", Long.toString(this.f10365s));
        hashMap.put("totalDuration", Long.toString(this.f10366t));
        hashMap.put("cacheReady", true != this.f10367u ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f10368v));
        hashMap.put("playerPreparedCount", Integer.toString(this.f10369w));
        AbstractC1250ud.j(this.f10370x, hashMap);
    }
}
