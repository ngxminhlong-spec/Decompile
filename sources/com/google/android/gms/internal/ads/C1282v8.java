package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import e2.C1664b;
import h2.InterfaceC1704c;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282v8 implements InterfaceC1704c, InterfaceC0282Hc, InterfaceC0481ce, InterfaceC0570ei {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0272Fc f10996o;

    public /* synthetic */ C1282v8(C0272Fc c0272Fc) {
        this.f10996o = c0272Fc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public void F(String str, int i4, String str2, boolean z4) {
        C0272Fc c0272Fc = this.f10996o;
        if (z4) {
            c0272Fc.b(null);
            return;
        }
        c0272Fc.c(new Exception("Ad Web View failed to load. Error code: " + i4 + ", Description: " + str + ", Failing URL: " + str2));
    }

    @Override // h2.InterfaceC1704c
    public void a0(C1664b c1664b) {
        this.f10996o.c(new RuntimeException("Connection failed."));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
        C0272Fc c0272Fc = this.f10996o;
        try {
            C2033d c2033d = N1.n.f1204A.f1206b;
            C2033d.m(context, (AdOverlayInfoParcel) c0272Fc.f5017o.get(), true);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0282Hc, com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        this.f10996o.b((InterfaceC0385a9) obj);
    }
}
