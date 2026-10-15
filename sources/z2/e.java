package z2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import e2.C1664b;
import e2.l;
import h2.r;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends AbstractC1717a {
    public static final Parcelable.Creator<e> CREATOR = new l(17);

    /* renamed from: o, reason: collision with root package name */
    public final int f15975o;

    /* renamed from: p, reason: collision with root package name */
    public final C1664b f15976p;

    /* renamed from: q, reason: collision with root package name */
    public final r f15977q;

    public e(int i4, C1664b c1664b, r rVar) {
        this.f15975o = i4;
        this.f15976p = c1664b;
        this.f15977q = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f15975o);
        AbstractC1654b.U(parcel, 2, this.f15976p, i4);
        AbstractC1654b.U(parcel, 3, this.f15977q, i4);
        AbstractC1654b.e0(parcel, a02);
    }
}
