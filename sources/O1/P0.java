package O1;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P0 extends AbstractC1717a {
    public static final Parcelable.Creator<P0> CREATOR = new C0066h0(4);

    /* renamed from: o, reason: collision with root package name */
    public final int f1284o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1285p;

    public P0(int i4, int i5) {
        this.f1284o = i4;
        this.f1285p = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f1284o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f1285p);
        AbstractC1654b.e0(parcel, a02);
    }
}
