package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.g8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640g8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8787a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8788b = false;
    public float c = 0.0f;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.c;
    }

    public final synchronized void b(boolean z4, float f4) {
        this.f8788b = z4;
        this.c = f4;
    }

    public final synchronized boolean c(boolean z4) {
        if (!this.d.get()) {
            return z4;
        }
        return this.f8787a;
    }
}
