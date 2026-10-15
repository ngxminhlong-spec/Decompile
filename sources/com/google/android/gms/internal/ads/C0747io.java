package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747io implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final double f9067a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9068b;

    public C0747io(double d, boolean z4) {
        this.f9067a = d;
        this.f9068b = z4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle d = Zf.d(bundle, "device");
        bundle.putBundle("device", d);
        Bundle d4 = Zf.d(d, "battery");
        d.putBundle("battery", d4);
        d4.putBoolean("is_charging", this.f9068b);
        d4.putDouble("battery_level", this.f9067a);
    }
}
