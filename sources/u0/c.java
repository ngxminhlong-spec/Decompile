package u0;

import Q1.E;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import n0.n;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f14970h = n.h("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final E f14971g;

    public c(Context context, InterfaceC2132a interfaceC2132a) {
        super(context, interfaceC2132a);
        this.f14971g = new E(7, this);
    }

    @Override // u0.d
    public final void d() {
        n.d().a(f14970h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f14974b.registerReceiver(this.f14971g, f());
    }

    @Override // u0.d
    public final void e() {
        n.d().a(f14970h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f14974b.unregisterReceiver(this.f14971g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
