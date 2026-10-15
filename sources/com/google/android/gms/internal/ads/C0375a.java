package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8068a;

    public /* synthetic */ C0375a(int i4) {
        this.f8068a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8068a) {
            case 0:
                return new N(parcel);
            case 1:
                return new C1445z(parcel);
            case 2:
                return new C1231u0(parcel);
            case 3:
                return new C1274v0(parcel);
            case 4:
                return new C1317w0(parcel);
            case 5:
                return new C1360x0(parcel);
            case 6:
                return new C1403y0(parcel);
            case 7:
                return new C1446z0(parcel);
            case 8:
                return new A0(parcel);
            case 9:
                return new B0(parcel);
            case 10:
                return new C0(parcel);
            case 11:
                return new D0(parcel);
            case 12:
                return new G0(parcel);
            case 13:
                return new H0(parcel);
            case 14:
                return new I0(parcel);
            case 15:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new J0(readString, readString2, AbstractC1137rt.s(createStringArray));
            case 16:
                return new K0(parcel);
            case 17:
                return new L0(parcel);
            case 18:
                return new M0(parcel);
            case 19:
                return new C1317w0(parcel);
            case 20:
                int T4 = com.google.android.gms.internal.play_billing.B.T(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                long j4 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < T4) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    } else if (c == 3) {
                        z4 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                    } else if (c == 4) {
                        z5 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                    } else if (c == 5) {
                        j4 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt);
                    } else if (c != 6) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt);
                    } else {
                        z6 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T4);
                return new C0424b5(parcelFileDescriptor, z4, z5, j4, z6);
            case 21:
                int T5 = com.google.android.gms.internal.play_billing.B.T(parcel);
                boolean z7 = false;
                int i4 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Bundle bundle = null;
                String str5 = null;
                long j5 = 0;
                long j6 = 0;
                while (parcel.dataPosition() < T5) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str = com.google.android.gms.internal.play_billing.B.q(parcel, readInt2);
                            break;
                        case 3:
                            j5 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt2);
                            break;
                        case 4:
                            str2 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt2);
                            break;
                        case 5:
                            str3 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt2);
                            break;
                        case 6:
                            str4 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt2);
                            break;
                        case 7:
                            bundle = com.google.android.gms.internal.play_billing.B.i(parcel, readInt2);
                            break;
                        case '\b':
                            z7 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt2);
                            break;
                        case '\t':
                            j6 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt2);
                            break;
                        case '\n':
                            str5 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt2);
                            break;
                        case 11:
                            i4 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt2);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt2);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T5);
                return new C0509d5(str, j5, str2, str3, str4, bundle, z7, j6, str5, i4);
            case 22:
                int T6 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i5 = 0;
                boolean z8 = false;
                int i6 = 0;
                boolean z9 = false;
                int i7 = 0;
                boolean z10 = false;
                int i8 = 0;
                int i9 = 0;
                boolean z11 = false;
                int i10 = 0;
                O1.R0 r02 = null;
                while (parcel.dataPosition() < T6) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i5 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                            break;
                        case 2:
                            z8 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt3);
                            break;
                        case 3:
                            i6 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                            break;
                        case 4:
                            z9 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt3);
                            break;
                        case 5:
                            i7 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                            break;
                        case 6:
                            r02 = (O1.R0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt3, O1.R0.CREATOR);
                            break;
                        case 7:
                            z10 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt3);
                            break;
                        case '\b':
                            i8 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                            break;
                        case '\t':
                            i9 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                            break;
                        case '\n':
                            z11 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt3);
                            break;
                        case 11:
                            i10 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt3);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T6);
                return new C0766j7(i5, z8, i6, z9, i7, r02, z10, i8, i9, z11, i10);
            case 23:
                int T7 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str6 = null;
                String[] strArr = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < T7) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        str6 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt4);
                    } else if (c2 == 2) {
                        strArr = com.google.android.gms.internal.play_billing.B.r(parcel, readInt4);
                    } else if (c2 != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt4);
                    } else {
                        strArr2 = com.google.android.gms.internal.play_billing.B.r(parcel, readInt4);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T7);
                return new C1110r8(str6, strArr, strArr2);
            case 24:
                int T8 = com.google.android.gms.internal.play_billing.B.T(parcel);
                long j7 = 0;
                boolean z12 = false;
                int i11 = 0;
                boolean z13 = false;
                String str7 = null;
                byte[] bArr = null;
                String[] strArr3 = null;
                String[] strArr4 = null;
                while (parcel.dataPosition() < T8) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            z12 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt5);
                            break;
                        case 2:
                            str7 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt5);
                            break;
                        case 3:
                            i11 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt5);
                            break;
                        case 4:
                            bArr = com.google.android.gms.internal.play_billing.B.j(parcel, readInt5);
                            break;
                        case 5:
                            strArr3 = com.google.android.gms.internal.play_billing.B.r(parcel, readInt5);
                            break;
                        case 6:
                            strArr4 = com.google.android.gms.internal.play_billing.B.r(parcel, readInt5);
                            break;
                        case 7:
                            z13 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt5);
                            break;
                        case '\b':
                            j7 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt5);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt5);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T8);
                return new C1153s8(z12, str7, i11, bArr, strArr3, strArr4, z13, j7);
            case 25:
                int T9 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str8 = null;
                boolean z14 = false;
                int i12 = 0;
                String str9 = null;
                while (parcel.dataPosition() < T9) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        str8 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt6);
                    } else if (c4 == 2) {
                        z14 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt6);
                    } else if (c4 == 3) {
                        i12 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt6);
                    } else if (c4 != 4) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt6);
                    } else {
                        str9 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt6);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T9);
                return new C1325w8(str8, i12, str9, z14);
            case 26:
                int T10 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str10 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < T10) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        str10 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt7);
                    } else if (c5 != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt7);
                    } else {
                        bundle2 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt7);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T10);
                return new B8(bundle2, str10);
            case 27:
                int T11 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i13 = 0;
                int i14 = 0;
                String str11 = null;
                int i15 = 0;
                while (parcel.dataPosition() < T11) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        i15 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                    } else if (c6 == 2) {
                        str11 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                    } else if (c6 == 3) {
                        i14 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                    } else if (c6 != 1000) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt8);
                    } else {
                        i13 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T11);
                return new C8(i13, i15, str11, i14);
            case 28:
                int T12 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < T12) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        i16 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt9);
                    } else if (c7 == 2) {
                        i17 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt9);
                    } else if (c7 != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt9);
                    } else {
                        i18 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt9);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T12);
                return new C0435ba(i16, i17, i18);
            default:
                int T13 = com.google.android.gms.internal.play_billing.B.T(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < T13) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 1) {
                        iBinder = com.google.android.gms.internal.play_billing.B.I(parcel, readInt10);
                    } else if (c8 != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt10);
                    } else {
                        iBinder2 = com.google.android.gms.internal.play_billing.B.I(parcel, readInt10);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T13);
                return new C0264Ea(iBinder, iBinder2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f8068a) {
            case 0:
                return new N[i4];
            case 1:
                return new C1445z[i4];
            case 2:
                return new C1231u0[i4];
            case 3:
                return new C1274v0[i4];
            case 4:
                return new C1317w0[i4];
            case 5:
                return new C1360x0[i4];
            case 6:
                return new C1403y0[i4];
            case 7:
                return new C1446z0[i4];
            case 8:
                return new A0[i4];
            case 9:
                return new B0[i4];
            case 10:
                return new C0[i4];
            case 11:
                return new D0[i4];
            case 12:
                return new G0[i4];
            case 13:
                return new H0[i4];
            case 14:
                return new I0[i4];
            case 15:
                return new J0[i4];
            case 16:
                return new K0[i4];
            case 17:
                return new L0[i4];
            case 18:
                return new M0[i4];
            case 19:
                return new N0[i4];
            case 20:
                return new C0424b5[i4];
            case 21:
                return new C0509d5[i4];
            case 22:
                return new C0766j7[i4];
            case 23:
                return new C1110r8[i4];
            case 24:
                return new C1153s8[i4];
            case 25:
                return new C1325w8[i4];
            case 26:
                return new B8[i4];
            case 27:
                return new C8[i4];
            case 28:
                return new C0435ba[i4];
            default:
                return new C0264Ea[i4];
        }
    }
}
