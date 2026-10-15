package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0517dD {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f8478a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i4, int i5) {
        boolean isDirectPlaybackSupported;
        for (int i6 = 10; i6 > 0; i6--) {
            int n4 = AbstractC0751is.n(i6);
            if (n4 != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i5).setChannelMask(n4).build(), f8478a);
                if (isDirectPlaybackSupported) {
                    return i6;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.ot] */
    public static AbstractC1137rt b() {
        boolean isDirectPlaybackSupported;
        ?? abstractC0880lt = new AbstractC0880lt(4);
        Lt lt = C0559eD.c;
        Jt jt = lt.f6177p;
        if (jt == null) {
            jt = new Jt(lt, new Kt(lt.f6180s, 0, lt.f6181t));
            lt.f6177p = jt;
        }
        Tt l4 = jt.l();
        while (l4.hasNext()) {
            Integer num = (Integer) l4.next();
            int intValue = num.intValue();
            if (AbstractC0751is.f9071a >= AbstractC0751is.m(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f8478a);
                if (isDirectPlaybackSupported) {
                    abstractC0880lt.a(num);
                }
            }
        }
        abstractC0880lt.a(2);
        return abstractC0880lt.f();
    }
}
