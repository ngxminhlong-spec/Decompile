package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530dk implements InterfaceC0954nh, Yg, Lg {

    /* renamed from: o, reason: collision with root package name */
    public final C0572ek f8499o;

    /* renamed from: p, reason: collision with root package name */
    public final C0828kk f8500p;

    public C0530dk(C0572ek c0572ek, C0828kk c0828kk) {
        this.f8499o = c0572ek;
        this.f8500p = c0828kk;
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        C0572ek c0572ek = this.f8499o;
        c0572ek.f8633a.put("action", "ftl");
        ConcurrentHashMap concurrentHashMap = c0572ek.f8633a;
        concurrentHashMap.put("ftl", String.valueOf(c0101z0.f1405o));
        concurrentHashMap.put("ed", c0101z0.f1407q);
        this.f8500p.a(concurrentHashMap, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
        C0572ek c0572ek = this.f8499o;
        ConcurrentHashMap concurrentHashMap = c0572ek.f8633a;
        Op op = ep.f4943b;
        List list = (List) op.f6525p;
        if (!list.isEmpty()) {
            switch (((C1434yp) list.get(0)).f11502b) {
                case 1:
                    concurrentHashMap.put("ad_format", "banner");
                    break;
                case 2:
                    concurrentHashMap.put("ad_format", "interstitial");
                    break;
                case 3:
                    concurrentHashMap.put("ad_format", "native_express");
                    break;
                case 4:
                    concurrentHashMap.put("ad_format", "native_advanced");
                    break;
                case 5:
                    concurrentHashMap.put("ad_format", "rewarded");
                    break;
                case 6:
                    concurrentHashMap.put("ad_format", "app_open_ad");
                    concurrentHashMap.put("as", true != c0572ek.f8634b.f10607g ? "0" : "1");
                    break;
                default:
                    concurrentHashMap.put("ad_format", "unknown");
                    break;
            }
        }
        String str = ((Ap) op.f6526q).f3998b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c0572ek.f8633a.put("gqi", str);
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        C0572ek c0572ek = this.f8499o;
        c0572ek.f8633a.put("action", "loaded");
        this.f8500p.a(c0572ek.f8633a, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
        Bundle bundle = c0370Za.f7989o;
        ConcurrentHashMap concurrentHashMap = this.f8499o.f8633a;
        if (bundle.containsKey("cnt")) {
            concurrentHashMap.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            concurrentHashMap.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
