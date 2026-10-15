package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1493b {

    /* renamed from: a, reason: collision with root package name */
    public String f11880a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11881b;
    public final HashMap c;

    public C1493b(String str, long j4, HashMap hashMap) {
        this.f11880a = str;
        this.f11881b = j4;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1493b clone() {
        return new C1493b(this.f11880a, this.f11881b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1493b)) {
            return false;
        }
        C1493b c1493b = (C1493b) obj;
        if (this.f11881b == c1493b.f11881b && this.f11880a.equals(c1493b.f11880a)) {
            return this.c.equals(c1493b.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11880a.hashCode() * 31;
        long j4 = this.f11881b;
        return this.c.hashCode() + ((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Event{name='" + this.f11880a + "', timestamp=" + this.f11881b + ", params=" + this.c.toString() + "}";
    }
}
