package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jk {

    /* renamed from: a, reason: collision with root package name */
    public final String f5891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5892b;
    public final String c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5893e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5894f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5895g;

    public Jk(String str, String str2, String str3, int i4, String str4, int i5, boolean z4) {
        this.f5891a = str;
        this.f5892b = str2;
        this.c = str3;
        this.d = i4;
        this.f5893e = str4;
        this.f5894f = i5;
        this.f5895g = z4;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f5891a);
        jSONObject.put("version", this.c);
        C0937n6 c0937n6 = AbstractC1066q6.l8;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f5892b);
        }
        jSONObject.put("status", this.d);
        jSONObject.put("description", this.f5893e);
        jSONObject.put("initializationLatencyMillis", this.f5894f);
        if (((Boolean) rVar.c.a(AbstractC1066q6.m8)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f5895g);
        }
        return jSONObject;
    }
}
