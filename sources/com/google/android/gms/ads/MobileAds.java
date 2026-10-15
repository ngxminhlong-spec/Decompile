package com.google.android.gms.ads;

import O1.D0;
import O1.InterfaceC0052a0;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.Y9;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        D0 f4 = D0.f();
        synchronized (f4.d) {
            y.k("MobileAds.initialize() must be called prior to setting the plugin.", ((InterfaceC0052a0) f4.f1271f) != null);
            try {
                ((InterfaceC0052a0) f4.f1271f).K(str);
            } catch (RemoteException e4) {
                Y9.q("Unable to set plugin.", e4);
            }
        }
    }
}
