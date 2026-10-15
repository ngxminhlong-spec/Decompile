package z2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import e2.l;
import i2.AbstractC1717a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends AbstractC1717a {
    public static final Parcelable.Creator<d> CREATOR = new l(16);

    /* renamed from: o, reason: collision with root package name */
    public final List f15973o;

    /* renamed from: p, reason: collision with root package name */
    public final String f15974p;

    public d(String str, ArrayList arrayList) {
        this.f15973o = arrayList;
        this.f15974p = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.X(parcel, 1, this.f15973o);
        AbstractC1654b.V(parcel, 2, this.f15974p);
        AbstractC1654b.e0(parcel, a02);
    }
}
