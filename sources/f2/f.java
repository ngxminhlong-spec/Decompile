package f2;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.Ur;
import g2.C1681a;
import g2.C1684d;
import h2.y;
import java.util.Collections;
import java.util.Set;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: o, reason: collision with root package name */
    public final Context f12965o;

    /* renamed from: p, reason: collision with root package name */
    public final String f12966p;

    /* renamed from: q, reason: collision with root package name */
    public final Qw f12967q;

    /* renamed from: r, reason: collision with root package name */
    public final b f12968r;

    /* renamed from: s, reason: collision with root package name */
    public final C1681a f12969s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12970t;

    /* renamed from: u, reason: collision with root package name */
    public final C2033d f12971u;

    /* renamed from: v, reason: collision with root package name */
    public final C1684d f12972v;

    public f(Context context, Qw qw, b bVar, e eVar) {
        y.j(context, "Null context is not permitted.");
        y.j(qw, "Api must not be null.");
        y.j(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y.j(applicationContext, "The provided context did not have an application context.");
        this.f12965o = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f12966p = attributionTag;
        this.f12967q = qw;
        this.f12968r = bVar;
        this.f12969s = new C1681a(qw, bVar, attributionTag);
        C1684d e4 = C1684d.e(applicationContext);
        this.f12972v = e4;
        this.f12970t = e4.f12998v.getAndIncrement();
        this.f12971u = eVar.f12964a;
        Ur ur = e4.f12989A;
        ur.sendMessage(ur.obtainMessage(7, this));
    }

    public final q2.e a() {
        q2.e eVar = new q2.e(18, false);
        Set set = Collections.EMPTY_SET;
        if (((r.f) eVar.f14709p) == null) {
            eVar.f14709p = new r.f(0);
        }
        ((r.f) eVar.f14709p).addAll(set);
        Context context = this.f12965o;
        eVar.f14711r = context.getClass().getName();
        eVar.f14710q = context.getPackageName();
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A2.r b(int r17, g2.j r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            A2.i r2 = new A2.i
            r2.<init>()
            A2.r r3 = r2.f26a
            v3.d r4 = r0.f12971u
            g2.d r6 = r0.f12972v
            com.google.android.gms.internal.ads.Ur r13 = r6.f12989A
            int r7 = r1.c
            if (r7 == 0) goto L82
            g2.a r8 = r0.f12969s
            boolean r5 = r6.a()
            if (r5 != 0) goto L1e
            goto L5b
        L1e:
            h2.k r5 = h2.k.b()
            java.lang.Object r5 = r5.f13218o
            h2.l r5 = (h2.l) r5
            r9 = 1
            if (r5 == 0) goto L5d
            boolean r10 = r5.f13220p
            if (r10 == 0) goto L5b
            boolean r5 = r5.f13221q
            java.util.concurrent.ConcurrentHashMap r10 = r6.f13000x
            java.lang.Object r10 = r10.get(r8)
            g2.m r10 = (g2.m) r10
            if (r10 == 0) goto L59
            f2.c r11 = r10.f13007p
            boolean r12 = r11 instanceof h2.AbstractC1706e
            if (r12 == 0) goto L5b
            h2.e r11 = (h2.AbstractC1706e) r11
            h2.E r12 = r11.f13172J
            if (r12 == 0) goto L59
            boolean r12 = r11.g()
            if (r12 != 0) goto L59
            h2.f r5 = g2.r.b(r10, r11, r7)
            if (r5 == 0) goto L5b
            int r11 = r10.f13016z
            int r11 = r11 + r9
            r10.f13016z = r11
            boolean r9 = r5.f13187q
            goto L5d
        L59:
            r9 = r5
            goto L5d
        L5b:
            r5 = 0
            goto L74
        L5d:
            g2.r r5 = new g2.r
            r10 = 0
            if (r9 == 0) goto L68
            long r14 = java.lang.System.currentTimeMillis()
            goto L69
        L68:
            r14 = r10
        L69:
            if (r9 == 0) goto L6f
            long r10 = android.os.SystemClock.elapsedRealtime()
        L6f:
            r11 = r10
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r11)
        L74:
            if (r5 == 0) goto L82
            r13.getClass()
            E.m r7 = new E.m
            r8 = 1
            r7.<init>(r13, r8)
            r3.b(r7, r5)
        L82:
            g2.v r5 = new g2.v
            r7 = r17
            r5.<init>(r7, r1, r2, r4)
            java.util.concurrent.atomic.AtomicInteger r1 = r6.f12999w
            g2.t r2 = new g2.t
            int r1 = r1.get()
            r2.<init>(r5, r1, r0)
            r1 = 4
            android.os.Message r1 = r13.obtainMessage(r1, r2)
            r13.sendMessage(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.b(int, g2.j):A2.r");
    }
}
