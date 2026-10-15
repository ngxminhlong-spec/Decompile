package O;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends L.b {
    public static final Parcelable.Creator<e> CREATOR = new G2.d(3);

    /* renamed from: q, reason: collision with root package name */
    public int f1242q;

    /* renamed from: r, reason: collision with root package name */
    public int f1243r;

    /* renamed from: s, reason: collision with root package name */
    public int f1244s;

    /* renamed from: t, reason: collision with root package name */
    public int f1245t;

    /* renamed from: u, reason: collision with root package name */
    public int f1246u;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1242q = 0;
        this.f1242q = parcel.readInt();
        this.f1243r = parcel.readInt();
        this.f1244s = parcel.readInt();
        this.f1245t = parcel.readInt();
        this.f1246u = parcel.readInt();
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f1242q);
        parcel.writeInt(this.f1243r);
        parcel.writeInt(this.f1244s);
        parcel.writeInt(this.f1245t);
        parcel.writeInt(this.f1246u);
    }
}
