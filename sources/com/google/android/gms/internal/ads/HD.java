package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class HD implements PD {

    /* renamed from: o, reason: collision with root package name */
    public final MediaCodec f5423o;

    /* renamed from: p, reason: collision with root package name */
    public final MD f5424p;

    /* renamed from: q, reason: collision with root package name */
    public final LD f5425q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5426r;

    /* renamed from: s, reason: collision with root package name */
    public int f5427s = 0;

    public /* synthetic */ HD(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f5423o = mediaCodec;
        this.f5424p = new MD(handlerThread);
        this.f5425q = new LD(mediaCodec, handlerThread2);
    }

    public static void h(HD hd, MediaFormat mediaFormat, Surface surface) {
        MD md = hd.f5424p;
        MediaCodec mediaCodec = hd.f5423o;
        HandlerThread handlerThread = md.f6225b;
        Zf.X(md.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(md, handler);
        md.c = handler;
        int i4 = AbstractC0751is.f9071a;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        LD ld = hd.f5425q;
        HandlerThread handlerThread2 = ld.f6139b;
        if (!ld.f6141f) {
            handlerThread2.start();
            ld.c = new JD(ld, handlerThread2.getLooper());
            ld.f6141f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        hd.f5427s = 1;
    }

    public static String o(String str, int i4) {
        StringBuilder sb = new StringBuilder(str);
        if (i4 == 1) {
            sb.append("Audio");
        } else if (i4 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i4);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void a(int i4) {
        this.f5423o.setVideoScalingMode(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0031, DONT_GENERATE, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0033, B:26:0x004b, B:29:0x0041, B:30:0x004d, B:31:0x0052, B:33:0x0053, B:34:0x0055, B:35:0x0056, B:36:0x0058), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0033, B:26:0x004b, B:29:0x0041, B:30:0x004d, B:31:0x0052, B:33:0x0053, B:34:0x0055, B:35:0x0056, B:36:0x0058), top: B:5:0x0012 }] */
    @Override // com.google.android.gms.internal.ads.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.LD r0 = r7.f5425q
            java.util.concurrent.atomic.AtomicReference r0 = r0.d
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto L5b
            com.google.android.gms.internal.ads.MD r0 = r7.f5424p
            java.lang.Object r2 = r0.f6224a
            monitor-enter(r2)
            java.lang.IllegalStateException r3 = r0.f6234m     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L56
            android.media.MediaCodec$CodecException r3 = r0.f6231j     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L53
            long r3 = r0.f6232k     // Catch: java.lang.Throwable -> L31
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 > 0) goto L2b
            boolean r1 = r0.f6233l     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = r3
            goto L2c
        L2b:
            r1 = r4
        L2c:
            r5 = -1
            if (r1 == 0) goto L33
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return r5
        L31:
            r0 = move-exception
            goto L59
        L33:
            b0.j r0 = r0.d     // Catch: java.lang.Throwable -> L31
            int r1 = r0.f3326b     // Catch: java.lang.Throwable -> L31
            int r6 = r0.c     // Catch: java.lang.Throwable -> L31
            if (r1 != r6) goto L3c
            r3 = r4
        L3c:
            if (r3 == 0) goto L3f
            goto L4b
        L3f:
            if (r1 == r6) goto L4d
            int[] r3 = r0.f3325a     // Catch: java.lang.Throwable -> L31
            r5 = r3[r1]     // Catch: java.lang.Throwable -> L31
            int r1 = r1 + r4
            int r3 = r0.d     // Catch: java.lang.Throwable -> L31
            r1 = r1 & r3
            r0.f3326b = r1     // Catch: java.lang.Throwable -> L31
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return r5
        L4d:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L53:
            r0.f6231j = r1     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L56:
            r0.f6234m = r1     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r0
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HD.b():int");
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void c(int i4, boolean z4) {
        this.f5423o.releaseOutputBuffer(i4, z4);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final ByteBuffer d(int i4) {
        return this.f5423o.getInputBuffer(i4);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        MD md = this.f5424p;
        synchronized (md.f6224a) {
            try {
                mediaFormat = md.f6229h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void f(Bundle bundle) {
        this.f5423o.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void g() {
        this.f5425q.a();
        this.f5423o.flush();
        MD md = this.f5424p;
        synchronized (md.f6224a) {
            md.f6232k++;
            Handler handler = md.c;
            int i4 = AbstractC0751is.f9071a;
            handler.post(new RunnableC0744il(19, md));
        }
        this.f5423o.start();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void i(int i4, int i5, int i6, long j4) {
        LD ld = this.f5425q;
        RuntimeException runtimeException = (RuntimeException) ld.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        KD b4 = LD.b();
        b4.f5996a = i4;
        b4.f5997b = i5;
        b4.d = j4;
        b4.f5998e = i6;
        JD jd = ld.c;
        int i7 = AbstractC0751is.f9071a;
        jd.obtainMessage(0, b4).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void j(Surface surface) {
        this.f5423o.setOutputSurface(surface);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0031, DONT_GENERATE, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0034, B:25:0x003f, B:28:0x0043, B:30:0x004f, B:31:0x0077, B:35:0x006c, B:36:0x0079, B:37:0x007e, B:39:0x007f, B:40:0x0081, B:41:0x0082, B:42:0x0084), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0034, B:25:0x003f, B:28:0x0043, B:30:0x004f, B:31:0x0077, B:35:0x006c, B:36:0x0079, B:37:0x007e, B:39:0x007f, B:40:0x0081, B:41:0x0082, B:42:0x0084), top: B:5:0x0012 }] */
    @Override // com.google.android.gms.internal.ads.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.LD r0 = r10.f5425q
            java.util.concurrent.atomic.AtomicReference r0 = r0.d
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto L87
            com.google.android.gms.internal.ads.MD r0 = r10.f5424p
            java.lang.Object r2 = r0.f6224a
            monitor-enter(r2)
            java.lang.IllegalStateException r3 = r0.f6234m     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L82
            android.media.MediaCodec$CodecException r3 = r0.f6231j     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L7f
            long r3 = r0.f6232k     // Catch: java.lang.Throwable -> L31
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 > 0) goto L2b
            boolean r1 = r0.f6233l     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = r3
            goto L2c
        L2b:
            r1 = r4
        L2c:
            r5 = -1
            if (r1 == 0) goto L34
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return r5
        L31:
            r0 = move-exception
            r11 = r0
            goto L85
        L34:
            b0.j r1 = r0.f6226e     // Catch: java.lang.Throwable -> L31
            int r6 = r1.f3326b     // Catch: java.lang.Throwable -> L31
            int r7 = r1.c     // Catch: java.lang.Throwable -> L31
            if (r6 != r7) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L41
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return r5
        L41:
            if (r6 == r7) goto L79
            int[] r3 = r1.f3325a     // Catch: java.lang.Throwable -> L31
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L31
            int r6 = r6 + r4
            int r4 = r1.d     // Catch: java.lang.Throwable -> L31
            r4 = r4 & r6
            r1.f3326b = r4     // Catch: java.lang.Throwable -> L31
            if (r3 < 0) goto L69
            android.media.MediaFormat r1 = r0.f6229h     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.Zf.C(r1)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayDeque r0 = r0.f6227f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L31
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L31
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L31
            int r6 = r0.size     // Catch: java.lang.Throwable -> L31
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L31
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L31
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L31
            goto L77
        L69:
            r11 = -2
            if (r3 != r11) goto L77
            java.util.ArrayDeque r1 = r0.f6228g     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r1.remove()     // Catch: java.lang.Throwable -> L31
            android.media.MediaFormat r1 = (android.media.MediaFormat) r1     // Catch: java.lang.Throwable -> L31
            r0.f6229h = r1     // Catch: java.lang.Throwable -> L31
            r3 = r11
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return r3
        L79:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L31
            r11.<init>()     // Catch: java.lang.Throwable -> L31
            throw r11     // Catch: java.lang.Throwable -> L31
        L7f:
            r0.f6231j = r1     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L82:
            r0.f6234m = r1     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L85:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r11
        L87:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HD.k(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void l() {
        try {
            if (this.f5427s == 1) {
                LD ld = this.f5425q;
                if (ld.f6141f) {
                    ld.a();
                    ld.f6139b.quit();
                }
                ld.f6141f = false;
                MD md = this.f5424p;
                synchronized (md.f6224a) {
                    md.f6233l = true;
                    md.f6225b.quit();
                    md.a();
                }
            }
            this.f5427s = 2;
            if (this.f5426r) {
                return;
            }
            this.f5423o.release();
            this.f5426r = true;
        } catch (Throwable th) {
            if (!this.f5426r) {
                this.f5423o.release();
                this.f5426r = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void m(int i4, long j4) {
        this.f5423o.releaseOutputBuffer(i4, j4);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void n(int i4, PB pb, long j4) {
        int length;
        int length2;
        int length3;
        int length4;
        LD ld = this.f5425q;
        RuntimeException runtimeException = (RuntimeException) ld.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        KD b4 = LD.b();
        b4.f5996a = i4;
        b4.f5997b = 0;
        b4.d = j4;
        b4.f5998e = 0;
        MediaCodec.CryptoInfo cryptoInfo = b4.c;
        cryptoInfo.numSubSamples = pb.f6575f;
        int[] iArr = pb.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = pb.f6574e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = pb.f6573b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = pb.f6572a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = pb.c;
        if (AbstractC0751is.f9071a >= 24) {
            D.g.p();
            cryptoInfo.setPattern(D.g.c(pb.f6576g, pb.f6577h));
        }
        ld.c.obtainMessage(1, b4).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final ByteBuffer v(int i4) {
        return this.f5423o.getOutputBuffer(i4);
    }
}
