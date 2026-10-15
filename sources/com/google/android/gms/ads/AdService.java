package com.google.android.gms.ads;

import O1.C0059e;
import O1.C0077n;
import O1.C0081p;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.InterfaceC0947na;
import com.google.android.gms.internal.ads.Y9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C0077n c0077n = C0081p.f1374f.f1376b;
            BinderC0983o9 binderC0983o9 = new BinderC0983o9();
            c0077n.getClass();
            ((InterfaceC0947na) new C0059e(this, binderC0983o9).d(this, false)).j0(intent);
        } catch (RemoteException e4) {
            Y9.p("RemoteException calling handleNotificationIntent: ".concat(e4.toString()));
        }
    }
}
