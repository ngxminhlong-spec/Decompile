package O1;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R0 extends AbstractC1717a {
    public static final Parcelable.Creator<R0> CREATOR = new C0066h0(6);

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1287o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1288p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1289q;

    public R0(H1.p pVar) {
        this(pVar.f880a, pVar.f881b, pVar.c);
    }

    public R0(boolean z4, boolean z5, boolean z6) {
        this.f1287o = z4;
        this.f1288p = z5;
        this.f1289q = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f1287o ? 1 : 0);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f1288p ? 1 : 0);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f1289q ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
