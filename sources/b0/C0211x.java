package b0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211x implements Parcelable {
    public static final Parcelable.Creator<C0211x> CREATOR = new J.i(21);

    /* renamed from: o, reason: collision with root package name */
    public int f3431o;

    /* renamed from: p, reason: collision with root package name */
    public int f3432p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3433q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f3431o);
        parcel.writeInt(this.f3432p);
        parcel.writeInt(this.f3433q ? 1 : 0);
    }
}
