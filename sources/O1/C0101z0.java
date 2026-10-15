package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101z0 extends AbstractC1717a {
    public static final Parcelable.Creator<C0101z0> CREATOR = new C0066h0(3);

    /* renamed from: o, reason: collision with root package name */
    public final int f1405o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1406p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1407q;

    /* renamed from: r, reason: collision with root package name */
    public C0101z0 f1408r;

    /* renamed from: s, reason: collision with root package name */
    public IBinder f1409s;

    public C0101z0(int i4, String str, String str2, C0101z0 c0101z0, IBinder iBinder) {
        this.f1405o = i4;
        this.f1406p = str;
        this.f1407q = str2;
        this.f1408r = c0101z0;
        this.f1409s = iBinder;
    }

    public final H1.a h() {
        C0101z0 c0101z0 = this.f1408r;
        H1.a aVar = null;
        if (c0101z0 != null) {
            String str = c0101z0.f1407q;
            aVar = new H1.a(c0101z0.f1405o, c0101z0.f1406p, str, (H1.a) null);
        }
        return new H1.a(this.f1405o, this.f1406p, this.f1407q, aVar);
    }

    public final H1.j i() {
        H1.a aVar;
        InterfaceC0084q0 c0082p0;
        C0101z0 c0101z0 = this.f1408r;
        if (c0101z0 == null) {
            aVar = null;
        } else {
            aVar = new H1.a(c0101z0.f1405o, c0101z0.f1406p, c0101z0.f1407q, (H1.a) null);
        }
        IBinder iBinder = this.f1409s;
        if (iBinder == null) {
            c0082p0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c0082p0 = queryLocalInterface instanceof InterfaceC0084q0 ? (InterfaceC0084q0) queryLocalInterface : new C0082p0(iBinder);
        }
        return new H1.j(this.f1405o, this.f1406p, this.f1407q, aVar, c0082p0 != null ? new H1.n(c0082p0) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f1405o);
        AbstractC1654b.V(parcel, 2, this.f1406p);
        AbstractC1654b.V(parcel, 3, this.f1407q);
        AbstractC1654b.U(parcel, 4, this.f1408r, i4);
        AbstractC1654b.T(parcel, 5, this.f1409s);
        AbstractC1654b.e0(parcel, a02);
    }
}
