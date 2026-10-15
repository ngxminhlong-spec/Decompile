package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L2 extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    public final long f6117o;

    /* renamed from: p, reason: collision with root package name */
    public long f6118p;

    public L2(BufferedInputStream bufferedInputStream, long j4) {
        super(bufferedInputStream);
        this.f6117o = j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f6118p++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int read = super.read(bArr, i4, i5);
        if (read != -1) {
            this.f6118p += read;
        }
        return read;
    }
}
