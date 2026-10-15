package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class LD {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f6136g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f6137h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f6138a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f6139b;
    public JD c;
    public final AtomicReference d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f6140e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6141f;

    public LD(MediaCodec mediaCodec, HandlerThread handlerThread) {
        Y y = new Y(3);
        this.f6138a = mediaCodec;
        this.f6139b = handlerThread;
        this.f6140e = y;
        this.d = new AtomicReference();
    }

    public static KD b() {
        ArrayDeque arrayDeque = f6136g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new KD();
                }
                return (KD) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Y y = this.f6140e;
        if (this.f6141f) {
            try {
                JD jd = this.c;
                if (jd == null) {
                    throw null;
                }
                jd.removeCallbacksAndMessages(null);
                y.b();
                JD jd2 = this.c;
                if (jd2 == null) {
                    throw null;
                }
                jd2.obtainMessage(2).sendToTarget();
                synchronized (y) {
                    while (!y.f7724p) {
                        y.wait();
                    }
                }
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }
}
