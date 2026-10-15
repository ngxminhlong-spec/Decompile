package Q1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int T4 = com.google.android.gms.internal.play_billing.B.T(parcel);
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < T4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
            } else if (c != 2) {
                com.google.android.gms.internal.play_billing.B.S(parcel, readInt);
            } else {
                i4 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
            }
        }
        com.google.android.gms.internal.play_billing.B.u(parcel, T4);
        return new C0117p(str, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0117p[i4];
    }
}
