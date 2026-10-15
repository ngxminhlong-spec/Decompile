package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ox, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013ox implements InterfaceC1011ov {

    /* renamed from: a, reason: collision with root package name */
    public final C0882lv f9866a;

    public C1013ox(C0882lv c0882lv) {
        this.f9866a = c0882lv;
        if (((C1227tx) c0882lv.f9506p).f10761a.isEmpty()) {
            return;
        }
        Ew ew = (Ew) Fw.f5104b.f5105a.get();
        ew = ew == null ? Fw.c : ew;
        Bs.m(c0882lv);
        ew.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1011ov
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        C0882lv c0882lv = this.f9866a;
        Iterator it = c0882lv.A(copyOf).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1011ov) ((C1097qv) it.next()).f10426a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        Iterator it2 = c0882lv.A(Wj.f7529F).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1011ov) ((C1097qv) it2.next()).f10426a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
