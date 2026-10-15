package o0;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14155a = n.h("Schedulers");

    public static void a(n0.c cVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C1.l n4 = workDatabase.n();
        workDatabase.c();
        try {
            int i4 = cVar.f14078h;
            if (Build.VERSION.SDK_INT == 23) {
                i4 /= 2;
            }
            ArrayList b4 = n4.b(i4);
            ArrayList a4 = n4.a();
            if (b4.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = b4.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = b4.get(i5);
                    i5++;
                    n4.k(((w0.i) obj).f15115a, currentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (b4.size() > 0) {
                w0.i[] iVarArr = (w0.i[]) b4.toArray(new w0.i[b4.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1824c interfaceC1824c = (InterfaceC1824c) it.next();
                    if (interfaceC1824c.f()) {
                        interfaceC1824c.d(iVarArr);
                    }
                }
            }
            if (a4.size() > 0) {
                w0.i[] iVarArr2 = (w0.i[]) a4.toArray(new w0.i[a4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1824c interfaceC1824c2 = (InterfaceC1824c) it2.next();
                    if (!interfaceC1824c2.f()) {
                        interfaceC1824c2.d(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
