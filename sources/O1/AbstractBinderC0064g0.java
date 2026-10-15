package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0064g0 extends AbstractBinderC1149s4 implements InterfaceC0068i0 {
    public AbstractBinderC0064g0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
        AbstractC1192t4.b(parcel);
        Z0(c0101z0);
        parcel2.writeNoException();
        return true;
    }
}
