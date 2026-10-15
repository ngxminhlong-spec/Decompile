package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.measurement.C1583v1;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1638t implements Iterable, Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final C1638t f12244q = new C1638t(K.f12152b);

    /* renamed from: o, reason: collision with root package name */
    public int f12245o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f12246p;

    static {
        int i4 = AbstractC1633q.f12240a;
    }

    public C1638t(byte[] bArr) {
        bArr.getClass();
        this.f12246p = bArr;
    }

    public static int k(int i4, int i5, int i6) {
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

    public static C1638t l(byte[] bArr, int i4, int i5) {
        k(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new C1638t(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1638t) && j() == ((C1638t) obj).j()) {
            if (j() == 0) {
                return true;
            }
            if (!(obj instanceof C1638t)) {
                return obj.equals(this);
            }
            C1638t c1638t = (C1638t) obj;
            int i4 = this.f12245o;
            int i5 = c1638t.f12245o;
            if (i4 == 0 || i5 == 0 || i4 == i5) {
                int j4 = j();
                if (j4 > c1638t.j()) {
                    throw new IllegalArgumentException("Length too large: " + j4 + j());
                }
                if (j4 > c1638t.j()) {
                    throw new IllegalArgumentException(U.a.g(j4, c1638t.j(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = c1638t.f12246p;
                int i6 = 0;
                int i7 = 0;
                while (i6 < j4) {
                    if (this.f12246p[i6] == bArr[i7]) {
                        i6++;
                        i7++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte h(int i4) {
        return this.f12246p[i4];
    }

    public final int hashCode() {
        int i4 = this.f12245o;
        if (i4 != 0) {
            return i4;
        }
        int j4 = j();
        int i5 = j4;
        for (int i6 = 0; i6 < j4; i6++) {
            i5 = (i5 * 31) + this.f12246p[i6];
        }
        if (i5 == 0) {
            i5 = 1;
        }
        this.f12245o = i5;
        return i5;
    }

    public byte i(int i4) {
        return this.f12246p[i4];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1583v1(this);
    }

    public int j() {
        return this.f12246p.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int j4 = j();
        if (j() <= 50) {
            concat = AbstractC1895f.C(this);
        } else {
            int k3 = k(0, 47, j());
            concat = AbstractC1895f.C(k3 == 0 ? f12244q : new C1636s(k3, this.f12246p)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(j4);
        sb.append(" contents=\"");
        return n0.a.j(sb, concat, "\">");
    }
}
