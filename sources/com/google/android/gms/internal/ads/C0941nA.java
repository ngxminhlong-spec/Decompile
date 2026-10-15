package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941nA extends AbstractC0886lz {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f9718v = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: q, reason: collision with root package name */
    public final int f9719q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0886lz f9720r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0886lz f9721s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9722t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9723u;

    public C0941nA(AbstractC0886lz abstractC0886lz, AbstractC0886lz abstractC0886lz2) {
        this.f9720r = abstractC0886lz;
        this.f9721s = abstractC0886lz2;
        int l4 = abstractC0886lz.l();
        this.f9722t = l4;
        this.f9719q = abstractC0886lz2.l() + l4;
        this.f9723u = Math.max(abstractC0886lz.o(), abstractC0886lz2.o()) + 1;
    }

    public static int C(int i4) {
        if (i4 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f9718v[i4];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0886lz) {
            AbstractC0886lz abstractC0886lz = (AbstractC0886lz) obj;
            int l4 = abstractC0886lz.l();
            int i4 = this.f9719q;
            if (i4 == l4) {
                if (i4 == 0) {
                    return true;
                }
                int i5 = this.f9511o;
                int i6 = abstractC0886lz.f9511o;
                if (i5 == 0 || i6 == 0 || i5 == i6) {
                    C0898mA c0898mA = new C0898mA(this);
                    C0800jz a4 = c0898mA.a();
                    C0898mA c0898mA2 = new C0898mA(abstractC0886lz);
                    C0800jz a5 = c0898mA2.a();
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int l5 = a4.l() - i7;
                        int l6 = a5.l() - i8;
                        int min = Math.min(l5, l6);
                        if (!(i7 == 0 ? a4.D(a5, i8, min) : a5.D(a4, i7, min))) {
                            break;
                        }
                        i9 += min;
                        if (i9 >= i4) {
                            if (i9 == i4) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == l5) {
                            a4 = c0898mA.a();
                            i7 = 0;
                        } else {
                            i7 += min;
                        }
                        if (min == l6) {
                            a5 = c0898mA2.a();
                            i8 = 0;
                        } else {
                            i8 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final byte i(int i4) {
        AbstractC0886lz.B(i4, this.f9719q);
        return j(i4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0855lA(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final byte j(int i4) {
        int i5 = this.f9722t;
        return i4 < i5 ? this.f9720r.j(i4) : this.f9721s.j(i4 - i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final int l() {
        return this.f9719q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final void n(int i4, int i5, int i6, byte[] bArr) {
        int i7 = i4 + i6;
        AbstractC0886lz abstractC0886lz = this.f9720r;
        int i8 = this.f9722t;
        if (i7 <= i8) {
            abstractC0886lz.n(i4, i5, i6, bArr);
            return;
        }
        AbstractC0886lz abstractC0886lz2 = this.f9721s;
        if (i4 >= i8) {
            abstractC0886lz2.n(i4 - i8, i5, i6, bArr);
            return;
        }
        int i9 = i8 - i4;
        abstractC0886lz.n(i4, i5, i9, bArr);
        abstractC0886lz2.n(0, i5 + i9, i6 - i9, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final int o() {
        return this.f9723u;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final boolean p() {
        return this.f9719q >= C(this.f9723u);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final int q(int i4, int i5, int i6) {
        int i7 = i5 + i6;
        AbstractC0886lz abstractC0886lz = this.f9720r;
        int i8 = this.f9722t;
        if (i7 <= i8) {
            return abstractC0886lz.q(i4, i5, i6);
        }
        AbstractC0886lz abstractC0886lz2 = this.f9721s;
        if (i5 >= i8) {
            return abstractC0886lz2.q(i4, i5 - i8, i6);
        }
        int i9 = i8 - i5;
        return abstractC0886lz2.q(abstractC0886lz.q(i4, i5, i9), 0, i6 - i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final int r(int i4, int i5, int i6) {
        int i7 = i5 + i6;
        AbstractC0886lz abstractC0886lz = this.f9720r;
        int i8 = this.f9722t;
        if (i7 <= i8) {
            return abstractC0886lz.r(i4, i5, i6);
        }
        AbstractC0886lz abstractC0886lz2 = this.f9721s;
        if (i5 >= i8) {
            return abstractC0886lz2.r(i4, i5 - i8, i6);
        }
        int i9 = i8 - i5;
        return abstractC0886lz2.r(abstractC0886lz.r(i4, i5, i9), 0, i6 - i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final AbstractC0886lz s(int i4, int i5) {
        int i6 = this.f9719q;
        int x4 = AbstractC0886lz.x(i4, i5, i6);
        if (x4 == 0) {
            return AbstractC0886lz.f9510p;
        }
        if (x4 == i6) {
            return this;
        }
        AbstractC0886lz abstractC0886lz = this.f9720r;
        int i7 = this.f9722t;
        if (i5 <= i7) {
            return abstractC0886lz.s(i4, i5);
        }
        AbstractC0886lz abstractC0886lz2 = this.f9721s;
        if (i4 < i7) {
            return new C0941nA(abstractC0886lz.s(i4, abstractC0886lz.l()), abstractC0886lz2.s(0, i5 - i7));
        }
        return abstractC0886lz2.s(i4 - i7, i5 - i7);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream, com.google.android.gms.internal.ads.Pz] */
    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final AbstractC1012ow t() {
        C0800jz c0800jz;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f9723u);
        arrayDeque.push(this);
        AbstractC0886lz abstractC0886lz = this.f9720r;
        while (abstractC0886lz instanceof C0941nA) {
            C0941nA c0941nA = (C0941nA) abstractC0886lz;
            arrayDeque.push(c0941nA);
            abstractC0886lz = c0941nA.f9720r;
        }
        C0800jz c0800jz2 = (C0800jz) abstractC0886lz;
        while (true) {
            if (!(c0800jz2 != null)) {
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    i5 += byteBuffer.remaining();
                    i4 = byteBuffer.hasArray() ? i4 | 1 : byteBuffer.isDirect() ? i4 | 2 : i4 | 4;
                }
                if (i4 == 2) {
                    return new C0972nz(i5, arrayList);
                }
                ?? inputStream = new InputStream();
                inputStream.f6617o = arrayList.iterator();
                inputStream.f6619q = 0;
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    inputStream.f6619q++;
                }
                inputStream.f6620r = -1;
                if (!inputStream.b()) {
                    inputStream.f6618p = Mz.c;
                    inputStream.f6620r = 0;
                    inputStream.f6621s = 0;
                    inputStream.f6625w = 0L;
                }
                return new C1015oz(inputStream);
            }
            if (c0800jz2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    c0800jz = null;
                    break;
                }
                AbstractC0886lz abstractC0886lz2 = ((C0941nA) arrayDeque.pop()).f9721s;
                while (abstractC0886lz2 instanceof C0941nA) {
                    C0941nA c0941nA2 = (C0941nA) abstractC0886lz2;
                    arrayDeque.push(c0941nA2);
                    abstractC0886lz2 = c0941nA2.f9720r;
                }
                c0800jz = (C0800jz) abstractC0886lz2;
                if (c0800jz.l() != 0) {
                    break;
                }
            }
            arrayList.add(ByteBuffer.wrap(c0800jz2.f9236q, c0800jz2.C(), c0800jz2.l()).asReadOnlyBuffer());
            c0800jz2 = c0800jz;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final String u(Charset charset) {
        return new String(h(), charset);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final void v(AbstractC1229tz abstractC1229tz) {
        this.f9720r.v(abstractC1229tz);
        this.f9721s.v(abstractC1229tz);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final boolean w() {
        int r4 = this.f9720r.r(0, 0, this.f9722t);
        AbstractC0886lz abstractC0886lz = this.f9721s;
        return abstractC0886lz.r(r4, 0, abstractC0886lz.l()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    /* renamed from: y */
    public final Tt iterator() {
        return new C0855lA(this);
    }
}
