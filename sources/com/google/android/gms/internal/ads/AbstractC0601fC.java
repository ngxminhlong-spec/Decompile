package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0601fC {
    public static C0474cD a(Context context, C0857lC c0857lC, boolean z4) {
        PlaybackSession createPlaybackSession;
        C0389aD c0389aD;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager i4 = A.f.i(context.getSystemService("media_metrics"));
        if (i4 == null) {
            c0389aD = null;
        } else {
            createPlaybackSession = i4.createPlaybackSession();
            c0389aD = new C0389aD(context, createPlaybackSession);
        }
        if (c0389aD == null) {
            Wj.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new C0474cD(logSessionId);
        }
        if (z4) {
            c0857lC.H1(c0389aD);
        }
        sessionId = c0389aD.f8103q.getSessionId();
        return new C0474cD(sessionId);
    }
}
