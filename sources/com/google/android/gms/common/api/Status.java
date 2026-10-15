package com.google.android.gms.common.api;

import U.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.Qw;
import d3.AbstractC1654b;
import e2.C1664b;
import e2.l;
import h2.y;
import i2.AbstractC1717a;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Status extends AbstractC1717a implements ReflectedParcelable {

    /* renamed from: o, reason: collision with root package name */
    public final int f3898o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3899p;

    /* renamed from: q, reason: collision with root package name */
    public final PendingIntent f3900q;

    /* renamed from: r, reason: collision with root package name */
    public final C1664b f3901r;

    /* renamed from: s, reason: collision with root package name */
    public static final Status f3895s = new Status(8, null, null, null);

    /* renamed from: t, reason: collision with root package name */
    public static final Status f3896t = new Status(15, null, null, null);

    /* renamed from: u, reason: collision with root package name */
    public static final Status f3897u = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new l(3);

    public Status(int i4, String str, PendingIntent pendingIntent, C1664b c1664b) {
        this.f3898o = i4;
        this.f3899p = str;
        this.f3900q = pendingIntent;
        this.f3901r = c1664b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f3898o == status.f3898o && y.m(this.f3899p, status.f3899p) && y.m(this.f3900q, status.f3900q) && y.m(this.f3901r, status.f3901r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3898o), this.f3899p, this.f3900q, this.f3901r});
    }

    public final String toString() {
        Qw qw = new Qw(this);
        String str = this.f3899p;
        if (str == null) {
            int i4 = this.f3898o;
            switch (i4) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = a.i("unknown status code: ", i4);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        qw.s(str, "statusCode");
        qw.s(this.f3900q, "resolution");
        return qw.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f3898o);
        AbstractC1654b.V(parcel, 2, this.f3899p);
        AbstractC1654b.U(parcel, 3, this.f3900q, i4);
        AbstractC1654b.U(parcel, 4, this.f3901r, i4);
        AbstractC1654b.e0(parcel, a02);
    }
}
