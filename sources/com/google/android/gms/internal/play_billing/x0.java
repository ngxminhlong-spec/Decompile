package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class x0 implements I {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(byte[] bArr, int i4, int i5) {
        int i6;
        while (i4 < i5 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i5) {
            while (i4 < i5) {
                int i7 = i4 + 1;
                i6 = bArr[i4];
                if (i6 < 0) {
                    if (i6 >= -32) {
                        if (i6 >= -16) {
                            if (i7 < i5 - 2) {
                                int i8 = i4 + 2;
                                int i9 = bArr[i7];
                                if (i9 <= -65) {
                                    if ((((i9 + 112) + (i6 << 28)) >> 30) == 0) {
                                        int i10 = i4 + 3;
                                        if (bArr[i8] <= -65) {
                                            i4 += 4;
                                            if (bArr[i10] > -65) {
                                            }
                                        }
                                    }
                                }
                                i6 = -1;
                                break;
                            }
                            i6 = z0.a(bArr, i7, i5);
                            break;
                        }
                        if (i7 < i5 - 1) {
                            int i11 = i4 + 2;
                            char c = bArr[i7];
                            if (c <= -65 && ((i6 != -32 || c >= -96) && (i6 != -19 || c < -96))) {
                                i4 += 3;
                                if (bArr[i11] > -65) {
                                }
                            }
                            i6 = -1;
                            break;
                        }
                        i6 = z0.a(bArr, i7, i5);
                        break;
                    }
                    if (i7 >= i5) {
                        break;
                    }
                    if (i6 >= -62) {
                        i4 += 2;
                        if (bArr[i7] > -65) {
                        }
                    }
                    i6 = -1;
                    break;
                }
                i4 = i7;
            }
        }
        i6 = 0;
        return i6 == 0;
    }
}
