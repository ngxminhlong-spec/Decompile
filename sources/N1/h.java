package N1;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends AbstractC1717a {
    public static final Parcelable.Creator<h> CREATOR = new J.i(3);

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1176o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1177p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1178q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1179r;

    /* renamed from: s, reason: collision with root package name */
    public final float f1180s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1181t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1182u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1183v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1184w;

    public h(boolean z4, boolean z5, String str, boolean z6, float f4, int i4, boolean z7, boolean z8, boolean z9) {
        this.f1176o = z4;
        this.f1177p = z5;
        this.f1178q = str;
        this.f1179r = z6;
        this.f1180s = f4;
        this.f1181t = i4;
        this.f1182u = z7;
        this.f1183v = z8;
        this.f1184w = z9;
    }

    public h(boolean z4, boolean z5, boolean z6, float f4, boolean z7, boolean z8, boolean z9) {
        this(z4, z5, null, z6, f4, -1, z7, z8, z9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f1176o ? 1 : 0);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f1177p ? 1 : 0);
        AbstractC1654b.V(parcel, 4, this.f1178q);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f1179r ? 1 : 0);
        AbstractC1654b.f0(parcel, 6, 4);
        parcel.writeFloat(this.f1180s);
        AbstractC1654b.f0(parcel, 7, 4);
        parcel.writeInt(this.f1181t);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f1182u ? 1 : 0);
        AbstractC1654b.f0(parcel, 9, 4);
        parcel.writeInt(this.f1183v ? 1 : 0);
        AbstractC1654b.f0(parcel, 10, 4);
        parcel.writeInt(this.f1184w ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
