package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class ND extends RB {

    /* renamed from: j, reason: collision with root package name */
    public long f6311j;

    /* renamed from: k, reason: collision with root package name */
    public int f6312k;

    /* renamed from: l, reason: collision with root package name */
    public int f6313l;

    @Override // com.google.android.gms.internal.ads.RB
    public final void d() {
        super.d();
        this.f6312k = 0;
    }

    public final boolean h(RB rb) {
        ByteBuffer byteBuffer;
        Zf.O(!rb.a(1073741824));
        Zf.O(!rb.a(268435456));
        Zf.O(!rb.a(4));
        if (i()) {
            if (this.f6312k >= this.f6313l) {
                return false;
            }
            ByteBuffer byteBuffer2 = rb.f6791e;
            if (byteBuffer2 != null && (byteBuffer = this.f6791e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i4 = this.f6312k;
        this.f6312k = i4 + 1;
        if (i4 == 0) {
            this.f6793g = rb.f6793g;
            if (rb.a(1)) {
                this.f8436b = 1;
            }
        }
        ByteBuffer byteBuffer3 = rb.f6791e;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f6791e.put(byteBuffer3);
        }
        this.f6311j = rb.f6793g;
        return true;
    }

    public final boolean i() {
        return this.f6312k > 0;
    }
}
