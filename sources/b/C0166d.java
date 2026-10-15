package b;

import J.i;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0166d implements Parcelable {
    public static final Parcelable.Creator<C0166d> CREATOR = new i(20);

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0164b f3169o;

    public void a(int i4, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        synchronized (this) {
            try {
                if (this.f3169o == null) {
                    this.f3169o = new BinderC0165c(this);
                }
                parcel.writeStrongBinder(this.f3169o.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
