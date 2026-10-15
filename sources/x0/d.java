package x0;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.ads.Wl;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    public static final String f15203q = n0.n.h("EnqueueRunnable");

    /* renamed from: o, reason: collision with root package name */
    public final o0.e f15204o;

    /* renamed from: p, reason: collision with root package name */
    public final Wl f15205p = new Wl(17, (byte) 0);

    public d(o0.e eVar) {
        this.f15204o = eVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    /* JADX WARN: Type inference failed for: r3v28, types: [w0.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(o0.e r21) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d.a(o0.e):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        Wl wl = this.f15205p;
        o0.e eVar = this.f15204o;
        o0.l lVar = eVar.f14157n0;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f14159p0);
            HashSet V4 = o0.e.V(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(eVar.f14159p0);
                    z4 = false;
                    break;
                } else if (V4.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            WorkDatabase workDatabase = lVar.f14175n;
            workDatabase.c();
            try {
                boolean a4 = a(eVar);
                workDatabase.h();
                if (a4) {
                    g.a(lVar.f14173l, RescheduleReceiver.class, true);
                    o0.d.a(lVar.f14174m, lVar.f14175n, lVar.f14177p);
                }
                wl.e(n0.s.f14102m);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th) {
            wl.e(new n0.p(th));
        }
    }
}
