package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496b2 {
    public static final void a(Object obj, Object obj2) {
        C1491a2 c1491a2 = (C1491a2) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (c1491a2.isEmpty()) {
            return;
        }
        Iterator it = c1491a2.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.a2] */
    public static final C1491a2 b(Object obj, Object obj2) {
        C1491a2 c1491a2 = (C1491a2) obj;
        C1491a2 c1491a22 = (C1491a2) obj2;
        if (!c1491a22.isEmpty()) {
            if (!c1491a2.f11878o) {
                if (c1491a2.isEmpty()) {
                    c1491a2 = new C1491a2();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(c1491a2);
                    linkedHashMap.f11878o = true;
                    c1491a2 = linkedHashMap;
                }
            }
            c1491a2.a();
            if (!c1491a22.isEmpty()) {
                c1491a2.putAll(c1491a22);
            }
        }
        return c1491a2;
    }
}
