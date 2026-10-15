package X;

import H.Y;
import J3.f;
import W3.C0124c;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f2128a;

    public c(Context context) {
        Object systemService = context.getSystemService((Class<Object>) Y.l());
        S3.e.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f2128a = Y.d(systemService);
    }

    public Object a(a aVar, L3.d dVar) {
        new C0124c(AbstractC1806a.B(dVar)).l();
        Y.n();
        throw null;
    }

    public Object b(L3.d dVar) {
        C0124c c0124c = new C0124c(AbstractC1806a.B(dVar));
        c0124c.l();
        this.f2128a.getMeasurementApiStatus(new b(0), new D.c(c0124c));
        return c0124c.k();
    }

    public Object c(Uri uri, InputEvent inputEvent, L3.d dVar) {
        C0124c c0124c = new C0124c(AbstractC1806a.B(dVar));
        c0124c.l();
        this.f2128a.registerSource(uri, inputEvent, new b(0), new D.c(c0124c));
        Object k3 = c0124c.k();
        return k3 == M3.a.f1150o ? k3 : f.f1032a;
    }

    public Object d(Uri uri, L3.d dVar) {
        C0124c c0124c = new C0124c(AbstractC1806a.B(dVar));
        c0124c.l();
        this.f2128a.registerTrigger(uri, new b(0), new D.c(c0124c));
        Object k3 = c0124c.k();
        return k3 == M3.a.f1150o ? k3 : f.f1032a;
    }

    public Object e(d dVar, L3.d dVar2) {
        new C0124c(AbstractC1806a.B(dVar2)).l();
        Y.u();
        throw null;
    }

    public Object f(e eVar, L3.d dVar) {
        new C0124c(AbstractC1806a.B(dVar)).l();
        Y.v();
        throw null;
    }
}
