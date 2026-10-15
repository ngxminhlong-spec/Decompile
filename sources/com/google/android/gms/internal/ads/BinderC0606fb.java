package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0606fb extends AbstractBinderC1149s4 {

    /* renamed from: o, reason: collision with root package name */
    public final String f8704o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8705p;

    public BinderC0606fb(String str, int i4) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f8704o = str;
        this.f8705p = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f8704o);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f8705p);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC0606fb)) {
            BinderC0606fb binderC0606fb = (BinderC0606fb) obj;
            if (h2.y.m(this.f8704o, binderC0606fb.f8704o)) {
                if (h2.y.m(Integer.valueOf(this.f8705p), Integer.valueOf(binderC0606fb.f8705p))) {
                    return true;
                }
            }
        }
        return false;
    }
}
