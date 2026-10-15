package com.google.android.gms.internal.ads;

import O1.C0093v0;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295Ka implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6023a;

    public /* synthetic */ C0295Ka(int i4) {
        this.f6023a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6023a) {
            case 0:
                int T4 = com.google.android.gms.internal.play_billing.B.T(parcel);
                float f4 = 0.0f;
                float f5 = 0.0f;
                long j4 = 0;
                long j5 = 0;
                int i4 = 0;
                Bundle bundle = null;
                O1.U0 u02 = null;
                O1.X0 x02 = null;
                String str = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                C0248Bc c0248Bc = null;
                Bundle bundle2 = null;
                int i5 = 0;
                ArrayList arrayList = null;
                Bundle bundle3 = null;
                boolean z4 = false;
                int i6 = 0;
                int i7 = 0;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                C0766j7 c0766j7 = null;
                ArrayList arrayList3 = null;
                String str8 = null;
                boolean z5 = false;
                int i8 = 0;
                int i9 = 0;
                boolean z6 = false;
                String str9 = null;
                String str10 = null;
                boolean z7 = false;
                int i10 = 0;
                Bundle bundle4 = null;
                String str11 = null;
                C0093v0 c0093v0 = null;
                boolean z8 = false;
                Bundle bundle5 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                boolean z9 = false;
                ArrayList arrayList4 = null;
                String str15 = null;
                ArrayList arrayList5 = null;
                int i11 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                ArrayList arrayList6 = null;
                String str16 = null;
                C8 c8 = null;
                String str17 = null;
                Bundle bundle6 = null;
                while (parcel.dataPosition() < T4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i4 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case 2:
                            bundle = com.google.android.gms.internal.play_billing.B.i(parcel, readInt);
                            break;
                        case 3:
                            u02 = (O1.U0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, O1.U0.CREATOR);
                            break;
                        case 4:
                            x02 = (O1.X0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, O1.X0.CREATOR);
                            break;
                        case 5:
                            str = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            str2 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '\t':
                            str3 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '\n':
                            str4 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case 11:
                            c0248Bc = (C0248Bc) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, C0248Bc.CREATOR);
                            break;
                        case '\f':
                            bundle2 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt);
                            break;
                        case '\r':
                            i5 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case 14:
                            arrayList = com.google.android.gms.internal.play_billing.B.s(parcel, readInt);
                            break;
                        case 15:
                            bundle3 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt);
                            break;
                        case 16:
                            z4 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case '&':
                        case '>':
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt);
                            break;
                        case 18:
                            i6 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case 19:
                            i7 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case 20:
                            com.google.android.gms.internal.play_billing.B.Z(parcel, readInt, 4);
                            f4 = parcel.readFloat();
                            break;
                        case 21:
                            str5 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case 25:
                            j4 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt);
                            break;
                        case 26:
                            str6 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case 27:
                            arrayList2 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt);
                            break;
                        case 28:
                            str7 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case 29:
                            c0766j7 = (C0766j7) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, C0766j7.CREATOR);
                            break;
                        case 30:
                            arrayList3 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt);
                            break;
                        case 31:
                            j5 = com.google.android.gms.internal.play_billing.B.K(parcel, readInt);
                            break;
                        case '!':
                            str8 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '\"':
                            com.google.android.gms.internal.play_billing.B.Z(parcel, readInt, 4);
                            f5 = parcel.readFloat();
                            break;
                        case '#':
                            i8 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case '$':
                            i9 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case '%':
                            z6 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case '\'':
                            str9 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '(':
                            z5 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case ')':
                            str10 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '*':
                            z7 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case '+':
                            i10 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case ',':
                            bundle4 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt);
                            break;
                        case '-':
                            str11 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '.':
                            c0093v0 = (C0093v0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, C0093v0.CREATOR);
                            break;
                        case '/':
                            z8 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case '0':
                            bundle5 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt);
                            break;
                        case '1':
                            str12 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '2':
                            str13 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '3':
                            str14 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '4':
                            z9 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case '5':
                            int L4 = com.google.android.gms.internal.play_billing.B.L(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (L4 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList arrayList7 = new ArrayList();
                                int readInt2 = parcel.readInt();
                                for (int i12 = 0; i12 < readInt2; i12++) {
                                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(dataPosition + L4);
                                arrayList4 = arrayList7;
                                break;
                            }
                        case '6':
                            str15 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '7':
                            arrayList5 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt);
                            break;
                        case '8':
                            i11 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt);
                            break;
                        case '9':
                            z10 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case ':':
                            z11 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case ';':
                            z12 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt);
                            break;
                        case '<':
                            arrayList6 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt);
                            break;
                        case '=':
                            str16 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case '?':
                            c8 = (C8) com.google.android.gms.internal.play_billing.B.p(parcel, readInt, C8.CREATOR);
                            break;
                        case '@':
                            str17 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt);
                            break;
                        case 'A':
                            bundle6 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T4);
                return new C0290Ja(i4, bundle, u02, x02, str, applicationInfo, packageInfo, str2, str3, str4, c0248Bc, bundle2, i5, arrayList, bundle3, z4, i6, i7, f4, str5, j4, str6, arrayList2, str7, c0766j7, arrayList3, j5, str8, f5, z5, i8, i9, z6, str9, str10, z7, i10, bundle4, str11, c0093v0, z8, bundle5, str12, str13, str14, z9, arrayList4, str15, arrayList5, i11, z10, z11, z12, arrayList6, str16, c8, str17, bundle6);
            case 1:
                int T5 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i13 = 0;
                boolean z13 = false;
                boolean z14 = false;
                ApplicationInfo applicationInfo2 = null;
                String str18 = null;
                PackageInfo packageInfo2 = null;
                String str19 = null;
                String str20 = null;
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < T5) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            applicationInfo2 = (ApplicationInfo) com.google.android.gms.internal.play_billing.B.p(parcel, readInt3, ApplicationInfo.CREATOR);
                            break;
                        case 2:
                            str18 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt3);
                            break;
                        case 3:
                            packageInfo2 = (PackageInfo) com.google.android.gms.internal.play_billing.B.p(parcel, readInt3, PackageInfo.CREATOR);
                            break;
                        case 4:
                            str19 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt3);
                            break;
                        case 5:
                            i13 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt3);
                            break;
                        case 6:
                            str20 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt3);
                            break;
                        case 7:
                            arrayList8 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt3);
                            break;
                        case '\b':
                            z13 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt3);
                            break;
                        case '\t':
                            z14 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt3);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt3);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T5);
                return new C0305Ma(applicationInfo2, str18, packageInfo2, str19, i13, str20, arrayList8, z13, z14);
            case 2:
                int T6 = com.google.android.gms.internal.play_billing.B.T(parcel);
                ArrayList arrayList9 = null;
                boolean z15 = false;
                while (parcel.dataPosition() < T6) {
                    int readInt4 = parcel.readInt();
                    char c = (char) readInt4;
                    if (c == 2) {
                        z15 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt4);
                    } else if (c != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt4);
                    } else {
                        arrayList9 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt4);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T6);
                return new C0310Na(arrayList9, z15);
            case 3:
                int T7 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str21 = null;
                Bundle bundle7 = null;
                byte[] bArr = null;
                String str22 = null;
                String str23 = null;
                int i14 = 0;
                boolean z16 = false;
                while (parcel.dataPosition() < T7) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str21 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt5);
                            break;
                        case 2:
                            i14 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt5);
                            break;
                        case 3:
                            bundle7 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt5);
                            break;
                        case 4:
                            bArr = com.google.android.gms.internal.play_billing.B.j(parcel, readInt5);
                            break;
                        case 5:
                            z16 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt5);
                            break;
                        case 6:
                            str22 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt5);
                            break;
                        case 7:
                            str23 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt5);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt5);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T7);
                return new C0315Oa(str21, i14, bundle7, bArr, z16, str22, str23);
            case 4:
                int T8 = com.google.android.gms.internal.play_billing.B.T(parcel);
                boolean z17 = false;
                boolean z18 = false;
                Bundle bundle8 = null;
                C0248Bc c0248Bc2 = null;
                ApplicationInfo applicationInfo3 = null;
                String str24 = null;
                ArrayList arrayList10 = null;
                PackageInfo packageInfo3 = null;
                String str25 = null;
                String str26 = null;
                Xp xp = null;
                String str27 = null;
                while (parcel.dataPosition() < T8) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            bundle8 = com.google.android.gms.internal.play_billing.B.i(parcel, readInt6);
                            break;
                        case 2:
                            c0248Bc2 = (C0248Bc) com.google.android.gms.internal.play_billing.B.p(parcel, readInt6, C0248Bc.CREATOR);
                            break;
                        case 3:
                            applicationInfo3 = (ApplicationInfo) com.google.android.gms.internal.play_billing.B.p(parcel, readInt6, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            str24 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt6);
                            break;
                        case 5:
                            arrayList10 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt6);
                            break;
                        case 6:
                            packageInfo3 = (PackageInfo) com.google.android.gms.internal.play_billing.B.p(parcel, readInt6, PackageInfo.CREATOR);
                            break;
                        case 7:
                            str25 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt6);
                            break;
                        case '\b':
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt6);
                            break;
                        case '\t':
                            str26 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt6);
                            break;
                        case '\n':
                            xp = (Xp) com.google.android.gms.internal.play_billing.B.p(parcel, readInt6, Xp.CREATOR);
                            break;
                        case 11:
                            str27 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt6);
                            break;
                        case '\f':
                            z17 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt6);
                            break;
                        case '\r':
                            z18 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt6);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T8);
                return new C0370Za(bundle8, c0248Bc2, applicationInfo3, str24, arrayList10, packageInfo3, str25, str26, xp, str27, z17, z18);
            case 5:
                int T9 = com.google.android.gms.internal.play_billing.B.T(parcel);
                O1.U0 u03 = null;
                String str28 = null;
                while (parcel.dataPosition() < T9) {
                    int readInt7 = parcel.readInt();
                    char c2 = (char) readInt7;
                    if (c2 == 2) {
                        u03 = (O1.U0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt7, O1.U0.CREATOR);
                    } else if (c2 != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt7);
                    } else {
                        str28 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt7);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T9);
                return new C0776jb(u03, str28);
            case 6:
                int T10 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i15 = 0;
                String str29 = null;
                while (parcel.dataPosition() < T10) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 2) {
                        str29 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt8);
                    } else if (c4 != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt8);
                    } else {
                        i15 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt8);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T10);
                return new C0948nb(str29, i15);
            case 7:
                int T11 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str30 = null;
                String str31 = null;
                while (parcel.dataPosition() < T11) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 1) {
                        str30 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt9);
                    } else if (c5 != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt9);
                    } else {
                        str31 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt9);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T11);
                return new C0259Db(str30, str31);
            case 8:
                int T12 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str32 = null;
                String str33 = null;
                ArrayList arrayList11 = null;
                ArrayList arrayList12 = null;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                while (parcel.dataPosition() < T12) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str32 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt10);
                            break;
                        case 3:
                            str33 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt10);
                            break;
                        case 4:
                            z19 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt10);
                            break;
                        case 5:
                            z20 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt10);
                            break;
                        case 6:
                            arrayList11 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt10);
                            break;
                        case 7:
                            z21 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt10);
                            break;
                        case '\b':
                            z22 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt10);
                            break;
                        case '\t':
                            arrayList12 = com.google.android.gms.internal.play_billing.B.s(parcel, readInt10);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt10);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T12);
                return new C0296Kb(str32, str33, z19, z20, arrayList11, z21, z22, arrayList12);
            case 9:
                return new C1120rc(parcel);
            case 10:
                int T13 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str34 = null;
                String str35 = null;
                O1.X0 x03 = null;
                O1.U0 u04 = null;
                while (parcel.dataPosition() < T13) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        str34 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt11);
                    } else if (c6 == 2) {
                        str35 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt11);
                    } else if (c6 == 3) {
                        x03 = (O1.X0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt11, O1.X0.CREATOR);
                    } else if (c6 != 4) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt11);
                    } else {
                        u04 = (O1.U0) com.google.android.gms.internal.play_billing.B.p(parcel, readInt11, O1.U0.CREATOR);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T13);
                return new C0820kc(str34, str35, x03, u04);
            case 11:
                int T14 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i16 = 0;
                int i17 = 0;
                boolean z23 = false;
                boolean z24 = false;
                String str36 = null;
                while (parcel.dataPosition() < T14) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 2) {
                        str36 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt12);
                    } else if (c7 == 3) {
                        i16 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt12);
                    } else if (c7 == 4) {
                        i17 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt12);
                    } else if (c7 == 5) {
                        z23 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt12);
                    } else if (c7 != 6) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt12);
                    } else {
                        z24 = com.google.android.gms.internal.play_billing.B.H(parcel, readInt12);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T14);
                return new C0248Bc(str36, i16, i17, z23, z24);
            case 12:
                int T15 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                String str37 = null;
                while (parcel.dataPosition() < T15) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            i18 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt13);
                            break;
                        case 2:
                            i19 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt13);
                            break;
                        case 3:
                            i20 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt13);
                            break;
                        case 4:
                            i21 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt13);
                            break;
                        case 5:
                            str37 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt13);
                            break;
                        case 6:
                            i22 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt13);
                            break;
                        case 7:
                            i23 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt13);
                            break;
                        default:
                            com.google.android.gms.internal.play_billing.B.S(parcel, readInt13);
                            break;
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T15);
                return new Xp(i18, i19, i20, i21, str37, i22, i23);
            case 13:
                int T16 = com.google.android.gms.internal.play_billing.B.T(parcel);
                byte[] bArr2 = null;
                int i24 = 0;
                while (parcel.dataPosition() < T16) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        i24 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt14);
                    } else if (c9 != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt14);
                    } else {
                        bArr2 = com.google.android.gms.internal.play_billing.B.j(parcel, readInt14);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T16);
                return new Er(i24, bArr2);
            case 14:
                int T17 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str38 = null;
                int i25 = 0;
                String str39 = null;
                while (parcel.dataPosition() < T17) {
                    int readInt15 = parcel.readInt();
                    char c10 = (char) readInt15;
                    if (c10 == 1) {
                        i25 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt15);
                    } else if (c10 == 2) {
                        str38 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt15);
                    } else if (c10 != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt15);
                    } else {
                        str39 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt15);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T17);
                return new Gr(i25, str38, str39);
            case 15:
                int T18 = com.google.android.gms.internal.play_billing.B.T(parcel);
                byte[] bArr3 = null;
                int i26 = 0;
                while (parcel.dataPosition() < T18) {
                    int readInt16 = parcel.readInt();
                    char c11 = (char) readInt16;
                    if (c11 == 1) {
                        i26 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt16);
                    } else if (c11 != 2) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt16);
                    } else {
                        bArr3 = com.google.android.gms.internal.play_billing.B.j(parcel, readInt16);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T18);
                return new Hr(i26, bArr3);
            case 16:
                int T19 = com.google.android.gms.internal.play_billing.B.T(parcel);
                String str40 = null;
                String str41 = null;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < T19) {
                    int readInt17 = parcel.readInt();
                    char c12 = (char) readInt17;
                    if (c12 == 1) {
                        i27 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt17);
                    } else if (c12 == 2) {
                        i28 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt17);
                    } else if (c12 == 3) {
                        str40 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt17);
                    } else if (c12 == 4) {
                        str41 = com.google.android.gms.internal.play_billing.B.q(parcel, readInt17);
                    } else if (c12 != 5) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt17);
                    } else {
                        i29 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt17);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T19);
                return new Jr(i27, i28, i29, str40, str41);
            case 17:
                int T20 = com.google.android.gms.internal.play_billing.B.T(parcel);
                int i30 = 0;
                byte[] bArr4 = null;
                int i31 = 0;
                while (parcel.dataPosition() < T20) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        i30 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt18);
                    } else if (c13 == 2) {
                        bArr4 = com.google.android.gms.internal.play_billing.B.j(parcel, readInt18);
                    } else if (c13 != 3) {
                        com.google.android.gms.internal.play_billing.B.S(parcel, readInt18);
                    } else {
                        i31 = com.google.android.gms.internal.play_billing.B.J(parcel, readInt18);
                    }
                }
                com.google.android.gms.internal.play_billing.B.u(parcel, T20);
                return new Kr(bArr4, i30, i31);
            case 18:
                return new C0538dt(parcel);
            case 19:
                return new Yt(parcel);
            default:
                return new C0456bv(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f6023a) {
            case 0:
                return new C0290Ja[i4];
            case 1:
                return new C0305Ma[i4];
            case 2:
                return new C0310Na[i4];
            case 3:
                return new C0315Oa[i4];
            case 4:
                return new C0370Za[i4];
            case 5:
                return new C0776jb[i4];
            case 6:
                return new C0948nb[i4];
            case 7:
                return new C0259Db[i4];
            case 8:
                return new C0296Kb[i4];
            case 9:
                return new C1120rc[i4];
            case 10:
                return new C0820kc[i4];
            case 11:
                return new C0248Bc[i4];
            case 12:
                return new Xp[i4];
            case 13:
                return new Er[i4];
            case 14:
                return new Gr[i4];
            case 15:
                return new Hr[i4];
            case 16:
                return new Jr[i4];
            case 17:
                return new Kr[i4];
            case 18:
                return new C0538dt[i4];
            case 19:
                return new Yt[i4];
            default:
                return new C0456bv[i4];
        }
    }
}
