package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1363x3 extends AbstractC1230u {

    /* renamed from: b, reason: collision with root package name */
    public final String f11233b;
    public final long c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11234e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11235f;

    public C1363x3(String str) {
        this.f11233b = "E";
        this.c = -1L;
        this.d = "E";
        this.f11234e = "E";
        this.f11235f = "E";
        HashMap i4 = AbstractC1230u.i(str);
        if (i4 != null) {
            this.f11233b = i4.get(0) == null ? "E" : (String) i4.get(0);
            this.c = i4.get(1) != null ? ((Long) i4.get(1)).longValue() : -1L;
            this.d = i4.get(2) == null ? "E" : (String) i4.get(2);
            this.f11234e = i4.get(3) == null ? "E" : (String) i4.get(3);
            this.f11235f = i4.get(4) != null ? (String) i4.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1230u
    public final HashMap z() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f11233b);
        hashMap.put(4, this.f11235f);
        hashMap.put(3, this.f11234e);
        hashMap.put(2, this.d);
        hashMap.put(1, Long.valueOf(this.c));
        return hashMap;
    }
}
