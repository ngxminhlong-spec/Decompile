package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N implements Comparator, Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new C0375a(0);

    /* renamed from: o, reason: collision with root package name */
    public final C1445z[] f6294o;

    /* renamed from: p, reason: collision with root package name */
    public int f6295p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6296q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6297r;

    public N(Parcel parcel) {
        this.f6296q = parcel.readString();
        C1445z[] c1445zArr = (C1445z[]) parcel.createTypedArray(C1445z.CREATOR);
        int i4 = AbstractC0751is.f9071a;
        this.f6294o = c1445zArr;
        this.f6297r = c1445zArr.length;
    }

    public N(String str, boolean z4, C1445z... c1445zArr) {
        this.f6296q = str;
        c1445zArr = z4 ? (C1445z[]) c1445zArr.clone() : c1445zArr;
        this.f6294o = c1445zArr;
        this.f6297r = c1445zArr.length;
        Arrays.sort(c1445zArr, this);
    }

    public final N a(String str) {
        return AbstractC0751is.c(this.f6296q, str) ? this : new N(str, false, this.f6294o);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1445z c1445z = (C1445z) obj;
        C1445z c1445z2 = (C1445z) obj2;
        UUID uuid = SC.f6954a;
        return uuid.equals(c1445z.f11558p) ? !uuid.equals(c1445z2.f11558p) ? 1 : 0 : c1445z.f11558p.compareTo(c1445z2.f11558p);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N.class == obj.getClass()) {
            N n4 = (N) obj;
            if (AbstractC0751is.c(this.f6296q, n4.f6296q) && Arrays.equals(this.f6294o, n4.f6294o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f6295p;
        if (i4 != 0) {
            return i4;
        }
        String str = this.f6296q;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6294o);
        this.f6295p = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f6296q);
        parcel.writeTypedArray(this.f6294o, 0);
    }
}
