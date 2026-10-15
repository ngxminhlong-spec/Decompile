package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1580u2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f12033a;

    public AbstractC1580u2(Unsafe unsafe) {
        this.f12033a = unsafe;
    }

    public abstract double a(long j4, Object obj);

    public abstract float b(long j4, Object obj);

    public abstract void c(Object obj, long j4, boolean z4);

    public abstract void d(Object obj, long j4, byte b4);

    public abstract void e(Object obj, long j4, double d);

    public abstract void f(Object obj, long j4, float f4);

    public abstract boolean g(long j4, Object obj);

    public final int h(Class cls) {
        return this.f12033a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.f12033a.arrayIndexScale(cls);
    }

    public final int j(long j4, Object obj) {
        return this.f12033a.getInt(obj, j4);
    }

    public final long k(long j4, Object obj) {
        return this.f12033a.getLong(obj, j4);
    }

    public final void l(Field field) {
        this.f12033a.objectFieldOffset(field);
    }

    public final Object m(long j4, Object obj) {
        return this.f12033a.getObject(obj, j4);
    }

    public final void n(long j4, Object obj, int i4) {
        this.f12033a.putInt(obj, j4, i4);
    }

    public final void o(Object obj, long j4, long j5) {
        this.f12033a.putLong(obj, j4, j5);
    }

    public final void p(long j4, Object obj, Object obj2) {
        this.f12033a.putObject(obj, j4, obj2);
    }
}
