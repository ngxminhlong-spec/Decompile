package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0588f implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: s, reason: collision with root package name */
    public static final ChoreographerFrameCallbackC0588f f8662s = new ChoreographerFrameCallbackC0588f();

    /* renamed from: o, reason: collision with root package name */
    public volatile long f8663o = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f8664p;

    /* renamed from: q, reason: collision with root package name */
    public Choreographer f8665q;

    /* renamed from: r, reason: collision with root package name */
    public int f8666r;

    public ChoreographerFrameCallbackC0588f() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f8664p = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f8663o = j4;
        Choreographer choreographer = this.f8665q;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            try {
                this.f8665q = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e4) {
                Wj.n("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
                return true;
            }
        }
        if (i4 == 1) {
            Choreographer choreographer = this.f8665q;
            if (choreographer != null) {
                int i5 = this.f8666r + 1;
                this.f8666r = i5;
                if (i5 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i4 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f8665q;
            if (choreographer2 != null) {
                int i6 = this.f8666r - 1;
                this.f8666r = i6;
                if (i6 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f8663o = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
