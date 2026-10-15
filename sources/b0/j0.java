package b0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new J.i(22);

    /* renamed from: o, reason: collision with root package name */
    public int f3327o;

    /* renamed from: p, reason: collision with root package name */
    public int f3328p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f3329q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3330r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3327o + ", mGapDir=" + this.f3328p + ", mHasUnwantedGapAfter=" + this.f3330r + ", mGapPerSpan=" + Arrays.toString(this.f3329q) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f3327o);
        parcel.writeInt(this.f3328p);
        parcel.writeInt(this.f3330r ? 1 : 0);
        int[] iArr = this.f3329q;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3329q);
        }
    }
}
