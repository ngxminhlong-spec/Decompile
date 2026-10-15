package e2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.Qw;
import d3.AbstractC1654b;
import h2.y;
import i2.AbstractC1717a;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1664b extends AbstractC1717a {

    /* renamed from: o, reason: collision with root package name */
    public final int f12742o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12743p;

    /* renamed from: q, reason: collision with root package name */
    public final PendingIntent f12744q;

    /* renamed from: r, reason: collision with root package name */
    public final String f12745r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1664b f12741s = new C1664b(0);
    public static final Parcelable.Creator<C1664b> CREATOR = new J.i(29);

    public C1664b(int i4) {
        this(1, i4, null, null);
    }

    public C1664b(int i4, int i5, PendingIntent pendingIntent, String str) {
        this.f12742o = i4;
        this.f12743p = i5;
        this.f12744q = pendingIntent;
        this.f12745r = str;
    }

    public C1664b(int i4, PendingIntent pendingIntent) {
        this(1, i4, pendingIntent, null);
    }

    public static String h(int i4) {
        if (i4 == 99) {
            return "UNFINISHED";
        }
        if (i4 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i4) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i4) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return U.a.h(i4, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1664b)) {
            return false;
        }
        C1664b c1664b = (C1664b) obj;
        return this.f12743p == c1664b.f12743p && y.m(this.f12744q, c1664b.f12744q) && y.m(this.f12745r, c1664b.f12745r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12743p), this.f12744q, this.f12745r});
    }

    public final String toString() {
        Qw qw = new Qw(this);
        qw.s(h(this.f12743p), "statusCode");
        qw.s(this.f12744q, "resolution");
        qw.s(this.f12745r, "message");
        return qw.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f12742o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f12743p);
        AbstractC1654b.U(parcel, 3, this.f12744q, i4);
        AbstractC1654b.V(parcel, 4, this.f12745r);
        AbstractC1654b.e0(parcel, a02);
    }
}
