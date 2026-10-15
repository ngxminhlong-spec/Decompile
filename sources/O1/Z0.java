package O1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z0 extends AbstractC1717a {
    public static final Parcelable.Creator<Z0> CREATOR = new C0066h0(10);

    /* renamed from: o, reason: collision with root package name */
    public final String f1337o;

    /* renamed from: p, reason: collision with root package name */
    public long f1338p;

    /* renamed from: q, reason: collision with root package name */
    public C0101z0 f1339q;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f1340r;

    /* renamed from: s, reason: collision with root package name */
    public final String f1341s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1342t;

    /* renamed from: u, reason: collision with root package name */
    public final String f1343u;

    /* renamed from: v, reason: collision with root package name */
    public final String f1344v;

    public Z0(String str, long j4, C0101z0 c0101z0, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f1337o = str;
        this.f1338p = j4;
        this.f1339q = c0101z0;
        this.f1340r = bundle;
        this.f1341s = str2;
        this.f1342t = str3;
        this.f1343u = str4;
        this.f1344v = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f1337o);
        long j4 = this.f1338p;
        AbstractC1654b.f0(parcel, 2, 8);
        parcel.writeLong(j4);
        AbstractC1654b.U(parcel, 3, this.f1339q, i4);
        AbstractC1654b.R(parcel, 4, this.f1340r);
        AbstractC1654b.V(parcel, 5, this.f1341s);
        AbstractC1654b.V(parcel, 6, this.f1342t);
        AbstractC1654b.V(parcel, 7, this.f1343u);
        AbstractC1654b.V(parcel, 8, this.f1344v);
        AbstractC1654b.e0(parcel, a02);
    }
}
