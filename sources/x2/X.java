package x2;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1566r0;
import com.google.android.gms.internal.measurement.C1570s0;
import com.google.android.gms.internal.measurement.C1574t0;
import com.google.android.gms.internal.measurement.C1578u0;
import com.google.android.gms.internal.measurement.C1582v0;
import com.google.android.gms.internal.measurement.C1590x0;
import com.google.android.gms.internal.measurement.C1599z1;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.q3;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k.C1748e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X extends T0 implements InterfaceC2071f {
    public final r.e d;

    /* renamed from: e, reason: collision with root package name */
    public final r.e f15466e;

    /* renamed from: f, reason: collision with root package name */
    public final r.e f15467f;

    /* renamed from: g, reason: collision with root package name */
    public final r.e f15468g;

    /* renamed from: h, reason: collision with root package name */
    public final r.e f15469h;

    /* renamed from: i, reason: collision with root package name */
    public final r.e f15470i;

    /* renamed from: j, reason: collision with root package name */
    public final W f15471j;

    /* renamed from: k, reason: collision with root package name */
    public final k.o f15472k;

    /* renamed from: l, reason: collision with root package name */
    public final r.e f15473l;

    /* renamed from: m, reason: collision with root package name */
    public final r.e f15474m;

    /* renamed from: n, reason: collision with root package name */
    public final r.e f15475n;

    /* JADX WARN: Type inference failed for: r2v1, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v5, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v7, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v8, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [r.e, r.i] */
    public X(X0 x02) {
        super(x02);
        this.d = new r.i(0);
        this.f15466e = new r.i(0);
        this.f15467f = new r.i(0);
        this.f15468g = new r.i(0);
        this.f15469h = new r.i(0);
        this.f15473l = new r.i(0);
        this.f15474m = new r.i(0);
        this.f15475n = new r.i(0);
        this.f15470i = new r.i(0);
        this.f15471j = new W(this);
        this.f15472k = new k.o(20, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r.e, r.i] */
    public static final r.e o(C1582v0 c1582v0) {
        ?? iVar = new r.i(0);
        for (C1590x0 c1590x0 : c1582v0.w()) {
            iVar.put(c1590x0.l(), c1590x0.m());
        }
        return iVar;
    }

    @Override // x2.InterfaceC2071f
    public final String a(String str, String str2) {
        g();
        m(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // x2.T0
    public final void j() {
    }

    public final C1582v0 k(String str, byte[] bArr) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (bArr == null) {
            return C1582v0.q();
        }
        try {
            C1582v0 c1582v0 = (C1582v0) ((C1578u0) O.F(C1582v0.p(), bArr)).d();
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15402n.c(c1582v0.B() ? Long.valueOf(c1582v0.n()) : null, c1582v0.A() ? c1582v0.r() : null, "Parsed config. version, gmp_app_id");
            return c1582v0;
        } catch (Q1 e4) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15397i.c(K.n(str), e4, "Unable to merge remote config. appId");
            return C1582v0.q();
        } catch (RuntimeException e5) {
            K k5 = c2066c0.f15568i;
            C2066c0.i(k5);
            k5.f15397i.c(K.n(str), e5, "Unable to merge remote config. appId");
            return C1582v0.q();
        }
    }

    public final void l(String str, C1578u0 c1578u0) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        HashSet hashSet = new HashSet();
        r.i iVar = new r.i(0);
        r.i iVar2 = new r.i(0);
        r.i iVar3 = new r.i(0);
        q3.c();
        C2073g c2073g = c2066c0.f15566g;
        K k3 = c2066c0.f15568i;
        if (c2073g.p(null, B.f15304i0)) {
            Iterator it = Collections.unmodifiableList(((C1582v0) c1578u0.f11739p).u()).iterator();
            while (it.hasNext()) {
                hashSet.add(((C1566r0) it.next()).l());
            }
        }
        for (int i4 = 0; i4 < ((C1582v0) c1578u0.f11739p).m(); i4++) {
            C1570s0 c1570s0 = (C1570s0) ((C1582v0) c1578u0.f11739p).o(i4).i();
            if (c1570s0.g().isEmpty()) {
                C2066c0.i(k3);
                k3.f15397i.a("EventConfig contained null event name");
            } else {
                String g4 = c1570s0.g();
                String f4 = AbstractC2080j0.f(c1570s0.g(), AbstractC2080j0.f15679a, AbstractC2080j0.c);
                if (!TextUtils.isEmpty(f4)) {
                    if (c1570s0.f11740q) {
                        c1570s0.f();
                        c1570s0.f11740q = false;
                    }
                    C1574t0.n((C1574t0) c1570s0.f11739p, f4);
                    if (c1578u0.f11740q) {
                        c1578u0.f();
                        c1578u0.f11740q = false;
                    }
                    C1582v0.x((C1582v0) c1578u0.f11739p, i4, (C1574t0) c1570s0.d());
                }
                if (((C1574t0) c1570s0.f11739p).q() && ((C1574t0) c1570s0.f11739p).o()) {
                    iVar.put(g4, Boolean.TRUE);
                }
                if (((C1574t0) c1570s0.f11739p).r() && ((C1574t0) c1570s0.f11739p).p()) {
                    iVar2.put(c1570s0.g(), Boolean.TRUE);
                }
                if (((C1574t0) c1570s0.f11739p).s()) {
                    if (((C1574t0) c1570s0.f11739p).l() < 2 || ((C1574t0) c1570s0.f11739p).l() > 65535) {
                        C2066c0.i(k3);
                        k3.f15397i.c(c1570s0.g(), Integer.valueOf(((C1574t0) c1570s0.f11739p).l()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        iVar3.put(c1570s0.g(), Integer.valueOf(((C1574t0) c1570s0.f11739p).l()));
                    }
                }
            }
        }
        this.f15466e.put(str, hashSet);
        this.f15467f.put(str, iVar);
        this.f15468g.put(str, iVar2);
        this.f15470i.put(str, iVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X.m(java.lang.String):void");
    }

    public final void n(String str, C1582v0 c1582v0) {
        if (c1582v0.l() == 0) {
            W w2 = this.f15471j;
            w2.getClass();
            S3.e.e(str, "key");
            synchronized (((V2.e) w2.f3354g)) {
                C1748e c1748e = (C1748e) w2.f3351b;
                c1748e.getClass();
                Object remove = ((LinkedHashMap) c1748e.f13386p).remove(str);
                if (remove != null) {
                    int i4 = w2.d;
                    b0.l0.l(str, remove);
                    w2.d = i4 - 1;
                }
            }
            return;
        }
        K k3 = ((C2066c0) this.f1719a).f15568i;
        C2066c0.i(k3);
        k3.f15402n.b(Integer.valueOf(c1582v0.l()), "EES programs found");
        com.google.android.gms.internal.measurement.W0 w02 = (com.google.android.gms.internal.measurement.W0) c1582v0.v().get(0);
        try {
            com.google.android.gms.internal.measurement.E e4 = new com.google.android.gms.internal.measurement.E();
            ((HashMap) ((C1599z1) e4.f11724a.f6662r).f12124p).put("internal.remoteConfig", new V(this, str, 1));
            ((HashMap) ((C1599z1) e4.f11724a.f6662r).f12124p).put("internal.appMetadata", new V(this, str, 2));
            ((HashMap) ((C1599z1) e4.f11724a.f6662r).f12124p).put("internal.logger", new B0.l(4, this));
            e4.a(w02);
            this.f15471j.k(str, e4);
            K k4 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k4);
            k4.f15402n.c(str, Integer.valueOf(w02.l().l()), "EES program loaded for appId, activities");
            for (com.google.android.gms.internal.measurement.V0 v02 : w02.l().n()) {
                K k5 = ((C2066c0) this.f1719a).f15568i;
                C2066c0.i(k5);
                k5.f15402n.b(v02.l(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.W unused) {
            K k6 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k6);
            k6.f15394f.b(str, "Failed to load EES program. appId");
        }
    }

    public final int p(String str, String str2) {
        Integer num;
        g();
        m(str);
        Map map = (Map) this.f15470i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final C1582v0 q(String str) {
        h();
        g();
        h2.y.e(str);
        m(str);
        return (C1582v0) this.f15469h.get(str);
    }

    public final String r(String str) {
        g();
        m(str);
        return (String) this.f15473l.get(str);
    }

    public final boolean s(String str) {
        g();
        C1582v0 q4 = q(str);
        if (q4 == null) {
            return false;
        }
        return q4.z();
    }

    public final boolean u(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f15468g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean v(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && b1.R(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && b1.S(str2)) {
            return true;
        }
        Map map = (Map) this.f15467f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f8, code lost:
    
        if (r8.q().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x032b, code lost:
    
        r26 = r5;
        r5 = r8.b();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r32);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0346, code lost:
    
        if (r8.y() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0348, code lost:
    
        r1 = java.lang.Integer.valueOf(r8.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0352, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0362, code lost:
    
        if (r8.z() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0364, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x036e, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0380, code lost:
    
        if (r9.A().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0382, code lost:
    
        r0 = r14.f15568i;
        x2.C2066c0.i(r0);
        r0.f15394f.b(x2.K.n(r32), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0392, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x039e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x039f, code lost:
    
        r1 = r14.f15568i;
        x2.C2066c0.i(r1);
        r1.f15394f.c(x2.K.n(r32), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x048d, code lost:
    
        r9.h();
        r9.g();
        h2.y.e(r32);
        r0 = r9.A();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r32, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r32, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04b0, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x036d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0351, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02fa, code lost:
    
        r0 = r14.f15568i;
        x2.C2066c0.i(r0);
        r0 = r0.f15397i;
        r3 = x2.K.n(r32);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x030f, code lost:
    
        if (r8.y() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0311, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0320, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x031f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x031a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03b1, code lost:
    
        r27 = r6;
        r5 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03c1, code lost:
    
        if (r5.hasNext() == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03c3, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.C1559p0) r5.next();
        r9.h();
        r9.g();
        h2.y.e(r32);
        h2.y.i(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03dd, code lost:
    
        if (r6.o().isEmpty() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0409, code lost:
    
        r8 = r6.b();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r32);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0424, code lost:
    
        if (r6.t() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0426, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0430, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0442, code lost:
    
        if (r6.u() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0444, code lost:
    
        r0 = java.lang.Boolean.valueOf(r6.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x044e, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0460, code lost:
    
        if (r9.A().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0475, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0462, code lost:
    
        r0 = r14.f15568i;
        x2.C2066c0.i(r0);
        r0.f15394f.b(x2.K.n(r32), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0473, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x047d, code lost:
    
        r1 = r14.f15568i;
        x2.C2066c0.i(r1);
        r1.f15394f.c(x2.K.n(r32), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x044d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x042f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03df, code lost:
    
        r0 = r14.f15568i;
        x2.C2066c0.i(r0);
        r0 = r0.f15397i;
        r3 = x2.K.n(r32);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03f4, code lost:
    
        if (r6.t() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03f6, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0400, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03ff, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x028f, code lost:
    
        r0 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029b, code lost:
    
        if (r0.hasNext() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a7, code lost:
    
        if (((com.google.android.gms.internal.measurement.C1559p0) r0.next()).t() != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a9, code lost:
    
        r0 = r14.f15568i;
        x2.C2066c0.i(r0);
        r0.f15397i.c(x2.K.n(r32), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02be, code lost:
    
        r0 = r5.q().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02c6, code lost:
    
        r8 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ca, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02dc, code lost:
    
        if (r8 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02de, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.C1529i0) r23.next();
        r9.h();
        r9.g();
        h2.y.e(r32);
        h2.y.i(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.String r32, java.lang.String r33, java.lang.String r34, byte[] r35) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.X.x(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }
}
