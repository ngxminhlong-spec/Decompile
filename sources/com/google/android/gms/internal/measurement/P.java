package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T4 = com.google.android.gms.internal.play_billing.B.T(parcel);
        long j4 = 0;
        long j5 = 0;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < T4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j4 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt);
                    break;
                case 2:
                    j5 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt);
                    break;
                case 3:
                    z4 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                    break;
                case 4:
                    str = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                    break;
                case 5:
                    str2 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                    break;
                case 6:
                    str3 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                    break;
                case 7:
                    bundle = com.google.android.gms.internal.play_billing.B.i(parcel, readInt);
                    break;
                case '\b':
                    str4 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.internal.play_billing.B.S(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.internal.play_billing.B.u(parcel, T4);
        return new O(j4, j5, z4, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new O[i4];
    }
}
