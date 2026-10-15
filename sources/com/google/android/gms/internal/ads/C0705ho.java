package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705ho implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final int f8986a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8987b;
    public final boolean c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8988e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8989f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8990g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8991h;

    /* renamed from: i, reason: collision with root package name */
    public final float f8992i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8993j;

    public C0705ho(int i4, boolean z4, boolean z5, int i5, int i6, int i7, int i8, int i9, float f4, boolean z6) {
        this.f8986a = i4;
        this.f8987b = z4;
        this.c = z5;
        this.d = i5;
        this.f8988e = i6;
        this.f8989f = i7;
        this.f8990g = i8;
        this.f8991h = i9;
        this.f8992i = f4;
        this.f8993j = z6;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f8986a);
        bundle.putBoolean("ma", this.f8987b);
        bundle.putBoolean("sp", this.c);
        bundle.putInt("muv", this.d);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.m9)).booleanValue()) {
            bundle.putInt("muv_min", this.f8988e);
            bundle.putInt("muv_max", this.f8989f);
        }
        bundle.putInt("rm", this.f8990g);
        bundle.putInt("riv", this.f8991h);
        bundle.putFloat("android_app_volume", this.f8992i);
        bundle.putBoolean("android_app_muted", this.f8993j);
    }
}
