package x2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y0 extends AbstractC1717a {
    public static final Parcelable.Creator<Y0> CREATOR = new C2067d(3);

    /* renamed from: o, reason: collision with root package name */
    public final int f15507o;

    /* renamed from: p, reason: collision with root package name */
    public final String f15508p;

    /* renamed from: q, reason: collision with root package name */
    public final long f15509q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f15510r;

    /* renamed from: s, reason: collision with root package name */
    public final String f15511s;

    /* renamed from: t, reason: collision with root package name */
    public final String f15512t;

    /* renamed from: u, reason: collision with root package name */
    public final Double f15513u;

    public Y0(int i4, String str, long j4, Long l4, Float f4, String str2, String str3, Double d) {
        this.f15507o = i4;
        this.f15508p = str;
        this.f15509q = j4;
        this.f15510r = l4;
        if (i4 == 1) {
            this.f15513u = f4 != null ? Double.valueOf(f4.doubleValue()) : null;
        } else {
            this.f15513u = d;
        }
        this.f15511s = str2;
        this.f15512t = str3;
    }

    public Y0(long j4, Object obj, String str, String str2) {
        h2.y.e(str);
        this.f15507o = 2;
        this.f15508p = str;
        this.f15509q = j4;
        this.f15512t = str2;
        if (obj == null) {
            this.f15510r = null;
            this.f15513u = null;
            this.f15511s = null;
            return;
        }
        if (obj instanceof Long) {
            this.f15510r = (Long) obj;
            this.f15513u = null;
            this.f15511s = null;
        } else if (obj instanceof String) {
            this.f15510r = null;
            this.f15513u = null;
            this.f15511s = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f15510r = null;
            this.f15513u = (Double) obj;
            this.f15511s = null;
        }
    }

    public Y0(Z0 z02) {
        this(z02.d, z02.f15520e, z02.c, z02.f15519b);
    }

    public final Object h() {
        Long l4 = this.f15510r;
        if (l4 != null) {
            return l4;
        }
        Double d = this.f15513u;
        if (d != null) {
            return d;
        }
        String str = this.f15511s;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        C2067d.b(this, parcel);
    }
}
