package O1;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q0 extends AbstractC1717a {
    public static final Parcelable.Creator<Q0> CREATOR = new C0066h0(5);

    /* renamed from: o, reason: collision with root package name */
    public final String f1286o;

    public Q0(String str) {
        this.f1286o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 15, this.f1286o);
        AbstractC1654b.e0(parcel, a02);
    }
}
