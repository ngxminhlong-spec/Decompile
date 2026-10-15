package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class BB extends AbstractC1371xB {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4037b = 0;

    static {
        AB.a(Collections.EMPTY_MAP);
    }

    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map c() {
        Map map = this.f11243a;
        LinkedHashMap l4 = AbstractC0587ez.l(map.size());
        for (Map.Entry entry : map.entrySet()) {
            l4.put(entry.getKey(), ((FB) entry.getValue()).c());
        }
        return Collections.unmodifiableMap(l4);
    }
}
