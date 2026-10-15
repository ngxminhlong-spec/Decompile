package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961no implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final String f9778a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9779b;

    public C0961no(String str, boolean z4) {
        this.f9778a = str;
        this.f9779b = z4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f9778a);
        if (this.f9779b) {
            bundle.putString("de", "1");
        }
    }
}
