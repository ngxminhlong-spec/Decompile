package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896m8 implements InterfaceC0939n8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9567a;

    /* renamed from: b, reason: collision with root package name */
    public final C0272Fc f9568b;

    public /* synthetic */ C0896m8(C0272Fc c0272Fc, int i4) {
        this.f9567a = i4;
        this.f9568b = c0272Fc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0939n8
    public final void o(String str) {
        switch (this.f9567a) {
            case 0:
                this.f9568b.c(new Exception(str));
                return;
            default:
                C0272Fc c0272Fc = this.f9568b;
                try {
                    if (str == null) {
                        c0272Fc.c(new Exception());
                    } else {
                        c0272Fc.c(new Exception(str));
                    }
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0939n8
    public final void p(JSONObject jSONObject) {
        switch (this.f9567a) {
            case 0:
                this.f9568b.b(jSONObject);
                return;
            default:
                C0272Fc c0272Fc = this.f9568b;
                try {
                    c0272Fc.b(jSONObject);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e4) {
                    c0272Fc.c(e4);
                    return;
                }
        }
    }
}
