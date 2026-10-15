package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641g9 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1016p f8789b = new C1016p(16);

    /* renamed from: a, reason: collision with root package name */
    public final Z8 f8790a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.Z8] */
    public C0641g9(Context context, C0248Bc c0248Bc, String str, Fq fq) {
        ?? obj = new Object();
        obj.c = new Object();
        obj.f7965b = 1;
        obj.f7964a = str;
        obj.d = context.getApplicationContext();
        obj.f7966e = c0248Bc;
        obj.f7967f = fq;
        this.f8790a = obj;
    }

    public final C0727i9 a(String str, InterfaceC0555e9 interfaceC0555e9, InterfaceC0513d9 interfaceC0513d9) {
        return new C0727i9(this.f8790a, str, interfaceC0555e9, interfaceC0513d9);
    }
}
