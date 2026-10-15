package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694hd implements Px {

    /* renamed from: o, reason: collision with root package name */
    public final Context f8939o;

    /* renamed from: p, reason: collision with root package name */
    public final C1071qB f8940p;

    /* renamed from: q, reason: collision with root package name */
    public final String f8941q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8942r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f8943s;

    /* renamed from: t, reason: collision with root package name */
    public InputStream f8944t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8945u;

    /* renamed from: v, reason: collision with root package name */
    public Uri f8946v;

    /* renamed from: w, reason: collision with root package name */
    public volatile C0509d5 f8947w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8948x = false;
    public boolean y = false;

    /* renamed from: z, reason: collision with root package name */
    public C0757iz f8949z;

    public C0694hd(Context context, C1071qB c1071qB, String str, int i4) {
        this.f8939o = context;
        this.f8940p = c1071qB;
        this.f8941q = str;
        this.f8942r = i4;
        new AtomicLong(-1L);
        this.f8943s = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final /* synthetic */ Map a() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void b(NB nb) {
    }

    public final boolean c() {
        if (!this.f8943s) {
            return false;
        }
        C0937n6 c0937n6 = AbstractC1066q6.f10126K3;
        O1.r rVar = O1.r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue() || this.f8948x) {
            return ((Boolean) rVar.c.a(AbstractC1066q6.f10131L3)).booleanValue() && !this.y;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Uri e() {
        return this.f8946v;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void i() {
        if (!this.f8945u) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f8945u = false;
        this.f8946v = null;
        InputStream inputStream = this.f8944t;
        if (inputStream == null) {
            this.f8940p.i();
        } else {
            AbstractC1799b.c(inputStream);
            this.f8944t = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final long o(C0757iz c0757iz) {
        Long l4;
        if (this.f8945u) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f8945u = true;
        Uri uri = c0757iz.f9104a;
        this.f8946v = uri;
        this.f8949z = c0757iz;
        this.f8947w = C0509d5.h(uri);
        C0937n6 c0937n6 = AbstractC1066q6.H3;
        O1.r rVar = O1.r.d;
        C0424b5 c0424b5 = null;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            if (this.f8947w != null) {
                this.f8947w.f8458v = c0757iz.d;
                this.f8947w.f8459w = Bs.O(this.f8941q);
                this.f8947w.f8460x = this.f8942r;
                c0424b5 = N1.n.f1204A.f1211i.j(this.f8947w);
            }
            if (c0424b5 != null && c0424b5.k()) {
                this.f8948x = c0424b5.n();
                this.y = c0424b5.l();
                if (!c()) {
                    this.f8944t = c0424b5.i();
                    return -1L;
                }
            }
        } else if (this.f8947w != null) {
            this.f8947w.f8458v = c0757iz.d;
            this.f8947w.f8459w = Bs.O(this.f8941q);
            this.f8947w.f8460x = this.f8942r;
            if (this.f8947w.f8457u) {
                l4 = (Long) rVar.c.a(AbstractC1066q6.f10122J3);
            } else {
                l4 = (Long) rVar.c.a(AbstractC1066q6.f10118I3);
            }
            long longValue = l4.longValue();
            N1.n.f1204A.f1212j.getClass();
            SystemClock.elapsedRealtime();
            C0594f5 k3 = C1016p.k(this.f8939o, this.f8947w);
            try {
                try {
                    try {
                        C0680h5 c0680h5 = (C0680h5) k3.f5017o.get(longValue, TimeUnit.MILLISECONDS);
                        c0680h5.getClass();
                        this.f8948x = c0680h5.c;
                        this.y = c0680h5.f8922e;
                        if (!c()) {
                            this.f8944t = c0680h5.f8920a;
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        k3.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    k3.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            N1.n.f1204A.f1212j.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f8947w != null) {
            this.f8949z = new C0757iz(Uri.parse(this.f8947w.f8451o), c0757iz.c, c0757iz.d, c0757iz.f9106e, c0757iz.f9107f);
        }
        return this.f8940p.o(this.f8949z);
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        if (!this.f8945u) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f8944t;
        return inputStream != null ? inputStream.read(bArr, i4, i5) : this.f8940p.r(bArr, i4, i5);
    }
}
