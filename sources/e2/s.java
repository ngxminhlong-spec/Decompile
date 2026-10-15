package e2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class s extends AbstractC1717a {
    public static final Parcelable.Creator<s> CREATOR = new l(1);

    /* renamed from: o, reason: collision with root package name */
    public final boolean f12776o;

    /* renamed from: p, reason: collision with root package name */
    public final String f12777p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12778q;

    /* renamed from: r, reason: collision with root package name */
    public final int f12779r;

    public s(int i4, int i5, String str, boolean z4) {
        this.f12776o = z4;
        this.f12777p = str;
        this.f12778q = android.support.v4.media.session.a.w(i4) - 1;
        this.f12779r = AbstractC1895f.z(i5) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f12776o ? 1 : 0);
        AbstractC1654b.V(parcel, 2, this.f12777p);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f12778q);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f12779r);
        AbstractC1654b.e0(parcel, a02);
    }
}
