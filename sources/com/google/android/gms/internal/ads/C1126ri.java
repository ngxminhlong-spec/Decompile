package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126ri implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10495a;

    /* renamed from: b, reason: collision with root package name */
    public final C1510e1 f10496b;

    public /* synthetic */ C1126ri(C1510e1 c1510e1, int i4) {
        this.f10495a = i4;
        this.f10496b = c1510e1;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f10495a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f10496b.f11914p;
                AbstractC0587ez.n(jSONObject);
                return jSONObject;
            default:
                Aj aj = (Aj) this.f10496b.f11915q;
                AbstractC0587ez.n(aj);
                return aj;
        }
    }
}
