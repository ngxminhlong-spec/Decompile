package v;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends L.b {
    public static final Parcelable.Creator<f> CREATOR = new G2.d(12);

    /* renamed from: q, reason: collision with root package name */
    public SparseArray f15010q;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f15010q = new SparseArray(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f15010q.append(iArr[i4], readParcelableArray[i4]);
        }
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        SparseArray sparseArray = this.f15010q;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = this.f15010q.keyAt(i5);
            parcelableArr[i5] = (Parcelable) this.f15010q.valueAt(i5);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }
}
