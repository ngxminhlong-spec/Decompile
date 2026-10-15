package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class RB extends AbstractC0505d1 {
    public C0976o2 c;
    public final PB d = new PB();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f6791e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6792f;

    /* renamed from: g, reason: collision with root package name */
    public long f6793g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f6794h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6795i;

    static {
        AbstractC0861la.a("media3.decoder");
    }

    public RB(int i4) {
        this.f6795i = i4;
    }

    public void d() {
        this.f8436b = 0;
        ByteBuffer byteBuffer = this.f6791e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f6794h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f6792f = false;
    }

    public final void e(int i4) {
        ByteBuffer byteBuffer = this.f6791e;
        if (byteBuffer == null) {
            this.f6791e = g(i4);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i5 = i4 + position;
        if (capacity >= i5) {
            this.f6791e = byteBuffer;
            return;
        }
        ByteBuffer g4 = g(i5);
        g4.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            g4.put(byteBuffer);
        }
        this.f6791e = g4;
    }

    public final void f() {
        ByteBuffer byteBuffer = this.f6791e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f6794h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer g(int i4) {
        int i5 = this.f6795i;
        if (i5 == 1) {
            return ByteBuffer.allocate(i4);
        }
        if (i5 == 2) {
            return ByteBuffer.allocateDirect(i4);
        }
        ByteBuffer byteBuffer = this.f6791e;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i4 + ")");
    }
}
