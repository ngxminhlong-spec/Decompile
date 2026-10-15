package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bv implements InterfaceC0583ev {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4207a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4208b;

    public Bv(int i4, byte[] bArr) {
        this.f4207a = i4;
        switch (i4) {
            case 2:
                this.f4208b = new C1055pw(1, bArr);
                return;
            default:
                this.f4208b = new C1055pw(0, bArr);
                return;
        }
    }

    public Bv(C0882lv c0882lv) {
        this.f4207a = 0;
        this.f4208b = c0882lv;
        if (((C1227tx) c0882lv.f9506p).f10761a.isEmpty()) {
            return;
        }
        Ew ew = (Ew) Fw.f5104b.f5105a.get();
        ew = ew == null ? Fw.c : ew;
        Bs.m(c0882lv);
        ew.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0583ev
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a4;
        switch (this.f4207a) {
            case 0:
                C0882lv c0882lv = (C0882lv) this.f4208b;
                int length = bArr.length;
                if (length > 5) {
                    byte[] copyOf = Arrays.copyOf(bArr, 5);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
                    Iterator it = c0882lv.A(copyOf).iterator();
                    while (it.hasNext()) {
                        try {
                            a4 = ((InterfaceC0583ev) ((C1097qv) it.next()).f10427b).a(copyOfRange, bArr2);
                            int length2 = copyOfRange.length;
                            return a4;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                }
                Iterator it2 = c0882lv.A(Wj.f7529F).iterator();
                while (it2.hasNext()) {
                    try {
                        a4 = ((InterfaceC0583ev) ((C1097qv) it2.next()).f10427b).a(bArr, bArr2);
                        return a4;
                    } catch (GeneralSecurityException unused2) {
                    }
                }
                throw new GeneralSecurityException("decryption failed");
            case 1:
                int length3 = bArr.length;
                if (length3 < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C1055pw) this.f4208b).l(ByteBuffer.wrap(bArr, 12, length3 - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                int length4 = bArr.length;
                if (length4 < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C1055pw) this.f4208b).l(ByteBuffer.wrap(bArr, 24, length4 - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
