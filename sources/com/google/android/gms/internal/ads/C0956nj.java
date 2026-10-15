package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956nj {

    /* renamed from: a, reason: collision with root package name */
    public final Jp f9765a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9766b;
    public final Oj c;
    public final Ej d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f9767e;

    /* renamed from: f, reason: collision with root package name */
    public final C0658gk f9768f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1263uq f9769g;

    /* renamed from: h, reason: collision with root package name */
    public final Oq f9770h;

    /* renamed from: i, reason: collision with root package name */
    public final Xl f9771i;

    public C0956nj(Jp jp, Executor executor, Oj oj, Context context, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq, Oq oq, Xl xl, Ej ej) {
        this.f9765a = jp;
        this.f9766b = executor;
        this.c = oj;
        this.f9767e = context;
        this.f9768f = c0658gk;
        this.f9769g = interfaceC1263uq;
        this.f9770h = oq;
        this.f9771i = xl;
        this.d = ej;
    }

    public static final void b(C0348Ud c0348Ud) {
        c0348Ud.A0("/videoClicked", AbstractC0554e8.d);
        C0396ae c0396ae = c0348Ud.f7165o.f7464A;
        synchronized (c0396ae.f8144r) {
            c0396ae.f8128F = true;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10243j3)).booleanValue()) {
            c0348Ud.A0("/getNativeAdViewSignals", AbstractC0554e8.f8572n);
        }
        c0348Ud.A0("/getNativeClickMeta", AbstractC0554e8.f8573o);
    }

    public final void a(C0348Ud c0348Ud) {
        b(c0348Ud);
        c0348Ud.A0("/video", AbstractC0554e8.f8565g);
        c0348Ud.A0("/videoMeta", AbstractC0554e8.f8566h);
        c0348Ud.A0("/precache", new C0427b8(28));
        c0348Ud.A0("/delayPageLoaded", AbstractC0554e8.f8569k);
        c0348Ud.A0("/instrument", AbstractC0554e8.f8567i);
        c0348Ud.A0("/log", AbstractC0554e8.c);
        c0348Ud.A0("/click", new C0469c8(0, null, null));
        if (this.f9765a.f5909b != null) {
            C0396ae c0396ae = c0348Ud.f7165o.f7464A;
            synchronized (c0396ae.f8144r) {
                c0396ae.f8129G = true;
            }
            c0348Ud.A0("/open", new C0853l8(null, null, null, null, null, null));
        } else {
            c0348Ud.f7165o.f7464A.a(false);
        }
        if (N1.n.f1204A.f1225w.j(c0348Ud.getContext())) {
            c0348Ud.A0("/logScionEvent", new C0683h8(c0348Ud.getContext(), 0));
        }
    }
}
