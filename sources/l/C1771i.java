package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771i implements Parcelable {
    public static final Parcelable.Creator<C1771i> CREATOR = new e2.l(12);

    /* renamed from: o, reason: collision with root package name */
    public int f13763o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f13763o);
    }
}
