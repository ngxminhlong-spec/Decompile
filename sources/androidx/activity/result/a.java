package androidx.activity.result;

import J.i;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new i(15);

    /* renamed from: o, reason: collision with root package name */
    public final int f2429o;

    /* renamed from: p, reason: collision with root package name */
    public final Intent f2430p;

    public a(Intent intent, int i4) {
        this.f2429o = i4;
        this.f2430p = intent;
    }

    public a(Parcel parcel) {
        this.f2429o = parcel.readInt();
        this.f2430p = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i4 = this.f2429o;
        sb.append(i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2430p);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2429o);
        Intent intent = this.f2430p;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }
}
