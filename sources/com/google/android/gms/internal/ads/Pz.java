package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pz extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    public Iterator f6617o;

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f6618p;

    /* renamed from: q, reason: collision with root package name */
    public int f6619q;

    /* renamed from: r, reason: collision with root package name */
    public int f6620r;

    /* renamed from: s, reason: collision with root package name */
    public int f6621s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6622t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f6623u;

    /* renamed from: v, reason: collision with root package name */
    public int f6624v;

    /* renamed from: w, reason: collision with root package name */
    public long f6625w;

    public final void a(int i4) {
        int i5 = this.f6621s + i4;
        this.f6621s = i5;
        if (i5 == this.f6618p.limit()) {
            b();
        }
    }

    public final boolean b() {
        this.f6620r++;
        Iterator it = this.f6617o;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f6618p = byteBuffer;
        this.f6621s = byteBuffer.position();
        if (this.f6618p.hasArray()) {
            this.f6622t = true;
            this.f6623u = this.f6618p.array();
            this.f6624v = this.f6618p.arrayOffset();
        } else {
            this.f6622t = false;
            this.f6625w = BA.g(this.f6618p);
            this.f6623u = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f6620r == this.f6619q) {
            return -1;
        }
        if (this.f6622t) {
            int i4 = this.f6623u[this.f6621s + this.f6624v] & 255;
            a(1);
            return i4;
        }
        int R02 = BA.c.R0(this.f6621s + this.f6625w) & 255;
        a(1);
        return R02;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        if (this.f6620r == this.f6619q) {
            return -1;
        }
        int limit = this.f6618p.limit();
        int i6 = this.f6621s;
        int i7 = limit - i6;
        if (i5 > i7) {
            i5 = i7;
        }
        if (this.f6622t) {
            System.arraycopy(this.f6623u, i6 + this.f6624v, bArr, i4, i5);
            a(i5);
            return i5;
        }
        int position = this.f6618p.position();
        this.f6618p.position(this.f6621s);
        this.f6618p.get(bArr, i4, i5);
        this.f6618p.position(position);
        a(i5);
        return i5;
    }
}
