package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import d3.AbstractC1654b;
import e2.C1664b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r extends AbstractC1717a {
    public static final Parcelable.Creator<r> CREATOR = new e2.l(7);

    /* renamed from: o, reason: collision with root package name */
    public final int f13236o;

    /* renamed from: p, reason: collision with root package name */
    public final IBinder f13237p;

    /* renamed from: q, reason: collision with root package name */
    public final C1664b f13238q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13239r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13240s;

    public r(int i4, IBinder iBinder, C1664b c1664b, boolean z4, boolean z5) {
        this.f13236o = i4;
        this.f13237p = iBinder;
        this.f13238q = c1664b;
        this.f13239r = z4;
        this.f13240s = z5;
    }

    public final boolean equals(Object obj) {
        Object abstractC1106r4;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f13238q.equals(rVar.f13238q)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f13237p;
        if (iBinder == null) {
            abstractC1106r4 = null;
        } else {
            int i4 = AbstractBinderC1702a.f13161p;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            abstractC1106r4 = queryLocalInterface instanceof InterfaceC1710i ? (InterfaceC1710i) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        IBinder iBinder2 = rVar.f13237p;
        if (iBinder2 != null) {
            int i5 = AbstractBinderC1702a.f13161p;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof InterfaceC1710i ? (InterfaceC1710i) queryLocalInterface2 : new AbstractC1106r4(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        return y.m(abstractC1106r4, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f13236o);
        AbstractC1654b.T(parcel, 2, this.f13237p);
        AbstractC1654b.U(parcel, 3, this.f13238q, i4);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f13239r ? 1 : 0);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f13240s ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
