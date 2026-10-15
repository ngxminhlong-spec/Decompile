package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1028pB implements V2 {

    /* renamed from: v, reason: collision with root package name */
    public static final AbstractC0587ez f9911v = AbstractC0587ez.k(AbstractC1028pB.class);

    /* renamed from: o, reason: collision with root package name */
    public final String f9912o;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f9915r;

    /* renamed from: s, reason: collision with root package name */
    public long f9916s;

    /* renamed from: u, reason: collision with root package name */
    public C0737id f9918u;

    /* renamed from: t, reason: collision with root package name */
    public long f9917t = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9914q = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9913p = true;

    public AbstractC1028pB(String str) {
        this.f9912o = str;
    }

    @Override // com.google.android.gms.internal.ads.V2
    public final void a(C0737id c0737id, ByteBuffer byteBuffer, long j4, S2 s22) {
        this.f9916s = c0737id.b();
        byteBuffer.remaining();
        this.f9917t = j4;
        this.f9918u = c0737id;
        c0737id.f9044o.position((int) (c0737id.b() + j4));
        this.f9914q = false;
        this.f9913p = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f9914q) {
                return;
            }
            try {
                AbstractC0587ez abstractC0587ez = f9911v;
                String str = this.f9912o;
                abstractC0587ez.g(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                C0737id c0737id = this.f9918u;
                long j4 = this.f9916s;
                long j5 = this.f9917t;
                ByteBuffer byteBuffer = c0737id.f9044o;
                int position = byteBuffer.position();
                byteBuffer.position((int) j4);
                ByteBuffer slice = byteBuffer.slice();
                slice.limit((int) j5);
                byteBuffer.position(position);
                this.f9915r = slice;
                this.f9914q = true;
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            AbstractC0587ez abstractC0587ez = f9911v;
            String str = this.f9912o;
            abstractC0587ez.g(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f9915r;
            if (byteBuffer != null) {
                this.f9913p = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f9915r = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
