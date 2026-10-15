package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Vt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7307a = 0;

    static {
        new OutputStream();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i4) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        int length = bArr.length;
        if (length == i4) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i4);
        int i5 = i4 - length;
        while (i5 > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(i5, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i4 - i5, min);
            i5 -= min;
        }
        return copyOf;
    }
}
