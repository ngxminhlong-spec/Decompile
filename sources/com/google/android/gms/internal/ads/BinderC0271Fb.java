package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0271Fb extends AbstractBinderC1149s4 implements InterfaceC1034pb {

    /* renamed from: o, reason: collision with root package name */
    public final String f5015o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5016p;

    public BinderC0271Fb(String str, int i4) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f5015o = str;
        this.f5016p = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f5015o);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f5016p);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1034pb
    public final int a() {
        return this.f5016p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1034pb
    public final String d() {
        return this.f5015o;
    }
}
