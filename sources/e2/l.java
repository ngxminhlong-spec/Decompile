package e2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.B;
import d3.AbstractC1654b;
import h2.C1707f;
import h2.C1708g;
import h2.C1711j;
import h2.E;
import java.util.ArrayList;
import l.C1771i;
import l.G;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12764a;

    public /* synthetic */ l(int i4) {
        this.f12764a = i4;
    }

    public static void a(C1708g c1708g, Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        int i5 = c1708g.f13195o;
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(i5);
        int i6 = c1708g.f13196p;
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(i6);
        int i7 = c1708g.f13197q;
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(i7);
        AbstractC1654b.V(parcel, 4, c1708g.f13198r);
        AbstractC1654b.T(parcel, 5, c1708g.f13199s);
        AbstractC1654b.Y(parcel, 6, c1708g.f13200t, i4);
        AbstractC1654b.R(parcel, 7, c1708g.f13201u);
        AbstractC1654b.U(parcel, 8, c1708g.f13202v, i4);
        AbstractC1654b.Y(parcel, 10, c1708g.f13203w, i4);
        AbstractC1654b.Y(parcel, 11, c1708g.f13204x, i4);
        boolean z4 = c1708g.y;
        AbstractC1654b.f0(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i8 = c1708g.f13205z;
        AbstractC1654b.f0(parcel, 13, 4);
        parcel.writeInt(i8);
        boolean z5 = c1708g.f13193A;
        AbstractC1654b.f0(parcel, 14, 4);
        parcel.writeInt(z5 ? 1 : 0);
        AbstractC1654b.V(parcel, 15, c1708g.f13194B);
        AbstractC1654b.e0(parcel, a02);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [h2.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [l.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.View$BaseSavedState, l.G, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12764a) {
            case 0:
                int T4 = B.T(parcel);
                long j4 = -1;
                int i4 = 0;
                String str = null;
                while (parcel.dataPosition() < T4) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str = B.q(parcel, readInt);
                    } else if (c == 2) {
                        i4 = B.J(parcel, readInt);
                    } else if (c != 3) {
                        B.S(parcel, readInt);
                    } else {
                        j4 = B.K(parcel, readInt);
                    }
                }
                B.u(parcel, T4);
                return new d(i4, j4, str);
            case 1:
                int T5 = B.T(parcel);
                boolean z4 = false;
                int i5 = 0;
                String str2 = null;
                int i6 = 0;
                while (parcel.dataPosition() < T5) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        z4 = B.H(parcel, readInt2);
                    } else if (c2 == 2) {
                        str2 = B.q(parcel, readInt2);
                    } else if (c2 == 3) {
                        i6 = B.J(parcel, readInt2);
                    } else if (c2 != 4) {
                        B.S(parcel, readInt2);
                    } else {
                        i5 = B.J(parcel, readInt2);
                    }
                }
                B.u(parcel, T5);
                return new s(i6, i5, str2, z4);
            case 2:
                int T6 = B.T(parcel);
                String str3 = null;
                int i7 = 0;
                while (parcel.dataPosition() < T6) {
                    int readInt3 = parcel.readInt();
                    char c4 = (char) readInt3;
                    if (c4 == 1) {
                        i7 = B.J(parcel, readInt3);
                    } else if (c4 != 2) {
                        B.S(parcel, readInt3);
                    } else {
                        str3 = B.q(parcel, readInt3);
                    }
                }
                B.u(parcel, T6);
                return new Scope(str3, i7);
            case 3:
                int T7 = B.T(parcel);
                String str4 = null;
                C1664b c1664b = null;
                int i8 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < T7) {
                    int readInt4 = parcel.readInt();
                    char c5 = (char) readInt4;
                    if (c5 == 1) {
                        i8 = B.J(parcel, readInt4);
                    } else if (c5 == 2) {
                        str4 = B.q(parcel, readInt4);
                    } else if (c5 == 3) {
                        pendingIntent = (PendingIntent) B.p(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c5 != 4) {
                        B.S(parcel, readInt4);
                    } else {
                        c1664b = (C1664b) B.p(parcel, readInt4, C1664b.CREATOR);
                    }
                }
                B.u(parcel, T7);
                return new Status(i8, str4, pendingIntent, c1664b);
            case 4:
                int T8 = B.T(parcel);
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < T8) {
                        int readInt5 = parcel.readInt();
                        char c6 = (char) readInt5;
                        if (c6 == 1) {
                            i9 = B.J(parcel, readInt5);
                        } else if (c6 != 2) {
                            B.S(parcel, readInt5);
                        } else {
                            Parcelable.Creator<C1711j> creator = C1711j.CREATOR;
                            int L4 = B.L(parcel, readInt5);
                            int dataPosition = parcel.dataPosition();
                            if (L4 == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + L4);
                        }
                    }
                    B.u(parcel, T8);
                    return new h2.m(i9, arrayList);
                    break;
                }
            case 5:
                int T9 = B.T(parcel);
                int i10 = -1;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                String str5 = null;
                String str6 = null;
                long j5 = 0;
                long j6 = 0;
                while (parcel.dataPosition() < T9) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i11 = B.J(parcel, readInt6);
                            break;
                        case 2:
                            i12 = B.J(parcel, readInt6);
                            break;
                        case 3:
                            i13 = B.J(parcel, readInt6);
                            break;
                        case 4:
                            j5 = B.K(parcel, readInt6);
                            break;
                        case 5:
                            j6 = B.K(parcel, readInt6);
                            break;
                        case 6:
                            str5 = B.q(parcel, readInt6);
                            break;
                        case 7:
                            str6 = B.q(parcel, readInt6);
                            break;
                        case '\b':
                            i14 = B.J(parcel, readInt6);
                            break;
                        case '\t':
                            i10 = B.J(parcel, readInt6);
                            break;
                        default:
                            B.S(parcel, readInt6);
                            break;
                    }
                }
                B.u(parcel, T9);
                return new C1711j(i11, i12, i13, j5, j6, str5, str6, i14, i10);
            case 6:
                int T10 = B.T(parcel);
                Account account = null;
                int i15 = 0;
                int i16 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < T10) {
                    int readInt7 = parcel.readInt();
                    char c7 = (char) readInt7;
                    if (c7 == 1) {
                        i15 = B.J(parcel, readInt7);
                    } else if (c7 == 2) {
                        account = (Account) B.p(parcel, readInt7, Account.CREATOR);
                    } else if (c7 == 3) {
                        i16 = B.J(parcel, readInt7);
                    } else if (c7 != 4) {
                        B.S(parcel, readInt7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) B.p(parcel, readInt7, GoogleSignInAccount.CREATOR);
                    }
                }
                B.u(parcel, T10);
                return new h2.q(i15, account, i16, googleSignInAccount);
            case 7:
                int T11 = B.T(parcel);
                int i17 = 0;
                boolean z5 = false;
                boolean z6 = false;
                IBinder iBinder = null;
                C1664b c1664b2 = null;
                while (parcel.dataPosition() < T11) {
                    int readInt8 = parcel.readInt();
                    char c8 = (char) readInt8;
                    if (c8 == 1) {
                        i17 = B.J(parcel, readInt8);
                    } else if (c8 == 2) {
                        iBinder = B.I(parcel, readInt8);
                    } else if (c8 == 3) {
                        c1664b2 = (C1664b) B.p(parcel, readInt8, C1664b.CREATOR);
                    } else if (c8 == 4) {
                        z5 = B.H(parcel, readInt8);
                    } else if (c8 != 5) {
                        B.S(parcel, readInt8);
                    } else {
                        z6 = B.H(parcel, readInt8);
                    }
                }
                B.u(parcel, T11);
                return new h2.r(i17, iBinder, c1664b2, z5, z6);
            case 8:
                int T12 = B.T(parcel);
                int i18 = 0;
                boolean z7 = false;
                boolean z8 = false;
                int i19 = 0;
                int i20 = 0;
                while (parcel.dataPosition() < T12) {
                    int readInt9 = parcel.readInt();
                    char c9 = (char) readInt9;
                    if (c9 == 1) {
                        i18 = B.J(parcel, readInt9);
                    } else if (c9 == 2) {
                        z7 = B.H(parcel, readInt9);
                    } else if (c9 == 3) {
                        z8 = B.H(parcel, readInt9);
                    } else if (c9 == 4) {
                        i19 = B.J(parcel, readInt9);
                    } else if (c9 != 5) {
                        B.S(parcel, readInt9);
                    } else {
                        i20 = B.J(parcel, readInt9);
                    }
                }
                B.u(parcel, T12);
                return new h2.l(i18, z7, z8, i19, i20);
            case 9:
                int T13 = B.T(parcel);
                Bundle bundle = null;
                C1707f c1707f = null;
                int i21 = 0;
                d[] dVarArr = null;
                while (parcel.dataPosition() < T13) {
                    int readInt10 = parcel.readInt();
                    char c10 = (char) readInt10;
                    if (c10 == 1) {
                        bundle = B.i(parcel, readInt10);
                    } else if (c10 == 2) {
                        dVarArr = (d[]) B.t(parcel, readInt10, d.CREATOR);
                    } else if (c10 == 3) {
                        i21 = B.J(parcel, readInt10);
                    } else if (c10 != 4) {
                        B.S(parcel, readInt10);
                    } else {
                        c1707f = (C1707f) B.p(parcel, readInt10, C1707f.CREATOR);
                    }
                }
                B.u(parcel, T13);
                ?? obj = new Object();
                obj.f13140o = bundle;
                obj.f13141p = dVarArr;
                obj.f13142q = i21;
                obj.f13143r = c1707f;
                return obj;
            case 10:
                int T14 = B.T(parcel);
                h2.l lVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z9 = false;
                boolean z10 = false;
                int i22 = 0;
                while (parcel.dataPosition() < T14) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            lVar = (h2.l) B.p(parcel, readInt11, h2.l.CREATOR);
                            break;
                        case 2:
                            z9 = B.H(parcel, readInt11);
                            break;
                        case 3:
                            z10 = B.H(parcel, readInt11);
                            break;
                        case 4:
                            int L5 = B.L(parcel, readInt11);
                            int dataPosition2 = parcel.dataPosition();
                            if (L5 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + L5);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i22 = B.J(parcel, readInt11);
                            break;
                        case 6:
                            int L6 = B.L(parcel, readInt11);
                            int dataPosition3 = parcel.dataPosition();
                            if (L6 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + L6);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            B.S(parcel, readInt11);
                            break;
                    }
                }
                B.u(parcel, T14);
                return new C1707f(lVar, z9, z10, iArr, i22, iArr2);
            case 11:
                int T15 = B.T(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = C1708g.f13191C;
                String str7 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str8 = null;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                boolean z11 = false;
                int i26 = 0;
                boolean z12 = false;
                d[] dVarArr2 = C1708g.f13192D;
                d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < T15) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i23 = B.J(parcel, readInt12);
                            break;
                        case 2:
                            i24 = B.J(parcel, readInt12);
                            break;
                        case 3:
                            i25 = B.J(parcel, readInt12);
                            break;
                        case 4:
                            str7 = B.q(parcel, readInt12);
                            break;
                        case 5:
                            iBinder2 = B.I(parcel, readInt12);
                            break;
                        case 6:
                            scopeArr = (Scope[]) B.t(parcel, readInt12, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = B.i(parcel, readInt12);
                            break;
                        case '\b':
                            account2 = (Account) B.p(parcel, readInt12, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            B.S(parcel, readInt12);
                            break;
                        case '\n':
                            dVarArr2 = (d[]) B.t(parcel, readInt12, d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (d[]) B.t(parcel, readInt12, d.CREATOR);
                            break;
                        case '\f':
                            z11 = B.H(parcel, readInt12);
                            break;
                        case '\r':
                            i26 = B.J(parcel, readInt12);
                            break;
                        case 14:
                            z12 = B.H(parcel, readInt12);
                            break;
                        case 15:
                            str8 = B.q(parcel, readInt12);
                            break;
                    }
                }
                B.u(parcel, T15);
                return new C1708g(i23, i24, i25, str7, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z11, i26, z12, str8);
            case 12:
                ?? obj2 = new Object();
                obj2.f13763o = parcel.readInt();
                return obj2;
            case 13:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f13602o = parcel.readByte() != 0;
                return baseSavedState;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                int T16 = B.T(parcel);
                Intent intent = null;
                int i27 = 0;
                int i28 = 0;
                while (parcel.dataPosition() < T16) {
                    int readInt13 = parcel.readInt();
                    char c11 = (char) readInt13;
                    if (c11 == 1) {
                        i27 = B.J(parcel, readInt13);
                    } else if (c11 == 2) {
                        i28 = B.J(parcel, readInt13);
                    } else if (c11 != 3) {
                        B.S(parcel, readInt13);
                    } else {
                        intent = (Intent) B.p(parcel, readInt13, Intent.CREATOR);
                    }
                }
                B.u(parcel, T16);
                return new z2.b(i27, i28, intent);
            case 16:
                int T17 = B.T(parcel);
                ArrayList arrayList2 = null;
                String str9 = null;
                while (parcel.dataPosition() < T17) {
                    int readInt14 = parcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 == 1) {
                        arrayList2 = B.s(parcel, readInt14);
                    } else if (c12 != 2) {
                        B.S(parcel, readInt14);
                    } else {
                        str9 = B.q(parcel, readInt14);
                    }
                }
                B.u(parcel, T17);
                return new z2.d(str9, arrayList2);
            default:
                int T18 = B.T(parcel);
                C1664b c1664b3 = null;
                int i29 = 0;
                h2.r rVar = null;
                while (parcel.dataPosition() < T18) {
                    int readInt15 = parcel.readInt();
                    char c13 = (char) readInt15;
                    if (c13 == 1) {
                        i29 = B.J(parcel, readInt15);
                    } else if (c13 == 2) {
                        c1664b3 = (C1664b) B.p(parcel, readInt15, C1664b.CREATOR);
                    } else if (c13 != 3) {
                        B.S(parcel, readInt15);
                    } else {
                        rVar = (h2.r) B.p(parcel, readInt15, h2.r.CREATOR);
                    }
                }
                B.u(parcel, T18);
                return new z2.e(i29, c1664b3, rVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f12764a) {
            case 0:
                return new d[i4];
            case 1:
                return new s[i4];
            case 2:
                return new Scope[i4];
            case 3:
                return new Status[i4];
            case 4:
                return new h2.m[i4];
            case 5:
                return new C1711j[i4];
            case 6:
                return new h2.q[i4];
            case 7:
                return new h2.r[i4];
            case 8:
                return new h2.l[i4];
            case 9:
                return new E[i4];
            case 10:
                return new C1707f[i4];
            case 11:
                return new C1708g[i4];
            case 12:
                return new C1771i[i4];
            case 13:
                return new G[i4];
            case 14:
                return new ParcelImpl[i4];
            case 15:
                return new z2.b[i4];
            case 16:
                return new z2.d[i4];
            default:
                return new z2.e[i4];
        }
    }
}
