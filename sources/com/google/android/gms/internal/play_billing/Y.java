package com.google.android.gms.internal.play_billing;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.play_billing.X] */
    public static final X a(Object obj, Object obj2) {
        X x4 = (X) obj;
        X x5 = (X) obj2;
        if (!x5.isEmpty()) {
            if (!x4.f12174o) {
                if (x4.isEmpty()) {
                    x4 = new X();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(x4);
                    linkedHashMap.f12174o = true;
                    x4 = linkedHashMap;
                }
            }
            x4.b();
            if (!x5.isEmpty()) {
                x4.putAll(x5);
            }
        }
        return x4;
    }
}
