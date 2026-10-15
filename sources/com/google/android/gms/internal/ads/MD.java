package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import b0.C0197j;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class MD extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f6225b;
    public Handler c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f6229h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f6230i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f6231j;

    /* renamed from: k, reason: collision with root package name */
    public long f6232k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6233l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f6234m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6224a = new Object();
    public final C0197j d = new C0197j();

    /* renamed from: e, reason: collision with root package name */
    public final C0197j f6226e = new C0197j();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f6227f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f6228g = new ArrayDeque();

    public MD(HandlerThread handlerThread) {
        this.f6225b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f6228g;
        if (!arrayDeque.isEmpty()) {
            this.f6230i = (MediaFormat) arrayDeque.getLast();
        }
        C0197j c0197j = this.d;
        c0197j.c = c0197j.f3326b;
        C0197j c0197j2 = this.f6226e;
        c0197j2.c = c0197j2.f3326b;
        this.f6227f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6224a) {
            this.f6231j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i4) {
        synchronized (this.f6224a) {
            this.d.a(i4);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i4, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6224a) {
            try {
                MediaFormat mediaFormat = this.f6230i;
                if (mediaFormat != null) {
                    this.f6226e.a(-2);
                    this.f6228g.add(mediaFormat);
                    this.f6230i = null;
                }
                this.f6226e.a(i4);
                this.f6227f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6224a) {
            this.f6226e.a(-2);
            this.f6228g.add(mediaFormat);
            this.f6230i = null;
        }
    }
}
