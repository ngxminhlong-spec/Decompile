package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572ek {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8633a;

    /* renamed from: b, reason: collision with root package name */
    public final C1163sc f8634b;

    public C0572ek(C0828kk c0828kk, C1163sc c1163sc, Jp jp, String str, String str2) {
        O1.U0 u02 = jp.d;
        c0828kk.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c0828kk.f9308a);
        this.f8633a = concurrentHashMap;
        this.f8634b = c1163sc;
        C0937n6 c0937n6 = AbstractC1066q6.i6;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            int K2 = AbstractC1895f.K(jp);
            int i4 = K2 - 1;
            if (i4 == 0) {
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (i4 == 1) {
                concurrentHashMap.put("se", "query_g");
            } else if (i4 == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (i4 != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            if (((Boolean) rVar.c.a(AbstractC1066q6.H6)).booleanValue()) {
                concurrentHashMap.put("ad_format", str2);
            }
            if (K2 == 2) {
                concurrentHashMap.put("rid", str);
            }
            String str3 = u02.f1296D;
            if (!TextUtils.isEmpty(str3)) {
                concurrentHashMap.put("ragent", str3);
            }
            String D4 = AbstractC1895f.D(AbstractC1895f.G(u02));
            if (TextUtils.isEmpty(D4)) {
                return;
            }
            concurrentHashMap.put("rtype", D4);
        }
    }
}
