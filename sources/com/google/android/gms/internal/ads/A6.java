package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A6 {

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f3925a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f3926b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    public final ScheduledExecutorService c;

    public A6(ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
    }
}
