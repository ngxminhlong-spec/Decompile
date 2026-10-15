package r2;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1967a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14753a = 0;

    static {
        AbstractC1967a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(U.a.i("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
