package x2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2067d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15587a;

    public /* synthetic */ C2067d(int i4) {
        this.f15587a = i4;
    }

    public static void a(C2096s c2096s, Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, c2096s.f15781o);
        AbstractC1654b.U(parcel, 3, c2096s.f15782p, i4);
        AbstractC1654b.V(parcel, 4, c2096s.f15783q);
        long j4 = c2096s.f15784r;
        AbstractC1654b.f0(parcel, 5, 8);
        parcel.writeLong(j4);
        AbstractC1654b.e0(parcel, a02);
    }

    public static void b(Y0 y02, Parcel parcel) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        int i4 = y02.f15507o;
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(i4);
        AbstractC1654b.V(parcel, 2, y02.f15508p);
        long j4 = y02.f15509q;
        AbstractC1654b.f0(parcel, 3, 8);
        parcel.writeLong(j4);
        Long l4 = y02.f15510r;
        if (l4 != null) {
            AbstractC1654b.f0(parcel, 4, 8);
            parcel.writeLong(l4.longValue());
        }
        AbstractC1654b.V(parcel, 6, y02.f15511s);
        AbstractC1654b.V(parcel, 7, y02.f15512t);
        Double d = y02.f15513u;
        if (d != null) {
            AbstractC1654b.f0(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        AbstractC1654b.e0(parcel, a02);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0126. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2067d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f15587a) {
            case 0:
                return new C2065c[i4];
            case 1:
                return new r[i4];
            case 2:
                return new C2096s[i4];
            case 3:
                return new Y0[i4];
            default:
                return new d1[i4];
        }
    }
}
