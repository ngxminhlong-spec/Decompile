package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ln implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6160b;

    public /* synthetic */ Ln(int i4, boolean z4) {
        this.f6159a = i4;
        this.f6160b = z4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f6159a) {
            case 0:
                ((Bundle) obj).putString("adid_p", true != this.f6160b ? "0" : "1");
                return;
            default:
                ((Bundle) obj).putBoolean("is_gbid", this.f6160b);
                return;
        }
    }
}
