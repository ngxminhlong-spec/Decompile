package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0886lz implements Iterable, Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final C0800jz f9510p = new C0800jz(Mz.f6293b);

    /* renamed from: o, reason: collision with root package name */
    public int f9511o = 0;

    static {
        int i4 = AbstractC0502cz.f8431a;
    }

    public static C0800jz A(byte[] bArr, int i4, int i5) {
        x(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new C0800jz(bArr2);
    }

    public static void B(int i4, int i5) {
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 >= 0) {
                throw new ArrayIndexOutOfBoundsException(U.a.g(i4, i5, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(U.a.i("Index < 0: ", i4));
        }
    }

    public static AbstractC0886lz k(Iterator it, int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(U.a.h(i4, "length (", ") must be >= 1"));
        }
        if (i4 == 1) {
            return (AbstractC0886lz) it.next();
        }
        int i5 = i4 >>> 1;
        AbstractC0886lz k3 = k(it, i5);
        AbstractC0886lz k4 = k(it, i4 - i5);
        if (Integer.MAX_VALUE - k3.l() < k4.l()) {
            throw new IllegalArgumentException(U.a.g(k3.l(), k4.l(), "ByteString would be too long: ", "+"));
        }
        if (k4.l() == 0) {
            return k3;
        }
        if (k3.l() == 0) {
            return k4;
        }
        int l4 = k4.l() + k3.l();
        if (l4 < 128) {
            int l5 = k3.l();
            int l6 = k4.l();
            int i6 = l5 + l6;
            byte[] bArr = new byte[i6];
            x(0, l5, k3.l());
            x(0, l5, i6);
            if (l5 > 0) {
                k3.n(0, 0, l5, bArr);
            }
            x(0, l6, k4.l());
            x(l5, i6, i6);
            if (l6 > 0) {
                k4.n(0, l5, l6, bArr);
            }
            return new C0800jz(bArr);
        }
        if (k3 instanceof C0941nA) {
            C0941nA c0941nA = (C0941nA) k3;
            AbstractC0886lz abstractC0886lz = c0941nA.f9720r;
            AbstractC0886lz abstractC0886lz2 = c0941nA.f9721s;
            if (k4.l() + abstractC0886lz2.l() < 128) {
                int l7 = abstractC0886lz2.l();
                int l8 = k4.l();
                int i7 = l7 + l8;
                byte[] bArr2 = new byte[i7];
                x(0, l7, abstractC0886lz2.l());
                x(0, l7, i7);
                if (l7 > 0) {
                    abstractC0886lz2.n(0, 0, l7, bArr2);
                }
                x(0, l8, k4.l());
                x(l7, i7, i7);
                if (l8 > 0) {
                    k4.n(0, l7, l8, bArr2);
                }
                return new C0941nA(abstractC0886lz, new C0800jz(bArr2));
            }
            if (abstractC0886lz.o() > abstractC0886lz2.o() && c0941nA.f9723u > k4.o()) {
                return new C0941nA(abstractC0886lz, new C0941nA(abstractC0886lz2, k4));
            }
        }
        if (l4 >= C0941nA.C(Math.max(k3.o(), k4.o()) + 1)) {
            return new C0941nA(k3, k4);
        }
        Xj xj = new Xj(24);
        xj.v(k3);
        xj.v(k4);
        ArrayDeque arrayDeque = (ArrayDeque) xj.f7687p;
        AbstractC0886lz abstractC0886lz3 = (AbstractC0886lz) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            abstractC0886lz3 = new C0941nA((AbstractC0886lz) arrayDeque.pop(), abstractC0886lz3);
        }
        return abstractC0886lz3;
    }

    public static int x(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(U.a.h(i4, "Beginning index: ", " < 0"));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(U.a.g(i4, i5, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(U.a.g(i5, i6, "End index: ", " >= "));
    }

    public static AbstractC0886lz z(ArrayList arrayList) {
        int size;
        if (U.a.q(arrayList)) {
            size = arrayList.size();
        } else {
            int size2 = arrayList.size();
            size = 0;
            int i4 = 0;
            while (i4 < size2) {
                arrayList.get(i4);
                i4++;
                size++;
            }
        }
        return size == 0 ? f9510p : k(arrayList.iterator(), size);
    }

    public abstract boolean equals(Object obj);

    public final byte[] h() {
        int l4 = l();
        if (l4 == 0) {
            return Mz.f6293b;
        }
        byte[] bArr = new byte[l4];
        n(0, 0, l4, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i4 = this.f9511o;
        if (i4 == 0) {
            int l4 = l();
            i4 = q(l4, 0, l4);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f9511o = i4;
        }
        return i4;
    }

    public abstract byte i(int i4);

    public abstract byte j(int i4);

    public abstract int l();

    public abstract void n(int i4, int i5, int i6, byte[] bArr);

    public abstract int o();

    public abstract boolean p();

    public abstract int q(int i4, int i5, int i6);

    public abstract int r(int i4, int i5, int i6);

    public abstract AbstractC0886lz s(int i4, int i5);

    public abstract AbstractC1012ow t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int l4 = l();
        String c = l() <= 50 ? AbstractC0587ez.c(this) : AbstractC0587ez.c(s(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(l4);
        sb.append(" contents=\"");
        return n0.a.j(sb, c, "\">");
    }

    public abstract String u(Charset charset);

    public abstract void v(AbstractC1229tz abstractC1229tz);

    public abstract boolean w();

    @Override // java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Tt iterator() {
        return new C0673gz(this);
    }
}
