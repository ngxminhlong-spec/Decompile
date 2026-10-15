package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996og implements Ah, Yg {

    /* renamed from: o, reason: collision with root package name */
    public final C1798a f9842o;

    /* renamed from: p, reason: collision with root package name */
    public final C1082qg f9843p;

    /* renamed from: q, reason: collision with root package name */
    public final Jp f9844q;

    /* renamed from: r, reason: collision with root package name */
    public final String f9845r;

    public C0996og(C1798a c1798a, C1082qg c1082qg, Jp jp, String str) {
        this.f9842o = c1798a;
        this.f9843p = c1082qg;
        this.f9844q = jp;
        this.f9845r = str;
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        String str = this.f9844q.f5911f;
        this.f9842o.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1082qg c1082qg = this.f9843p;
        ConcurrentHashMap concurrentHashMap = c1082qg.c;
        String str2 = this.f9845r;
        Long l4 = (Long) concurrentHashMap.get(str2);
        if (l4 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        c1082qg.d.put(str, Long.valueOf(elapsedRealtime - l4.longValue()));
    }

    @Override // com.google.android.gms.internal.ads.Ah
    public final void b() {
        this.f9842o.getClass();
        this.f9843p.c.put(this.f9845r, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
