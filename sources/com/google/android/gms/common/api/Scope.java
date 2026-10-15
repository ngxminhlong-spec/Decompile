package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d3.AbstractC1654b;
import e2.l;
import h2.y;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Scope extends AbstractC1717a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l(2);

    /* renamed from: o, reason: collision with root package name */
    public final int f3893o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3894p;

    public Scope(String str, int i4) {
        y.f(str, "scopeUri must not be null or empty");
        this.f3893o = i4;
        this.f3894p = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3894p.equals(((Scope) obj).f3894p);
    }

    public final int hashCode() {
        return this.f3894p.hashCode();
    }

    public final String toString() {
        return this.f3894p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f3893o);
        AbstractC1654b.V(parcel, 2, this.f3894p);
        AbstractC1654b.e0(parcel, a02);
    }
}
