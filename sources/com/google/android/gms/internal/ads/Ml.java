package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ml implements InterfaceC1049pq {

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f6267o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f6268p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final C1220tq f6269q;

    public Ml(Set set, C1220tq c1220tq) {
        this.f6269q = c1220tq;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Ll ll = (Ll) it.next();
            HashMap hashMap = this.f6267o;
            ll.getClass();
            hashMap.put(EnumC0877lq.f9483p, "ttc");
            this.f6268p.put(EnumC0877lq.f9486s, "ttc");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void O(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void r(EnumC0877lq enumC0877lq, String str, Throwable th) {
        String concat = "task.".concat(String.valueOf(str));
        C1220tq c1220tq = this.f6269q;
        c1220tq.d(concat, "f.");
        HashMap hashMap = this.f6268p;
        if (hashMap.containsKey(enumC0877lq)) {
            c1220tq.d("label.".concat(String.valueOf((String) hashMap.get(enumC0877lq))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void u(EnumC0877lq enumC0877lq, String str) {
        String concat = "task.".concat(String.valueOf(str));
        C1220tq c1220tq = this.f6269q;
        c1220tq.c(concat);
        HashMap hashMap = this.f6267o;
        if (hashMap.containsKey(enumC0877lq)) {
            c1220tq.c("label.".concat(String.valueOf((String) hashMap.get(enumC0877lq))));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void v(EnumC0877lq enumC0877lq, String str) {
        String concat = "task.".concat(String.valueOf(str));
        C1220tq c1220tq = this.f6269q;
        c1220tq.d(concat, "s.");
        HashMap hashMap = this.f6268p;
        if (hashMap.containsKey(enumC0877lq)) {
            c1220tq.d("label.".concat(String.valueOf((String) hashMap.get(enumC0877lq))), "s.");
        }
    }
}
