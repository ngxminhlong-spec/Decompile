package com.google.firebase.storage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Jn;
import com.google.android.gms.internal.play_billing.B;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import l2.C1798a;
import l3.InterfaceC1800a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends h {

    /* renamed from: B, reason: collision with root package name */
    public static final Random f12577B = new Random();

    /* renamed from: C, reason: collision with root package name */
    public static final V2.e f12578C = new V2.e(5);

    /* renamed from: D, reason: collision with root package name */
    public static final C1798a f12579D = C1798a.f13957a;

    /* renamed from: l, reason: collision with root package name */
    public final e f12581l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f12582m;

    /* renamed from: n, reason: collision with root package name */
    public final E3.a f12583n;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1800a f12585p;

    /* renamed from: r, reason: collision with root package name */
    public final E3.b f12587r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f12588s;

    /* renamed from: t, reason: collision with root package name */
    public volatile N1.l f12589t;

    /* renamed from: u, reason: collision with root package name */
    public volatile Uri f12590u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Exception f12591v;
    public volatile String y;

    /* renamed from: z, reason: collision with root package name */
    public volatile long f12594z;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f12584o = new AtomicLong(0);

    /* renamed from: q, reason: collision with root package name */
    public int f12586q = 262144;

    /* renamed from: w, reason: collision with root package name */
    public volatile Exception f12592w = null;

    /* renamed from: x, reason: collision with root package name */
    public volatile int f12593x = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f12580A = 0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.google.firebase.storage.e r10, android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.m.<init>(com.google.firebase.storage.e, android.net.Uri):void");
    }

    @Override // com.google.firebase.storage.h
    public final void n() {
        this.f12587r.c = true;
        F3.c cVar = this.f12590u != null ? new F3.c(this.f12581l.a(), this.f12581l.f12556p.f12549a, this.f12590u, 0) : null;
        if (cVar != null) {
            B.f12128a.execute(new Jn(this, cVar, 16, false));
        }
        this.f12591v = d.a(Status.f3897u);
    }

    public final boolean r(F3.b bVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.f12580A + " milliseconds");
            V2.e eVar = f12578C;
            int nextInt = this.f12580A + f12577B.nextInt(250);
            eVar.getClass();
            Thread.sleep(nextInt);
            AbstractC1895f.o();
            String n4 = AbstractC1895f.n(this.f12585p);
            d3.g gVar = this.f12581l.f12556p.f12549a;
            gVar.a();
            bVar.l(gVar.f12617a, n4);
            boolean s4 = s(bVar);
            if (s4) {
                this.f12580A = 0;
            }
            return s4;
        } catch (InterruptedException e4) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f12592w = e4;
            return false;
        }
    }

    public final boolean s(F3.a aVar) {
        int i4 = aVar.f746e;
        this.f12587r.getClass();
        if ((i4 >= 500 && i4 < 600) || i4 == -2 || i4 == 429 || i4 == 408) {
            i4 = -2;
        }
        this.f12593x = i4;
        this.f12592w = aVar.f744a;
        this.y = aVar.h("X-Goog-Upload-Status");
        int i5 = this.f12593x;
        return (i5 == 308 || (i5 >= 200 && i5 < 300)) && this.f12592w == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        r12 = r1.h("X-Goog-Upload-Size-Received");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r1 = java.lang.Long.parseLong(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        r5 = r11.f12584o.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if (r5 <= r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r11.f12591v = new java.io.IOException("Unexpected error. The server lost a chunk update.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r5 >= r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r11.f12583n.a((int) r7) == (r1 - r5)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        r11.f12591v = new java.io.IOException("Unexpected end of stream encountered.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r11.f12584o.compareAndSet(r5, r1) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        android.util.Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
        r11.f12591v = new java.lang.IllegalStateException("uploaded bytes changed unexpectedly.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        android.util.Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", r12);
        r11.f12591v = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0046, code lost:
    
        if (s(r1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (v(r1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if ("final".equals(r1.h("X-Goog-Upload-Status")) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        r11.f12591v = new java.io.IOException("The server has terminated the upload session");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(boolean r12) {
        /*
            r11 = this;
            java.lang.String r0 = "UploadTask"
            F3.c r1 = new F3.c
            com.google.firebase.storage.e r2 = r11.f12581l
            com.google.android.gms.internal.measurement.e1 r2 = r2.a()
            com.google.firebase.storage.e r3 = r11.f12581l
            com.google.firebase.storage.b r3 = r3.f12556p
            d3.g r3 = r3.f12549a
            android.net.Uri r4 = r11.f12590u
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            java.lang.String r2 = r11.y
            java.lang.String r3 = "final"
            boolean r2 = r3.equals(r2)
            r4 = 0
            if (r2 == 0) goto L22
            goto L48
        L22:
            if (r12 == 0) goto L2b
            boolean r12 = r11.v(r1)
            if (r12 != 0) goto L49
            goto L48
        L2b:
            o2.AbstractC1895f.o()
            l3.a r12 = r11.f12585p
            java.lang.String r12 = o2.AbstractC1895f.n(r12)
            com.google.firebase.storage.e r2 = r11.f12581l
            com.google.firebase.storage.b r2 = r2.f12556p
            d3.g r2 = r2.f12549a
            r2.a()
            android.content.Context r2 = r2.f12617a
            r1.l(r2, r12)
            boolean r12 = r11.s(r1)
            if (r12 != 0) goto L49
        L48:
            return r4
        L49:
            java.lang.String r12 = "X-Goog-Upload-Status"
            java.lang.String r12 = r1.h(r12)
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L5f
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "The server has terminated the upload session"
            r12.<init>(r0)
            r11.f12591v = r12
            return r4
        L5f:
            java.lang.String r12 = "X-Goog-Upload-Size-Received"
            java.lang.String r12 = r1.h(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L70
            long r1 = java.lang.Long.parseLong(r12)
            goto L72
        L70:
            r1 = 0
        L72:
            java.util.concurrent.atomic.AtomicLong r12 = r11.f12584o
            long r5 = r12.get()
            int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r12 <= 0) goto L86
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Unexpected error. The server lost a chunk update."
            r12.<init>(r0)
            r11.f12591v = r12
            return r4
        L86:
            if (r12 >= 0) goto Lc1
            E3.a r12 = r11.f12583n     // Catch: java.io.IOException -> La0
            long r7 = r1 - r5
            int r3 = (int) r7     // Catch: java.io.IOException -> La0
            int r12 = r12.a(r3)     // Catch: java.io.IOException -> La0
            long r9 = (long) r12     // Catch: java.io.IOException -> La0
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 == 0) goto La2
            java.io.IOException r12 = new java.io.IOException     // Catch: java.io.IOException -> La0
            java.lang.String r1 = "Unexpected end of stream encountered."
            r12.<init>(r1)     // Catch: java.io.IOException -> La0
            r11.f12591v = r12     // Catch: java.io.IOException -> La0
            return r4
        La0:
            r12 = move-exception
            goto Lb9
        La2:
            java.util.concurrent.atomic.AtomicLong r12 = r11.f12584o     // Catch: java.io.IOException -> La0
            boolean r12 = r12.compareAndSet(r5, r1)     // Catch: java.io.IOException -> La0
            if (r12 != 0) goto Lc1
            java.lang.String r12 = "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen"
            android.util.Log.e(r0, r12)     // Catch: java.io.IOException -> La0
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> La0
            java.lang.String r1 = "uploaded bytes changed unexpectedly."
            r12.<init>(r1)     // Catch: java.io.IOException -> La0
            r11.f12591v = r12     // Catch: java.io.IOException -> La0
            return r4
        Lb9:
            java.lang.String r1 = "Unable to recover position in Stream during resumable upload"
            android.util.Log.e(r0, r1, r12)
            r11.f12591v = r12
            return r4
        Lc1:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.m.t(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.m.u():void");
    }

    public final boolean v(F3.a aVar) {
        int i4;
        E3.b bVar = this.f12587r;
        bVar.getClass();
        E3.b.f724f.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + 600000;
        AbstractC1895f.o();
        aVar.l(bVar.f725a, AbstractC1895f.n(bVar.f726b));
        int i5 = 1000;
        while (true) {
            E3.b.f724f.getClass();
            if (SystemClock.elapsedRealtime() + i5 > elapsedRealtime || aVar.j() || (((i4 = aVar.f746e) < 500 || i4 >= 600) && i4 != -2 && i4 != 429 && i4 != 408)) {
                break;
            }
            try {
                V2.e eVar = E3.b.f723e;
                int nextInt = E3.b.d.nextInt(250) + i5;
                eVar.getClass();
                Thread.sleep(nextInt);
                if (i5 < 30000) {
                    if (aVar.f746e != -2) {
                        i5 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i5 = 1000;
                    }
                }
                if (bVar.c) {
                    break;
                }
                aVar.f744a = null;
                aVar.f746e = 0;
                AbstractC1895f.o();
                aVar.l(bVar.f725a, AbstractC1895f.n(bVar.f726b));
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
            }
        }
        return s(aVar);
    }

    public final boolean w() {
        if (!"final".equals(this.y)) {
            return true;
        }
        if (this.f12591v == null) {
            this.f12591v = new IOException("The server has terminated the upload session", this.f12592w);
        }
        p(64);
        return false;
    }

    public final boolean x() {
        if (this.f12568h != 128) {
            if (Thread.interrupted()) {
                this.f12591v = new InterruptedException();
                p(64);
                return false;
            }
            if (this.f12568h == 32) {
                p(256);
                return false;
            }
            if (this.f12568h == 8) {
                p(16);
                return false;
            }
            if (w()) {
                if (this.f12590u == null) {
                    if (this.f12591v == null) {
                        this.f12591v = new IllegalStateException("Unable to obtain an upload URL.");
                    }
                    p(64);
                    return false;
                }
                if (this.f12591v != null) {
                    p(64);
                    return false;
                }
                boolean z4 = this.f12592w != null || this.f12593x < 200 || this.f12593x >= 300;
                C1798a c1798a = f12579D;
                c1798a.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() + this.f12594z;
                c1798a.getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + this.f12580A;
                if (!z4) {
                    return true;
                }
                if (elapsedRealtime2 <= elapsedRealtime && t(true)) {
                    this.f12580A = Math.max(this.f12580A * 2, 1000);
                    return true;
                }
                if (w()) {
                    p(64);
                }
            }
        }
        return false;
    }
}
