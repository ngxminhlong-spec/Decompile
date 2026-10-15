package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f12267a;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.play_billing.x0, java.lang.Object] */
    static {
        if (AbstractC1645w0.f12257e && AbstractC1645w0.d) {
            int i4 = AbstractC1633q.f12240a;
        }
        f12267a = new Object();
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i4, int i5) {
        int i6 = i5 - i4;
        byte b4 = bArr[i4 - 1];
        if (i6 == 0) {
            if (b4 <= -12) {
                return b4;
            }
            return -1;
        }
        if (i6 == 1) {
            byte b5 = bArr[i4];
            if (b4 > -12 || b5 > -65) {
                return -1;
            }
            return (b5 << 8) ^ b4;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b6 = bArr[i4];
        byte b7 = bArr[i4 + 1];
        if (b4 > -12 || b6 > -65 || b7 > -65) {
            return -1;
        }
        return (b7 << 16) ^ ((b6 << 8) ^ b4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.z0.b(java.lang.String, byte[], int, int):int");
    }

    public static int c(String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) < 65536) {
                                throw new y0(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i4;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }
}
