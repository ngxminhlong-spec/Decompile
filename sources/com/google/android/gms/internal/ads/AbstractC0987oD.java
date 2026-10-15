package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0987oD {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, H1.p] */
    public static C0602fD a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z4) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return C0602fD.d;
        }
        ?? obj = new Object();
        obj.f880a = true;
        obj.c = z4;
        return obj.a();
    }
}
