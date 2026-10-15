package P2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new G2.d(5);

    public r(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i4 = 0; i4 < readInt; i4++) {
            put(iArr[i4], readParcelableArray[i4]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = keyAt(i5);
            parcelableArr[i5] = (Parcelable) valueAt(i5);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }
}
