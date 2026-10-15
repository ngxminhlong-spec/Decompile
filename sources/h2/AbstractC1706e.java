package h2;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c0.C0228i;
import com.google.android.gms.common.api.Scope;
import e2.C1664b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C1961b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1706e {

    /* renamed from: L, reason: collision with root package name */
    public static final e2.d[] f13162L = new e2.d[0];

    /* renamed from: A, reason: collision with root package name */
    public ServiceConnectionC1700B f13163A;

    /* renamed from: B, reason: collision with root package name */
    public int f13164B;

    /* renamed from: C, reason: collision with root package name */
    public final InterfaceC1703b f13165C;

    /* renamed from: D, reason: collision with root package name */
    public final InterfaceC1704c f13166D;

    /* renamed from: E, reason: collision with root package name */
    public final int f13167E;

    /* renamed from: F, reason: collision with root package name */
    public final String f13168F;

    /* renamed from: G, reason: collision with root package name */
    public volatile String f13169G;

    /* renamed from: H, reason: collision with root package name */
    public C1664b f13170H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f13171I;

    /* renamed from: J, reason: collision with root package name */
    public volatile E f13172J;

    /* renamed from: K, reason: collision with root package name */
    public final AtomicInteger f13173K;

    /* renamed from: o, reason: collision with root package name */
    public volatile String f13174o;

    /* renamed from: p, reason: collision with root package name */
    public C0228i f13175p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f13176q;

    /* renamed from: r, reason: collision with root package name */
    public final I f13177r;

    /* renamed from: s, reason: collision with root package name */
    public final e2.f f13178s;

    /* renamed from: t, reason: collision with root package name */
    public final z f13179t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f13180u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f13181v;

    /* renamed from: w, reason: collision with root package name */
    public u f13182w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1705d f13183x;
    public IInterface y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f13184z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1706e(int r10, android.content.Context r11, android.os.Looper r12, h2.InterfaceC1703b r13, h2.InterfaceC1704c r14) {
        /*
            r9 = this;
            h2.I r3 = h2.I.a(r11)
            e2.f r4 = e2.f.f12753b
            h2.y.i(r13)
            h2.y.i(r14)
            r8 = 0
            r0 = r9
            r5 = r10
            r1 = r11
            r2 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.AbstractC1706e.<init>(int, android.content.Context, android.os.Looper, h2.b, h2.c):void");
    }

    public AbstractC1706e(Context context, Looper looper, I i4, e2.f fVar, int i5, InterfaceC1703b interfaceC1703b, InterfaceC1704c interfaceC1704c, String str) {
        this.f13174o = null;
        this.f13180u = new Object();
        this.f13181v = new Object();
        this.f13184z = new ArrayList();
        this.f13164B = 1;
        this.f13170H = null;
        this.f13171I = false;
        this.f13172J = null;
        this.f13173K = new AtomicInteger(0);
        y.j(context, "Context must not be null");
        this.f13176q = context;
        y.j(looper, "Looper must not be null");
        y.j(i4, "Supervisor must not be null");
        this.f13177r = i4;
        y.j(fVar, "API availability must not be null");
        this.f13178s = fVar;
        this.f13179t = new z(this, looper);
        this.f13167E = i5;
        this.f13165C = interfaceC1703b;
        this.f13166D = interfaceC1704c;
        this.f13168F = str;
    }

    public static /* bridge */ /* synthetic */ void x(AbstractC1706e abstractC1706e) {
        int i4;
        int i5;
        synchronized (abstractC1706e.f13180u) {
            i4 = abstractC1706e.f13164B;
        }
        if (i4 == 3) {
            abstractC1706e.f13171I = true;
            i5 = 5;
        } else {
            i5 = 4;
        }
        z zVar = abstractC1706e.f13179t;
        zVar.sendMessage(zVar.obtainMessage(i5, abstractC1706e.f13173K.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean y(AbstractC1706e abstractC1706e, int i4, int i5, IInterface iInterface) {
        synchronized (abstractC1706e.f13180u) {
            try {
                if (abstractC1706e.f13164B != i4) {
                    return false;
                }
                abstractC1706e.z(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z4;
        synchronized (this.f13180u) {
            z4 = this.f13164B == 4;
        }
        return z4;
    }

    public final void b(InterfaceC1710i interfaceC1710i, Set set) {
        Bundle r4 = r();
        String str = this.f13169G;
        int i4 = e2.f.f12752a;
        Scope[] scopeArr = C1708g.f13191C;
        Bundle bundle = new Bundle();
        int i5 = this.f13167E;
        e2.d[] dVarArr = C1708g.f13192D;
        C1708g c1708g = new C1708g(6, i5, i4, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c1708g.f13198r = this.f13176q.getPackageName();
        c1708g.f13201u = r4;
        if (set != null) {
            c1708g.f13200t = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account p3 = p();
            if (p3 == null) {
                p3 = new Account("<<default account>>", "com.google");
            }
            c1708g.f13202v = p3;
            if (interfaceC1710i != null) {
                c1708g.f13199s = interfaceC1710i.asBinder();
            }
        }
        c1708g.f13203w = f13162L;
        c1708g.f13204x = q();
        if (this instanceof C1961b) {
            c1708g.f13193A = true;
        }
        try {
            synchronized (this.f13181v) {
                try {
                    u uVar = this.f13182w;
                    if (uVar != null) {
                        uVar.O(new BinderC1699A(this, this.f13173K.get()), c1708g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i6 = this.f13173K.get();
            z zVar = this.f13179t;
            zVar.sendMessage(zVar.obtainMessage(6, i6, 3));
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.f13173K.get();
            C1701C c1701c = new C1701C(this, 8, null, null);
            z zVar2 = this.f13179t;
            zVar2.sendMessage(zVar2.obtainMessage(1, i7, -1, c1701c));
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i72 = this.f13173K.get();
            C1701C c1701c2 = new C1701C(this, 8, null, null);
            z zVar22 = this.f13179t;
            zVar22.sendMessage(zVar22.obtainMessage(1, i72, -1, c1701c2));
        }
    }

    public final void d(x0.f fVar) {
        ((g2.m) fVar.f15212p).f13005A.f12989A.post(new D0.o(28, fVar));
    }

    public final void e(String str) {
        this.f13174o = str;
        k();
    }

    public int f() {
        return e2.f.f12752a;
    }

    public final boolean g() {
        boolean z4;
        synchronized (this.f13180u) {
            int i4 = this.f13164B;
            z4 = true;
            if (i4 != 2 && i4 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    public final e2.d[] h() {
        E e4 = this.f13172J;
        if (e4 == null) {
            return null;
        }
        return e4.f13141p;
    }

    public final void i() {
        if (!a() || this.f13175p == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final String j() {
        return this.f13174o;
    }

    public final void k() {
        this.f13173K.incrementAndGet();
        synchronized (this.f13184z) {
            try {
                int size = this.f13184z.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((s) this.f13184z.get(i4)).c();
                }
                this.f13184z.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f13181v) {
            this.f13182w = null;
        }
        z(1, null);
    }

    public boolean l() {
        return false;
    }

    public final void m(InterfaceC1705d interfaceC1705d) {
        this.f13183x = interfaceC1705d;
        z(2, null);
    }

    public final void n() {
        int c = this.f13178s.c(this.f13176q, f());
        if (c == 0) {
            m(new k(this));
            return;
        }
        z(1, null);
        this.f13183x = new k(this);
        int i4 = this.f13173K.get();
        z zVar = this.f13179t;
        zVar.sendMessage(zVar.obtainMessage(3, i4, c, null));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public e2.d[] q() {
        return f13162L;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f13180u) {
            try {
                if (this.f13164B == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.y;
                y.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return f() >= 211700000;
    }

    public final void z(int i4, IInterface iInterface) {
        C0228i c0228i;
        y.b((i4 == 4) == (iInterface != null));
        synchronized (this.f13180u) {
            try {
                this.f13164B = i4;
                this.y = iInterface;
                if (i4 == 1) {
                    ServiceConnectionC1700B serviceConnectionC1700B = this.f13163A;
                    if (serviceConnectionC1700B != null) {
                        I i5 = this.f13177r;
                        String str = this.f13175p.f3532b;
                        y.i(str);
                        this.f13175p.getClass();
                        if (this.f13168F == null) {
                            this.f13176q.getClass();
                        }
                        i5.c(str, serviceConnectionC1700B, this.f13175p.f3531a);
                        this.f13163A = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    ServiceConnectionC1700B serviceConnectionC1700B2 = this.f13163A;
                    if (serviceConnectionC1700B2 != null && (c0228i = this.f13175p) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c0228i.f3532b + " on com.google.android.gms");
                        I i6 = this.f13177r;
                        String str2 = this.f13175p.f3532b;
                        y.i(str2);
                        this.f13175p.getClass();
                        if (this.f13168F == null) {
                            this.f13176q.getClass();
                        }
                        i6.c(str2, serviceConnectionC1700B2, this.f13175p.f3531a);
                        this.f13173K.incrementAndGet();
                    }
                    ServiceConnectionC1700B serviceConnectionC1700B3 = new ServiceConnectionC1700B(this, this.f13173K.get());
                    this.f13163A = serviceConnectionC1700B3;
                    String v4 = v();
                    boolean w2 = w();
                    this.f13175p = new C0228i(v4, w2);
                    if (w2 && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f13175p.f3532b)));
                    }
                    I i7 = this.f13177r;
                    String str3 = this.f13175p.f3532b;
                    y.i(str3);
                    this.f13175p.getClass();
                    String str4 = this.f13168F;
                    if (str4 == null) {
                        str4 = this.f13176q.getClass().getName();
                    }
                    if (!i7.d(new F(str3, this.f13175p.f3531a), serviceConnectionC1700B3, str4, null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f13175p.f3532b + " on com.google.android.gms");
                        int i8 = this.f13173K.get();
                        D d = new D(this, 16);
                        z zVar = this.f13179t;
                        zVar.sendMessage(zVar.obtainMessage(7, i8, -1, d));
                    }
                } else if (i4 == 4) {
                    y.i(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
