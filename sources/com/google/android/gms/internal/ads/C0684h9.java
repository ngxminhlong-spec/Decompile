package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684h9 implements InterfaceC0939n8 {

    /* renamed from: a, reason: collision with root package name */
    public final X8 f8930a;

    /* renamed from: b, reason: collision with root package name */
    public final C0272Fc f8931b;
    public final /* synthetic */ C0727i9 c;

    public C0684h9(C0727i9 c0727i9, X8 x8, C0272Fc c0272Fc) {
        this.c = c0727i9;
        this.f8930a = x8;
        this.f8931b = c0272Fc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0939n8
    public final void o(String str) {
        X8 x8 = this.f8930a;
        C0272Fc c0272Fc = this.f8931b;
        try {
            if (str == null) {
                c0272Fc.c(new Exception());
            } else {
                c0272Fc.c(new Exception(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            x8.n();
            throw th;
        }
        x8.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0939n8
    public final void p(JSONObject jSONObject) {
        X8 x8 = this.f8930a;
        C0272Fc c0272Fc = this.f8931b;
        try {
            try {
                c0272Fc.b(((InterfaceC0513d9) this.c.c).f(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e4) {
                c0272Fc.c(e4);
            }
        } finally {
            x8.n();
        }
    }
}
