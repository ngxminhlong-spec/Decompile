package O1;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G0 extends AbstractC1717a {
    public static final Parcelable.Creator<G0> CREATOR = new C0066h0(2);

    /* renamed from: o, reason: collision with root package name */
    public final int f1275o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1276p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1277q;

    public G0(int i4, int i5, String str) {
        this.f1275o = i4;
        this.f1276p = i5;
        this.f1277q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f1275o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f1276p);
        AbstractC1654b.V(parcel, 3, this.f1277q);
        AbstractC1654b.e0(parcel, a02);
    }
}
