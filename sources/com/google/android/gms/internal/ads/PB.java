package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class PB {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6572a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6573b;
    public int c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f6574e;

    /* renamed from: f, reason: collision with root package name */
    public int f6575f;

    /* renamed from: g, reason: collision with root package name */
    public int f6576g;

    /* renamed from: h, reason: collision with root package name */
    public int f6577h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f6578i;

    /* renamed from: j, reason: collision with root package name */
    public final Wl f6579j;

    public PB() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f6578i = cryptoInfo;
        this.f6579j = AbstractC0751is.f9071a >= 24 ? new Wl(cryptoInfo) : null;
    }
}
