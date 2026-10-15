package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.H8;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T0 extends AbstractBinderC1149s4 implements InterfaceC0100z {

    /* renamed from: o, reason: collision with root package name */
    public final H1.r f1291o;

    /* renamed from: p, reason: collision with root package name */
    public final H8 f1292p;

    public T0(H1.r rVar, H8 h8) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.f1291o = rVar;
        this.f1292p = h8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            e();
        } else {
            if (i4 != 2) {
                return false;
            }
            C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
            AbstractC1192t4.b(parcel);
            l3(c0101z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // O1.InterfaceC0100z
    public final void e() {
        H8 h8;
        H1.r rVar = this.f1291o;
        if (rVar == null || (h8 = this.f1292p) == null) {
            return;
        }
        rVar.e(h8);
    }

    @Override // O1.InterfaceC0100z
    public final void l3(C0101z0 c0101z0) {
        H1.r rVar = this.f1291o;
        if (rVar != null) {
            rVar.b(c0101z0.i());
        }
    }
}
