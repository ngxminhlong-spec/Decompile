package t3;

import java.io.OutputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2009b extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    public long f14950o;

    @Override // java.io.OutputStream
    public final void write(int i4) {
        this.f14950o++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f14950o += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        int i6;
        if (i4 < 0 || i4 > bArr.length || i5 < 0 || (i6 = i4 + i5) > bArr.length || i6 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f14950o += i5;
    }
}
