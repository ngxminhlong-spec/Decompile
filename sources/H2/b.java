package H2;

import G2.d;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends L.b {
    public static final Parcelable.Creator<b> CREATOR = new d(1);

    /* renamed from: q, reason: collision with root package name */
    public boolean f886q;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f886q = parcel.readInt() == 1;
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f886q ? 1 : 0);
    }
}
