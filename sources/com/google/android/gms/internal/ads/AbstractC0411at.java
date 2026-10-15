package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.at, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0411at {

    /* renamed from: o, reason: collision with root package name */
    public transient Qs f8172o;

    /* renamed from: p, reason: collision with root package name */
    public transient Zs f8173p;

    /* renamed from: q, reason: collision with root package name */
    public transient Ps f8174q;

    public final Map a() {
        Ps ps = this.f8174q;
        if (ps != null) {
            return ps;
        }
        Ct ct = (Ct) this;
        Map map = ct.f4555r;
        Ps rs = map instanceof NavigableMap ? new Rs(ct, (NavigableMap) map) : map instanceof SortedMap ? new Us(ct, (SortedMap) map) : new Ps(ct, map);
        this.f8174q = rs;
        return rs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0411at) {
            return a().equals(((AbstractC0411at) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((Ps) a()).f6606q.hashCode();
    }

    public final String toString() {
        return ((Ps) a()).f6606q.toString();
    }
}
