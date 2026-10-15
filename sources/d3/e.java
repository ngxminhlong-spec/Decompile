package d3;

import android.util.Log;
import g2.InterfaceC1682b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import v3.C2032c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements InterfaceC1682b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f12612a = new AtomicReference();

    @Override // g2.InterfaceC1682b
    public final void a(boolean z4) {
        synchronized (g.f12615j) {
            try {
                ArrayList arrayList = new ArrayList(g.f12616k.values());
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    g gVar = (g) obj;
                    if (gVar.f12619e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f12623i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((C1656d) it.next()).f12611a;
                            if (!z4) {
                                ((C2032c) gVar2.f12622h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
