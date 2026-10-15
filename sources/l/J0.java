package l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.Gh;
import com.google.android.gms.internal.ads.Qq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import t2.C1995b;
import t2.C1997d;
import t2.C2003j;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J0 implements y1.b, t2.F {

    /* renamed from: o, reason: collision with root package name */
    public Object f13637o;

    /* renamed from: p, reason: collision with root package name */
    public Object f13638p;

    /* renamed from: q, reason: collision with root package name */
    public Object f13639q;

    /* renamed from: r, reason: collision with root package name */
    public Object f13640r;

    /* renamed from: s, reason: collision with root package name */
    public Object f13641s;

    /* renamed from: t, reason: collision with root package name */
    public Object f13642t;

    /* renamed from: u, reason: collision with root package name */
    public Object f13643u;

    public J0() {
        this.f13642t = new r.i(0);
        this.f13643u = new r.i(0);
    }

    public J0(Gh gh, WebView webView, String str, Qq qq) {
        this.f13639q = new ArrayList();
        this.f13640r = new HashMap();
        this.f13637o = gh;
        this.f13638p = webView;
        this.f13643u = qq;
        this.f13642t = str;
        this.f13641s = "";
    }

    public /* synthetic */ J0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f13637o = obj;
        this.f13638p = obj2;
        this.f13639q = obj3;
        this.f13640r = obj4;
        this.f13641s = obj5;
        this.f13642t = obj6;
        this.f13643u = obj7;
    }

    @Override // t2.H
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1995b c() {
        Application application = (Application) ((t2.G) this.f13637o).f14862o;
        Handler handler = t2.s.f14935a;
        t2.r.c(handler);
        o3.i iVar = t2.s.f14936b;
        t2.r.c(iVar);
        return new C1995b(application, handler, iVar, (C1997d) ((t2.E) this.f13639q).c(), (C2003j) ((t2.E) this.f13640r).c(), ((q2.e) this.f13641s).D(), ((q2.e) this.f13642t).B(), (t2.J) ((t2.E) this.f13643u).c());
    }

    @Override // I3.a
    public Object get() {
        return new C1.l((Context) ((I3.a) this.f13637o).get(), (x1.d) ((I3.a) this.f13638p).get(), (D1.d) ((I3.a) this.f13639q).get(), (q2.e) ((q2.e) this.f13640r).get(), (Executor) ((I3.a) this.f13641s).get(), (E1.c) ((I3.a) this.f13642t).get(), new V2.e(6), new C2033d(5), (D1.c) ((I3.a) this.f13643u).get());
    }
}
