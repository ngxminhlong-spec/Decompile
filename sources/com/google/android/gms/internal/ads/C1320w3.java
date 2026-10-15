package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.util.JsonWriter;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1320w3 implements InterfaceC1378xc {

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f11110o;

    public C1320w3(int i4, byte[] bArr) {
        switch (i4) {
            case 1:
                this.f11110o = bArr;
                return;
            default:
                this.f11110o = new byte[256];
                for (int i5 = 0; i5 < 256; i5++) {
                    this.f11110o[i5] = (byte) i5;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < 256; i7++) {
                    byte[] bArr2 = this.f11110o;
                    byte b4 = bArr2[i7];
                    i6 = (i6 + b4 + bArr[i7 % bArr.length]) & 255;
                    bArr2[i7] = bArr2[i6];
                    bArr2[i6] = b4;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1378xc
    public void d(JsonWriter jsonWriter) {
        Object obj = C1421yc.f11357b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = this.f11110o;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String n4 = C1335wc.n(encodeToString, "MD5");
            if (n4 != null) {
                jsonWriter.name("bodydigest").value(n4);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }
}
