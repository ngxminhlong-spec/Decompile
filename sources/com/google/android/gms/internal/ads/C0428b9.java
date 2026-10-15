package com.google.android.gms.internal.ads;

import O1.C0081p;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428b9 implements J8, InterfaceC0385a9 {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0385a9 f8214o;

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f8215p = new HashSet();

    public C0428b9(M8 m8) {
        this.f8214o = m8;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final void b(String str, Map map) {
        try {
            c(str, C0081p.f1374f.f1375a.g((HashMap) map));
        } catch (JSONException unused) {
            Y9.s("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final /* synthetic */ void c(String str, JSONObject jSONObject) {
        AbstractC1230u.B(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0385a9
    public final void e(String str, InterfaceC0597f8 interfaceC0597f8) {
        this.f8214o.e(str, interfaceC0597f8);
        this.f8215p.remove(new AbstractMap.SimpleEntry(str, interfaceC0597f8));
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void l(String str, JSONObject jSONObject) {
        o(str + "(" + jSONObject.toString() + ");");
    }

    @Override // com.google.android.gms.internal.ads.J8, com.google.android.gms.internal.ads.N8
    public final void o(String str) {
        this.f8214o.o(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0385a9
    public final void r(String str, InterfaceC0597f8 interfaceC0597f8) {
        this.f8214o.r(str, interfaceC0597f8);
        this.f8215p.add(new AbstractMap.SimpleEntry(str, interfaceC0597f8));
    }
}
