package androidx.activity.result;

import J.i;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new i(16);

    /* renamed from: o, reason: collision with root package name */
    public final IntentSender f2442o;

    /* renamed from: p, reason: collision with root package name */
    public final Intent f2443p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2444q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2445r;

    public g(IntentSender intentSender) {
        this.f2442o = intentSender;
        this.f2443p = null;
        this.f2444q = 0;
        this.f2445r = 0;
    }

    public g(Parcel parcel) {
        this.f2442o = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f2443p = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f2444q = parcel.readInt();
        this.f2445r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f2442o, i4);
        parcel.writeParcelable(this.f2443p, i4);
        parcel.writeInt(this.f2444q);
        parcel.writeInt(this.f2445r);
    }
}
