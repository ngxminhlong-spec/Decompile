package C0;

import O1.D0;
import O1.InterfaceC0052a0;
import android.os.RemoteException;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.ads.Y9;
import d3.AbstractC1654b;
import q1.AbstractC1949d;
import q1.C1957l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f235a;

    public K(MainActivity mainActivity) {
        this.f235a = mainActivity;
    }

    public final void a() {
        if (AbstractC1949d.f14652e == 0) {
            AbstractC1654b.E("FIRST_ADS_INIT");
        }
        D0 f4 = D0.f();
        f4.getClass();
        synchronized (f4.d) {
            h2.y.k("MobileAds.initialize() must be called prior to setting the app volume.", ((InterfaceC0052a0) f4.f1271f) != null);
            try {
                ((InterfaceC0052a0) f4.f1271f).s0(0.1f);
            } catch (RemoteException e4) {
                Y9.q("Unable to set app volume.", e4);
            }
        }
        MainActivity mainActivity = this.f235a;
        int i4 = MainActivity.f3569O;
        if (AbstractC1949d.b(mainActivity)) {
            B0.q qVar = mainActivity.f3573J;
            qVar.getClass();
            R1.a.a(mainActivity, "ca-app-pub-7062490913339915/1159910875", new H1.e(new x0.f(13)), new C1957l(qVar, true, mainActivity));
        } else if (AbstractC1949d.f14652e == 0) {
            AbstractC1654b.E("FIRST_NO_ADS_2");
        }
    }
}
