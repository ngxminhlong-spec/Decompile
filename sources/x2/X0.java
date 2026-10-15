package x2;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1582v0;
import com.google.android.gms.internal.measurement.M2;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.t3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k.C1748e;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X0 implements InterfaceC2078i0 {

    /* renamed from: F, reason: collision with root package name */
    public static volatile X0 f15476F;

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f15477A;

    /* renamed from: B, reason: collision with root package name */
    public final HashMap f15478B;

    /* renamed from: C, reason: collision with root package name */
    public C2111z0 f15479C;

    /* renamed from: D, reason: collision with root package name */
    public String f15480D;

    /* renamed from: a, reason: collision with root package name */
    public final X f15482a;

    /* renamed from: b, reason: collision with root package name */
    public final O f15483b;
    public C2083l c;
    public B0.t d;

    /* renamed from: e, reason: collision with root package name */
    public R0 f15484e;

    /* renamed from: f, reason: collision with root package name */
    public C2063b f15485f;

    /* renamed from: g, reason: collision with root package name */
    public final O f15486g;

    /* renamed from: h, reason: collision with root package name */
    public O f15487h;

    /* renamed from: i, reason: collision with root package name */
    public L0 f15488i;

    /* renamed from: k, reason: collision with root package name */
    public U f15490k;

    /* renamed from: l, reason: collision with root package name */
    public final C2066c0 f15491l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15493n;

    /* renamed from: o, reason: collision with root package name */
    public long f15494o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f15495p;

    /* renamed from: q, reason: collision with root package name */
    public int f15496q;

    /* renamed from: r, reason: collision with root package name */
    public int f15497r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15498s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15499t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15500u;

    /* renamed from: v, reason: collision with root package name */
    public FileLock f15501v;

    /* renamed from: w, reason: collision with root package name */
    public FileChannel f15502w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f15503x;
    public ArrayList y;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15492m = false;

    /* renamed from: E, reason: collision with root package name */
    public final V0 f15481E = new V0(this);

    /* renamed from: z, reason: collision with root package name */
    public long f15504z = -1;

    /* renamed from: j, reason: collision with root package name */
    public final U0 f15489j = new S0(this);

    /* JADX WARN: Type inference failed for: r0v5, types: [x2.S0, x2.U0] */
    public X0(m2.b bVar) {
        this.f15491l = C2066c0.p(bVar.f14053a, null, null);
        O o4 = new O(this, 2);
        o4.i();
        this.f15486g = o4;
        O o5 = new O(this, 0);
        o5.i();
        this.f15483b = o5;
        X x4 = new X(this);
        x4.i();
        this.f15482a = x4;
        this.f15477A = new HashMap();
        this.f15478B = new HashMap();
        t().o(new g2.x(this, bVar));
    }

    public static final boolean H(d1 d1Var) {
        return (TextUtils.isEmpty(d1Var.f15604p) && TextUtils.isEmpty(d1Var.f15595E)) ? false : true;
    }

    public static final void I(T0 t02) {
        if (t02 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!t02.c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(t02.getClass())));
        }
    }

    public static X0 O(Context context) {
        h2.y.i(context);
        h2.y.i(context.getApplicationContext());
        if (f15476F == null) {
            synchronized (X0.class) {
                try {
                    if (f15476F == null) {
                        f15476F = new X0(new m2.b(context, 1));
                    }
                } finally {
                }
            }
        }
        return f15476F;
    }

    public static final void x(com.google.android.gms.internal.measurement.D0 d02, int i4, String str) {
        List unmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.E0) d02.f11739p).s());
        for (int i5 = 0; i5 < unmodifiableList.size(); i5++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.H0) unmodifiableList.get(i5)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.G0 p3 = com.google.android.gms.internal.measurement.H0.p();
        p3.h("_err");
        p3.g(i4);
        com.google.android.gms.internal.measurement.H0 h02 = (com.google.android.gms.internal.measurement.H0) p3.d();
        com.google.android.gms.internal.measurement.G0 p4 = com.google.android.gms.internal.measurement.H0.p();
        p4.h("_ev");
        p4.i(str);
        com.google.android.gms.internal.measurement.H0 h03 = (com.google.android.gms.internal.measurement.H0) p4.d();
        if (d02.f11740q) {
            d02.f();
            d02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.E0.u((com.google.android.gms.internal.measurement.E0) d02.f11739p, h02);
        if (d02.f11740q) {
            d02.f();
            d02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.E0.u((com.google.android.gms.internal.measurement.E0) d02.f11739p, h03);
    }

    public static final void y(com.google.android.gms.internal.measurement.D0 d02, String str) {
        List unmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.E0) d02.f11739p).s());
        for (int i4 = 0; i4 < unmodifiableList.size(); i4++) {
            if (str.equals(((com.google.android.gms.internal.measurement.H0) unmodifiableList.get(i4)).q())) {
                d02.j(i4);
                return;
            }
        }
    }

    public final Boolean A(C2082k0 c2082k0) {
        try {
            long B4 = c2082k0.B();
            C2066c0 c2066c0 = this.f15491l;
            if (B4 != -2147483648L) {
                if (c2082k0.B() == m2.c.a(c2066c0.f15562a).b(c2082k0.F(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = m2.c.a(c2066c0.f15562a).b(c2082k0.F(), 0).versionName;
                String H3 = c2082k0.H();
                if (H3 != null && H3.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void B() {
        t().g();
        if (this.f15498s || this.f15499t || this.f15500u) {
            c().f15402n.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f15498s), Boolean.valueOf(this.f15499t), Boolean.valueOf(this.f15500u));
            return;
        }
        c().f15402n.a("Stopping uploading service(s)");
        ArrayList arrayList = this.f15495p;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.f15495p;
        h2.y.i(arrayList2);
        arrayList2.clear();
    }

    public final void C(com.google.android.gms.internal.measurement.L0 l02, long j4, boolean z4) {
        Z0 z02;
        Object obj;
        String str = true != z4 ? "_lte" : "_se";
        C2083l c2083l = this.c;
        I(c2083l);
        Z0 F2 = c2083l.F(l02.M(), str);
        if (F2 == null || (obj = F2.f15520e) == null) {
            String M4 = l02.M();
            d().getClass();
            z02 = new Z0(M4, "auto", str, System.currentTimeMillis(), Long.valueOf(j4));
        } else {
            String M5 = l02.M();
            d().getClass();
            z02 = new Z0(M5, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j4));
        }
        com.google.android.gms.internal.measurement.S0 o4 = com.google.android.gms.internal.measurement.T0.o();
        o4.h(str);
        d().getClass();
        o4.i(System.currentTimeMillis());
        Object obj2 = z02.f15520e;
        o4.g(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.T0 t02 = (com.google.android.gms.internal.measurement.T0) o4.d();
        int u2 = O.u(l02, str);
        if (u2 >= 0) {
            if (l02.f11740q) {
                l02.f();
                l02.f11740q = false;
            }
            com.google.android.gms.internal.measurement.M0.r0((com.google.android.gms.internal.measurement.M0) l02.f11739p, u2, t02);
        } else {
            if (l02.f11740q) {
                l02.f();
                l02.f11740q = false;
            }
            com.google.android.gms.internal.measurement.M0.s0((com.google.android.gms.internal.measurement.M0) l02.f11739p, t02);
        }
        if (j4 > 0) {
            C2083l c2083l2 = this.c;
            I(c2083l2);
            c2083l2.q(z02);
            c().f15402n.c(true != z4 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:411:0x0ced, code lost:
    
        if (r9 > (((java.lang.Long) r0.a(null)).longValue() + r7)) goto L407;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f5 A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04bc A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0502 A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0903 A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x094a A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x096f A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x09f7 A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0a21 A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0cd4 A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0d68 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #4 {all -> 0x011f, blocks: (B:3:0x0016, B:5:0x002e, B:8:0x0036, B:10:0x0044, B:11:0x0049, B:12:0x0059, B:15:0x0077, B:18:0x00a2, B:20:0x00e0, B:23:0x00f8, B:25:0x0102, B:28:0x0573, B:29:0x012f, B:31:0x0145, B:34:0x0165, B:36:0x016f, B:38:0x017f, B:40:0x018d, B:42:0x019d, B:44:0x01a8, B:49:0x01ab, B:52:0x01c2, B:62:0x0210, B:65:0x021e, B:67:0x022c, B:70:0x027b, B:71:0x024b, B:73:0x025b, B:80:0x0284, B:82:0x02b7, B:83:0x02df, B:85:0x031d, B:86:0x0323, B:89:0x032f, B:91:0x036b, B:92:0x0388, B:94:0x0392, B:96:0x03a0, B:98:0x03b4, B:99:0x03a8, B:107:0x03bb, B:110:0x03c2, B:111:0x03da, B:113:0x03f5, B:114:0x0409, B:117:0x0413, B:121:0x0436, B:122:0x0425, B:131:0x04b0, B:133:0x04bc, B:136:0x04cd, B:138:0x04de, B:140:0x04ea, B:142:0x055f, B:150:0x0502, B:152:0x050e, B:155:0x0521, B:157:0x0532, B:159:0x053e, B:162:0x043e, B:164:0x044a, B:166:0x0456, B:170:0x049a, B:171:0x0472, B:174:0x0484, B:176:0x048a, B:178:0x0494, B:193:0x058b, B:195:0x059d, B:197:0x05a6, B:199:0x05d6, B:200:0x05ae, B:202:0x05b7, B:204:0x05bd, B:206:0x05c9, B:208:0x05d1, B:215:0x05d9, B:216:0x05ed, B:219:0x05f5, B:222:0x0607, B:223:0x0613, B:225:0x061b, B:226:0x0651, B:228:0x0678, B:230:0x0687, B:232:0x068d, B:234:0x0697, B:235:0x06c0, B:237:0x06ca, B:241:0x06dc, B:243:0x06e0, B:244:0x06e6, B:239:0x06ee, B:246:0x06f1, B:248:0x06f5, B:249:0x06fb, B:250:0x0702, B:252:0x0706, B:253:0x070c, B:255:0x071c, B:256:0x0722, B:257:0x072c, B:259:0x0736, B:261:0x074e, B:263:0x0756, B:264:0x075c, B:265:0x0763, B:267:0x0773, B:269:0x077b, B:270:0x0781, B:272:0x0788, B:275:0x078b, B:277:0x07dd, B:278:0x07f0, B:280:0x07fa, B:283:0x0819, B:285:0x0832, B:287:0x084a, B:289:0x0852, B:291:0x0856, B:293:0x085a, B:295:0x0864, B:296:0x086f, B:298:0x0873, B:300:0x0879, B:301:0x0884, B:302:0x0892, B:305:0x0b0b, B:310:0x089d, B:377:0x08ba, B:314:0x08e1, B:316:0x0903, B:317:0x090b, B:319:0x0911, B:322:0x0923, B:327:0x094a, B:328:0x096f, B:330:0x097b, B:332:0x0994, B:333:0x09dd, B:338:0x09f7, B:340:0x0a02, B:342:0x0a06, B:344:0x0a0a, B:346:0x0a0e, B:347:0x0a1a, B:349:0x0a21, B:351:0x0a27, B:353:0x0a3d, B:354:0x0a42, B:355:0x0b08, B:357:0x0a80, B:359:0x0a84, B:362:0x0a98, B:364:0x0ab4, B:365:0x0abb, B:368:0x0afc, B:369:0x0a89, B:375:0x0934, B:381:0x08c2, B:383:0x0b15, B:385:0x0b27, B:387:0x0b2b, B:388:0x0b31, B:389:0x0b3b, B:390:0x0b43, B:392:0x0b49, B:394:0x0b62, B:396:0x0b75, B:397:0x0c0c, B:399:0x0c16, B:401:0x0c2e, B:404:0x0c35, B:406:0x0c3d, B:407:0x0c43, B:408:0x0c84, B:410:0x0cd4, B:412:0x0d14, B:414:0x0d18, B:415:0x0d23, B:417:0x0d68, B:419:0x0d75, B:421:0x0d84, B:424:0x0d9f, B:427:0x0dba, B:428:0x0cef, B:429:0x0c4b, B:431:0x0c59, B:433:0x0c5d, B:434:0x0c63, B:435:0x0c6b, B:436:0x0dd3, B:437:0x0ded, B:440:0x0df5, B:442:0x0dfa, B:445:0x0e0a, B:447:0x0e24, B:448:0x0e41, B:450:0x0e4a, B:451:0x0e6a, B:457:0x0e55, B:458:0x0b90, B:460:0x0b9a, B:462:0x0baa, B:463:0x0bb1, B:468:0x0bc7, B:469:0x0bce, B:471:0x0bfd, B:472:0x0c04, B:473:0x0c01, B:474:0x0bcb, B:476:0x0bae, B:478:0x0621, B:480:0x0627, B:482:0x062b, B:483:0x0631, B:486:0x0e7d), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0d84 A[Catch: all -> 0x011f, SQLiteException -> 0x0d9e, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0d9e, blocks: (B:419:0x0d75, B:421:0x0d84), top: B:418:0x0d75, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(long r50) {
        /*
            Method dump skipped, instructions count: 3736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.E(long):boolean");
    }

    public final boolean F() {
        t().g();
        e();
        C2083l c2083l = this.c;
        I(c2083l);
        if (c2083l.u("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        C2083l c2083l2 = this.c;
        I(c2083l2);
        return !TextUtils.isEmpty(c2083l2.H());
    }

    public final boolean G(com.google.android.gms.internal.measurement.D0 d02, com.google.android.gms.internal.measurement.D0 d03) {
        h2.y.b("_e".equals(d02.n()));
        O o4 = this.f15486g;
        I(o4);
        com.google.android.gms.internal.measurement.H0 k3 = O.k((com.google.android.gms.internal.measurement.E0) d02.d(), "_sc");
        String r4 = k3 == null ? null : k3.r();
        I(o4);
        com.google.android.gms.internal.measurement.H0 k4 = O.k((com.google.android.gms.internal.measurement.E0) d03.d(), "_pc");
        String r5 = k4 != null ? k4.r() : null;
        if (r5 == null || !r5.equals(r4)) {
            return false;
        }
        h2.y.b("_e".equals(d02.n()));
        I(o4);
        com.google.android.gms.internal.measurement.H0 k5 = O.k((com.google.android.gms.internal.measurement.E0) d02.d(), "_et");
        if (k5 == null || !k5.F() || k5.o() <= 0) {
            return true;
        }
        long o5 = k5.o();
        I(o4);
        com.google.android.gms.internal.measurement.H0 k6 = O.k((com.google.android.gms.internal.measurement.E0) d03.d(), "_et");
        if (k6 != null && k6.o() > 0) {
            o5 += k6.o();
        }
        I(o4);
        O.R(d03, "_et", Long.valueOf(o5));
        I(o4);
        O.R(d02, "_fr", 1L);
        return true;
    }

    public final C2082k0 J(d1 d1Var) {
        t().g();
        e();
        h2.y.i(d1Var);
        String str = d1Var.f15609u;
        String str2 = d1Var.f15605q;
        String str3 = d1Var.y;
        String str4 = d1Var.f15601K;
        boolean z4 = d1Var.f15593C;
        String str5 = d1Var.f15603o;
        h2.y.e(str5);
        q3.c();
        if (K().p(str5, B.f15320q0) && !str4.isEmpty()) {
            this.f15478B.put(str5, new W0(this, str4));
        }
        C2083l c2083l = this.c;
        I(c2083l);
        C2082k0 B4 = c2083l.B(str5);
        C2077i c = L(str5).c(C2077i.b(d1Var.f15600J));
        EnumC2075h enumC2075h = EnumC2075h.f15668p;
        String l4 = c.f(enumC2075h) ? this.f15488i.l(str5, z4) : "";
        EnumC2075h enumC2075h2 = EnumC2075h.f15669q;
        if (B4 == null) {
            B4 = new C2082k0(this.f15491l, str5);
            if (c.f(enumC2075h2)) {
                B4.c(R(c));
            }
            if (c.f(enumC2075h)) {
                B4.y(l4);
            }
        } else {
            if (c.f(enumC2075h) && l4 != null) {
                C2064b0 c2064b0 = B4.f15695a.f15569j;
                C2066c0.i(c2064b0);
                c2064b0.g();
                if (!l4.equals(B4.f15697e)) {
                    B4.y(l4);
                    if (z4) {
                        L0 l02 = this.f15488i;
                        l02.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((c.f(enumC2075h) ? l02.k(str5) : new Pair("", Boolean.FALSE)).first)) {
                            B4.c(R(c));
                            C2083l c2083l2 = this.c;
                            I(c2083l2);
                            if (c2083l2.F(str5, "_id") != null) {
                                C2083l c2083l3 = this.c;
                                I(c2083l3);
                                if (c2083l3.F(str5, "_lair") == null) {
                                    d().getClass();
                                    Z0 z02 = new Z0(d1Var.f15603o, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    C2083l c2083l4 = this.c;
                                    I(c2083l4);
                                    c2083l4.q(z02);
                                }
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(B4.G()) && c.f(enumC2075h2)) {
                B4.c(R(c));
            }
        }
        C2066c0 c2066c0 = B4.f15695a;
        B4.r(d1Var.f15604p);
        B4.b(d1Var.f15595E);
        if (!TextUtils.isEmpty(str3)) {
            B4.q(str3);
        }
        long j4 = d1Var.f15607s;
        if (j4 != 0) {
            B4.s(j4);
        }
        if (!TextUtils.isEmpty(str2)) {
            B4.e(str2);
        }
        B4.f(d1Var.f15612x);
        String str6 = d1Var.f15606r;
        if (str6 != null) {
            B4.d(str6);
        }
        B4.n(d1Var.f15608t);
        B4.x(d1Var.f15610v);
        if (!TextUtils.isEmpty(str)) {
            B4.t(str);
        }
        C2064b0 c2064b02 = c2066c0.f15569j;
        C2066c0.i(c2064b02);
        c2064b02.g();
        B4.f15692C |= B4.f15708p != z4;
        B4.f15708p = z4;
        Boolean bool = d1Var.f15596F;
        C2064b0 c2064b03 = c2066c0.f15569j;
        C2066c0.i(c2064b03);
        c2064b03.g();
        B4.f15692C |= !AbstractC2080j0.d(B4.f15710r, bool);
        B4.f15710r = bool;
        B4.o(d1Var.f15597G);
        t3.a();
        if (K().p(null, B.f15316o0)) {
            String str7 = d1Var.f15602L;
            C2064b0 c2064b04 = c2066c0.f15569j;
            C2066c0.i(c2064b04);
            c2064b04.g();
            B4.f15692C |= true ^ AbstractC2080j0.d(B4.f15713u, str7);
            B4.f15713u = str7;
        }
        M2 m22 = M2.f11786p;
        ((N2) m22.f11787o.b()).getClass();
        if (K().p(null, B.f15300g0)) {
            B4.z(d1Var.f15598H);
        } else {
            ((N2) m22.f11787o.b()).getClass();
            if (K().p(null, B.f15298f0)) {
                B4.z(null);
            }
        }
        C2064b0 c2064b05 = c2066c0.f15569j;
        C2066c0.i(c2064b05);
        c2064b05.g();
        if (B4.f15692C) {
            C2083l c2083l5 = this.c;
            I(c2083l5);
            c2083l5.m(B4);
        }
        return B4;
    }

    public final C2073g K() {
        C2066c0 c2066c0 = this.f15491l;
        h2.y.i(c2066c0);
        return c2066c0.f15566g;
    }

    public final C2077i L(String str) {
        String str2;
        C2077i c2077i = C2077i.f15674b;
        t().g();
        e();
        C2077i c2077i2 = (C2077i) this.f15477A.get(str);
        if (c2077i2 != null) {
            return c2077i2;
        }
        C2083l c2083l = this.c;
        I(c2083l);
        h2.y.i(str);
        c2083l.g();
        c2083l.h();
        Cursor cursor = null;
        try {
            try {
                cursor = c2083l.A().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursor.moveToFirst()) {
                    str2 = cursor.getString(0);
                    cursor.close();
                } else {
                    cursor.close();
                    str2 = "G1";
                }
                C2077i b4 = C2077i.b(str2);
                q(str, b4);
                return b4;
            } catch (SQLiteException e4) {
                K k3 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15394f.c("select consent_state from consent_settings where app_id=? limit 1;", e4, "Database error");
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C2083l M() {
        C2083l c2083l = this.c;
        I(c2083l);
        return c2083l;
    }

    public final B0.t N() {
        B0.t tVar = this.d;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final O P() {
        O o4 = this.f15486g;
        I(o4);
        return o4;
    }

    public final b1 Q() {
        C2066c0 c2066c0 = this.f15491l;
        h2.y.i(c2066c0);
        b1 b1Var = c2066c0.f15571l;
        C2066c0.g(b1Var);
        return b1Var;
    }

    public final String R(C2077i c2077i) {
        if (!c2077i.f(EnumC2075h.f15669q)) {
            return null;
        }
        byte[] bArr = new byte[16];
        Q().o().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void a() {
        t().g();
        e();
        if (this.f15493n) {
            return;
        }
        this.f15493n = true;
        t().g();
        FileLock fileLock = this.f15501v;
        C2066c0 c2066c0 = this.f15491l;
        if (fileLock == null || !fileLock.isValid()) {
            ((C2066c0) this.c.f1719a).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(c2066c0.f15562a.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f15502w = channel;
                FileLock tryLock = channel.tryLock();
                this.f15501v = tryLock;
                if (tryLock == null) {
                    c().f15394f.a("Storage concurrent data access panic");
                    return;
                }
                c().f15402n.a("Storage concurrent access okay");
            } catch (FileNotFoundException e4) {
                c().f15394f.b(e4, "Failed to acquire storage lock");
                return;
            } catch (IOException e5) {
                c().f15394f.b(e5, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e6) {
                c().f15397i.b(e6, "Storage lock already acquired");
                return;
            }
        } else {
            c().f15402n.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f15502w;
        t().g();
        int i4 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            c().f15394f.a("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i4 = allocate.getInt();
                } else if (read != -1) {
                    c().f15397i.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e7) {
                c().f15394f.b(e7, "Failed to read from channel");
            }
        }
        E m4 = c2066c0.m();
        m4.e();
        int i5 = m4.f15351e;
        t().g();
        if (i4 > i5) {
            c().f15394f.c(Integer.valueOf(i4), Integer.valueOf(i5), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i4 < i5) {
            FileChannel fileChannel2 = this.f15502w;
            t().g();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                c().f15394f.a("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i5);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        c().f15394f.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    c().f15402n.c(Integer.valueOf(i4), Integer.valueOf(i5), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e8) {
                    c().f15394f.b(e8, "Failed to write to channel");
                }
            }
            c().f15394f.c(Integer.valueOf(i4), Integer.valueOf(i5), "Storage version upgrade failed. Previous, current version");
        }
    }

    @Override // x2.InterfaceC2078i0
    public final Context b() {
        return this.f15491l.f15562a;
    }

    @Override // x2.InterfaceC2078i0
    public final K c() {
        C2066c0 c2066c0 = this.f15491l;
        h2.y.i(c2066c0);
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        return k3;
    }

    @Override // x2.InterfaceC2078i0
    public final C1798a d() {
        C2066c0 c2066c0 = this.f15491l;
        h2.y.i(c2066c0);
        return c2066c0.f15573n;
    }

    public final void e() {
        if (!this.f15492m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01dc, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.measurement.L0 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.f(com.google.android.gms.internal.measurement.L0, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [r.i] */
    /* JADX WARN: Type inference failed for: r5v2, types: [r.i] */
    public final void g(C2082k0 c2082k0) {
        r.e eVar;
        r.e eVar2;
        X x4 = this.f15482a;
        t().g();
        if (TextUtils.isEmpty(c2082k0.J()) && TextUtils.isEmpty(c2082k0.D())) {
            String F2 = c2082k0.F();
            h2.y.i(F2);
            k(F2, 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        String J4 = c2082k0.J();
        if (TextUtils.isEmpty(J4)) {
            J4 = c2082k0.D();
        }
        r.e eVar3 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) B.f15295e.a(null)).encodedAuthority((String) B.f15297f.a(null)).path("config/app/".concat(String.valueOf(J4))).appendQueryParameter("platform", "android");
        U0 u02 = this.f15489j;
        ((C2066c0) u02.f1719a).f15566g.l();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(73000L)).appendQueryParameter("runtime_version", "0");
        q3.c();
        if (!((C2066c0) u02.f1719a).f15566g.p(c2082k0.F(), B.f15302h0)) {
            builder.appendQueryParameter("app_instance_id", c2082k0.G());
        }
        String uri = builder.build().toString();
        try {
            String F4 = c2082k0.F();
            h2.y.i(F4);
            URL url = new URL(uri);
            c().f15402n.b(F4, "Fetching remote configuration");
            I(x4);
            C1582v0 q4 = x4.q(F4);
            I(x4);
            x4.g();
            String str = (String) x4.f15474m.get(F4);
            if (q4 != null) {
                if (TextUtils.isEmpty(str)) {
                    eVar2 = null;
                } else {
                    ?? iVar = new r.i(0);
                    iVar.put("If-Modified-Since", str);
                    eVar2 = iVar;
                }
                q3.c();
                if (K().p(null, B.f15326t0)) {
                    I(x4);
                    x4.g();
                    String str2 = (String) x4.f15475n.get(F4);
                    Object obj = eVar2;
                    if (!TextUtils.isEmpty(str2)) {
                        if (eVar2 == null) {
                            obj = new r.i(0);
                        }
                        ?? r5 = obj;
                        r5.put("If-None-Match", str2);
                        eVar3 = r5;
                    }
                }
                eVar = eVar2;
                this.f15498s = true;
                O o4 = this.f15483b;
                I(o4);
                C1748e c1748e = new C1748e(24, this);
                o4.g();
                o4.h();
                C2064b0 c2064b0 = ((C2066c0) o4.f1719a).f15569j;
                C2066c0.i(c2064b0);
                c2064b0.n(new N(o4, F4, url, null, eVar, c1748e));
            }
            eVar = eVar3;
            this.f15498s = true;
            O o42 = this.f15483b;
            I(o42);
            C1748e c1748e2 = new C1748e(24, this);
            o42.g();
            o42.h();
            C2064b0 c2064b02 = ((C2066c0) o42.f1719a).f15569j;
            C2066c0.i(c2064b02);
            c2064b02.n(new N(o42, F4, url, null, eVar, c1748e2));
        } catch (MalformedURLException unused) {
            c().f15394f.c(K.n(c2082k0.F()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }

    public final void h(C2096s c2096s, d1 d1Var) {
        C2096s c2096s2;
        List J4;
        C2066c0 c2066c0;
        List<C2065c> J5;
        List<C2065c> J6;
        String str;
        h2.y.i(d1Var);
        String str2 = d1Var.f15603o;
        h2.y.e(str2);
        t().g();
        e();
        long j4 = c2096s.f15784r;
        L c = L.c(c2096s);
        t().g();
        C2111z0 c2111z0 = null;
        if (this.f15479C != null && (str = this.f15480D) != null && str.equals(str2)) {
            c2111z0 = this.f15479C;
        }
        b1.s(c2111z0, (Bundle) c.f15407e, false);
        C2096s b4 = c.b();
        String str3 = b4.f15781o;
        I(this.f15486g);
        if (TextUtils.isEmpty(d1Var.f15604p) && TextUtils.isEmpty(d1Var.f15595E)) {
            return;
        }
        if (!d1Var.f15610v) {
            J(d1Var);
            return;
        }
        List list = d1Var.f15598H;
        if (list == null) {
            c2096s2 = b4;
        } else if (!list.contains(str3)) {
            c().f15401m.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, b4.f15783q);
            return;
        } else {
            Bundle h4 = b4.f15782p.h();
            h4.putLong("ga_safelisted", 1L);
            c2096s2 = new C2096s(b4.f15781o, new r(h4), b4.f15783q, b4.f15784r);
        }
        C2083l c2083l = this.c;
        I(c2083l);
        c2083l.M();
        try {
            C2083l c2083l2 = this.c;
            I(c2083l2);
            h2.y.e(str2);
            c2083l2.g();
            c2083l2.h();
            if (j4 < 0) {
                K k3 = ((C2066c0) c2083l2.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15397i.c(K.n(str2), Long.valueOf(j4), "Invalid time querying timed out conditional properties");
                J4 = Collections.EMPTY_LIST;
            } else {
                J4 = c2083l2.J("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j4)});
            }
            Iterator it = J4.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c2066c0 = this.f15491l;
                if (!hasNext) {
                    break;
                }
                C2065c c2065c = (C2065c) it.next();
                if (c2065c != null) {
                    c().f15402n.d("User property timed out", c2065c.f15544o, c2066c0.f15572m.f(c2065c.f15546q.f15508p), c2065c.f15546q.h());
                    C2096s c2096s3 = c2065c.f15550u;
                    if (c2096s3 != null) {
                        u(new C2096s(c2096s3, j4), d1Var);
                    }
                    C2083l c2083l3 = this.c;
                    I(c2083l3);
                    c2083l3.v(str2, c2065c.f15546q.f15508p);
                }
            }
            C2083l c2083l4 = this.c;
            I(c2083l4);
            h2.y.e(str2);
            c2083l4.g();
            c2083l4.h();
            if (j4 < 0) {
                K k4 = ((C2066c0) c2083l4.f1719a).f15568i;
                C2066c0.i(k4);
                k4.f15397i.c(K.n(str2), Long.valueOf(j4), "Invalid time querying expired conditional properties");
                J5 = Collections.EMPTY_LIST;
            } else {
                J5 = c2083l4.J("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j4)});
            }
            ArrayList arrayList = new ArrayList(J5.size());
            for (C2065c c2065c2 : J5) {
                if (c2065c2 != null) {
                    c().f15402n.d("User property expired", c2065c2.f15544o, c2066c0.f15572m.f(c2065c2.f15546q.f15508p), c2065c2.f15546q.h());
                    C2083l c2083l5 = this.c;
                    I(c2083l5);
                    c2083l5.k(str2, c2065c2.f15546q.f15508p);
                    C2096s c2096s4 = c2065c2.y;
                    if (c2096s4 != null) {
                        arrayList.add(c2096s4);
                    }
                    C2083l c2083l6 = this.c;
                    I(c2083l6);
                    c2083l6.v(str2, c2065c2.f15546q.f15508p);
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                u(new C2096s((C2096s) obj, j4), d1Var);
            }
            C2083l c2083l7 = this.c;
            I(c2083l7);
            C2066c0 c2066c02 = (C2066c0) c2083l7.f1719a;
            String str4 = c2096s2.f15781o;
            h2.y.e(str2);
            h2.y.e(str4);
            c2083l7.g();
            c2083l7.h();
            if (j4 < 0) {
                K k5 = c2066c02.f15568i;
                C2066c0.i(k5);
                k5.f15397i.d("Invalid time querying triggered conditional properties", K.n(str2), c2066c02.f15572m.d(str4), Long.valueOf(j4));
                J6 = Collections.EMPTY_LIST;
            } else {
                J6 = c2083l7.J("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j4)});
            }
            ArrayList arrayList2 = new ArrayList(J6.size());
            for (C2065c c2065c3 : J6) {
                if (c2065c3 != null) {
                    Y0 y02 = c2065c3.f15546q;
                    String str5 = c2065c3.f15544o;
                    h2.y.i(str5);
                    String str6 = c2065c3.f15545p;
                    String str7 = y02.f15508p;
                    Object h5 = y02.h();
                    h2.y.i(h5);
                    Z0 z02 = new Z0(str5, str6, str7, j4, h5);
                    Object obj2 = z02.f15520e;
                    String str8 = z02.c;
                    C2083l c2083l8 = this.c;
                    I(c2083l8);
                    if (c2083l8.q(z02)) {
                        c().f15402n.d("User property triggered", c2065c3.f15544o, c2066c0.f15572m.f(str8), obj2);
                    } else {
                        c().f15394f.d("Too many active user properties, ignoring", K.n(c2065c3.f15544o), c2066c0.f15572m.f(str8), obj2);
                    }
                    C2096s c2096s5 = c2065c3.f15552w;
                    if (c2096s5 != null) {
                        arrayList2.add(c2096s5);
                    }
                    c2065c3.f15546q = new Y0(z02);
                    c2065c3.f15548s = true;
                    C2083l c2083l9 = this.c;
                    I(c2083l9);
                    c2083l9.p(c2065c3);
                }
            }
            u(c2096s2, d1Var);
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj3 = arrayList2.get(i5);
                i5++;
                u(new C2096s((C2096s) obj3, j4), d1Var);
            }
            C2083l c2083l10 = this.c;
            I(c2083l10);
            c2083l10.l();
            C2083l c2083l11 = this.c;
            I(c2083l11);
            c2083l11.N();
        } catch (Throwable th) {
            C2083l c2083l12 = this.c;
            I(c2083l12);
            c2083l12.N();
            throw th;
        }
    }

    public final void i(C2096s c2096s, String str) {
        C2083l c2083l = this.c;
        I(c2083l);
        C2082k0 B4 = c2083l.B(str);
        if (B4 != null) {
            C2066c0 c2066c0 = B4.f15695a;
            if (!TextUtils.isEmpty(B4.H())) {
                Boolean A3 = A(B4);
                if (A3 == null) {
                    if (!"_ui".equals(c2096s.f15781o)) {
                        c().f15397i.b(K.n(str), "Could not find package. appId");
                    }
                } else if (!A3.booleanValue()) {
                    c().f15394f.b(K.n(str), "App version does not match; dropping event. appId");
                    return;
                }
                String J4 = B4.J();
                String H3 = B4.H();
                long B5 = B4.B();
                C2064b0 c2064b0 = c2066c0.f15569j;
                C2066c0.i(c2064b0);
                c2064b0.g();
                String str2 = B4.f15704l;
                C2064b0 c2064b02 = c2066c0.f15569j;
                C2066c0.i(c2064b02);
                c2064b02.g();
                long j4 = B4.f15705m;
                C2064b0 c2064b03 = c2066c0.f15569j;
                C2066c0.i(c2064b03);
                c2064b03.g();
                long j5 = B4.f15706n;
                C2064b0 c2064b04 = c2066c0.f15569j;
                C2066c0.i(c2064b04);
                c2064b04.g();
                boolean z4 = B4.f15707o;
                String I4 = B4.I();
                C2064b0 c2064b05 = c2066c0.f15569j;
                C2066c0.i(c2064b05);
                c2064b05.g();
                boolean A4 = B4.A();
                String D4 = B4.D();
                C2064b0 c2064b06 = c2066c0.f15569j;
                C2066c0.i(c2064b06);
                c2064b06.g();
                Boolean bool = B4.f15710r;
                long C4 = B4.C();
                C2064b0 c2064b07 = c2066c0.f15569j;
                C2066c0.i(c2064b07);
                c2064b07.g();
                j(c2096s, new d1(str, J4, H3, B5, str2, j4, j5, null, z4, false, I4, 0L, 0, A4, false, D4, bool, C4, B4.f15712t, L(str).e(), "", null));
                return;
            }
        }
        c().f15401m.b(str, "No app data available; dropping event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d7: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:62:0x00d7 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(x2.C2096s r13, x2.d1 r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.j(x2.s, x2.d1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0178, B:23:0x006a, B:27:0x00c6, B:28:0x00b4, B:30:0x00cd, B:32:0x00d9, B:34:0x00df, B:35:0x00e7, B:38:0x00f8, B:40:0x0104, B:42:0x010a, B:46:0x0117, B:47:0x012d, B:49:0x0145, B:50:0x0160, B:52:0x016b, B:54:0x0171, B:55:0x0175, B:56:0x0151, B:57:0x011e, B:59:0x0127), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0178, B:23:0x006a, B:27:0x00c6, B:28:0x00b4, B:30:0x00cd, B:32:0x00d9, B:34:0x00df, B:35:0x00e7, B:38:0x00f8, B:40:0x0104, B:42:0x010a, B:46:0x0117, B:47:0x012d, B:49:0x0145, B:50:0x0160, B:52:0x016b, B:54:0x0171, B:55:0x0175, B:56:0x0151, B:57:0x011e, B:59:0x0127), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0178, B:23:0x006a, B:27:0x00c6, B:28:0x00b4, B:30:0x00cd, B:32:0x00d9, B:34:0x00df, B:35:0x00e7, B:38:0x00f8, B:40:0x0104, B:42:0x010a, B:46:0x0117, B:47:0x012d, B:49:0x0145, B:50:0x0160, B:52:0x016b, B:54:0x0171, B:55:0x0175, B:56:0x0151, B:57:0x011e, B:59:0x0127), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0178, B:23:0x006a, B:27:0x00c6, B:28:0x00b4, B:30:0x00cd, B:32:0x00d9, B:34:0x00df, B:35:0x00e7, B:38:0x00f8, B:40:0x0104, B:42:0x010a, B:46:0x0117, B:47:0x012d, B:49:0x0145, B:50:0x0160, B:52:0x016b, B:54:0x0171, B:55:0x0175, B:56:0x0151, B:57:0x011e, B:59:0x0127), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0178, B:23:0x006a, B:27:0x00c6, B:28:0x00b4, B:30:0x00cd, B:32:0x00d9, B:34:0x00df, B:35:0x00e7, B:38:0x00f8, B:40:0x0104, B:42:0x010a, B:46:0x0117, B:47:0x012d, B:49:0x0145, B:50:0x0160, B:52:0x016b, B:54:0x0171, B:55:0x0175, B:56:0x0151, B:57:0x011e, B:59:0x0127), top: B:4:0x002e, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.k(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:108|109|(2:111|(8:113|(3:115|(2:117|(1:119))(1:139)|138)(1:140)|120|(1:122)(1:137)|123|124|125|(4:127|(1:129)(1:133)|130|(1:132))))|141|124|125|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04c2, code lost:
    
        c().f15394f.c(x2.K.n(r10), r0, "Application info is null, first open report might be inaccurate. appId");
        r0 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04f3 A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04d4 A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0558 A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a3 A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0236 A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026e A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0296 A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b1 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x041c A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0437 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #7 {all -> 0x00ca, blocks: (B:24:0x00af, B:26:0x00bd, B:29:0x00cf, B:31:0x00d3, B:34:0x00e3, B:36:0x00f0, B:38:0x00fa, B:41:0x0100, B:42:0x0110, B:44:0x011e, B:46:0x0133, B:48:0x015c, B:51:0x0166, B:54:0x01d9, B:57:0x01de, B:59:0x01e4, B:61:0x01f3, B:65:0x0236, B:67:0x0241, B:70:0x0252, B:73:0x0260, B:76:0x026b, B:78:0x026e, B:82:0x0291, B:84:0x0296, B:86:0x02b1, B:89:0x02c3, B:91:0x02e7, B:93:0x03ef, B:95:0x041c, B:96:0x041f, B:98:0x0437, B:102:0x04f3, B:103:0x04f6, B:104:0x0578, B:109:0x044a, B:111:0x0467, B:113:0x046f, B:115:0x0475, B:119:0x0488, B:120:0x049b, B:123:0x04a7, B:125:0x04b7, B:136:0x04c2, B:127:0x04d4, B:129:0x04dc, B:130:0x04e4, B:132:0x04ea, B:139:0x0493, B:144:0x0455, B:145:0x02f8, B:147:0x0308, B:148:0x0317, B:150:0x0341, B:151:0x0350, B:153:0x0357, B:155:0x035d, B:157:0x0367, B:159:0x036d, B:161:0x0373, B:163:0x0379, B:165:0x037e, B:168:0x0398, B:171:0x039e, B:175:0x03b1, B:178:0x03bd, B:185:0x03d0, B:186:0x03e0, B:187:0x050e, B:189:0x053d, B:190:0x0540, B:191:0x0558, B:193:0x055c, B:194:0x02a3, B:198:0x0215), top: B:23:0x00af, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(x2.d1 r34) {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.l(x2.d1):void");
    }

    public final void m(C2065c c2065c, d1 d1Var) {
        C2096s c2096s = c2065c.y;
        h2.y.e(c2065c.f15544o);
        h2.y.i(c2065c.f15546q);
        h2.y.e(c2065c.f15546q.f15508p);
        t().g();
        e();
        if (H(d1Var)) {
            if (!d1Var.f15610v) {
                J(d1Var);
                return;
            }
            C2083l c2083l = this.c;
            I(c2083l);
            c2083l.M();
            try {
                J(d1Var);
                String str = c2065c.f15544o;
                h2.y.i(str);
                C2083l c2083l2 = this.c;
                I(c2083l2);
                C2065c C4 = c2083l2.C(str, c2065c.f15546q.f15508p);
                C2066c0 c2066c0 = this.f15491l;
                if (C4 != null) {
                    c().f15401m.c(c2065c.f15544o, c2066c0.f15572m.f(c2065c.f15546q.f15508p), "Removing conditional user property");
                    C2083l c2083l3 = this.c;
                    I(c2083l3);
                    c2083l3.v(str, c2065c.f15546q.f15508p);
                    if (C4.f15548s) {
                        C2083l c2083l4 = this.c;
                        I(c2083l4);
                        c2083l4.k(str, c2065c.f15546q.f15508p);
                    }
                    if (c2096s != null) {
                        r rVar = c2096s.f15782p;
                        C2096s m02 = Q().m0(c2096s.f15781o, rVar != null ? rVar.h() : null, C4.f15545p, c2096s.f15784r, true);
                        h2.y.i(m02);
                        u(m02, d1Var);
                    }
                } else {
                    c().f15397i.c(K.n(c2065c.f15544o), c2066c0.f15572m.f(c2065c.f15546q.f15508p), "Conditional user property doesn't exist");
                }
                C2083l c2083l5 = this.c;
                I(c2083l5);
                c2083l5.l();
                C2083l c2083l6 = this.c;
                I(c2083l6);
                c2083l6.N();
            } catch (Throwable th) {
                C2083l c2083l7 = this.c;
                I(c2083l7);
                c2083l7.N();
                throw th;
            }
        }
    }

    public final void n(Y0 y02, d1 d1Var) {
        t().g();
        e();
        boolean H3 = H(d1Var);
        String str = d1Var.f15603o;
        Boolean bool = d1Var.f15596F;
        if (H3) {
            if (!d1Var.f15610v) {
                J(d1Var);
                return;
            }
            String str2 = y02.f15508p;
            if ("_npa".equals(str2) && bool != null) {
                c().f15401m.a("Falling back to manifest metadata value for ad personalization");
                d().getClass();
                r(new Y0(System.currentTimeMillis(), Long.valueOf(true != bool.booleanValue() ? 0L : 1L), "_npa", "auto"), d1Var);
                return;
            }
            I i4 = c().f15401m;
            C2066c0 c2066c0 = this.f15491l;
            i4.b(c2066c0.f15572m.f(str2), "Removing user property");
            C2083l c2083l = this.c;
            I(c2083l);
            c2083l.M();
            try {
                J(d1Var);
                if ("_id".equals(str2)) {
                    C2083l c2083l2 = this.c;
                    I(c2083l2);
                    h2.y.i(str);
                    c2083l2.k(str, "_lair");
                }
                C2083l c2083l3 = this.c;
                I(c2083l3);
                h2.y.i(str);
                c2083l3.k(str, str2);
                C2083l c2083l4 = this.c;
                I(c2083l4);
                c2083l4.l();
                c().f15401m.b(c2066c0.f15572m.f(str2), "User property removed");
                C2083l c2083l5 = this.c;
                I(c2083l5);
                c2083l5.N();
            } catch (Throwable th) {
                C2083l c2083l6 = this.c;
                I(c2083l6);
                c2083l6.N();
                throw th;
            }
        }
    }

    public final void o(d1 d1Var) {
        if (this.f15503x != null) {
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            arrayList.addAll(this.f15503x);
        }
        C2083l c2083l = this.c;
        I(c2083l);
        C2066c0 c2066c0 = (C2066c0) c2083l.f1719a;
        String str = d1Var.f15603o;
        h2.y.i(str);
        h2.y.e(str);
        c2083l.g();
        c2083l.h();
        try {
            SQLiteDatabase A3 = c2083l.A();
            String[] strArr = {str};
            int delete = A3.delete("apps", "app_id=?", strArr) + A3.delete("events", "app_id=?", strArr) + A3.delete("user_attributes", "app_id=?", strArr) + A3.delete("conditional_properties", "app_id=?", strArr) + A3.delete("raw_events", "app_id=?", strArr) + A3.delete("raw_events_metadata", "app_id=?", strArr) + A3.delete("queue", "app_id=?", strArr) + A3.delete("audience_filter_values", "app_id=?", strArr) + A3.delete("main_event_params", "app_id=?", strArr) + A3.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15402n.c(str, Integer.valueOf(delete), "Reset analytics data. app, records");
            }
        } catch (SQLiteException e4) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.c(K.n(str), e4, "Error resetting analytics data. appId, error");
        }
        if (d1Var.f15610v) {
            l(d1Var);
        }
    }

    public final void p(C2065c c2065c, d1 d1Var) {
        C2096s c2096s;
        h2.y.e(c2065c.f15544o);
        h2.y.i(c2065c.f15545p);
        h2.y.i(c2065c.f15546q);
        h2.y.e(c2065c.f15546q.f15508p);
        t().g();
        e();
        if (H(d1Var)) {
            if (!d1Var.f15610v) {
                J(d1Var);
                return;
            }
            C2065c c2065c2 = new C2065c(c2065c);
            boolean z4 = false;
            c2065c2.f15548s = false;
            C2083l c2083l = this.c;
            I(c2083l);
            c2083l.M();
            try {
                C2083l c2083l2 = this.c;
                I(c2083l2);
                String str = c2065c2.f15544o;
                h2.y.i(str);
                C2065c C4 = c2083l2.C(str, c2065c2.f15546q.f15508p);
                C2066c0 c2066c0 = this.f15491l;
                if (C4 != null && !C4.f15545p.equals(c2065c2.f15545p)) {
                    c().f15397i.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", c2066c0.f15572m.f(c2065c2.f15546q.f15508p), c2065c2.f15545p, C4.f15545p);
                }
                if (C4 != null && C4.f15548s) {
                    c2065c2.f15545p = C4.f15545p;
                    c2065c2.f15547r = C4.f15547r;
                    c2065c2.f15551v = C4.f15551v;
                    c2065c2.f15549t = C4.f15549t;
                    c2065c2.f15552w = C4.f15552w;
                    c2065c2.f15548s = true;
                    Y0 y02 = c2065c2.f15546q;
                    c2065c2.f15546q = new Y0(C4.f15546q.f15509q, y02.h(), y02.f15508p, C4.f15546q.f15512t);
                } else if (TextUtils.isEmpty(c2065c2.f15549t)) {
                    Y0 y03 = c2065c2.f15546q;
                    c2065c2.f15546q = new Y0(c2065c2.f15547r, y03.h(), y03.f15508p, c2065c2.f15546q.f15512t);
                    c2065c2.f15548s = true;
                    z4 = true;
                }
                if (c2065c2.f15548s) {
                    Y0 y04 = c2065c2.f15546q;
                    String str2 = c2065c2.f15544o;
                    h2.y.i(str2);
                    String str3 = c2065c2.f15545p;
                    String str4 = y04.f15508p;
                    long j4 = y04.f15509q;
                    Object h4 = y04.h();
                    h2.y.i(h4);
                    Z0 z02 = new Z0(str2, str3, str4, j4, h4);
                    Object obj = z02.f15520e;
                    String str5 = z02.c;
                    C2083l c2083l3 = this.c;
                    I(c2083l3);
                    if (c2083l3.q(z02)) {
                        c().f15401m.d("User property updated immediately", c2065c2.f15544o, c2066c0.f15572m.f(str5), obj);
                    } else {
                        c().f15394f.d("(2)Too many active user properties, ignoring", K.n(c2065c2.f15544o), c2066c0.f15572m.f(str5), obj);
                    }
                    if (z4 && (c2096s = c2065c2.f15552w) != null) {
                        u(new C2096s(c2096s, c2065c2.f15547r), d1Var);
                    }
                }
                C2083l c2083l4 = this.c;
                I(c2083l4);
                if (c2083l4.p(c2065c2)) {
                    c().f15401m.d("Conditional property added", c2065c2.f15544o, c2066c0.f15572m.f(c2065c2.f15546q.f15508p), c2065c2.f15546q.h());
                } else {
                    c().f15394f.d("Too many conditional properties, ignoring", K.n(c2065c2.f15544o), c2066c0.f15572m.f(c2065c2.f15546q.f15508p), c2065c2.f15546q.h());
                }
                C2083l c2083l5 = this.c;
                I(c2083l5);
                c2083l5.l();
                C2083l c2083l6 = this.c;
                I(c2083l6);
                c2083l6.N();
            } catch (Throwable th) {
                C2083l c2083l7 = this.c;
                I(c2083l7);
                c2083l7.N();
                throw th;
            }
        }
    }

    public final void q(String str, C2077i c2077i) {
        t().g();
        e();
        this.f15477A.put(str, c2077i);
        C2083l c2083l = this.c;
        I(c2083l);
        C2066c0 c2066c0 = (C2066c0) c2083l.f1719a;
        h2.y.i(str);
        c2083l.g();
        c2083l.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c2077i.e());
        try {
            if (c2083l.A().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15394f.b(K.n(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e4) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.c(K.n(str), e4, "Error storing consent setting. appId, error");
        }
    }

    public final void r(Y0 y02, d1 d1Var) {
        long j4;
        t().g();
        e();
        boolean H3 = H(d1Var);
        String str = d1Var.f15603o;
        if (H3) {
            if (!d1Var.f15610v) {
                J(d1Var);
                return;
            }
            b1 Q3 = Q();
            String str2 = y02.f15508p;
            int f02 = Q3.f0(str2);
            V0 v02 = this.f15481E;
            if (f02 != 0) {
                Q();
                K();
                String m4 = b1.m(24, str2, true);
                int length = str2 != null ? str2.length() : 0;
                Q();
                b1.x(v02, d1Var.f15603o, f02, "_ev", m4, length);
                return;
            }
            int b02 = Q().b0(y02.h(), str2);
            if (b02 != 0) {
                Q();
                K();
                String m5 = b1.m(24, str2, true);
                Object h4 = y02.h();
                if (h4 != null && ((h4 instanceof String) || (h4 instanceof CharSequence))) {
                    r8 = h4.toString().length();
                }
                int i4 = r8;
                Q();
                b1.x(v02, d1Var.f15603o, b02, "_ev", m5, i4);
                return;
            }
            Object l4 = Q().l(y02.h(), str2);
            if (l4 == null) {
                return;
            }
            if ("_sid".equals(str2)) {
                long j5 = y02.f15509q;
                String str3 = y02.f15512t;
                h2.y.i(str);
                C2083l c2083l = this.c;
                I(c2083l);
                Z0 F2 = c2083l.F(str, "_sno");
                if (F2 != null) {
                    Object obj = F2.f15520e;
                    if (obj instanceof Long) {
                        j4 = ((Long) obj).longValue();
                        r(new Y0(j5, Long.valueOf(j4 + 1), "_sno", str3), d1Var);
                    }
                }
                if (F2 != null) {
                    c().f15397i.b(F2.f15520e, "Retrieved last session number from database does not contain a valid (long) value");
                }
                C2083l c2083l2 = this.c;
                I(c2083l2);
                C2091p E4 = c2083l2.E(str, "_s");
                if (E4 != null) {
                    j4 = E4.c;
                    c().f15402n.b(Long.valueOf(j4), "Backfill the session number. Last used session number");
                } else {
                    j4 = 0;
                }
                r(new Y0(j5, Long.valueOf(j4 + 1), "_sno", str3), d1Var);
            }
            h2.y.i(str);
            String str4 = y02.f15512t;
            h2.y.i(str4);
            Z0 z02 = new Z0(str, str4, y02.f15508p, y02.f15509q, l4);
            I i5 = c().f15402n;
            C2066c0 c2066c0 = this.f15491l;
            G g4 = c2066c0.f15572m;
            String str5 = z02.c;
            i5.c(g4.f(str5), l4, "Setting user property");
            C2083l c2083l3 = this.c;
            I(c2083l3);
            c2083l3.M();
            try {
                boolean equals = "_id".equals(str5);
                Object obj2 = z02.f15520e;
                if (equals) {
                    C2083l c2083l4 = this.c;
                    I(c2083l4);
                    Z0 F4 = c2083l4.F(str, "_id");
                    if (F4 != null && !obj2.equals(F4.f15520e)) {
                        C2083l c2083l5 = this.c;
                        I(c2083l5);
                        c2083l5.k(str, "_lair");
                    }
                }
                J(d1Var);
                C2083l c2083l6 = this.c;
                I(c2083l6);
                boolean q4 = c2083l6.q(z02);
                C2083l c2083l7 = this.c;
                I(c2083l7);
                c2083l7.l();
                if (!q4) {
                    c().f15394f.c(c2066c0.f15572m.f(str5), obj2, "Too many unique user properties are set. Ignoring user property");
                    Q();
                    b1.x(v02, d1Var.f15603o, 9, null, null, 0);
                }
                C2083l c2083l8 = this.c;
                I(c2083l8);
                c2083l8.N();
            } catch (Throwable th) {
                C2083l c2083l9 = this.c;
                I(c2083l9);
                c2083l9.N();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x05e1, code lost:
    
        if (r3 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        if (r10 == null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02af A[ADDED_TO_REGION, EDGE_INSN: B:216:0x02af->B:214:0x02af BREAK  A[LOOP:4: B:181:0x01c0->B:212:0x02a8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e0 A[Catch: all -> 0x02b4, TRY_ENTER, TryCatch #6 {all -> 0x02b4, blocks: (B:3:0x0016, B:11:0x003a, B:15:0x0050, B:20:0x005e, B:24:0x0079, B:28:0x0095, B:35:0x00c8, B:39:0x00e9, B:41:0x00fa, B:67:0x0145, B:70:0x016d, B:73:0x0175, B:82:0x02e3, B:84:0x02e9, B:86:0x02f3, B:87:0x02f7, B:89:0x02fd, B:92:0x0311, B:95:0x031a, B:97:0x0320, B:101:0x0345, B:102:0x0335, B:105:0x033f, B:111:0x0348, B:113:0x0363, B:116:0x0371, B:120:0x0396, B:122:0x03c9, B:124:0x03cd, B:125:0x03d6, B:127:0x03e1, B:129:0x03e9, B:131:0x03ed, B:132:0x03f3, B:133:0x03fa, B:135:0x03ff, B:137:0x0403, B:138:0x0409, B:139:0x0410, B:141:0x041e, B:143:0x0439, B:149:0x0447, B:151:0x0456, B:152:0x0465, B:154:0x0485, B:156:0x0496, B:158:0x04de, B:160:0x04f0, B:161:0x0507, B:163:0x0512, B:164:0x051a, B:167:0x054c, B:170:0x0555, B:172:0x0500, B:174:0x04cb, B:175:0x04d5, B:214:0x02af, B:226:0x0569, B:227:0x056c, B:221:0x02e0, B:274:0x056d, B:281:0x05b4, B:283:0x05e4, B:285:0x05ea, B:287:0x05f5, B:290:0x05c2, B:301:0x0600, B:302:0x0603), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0569 A[Catch: all -> 0x02b4, TryCatch #6 {all -> 0x02b4, blocks: (B:3:0x0016, B:11:0x003a, B:15:0x0050, B:20:0x005e, B:24:0x0079, B:28:0x0095, B:35:0x00c8, B:39:0x00e9, B:41:0x00fa, B:67:0x0145, B:70:0x016d, B:73:0x0175, B:82:0x02e3, B:84:0x02e9, B:86:0x02f3, B:87:0x02f7, B:89:0x02fd, B:92:0x0311, B:95:0x031a, B:97:0x0320, B:101:0x0345, B:102:0x0335, B:105:0x033f, B:111:0x0348, B:113:0x0363, B:116:0x0371, B:120:0x0396, B:122:0x03c9, B:124:0x03cd, B:125:0x03d6, B:127:0x03e1, B:129:0x03e9, B:131:0x03ed, B:132:0x03f3, B:133:0x03fa, B:135:0x03ff, B:137:0x0403, B:138:0x0409, B:139:0x0410, B:141:0x041e, B:143:0x0439, B:149:0x0447, B:151:0x0456, B:152:0x0465, B:154:0x0485, B:156:0x0496, B:158:0x04de, B:160:0x04f0, B:161:0x0507, B:163:0x0512, B:164:0x051a, B:167:0x054c, B:170:0x0555, B:172:0x0500, B:174:0x04cb, B:175:0x04d5, B:214:0x02af, B:226:0x0569, B:227:0x056c, B:221:0x02e0, B:274:0x056d, B:281:0x05b4, B:283:0x05e4, B:285:0x05ea, B:287:0x05f5, B:290:0x05c2, B:301:0x0600, B:302:0x0603), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05ea A[Catch: all -> 0x02b4, TryCatch #6 {all -> 0x02b4, blocks: (B:3:0x0016, B:11:0x003a, B:15:0x0050, B:20:0x005e, B:24:0x0079, B:28:0x0095, B:35:0x00c8, B:39:0x00e9, B:41:0x00fa, B:67:0x0145, B:70:0x016d, B:73:0x0175, B:82:0x02e3, B:84:0x02e9, B:86:0x02f3, B:87:0x02f7, B:89:0x02fd, B:92:0x0311, B:95:0x031a, B:97:0x0320, B:101:0x0345, B:102:0x0335, B:105:0x033f, B:111:0x0348, B:113:0x0363, B:116:0x0371, B:120:0x0396, B:122:0x03c9, B:124:0x03cd, B:125:0x03d6, B:127:0x03e1, B:129:0x03e9, B:131:0x03ed, B:132:0x03f3, B:133:0x03fa, B:135:0x03ff, B:137:0x0403, B:138:0x0409, B:139:0x0410, B:141:0x041e, B:143:0x0439, B:149:0x0447, B:151:0x0456, B:152:0x0465, B:154:0x0485, B:156:0x0496, B:158:0x04de, B:160:0x04f0, B:161:0x0507, B:163:0x0512, B:164:0x051a, B:167:0x054c, B:170:0x0555, B:172:0x0500, B:174:0x04cb, B:175:0x04d5, B:214:0x02af, B:226:0x0569, B:227:0x056c, B:221:0x02e0, B:274:0x056d, B:281:0x05b4, B:283:0x05e4, B:285:0x05ea, B:287:0x05f5, B:290:0x05c2, B:301:0x0600, B:302:0x0603), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141 A[Catch: all -> 0x0036, TryCatch #9 {all -> 0x0036, blocks: (B:6:0x0023, B:13:0x0040, B:18:0x0058, B:22:0x0069, B:26:0x0082, B:31:0x00bf, B:38:0x00d4, B:44:0x0100, B:50:0x0115, B:51:0x013c, B:61:0x0141, B:62:0x0144, B:80:0x01a7), top: B:4:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e9 A[Catch: all -> 0x02b4, TryCatch #6 {all -> 0x02b4, blocks: (B:3:0x0016, B:11:0x003a, B:15:0x0050, B:20:0x005e, B:24:0x0079, B:28:0x0095, B:35:0x00c8, B:39:0x00e9, B:41:0x00fa, B:67:0x0145, B:70:0x016d, B:73:0x0175, B:82:0x02e3, B:84:0x02e9, B:86:0x02f3, B:87:0x02f7, B:89:0x02fd, B:92:0x0311, B:95:0x031a, B:97:0x0320, B:101:0x0345, B:102:0x0335, B:105:0x033f, B:111:0x0348, B:113:0x0363, B:116:0x0371, B:120:0x0396, B:122:0x03c9, B:124:0x03cd, B:125:0x03d6, B:127:0x03e1, B:129:0x03e9, B:131:0x03ed, B:132:0x03f3, B:133:0x03fa, B:135:0x03ff, B:137:0x0403, B:138:0x0409, B:139:0x0410, B:141:0x041e, B:143:0x0439, B:149:0x0447, B:151:0x0456, B:152:0x0465, B:154:0x0485, B:156:0x0496, B:158:0x04de, B:160:0x04f0, B:161:0x0507, B:163:0x0512, B:164:0x051a, B:167:0x054c, B:170:0x0555, B:172:0x0500, B:174:0x04cb, B:175:0x04d5, B:214:0x02af, B:226:0x0569, B:227:0x056c, B:221:0x02e0, B:274:0x056d, B:281:0x05b4, B:283:0x05e4, B:285:0x05ea, B:287:0x05f5, B:290:0x05c2, B:301:0x0600, B:302:0x0603), top: B:2:0x0016 }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.s():void");
    }

    @Override // x2.InterfaceC2078i0
    public final C2064b0 t() {
        C2066c0 c2066c0 = this.f15491l;
        h2.y.i(c2066c0);
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        return c2064b0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:293|(2:295|(10:297|298|299|(6:301|48|(0)(0)|51|52|(0)(0))|47|48|(0)(0)|51|52|(0)(0)))|302|303|304|305|306|298|299|(0)|47|48|(0)(0)|51|52|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(54:(2:61|(5:63|(1:65)|66|67|68))|69|(2:71|(5:73|(1:75)|76|77|78))|79|(1:81)(1:262)|82|(1:84)|85|(2:87|(1:91))|92|(3:93|94|95)|96|(1:98)|99|(2:101|(2:107|108)(3:104|105|106))(1:258)|109|110|(1:112)|113|(1:115)(1:257)|116|(1:118)(1:256)|119|(1:123)|124|(1:126)(1:255)|127|128|(1:130)(1:254)|131|(1:135)|136|(1:138)(1:253)|139|140|(13:(1:252)(34:144|(4:147|(3:149|150|(2:152|(2:154|156)(1:244))(1:246))(1:250)|245|145)|251|157|(1:159)|(1:162)|163|(4:166|(1:168)(1:175)|169|(2:172|(1:174)))|176|(1:178)(1:243)|179|(2:181|(1:183)(2:184|185))|186|(3:188|(1:190)|191)|192|(1:196)|197|(1:199)|200|(3:203|204|201)|205|206|207|208|209|(2:210|(2:212|(1:215)(1:214))(3:230|231|(1:236)(1:235)))|216|217|218|219|(1:221)(2:226|227)|222|223|224)|207|208|209|(3:210|(0)(0)|214)|216|217|218|219|(0)(0)|222|223|224)|160|(0)|163|(4:166|(0)(0)|169|(2:172|(0)))|176|(0)(0)|179|(0)|186|(0)|192|(2:194|196)|197|(0)|200|(1:201)|205|206) */
    /* JADX WARN: Can't wrap try/catch for region: R(68:(2:61|(5:63|(1:65)|66|67|68))|69|(2:71|(5:73|(1:75)|76|77|78))|79|(1:81)(1:262)|82|(1:84)|85|(2:87|(1:91))|92|93|94|95|96|(1:98)|99|(2:101|(2:107|108)(3:104|105|106))(1:258)|109|110|(1:112)|113|(1:115)(1:257)|116|(1:118)(1:256)|119|(1:123)|124|(1:126)(1:255)|127|128|(1:130)(1:254)|131|(1:135)|136|(1:138)(1:253)|139|140|(1:252)(34:144|(4:147|(3:149|150|(2:152|(2:154|156)(1:244))(1:246))(1:250)|245|145)|251|157|(1:159)|(1:162)|163|(4:166|(1:168)(1:175)|169|(2:172|(1:174)))|176|(1:178)(1:243)|179|(2:181|(1:183)(2:184|185))|186|(3:188|(1:190)|191)|192|(1:196)|197|(1:199)|200|(3:203|204|201)|205|206|207|208|209|(2:210|(2:212|(1:215)(1:214))(3:230|231|(1:236)(1:235)))|216|217|218|219|(1:221)(2:226|227)|222|223|224)|160|(0)|163|(4:166|(0)(0)|169|(2:172|(0)))|176|(0)(0)|179|(0)|186|(0)|192|(2:194|196)|197|(0)|200|(1:201)|205|206|207|208|209|(3:210|(0)(0)|214)|216|217|218|219|(0)(0)|222|223|224) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0a4b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0a52, code lost:
    
        ((x2.C2066c0) r2.f1719a).c().k().c(x2.K.n(r3.f15745a), r0, "Error storing raw event. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0a6a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0a87, code lost:
    
        c().k().c(x2.K.n(r4.M()), r0, "Data loss. Failed to insert raw event metadata. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x02bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x02bd, code lost:
    
        ((x2.C2066c0) r2.f1719a).c().k().c(x2.K.n(r6), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x07a6 A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07ca A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07ef A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07cf A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0811 A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x083d A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0858 A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08d3 A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08ed A[Catch: all -> 0x01ad, TRY_LEAVE, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0983 A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0a33 A[Catch: all -> 0x01ad, SQLiteException -> 0x0a4b, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0a4b, blocks: (B:219:0x0a22, B:221:0x0a33), top: B:218:0x0a22, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0997 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x033e A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x02f8 A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a6 A[Catch: all -> 0x01ad, TryCatch #6 {all -> 0x01ad, blocks: (B:34:0x018d, B:37:0x019a, B:39:0x01a2, B:42:0x01b0, B:48:0x032c, B:52:0x0369, B:54:0x03a6, B:56:0x03ab, B:57:0x03c2, B:61:0x03d5, B:63:0x03ef, B:65:0x03f5, B:66:0x040c, B:71:0x0434, B:75:0x0459, B:76:0x0470, B:79:0x0481, B:84:0x04b0, B:85:0x04c4, B:87:0x04cc, B:89:0x04d7, B:91:0x04dd, B:92:0x04e6, B:94:0x04f4, B:98:0x053c, B:99:0x0551, B:101:0x057b, B:104:0x05a4, B:108:0x05f5, B:110:0x0623, B:112:0x0653, B:113:0x0656, B:115:0x065c, B:116:0x0664, B:118:0x066a, B:119:0x0672, B:121:0x0682, B:123:0x0688, B:126:0x0694, B:128:0x06a0, B:130:0x06a9, B:131:0x06b1, B:133:0x06d1, B:135:0x06d7, B:138:0x06e0, B:140:0x06f3, B:142:0x070b, B:144:0x0718, B:145:0x0736, B:147:0x073c, B:150:0x0752, B:152:0x075e, B:154:0x076b, B:248:0x078a, B:157:0x079c, B:162:0x07a6, B:163:0x07a9, B:166:0x07bf, B:168:0x07ca, B:169:0x07d8, B:172:0x07e4, B:174:0x07ef, B:175:0x07cf, B:176:0x07f8, B:178:0x0811, B:179:0x0819, B:181:0x083d, B:184:0x0849, B:185:0x084c, B:186:0x084d, B:188:0x0858, B:190:0x0872, B:191:0x087d, B:192:0x08ad, B:194:0x08b5, B:196:0x08bf, B:197:0x08c9, B:199:0x08d3, B:200:0x08dd, B:201:0x08e7, B:203:0x08ed, B:206:0x091b, B:208:0x095f, B:209:0x096a, B:210:0x097d, B:212:0x0983, B:217:0x09d3, B:219:0x0a22, B:221:0x0a33, B:222:0x0a9c, B:227:0x0a4f, B:229:0x0a52, B:231:0x0997, B:233:0x09be, B:239:0x0a6d, B:240:0x0a86, B:242:0x0a87, B:258:0x0616, B:261:0x0521, B:262:0x04a0, B:263:0x033e, B:264:0x034a, B:266:0x0350, B:273:0x035e, B:276:0x01c7, B:279:0x01d3, B:281:0x01e8, B:286:0x0200, B:289:0x0238, B:291:0x023e, B:293:0x024c, B:295:0x025d, B:297:0x0266, B:299:0x02ed, B:301:0x02f8, B:303:0x0290, B:305:0x02aa, B:306:0x02d2, B:309:0x02bd, B:311:0x020c, B:316:0x0234), top: B:33:0x018d, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(x2.C2096s r56, x2.d1 r57) {
        /*
            Method dump skipped, instructions count: 2781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X0.u(x2.s, x2.d1):void");
    }

    public final long v() {
        d().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        L0 l02 = this.f15488i;
        l02.h();
        l02.g();
        Q q4 = l02.f15412i;
        long a4 = q4.a();
        if (a4 == 0) {
            C2066c0.g(((C2066c0) l02.f1719a).f15571l);
            a4 = r2.o().nextInt(86400000) + 1;
            q4.b(a4);
        }
        return ((((currentTimeMillis + a4) / 1000) / 60) / 60) / 24;
    }

    @Override // x2.InterfaceC2078i0
    public final C2106x w() {
        throw null;
    }

    public final d1 z(String str) {
        C2083l c2083l = this.c;
        I(c2083l);
        C2082k0 B4 = c2083l.B(str);
        if (B4 != null) {
            C2066c0 c2066c0 = B4.f15695a;
            if (!TextUtils.isEmpty(B4.H())) {
                Boolean A3 = A(B4);
                if (A3 != null && !A3.booleanValue()) {
                    c().f15394f.b(K.n(str), "App version does not match; dropping. appId");
                    return null;
                }
                String J4 = B4.J();
                String H3 = B4.H();
                long B5 = B4.B();
                C2064b0 c2064b0 = c2066c0.f15569j;
                C2066c0.i(c2064b0);
                c2064b0.g();
                String str2 = B4.f15704l;
                C2064b0 c2064b02 = c2066c0.f15569j;
                C2066c0.i(c2064b02);
                c2064b02.g();
                long j4 = B4.f15705m;
                C2064b0 c2064b03 = c2066c0.f15569j;
                C2066c0.i(c2064b03);
                c2064b03.g();
                long j5 = B4.f15706n;
                C2064b0 c2064b04 = c2066c0.f15569j;
                C2066c0.i(c2064b04);
                c2064b04.g();
                boolean z4 = B4.f15707o;
                String I4 = B4.I();
                C2064b0 c2064b05 = c2066c0.f15569j;
                C2066c0.i(c2064b05);
                c2064b05.g();
                boolean A4 = B4.A();
                String D4 = B4.D();
                C2064b0 c2064b06 = c2066c0.f15569j;
                C2066c0.i(c2064b06);
                c2064b06.g();
                Boolean bool = B4.f15710r;
                long C4 = B4.C();
                C2064b0 c2064b07 = c2066c0.f15569j;
                C2066c0.i(c2064b07);
                c2064b07.g();
                return new d1(str, J4, H3, B5, str2, j4, j5, null, z4, false, I4, 0L, 0, A4, false, D4, bool, C4, B4.f15712t, L(str).e(), "", null);
            }
        }
        c().f15401m.b(str, "No app data available; dropping");
        return null;
    }
}
