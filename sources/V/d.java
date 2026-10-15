package V;

import S3.e;
import W3.AbstractC0144x;
import W3.r;
import android.net.Uri;
import android.view.InputEvent;
import c3.InterfaceFutureC0239a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final X.c f1832a;

    public d(X.c cVar) {
        this.f1832a = cVar;
    }

    public InterfaceFutureC0239a a(X.a aVar) {
        e.e(aVar, "deletionRequest");
        throw null;
    }

    public InterfaceFutureC0239a b() {
        return AbstractC1895f.a(r.b(r.a(AbstractC0144x.f2124a), new a(this, null)));
    }

    public InterfaceFutureC0239a c(Uri uri, InputEvent inputEvent) {
        e.e(uri, "attributionSource");
        return AbstractC1895f.a(r.b(r.a(AbstractC0144x.f2124a), new b(this, uri, inputEvent, null)));
    }

    public InterfaceFutureC0239a d(Uri uri) {
        e.e(uri, "trigger");
        return AbstractC1895f.a(r.b(r.a(AbstractC0144x.f2124a), new c(this, uri, null, 0)));
    }

    public InterfaceFutureC0239a e(X.d dVar) {
        e.e(dVar, "request");
        throw null;
    }

    public InterfaceFutureC0239a f(X.e eVar) {
        e.e(eVar, "request");
        throw null;
    }
}
