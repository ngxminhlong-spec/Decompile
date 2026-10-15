package h2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends AbstractC1717a {
    public static final Parcelable.Creator<l> CREATOR = new e2.l(8);

    /* renamed from: o, reason: collision with root package name */
    public final int f13219o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13220p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13221q;

    /* renamed from: r, reason: collision with root package name */
    public final int f13222r;

    /* renamed from: s, reason: collision with root package name */
    public final int f13223s;

    public l(int i4, boolean z4, boolean z5, int i5, int i6) {
        this.f13219o = i4;
        this.f13220p = z4;
        this.f13221q = z5;
        this.f13222r = i5;
        this.f13223s = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f13219o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f13220p ? 1 : 0);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f13221q ? 1 : 0);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f13222r);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f13223s);
        AbstractC1654b.e0(parcel, a02);
    }
}
