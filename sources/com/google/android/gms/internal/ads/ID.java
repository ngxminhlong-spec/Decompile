package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class ID {

    /* renamed from: h, reason: collision with root package name */
    public static final ID f5556h = new ID(1, 2, 3, -1, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f5557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5558b;
    public final int c;
    public final byte[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5559e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5560f;

    /* renamed from: g, reason: collision with root package name */
    public int f5561g;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public ID(int i4, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f5557a = i4;
        this.f5558b = i5;
        this.c = i6;
        this.d = bArr;
        this.f5559e = i7;
        this.f5560f = i8;
    }

    public static int a(int i4) {
        if (i4 == 1) {
            return 1;
        }
        if (i4 != 9) {
            return (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i4) {
        if (i4 == 1) {
            return 3;
        }
        if (i4 == 4) {
            return 10;
        }
        if (i4 == 13) {
            return 2;
        }
        if (i4 == 16) {
            return 6;
        }
        if (i4 != 18) {
            return (i4 == 6 || i4 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String c(int i4) {
        return i4 != -1 ? i4 != 10 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ID.class == obj.getClass()) {
            ID id = (ID) obj;
            if (this.f5557a == id.f5557a && this.f5558b == id.f5558b && this.c == id.c && Arrays.equals(this.d, id.d) && this.f5559e == id.f5559e && this.f5560f == id.f5560f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f5561g;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = ((((Arrays.hashCode(this.d) + ((((((this.f5557a + 527) * 31) + this.f5558b) * 31) + this.c) * 31)) * 31) + this.f5559e) * 31) + this.f5560f;
        this.f5561g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        String str2 = "NA";
        int i4 = this.f5559e;
        if (i4 != -1) {
            str = i4 + "bit Luma";
        } else {
            str = "NA";
        }
        int i5 = this.f5560f;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        boolean z4 = this.d != null;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        int i6 = this.f5557a;
        sb.append(i6 != -1 ? i6 != 6 ? i6 != 1 ? i6 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space");
        sb.append(", ");
        int i7 = this.f5558b;
        sb.append(i7 != -1 ? i7 != 1 ? i7 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range");
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(z4);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        return n0.a.j(sb, str2, ")");
    }
}
