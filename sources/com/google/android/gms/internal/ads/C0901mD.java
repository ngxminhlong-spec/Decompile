package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901mD {

    /* renamed from: A, reason: collision with root package name */
    public long f9575A;

    /* renamed from: B, reason: collision with root package name */
    public long f9576B;

    /* renamed from: C, reason: collision with root package name */
    public long f9577C;

    /* renamed from: D, reason: collision with root package name */
    public long f9578D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9579E;

    /* renamed from: F, reason: collision with root package name */
    public long f9580F;

    /* renamed from: G, reason: collision with root package name */
    public long f9581G;

    /* renamed from: a, reason: collision with root package name */
    public final C0388aC f9582a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9583b;
    public AudioTrack c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f9584e;

    /* renamed from: f, reason: collision with root package name */
    public C0858lD f9585f;

    /* renamed from: g, reason: collision with root package name */
    public int f9586g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9587h;

    /* renamed from: i, reason: collision with root package name */
    public long f9588i;

    /* renamed from: j, reason: collision with root package name */
    public float f9589j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9590k;

    /* renamed from: l, reason: collision with root package name */
    public long f9591l;

    /* renamed from: m, reason: collision with root package name */
    public long f9592m;

    /* renamed from: n, reason: collision with root package name */
    public Method f9593n;

    /* renamed from: o, reason: collision with root package name */
    public long f9594o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9595p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9596q;

    /* renamed from: r, reason: collision with root package name */
    public long f9597r;

    /* renamed from: s, reason: collision with root package name */
    public long f9598s;

    /* renamed from: t, reason: collision with root package name */
    public long f9599t;

    /* renamed from: u, reason: collision with root package name */
    public long f9600u;

    /* renamed from: v, reason: collision with root package name */
    public long f9601v;

    /* renamed from: w, reason: collision with root package name */
    public int f9602w;

    /* renamed from: x, reason: collision with root package name */
    public int f9603x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public long f9604z;

    public C0901mD(C0388aC c0388aC) {
        this.f9582a = c0388aC;
        int i4 = AbstractC0751is.f9071a;
        try {
            this.f9593n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f9583b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r29) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0901mD.a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.c = r3
            r2.d = r6
            r2.f9584e = r7
            com.google.android.gms.internal.ads.lD r0 = new com.google.android.gms.internal.ads.lD
            r0.<init>(r3)
            r2.f9585f = r0
            int r3 = r3.getSampleRate()
            r2.f9586g = r3
            r3 = 0
            if (r4 == 0) goto L25
            int r4 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r0 = 23
            if (r4 >= r0) goto L25
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L26
            r4 = 6
            if (r5 != r4) goto L25
            r5 = r4
            goto L26
        L25:
            r0 = r3
        L26:
            r2.f9587h = r0
            boolean r4 = com.google.android.gms.internal.ads.AbstractC0751is.d(r5)
            r2.f9596q = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3e
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.f9586g
            long r4 = com.google.android.gms.internal.ads.AbstractC0751is.u(r6, r4)
            goto L3f
        L3e:
            r4 = r0
        L3f:
            r2.f9588i = r4
            r4 = 0
            r2.f9599t = r4
            r2.f9600u = r4
            r2.f9601v = r4
            r2.f9595p = r3
            r2.y = r0
            r2.f9604z = r0
            r2.f9597r = r4
            r2.f9594o = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f9589j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0901mD.b(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final boolean c(long j4) {
        long a4 = a(false);
        int i4 = this.f9586g;
        int i5 = AbstractC0751is.f9071a;
        if (j4 > AbstractC0751is.v(a4, i4, 1000000L, RoundingMode.CEILING)) {
            return true;
        }
        if (this.f9587h) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && d() == 0) {
                return true;
            }
        }
        return false;
    }

    public final long d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i4 = 2;
        if (this.y != -9223372036854775807L) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f9575A;
            }
            return Math.min(this.f9576B, this.f9575A + AbstractC0751is.v(AbstractC0751is.s(AbstractC0751is.t(elapsedRealtime) - this.y, this.f9589j), this.f9586g, 1000000L, RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.f9598s >= 5) {
            AudioTrack audioTrack2 = this.c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j4 = 0;
                if (this.f9587h) {
                    if (playState != 2) {
                        i4 = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.f9601v = this.f9599t;
                    }
                    playbackHeadPosition += this.f9601v;
                    playState = i4;
                }
                if (AbstractC0751is.f9071a <= 29) {
                    if (playbackHeadPosition != 0) {
                        j4 = playbackHeadPosition;
                    } else if (this.f9599t > 0 && playState == 3) {
                        if (this.f9604z == -9223372036854775807L) {
                            this.f9604z = elapsedRealtime;
                        }
                    }
                    this.f9604z = -9223372036854775807L;
                    playbackHeadPosition = j4;
                }
                if (this.f9599t > playbackHeadPosition) {
                    this.f9600u++;
                }
                this.f9599t = playbackHeadPosition;
            }
            this.f9598s = elapsedRealtime;
        }
        return this.f9599t + (this.f9600u << 32);
    }
}
