package g2;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.Ur;
import com.google.android.gms.internal.ads.Wl;
import e2.C1664b;
import h2.C1711j;
import h2.I;
import h2.y;
import j2.C1732c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l2.AbstractC1799b;
import m2.AbstractC1806a;
import r.C1964a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: g2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1684d implements Handler.Callback {

    /* renamed from: C, reason: collision with root package name */
    public static final Status f12985C = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: D, reason: collision with root package name */
    public static final Status f12986D = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: E, reason: collision with root package name */
    public static final Object f12987E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static C1684d f12988F;

    /* renamed from: A, reason: collision with root package name */
    public final Ur f12989A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f12990B;

    /* renamed from: o, reason: collision with root package name */
    public long f12991o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12992p;

    /* renamed from: q, reason: collision with root package name */
    public h2.m f12993q;

    /* renamed from: r, reason: collision with root package name */
    public C1732c f12994r;

    /* renamed from: s, reason: collision with root package name */
    public final Context f12995s;

    /* renamed from: t, reason: collision with root package name */
    public final e2.e f12996t;

    /* renamed from: u, reason: collision with root package name */
    public final C0831kn f12997u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f12998v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f12999w;

    /* renamed from: x, reason: collision with root package name */
    public final ConcurrentHashMap f13000x;
    public final r.f y;

    /* renamed from: z, reason: collision with root package name */
    public final r.f f13001z;

    public C1684d(Context context, Looper looper) {
        e2.e eVar = e2.e.d;
        this.f12991o = 10000L;
        this.f12992p = false;
        this.f12998v = new AtomicInteger(1);
        this.f12999w = new AtomicInteger(0);
        this.f13000x = new ConcurrentHashMap(5, 0.75f, 1);
        this.y = new r.f(0);
        this.f13001z = new r.f(0);
        this.f12990B = true;
        this.f12995s = context;
        Ur ur = new Ur(looper, this, 2);
        Looper.getMainLooper();
        this.f12989A = ur;
        this.f12996t = eVar;
        this.f12997u = new C0831kn(13);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1799b.f13962g == null) {
            AbstractC1799b.f13962g = Boolean.valueOf(AbstractC1799b.f() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC1799b.f13962g.booleanValue()) {
            this.f12990B = false;
        }
        ur.sendMessage(ur.obtainMessage(6));
    }

    public static Status c(C1681a c1681a, C1664b c1664b) {
        return new Status(17, "API: " + ((String) c1681a.f12979b.f6711q) + " is not available on this device. Connection failed with: " + String.valueOf(c1664b), c1664b.f12744q, c1664b);
    }

    public static C1684d e(Context context) {
        C1684d c1684d;
        synchronized (f12987E) {
            try {
                if (f12988F == null) {
                    Looper looper = I.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = e2.e.c;
                    f12988F = new C1684d(applicationContext, looper);
                }
                c1684d = f12988F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1684d;
    }

    public final boolean a() {
        if (this.f12992p) {
            return false;
        }
        h2.l lVar = (h2.l) h2.k.b().f13218o;
        if (lVar != null && !lVar.f13220p) {
            return false;
        }
        int i4 = ((SparseIntArray) this.f12997u.f9319p).get(203400000, -1);
        return i4 == -1 || i4 == 0;
    }

    public final boolean b(C1664b c1664b, int i4) {
        e2.e eVar = this.f12996t;
        eVar.getClass();
        Context context = this.f12995s;
        if (!AbstractC1806a.F(context)) {
            int i5 = c1664b.f12743p;
            PendingIntent pendingIntent = c1664b.f12744q;
            if (!((i5 == 0 || pendingIntent == null) ? false : true)) {
                pendingIntent = null;
                Intent b4 = eVar.b(i5, context, null);
                if (b4 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b4, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i6 = GoogleApiActivity.f3891p;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i4);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i5, PendingIntent.getActivity(context, 0, intent, r2.c.f14756a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final m d(f2.f fVar) {
        C1681a c1681a = fVar.f12969s;
        ConcurrentHashMap concurrentHashMap = this.f13000x;
        m mVar = (m) concurrentHashMap.get(c1681a);
        if (mVar == null) {
            mVar = new m(this, fVar);
            concurrentHashMap.put(c1681a, mVar);
        }
        if (mVar.f13007p.l()) {
            this.f13001z.add(c1681a);
        }
        mVar.j();
        return mVar;
    }

    public final void f(C1664b c1664b, int i4) {
        if (b(c1664b, i4)) {
            return;
        }
        Ur ur = this.f12989A;
        ur.sendMessage(ur.obtainMessage(5, i4, 0, c1664b));
    }

    /* JADX WARN: Type inference failed for: r4v26, types: [f2.f, j2.c] */
    /* JADX WARN: Type inference failed for: r4v39, types: [f2.f, j2.c] */
    /* JADX WARN: Type inference failed for: r5v13, types: [g2.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [f2.f, j2.c] */
    /* JADX WARN: Type inference failed for: r5v17, types: [g2.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [g2.j, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        m mVar;
        e2.d[] b4;
        int i4 = message.what;
        int i5 = 29;
        e2.d dVar = r2.b.f14754a;
        Qw qw = C1732c.f13331w;
        h2.n nVar = h2.n.f13226b;
        Context context = this.f12995s;
        Ur ur = this.f12989A;
        ConcurrentHashMap concurrentHashMap = this.f13000x;
        switch (i4) {
            case 1:
                this.f12991o = true != ((Boolean) message.obj).booleanValue() ? 300000L : 10000L;
                ur.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ur.sendMessageDelayed(ur.obtainMessage(12, (C1681a) it.next()), this.f12991o);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (m mVar2 : concurrentHashMap.values()) {
                    y.c(mVar2.f13005A.f12989A);
                    mVar2.y = null;
                    mVar2.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t tVar = (t) message.obj;
                f2.f fVar = tVar.c;
                v vVar = tVar.f13027a;
                m mVar3 = (m) concurrentHashMap.get(fVar.f12969s);
                if (mVar3 == null) {
                    mVar3 = d(tVar.c);
                }
                if (!mVar3.f13007p.l() || this.f12999w.get() == tVar.f13028b) {
                    mVar3.k(vVar);
                    return true;
                }
                vVar.c(f12985C);
                mVar3.n();
                return true;
            case 5:
                int i6 = message.arg1;
                C1664b c1664b = (C1664b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        mVar = (m) it2.next();
                        if (mVar.f13012u == i6) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar == null) {
                    Log.wtf("GoogleApiManager", U.a.h(i6, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i7 = c1664b.f12743p;
                if (i7 != 13) {
                    mVar.b(c(mVar.f13008q, c1664b));
                    return true;
                }
                this.f12996t.getClass();
                AtomicBoolean atomicBoolean = e2.h.f12754a;
                mVar.b(new Status(17, "Error resolution was canceled by the user, original error message: " + C1664b.h(i7) + ": " + c1664b.f12745r, null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1683c.b((Application) context.getApplicationContext());
                    ComponentCallbacks2C1683c componentCallbacks2C1683c = ComponentCallbacks2C1683c.f12980s;
                    componentCallbacks2C1683c.a(new l(this));
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C1683c.f12981o;
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C1683c.f12982p;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f12991o = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                d((f2.f) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    m mVar4 = (m) concurrentHashMap.get(message.obj);
                    y.c(mVar4.f13005A.f12989A);
                    if (mVar4.f13014w) {
                        mVar4.j();
                        return true;
                    }
                }
                return true;
            case 10:
                r.f fVar2 = this.f13001z;
                fVar2.getClass();
                C1964a c1964a = new C1964a(fVar2);
                while (c1964a.hasNext()) {
                    m mVar5 = (m) concurrentHashMap.remove((C1681a) c1964a.next());
                    if (mVar5 != null) {
                        mVar5.n();
                    }
                }
                fVar2.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    m mVar6 = (m) concurrentHashMap.get(message.obj);
                    C1684d c1684d = mVar6.f13005A;
                    y.c(c1684d.f12989A);
                    boolean z4 = mVar6.f13014w;
                    if (z4) {
                        C1681a c1681a = mVar6.f13008q;
                        Ur ur2 = mVar6.f13005A.f12989A;
                        if (z4) {
                            ur2.removeMessages(11, c1681a);
                            ur2.removeMessages(9, c1681a);
                            mVar6.f13014w = false;
                        }
                        mVar6.b(c1684d.f12996t.c(c1684d.f12995s, e2.f.f12752a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        mVar6.f13007p.e("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    m mVar7 = (m) concurrentHashMap.get(message.obj);
                    y.c(mVar7.f13005A.f12989A);
                    f2.c cVar = mVar7.f13007p;
                    if (cVar.a() && mVar7.f13011t.isEmpty()) {
                        Wl wl = mVar7.f13009r;
                        if (((Map) wl.f7563p).isEmpty() && ((Map) wl.f7564q).isEmpty()) {
                            cVar.e("Timing out service connection.");
                            return true;
                        }
                        mVar7.g();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                n nVar2 = (n) message.obj;
                if (concurrentHashMap.containsKey(nVar2.f13017a)) {
                    m mVar8 = (m) concurrentHashMap.get(nVar2.f13017a);
                    if (mVar8.f13015x.contains(nVar2) && !mVar8.f13014w) {
                        if (mVar8.f13007p.a()) {
                            mVar8.d();
                            return true;
                        }
                        mVar8.j();
                        return true;
                    }
                }
                return true;
            case 16:
                n nVar3 = (n) message.obj;
                if (concurrentHashMap.containsKey(nVar3.f13017a)) {
                    m mVar9 = (m) concurrentHashMap.get(nVar3.f13017a);
                    ArrayList arrayList = mVar9.f13015x;
                    Ur ur3 = mVar9.f13005A.f12989A;
                    LinkedList<q> linkedList = mVar9.f13006o;
                    if (arrayList.remove(nVar3)) {
                        ur3.removeMessages(15, nVar3);
                        ur3.removeMessages(16, nVar3);
                        e2.d dVar2 = nVar3.f13018b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (q qVar : linkedList) {
                            if (qVar != null && (b4 = qVar.b(mVar9)) != null) {
                                int length = b4.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length) {
                                        break;
                                    }
                                    if (!y.m(b4[i8], dVar2)) {
                                        i8++;
                                    } else if (i8 >= 0) {
                                        arrayList2.add(qVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            q qVar2 = (q) arrayList2.get(i9);
                            linkedList.remove(qVar2);
                            qVar2.d(new f2.k(dVar2));
                        }
                    }
                }
                return true;
            case 17:
                h2.m mVar10 = this.f12993q;
                if (mVar10 != null) {
                    if (mVar10.f13224o > 0 || a()) {
                        if (this.f12994r == null) {
                            this.f12994r = new f2.f(context, qw, nVar, f2.e.f12963b);
                        }
                        C1732c c1732c = this.f12994r;
                        c1732c.getClass();
                        ?? obj = new Object();
                        obj.c = 0;
                        e2.d[] dVarArr = {dVar};
                        obj.f13002a = dVarArr;
                        obj.f13003b = false;
                        obj.d = new D3.d(i5, mVar10);
                        c1732c.b(2, new j(obj, dVarArr, false, 0));
                    }
                    this.f12993q = null;
                    return true;
                }
                return true;
            case 18:
                s sVar = (s) message.obj;
                long j4 = sVar.c;
                C1711j c1711j = sVar.f13025a;
                int i10 = sVar.f13026b;
                if (j4 == 0) {
                    h2.m mVar11 = new h2.m(i10, Arrays.asList(c1711j));
                    if (this.f12994r == null) {
                        this.f12994r = new f2.f(context, qw, nVar, f2.e.f12963b);
                    }
                    C1732c c1732c2 = this.f12994r;
                    c1732c2.getClass();
                    ?? obj2 = new Object();
                    obj2.c = 0;
                    e2.d[] dVarArr2 = {dVar};
                    obj2.f13002a = dVarArr2;
                    obj2.f13003b = false;
                    obj2.d = new D3.d(i5, mVar11);
                    c1732c2.b(2, new j(obj2, dVarArr2, false, 0));
                    return true;
                }
                h2.m mVar12 = this.f12993q;
                if (mVar12 != null) {
                    List list = mVar12.f13225p;
                    if (mVar12.f13224o != i10 || (list != null && list.size() >= sVar.d)) {
                        ur.removeMessages(17);
                        h2.m mVar13 = this.f12993q;
                        if (mVar13 != null) {
                            if (mVar13.f13224o > 0 || a()) {
                                if (this.f12994r == null) {
                                    this.f12994r = new f2.f(context, qw, nVar, f2.e.f12963b);
                                }
                                C1732c c1732c3 = this.f12994r;
                                c1732c3.getClass();
                                ?? obj3 = new Object();
                                obj3.c = 0;
                                e2.d[] dVarArr3 = {dVar};
                                obj3.f13002a = dVarArr3;
                                obj3.f13003b = false;
                                obj3.d = new D3.d(i5, mVar13);
                                c1732c3.b(2, new j(obj3, dVarArr3, false, 0));
                            }
                            this.f12993q = null;
                        }
                    } else {
                        h2.m mVar14 = this.f12993q;
                        if (mVar14.f13225p == null) {
                            mVar14.f13225p = new ArrayList();
                        }
                        mVar14.f13225p.add(c1711j);
                    }
                }
                if (this.f12993q == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(c1711j);
                    this.f12993q = new h2.m(i10, arrayList3);
                    ur.sendMessageDelayed(ur.obtainMessage(17), sVar.c);
                    return true;
                }
                return true;
            case 19:
                this.f12992p = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i4);
                return false;
        }
    }
}
