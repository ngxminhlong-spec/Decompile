package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E0 extends L.b {
    public static final Parcelable.Creator<E0> CREATOR = new G2.d(11);

    /* renamed from: q, reason: collision with root package name */
    public int f13593q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13594r;

    public E0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13593q = parcel.readInt();
        this.f13594r = parcel.readInt() != 0;
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f13593q);
        parcel.writeInt(this.f13594r ? 1 : 0);
    }
}
