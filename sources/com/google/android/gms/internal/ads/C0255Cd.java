package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import c3.InterfaceFutureC0239a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255Cd extends AbstractC1398xw {

    /* renamed from: A, reason: collision with root package name */
    public volatile C0509d5 f4446A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4447B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4448C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4449D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4450E;

    /* renamed from: F, reason: collision with root package name */
    public long f4451F;

    /* renamed from: G, reason: collision with root package name */
    public InterfaceFutureC0239a f4452G;

    /* renamed from: H, reason: collision with root package name */
    public final AtomicLong f4453H;

    /* renamed from: I, reason: collision with root package name */
    public final M3 f4454I;

    /* renamed from: s, reason: collision with root package name */
    public final Context f4455s;

    /* renamed from: t, reason: collision with root package name */
    public final Px f4456t;

    /* renamed from: u, reason: collision with root package name */
    public final String f4457u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4458v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4459w;

    /* renamed from: x, reason: collision with root package name */
    public InputStream f4460x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public Uri f4461z;

    public C0255Cd(Context context, Px px, String str, int i4, NB nb, M3 m32) {
        super(false);
        this.f4455s = context;
        this.f4456t = px;
        this.f4454I = m32;
        this.f4457u = str;
        this.f4458v = i4;
        this.f4447B = false;
        this.f4448C = false;
        this.f4449D = false;
        this.f4450E = false;
        this.f4451F = 0L;
        this.f4453H = new AtomicLong(-1L);
        this.f4452G = null;
        this.f4459w = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue();
        b(nb);
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Uri e() {
        return this.f4461z;
    }

    public final long h() {
        if (this.f4446A != null) {
            if (this.f4453H.get() != -1) {
                return this.f4453H.get();
            }
            synchronized (this) {
                try {
                    if (this.f4452G == null) {
                        this.f4452G = AbstractC0266Ec.f4897a.b(new CallableC0336Sb(3, this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f4452G.isDone()) {
                try {
                    this.f4453H.compareAndSet(-1L, ((Long) this.f4452G.get()).longValue());
                    return this.f4453H.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void i() {
        if (!this.y) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.y = false;
        this.f4461z = null;
        boolean z4 = (this.f4459w && this.f4460x == null) ? false : true;
        InputStream inputStream = this.f4460x;
        if (inputStream != null) {
            AbstractC1799b.c(inputStream);
            this.f4460x = null;
        } else {
            this.f4456t.i();
        }
        if (z4) {
            c();
        }
    }

    public final boolean k() {
        if (!this.f4459w) {
            return false;
        }
        C0937n6 c0937n6 = AbstractC1066q6.f10126K3;
        O1.r rVar = O1.r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue() || this.f4449D) {
            return ((Boolean) rVar.c.a(AbstractC1066q6.f10131L3)).booleanValue() && !this.f4450E;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.google.android.gms.internal.ads.Px
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(com.google.android.gms.internal.ads.C0757iz r15) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0255Cd.o(com.google.android.gms.internal.ads.iz):long");
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        if (!this.y) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f4460x;
        int read = inputStream != null ? inputStream.read(bArr, i4, i5) : this.f4456t.r(bArr, i4, i5);
        if (this.f4459w && this.f4460x == null) {
            return read;
        }
        v(read);
        return read;
    }
}
