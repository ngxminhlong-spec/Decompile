package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858lD {

    /* renamed from: a, reason: collision with root package name */
    public final C1019p2 f9426a;

    /* renamed from: b, reason: collision with root package name */
    public int f9427b;
    public long c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f9428e;

    /* renamed from: f, reason: collision with root package name */
    public long f9429f;

    public C0858lD(AudioTrack audioTrack) {
        int i4 = AbstractC0751is.f9071a;
        this.f9426a = new C1019p2(audioTrack);
        a(0);
    }

    public final void a(int i4) {
        this.f9427b = i4;
        long j4 = 10000;
        if (i4 == 0) {
            this.f9428e = 0L;
            this.f9429f = -1L;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i4 == 1) {
                this.d = 10000L;
                return;
            }
            j4 = (i4 == 2 || i4 == 3) ? 10000000L : 500000L;
        }
        this.d = j4;
    }
}
