package X3;

import L3.i;
import S3.e;
import W3.AbstractC0134m;
import W3.AbstractC0144x;
import W3.InterfaceC0142v;
import W3.r;
import Y3.n;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends AbstractC0134m implements InterfaceC0142v {

    /* renamed from: q, reason: collision with root package name */
    public final Handler f2134q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2135r;

    /* renamed from: s, reason: collision with root package name */
    public final c f2136s;

    public c(Handler handler, boolean z4) {
        this.f2134q = handler;
        this.f2135r = z4;
        this.f2136s = z4 ? this : new c(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f2134q == this.f2134q && cVar.f2135r == this.f2135r;
    }

    @Override // W3.AbstractC0134m
    public final void g(i iVar, Runnable runnable) {
        if (this.f2134q.post(runnable)) {
            return;
        }
        r.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        AbstractC0144x.f2125b.g(iVar, runnable);
    }

    @Override // W3.AbstractC0134m
    public final boolean h() {
        return (this.f2135r && e.a(Looper.myLooper(), this.f2134q.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2134q) ^ (this.f2135r ? 1231 : 1237);
    }

    @Override // W3.AbstractC0134m
    public final String toString() {
        c cVar;
        String str;
        Z3.e eVar = AbstractC0144x.f2124a;
        c cVar2 = n.f2248a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f2136s;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f2134q.toString();
        return this.f2135r ? n0.a.h(handler, ".immediate") : handler;
    }
}
