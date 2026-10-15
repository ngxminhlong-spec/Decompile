package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L3 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6120b;

    public /* synthetic */ L3(int i4, Object obj) {
        this.f6119a = i4;
        this.f6120b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f6119a) {
            case 1:
                ((C1035pc) this.f6120b).f9980o.set(true);
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f6119a) {
            case 0:
                synchronized (M3.class) {
                    ((M3) this.f6120b).f6208p = networkCapabilities;
                }
                return;
            case 1:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
            case 2:
                n0.n.d().a(u0.e.f14976j, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                u0.e eVar = (u0.e) this.f6120b;
                eVar.c(eVar.f());
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f6119a) {
            case 0:
                synchronized (M3.class) {
                    ((M3) this.f6120b).f6208p = null;
                }
                return;
            case 1:
                ((C1035pc) this.f6120b).f9980o.set(false);
                return;
            default:
                n0.n.d().a(u0.e.f14976j, "Network connection lost", new Throwable[0]);
                u0.e eVar = (u0.e) this.f6120b;
                eVar.c(eVar.f());
                return;
        }
    }
}
