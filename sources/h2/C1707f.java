package h2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1707f extends AbstractC1717a {
    public static final Parcelable.Creator<C1707f> CREATOR = new e2.l(10);

    /* renamed from: o, reason: collision with root package name */
    public final l f13185o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13186p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13187q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f13188r;

    /* renamed from: s, reason: collision with root package name */
    public final int f13189s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f13190t;

    public C1707f(l lVar, boolean z4, boolean z5, int[] iArr, int i4, int[] iArr2) {
        this.f13185o = lVar;
        this.f13186p = z4;
        this.f13187q = z5;
        this.f13188r = iArr;
        this.f13189s = i4;
        this.f13190t = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.U(parcel, 1, this.f13185o, i4);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f13186p ? 1 : 0);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f13187q ? 1 : 0);
        int[] iArr = this.f13188r;
        if (iArr != null) {
            int a03 = AbstractC1654b.a0(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC1654b.e0(parcel, a03);
        }
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f13189s);
        int[] iArr2 = this.f13190t;
        if (iArr2 != null) {
            int a04 = AbstractC1654b.a0(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC1654b.e0(parcel, a04);
        }
        AbstractC1654b.e0(parcel, a02);
    }
}
