package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lo implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final String f6161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6162b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6163e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6164f;

    public Lo(String str, int i4, int i5, int i6, boolean z4, int i7) {
        this.f6161a = str;
        this.f6162b = i4;
        this.c = i5;
        this.d = i6;
        this.f6163e = z4;
        this.f6164f = i7;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Zf.V(bundle, "carrier", this.f6161a, !TextUtils.isEmpty(r0));
        int i4 = this.f6162b;
        if (i4 != -2) {
            bundle.putInt("cnt", i4);
        }
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle d = Zf.d(bundle, "device");
        bundle.putBundle("device", d);
        Bundle d4 = Zf.d(d, "network");
        d.putBundle("network", d4);
        d4.putInt("active_network_state", this.f6164f);
        d4.putBoolean("active_network_metered", this.f6163e);
    }
}
