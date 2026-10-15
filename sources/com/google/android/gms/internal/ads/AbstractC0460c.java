package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0460c {
    public static void a(Surface surface, float f4) {
        try {
            surface.setFrameRate(f4, f4 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e4) {
            Wj.i("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
        }
    }
}
