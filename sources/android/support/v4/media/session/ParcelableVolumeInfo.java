package android.support.v4.media.session;

import J.i;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new i(13);

    /* renamed from: o, reason: collision with root package name */
    public int f2378o;

    /* renamed from: p, reason: collision with root package name */
    public int f2379p;

    /* renamed from: q, reason: collision with root package name */
    public int f2380q;

    /* renamed from: r, reason: collision with root package name */
    public int f2381r;

    /* renamed from: s, reason: collision with root package name */
    public int f2382s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2378o);
        parcel.writeInt(this.f2380q);
        parcel.writeInt(this.f2381r);
        parcel.writeInt(this.f2382s);
        parcel.writeInt(this.f2379p);
    }
}
