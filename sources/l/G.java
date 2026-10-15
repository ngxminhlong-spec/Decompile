package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G extends View.BaseSavedState {
    public static final Parcelable.Creator<G> CREATOR = new e2.l(13);

    /* renamed from: o, reason: collision with root package name */
    public boolean f13602o;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.f13602o ? (byte) 1 : (byte) 0);
    }
}
