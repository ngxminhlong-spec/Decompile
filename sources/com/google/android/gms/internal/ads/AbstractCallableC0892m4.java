package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0892m4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final U3 f9560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9561b;
    public final String c;
    public final C0549e3 d;

    /* renamed from: e, reason: collision with root package name */
    public Method f9562e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9563f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9564g;

    public AbstractCallableC0892m4(U3 u32, String str, String str2, C0549e3 c0549e3, int i4, int i5) {
        this.f9560a = u32;
        this.f9561b = str;
        this.c = str2;
        this.d = c0549e3;
        this.f9563f = i4;
        this.f9564g = i5;
    }

    public abstract void a();

    public void b() {
        int i4;
        U3 u32 = this.f9560a;
        try {
            long nanoTime = System.nanoTime();
            Method c = u32.c(this.f9561b, this.c);
            this.f9562e = c;
            if (c == null) {
                return;
            }
            a();
            F3 f32 = u32.f7136l;
            if (f32 == null || (i4 = this.f9563f) == Integer.MIN_VALUE) {
                return;
            }
            f32.a(this.f9564g, i4, (System.nanoTime() - nanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
