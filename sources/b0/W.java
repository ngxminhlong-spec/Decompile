package b0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W extends L.b {
    public static final Parcelable.Creator<W> CREATOR = new G2.d(9);

    /* renamed from: q, reason: collision with root package name */
    public Parcelable f3210q;

    public W(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3210q = parcel.readParcelable(classLoader == null ? AbstractC0178L.class.getClassLoader() : classLoader);
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeParcelable(this.f3210q, 0);
    }
}
