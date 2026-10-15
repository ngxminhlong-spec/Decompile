package o3;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1900a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f14337e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f14338a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f14339b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public ThreadFactoryC1900a(String str, int i4, StrictMode.ThreadPolicy threadPolicy) {
        this.f14339b = str;
        this.c = i4;
        this.d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f14337e.newThread(new C1.d(4, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f14339b + " Thread #" + this.f14338a.getAndIncrement());
        return newThread;
    }
}
