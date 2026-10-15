package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352Vc {

    /* renamed from: b, reason: collision with root package name */
    public long f7262b;

    /* renamed from: a, reason: collision with root package name */
    public final long f7261a = TimeUnit.MILLISECONDS.toNanos(((Long) O1.r.d.c.a(AbstractC1066q6.f10303x)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, C0337Sc c0337Sc) {
        if (c0337Sc == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.c) {
            long j4 = timestamp - this.f7262b;
            if (Math.abs(j4) < this.f7261a) {
                return;
            }
        }
        this.c = false;
        this.f7262b = timestamp;
        Q1.N.f1668k.post(new D3(11, c0337Sc));
    }
}
