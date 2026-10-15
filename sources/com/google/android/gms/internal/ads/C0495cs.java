package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495cs {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f8421a;

    /* renamed from: b, reason: collision with root package name */
    public String f8422b;
    public int c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public int f8423e;

    /* renamed from: f, reason: collision with root package name */
    public String f8424f;

    /* renamed from: g, reason: collision with root package name */
    public byte f8425g;

    public final C0537ds a() {
        IBinder iBinder;
        if (this.f8425g == 31 && (iBinder = this.f8421a) != null) {
            return new C0537ds(iBinder, this.f8422b, this.c, this.d, this.f8423e, this.f8424f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f8421a == null) {
            sb.append(" windowToken");
        }
        if ((this.f8425g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.f8425g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f8425g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f8425g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f8425g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
