package K1;

import J.i;
import O1.M;
import O1.O;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.D4;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends AbstractC1717a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1058o;

    /* renamed from: p, reason: collision with root package name */
    public final O f1059p;

    /* renamed from: q, reason: collision with root package name */
    public final IBinder f1060q;

    public d(boolean z4, IBinder iBinder, IBinder iBinder2) {
        O o4;
        this.f1058o = z4;
        if (iBinder != null) {
            int i4 = D4.f4584p;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            o4 = queryLocalInterface instanceof O ? (O) queryLocalInterface : new M(iBinder);
        } else {
            o4 = null;
        }
        this.f1059p = o4;
        this.f1060q = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f1058o ? 1 : 0);
        O o4 = this.f1059p;
        AbstractC1654b.T(parcel, 2, o4 == null ? null : o4.asBinder());
        AbstractC1654b.T(parcel, 3, this.f1060q);
        AbstractC1654b.e0(parcel, a02);
    }
}
