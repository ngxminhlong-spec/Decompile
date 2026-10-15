package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737id implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    public final ByteBuffer f9044o;

    public C0737id(ByteBuffer byteBuffer) {
        this.f9044o = byteBuffer.duplicate();
    }

    public final int a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f9044o;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long b() {
        return this.f9044o.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
