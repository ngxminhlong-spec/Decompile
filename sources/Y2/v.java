package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v extends L.b {
    public static final Parcelable.Creator<v> CREATOR = new G2.d(8);

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2218q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2219r;

    public v(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2218q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2219r = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2218q) + "}";
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        TextUtils.writeToParcel(this.f2218q, parcel, i4);
        parcel.writeInt(this.f2219r ? 1 : 0);
    }
}
