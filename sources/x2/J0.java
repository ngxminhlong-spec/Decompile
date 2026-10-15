package x2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J0 extends S {
    public final I0 c;
    public D d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f15388e;

    /* renamed from: f, reason: collision with root package name */
    public final F0 f15389f;

    /* renamed from: g, reason: collision with root package name */
    public final N1.d f15390g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f15391h;

    /* renamed from: i, reason: collision with root package name */
    public final F0 f15392i;

    public J0(C2066c0 c2066c0) {
        super(c2066c0);
        this.f15391h = new ArrayList();
        this.f15390g = new N1.d(c2066c0.f15573n);
        this.c = new I0(this);
        this.f15389f = new F0(this, c2066c0, 0);
        this.f15392i = new F0(this, c2066c0, 1);
    }

    public static void u(J0 j02, ComponentName componentName) {
        j02.g();
        if (j02.d != null) {
            j02.d = null;
            K k3 = ((C2066c0) j02.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15402n.b(componentName, "Disconnected from device MeasurementService");
            j02.g();
            j02.v();
        }
    }

    @Override // x2.S
    public final boolean i() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01f9 A[Catch: all -> 0x014e, SQLiteException -> 0x01db, SQLiteFullException -> 0x01de, SQLiteDatabaseLockedException -> 0x0295, TryCatch #20 {all -> 0x014e, blocks: (B:99:0x0143, B:101:0x0148, B:155:0x0174, B:156:0x0177, B:153:0x0170, B:163:0x018d, B:166:0x01a1, B:168:0x01b9, B:171:0x01bd, B:172:0x01c0, B:174:0x01b3, B:176:0x01c3, B:184:0x01d7, B:186:0x01f9, B:196:0x01fd, B:197:0x0200, B:194:0x01f3, B:206:0x0205, B:208:0x0212, B:232:0x024b, B:234:0x0268, B:235:0x0274), top: B:98:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(x2.D r31, i2.AbstractC1717a r32, x2.d1 r33) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.J0.j(x2.D, i2.a, x2.d1):void");
    }

    public final void k(C2065c c2065c) {
        boolean m4;
        g();
        e();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        c2066c0.getClass();
        F n4 = c2066c0.n();
        C2066c0 c2066c02 = (C2066c0) n4.f1719a;
        C2066c0.g(c2066c02.f15571l);
        byte[] W4 = b1.W(c2065c);
        if (W4.length > 131072) {
            K k3 = c2066c02.f15568i;
            C2066c0.i(k3);
            k3.f15395g.a("Conditional user property too long for local database. Sending directly to service");
            m4 = false;
        } else {
            m4 = n4.m(2, W4);
        }
        boolean z4 = m4;
        r(new D0(this, o(true), z4, new C2065c(c2065c), 2));
    }

    public final boolean l() {
        g();
        e();
        return this.d != null;
    }

    public final boolean m() {
        g();
        e();
        if (!n()) {
            return true;
        }
        b1 b1Var = ((C2066c0) this.f1719a).f15571l;
        C2066c0.g(b1Var);
        return b1Var.g0() >= ((Integer) B.f15296e0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.J0.n():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 x2.d1, still in use, count: 2, list:
          (r6v0 x2.d1) from 0x01a2: MOVE (r23v0 x2.d1) = (r6v0 x2.d1)
          (r6v0 x2.d1) from 0x0119: MOVE (r23v3 x2.d1) = (r6v0 x2.d1)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r36v1 */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r36v3 */
    public final x2.d1 o(boolean r36) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.J0.o(boolean):x2.d1");
    }

    public final void p() {
        g();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        I i4 = k3.f15402n;
        ArrayList arrayList = this.f15391h;
        i4.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e4) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15394f.b(e4, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f15392i.a();
    }

    public final void q() {
        g();
        N1.d dVar = this.f15390g;
        ((C1798a) dVar.f1158q).getClass();
        dVar.f1157p = SystemClock.elapsedRealtime();
        ((C2066c0) this.f1719a).getClass();
        this.f15389f.c(((Long) B.f15273J.a(null)).longValue());
    }

    public final void r(Runnable runnable) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        if (l()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f15391h;
        int size = arrayList.size();
        c2066c0.getClass();
        if (size >= 1000) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f15392i.c(60000L);
            v();
        }
    }

    public final Boolean s() {
        return this.f15388e;
    }

    public final void v() {
        g();
        e();
        if (l()) {
            return;
        }
        if (n()) {
            this.c.a();
            return;
        }
        if (((C2066c0) this.f1719a).f15566g.v()) {
            return;
        }
        ((C2066c0) this.f1719a).getClass();
        List<ResolveInfo> queryIntentServices = ((C2066c0) this.f1719a).f15562a.getPackageManager().queryIntentServices(new Intent().setClassName(((C2066c0) this.f1719a).f15562a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(((C2066c0) this.f1719a).f15562a, "com.google.android.gms.measurement.AppMeasurementService"));
        I0 i02 = this.c;
        i02.f15386q.g();
        Context context = ((C2066c0) i02.f15386q.f1719a).f15562a;
        k2.a a4 = k2.a.a();
        synchronized (i02) {
            try {
                if (i02.f15384o) {
                    K k4 = ((C2066c0) i02.f15386q.f1719a).f15568i;
                    C2066c0.i(k4);
                    k4.f15402n.a("Connection attempt already in progress");
                } else {
                    K k5 = ((C2066c0) i02.f15386q.f1719a).f15568i;
                    C2066c0.i(k5);
                    k5.f15402n.a("Using local app measurement service");
                    i02.f15384o = true;
                    a4.c(context, context.getClass().getName(), intent, i02.f15386q.c, 129, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x() {
        g();
        e();
        I0 i02 = this.c;
        if (i02.f15385p != null && (i02.f15385p.a() || i02.f15385p.g())) {
            i02.f15385p.k();
        }
        i02.f15385p = null;
        try {
            k2.a.a().b(((C2066c0) this.f1719a).f15562a, this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void y(AtomicReference atomicReference) {
        g();
        e();
        r(new E.n(this, atomicReference, o(false), 19, false));
    }
}
