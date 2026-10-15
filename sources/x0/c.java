package x0;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.Wl;
import java.util.Iterator;
import java.util.LinkedList;
import o0.C1823b;
import o0.InterfaceC1824c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final Wl f15202o = new Wl(17, (byte) 0);

    public static void a(o0.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f14175n;
        C1.l n4 = workDatabase.n();
        Wl i4 = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e4 = n4.e(str2);
            if (e4 != 3 && e4 != 4) {
                n4.o(6, str2);
            }
            linkedList.addAll(i4.a(str2));
        }
        C1823b c1823b = lVar.f14178q;
        synchronized (c1823b.y) {
            try {
                n0.n.d().a(C1823b.f14144z, "Processor cancelling " + str, new Throwable[0]);
                c1823b.f14153w.add(str);
                o0.m mVar = (o0.m) c1823b.f14150t.remove(str);
                boolean z4 = mVar != null;
                if (mVar == null) {
                    mVar = (o0.m) c1823b.f14151u.remove(str);
                }
                C1823b.c(str, mVar);
                if (z4) {
                    c1823b.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = lVar.f14177p.iterator();
        while (it.hasNext()) {
            ((InterfaceC1824c) it.next()).b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        Wl wl = this.f15202o;
        try {
            b();
            wl.e(n0.s.f14102m);
        } catch (Throwable th) {
            wl.e(new n0.p(th));
        }
    }
}
