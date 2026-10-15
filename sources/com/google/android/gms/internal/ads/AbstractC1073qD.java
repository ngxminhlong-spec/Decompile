package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1073qD {
    public static void a(AudioTrack audioTrack, C1158sD c1158sD) {
        audioTrack.setPreferredDevice(c1158sD == null ? null : c1158sD.f10601a);
    }
}
