package O1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X0 extends AbstractC1717a {
    public static final Parcelable.Creator<X0> CREATOR = new C0066h0(8);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f1319A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1320B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1321C;

    /* renamed from: o, reason: collision with root package name */
    public final String f1322o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1323p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1324q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1325r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1326s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1327t;

    /* renamed from: u, reason: collision with root package name */
    public final X0[] f1328u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1329v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1330w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1331x;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f1332z;

    public X0() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public X0(Context context, H1.f fVar) {
        this(context, new H1.f[]{fVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X0(android.content.Context r17, H1.f[] r18) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.X0.<init>(android.content.Context, H1.f[]):void");
    }

    public X0(String str, int i4, int i5, boolean z4, int i6, int i7, X0[] x0Arr, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f1322o = str;
        this.f1323p = i4;
        this.f1324q = i5;
        this.f1325r = z4;
        this.f1326s = i6;
        this.f1327t = i7;
        this.f1328u = x0Arr;
        this.f1329v = z5;
        this.f1330w = z6;
        this.f1331x = z7;
        this.y = z8;
        this.f1332z = z9;
        this.f1319A = z10;
        this.f1320B = z11;
        this.f1321C = z12;
    }

    public static X0 h() {
        return new X0("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static X0 i() {
        return new X0("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f1322o);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f1323p);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f1324q);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f1325r ? 1 : 0);
        AbstractC1654b.f0(parcel, 6, 4);
        parcel.writeInt(this.f1326s);
        AbstractC1654b.f0(parcel, 7, 4);
        parcel.writeInt(this.f1327t);
        AbstractC1654b.Y(parcel, 8, this.f1328u, i4);
        AbstractC1654b.f0(parcel, 9, 4);
        parcel.writeInt(this.f1329v ? 1 : 0);
        AbstractC1654b.f0(parcel, 10, 4);
        parcel.writeInt(this.f1330w ? 1 : 0);
        boolean z4 = this.f1331x;
        AbstractC1654b.f0(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC1654b.f0(parcel, 12, 4);
        parcel.writeInt(this.y ? 1 : 0);
        AbstractC1654b.f0(parcel, 13, 4);
        parcel.writeInt(this.f1332z ? 1 : 0);
        AbstractC1654b.f0(parcel, 14, 4);
        parcel.writeInt(this.f1319A ? 1 : 0);
        AbstractC1654b.f0(parcel, 15, 4);
        parcel.writeInt(this.f1320B ? 1 : 0);
        AbstractC1654b.f0(parcel, 16, 4);
        parcel.writeInt(this.f1321C ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
