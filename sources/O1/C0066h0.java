package O1;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066h0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1358a;

    public /* synthetic */ C0066h0(int i4) {
        this.f1358a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1358a) {
            case 0:
                int T4 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < T4) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                    } else if (c != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt);
                    } else {
                        str2 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T4);
                return new N(str, str2);
            case 1:
                int T5 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i4 = 0;
                while (parcel.dataPosition() < T5) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt2);
                    } else {
                        i4 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt2);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T5);
                return new C0093v0(i4);
            case 2:
                int T6 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str3 = null;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < T6) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i5 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                    } else if (c2 == 2) {
                        i6 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                    } else if (c2 != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt3);
                    } else {
                        str3 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt3);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T6);
                return new G0(i5, i6, str3);
            case 3:
                int T7 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str4 = null;
                String str5 = null;
                C0101z0 c0101z0 = null;
                IBinder iBinder = null;
                int i7 = 0;
                while (parcel.dataPosition() < T7) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        i7 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt4);
                    } else if (c4 == 2) {
                        str4 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt4);
                    } else if (c4 == 3) {
                        str5 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt4);
                    } else if (c4 == 4) {
                        c0101z0 = (C0101z0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt4, C0101z0.CREATOR);
                    } else if (c4 != 5) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt4);
                    } else {
                        iBinder = com.google.android.gms.internal.play_billing.B.I(parcel, readInt4);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T7);
                return new C0101z0(i7, str4, str5, c0101z0, iBinder);
            case 4:
                int T8 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i8 = 0;
                int i9 = 0;
                while (parcel.dataPosition() < T8) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 1) {
                        i8 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt5);
                    } else if (c5 != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt5);
                    } else {
                        i9 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt5);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T8);
                return new P0(i8, i9);
            case 5:
                int T9 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str6 = null;
                while (parcel.dataPosition() < T9) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 15) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt6);
                    } else {
                        str6 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt6);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T9);
                return new Q0(str6);
            case 6:
                int T10 = com.google.android.gms.internal.play_billing.B.T(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                while (parcel.dataPosition() < T10) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        z4 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt7);
                    } else if (c6 == 3) {
                        z5 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt7);
                    } else if (c6 != 4) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt7);
                    } else {
                        z6 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt7);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T10);
                return new R0(z4, z5, z6);
            case 7:
                int T11 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i10 = 0;
                int i11 = 0;
                boolean z7 = false;
                int i12 = 0;
                boolean z8 = false;
                boolean z9 = false;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                Bundle bundle = null;
                ArrayList arrayList = null;
                String str7 = null;
                Q0 q02 = null;
                Location location = null;
                String str8 = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                ArrayList arrayList2 = null;
                String str9 = null;
                String str10 = null;
                N n4 = null;
                String str11 = null;
                ArrayList arrayList3 = null;
                String str12 = null;
                long j4 = 0;
                while (parcel.dataPosition() < T11) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i10 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                            break;
                        case 2:
                            j4 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt8);
                            break;
                        case 3:
                            bundle = com.google.android.gms.internal.play_billing.B.i(parcel, readInt8);
                            break;
                        case 4:
                            i11 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                            break;
                        case 5:
                            arrayList = com.google.android.gms.internal.play_billing.B.s(parcel, readInt8);
                            break;
                        case 6:
                            z7 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt8);
                            break;
                        case 7:
                            i12 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                            break;
                        case '\b':
                            z8 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt8);
                            break;
                        case '\t':
                            str7 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                            break;
                        case '\n':
                            q02 = (Q0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt8, Q0.CREATOR);
                            break;
                        case 11:
                            location = (Location) com.google.android.gms.internal.play_billing.B.p(parcel, readInt8, Location.CREATOR);
                            break;
                        case '\f':
                            str8 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                            break;
                        case '\r':
                            bundle2 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt8);
                            break;
                        case 14:
                            bundle3 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt8);
                            break;
                        case 15:
                            arrayList2 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt8);
                            break;
                        case 16:
                            str9 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                            break;
                        case 17:
                            str10 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                            break;
                        case 18:
                            z9 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt8);
                            break;
                        case 19:
                            n4 = (N) com.google.android.gms.internal.play_billing.B.p(parcel, readInt8, N.CREATOR);
                            break;
                        case 20:
                            i13 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                            break;
                        case 21:
                            str11 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                            break;
                        case 22:
                            arrayList3 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt8);
                            break;
                        case 23:
                            i14 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                            break;
                        case 24:
                            str12 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                            break;
                        case 25:
                            i15 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt8);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T11);
                return new U0(i10, j4, bundle, i11, arrayList, z7, i12, z8, str7, q02, location, str8, bundle2, bundle3, arrayList2, str9, str10, z9, n4, i13, str11, arrayList3, i14, str12, i15);
            case 8:
                int T12 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i16 = 0;
                int i17 = 0;
                boolean z10 = false;
                int i18 = 0;
                int i19 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                String str13 = null;
                X0[] x0Arr = null;
                while (parcel.dataPosition() < T12) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str13 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt9);
                            break;
                        case 3:
                            i16 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt9);
                            break;
                        case 4:
                            i17 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt9);
                            break;
                        case 5:
                            z10 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case 6:
                            i18 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt9);
                            break;
                        case 7:
                            i19 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt9);
                            break;
                        case '\b':
                            x0Arr = (X0[]) com.google.android.gms.internal.play_billing.B.t(parcel, readInt9, X0.CREATOR);
                            break;
                        case '\t':
                            z11 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case '\n':
                            z12 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case 11:
                            z13 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case '\f':
                            z14 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case '\r':
                            z15 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case 14:
                            z16 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case 15:
                            z17 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        case 16:
                            z18 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt9);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt9);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T12);
                return new X0(str13, i16, i17, z10, i18, i19, x0Arr, z11, z12, z13, z14, z15, z16, z17, z18);
            case 9:
                int T13 = com.google.android.gms.internal.play_billing.B.T(parcel);
                long j5 = 0;
                String str14 = null;
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < T13) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        i20 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt10);
                    } else if (c7 == 2) {
                        i21 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt10);
                    } else if (c7 == 3) {
                        str14 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt10);
                    } else if (c7 != 4) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt10);
                    } else {
                        j5 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt10);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T13);
                return new Y0(i20, i21, j5, str14);
            case 10:
                int T14 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str15 = null;
                C0101z0 c0101z02 = null;
                Bundle bundle4 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                long j6 = 0;
                while (parcel.dataPosition() < T14) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str15 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt11);
                            break;
                        case 2:
                            j6 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt11);
                            break;
                        case 3:
                            c0101z02 = (C0101z0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt11, C0101z0.CREATOR);
                            break;
                        case 4:
                            bundle4 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt11);
                            break;
                        case 5:
                            str16 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt11);
                            break;
                        case 6:
                            str17 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt11);
                            break;
                        case 7:
                            str18 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt11);
                            break;
                        case '\b':
                            str19 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt11);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt11);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T14);
                return new Z0(str15, j6, c0101z02, bundle4, str16, str17, str18, str19);
            default:
                int T15 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i22 = 0;
                while (parcel.dataPosition() < T15) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt12);
                    } else {
                        i22 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt12);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T15);
                return new a1(i22);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f1358a) {
            case 0:
                return new N[i4];
            case 1:
                return new C0093v0[i4];
            case 2:
                return new G0[i4];
            case 3:
                return new C0101z0[i4];
            case 4:
                return new P0[i4];
            case 5:
                return new Q0[i4];
            case 6:
                return new R0[i4];
            case 7:
                return new U0[i4];
            case 8:
                return new X0[i4];
            case 9:
                return new Y0[i4];
            case 10:
                return new Z0[i4];
            default:
                return new a1[i4];
        }
    }
}
