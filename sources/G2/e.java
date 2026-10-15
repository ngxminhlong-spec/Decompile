package G2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends L.b {
    public static final Parcelable.Creator<e> CREATOR = new d(0);

    /* renamed from: q, reason: collision with root package name */
    public final int f769q;

    /* renamed from: r, reason: collision with root package name */
    public final int f770r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f771s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f772t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f773u;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f769q = parcel.readInt();
        this.f770r = parcel.readInt();
        this.f771s = parcel.readInt() == 1;
        this.f772t = parcel.readInt() == 1;
        this.f773u = parcel.readInt() == 1;
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f769q = bottomSheetBehavior.f12319x;
        this.f770r = bottomSheetBehavior.d;
        this.f771s = bottomSheetBehavior.f12299b;
        this.f772t = bottomSheetBehavior.f12316u;
        this.f773u = bottomSheetBehavior.f12317v;
    }

    @Override // L.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f769q);
        parcel.writeInt(this.f770r);
        parcel.writeInt(this.f771s ? 1 : 0);
        parcel.writeInt(this.f772t ? 1 : 0);
        parcel.writeInt(this.f773u ? 1 : 0);
    }
}
