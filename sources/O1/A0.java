package O1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.C1233u2;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.C1448z2;
import com.google.android.gms.internal.ads.D2;
import com.google.android.gms.internal.ads.D4;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.M3;
import com.google.android.gms.internal.ads.N2;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Y9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1254b;
    public final Object c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1255e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1256f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f1257g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1258h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1259i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f1260j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1261k;

    public A0(H1.i iVar) {
        this.f1253a = new BinderC0983o9();
        this.c = new C0258Da(6);
        this.d = new C0099y0(this);
        this.f1261k = iVar;
        this.f1254b = W0.f1318o;
        this.f1259i = null;
        new AtomicBoolean(false);
    }

    public A0(N2 n22, C0874ln c0874ln) {
        M3 m32 = new M3(new Handler(Looper.getMainLooper()));
        this.f1253a = new AtomicInteger();
        this.f1254b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.f1259i = new ArrayList();
        this.f1260j = new ArrayList();
        this.f1255e = n22;
        this.f1256f = c0874ln;
        this.f1257g = new C1448z2[4];
        this.f1261k = m32;
    }

    public static X0 a(Context context, H1.f[] fVarArr) {
        for (H1.f fVar : fVarArr) {
            if (fVar.equals(H1.f.f866j)) {
                return new X0("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        X0 x02 = new X0(context, fVarArr);
        x02.f1331x = false;
        return x02;
    }

    public void b(D2 d22) {
        d22.f4578v = this;
        synchronized (((HashSet) this.f1254b)) {
            ((HashSet) this.f1254b).add(d22);
        }
        d22.f4577u = Integer.valueOf(((AtomicInteger) this.f1253a).incrementAndGet());
        d22.d("add-to-queue");
        c();
        ((PriorityBlockingQueue) this.c).add(d22);
    }

    public void c() {
        synchronized (((ArrayList) this.f1260j)) {
            try {
                Iterator it = ((ArrayList) this.f1260j).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        C1233u2 c1233u2 = (C1233u2) this.f1258h;
        if (c1233u2 != null) {
            c1233u2.f10775r = true;
            c1233u2.interrupt();
        }
        C1448z2[] c1448z2Arr = (C1448z2[]) this.f1257g;
        for (int i4 = 0; i4 < 4; i4++) {
            C1448z2 c1448z2 = c1448z2Arr[i4];
            if (c1448z2 != null) {
                c1448z2.f11571r = true;
                c1448z2.interrupt();
            }
        }
        C1233u2 c1233u22 = new C1233u2((PriorityBlockingQueue) this.c, (PriorityBlockingQueue) this.d, (N2) this.f1255e, (M3) this.f1261k);
        this.f1258h = c1233u22;
        c1233u22.start();
        for (int i5 = 0; i5 < 4; i5++) {
            C1448z2 c1448z22 = new C1448z2((PriorityBlockingQueue) this.d, (C0874ln) this.f1256f, (N2) this.f1255e, (M3) this.f1261k);
            ((C1448z2[]) this.f1257g)[i5] = c1448z22;
            c1448z22.start();
        }
    }

    public void e(C0097x0 c0097x0) {
        H1.i iVar = (H1.i) this.f1261k;
        try {
            if (((J) this.f1259i) == null) {
                if (((H1.f[]) this.f1257g) == null || ((String) this.f1260j) == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = iVar.getContext();
                X0 a4 = a(context, (H1.f[]) this.f1257g);
                J j4 = "search_v2".equals(a4.f1322o) ? (J) new C0065h(C0081p.f1374f.f1376b, context, a4, (String) this.f1260j).d(context, false) : (J) new C0061f(C0081p.f1374f.f1376b, context, a4, (String) this.f1260j, (BinderC0983o9) this.f1253a).d(context, false);
                this.f1259i = j4;
                j4.w3(new S0((C0099y0) this.d));
                InterfaceC0051a interfaceC0051a = (InterfaceC0051a) this.f1255e;
                if (interfaceC0051a != null) {
                    ((J) this.f1259i).q3(new BinderC0083q(interfaceC0051a));
                }
                I1.b bVar = (I1.b) this.f1258h;
                if (bVar != null) {
                    ((J) this.f1259i).r1(new D4(bVar));
                }
                ((J) this.f1259i).f3(new O0());
                ((J) this.f1259i).B3(false);
                J j5 = (J) this.f1259i;
                if (j5 != null) {
                    try {
                        InterfaceC1812a m4 = j5.m();
                        if (m4 != null) {
                            if (((Boolean) L6.f6126f.r()).booleanValue()) {
                                if (((Boolean) r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                                    C1335wc.f11173b.post(new Nu(23, this, m4));
                                }
                            }
                            iVar.addView((View) BinderC1813b.C2(m4));
                        }
                    } catch (RemoteException e4) {
                        Y9.u("#007 Could not call remote method.", e4);
                    }
                }
            }
            J j6 = (J) this.f1259i;
            if (j6 == null) {
                throw null;
            }
            W0 w02 = (W0) this.f1254b;
            Context context2 = iVar.getContext();
            w02.getClass();
            j6.h2(W0.a(context2, c0097x0));
        } catch (RemoteException e5) {
            Y9.u("#007 Could not call remote method.", e5);
        }
    }

    public void f(InterfaceC0051a interfaceC0051a) {
        try {
            this.f1255e = interfaceC0051a;
            J j4 = (J) this.f1259i;
            if (j4 != null) {
                j4.q3(interfaceC0051a != null ? new BinderC0083q(interfaceC0051a) : null);
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
