package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1117rF extends Handler implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final DE f10468o;

    /* renamed from: p, reason: collision with root package name */
    public GE f10469p;

    /* renamed from: q, reason: collision with root package name */
    public IOException f10470q;

    /* renamed from: r, reason: collision with root package name */
    public int f10471r;

    /* renamed from: s, reason: collision with root package name */
    public Thread f10472s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10473t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f10474u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Op f10475v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1117rF(Op op, Looper looper, DE de, GE ge, long j4) {
        super(looper);
        this.f10475v = op;
        this.f10468o = de;
        this.f10469p = ge;
    }

    public final void a(boolean z4) {
        this.f10474u = z4;
        this.f10470q = null;
        if (hasMessages(0)) {
            this.f10473t = true;
            removeMessages(0);
            if (!z4) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f10473t = true;
                    this.f10468o.f4603g = true;
                    Thread thread = this.f10472s;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.f10475v.f6526q = null;
            SystemClock.elapsedRealtime();
            GE ge = this.f10469p;
            ge.getClass();
            ge.a(this.f10468o, true);
            this.f10469p = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, com.google.android.gms.internal.ads.lE] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r28) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HandlerC1117rF.handleMessage(android.os.Message):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f10473t;
                this.f10472s = Thread.currentThread();
            }
            if (!z4) {
                String concat = "load:".concat(this.f10468o.getClass().getSimpleName());
                int i4 = AbstractC0751is.f9071a;
                Trace.beginSection(concat);
                try {
                    this.f10468o.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f10472s = null;
                Thread.interrupted();
            }
            if (this.f10474u) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e4) {
            if (this.f10474u) {
                return;
            }
            obtainMessage(2, e4).sendToTarget();
        } catch (OutOfMemoryError e5) {
            if (this.f10474u) {
                return;
            }
            Wj.i("LoadTask", "OutOfMemory error loading stream", e5);
            obtainMessage(2, new C1203tF(e5)).sendToTarget();
        } catch (Error e6) {
            if (!this.f10474u) {
                Wj.i("LoadTask", "Unexpected error loading stream", e6);
                obtainMessage(3, e6).sendToTarget();
            }
            throw e6;
        } catch (Exception e7) {
            if (this.f10474u) {
                return;
            }
            Wj.i("LoadTask", "Unexpected exception loading stream", e7);
            obtainMessage(2, new C1203tF(e7)).sendToTarget();
        }
    }
}
