package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424yf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11425a;

    /* renamed from: b, reason: collision with root package name */
    public final C0654gg f11426b;

    public /* synthetic */ C1424yf(C0654gg c0654gg, int i4) {
        this.f11425a = i4;
        this.f11426b = c0654gg;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f11425a) {
            case 0:
                try {
                    return new JSONObject(this.f11426b.a().f11542z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new Ei(this.f11426b.a());
        }
    }
}
