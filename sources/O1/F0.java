package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1106r4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F0 extends AbstractBinderC1149s4 implements InterfaceC0060e0 {

    /* renamed from: o, reason: collision with root package name */
    public final String f1273o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1274p;

    public F0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f1273o = str;
        this.f1274p = str2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.r4, O1.e0] */
    public static InterfaceC0060e0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof InterfaceC0060e0 ? (InterfaceC0060e0) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f1273o);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f1274p);
        return true;
    }

    @Override // O1.InterfaceC0060e0
    public final String a() {
        return this.f1273o;
    }

    @Override // O1.InterfaceC0060e0
    public final String d() {
        return this.f1274p;
    }
}
