package h2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends AbstractC1717a {
    public static final Parcelable.Creator<m> CREATOR = new e2.l(4);

    /* renamed from: o, reason: collision with root package name */
    public final int f13224o;

    /* renamed from: p, reason: collision with root package name */
    public List f13225p;

    public m(int i4, List list) {
        this.f13224o = i4;
        this.f13225p = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f13224o);
        AbstractC1654b.Z(parcel, 2, this.f13225p);
        AbstractC1654b.e0(parcel, a02);
    }
}
