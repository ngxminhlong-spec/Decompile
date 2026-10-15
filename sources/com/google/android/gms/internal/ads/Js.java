package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Js implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public String f5929o;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f5931q;

    /* renamed from: p, reason: collision with root package name */
    public int f5930p = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f5932r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f5933s = Integer.MAX_VALUE;

    public Js(C1384xi c1384xi, CharSequence charSequence) {
        this.f5931q = charSequence;
    }

    public abstract int a(int i4);

    public abstract int b(int i4);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int a4;
        int i4 = this.f5930p;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int i5 = i4 - 1;
        String str = null;
        if (i4 == 0) {
            throw null;
        }
        if (i5 == 0) {
            return true;
        }
        if (i5 != 2) {
            this.f5930p = 4;
            int i6 = this.f5932r;
            while (true) {
                int i7 = this.f5932r;
                if (i7 == -1) {
                    this.f5930p = 3;
                    break;
                }
                int b4 = b(i7);
                CharSequence charSequence = this.f5931q;
                if (b4 == -1) {
                    b4 = charSequence.length();
                    this.f5932r = -1;
                    a4 = -1;
                } else {
                    a4 = a(b4);
                    this.f5932r = a4;
                }
                if (a4 == i6) {
                    int i8 = a4 + 1;
                    this.f5932r = i8;
                    if (i8 > charSequence.length()) {
                        this.f5932r = -1;
                    }
                } else {
                    if (i6 < b4) {
                        charSequence.charAt(i6);
                    }
                    if (i6 < b4) {
                        charSequence.charAt(b4 - 1);
                    }
                    int i9 = this.f5933s;
                    if (i9 == 1) {
                        b4 = charSequence.length();
                        this.f5932r = -1;
                        if (b4 > i6) {
                            charSequence.charAt(b4 - 1);
                        }
                    } else {
                        this.f5933s = i9 - 1;
                    }
                    str = charSequence.subSequence(i6, b4).toString();
                }
            }
            this.f5929o = str;
            if (this.f5930p != 3) {
                this.f5930p = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5930p = 2;
        String str = this.f5929o;
        this.f5929o = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
