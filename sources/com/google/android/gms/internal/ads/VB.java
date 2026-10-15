package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class VB {

    /* renamed from: a, reason: collision with root package name */
    public int f7238a;

    /* renamed from: b, reason: collision with root package name */
    public int f7239b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f7240e;

    /* renamed from: f, reason: collision with root package name */
    public int f7241f;

    /* renamed from: g, reason: collision with root package name */
    public int f7242g;

    /* renamed from: h, reason: collision with root package name */
    public int f7243h;

    /* renamed from: i, reason: collision with root package name */
    public int f7244i;

    /* renamed from: j, reason: collision with root package name */
    public int f7245j;

    /* renamed from: k, reason: collision with root package name */
    public long f7246k;

    /* renamed from: l, reason: collision with root package name */
    public int f7247l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i4 = this.f7238a;
        int i5 = this.f7239b;
        int i6 = this.c;
        int i7 = this.d;
        int i8 = this.f7240e;
        int i9 = this.f7241f;
        int i10 = this.f7242g;
        int i11 = this.f7243h;
        int i12 = this.f7244i;
        int i13 = this.f7245j;
        long j4 = this.f7246k;
        int i14 = this.f7247l;
        Locale locale = Locale.US;
        StringBuilder m4 = U.a.m("DecoderCounters {\n decoderInits=", i4, ",\n decoderReleases=", i5, "\n queuedInputBuffers=");
        m4.append(i6);
        m4.append("\n skippedInputBuffers=");
        m4.append(i7);
        m4.append("\n renderedOutputBuffers=");
        m4.append(i8);
        m4.append("\n skippedOutputBuffers=");
        m4.append(i9);
        m4.append("\n droppedBuffers=");
        m4.append(i10);
        m4.append("\n droppedInputBuffers=");
        m4.append(i11);
        m4.append("\n maxConsecutiveDroppedBuffers=");
        m4.append(i12);
        m4.append("\n droppedToKeyframeEvents=");
        m4.append(i13);
        m4.append("\n totalVideoFrameProcessingOffsetUs=");
        m4.append(j4);
        m4.append("\n videoFrameProcessingOffsetCount=");
        m4.append(i14);
        m4.append("\n}");
        return m4.toString();
    }
}
