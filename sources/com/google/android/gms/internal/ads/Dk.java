package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Dk implements Ih {

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f4778o = new Bundle();

    @Override // com.google.android.gms.internal.ads.Ih
    public final synchronized void F(String str) {
        this.f4778o.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final void o(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final synchronized void v(String str, String str2) {
        this.f4778o.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final synchronized void y(String str) {
        this.f4778o.putInt(str, 1);
    }
}
