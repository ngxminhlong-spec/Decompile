package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0083q extends AbstractBinderC1149s4 implements InterfaceC0090u {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0051a f1378o;

    public BinderC0083q(InterfaceC0051a interfaceC0051a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f1378o = interfaceC0051a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        c();
        parcel2.writeNoException();
        return true;
    }

    @Override // O1.InterfaceC0090u
    public final void c() {
        this.f1378o.D();
    }
}
