package X2;

import G2.d;
import L.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import r.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new d(7);

    /* renamed from: q, reason: collision with root package name */
    public final i f2133q;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2133q = new i(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f2133q.put(strArr[i4], bundleArr[i4]);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f2133q = new i(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2133q + "}";
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        i iVar = this.f2133q;
        int i5 = iVar.f14741q;
        parcel.writeInt(i5);
        String[] strArr = new String[i5];
        Bundle[] bundleArr = new Bundle[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            strArr[i6] = (String) iVar.f(i6);
            bundleArr[i6] = (Bundle) iVar.i(i6);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
