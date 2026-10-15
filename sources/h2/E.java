package h2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E extends AbstractC1717a {
    public static final Parcelable.Creator<E> CREATOR = new e2.l(9);

    /* renamed from: o, reason: collision with root package name */
    public Bundle f13140o;

    /* renamed from: p, reason: collision with root package name */
    public e2.d[] f13141p;

    /* renamed from: q, reason: collision with root package name */
    public int f13142q;

    /* renamed from: r, reason: collision with root package name */
    public C1707f f13143r;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.R(parcel, 1, this.f13140o);
        AbstractC1654b.Y(parcel, 2, this.f13141p, i4);
        int i5 = this.f13142q;
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(i5);
        AbstractC1654b.U(parcel, 4, this.f13143r, i4);
        AbstractC1654b.e0(parcel, a02);
    }
}
