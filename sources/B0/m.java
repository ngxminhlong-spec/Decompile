package B0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.ads.Tw;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.L0;
import com.google.android.gms.internal.play_billing.O0;
import com.google.android.gms.internal.play_billing.P0;
import com.google.android.gms.internal.play_billing.R0;
import com.google.android.gms.internal.play_billing.T0;
import com.google.android.gms.internal.play_billing.U0;
import com.google.android.gms.internal.play_billing.V0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: o, reason: collision with root package name */
    public final Object f88o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public boolean f89p = false;

    /* renamed from: q, reason: collision with root package name */
    public Tw f90q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f91r;

    public /* synthetic */ m(b bVar, Tw tw) {
        this.f91r = bVar;
        this.f90q = tw;
    }

    public final void a(d dVar) {
        synchronized (this.f88o) {
            try {
                Tw tw = this.f90q;
                if (tw != null) {
                    tw.n(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        V0 t02;
        AbstractC1629o.d("BillingClient", "Billing service connected.");
        b bVar = this.f91r;
        int i4 = U0.f12168o;
        if (iBinder == null) {
            t02 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            t02 = queryLocalInterface instanceof V0 ? (V0) queryLocalInterface : new T0(iBinder);
        }
        bVar.f50g = t02;
        l lVar = new l(0, this);
        A0.a aVar = new A0.a(2, this);
        b bVar2 = this.f91r;
        if (bVar2.g(lVar, 30000L, aVar, bVar2.d()) == null) {
            b bVar3 = this.f91r;
            d f4 = bVar3.f();
            bVar3.h(n.a(25, 6, f4));
            a(f4);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1629o.e("BillingClient", "Billing service disconnected.");
        C0783ji c0783ji = this.f91r.f49f;
        R0 l4 = R0.l();
        c0783ji.getClass();
        if (l4 != null) {
            try {
                O0 p3 = P0.p();
                L0 l02 = (L0) c0783ji.f9211p;
                p3.c();
                P0.m((P0) p3.f12141p, l02);
                p3.c();
                P0.l((P0) p3.f12141p, l4);
                ((q) c0783ji.f9212q).f((P0) p3.a());
            } catch (Throwable th) {
                AbstractC1629o.f("BillingLogger", "Unable to log.", th);
            }
        }
        this.f91r.f50g = null;
        this.f91r.f46a = 0;
        synchronized (this.f88o) {
        }
    }
}
