package s0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import n0.n;
import t0.AbstractC1989c;
import t0.C1987a;
import t0.InterfaceC1988b;
import u0.C2012a;
import u0.e;
import u0.f;
import u0.g;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements InterfaceC1988b {
    public static final String d = n.h("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f14761a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1989c[] f14762b;
    public final Object c;

    public c(Context context, InterfaceC2132a interfaceC2132a, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14761a = bVar;
        this.f14762b = new AbstractC1989c[]{new C1987a((C2012a) g.c(applicationContext, interfaceC2132a).f14983p, 0), new C1987a((u0.b) g.c(applicationContext, interfaceC2132a).f14984q, 1), new C1987a((f) g.c(applicationContext, interfaceC2132a).f14986s, 4), new C1987a((e) g.c(applicationContext, interfaceC2132a).f14985r, 2), new C1987a((e) g.c(applicationContext, interfaceC2132a).f14985r, 3), new AbstractC1989c((e) g.c(applicationContext, interfaceC2132a).f14985r), new AbstractC1989c((e) g.c(applicationContext, interfaceC2132a).f14985r)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            try {
                for (AbstractC1989c abstractC1989c : this.f14762b) {
                    Object obj = abstractC1989c.f14839b;
                    if (obj != null && abstractC1989c.b(obj) && abstractC1989c.f14838a.contains(str)) {
                        n.d().a(d, "Work " + str + " constrained by " + abstractC1989c.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.c) {
            try {
                b bVar = this.f14761a;
                if (bVar != null) {
                    bVar.c(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.c) {
            try {
                for (AbstractC1989c abstractC1989c : this.f14762b) {
                    if (abstractC1989c.d != null) {
                        abstractC1989c.d = null;
                        abstractC1989c.d(null, abstractC1989c.f14839b);
                    }
                }
                for (AbstractC1989c abstractC1989c2 : this.f14762b) {
                    abstractC1989c2.c(collection);
                }
                for (AbstractC1989c abstractC1989c3 : this.f14762b) {
                    if (abstractC1989c3.d != this) {
                        abstractC1989c3.d = this;
                        abstractC1989c3.d(this, abstractC1989c3.f14839b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.c) {
            try {
                for (AbstractC1989c abstractC1989c : this.f14762b) {
                    ArrayList arrayList = abstractC1989c.f14838a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC1989c.c.b(abstractC1989c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
