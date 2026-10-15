package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1115rD {
    public static void a(AudioTrack audioTrack, C0474cD c0474cD) {
        boolean equals;
        LogSessionId unused;
        C0432bD c0432bD = c0474cD.f8353a;
        c0432bD.getClass();
        LogSessionId logSessionId = c0432bD.f8232a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
