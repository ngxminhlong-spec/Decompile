package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Mp {
    public static final String a(byte[] bArr, byte[] bArr2, String str, C0572ek c0572ek) {
        C0882lv c0882lv;
        C1357wy z4;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
            try {
                z4 = C1357wy.z(byteArrayInputStream, C1315vz.f11096b);
                byteArrayInputStream.close();
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException | GeneralSecurityException e4) {
            Q1.I.w("Failed to get keysethandle".concat(e4.toString()));
            N1.n.f1204A.f1209g.h("CryptoUtils.getHandle", e4);
            c0882lv = null;
        }
        if (z4.v() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        c0882lv = new C0882lv(z4, C0882lv.B(z4));
        if (c0882lv == null) {
            return null;
        }
        try {
            byte[] a4 = ((InterfaceC0583ev) c0882lv.z()).a(bArr, bArr2);
            c0572ek.f8633a.put("ds", "1");
            return new String(a4, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e5) {
            Q1.I.w("Failed to decrypt ".concat(e5.toString()));
            N1.n.f1204A.f1209g.h("CryptoUtils.decrypt", e5);
            c0572ek.f8633a.put("dsf", e5.toString());
            return null;
        }
    }
}
