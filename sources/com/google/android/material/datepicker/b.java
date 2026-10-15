package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new J.i(26);

    /* renamed from: o, reason: collision with root package name */
    public final l f12360o;

    /* renamed from: p, reason: collision with root package name */
    public final l f12361p;

    /* renamed from: q, reason: collision with root package name */
    public final l f12362q;

    /* renamed from: r, reason: collision with root package name */
    public final c f12363r;

    /* renamed from: s, reason: collision with root package name */
    public final int f12364s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12365t;

    public b(l lVar, l lVar2, l lVar3, c cVar) {
        this.f12360o = lVar;
        this.f12361p = lVar2;
        this.f12362q = lVar3;
        this.f12363r = cVar;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f12365t = lVar.d(lVar2) + 1;
        this.f12364s = (lVar2.f12404r - lVar.f12404r) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12360o.equals(bVar.f12360o) && this.f12361p.equals(bVar.f12361p) && this.f12362q.equals(bVar.f12362q) && this.f12363r.equals(bVar.f12363r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12360o, this.f12361p, this.f12362q, this.f12363r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f12360o, 0);
        parcel.writeParcelable(this.f12361p, 0);
        parcel.writeParcelable(this.f12362q, 0);
        parcel.writeParcelable(this.f12363r, 0);
    }
}
