package e2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.Qw;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends AbstractC1717a {
    public static final Parcelable.Creator<d> CREATOR = new l(0);

    /* renamed from: o, reason: collision with root package name */
    public final String f12749o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12750p;

    /* renamed from: q, reason: collision with root package name */
    public final long f12751q;

    public d(int i4, long j4, String str) {
        this.f12749o = str;
        this.f12750p = i4;
        this.f12751q = j4;
    }

    public d(String str) {
        this.f12749o = str;
        this.f12751q = 1L;
        this.f12750p = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f12749o;
            String str2 = this.f12749o;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && h() == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final long h() {
        long j4 = this.f12751q;
        return j4 == -1 ? this.f12750p : j4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12749o, Long.valueOf(h())});
    }

    public final String toString() {
        Qw qw = new Qw(this);
        qw.s(this.f12749o, "name");
        qw.s(Long.valueOf(h()), "version");
        return qw.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f12749o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f12750p);
        long h4 = h();
        AbstractC1654b.f0(parcel, 3, 8);
        parcel.writeLong(h4);
        AbstractC1654b.e0(parcel, a02);
    }
}
