package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143rz extends IOException {
    public /* synthetic */ C1143rz(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143rz(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i4) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i4) {
            case 2:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                return;
            case 3:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                return;
            default:
                return;
        }
    }
}
