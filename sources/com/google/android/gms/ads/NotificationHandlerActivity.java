package com.google.android.gms.ads;

import O1.C0059e;
import O1.C0077n;
import O1.C0081p;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.InterfaceC0947na;
import com.google.android.gms.internal.ads.Y9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C0077n c0077n = C0081p.f1374f.f1376b;
            BinderC0983o9 binderC0983o9 = new BinderC0983o9();
            c0077n.getClass();
            InterfaceC0947na interfaceC0947na = (InterfaceC0947na) new C0059e(this, binderC0983o9).d(this, false);
            if (interfaceC0947na == null) {
                Y9.p("OfflineUtils is null");
            } else {
                interfaceC0947na.j0(getIntent());
            }
        } catch (RemoteException e4) {
            Y9.p("RemoteException calling handleNotificationIntent: ".concat(e4.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
