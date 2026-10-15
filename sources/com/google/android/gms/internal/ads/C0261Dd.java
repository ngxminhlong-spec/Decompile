package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261Dd implements Px {

    /* renamed from: o, reason: collision with root package name */
    public final Mw f4624o;

    /* renamed from: p, reason: collision with root package name */
    public final long f4625p;

    /* renamed from: q, reason: collision with root package name */
    public final Px f4626q;

    /* renamed from: r, reason: collision with root package name */
    public long f4627r;

    /* renamed from: s, reason: collision with root package name */
    public Uri f4628s;

    public C0261Dd(Mw mw, int i4, Px px) {
        this.f4624o = mw;
        this.f4625p = i4;
        this.f4626q = px;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Map a() {
        return Lt.f6175u;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void b(NB nb) {
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Uri e() {
        return this.f4628s;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void i() {
        this.f4624o.i();
        this.f4626q.i();
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final long o(C0757iz c0757iz) {
        C0757iz c0757iz2;
        C0757iz c0757iz3;
        Uri uri = c0757iz.f9104a;
        long j4 = c0757iz.f9106e;
        long j5 = c0757iz.d;
        this.f4628s = uri;
        long j6 = this.f4625p;
        if (j5 >= j6) {
            c0757iz2 = null;
        } else {
            long j7 = j6 - j5;
            if (j4 != -1) {
                j7 = Math.min(j4, j7);
            }
            c0757iz2 = new C0757iz(c0757iz.f9104a, j5, j5, j7, 0);
        }
        if (j4 == -1 || j5 + j4 > j6) {
            long max = Math.max(j6, j5);
            c0757iz3 = new C0757iz(c0757iz.f9104a, max, max, j4 != -1 ? Math.min(j4, (j5 + j4) - j6) : -1L, 0);
        } else {
            c0757iz3 = null;
        }
        long o4 = c0757iz2 != null ? this.f4624o.o(c0757iz2) : 0L;
        long o5 = c0757iz3 != null ? this.f4626q.o(c0757iz3) : 0L;
        this.f4627r = j5;
        if (o4 == -1 || o5 == -1) {
            return -1L;
        }
        return o4 + o5;
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        int i6;
        long j4 = this.f4627r;
        long j5 = this.f4625p;
        if (j4 < j5) {
            int r4 = this.f4624o.r(bArr, i4, (int) Math.min(i5, j5 - j4));
            long j6 = this.f4627r + r4;
            this.f4627r = j6;
            i6 = r4;
            j4 = j6;
        } else {
            i6 = 0;
        }
        if (j4 < j5) {
            return i6;
        }
        int r5 = this.f4626q.r(bArr, i4 + i6, i5 - i6);
        int i7 = i6 + r5;
        this.f4627r += r5;
        return i7;
    }
}
