package b2;

import J.i;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends AbstractC1717a {
    public static final Parcelable.Creator<c> CREATOR = new i(24);

    /* renamed from: o, reason: collision with root package name */
    public final String f3493o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3494p;

    public c(String str, int i4) {
        this.f3493o = str;
        this.f3494p = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f3493o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f3494p);
        AbstractC1654b.e0(parcel, a02);
    }
}
