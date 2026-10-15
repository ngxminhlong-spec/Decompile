package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D4 extends AbstractBinderC1149s4 implements O1.O {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f4584p = 0;

    /* renamed from: o, reason: collision with root package name */
    public final I1.b f4585o;

    public D4(I1.b bVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f4585o = bVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AbstractC1192t4.b(parcel);
        e2(readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // O1.O
    public final void e2(String str, String str2) {
        this.f4585o.B(str, str2);
    }
}
