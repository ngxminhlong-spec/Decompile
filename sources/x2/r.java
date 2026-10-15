package x2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r extends AbstractC1717a implements Iterable {
    public static final Parcelable.Creator<r> CREATOR = new C2067d(1);

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f15773o;

    public r(Bundle bundle) {
        this.f15773o = bundle;
    }

    public final Bundle h() {
        return new Bundle(this.f15773o);
    }

    public final Double i() {
        return Double.valueOf(this.f15773o.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2093q(this);
    }

    public final Object j(String str) {
        return this.f15773o.get(str);
    }

    public final String k() {
        return this.f15773o.getString("currency");
    }

    public final String toString() {
        return this.f15773o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.R(parcel, 2, h());
        AbstractC1654b.e0(parcel, a02);
    }
}
