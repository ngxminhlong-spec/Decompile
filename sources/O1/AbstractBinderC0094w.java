package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0094w extends AbstractBinderC1149s4 implements InterfaceC0096x {
    public AbstractBinderC0094w() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                i();
                break;
            case 2:
                int readInt = parcel.readInt();
                AbstractC1192t4.b(parcel);
                A(readInt);
                break;
            case 3:
                break;
            case 4:
                g();
                break;
            case 5:
                j();
                break;
            case 6:
                e();
                break;
            case 7:
                h();
                break;
            case 8:
                C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
                AbstractC1192t4.b(parcel);
                r(c0101z0);
                break;
            case 9:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
