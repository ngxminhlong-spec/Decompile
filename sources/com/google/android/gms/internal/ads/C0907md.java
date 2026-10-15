package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.md, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0907md extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9625o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9626p;

    public C0907md(String str, Throwable th, boolean z4, int i4) {
        super(str, th);
        this.f9625o = z4;
        this.f9626p = i4;
    }

    public static C0907md a(String str, ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return new C0907md(str, arrayIndexOutOfBoundsException, true, 1);
    }

    public static C0907md b(String str) {
        return new C0907md(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append("{contentIsMalformed=");
        sb.append(this.f9625o);
        sb.append(", dataType=");
        return U.a.l(sb, this.f9626p, "}");
    }
}
