package u0;

import Q1.E;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.internal.ads.L3;
import n0.n;
import s0.C1970a;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f14976j = n.h("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f14977g;

    /* renamed from: h, reason: collision with root package name */
    public final L3 f14978h;

    /* renamed from: i, reason: collision with root package name */
    public final E f14979i;

    public e(Context context, InterfaceC2132a interfaceC2132a) {
        super(context, interfaceC2132a);
        this.f14977g = (ConnectivityManager) this.f14974b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14978h = new L3(2, this);
        } else {
            this.f14979i = new E(8, this);
        }
    }

    @Override // u0.d
    public final Object a() {
        return f();
    }

    @Override // u0.d
    public final void d() {
        int i4 = Build.VERSION.SDK_INT;
        String str = f14976j;
        if (i4 < 24) {
            n.d().a(str, "Registering broadcast receiver", new Throwable[0]);
            this.f14974b.registerReceiver(this.f14979i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            n.d().a(str, "Registering network callback", new Throwable[0]);
            this.f14977g.registerDefaultNetworkCallback(this.f14978h);
        } catch (IllegalArgumentException | SecurityException e4) {
            n.d().c(str, "Received exception while registering network callback", e4);
        }
    }

    @Override // u0.d
    public final void e() {
        int i4 = Build.VERSION.SDK_INT;
        String str = f14976j;
        if (i4 < 24) {
            n.d().a(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.f14974b.unregisterReceiver(this.f14979i);
            return;
        }
        try {
            n.d().a(str, "Unregistering network callback", new Throwable[0]);
            this.f14977g.unregisterNetworkCallback(this.f14978h);
        } catch (IllegalArgumentException | SecurityException e4) {
            n.d().c(str, "Received exception while unregistering network callback", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [s0.a, java.lang.Object] */
    public final C1970a f() {
        boolean z4;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f14977g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z5 = false;
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e4) {
            n.d().c(f14976j, "Unable to validate active network", e4);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z4 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z5 = true;
                }
                ?? obj = new Object();
                obj.f14759a = z6;
                obj.f14760b = z4;
                obj.c = isActiveNetworkMetered;
                obj.d = z5;
                return obj;
            }
        }
        z4 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z5 = true;
        }
        ?? obj2 = new Object();
        obj2.f14759a = z6;
        obj2.f14760b = z4;
        obj2.c = isActiveNetworkMetered2;
        obj2.d = z5;
        return obj2;
    }
}
