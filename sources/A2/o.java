package A2;

import O1.C0101z0;
import Q1.H;
import S3.e;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import b0.RunnableC0203p;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1249uc;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0466c5;
import com.google.android.gms.internal.ads.C0873lm;
import com.google.android.gms.internal.ads.C0916mm;
import com.google.android.gms.internal.ads.C1227tx;
import com.google.android.gms.internal.ads.Eq;
import com.google.android.gms.internal.ads.F4;
import com.google.android.gms.internal.ads.G4;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.Y9;
import f0.C1673a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import m2.AbstractC1806a;
import p1.C1908F;
import p1.C1910H;
import q1.AbstractC1954i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o implements b1.e, Mu {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f34o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35p;

    /* renamed from: q, reason: collision with root package name */
    public Object f36q;

    /* renamed from: r, reason: collision with root package name */
    public Object f37r;

    public o(int i4) {
        this.f34o = i4;
        switch (i4) {
            case 3:
                this.f36q = new Object();
                this.f37r = null;
                this.f35p = false;
                return;
            case 5:
                this.f37r = AbstractC1249uc.f10789b;
                return;
            case 8:
                this.f36q = new ArrayList();
                this.f37r = C1227tx.f10760b;
                this.f35p = false;
                return;
            default:
                this.f36q = new Object();
                return;
        }
    }

    public /* synthetic */ o(int i4, boolean z4) {
        this.f34o = i4;
    }

    public o(Context context, int i4) {
        this.f34o = i4;
        switch (i4) {
            case 5:
                ExecutorService executorService = AbstractC1249uc.f10789b;
                this.f37r = executorService;
                executorService.execute(new RunnableC0203p(6, this, context));
                return;
            default:
                this.f36q = new Object();
                return;
        }
    }

    public o(Eq eq, Aq aq, boolean z4) {
        this.f34o = 7;
        this.f36q = eq;
        this.f37r = aq;
        this.f35p = z4;
    }

    public o(C0873lm c0873lm, C0272Fc c0272Fc) {
        this.f34o = 6;
        this.f36q = c0873lm;
        this.f37r = c0272Fc;
        this.f35p = false;
    }

    public o(f0.d dVar) {
        this.f34o = 9;
        this.f36q = dVar;
        this.f37r = new H();
    }

    public static /* bridge */ /* synthetic */ void n(o oVar) {
        synchronized (oVar.f36q) {
            try {
                C0466c5 c0466c5 = (C0466c5) oVar.f37r;
                if (c0466c5 == null) {
                    return;
                }
                c0466c5.k();
                oVar.f37r = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.lifecycle.i, f0.d] */
    public void a(Bundle bundle) {
        final H h4 = (H) this.f37r;
        ?? r1 = this.f36q;
        if (!this.f35p) {
            androidx.lifecycle.k f4 = r1.f();
            if (f4.c != androidx.lifecycle.g.f2969p) {
                throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
            }
            f4.a(new Recreator(r1));
            h4.getClass();
            if (h4.f1633a) {
                throw new IllegalStateException("SavedStateRegistry was already attached.");
            }
            f4.a(new androidx.lifecycle.h() { // from class: f0.b
                @Override // androidx.lifecycle.h
                public final void a(i iVar, f fVar) {
                    H h5 = H.this;
                    e.e(h5, "this$0");
                    if (fVar == f.ON_START) {
                        h5.c = true;
                    } else if (fVar == f.ON_STOP) {
                        h5.c = false;
                    }
                }
            });
            h4.f1633a = true;
            this.f35p = true;
        }
        androidx.lifecycle.k f5 = r1.f();
        if (f5.c.a()) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + f5.c).toString());
        }
        if (!h4.f1633a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (h4.f1634b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        h4.f1635e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        h4.f1634b = true;
    }

    public void b(Bundle bundle) {
        S3.e.e(bundle, "outBundle");
        H h4 = (H) this.f37r;
        h4.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) h4.f1635e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) h4.d;
        fVar.getClass();
        n.d dVar = new n.d(fVar);
        fVar.f14069q.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            String str = (String) entry.getKey();
            C1673a c1673a = (C1673a) entry.getValue();
            c1673a.getClass();
            Bundle bundle4 = new Bundle();
            bundle4.putStringArrayList("classes_to_restore", new ArrayList<>(c1673a.f12953a));
            bundle2.putBundle(str, bundle4);
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public Activity c() {
        synchronized (this.f36q) {
            try {
                F4 f4 = (F4) this.f37r;
                if (f4 == null) {
                    return null;
                }
                return f4.f4976o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(int i4) {
        if (this.f35p) {
            return;
        }
        this.f35p = true;
        o(new C0101z0(i4, "Error from: " + ((C0873lm) this.f36q).f9462a + ", code: " + i4, "undefined", null, null));
    }

    public void e(n nVar) {
        synchronized (this.f36q) {
            try {
                if (((ArrayDeque) this.f37r) == null) {
                    this.f37r = new ArrayDeque();
                }
                ((ArrayDeque) this.f37r).add(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Application f() {
        synchronized (this.f36q) {
            try {
                F4 f4 = (F4) this.f37r;
                if (f4 == null) {
                    return null;
                }
                return f4.f4977p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(h hVar) {
        n nVar;
        synchronized (this.f36q) {
            if (((ArrayDeque) this.f37r) != null && !this.f35p) {
                this.f35p = true;
                while (true) {
                    synchronized (this.f36q) {
                        try {
                            nVar = (n) ((ArrayDeque) this.f37r).poll();
                            if (nVar == null) {
                                this.f35p = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nVar.d(hVar);
                }
            }
        }
    }

    public synchronized void h(C0101z0 c0101z0) {
        if (this.f35p) {
            return;
        }
        this.f35p = true;
        o(c0101z0);
    }

    public void i(G4 g4) {
        synchronized (this.f36q) {
            try {
                if (((F4) this.f37r) == null) {
                    this.f37r = new F4();
                }
                ((F4) this.f37r).a(g4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b1.e
    public void j(Canvas canvas) {
        switch (this.f34o) {
            case 1:
                boolean z4 = this.f35p;
                Drawable drawable = (Drawable) this.f37r;
                C1908F c1908f = (C1908F) this.f36q;
                float f4 = c1908f.f14404V;
                float f5 = c1908f.f14403U / 5.0f;
                if (f5 > 0.8d) {
                    f5 = 0.8f;
                }
                if (f5 < 0.17d) {
                    f5 = 0.0f;
                }
                drawable.setAlpha((int) (255.0f * f5));
                float G3 = c1908f.G();
                float F2 = c1908f.F();
                int i4 = (int) (G3 / 2.0f);
                int i5 = (int) (0.05f * G3);
                int i6 = (int) (0.3f * F2);
                if (f5 > 0.0f) {
                    canvas.translate(i5, i6);
                    drawable.setBounds(0, 0, i4, i4);
                    drawable.draw(canvas);
                    canvas.translate(-i5, -i6);
                }
                int i7 = (int) (0.4f * F2);
                if (z4) {
                    double d = G3;
                    i4 = (int) (d - (d / 6.7d));
                }
                canvas.translate(i4, i7);
                AbstractC1806a.j(canvas, c1908f, z4);
                canvas.translate(-i4, -i7);
                int i8 = (int) (G3 / 1.8d);
                int i9 = (int) (F2 * 0.8f);
                canvas.translate(i8, i9);
                AbstractC1954i.d(canvas, f4 + " lux", 0.0f, 0.0f, Paint.Align.LEFT);
                canvas.translate((float) (-i8), (float) (-i9));
                return;
            default:
                C1910H c1910h = (C1910H) this.f36q;
                float G4 = c1910h.G();
                float F4 = c1910h.F();
                int i10 = (int) (0.1f * G4);
                int i11 = (int) (0.7f * F4);
                boolean z5 = this.f35p;
                canvas.translate(z5 ? (int) (G4 / 2.0f) : i10, i11);
                AbstractC1806a.j(canvas, c1910h, z5);
                canvas.translate(-r7, -i11);
                double d4 = G4;
                canvas.translate((int) (0.8d * d4), (int) (0.75f * F4));
                AbstractC1954i.d(canvas, U.a.l(new StringBuilder(), c1910h.f14418W, " uT"), 0.0f, 0.0f, Paint.Align.LEFT);
                canvas.translate(-r7, -r8);
                int i12 = (int) ((c1910h.f14416U / 5.0f) * G4);
                if (i12 >= 0.1d * d4) {
                    i10 = i12;
                }
                if (i10 > d4 * 0.9d) {
                    i10 = (int) (G4 * 0.9f);
                }
                canvas.translate(i10, (int) (0.56f * F4));
                float f6 = (F4 / 19.0f) / 2.0f;
                canvas.drawCircle(0.0f, f6, f6, (Paint) this.f37r);
                canvas.translate(-i10, -r0);
                return;
        }
    }

    public synchronized void k(String str, int i4) {
        try {
            if (this.f35p) {
                return;
            }
            this.f35p = true;
            if (str == null) {
                str = "Error from: " + ((C0873lm) this.f36q).f9462a + ", code: " + i4;
            }
            o(new C0101z0(i4, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l() {
        ((C0272Fc) this.f37r).b(null);
    }

    public void m(Context context) {
        synchronized (this.f36q) {
            try {
                if (!this.f35p) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        Y9.s("Can not cast Context to Application");
                        return;
                    }
                    if (((F4) this.f37r) == null) {
                        this.f37r = new F4();
                    }
                    F4 f4 = (F4) this.f37r;
                    if (!f4.f4984w) {
                        application.registerActivityLifecycleCallbacks(f4);
                        if (context instanceof Activity) {
                            f4.c((Activity) context);
                        }
                        f4.f4977p = application;
                        f4.f4985x = ((Long) O1.r.d.c.a(AbstractC1066q6.f10111H0)).longValue();
                        f4.f4984w = true;
                    }
                    this.f35p = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void o(C0101z0 c0101z0) {
        int i4 = 1;
        if (true == ((Boolean) O1.r.d.c.a(AbstractC1066q6.F4)).booleanValue()) {
            i4 = 3;
        }
        ((C0272Fc) this.f37r).c(new C0916mm(i4, c0101z0));
    }

    public void p(G4 g4) {
        synchronized (this.f36q) {
            try {
                F4 f4 = (F4) this.f37r;
                if (f4 == null) {
                    return;
                }
                f4.b(g4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        Aq aq = (Aq) this.f37r;
        aq.b(true);
        Eq eq = (Eq) this.f36q;
        eq.a(aq);
        if (this.f35p) {
            eq.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        Eq eq = (Eq) this.f36q;
        Aq aq = (Aq) this.f37r;
        if (aq.j()) {
            aq.d(th);
            aq.b(false);
            eq.a(aq);
            if (this.f35p) {
                eq.g();
            }
        }
    }
}
