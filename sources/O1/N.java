package O1;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N extends AbstractC1717a {
    public static final Parcelable.Creator<N> CREATOR = new C0066h0(0);

    /* renamed from: o, reason: collision with root package name */
    public final String f1282o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1283p;

    public N(String str, String str2) {
        this.f1282o = str;
        this.f1283p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f1282o);
        AbstractC1654b.V(parcel, 2, this.f1283p);
        AbstractC1654b.e0(parcel, a02);
    }
}
