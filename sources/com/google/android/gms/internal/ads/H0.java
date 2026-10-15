package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H0 extends F0 {
    public static final Parcelable.Creator<H0> CREATOR = new C0375a(13);

    /* renamed from: p, reason: collision with root package name */
    public final int f5364p;

    /* renamed from: q, reason: collision with root package name */
    public final int f5365q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5366r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f5367s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f5368t;

    public H0(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f5364p = i4;
        this.f5365q = i5;
        this.f5366r = i6;
        this.f5367s = iArr;
        this.f5368t = iArr2;
    }

    public H0(Parcel parcel) {
        super("MLLT");
        this.f5364p = parcel.readInt();
        this.f5365q = parcel.readInt();
        this.f5366r = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i4 = AbstractC0751is.f9071a;
        this.f5367s = createIntArray;
        this.f5368t = parcel.createIntArray();
    }

    @Override // com.google.android.gms.internal.ads.F0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H0.class == obj.getClass()) {
            H0 h02 = (H0) obj;
            if (this.f5364p == h02.f5364p && this.f5365q == h02.f5365q && this.f5366r == h02.f5366r && Arrays.equals(this.f5367s, h02.f5367s) && Arrays.equals(this.f5368t, h02.f5368t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5368t) + ((Arrays.hashCode(this.f5367s) + ((((((this.f5364p + 527) * 31) + this.f5365q) * 31) + this.f5366r) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5364p);
        parcel.writeInt(this.f5365q);
        parcel.writeInt(this.f5366r);
        parcel.writeIntArray(this.f5367s);
        parcel.writeIntArray(this.f5368t);
    }
}
