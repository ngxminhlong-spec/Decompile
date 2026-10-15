package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1030pD {
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, H1.p] */
    public static C0602fD a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z4) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C0602fD.d;
        }
        ?? obj = new Object();
        boolean z5 = false;
        if (AbstractC0751is.f9071a > 32 && playbackOffloadSupport == 2) {
            z5 = true;
        }
        obj.f880a = true;
        obj.f881b = z5;
        obj.c = z4;
        return obj.a();
    }
}
