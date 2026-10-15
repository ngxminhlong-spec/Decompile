package b0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new J.i(23);

    /* renamed from: o, reason: collision with root package name */
    public int f3334o;

    /* renamed from: p, reason: collision with root package name */
    public int f3335p;

    /* renamed from: q, reason: collision with root package name */
    public int f3336q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f3337r;

    /* renamed from: s, reason: collision with root package name */
    public int f3338s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f3339t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3340u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3341v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3342w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3343x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f3334o);
        parcel.writeInt(this.f3335p);
        parcel.writeInt(this.f3336q);
        if (this.f3336q > 0) {
            parcel.writeIntArray(this.f3337r);
        }
        parcel.writeInt(this.f3338s);
        if (this.f3338s > 0) {
            parcel.writeIntArray(this.f3339t);
        }
        parcel.writeInt(this.f3341v ? 1 : 0);
        parcel.writeInt(this.f3342w ? 1 : 0);
        parcel.writeInt(this.f3343x ? 1 : 0);
        parcel.writeList(this.f3340u);
    }
}
