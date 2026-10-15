package N1;

import O1.C0081p;
import O1.r;
import Q1.N;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1064q4;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.E3;
import com.google.android.gms.internal.ads.G3;
import com.google.android.gms.internal.ads.H3;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Zf;
import java.io.File;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements Runnable, G3 {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f1162A;

    /* renamed from: C, reason: collision with root package name */
    public int f1164C;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1168r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1169s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1170t;

    /* renamed from: u, reason: collision with root package name */
    public final ExecutorService f1171u;

    /* renamed from: v, reason: collision with root package name */
    public final B0.c f1172v;

    /* renamed from: w, reason: collision with root package name */
    public Context f1173w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f1174x;
    public C0248Bc y;

    /* renamed from: z, reason: collision with root package name */
    public final C0248Bc f1175z;

    /* renamed from: o, reason: collision with root package name */
    public final Vector f1165o = new Vector();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f1166p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f1167q = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    public final CountDownLatch f1163B = new CountDownLatch(1);

    public g(Context context, C0248Bc c0248Bc) {
        this.f1173w = context;
        this.f1174x = context;
        this.y = c0248Bc;
        this.f1175z = c0248Bc;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f1171u = newCachedThreadPool;
        C0937n6 c0937n6 = AbstractC1066q6.f10171U1;
        r rVar = r.d;
        boolean booleanValue = ((Boolean) rVar.c.a(c0937n6)).booleanValue();
        this.f1162A = booleanValue;
        this.f1172v = B0.c.a(context, newCachedThreadPool, booleanValue);
        C0937n6 c0937n62 = AbstractC1066q6.f10156R1;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        this.f1169s = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).booleanValue();
        this.f1170t = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10176V1)).booleanValue();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10166T1)).booleanValue()) {
            this.f1164C = 2;
        } else {
            this.f1164C = 1;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10162S2)).booleanValue()) {
            this.f1168r = i();
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10135M2)).booleanValue()) {
            AbstractC0266Ec.f4897a.execute(this);
            return;
        }
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC0266Ec.f4897a.execute(this);
        } else {
            run();
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void a(MotionEvent motionEvent) {
        G3 k3 = k();
        if (k3 == null) {
            this.f1165o.add(new Object[]{motionEvent});
        } else {
            l();
            k3.a(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void b(View view) {
        G3 k3 = k();
        if (k3 != null) {
            k3.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void c(StackTraceElement[] stackTraceElementArr) {
        G3 k3;
        if (!j() || (k3 = k()) == null) {
            return;
        }
        k3.c(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String d(Context context, View view, Activity activity) {
        C0937n6 c0937n6 = AbstractC1066q6.Z8;
        r rVar = r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            G3 k3 = k();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.a9)).booleanValue()) {
                N n4 = n.f1204A.c;
                N.g(view, 2);
            }
            return k3 != null ? k3.d(context, view, activity) : "";
        }
        if (!j()) {
            return "";
        }
        G3 k4 = k();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.a9)).booleanValue()) {
            N n5 = n.f1204A.c;
            N.g(view, 2);
        }
        return k4 != null ? k4.d(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String e(Context context) {
        G3 k3;
        if (!j() || (k3 = k()) == null) {
            return "";
        }
        l();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return k3.e(context);
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void f(int i4, int i5, int i6) {
        G3 k3 = k();
        if (k3 == null) {
            this.f1165o.add(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)});
        } else {
            l();
            k3.f(i4, i5, i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final String h(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        G3 k3 = k();
        if (((Boolean) r.d.c.a(AbstractC1066q6.a9)).booleanValue()) {
            N n4 = n.f1204A.c;
            N.g(view, 4);
        }
        if (k3 == null) {
            return "";
        }
        l();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return k3.h(context, str, view, activity);
    }

    public final boolean i() {
        Context context = this.f1173w;
        x0.f fVar = new x0.f(15, this);
        Lr lr = new Lr(context, Zf.t(context, this.f1172v), fVar, ((Boolean) r.d.c.a(AbstractC1066q6.f10161S1)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (Lr.f6169t) {
            try {
                C1064q4 f4 = lr.f(1);
                if (f4 == null) {
                    lr.e(4025, currentTimeMillis);
                    return false;
                }
                File c = lr.c(f4.D());
                if (!new File(c, "pcam.jar").exists()) {
                    lr.e(4026, currentTimeMillis);
                    return false;
                }
                if (new File(c, "pcbc").exists()) {
                    lr.e(5019, currentTimeMillis);
                    return true;
                }
                lr.e(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j() {
        try {
            this.f1163B.await();
            return true;
        } catch (InterruptedException e4) {
            Y9.t("Interrupted during GADSignals creation.", e4);
            return false;
        }
    }

    public final G3 k() {
        return ((!this.f1169s || this.f1168r) ? this.f1164C : 1) == 2 ? (G3) this.f1167q.get() : (G3) this.f1166p.get();
    }

    public final void l() {
        G3 k3 = k();
        Vector vector = this.f1165o;
        if (vector.isEmpty() || k3 == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                k3.a((MotionEvent) objArr[0]);
            } else if (length == 3) {
                k3.f(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void m(boolean z4) {
        String str = this.y.f4084o;
        Context context = this.f1173w;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        H3.t(context, z4);
        this.f1166p.set(new H3(context, str, z4));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            C0937n6 c0937n6 = AbstractC1066q6.f10162S2;
            r rVar = r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                this.f1168r = i();
            }
            boolean z5 = this.y.f4087r;
            boolean z6 = false;
            if (!((Boolean) rVar.c.a(AbstractC1066q6.f10128L0)).booleanValue() && z5) {
                z6 = true;
            }
            if (((!this.f1169s || this.f1168r) ? this.f1164C : 1) == 1) {
                m(z6);
                if (this.f1164C == 2) {
                    this.f1171u.execute(new f(this, z6, 0));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.y.f4084o;
                    Context context = this.f1173w;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    E3 i4 = E3.i(context, str, z6, this.f1162A);
                    this.f1167q.set(i4);
                    if (this.f1170t) {
                        synchronized (i4) {
                            z4 = i4.f4822D;
                        }
                        if (!z4) {
                            this.f1164C = 1;
                            m(z6);
                        }
                    }
                } catch (NullPointerException e4) {
                    this.f1164C = 1;
                    m(z6);
                    this.f1172v.d(2031, System.currentTimeMillis() - currentTimeMillis, e4);
                }
            }
            this.f1163B.countDown();
            this.f1173w = null;
            this.y = null;
        } catch (Throwable th) {
            this.f1163B.countDown();
            this.f1173w = null;
            this.y = null;
            throw th;
        }
    }
}
