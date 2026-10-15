package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class TD {
    public static void a(OD od, C0474cD c0474cD) {
        boolean equals;
        String stringId;
        LogSessionId unused;
        C0432bD c0432bD = c0474cD.f8353a;
        c0432bD.getClass();
        LogSessionId logSessionId = c0432bD.f8232a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = od.f6452b;
        stringId = logSessionId.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
