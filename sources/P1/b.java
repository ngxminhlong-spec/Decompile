package P1;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AbstractC1717a {
    public static final Parcelable.Creator<b> CREATOR = new J.i(4);

    /* renamed from: o, reason: collision with root package name */
    public final String f1502o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1503p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1504q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1505r;

    /* renamed from: s, reason: collision with root package name */
    public final String f1506s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1507t;

    /* renamed from: u, reason: collision with root package name */
    public final String f1508u;

    /* renamed from: v, reason: collision with root package name */
    public final Intent f1509v;

    /* renamed from: w, reason: collision with root package name */
    public final j f1510w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1511x;

    public b(Intent intent, j jVar) {
        this(null, null, null, null, null, null, null, intent, new BinderC1813b(jVar), false);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, j jVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new BinderC1813b(jVar), false);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z4) {
        this.f1502o = str;
        this.f1503p = str2;
        this.f1504q = str3;
        this.f1505r = str4;
        this.f1506s = str5;
        this.f1507t = str6;
        this.f1508u = str7;
        this.f1509v = intent;
        this.f1510w = (j) BinderC1813b.C2(BinderC1813b.G1(iBinder));
        this.f1511x = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f1502o);
        AbstractC1654b.V(parcel, 3, this.f1503p);
        AbstractC1654b.V(parcel, 4, this.f1504q);
        AbstractC1654b.V(parcel, 5, this.f1505r);
        AbstractC1654b.V(parcel, 6, this.f1506s);
        AbstractC1654b.V(parcel, 7, this.f1507t);
        AbstractC1654b.V(parcel, 8, this.f1508u);
        AbstractC1654b.U(parcel, 9, this.f1509v, i4);
        AbstractC1654b.T(parcel, 10, new BinderC1813b(this.f1510w));
        AbstractC1654b.f0(parcel, 11, 4);
        parcel.writeInt(this.f1511x ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
