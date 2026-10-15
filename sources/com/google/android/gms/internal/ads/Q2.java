package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q2 extends ByteArrayOutputStream {

    /* renamed from: o, reason: collision with root package name */
    public final J2 f6637o;

    public Q2(J2 j22, int i4) {
        this.f6637o = j22;
        ((ByteArrayOutputStream) this).buf = j22.g(Math.max(i4, 256));
    }

    public final void a(int i4) {
        int i5 = ((ByteArrayOutputStream) this).count;
        if (i5 + i4 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i6 = i5 + i4;
        J2 j22 = this.f6637o;
        byte[] g4 = j22.g(i6 + i6);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, g4, 0, ((ByteArrayOutputStream) this).count);
        j22.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = g4;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6637o.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f6637o.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i4) {
        a(1);
        super.write(i4);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i4, int i5) {
        a(i5);
        super.write(bArr, i4, i5);
    }
}
