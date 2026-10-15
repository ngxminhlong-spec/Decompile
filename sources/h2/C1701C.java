package h2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701C extends s {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f13137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC1706e f13138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701C(AbstractC1706e abstractC1706e, int i4, IBinder iBinder, Bundle bundle) {
        super(abstractC1706e, i4, bundle);
        this.f13138h = abstractC1706e;
        this.f13137g = iBinder;
    }

    @Override // h2.s
    public final void a(C1664b c1664b) {
        InterfaceC1704c interfaceC1704c = this.f13138h.f13166D;
        if (interfaceC1704c != null) {
            interfaceC1704c.a0(c1664b);
        }
        System.currentTimeMillis();
    }

    @Override // h2.s
    public final boolean b() {
        IBinder iBinder = this.f13137g;
        try {
            y.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC1706e abstractC1706e = this.f13138h;
            if (!abstractC1706e.u().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC1706e.u() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o4 = abstractC1706e.o(iBinder);
            if (o4 == null || !(AbstractC1706e.y(abstractC1706e, 2, 4, o4) || AbstractC1706e.y(abstractC1706e, 3, 4, o4))) {
                return false;
            }
            abstractC1706e.f13170H = null;
            InterfaceC1703b interfaceC1703b = abstractC1706e.f13165C;
            if (interfaceC1703b == null) {
                return true;
            }
            interfaceC1703b.Q();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
