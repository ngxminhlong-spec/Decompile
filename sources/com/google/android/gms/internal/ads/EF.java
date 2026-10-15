package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class EF extends Surface {

    /* renamed from: r, reason: collision with root package name */
    public static int f4868r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f4869s;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4870o;

    /* renamed from: p, reason: collision with root package name */
    public final DF f4871p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4872q;

    public /* synthetic */ EF(DF df, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f4871p = df;
        this.f4870o = z4;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.HandlerThread, java.lang.Thread, com.google.android.gms.internal.ads.DF, android.os.Handler$Callback, java.lang.Object] */
    public static EF a(Context context, boolean z4) {
        boolean z5 = false;
        Zf.X(!z4 || b(context));
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        int i4 = z4 ? f4868r : 0;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f4611p = handler;
        handlerThread.f4610o = new RunnableC0618fn(handler);
        synchronized (handlerThread) {
            handlerThread.f4611p.obtainMessage(1, i4, 0).sendToTarget();
            while (handlerThread.f4614s == null && handlerThread.f4613r == null && handlerThread.f4612q == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f4613r;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThread.f4612q;
        if (error != null) {
            throw error;
        }
        EF ef = handlerThread.f4614s;
        ef.getClass();
        return ef;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if ("XT1650".equals(com.google.android.gms.internal.ads.AbstractC0751is.d) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0041, B:14:0x004e, B:19:0x0014, B:21:0x001e, B:24:0x002a, B:27:0x0039, B:28:0x0055), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean b(android.content.Context r7) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.EF> r0 = com.google.android.gms.internal.ads.EF.class
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.internal.ads.EF.f4869s     // Catch: java.lang.Throwable -> L53
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L55
            int r1 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a     // Catch: java.lang.Throwable -> L53
            r4 = 24
            if (r1 >= r4) goto L10
            goto L37
        L10:
            r4 = 26
            if (r1 >= r4) goto L28
            java.lang.String r5 = "samsung"
            java.lang.String r6 = com.google.android.gms.internal.ads.AbstractC0751is.c     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L37
            java.lang.String r5 = "XT1650"
            java.lang.String r6 = com.google.android.gms.internal.ads.AbstractC0751is.d     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L37
        L28:
            if (r1 >= r4) goto L39
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L37
            goto L39
        L37:
            r7 = r3
            goto L3f
        L39:
            java.lang.String r7 = "EGL_EXT_protected_content"
            boolean r7 = com.google.android.gms.internal.ads.AbstractC1003on.k(r7)     // Catch: java.lang.Throwable -> L53
        L3f:
            if (r7 == 0) goto L4d
            java.lang.String r7 = "EGL_KHR_surfaceless_context"
            boolean r7 = com.google.android.gms.internal.ads.AbstractC1003on.k(r7)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L4b
            r7 = r2
            goto L4e
        L4b:
            r7 = 2
            goto L4e
        L4d:
            r7 = r3
        L4e:
            com.google.android.gms.internal.ads.EF.f4868r = r7     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.internal.ads.EF.f4869s = r2     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r7 = move-exception
            goto L5c
        L55:
            int r7 = com.google.android.gms.internal.ads.EF.f4868r     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)
            if (r7 == 0) goto L5b
            return r2
        L5b:
            return r3
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.EF.b(android.content.Context):boolean");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f4871p) {
            try {
                if (!this.f4872q) {
                    Handler handler = this.f4871p.f4611p;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f4872q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
