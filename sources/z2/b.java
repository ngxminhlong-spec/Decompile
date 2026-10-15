package z2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import e2.l;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AbstractC1717a {
    public static final Parcelable.Creator<b> CREATOR = new l(15);

    /* renamed from: o, reason: collision with root package name */
    public final int f15970o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15971p;

    /* renamed from: q, reason: collision with root package name */
    public final Intent f15972q;

    public b(int i4, int i5, Intent intent) {
        this.f15970o = i4;
        this.f15971p = i5;
        this.f15972q = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f15970o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f15971p);
        AbstractC1654b.U(parcel, 3, this.f15972q, i4);
        AbstractC1654b.e0(parcel, a02);
    }
}
