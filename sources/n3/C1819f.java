package n3;

import android.util.Log;
import com.google.android.gms.internal.play_billing.B;
import com.google.firebase.components.ComponentRegistrar;
import d3.C1655c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import u3.InterfaceC2015a;
import u3.InterfaceC2016b;
import v3.C2033d;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: n3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819f implements InterfaceC1815b {

    /* renamed from: v, reason: collision with root package name */
    public static final C1818e f14120v = new C1818e(0);

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f14121o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f14122p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f14123q;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f14124r;

    /* renamed from: s, reason: collision with root package name */
    public final k f14125s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f14126t;

    /* renamed from: u, reason: collision with root package name */
    public final C2033d f14127u;

    public C1819f(ArrayList arrayList, ArrayList arrayList2, C2033d c2033d) {
        o3.l lVar = o3.l.f14370o;
        this.f14121o = new HashMap();
        this.f14122p = new HashMap();
        this.f14123q = new HashMap();
        this.f14124r = new HashSet();
        this.f14126t = new AtomicReference();
        k kVar = new k();
        this.f14125s = kVar;
        this.f14127u = c2033d;
        ArrayList arrayList3 = new ArrayList();
        int i4 = 0;
        int i5 = 1;
        arrayList3.add(C1814a.b(kVar, k.class, InterfaceC2016b.class, InterfaceC2015a.class));
        arrayList3.add(C1814a.b(this, C1819f.class, new Class[0]));
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            C1814a c1814a = (C1814a) obj;
            if (c1814a != null) {
                arrayList3.add(c1814a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC2053a) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f14127u.j(componentRegistrar));
                        it.remove();
                    }
                } catch (l e4) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C1814a) it2.next()).f14113b.toArray();
                int length = array.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        Object obj3 = array[i8];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f14124r.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f14124r.add(obj3.toString());
                        }
                        i8++;
                    }
                }
            }
            if (this.f14121o.isEmpty()) {
                android.support.v4.media.session.a.g(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f14121o.keySet());
                arrayList6.addAll(arrayList3);
                android.support.v4.media.session.a.g(arrayList6);
            }
            int size3 = arrayList3.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj4 = arrayList3.get(i9);
                i9++;
                C1814a c1814a2 = (C1814a) obj4;
                this.f14121o.put(c1814a2, new m(new C1655c(i5, this, c1814a2)));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(i());
            g();
        }
        int size4 = arrayList5.size();
        while (i4 < size4) {
            Object obj5 = arrayList5.get(i4);
            i4++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f14126t.get();
        if (bool != null) {
            c(this.f14121o, bool.booleanValue());
        }
    }

    @Override // n3.InterfaceC1815b
    public final Object a(Class cls) {
        return d(q.a(cls));
    }

    @Override // n3.InterfaceC1815b
    public final Set b(q qVar) {
        InterfaceC2053a interfaceC2053a;
        synchronized (this) {
            interfaceC2053a = (n) this.f14123q.get(qVar);
            if (interfaceC2053a == null) {
                interfaceC2053a = f14120v;
            }
        }
        return (Set) interfaceC2053a.get();
    }

    public final void c(HashMap hashMap, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            C1814a c1814a = (C1814a) entry.getKey();
            InterfaceC2053a interfaceC2053a = (InterfaceC2053a) entry.getValue();
            int i4 = c1814a.d;
            if (i4 == 1 || (i4 == 2 && z4)) {
                interfaceC2053a.get();
            }
        }
        k kVar = this.f14125s;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f14135b;
                if (arrayDeque != null) {
                    kVar.f14135b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // n3.InterfaceC1815b
    public final Object d(q qVar) {
        InterfaceC2053a f4 = f(qVar);
        if (f4 == null) {
            return null;
        }
        return f4.get();
    }

    @Override // n3.InterfaceC1815b
    public final InterfaceC2053a e(Class cls) {
        return f(q.a(cls));
    }

    @Override // n3.InterfaceC1815b
    public final synchronized InterfaceC2053a f(q qVar) {
        B.g(qVar, "Null interface requested.");
        return (InterfaceC2053a) this.f14122p.get(qVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [n3.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [n3.n, java.lang.Object] */
    public final void g() {
        for (C1814a c1814a : this.f14121o.keySet()) {
            for (i iVar : c1814a.c) {
                if (iVar.f14133b == 2 && !this.f14123q.containsKey(iVar.f14132a)) {
                    HashMap hashMap = this.f14123q;
                    q qVar = iVar.f14132a;
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f14139b = null;
                    obj.f14138a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f14138a.addAll(set);
                    hashMap.put(qVar, obj);
                } else if (this.f14122p.containsKey(iVar.f14132a)) {
                    continue;
                } else {
                    int i4 = iVar.f14133b;
                    if (i4 == 1) {
                        throw new RuntimeException("Unsatisfied dependency for component " + c1814a + ": " + iVar.f14132a);
                    }
                    if (i4 != 2) {
                        HashMap hashMap2 = this.f14122p;
                        q qVar2 = iVar.f14132a;
                        D3.b bVar = o.c;
                        C1818e c1818e = o.d;
                        ?? obj2 = new Object();
                        obj2.f14140a = bVar;
                        obj2.f14141b = c1818e;
                        hashMap2.put(qVar2, obj2);
                    }
                }
            }
        }
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1814a c1814a = (C1814a) obj;
            if (c1814a.f14114e == 0) {
                InterfaceC2053a interfaceC2053a = (InterfaceC2053a) this.f14121o.get(c1814a);
                for (q qVar : c1814a.f14113b) {
                    HashMap hashMap = this.f14122p;
                    if (hashMap.containsKey(qVar)) {
                        arrayList2.add(new C1.d(2, (o) ((InterfaceC2053a) hashMap.get(qVar)), interfaceC2053a));
                    } else {
                        hashMap.put(qVar, interfaceC2053a);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [n3.n, java.lang.Object] */
    public final ArrayList i() {
        HashMap hashMap = this.f14123q;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f14121o.entrySet()) {
            C1814a c1814a = (C1814a) entry.getKey();
            if (c1814a.f14114e != 0) {
                InterfaceC2053a interfaceC2053a = (InterfaceC2053a) entry.getValue();
                for (q qVar : c1814a.f14113b) {
                    if (!hashMap2.containsKey(qVar)) {
                        hashMap2.put(qVar, new HashSet());
                    }
                    ((Set) hashMap2.get(qVar)).add(interfaceC2053a);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                n nVar = (n) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1.d(3, nVar, (InterfaceC2053a) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.f14139b = null;
                obj.f14138a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f14138a.addAll(set);
                hashMap.put(qVar2, obj);
            }
        }
        return arrayList;
    }
}
