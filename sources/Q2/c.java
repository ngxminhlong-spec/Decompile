package Q2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends L.b {
    public static final Parcelable.Creator<c> CREATOR = new G2.d(6);

    /* renamed from: q, reason: collision with root package name */
    public Bundle f1741q;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1741q = parcel.readBundle(classLoader);
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeBundle(this.f1741q);
    }
}
