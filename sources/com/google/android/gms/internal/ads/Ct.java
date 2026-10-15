package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ct extends AbstractC0411at implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    public final transient Map f4555r;

    /* renamed from: s, reason: collision with root package name */
    public transient int f4556s;

    /* renamed from: t, reason: collision with root package name */
    public final transient Bt f4557t;

    public Ct(Map map, Bt bt) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f4555r = map;
        this.f4557t = bt;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    public final /* bridge */ Collection b() {
        return this.f4557t.b();
    }

    public final void c() {
        Map map = this.f4555r;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f4556s = 0;
    }
}
