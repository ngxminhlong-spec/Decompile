package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397af implements InterfaceC0349Ue {
    @Override // com.google.android.gms.internal.ads.InterfaceC0349Ue
    public final void a(HashMap hashMap) {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.O8)).booleanValue() || hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        N1.n.f1204A.f1209g.c().i(Boolean.parseBoolean(str));
    }
}
