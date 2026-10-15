package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new J.i(18);

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2912o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2913p;

    /* renamed from: q, reason: collision with root package name */
    public C0153b[] f2914q;

    /* renamed from: r, reason: collision with root package name */
    public String f2915r;

    /* renamed from: s, reason: collision with root package name */
    public int f2916s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeTypedList(this.f2912o);
        parcel.writeStringList(this.f2913p);
        parcel.writeTypedArray(this.f2914q, i4);
        parcel.writeString(this.f2915r);
        parcel.writeInt(this.f2916s);
    }
}
