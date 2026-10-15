package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1239u8 extends AbstractBinderC1149s4 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0272Fc f10781o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1239u8(C0272Fc c0272Fc) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f10781o = c0272Fc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC1192t4.a(parcel, ParcelFileDescriptor.CREATOR);
        AbstractC1192t4.b(parcel);
        this.f10781o.b(parcelFileDescriptor);
        return true;
    }
}
