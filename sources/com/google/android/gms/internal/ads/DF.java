package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class DF extends HandlerThread implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public RunnableC0618fn f4610o;

    /* renamed from: p, reason: collision with root package name */
    public Handler f4611p;

    /* renamed from: q, reason: collision with root package name */
    public Error f4612q;

    /* renamed from: r, reason: collision with root package name */
    public RuntimeException f4613r;

    /* renamed from: s, reason: collision with root package name */
    public EF f4614s;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC0618fn runnableC0618fn;
        int i4 = message.what;
        try {
            if (i4 == 1) {
                try {
                    int i5 = message.arg1;
                    RunnableC0618fn runnableC0618fn2 = this.f4610o;
                    if (runnableC0618fn2 == null) {
                        throw null;
                    }
                    runnableC0618fn2.a(i5);
                    SurfaceTexture surfaceTexture = this.f4610o.f8741t;
                    surfaceTexture.getClass();
                    this.f4614s = new EF(this, surfaceTexture, i5 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (An e4) {
                    Wj.i("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.f4613r = new IllegalStateException(e4);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e5) {
                    Wj.i("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                    this.f4612q = e5;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e6) {
                    Wj.i("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f4613r = e6;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i4 == 2) {
                try {
                    runnableC0618fn = this.f4610o;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (runnableC0618fn == null) {
                    throw null;
                }
                runnableC0618fn.b();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
