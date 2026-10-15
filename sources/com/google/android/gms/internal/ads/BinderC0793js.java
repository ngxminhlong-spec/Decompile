package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0793js extends AbstractBinderC1149s4 {

    /* renamed from: o, reason: collision with root package name */
    public final x0.f f9223o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0836ks f9224p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0793js(C0836ks c0836ks, x0.f fVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f9224p = c0836ks;
        this.f9223o = fVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        C1308vs c1308vs;
        if (i4 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
        AbstractC1192t4.b(parcel);
        int i5 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        if (string == null) {
            string = null;
        }
        this.f9223o.A(new C0580es(string, i5));
        if (i5 == 8157 && (c1308vs = this.f9224p.f9327a) != null) {
            C0836ks.c.g("unbind LMD display overlay service", new Object[0]);
            c1308vs.a().post(new C1179ss(0, c1308vs));
        }
        return true;
    }
}
