package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1164sd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f10608o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f10609p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f10610q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1250ud f10611r;

    public RunnableC1164sd(AbstractC1250ud abstractC1250ud, String str, String str2, long j4) {
        this.f10611r = abstractC1250ud;
        this.f10608o = str;
        this.f10609p = str2;
        this.f10610q = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f10608o);
        hashMap.put("cachedSrc", this.f10609p);
        hashMap.put("totalDuration", Long.toString(this.f10610q));
        AbstractC1250ud.j(this.f10611r, hashMap);
    }
}
