package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227tx {

    /* renamed from: b, reason: collision with root package name */
    public static final C1227tx f10760b = new C1227tx(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f10761a;

    public /* synthetic */ C1227tx(Map map) {
        this.f10761a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1227tx) {
            return this.f10761a.equals(((C1227tx) obj).f10761a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10761a.hashCode();
    }

    public final String toString() {
        return this.f10761a.toString();
    }
}
