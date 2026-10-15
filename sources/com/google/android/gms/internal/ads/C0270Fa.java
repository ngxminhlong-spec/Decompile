package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270Fa implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f5014b;
    public final /* synthetic */ C0275Ga c;

    public /* synthetic */ C0270Fa(C0275Ga c0275Ga, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i4) {
        this.f5013a = i4;
        this.c = c0275Ga;
        this.f5014b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f5013a) {
            case 0:
                uncaughtExceptionHandler = this.f5014b;
                try {
                    try {
                        this.c.u(th);
                    } finally {
                    }
                } catch (Throwable unused) {
                    Y9.p("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
            default:
                uncaughtExceptionHandler = this.f5014b;
                try {
                    try {
                        this.c.u(th);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    Y9.p("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
