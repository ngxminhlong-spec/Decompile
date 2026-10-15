package g2;

import C0.C;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Ur;
import com.google.android.gms.internal.ads.Wl;
import e2.C1664b;
import h2.AbstractC1706e;
import h2.y;
import j2.C1733d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import o2.AbstractC1895f;
import y2.C2118a;
import z2.C2133a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m implements f2.g, f2.h {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1684d f13005A;

    /* renamed from: p, reason: collision with root package name */
    public final f2.c f13007p;

    /* renamed from: q, reason: collision with root package name */
    public final C1681a f13008q;

    /* renamed from: r, reason: collision with root package name */
    public final Wl f13009r;

    /* renamed from: u, reason: collision with root package name */
    public final int f13012u;

    /* renamed from: v, reason: collision with root package name */
    public final u f13013v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13014w;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedList f13006o = new LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f13010s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f13011t = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f13015x = new ArrayList();
    public C1664b y = null;

    /* renamed from: z, reason: collision with root package name */
    public int f13016z = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public m(C1684d c1684d, f2.f fVar) {
        this.f13005A = c1684d;
        Looper looper = c1684d.f12989A.getLooper();
        q2.e a4 = fVar.a();
        N1.l lVar = new N1.l((r.f) a4.f14709p, (String) a4.f14710q, (String) a4.f14711r);
        AbstractC1895f abstractC1895f = (AbstractC1895f) fVar.f12967q.f6710p;
        y.i(abstractC1895f);
        f2.c d = abstractC1895f.d(fVar.f12965o, looper, lVar, fVar.f12968r, this, this);
        String str = fVar.f12966p;
        if (str != null && (d instanceof AbstractC1706e)) {
            ((AbstractC1706e) d).f13169G = str;
        }
        if (str != null && (d instanceof h)) {
            U.a.t(d);
            throw null;
        }
        this.f13007p = d;
        this.f13008q = fVar.f12969s;
        this.f13009r = new Wl(14, (byte) 0);
        this.f13012u = fVar.f12970t;
        if (!d.l()) {
            this.f13013v = null;
            return;
        }
        Context context = c1684d.f12995s;
        Ur ur = c1684d.f12989A;
        q2.e a5 = fVar.a();
        this.f13013v = new u(context, ur, new N1.l((r.f) a5.f14709p, (String) a5.f14710q, (String) a5.f14711r));
    }

    @Override // f2.g
    public final void O(int i4) {
        Looper myLooper = Looper.myLooper();
        Ur ur = this.f13005A.f12989A;
        if (myLooper == ur.getLooper()) {
            f(i4);
        } else {
            ur.post(new C(i4, 12, this));
        }
    }

    @Override // f2.g
    public final void Q() {
        Looper myLooper = Looper.myLooper();
        Ur ur = this.f13005A.f12989A;
        if (myLooper == ur.getLooper()) {
            e();
        } else {
            ur.post(new D0.o(27, this));
        }
    }

    public final void a(C1664b c1664b) {
        HashSet hashSet = this.f13010s;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (y.m(c1664b, C1664b.f12741s)) {
                this.f13007p.i();
            }
            throw null;
        }
    }

    @Override // f2.h
    public final void a0(C1664b c1664b) {
        l(c1664b, null);
    }

    public final void b(Status status) {
        y.c(this.f13005A.f12989A);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z4) {
        y.c(this.f13005A.f12989A);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f13006o.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (!z4 || qVar.f13021a == 2) {
                if (status != null) {
                    qVar.c(status);
                } else {
                    qVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f13006o;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) arrayList.get(i4);
            if (!this.f13007p.a()) {
                return;
            }
            if (h(qVar)) {
                linkedList.remove(qVar);
            }
        }
    }

    public final void e() {
        C1684d c1684d = this.f13005A;
        y.c(c1684d.f12989A);
        this.y = null;
        a(C1664b.f12741s);
        Ur ur = c1684d.f12989A;
        if (this.f13014w) {
            C1681a c1681a = this.f13008q;
            ur.removeMessages(11, c1681a);
            ur.removeMessages(9, c1681a);
            this.f13014w = false;
        }
        Iterator it = this.f13011t.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d();
        g();
    }

    public final void f(int i4) {
        C1684d c1684d = this.f13005A;
        Ur ur = c1684d.f12989A;
        y.c(c1684d.f12989A);
        this.y = null;
        this.f13014w = true;
        String j4 = this.f13007p.j();
        Wl wl = this.f13009r;
        wl.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (j4 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(j4);
        }
        wl.g(true, new Status(20, sb.toString(), null, null));
        C1681a c1681a = this.f13008q;
        ur.sendMessageDelayed(Message.obtain(ur, 9, c1681a), 5000L);
        ur.sendMessageDelayed(Message.obtain(ur, 11, c1681a), 120000L);
        ((SparseIntArray) c1684d.f12997u.f9319p).clear();
        Iterator it = this.f13011t.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void g() {
        C1684d c1684d = this.f13005A;
        Ur ur = c1684d.f12989A;
        C1681a c1681a = this.f13008q;
        ur.removeMessages(12, c1681a);
        ur.sendMessageDelayed(ur.obtainMessage(12, c1681a), c1684d.f12991o);
    }

    public final boolean h(q qVar) {
        e2.d dVar;
        if (qVar == null) {
            Wl wl = this.f13009r;
            f2.c cVar = this.f13007p;
            qVar.f(wl, cVar.l());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                O(1);
                cVar.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        e2.d[] b4 = qVar.b(this);
        if (b4 != null && b4.length != 0) {
            e2.d[] h4 = this.f13007p.h();
            if (h4 == null) {
                h4 = new e2.d[0];
            }
            r.i iVar = new r.i(h4.length);
            for (e2.d dVar2 : h4) {
                iVar.put(dVar2.f12749o, Long.valueOf(dVar2.h()));
            }
            int length = b4.length;
            for (int i4 = 0; i4 < length; i4++) {
                dVar = b4[i4];
                Long l4 = (Long) iVar.get(dVar.f12749o);
                if (l4 == null || l4.longValue() < dVar.h()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            Wl wl2 = this.f13009r;
            f2.c cVar2 = this.f13007p;
            qVar.f(wl2, cVar2.l());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                O(1);
                cVar2.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f13007p.getClass().getName() + " could not execute call because it requires feature (" + dVar.f12749o + ", " + dVar.h() + ").");
        if (!this.f13005A.f12990B || !qVar.a(this)) {
            qVar.d(new f2.k(dVar));
            return true;
        }
        n nVar = new n(this.f13008q, dVar);
        int indexOf = this.f13015x.indexOf(nVar);
        if (indexOf >= 0) {
            n nVar2 = (n) this.f13015x.get(indexOf);
            this.f13005A.f12989A.removeMessages(15, nVar2);
            Ur ur = this.f13005A.f12989A;
            ur.sendMessageDelayed(Message.obtain(ur, 15, nVar2), 5000L);
        } else {
            this.f13015x.add(nVar);
            Ur ur2 = this.f13005A.f12989A;
            ur2.sendMessageDelayed(Message.obtain(ur2, 15, nVar), 5000L);
            Ur ur3 = this.f13005A.f12989A;
            ur3.sendMessageDelayed(Message.obtain(ur3, 16, nVar), 120000L);
            C1664b c1664b = new C1664b(2, null);
            if (!i(c1664b)) {
                this.f13005A.b(c1664b, this.f13012u);
            }
        }
        return false;
    }

    public final boolean i(C1664b c1664b) {
        synchronized (C1684d.f12987E) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [h2.d, java.lang.Object, B0.u] */
    public final void j() {
        C1684d c1684d = this.f13005A;
        y.c(c1684d.f12989A);
        f2.c cVar = this.f13007p;
        if (cVar.a() || cVar.g()) {
            return;
        }
        try {
            C0831kn c0831kn = c1684d.f12997u;
            Context context = c1684d.f12995s;
            SparseIntArray sparseIntArray = (SparseIntArray) c0831kn.f9319p;
            y.i(context);
            int f4 = cVar.f();
            int i4 = ((SparseIntArray) c0831kn.f9319p).get(f4, -1);
            if (i4 == -1) {
                i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= sparseIntArray.size()) {
                        i4 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i5);
                    if (keyAt > f4 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i4 == -1) {
                    i4 = ((e2.e) c0831kn.f9320q).c(context, f4);
                }
                sparseIntArray.put(f4, i4);
            }
            if (i4 != 0) {
                C1664b c1664b = new C1664b(i4, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + c1664b.toString());
                l(c1664b, null);
                return;
            }
            ?? obj = new Object();
            obj.f121t = c1684d;
            obj.f119r = null;
            obj.f120s = null;
            obj.f116o = false;
            obj.f117p = cVar;
            obj.f118q = this.f13008q;
            if (cVar.l()) {
                u uVar = this.f13013v;
                y.i(uVar);
                Handler handler = uVar.f13031q;
                N1.l lVar = uVar.f13034t;
                C2133a c2133a = uVar.f13035u;
                if (c2133a != null) {
                    c2133a.k();
                }
                lVar.f1194u = Integer.valueOf(System.identityHashCode(uVar));
                uVar.f13035u = (C2133a) uVar.f13032r.d(uVar.f13030p, handler.getLooper(), lVar, (C2118a) lVar.f1193t, uVar, uVar);
                uVar.f13036v = obj;
                Set set = uVar.f13033s;
                if (set == null || set.isEmpty()) {
                    handler.post(new D0.o(29, uVar));
                } else {
                    C2133a c2133a2 = uVar.f13035u;
                    c2133a2.getClass();
                    c2133a2.m(new h2.k(c2133a2));
                }
            }
            try {
                cVar.m(obj);
            } catch (SecurityException e4) {
                l(new C1664b(10), e4);
            }
        } catch (IllegalStateException e5) {
            l(new C1664b(10), e5);
        }
    }

    public final void k(q qVar) {
        y.c(this.f13005A.f12989A);
        boolean a4 = this.f13007p.a();
        LinkedList linkedList = this.f13006o;
        if (a4) {
            if (h(qVar)) {
                g();
                return;
            } else {
                linkedList.add(qVar);
                return;
            }
        }
        linkedList.add(qVar);
        C1664b c1664b = this.y;
        if (c1664b == null || c1664b.f12743p == 0 || c1664b.f12744q == null) {
            j();
        } else {
            l(c1664b, null);
        }
    }

    public final void l(C1664b c1664b, RuntimeException runtimeException) {
        C2133a c2133a;
        y.c(this.f13005A.f12989A);
        u uVar = this.f13013v;
        if (uVar != null && (c2133a = uVar.f13035u) != null) {
            c2133a.k();
        }
        y.c(this.f13005A.f12989A);
        this.y = null;
        ((SparseIntArray) this.f13005A.f12997u.f9319p).clear();
        a(c1664b);
        if ((this.f13007p instanceof C1733d) && c1664b.f12743p != 24) {
            C1684d c1684d = this.f13005A;
            c1684d.f12992p = true;
            Ur ur = c1684d.f12989A;
            ur.sendMessageDelayed(ur.obtainMessage(19), 300000L);
        }
        if (c1664b.f12743p == 4) {
            b(C1684d.f12986D);
            return;
        }
        if (this.f13006o.isEmpty()) {
            this.y = c1664b;
            return;
        }
        if (runtimeException != null) {
            y.c(this.f13005A.f12989A);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f13005A.f12990B) {
            b(C1684d.c(this.f13008q, c1664b));
            return;
        }
        c(C1684d.c(this.f13008q, c1664b), null, true);
        if (this.f13006o.isEmpty() || i(c1664b) || this.f13005A.b(c1664b, this.f13012u)) {
            return;
        }
        if (c1664b.f12743p == 18) {
            this.f13014w = true;
        }
        if (!this.f13014w) {
            b(C1684d.c(this.f13008q, c1664b));
            return;
        }
        C1684d c1684d2 = this.f13005A;
        C1681a c1681a = this.f13008q;
        Ur ur2 = c1684d2.f12989A;
        ur2.sendMessageDelayed(Message.obtain(ur2, 9, c1681a), 5000L);
    }

    public final void m(C1664b c1664b) {
        y.c(this.f13005A.f12989A);
        f2.c cVar = this.f13007p;
        cVar.e("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(c1664b));
        l(c1664b, null);
    }

    public final void n() {
        y.c(this.f13005A.f12989A);
        Status status = C1684d.f12985C;
        b(status);
        this.f13009r.g(false, status);
        for (g gVar : (g[]) this.f13011t.keySet().toArray(new g[0])) {
            k(new w(new A2.i()));
        }
        a(new C1664b(4));
        f2.c cVar = this.f13007p;
        if (cVar.a()) {
            cVar.d(new x0.f(29, this));
        }
    }
}
