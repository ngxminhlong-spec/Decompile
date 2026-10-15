package C0;

import androidx.recyclerview.widget.GridLayoutManager;
import com.duracodefactory.logiccircuitsimulatorpro.ui.RecentsRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import o1.InterfaceC1833I;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class x0 implements InterfaceC1833I {

    /* renamed from: o, reason: collision with root package name */
    public int f450o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f451p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f452q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f453r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f454s;

    public x0(z0 z0Var, RecentsRecyclerView recentsRecyclerView, int i4, GridLayoutManager gridLayoutManager, q0 q0Var) {
        this.f454s = z0Var;
        this.f451p = recentsRecyclerView;
        this.f450o = i4;
        this.f452q = gridLayoutManager;
        this.f453r = q0Var;
    }

    public x0(com.google.firebase.storage.h hVar, int i4, com.google.firebase.storage.k kVar) {
        this.f451p = new ConcurrentLinkedQueue();
        this.f452q = new HashMap();
        this.f453r = hVar;
        this.f450o = i4;
        this.f454s = kVar;
    }

    public x0(q2.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.f14710q;
        int size = arrayList.size();
        this.f451p = (String[]) ((ArrayList) eVar.f14709p).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            dArr[i4] = ((Double) arrayList.get(i4)).doubleValue();
        }
        this.f452q = dArr;
        ArrayList arrayList2 = (ArrayList) eVar.f14711r;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i5 = 0; i5 < size3; i5++) {
            dArr2[i5] = ((Double) arrayList2.get(i5)).doubleValue();
        }
        this.f453r = dArr2;
        this.f454s = new int[size];
        this.f450o = 0;
    }

    public void a(Object obj, Executor executor) {
        boolean z4;
        E3.c cVar;
        h2.y.i(obj);
        synchronized (((com.google.firebase.storage.h) this.f453r).f12563a) {
            z4 = (((com.google.firebase.storage.h) this.f453r).f12568h & this.f450o) != 0;
            ((ConcurrentLinkedQueue) this.f451p).add(obj);
            cVar = new E3.c(executor);
            ((HashMap) this.f452q).put(obj, cVar);
        }
        if (z4) {
            com.google.firebase.storage.j jVar = new com.google.firebase.storage.j(this, obj, ((com.google.firebase.storage.h) this.f453r).o(), 1);
            Executor executor2 = cVar.f727a;
            if (executor2 != null) {
                executor2.execute(jVar);
            } else {
                com.google.android.gms.internal.play_billing.B.c.execute(jVar);
            }
        }
    }

    public void b() {
        if ((((com.google.firebase.storage.h) this.f453r).f12568h & this.f450o) != 0) {
            com.google.firebase.storage.l o4 = ((com.google.firebase.storage.h) this.f453r).o();
            Iterator it = ((ConcurrentLinkedQueue) this.f451p).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                E3.c cVar = (E3.c) ((HashMap) this.f452q).get(next);
                if (cVar != null) {
                    com.google.firebase.storage.j jVar = new com.google.firebase.storage.j(this, next, o4, 0);
                    Executor executor = cVar.f727a;
                    if (executor != null) {
                        executor.execute(jVar);
                    } else {
                        com.google.android.gms.internal.play_billing.B.c.execute(jVar);
                    }
                }
            }
        }
    }

    @Override // o1.InterfaceC1833I
    public void s(int i4) {
        ((RecentsRecyclerView) this.f451p).post(new C(i4, 3, this));
    }
}
