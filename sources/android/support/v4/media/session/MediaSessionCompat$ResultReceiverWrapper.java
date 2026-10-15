package android.support.v4.media.session;

import J.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new i(11);

    /* renamed from: o, reason: collision with root package name */
    public ResultReceiver f2376o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        this.f2376o.writeToParcel(parcel, i4);
    }
}
