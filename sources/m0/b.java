package m0;

import android.os.Parcel;
import android.util.SparseIntArray;
import r.e;
import r.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AbstractC1804a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f13977e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13978f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13979g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13980h;

    /* renamed from: i, reason: collision with root package name */
    public int f13981i;

    /* renamed from: j, reason: collision with root package name */
    public int f13982j;

    /* renamed from: k, reason: collision with root package name */
    public int f13983k;

    /* JADX WARN: Type inference failed for: r5v0, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r6v0, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [r.e, r.i] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new i(0), new i(0), new i(0));
    }

    public b(Parcel parcel, int i4, int i5, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.d = new SparseIntArray();
        this.f13981i = -1;
        this.f13983k = -1;
        this.f13977e = parcel;
        this.f13978f = i4;
        this.f13979g = i5;
        this.f13982j = i4;
        this.f13980h = str;
    }

    @Override // m0.AbstractC1804a
    public final b a() {
        Parcel parcel = this.f13977e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f13982j;
        if (i4 == this.f13978f) {
            i4 = this.f13979g;
        }
        return new b(parcel, dataPosition, i4, n0.a.j(new StringBuilder(), this.f13980h, "  "), this.f13975a, this.f13976b, this.c);
    }

    @Override // m0.AbstractC1804a
    public final boolean e(int i4) {
        while (this.f13982j < this.f13979g) {
            int i5 = this.f13983k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            int i6 = this.f13982j;
            Parcel parcel = this.f13977e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f13983k = parcel.readInt();
            this.f13982j += readInt;
        }
        return this.f13983k == i4;
    }

    @Override // m0.AbstractC1804a
    public final void i(int i4) {
        int i5 = this.f13981i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f13977e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.f13981i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }
}
