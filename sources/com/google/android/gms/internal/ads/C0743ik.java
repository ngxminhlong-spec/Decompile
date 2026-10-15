package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743ik implements InterfaceC1049pq {

    /* renamed from: p, reason: collision with root package name */
    public final C0572ek f9052p;

    /* renamed from: q, reason: collision with root package name */
    public final C1798a f9053q;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f9051o = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f9054r = new HashMap();

    public C0743ik(C0572ek c0572ek, Set set, C1798a c1798a) {
        this.f9052p = c0572ek;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0701hk c0701hk = (C0701hk) it.next();
            HashMap hashMap = this.f9054r;
            c0701hk.getClass();
            hashMap.put(EnumC0877lq.f9486s, c0701hk);
        }
        this.f9053q = c1798a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void O(String str) {
    }

    public final void a(EnumC0877lq enumC0877lq, boolean z4) {
        HashMap hashMap = this.f9054r;
        EnumC0877lq enumC0877lq2 = ((C0701hk) hashMap.get(enumC0877lq)).f8978b;
        HashMap hashMap2 = this.f9051o;
        if (hashMap2.containsKey(enumC0877lq2)) {
            String str = true != z4 ? "f." : "s.";
            this.f9053q.getClass();
            this.f9052p.f8633a.put("label.".concat(((C0701hk) hashMap.get(enumC0877lq)).f8977a), str.concat(String.valueOf(Long.toString(SystemClock.elapsedRealtime() - ((Long) hashMap2.get(enumC0877lq2)).longValue()))));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void r(EnumC0877lq enumC0877lq, String str, Throwable th) {
        HashMap hashMap = this.f9051o;
        if (hashMap.containsKey(enumC0877lq)) {
            this.f9053q.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(enumC0877lq)).longValue();
            String valueOf = String.valueOf(str);
            this.f9052p.f8633a.put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f9054r.containsKey(enumC0877lq)) {
            a(enumC0877lq, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void u(EnumC0877lq enumC0877lq, String str) {
        this.f9053q.getClass();
        this.f9051o.put(enumC0877lq, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void v(EnumC0877lq enumC0877lq, String str) {
        HashMap hashMap = this.f9051o;
        if (hashMap.containsKey(enumC0877lq)) {
            this.f9053q.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(enumC0877lq)).longValue();
            String valueOf = String.valueOf(str);
            this.f9052p.f8633a.put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f9054r.containsKey(enumC0877lq)) {
            a(enumC0877lq, true);
        }
    }
}
