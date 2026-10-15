package G2;

import P2.r;
import Y2.v;
import android.os.Parcel;
import android.os.Parcelable;
import b0.W;
import l.E0;
import l.t0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f768a;

    public /* synthetic */ d(int i4) {
        this.f768a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f768a) {
            case 0:
                return new e(parcel, null);
            case 1:
                return new H2.b(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return L.b.f1070p;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new O.e(parcel, null);
            case 4:
                return new P2.a(parcel, null);
            case 5:
                return new r(parcel, null);
            case 6:
                return new Q2.c(parcel, null);
            case 7:
                return new X2.a(parcel, null);
            case 8:
                return new v(parcel, null);
            case 9:
                return new W(parcel, null);
            case 10:
                return new t0(parcel, null);
            case 11:
                return new E0(parcel, null);
            default:
                return new v.f(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f768a) {
            case 0:
                return new e(parcel, classLoader);
            case 1:
                return new H2.b(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return L.b.f1070p;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new O.e(parcel, classLoader);
            case 4:
                return new P2.a(parcel, classLoader);
            case 5:
                return new r(parcel, classLoader);
            case 6:
                return new Q2.c(parcel, classLoader);
            case 7:
                return new X2.a(parcel, classLoader);
            case 8:
                return new v(parcel, classLoader);
            case 9:
                return new W(parcel, classLoader);
            case 10:
                return new t0(parcel, classLoader);
            case 11:
                return new E0(parcel, classLoader);
            default:
                return new v.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f768a) {
            case 0:
                return new e[i4];
            case 1:
                return new H2.b[i4];
            case 2:
                return new L.b[i4];
            case 3:
                return new O.e[i4];
            case 4:
                return new P2.a[i4];
            case 5:
                return new r[i4];
            case 6:
                return new Q2.c[i4];
            case 7:
                return new X2.a[i4];
            case 8:
                return new v[i4];
            case 9:
                return new W[i4];
            case 10:
                return new t0[i4];
            case 11:
                return new E0[i4];
            default:
                return new v.f[i4];
        }
    }
}
