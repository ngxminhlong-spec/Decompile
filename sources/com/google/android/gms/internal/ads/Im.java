package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Im implements InterfaceC0830km {

    /* renamed from: a, reason: collision with root package name */
    public final Tj f5719a;

    public Im(Tj tj) {
        this.f5719a = tj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.u9, com.google.android.gms.internal.ads.Wg] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0830km
    public final C0873lm a(String str, JSONObject jSONObject) {
        return new C0873lm(this.f5719a.b(str, jSONObject), new AbstractBinderC1240u9(), str);
    }
}
