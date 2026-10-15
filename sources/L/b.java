package L;

import G2.d;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    public final Parcelable f1071o;

    /* renamed from: p, reason: collision with root package name */
    public static final a f1070p = new b();
    public static final Parcelable.Creator<b> CREATOR = new d(2);

    public b() {
        this.f1071o = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1071o = readParcelable == null ? f1070p : readParcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1071o = parcelable == f1070p ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f1071o, i4);
    }
}
