package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t0 extends L.b {
    public static final Parcelable.Creator<t0> CREATOR = new G2.d(10);

    /* renamed from: q, reason: collision with root package name */
    public boolean f13827q;

    public t0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13827q = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f13827q + "}";
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(Boolean.valueOf(this.f13827q));
    }
}
