package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849l4 {

    /* renamed from: a, reason: collision with root package name */
    public final U3 f9360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9361b;
    public final String c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f9362e;
    public volatile Method d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f9363f = new CountDownLatch(1);

    public C0849l4(U3 u32, String str, String str2, Class... clsArr) {
        this.f9360a = u32;
        this.f9361b = str;
        this.c = str2;
        this.f9362e = clsArr;
        u32.f7128b.submit(new D3(3, this));
    }
}
