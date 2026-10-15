package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019p2 {

    /* renamed from: a, reason: collision with root package name */
    public long f9900a;

    /* renamed from: b, reason: collision with root package name */
    public long f9901b;
    public long c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9902e;

    public C1019p2(AudioTrack audioTrack) {
        this.d = audioTrack;
        this.f9902e = new AudioTimestamp();
    }

    public /* synthetic */ C1019p2(ByteBuffer byteBuffer, long j4, long j5, long j6, ByteBuffer byteBuffer2) {
        this.d = byteBuffer;
        this.f9900a = j4;
        this.f9901b = j5;
        this.c = j6;
        this.f9902e = byteBuffer2;
    }
}
