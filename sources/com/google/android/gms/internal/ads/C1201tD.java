package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201tD {

    /* renamed from: a, reason: collision with root package name */
    public final C0976o2 f10681a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10682b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10683e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10684f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10685g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10686h;

    /* renamed from: i, reason: collision with root package name */
    public final C1214tk f10687i;

    public C1201tD(C0976o2 c0976o2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, C1214tk c1214tk) {
        this.f10681a = c0976o2;
        this.f10682b = i4;
        this.c = i5;
        this.d = i6;
        this.f10683e = i7;
        this.f10684f = i8;
        this.f10685g = i9;
        this.f10686h = i10;
        this.f10687i = c1214tk;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.AudioTrack a(com.google.android.gms.internal.ads.C0644gC r13, int r14) {
        /*
            r12 = this;
            int r9 = r12.c
            r10 = 0
            r11 = 1
            int r0 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            r1 = 29
            int r2 = r12.f10685g
            int r3 = r12.f10684f
            int r4 = r12.f10683e
            if (r0 < r1) goto L4a
            android.media.AudioFormat r0 = com.google.android.gms.internal.ads.AbstractC0751is.x(r4, r3, r2)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            com.google.android.gms.internal.ads.Xj r1 = r13.a()     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            java.lang.Object r1 = r1.f7687p     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioAttributes r1 = (android.media.AudioAttributes) r1     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioTrack$Builder r2 = new android.media.AudioTrack$Builder     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            r2.<init>()     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioTrack$Builder r1 = r2.setAudioAttributes(r1)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioTrack$Builder r0 = r1.setAudioFormat(r0)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioTrack$Builder r0 = r0.setTransferMode(r11)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r1 = r12.f10686h     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioTrack$Builder r0 = r0.setBufferSizeInBytes(r1)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioTrack$Builder r0 = r0.setSessionId(r14)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            if (r9 != r11) goto L3b
            r1 = r11
            goto L3c
        L3b:
            r1 = r10
        L3c:
            android.media.AudioTrack$Builder r0 = com.google.android.gms.internal.ads.On.c(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioTrack r0 = r0.build()     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            goto L8c
        L45:
            r0 = move-exception
        L46:
            r8 = r0
            goto Laa
        L48:
            r0 = move-exception
            goto L46
        L4a:
            r1 = 21
            if (r0 < r1) goto L66
            android.media.AudioTrack r1 = new android.media.AudioTrack     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            com.google.android.gms.internal.ads.Xj r0 = r13.a()     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            java.lang.Object r0 = r0.f7687p     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioAttributes r0 = (android.media.AudioAttributes) r0     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            android.media.AudioFormat r3 = com.google.android.gms.internal.ads.AbstractC0751is.x(r4, r3, r2)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r4 = r12.f10686h     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            r5 = 1
            r6 = r14
            r2 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
        L64:
            r0 = r1
            goto L8c
        L66:
            r13.getClass()     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            if (r14 != 0) goto L7b
            android.media.AudioTrack r1 = new android.media.AudioTrack     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r3 = r12.f10683e     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r4 = r12.f10684f     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r5 = r12.f10685g     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r6 = r12.f10686h     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            r7 = 1
            r2 = 3
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            goto L64
        L7b:
            android.media.AudioTrack r1 = new android.media.AudioTrack     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r3 = r12.f10683e     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r4 = r12.f10684f     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r5 = r12.f10685g     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            int r6 = r12.f10686h     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            r7 = 1
            r2 = 3
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.UnsupportedOperationException -> L48
            goto L64
        L8c:
            int r2 = r0.getState()
            if (r2 != r11) goto L93
            return r0
        L93:
            r0.release()     // Catch: java.lang.Exception -> L96
        L96:
            com.google.android.gms.internal.ads.iD r1 = new com.google.android.gms.internal.ads.iD
            if (r9 != r11) goto L9c
            r7 = r11
            goto L9d
        L9c:
            r7 = r10
        L9d:
            r8 = 0
            int r3 = r12.f10683e
            int r4 = r12.f10684f
            int r5 = r12.f10686h
            com.google.android.gms.internal.ads.o2 r6 = r12.f10681a
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            throw r1
        Laa:
            com.google.android.gms.internal.ads.iD r1 = new com.google.android.gms.internal.ads.iD
            if (r9 != r11) goto Lb0
            r7 = r11
            goto Lb1
        Lb0:
            r7 = r10
        Lb1:
            r2 = 0
            int r3 = r12.f10683e
            int r4 = r12.f10684f
            int r5 = r12.f10686h
            com.google.android.gms.internal.ads.o2 r6 = r12.f10681a
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1201tD.a(com.google.android.gms.internal.ads.gC, int):android.media.AudioTrack");
    }
}
