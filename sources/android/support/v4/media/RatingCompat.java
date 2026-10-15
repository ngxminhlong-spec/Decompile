package android.support.v4.media;

import J.i;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new i(9);

    /* renamed from: o, reason: collision with root package name */
    public final int f2372o;

    /* renamed from: p, reason: collision with root package name */
    public final float f2373p;

    public RatingCompat(int i4, float f4) {
        this.f2372o = i4;
        this.f2373p = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f2372o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f2372o);
        sb.append(" rating=");
        float f4 = this.f2373p;
        sb.append(f4 < 0.0f ? "unrated" : String.valueOf(f4));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2372o);
        parcel.writeFloat(this.f2373p);
    }
}
