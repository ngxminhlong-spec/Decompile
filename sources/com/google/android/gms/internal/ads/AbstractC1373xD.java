package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1373xD {
    public static void a(InterfaceC0815kD interfaceC0815kD, Object obj) {
        C1158sD c1158sD;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        C1330wD c1330wD = (C1330wD) interfaceC0815kD;
        if (audioDeviceInfo == null) {
            c1158sD = null;
        } else {
            c1330wD.getClass();
            c1158sD = new C1158sD(audioDeviceInfo);
        }
        c1330wD.f11142Q = c1158sD;
        AudioTrack audioTrack = c1330wD.f11160p;
        if (audioTrack != null) {
            AbstractC1073qD.a(audioTrack, c1158sD);
        }
    }
}
