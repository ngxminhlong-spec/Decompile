package t0;

import java.util.ArrayList;
import java.util.Iterator;
import n0.n;
import w0.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1989c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14838a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f14839b;
    public final u0.d c;
    public InterfaceC1988b d;

    public AbstractC1989c(u0.d dVar) {
        this.c = dVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f14838a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f14838a.add(iVar.f15115a);
            }
        }
        if (this.f14838a.isEmpty()) {
            this.c.b(this);
        } else {
            u0.d dVar = this.c;
            synchronized (dVar.c) {
                try {
                    if (dVar.d.add(this)) {
                        if (dVar.d.size() == 1) {
                            dVar.f14975e = dVar.a();
                            n.d().a(u0.d.f14972f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f14975e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f14975e;
                        this.f14839b = obj;
                        d(this.d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.d, this.f14839b);
    }

    public final void d(InterfaceC1988b interfaceC1988b, Object obj) {
        if (this.f14838a.isEmpty() || interfaceC1988b == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ((s0.c) interfaceC1988b).b(this.f14838a);
            return;
        }
        ArrayList arrayList = this.f14838a;
        s0.c cVar = (s0.c) interfaceC1988b;
        synchronized (cVar.c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    String str = (String) obj2;
                    if (cVar.a(str)) {
                        n.d().a(s0.c.d, "Constraints met for " + str, new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                s0.b bVar = cVar.f14761a;
                if (bVar != null) {
                    bVar.e(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
