package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.util.Pair;
import androidx.work.impl.WorkDatabase_Impl;
import b2.InterfaceC0218a;
import c1.InterfaceC0235d;
import com.google.android.gms.internal.measurement.C1510e1;
import com.google.android.gms.internal.measurement.InterfaceC1550n;
import com.google.android.gms.internal.measurement.InterfaceC1577u;
import j3.C1735b;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qw implements Px, InterfaceC1374xE, ED, InterfaceC1132ro, InterfaceC0476cF, InterfaceC1577u, InterfaceC0235d, InterfaceC0218a {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6709o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6710p;

    /* renamed from: q, reason: collision with root package name */
    public Object f6711q;

    public /* synthetic */ Qw() {
        this.f6709o = 0;
        this.f6710p = new HashMap();
        this.f6711q = new HashMap();
    }

    public Qw(int i4, int i5) {
        this.f6709o = 19;
        this.f6710p = new int[]{i4, i5};
        this.f6711q = new float[]{0.0f, 1.0f};
    }

    public Qw(int i4, int i5, int i6) {
        this.f6709o = 19;
        this.f6710p = new int[]{i4, i5, i6};
        this.f6711q = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ Qw(int i4, Object obj, Object obj2) {
        this.f6709o = i4;
        this.f6711q = obj;
        this.f6710p = obj2;
    }

    public Qw(Context context, int i4) {
        q2.e eVar;
        this.f6709o = i4;
        switch (i4) {
            case 17:
                this.f6711q = null;
                this.f6710p = context;
                return;
            default:
                this.f6710p = new q2.f(context, e2.f.f12753b);
                synchronized (q2.e.class) {
                    try {
                        if (q2.e.f14706s == null) {
                            q2.e.f14706s = new q2.e(context.getApplicationContext(), 0);
                        }
                        eVar = q2.e.f14706s;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f6711q = eVar;
                return;
        }
    }

    public Qw(WorkDatabase_Impl workDatabase_Impl) {
        this.f6709o = 16;
        this.f6710p = workDatabase_Impl;
        this.f6711q = new w0.b(workDatabase_Impl, 3);
    }

    public Qw(Px px) {
        this.f6709o = 1;
        this.f6710p = px;
        this.f6711q = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    public /* synthetic */ Qw(Sw sw) {
        this.f6709o = 0;
        this.f6710p = new HashMap(sw.f7023a);
        this.f6711q = new HashMap(sw.f7024b);
    }

    public Qw(C1735b c1735b, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f6709o = 10;
        this.f6710p = executor;
        this.f6711q = scheduledExecutorService;
    }

    public /* synthetic */ Qw(Object obj) {
        this.f6709o = 9;
        this.f6711q = obj;
        this.f6710p = new ArrayList();
    }

    public /* synthetic */ Qw(Object obj, Object obj2, int i4, boolean z4) {
        this.f6709o = i4;
        this.f6710p = obj;
        this.f6711q = obj2;
    }

    public Qw(String str, AbstractC1895f abstractC1895f, V2.e eVar) {
        this.f6709o = 8;
        this.f6711q = str;
        this.f6710p = abstractC1895f;
    }

    public Qw(ArrayList arrayList, ArrayList arrayList2) {
        this.f6709o = 19;
        int size = arrayList.size();
        this.f6710p = new int[size];
        this.f6711q = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            ((int[]) this.f6710p)[i4] = ((Integer) arrayList.get(i4)).intValue();
            ((float[]) this.f6711q)[i4] = ((Float) arrayList2.get(i4)).floatValue();
        }
    }

    public Qw(x2.Q0 q02) {
        this.f6709o = 18;
        this.f6711q = q02;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public Map a() {
        return ((Px) this.f6710p).a();
    }

    @Override // com.google.android.gms.internal.ads.Px
    public void b(NB nb) {
        nb.getClass();
        ((Px) this.f6710p).b(nb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void c(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        Pair z4 = z(c1202tE);
        if (z4 != null) {
            ((EC) this.f6711q).f4862i.b(new BC(this, z4, c0859lE, c1074qE, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public Uri e() {
        return ((Px) this.f6710p).e();
    }

    @Override // b2.InterfaceC0218a
    public A2.h f() {
        A2.h f4 = ((q2.f) this.f6710p).f();
        k.o oVar = new k.o(10, this);
        A2.r rVar = (A2.r) f4;
        rVar.getClass();
        A2.q qVar = A2.j.f27a;
        A2.r rVar2 = new A2.r();
        rVar.f41b.e(new A2.m(qVar, oVar, rVar2));
        rVar.p();
        return rVar2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void g(int i4, C1202tE c1202tE, C1074qE c1074qE) {
        Pair z4 = z(c1202tE);
        if (z4 != null) {
            ((EC) this.f6711q).f4862i.b(new RunnableC0801k(this, z4, c1074qE, 9));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void h(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        Pair z4 = z(c1202tE);
        if (z4 != null) {
            ((EC) this.f6711q).f4862i.b(new BC(this, z4, c0859lE, c1074qE, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public void i() {
        ((Px) this.f6710p).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // c1.InterfaceC0235d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(boolean r8) {
        /*
            r7 = this;
            int r0 = r7.f6709o
            switch(r0) {
                case 12: goto L46;
                case 13: goto L33;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f6711q
            p1.a0 r0 = (p1.a0) r0
            java.util.ArrayList r1 = r0.f14497P
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L11:
            if (r4 >= r2) goto L25
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            c1.f r5 = (c1.C0237f) r5
            java.lang.Object r6 = r7.f6710p
            c1.f r6 = (c1.C0237f) r6
            if (r5 != r6) goto L22
            goto L25
        L22:
            int r3 = r3 + 1
            goto L11
        L25:
            boolean[] r1 = r0.f14498Q
            boolean r2 = r1[r3]
            if (r2 == r8) goto L32
            r1[r3] = r8
            t2.b r0 = r0.f13118B
            r0.o(r3, r8)
        L32:
            return
        L33:
            java.lang.Object r0 = r7.f6711q
            p1.u r0 = (p1.C1934u) r0
            boolean[] r1 = r0.f14586Q
            java.util.ArrayList r0 = r0.f14585P
            java.lang.Object r2 = r7.f6710p
            c1.f r2 = (c1.C0237f) r2
            int r0 = r0.indexOf(r2)
            r1[r0] = r8
            return
        L46:
            java.lang.Object r0 = r7.f6711q
            p1.j r0 = (p1.C1924j) r0
            java.util.ArrayList r1 = r0.f14550P
            java.lang.Object r2 = r7.f6710p
            c1.f r2 = (c1.C0237f) r2
            int r1 = r1.indexOf(r2)
            r2 = 0
            r3 = r2
        L56:
            java.util.ArrayList r4 = r0.f14551Q
            int r4 = r4.size()
            if (r3 >= r4) goto L80
            java.util.ArrayList r4 = r0.f14551Q
            java.lang.Object r4 = r4.get(r3)
            c1.f r4 = (c1.C0237f) r4
            java.lang.Object r4 = r4.f1252p
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean[][] r5 = r0.f14553S
            r5 = r5[r3]
            if (r8 == 0) goto L7a
            if (r4 == 0) goto L7a
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7a
            r4 = 1
            goto L7b
        L7a:
            r4 = r2
        L7b:
            r5[r1] = r4
            int r3 = r3 + 1
            goto L56
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Qw.k(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        ((PC) obj).l((OC) this.f6710p, (C1074qE) this.f6711q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void m(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE, IOException iOException, boolean z4) {
        Pair z5 = z(c1202tE);
        if (z5 != null) {
            ((EC) this.f6711q).f4862i.b(new AC(this, z5, c0859lE, c1074qE, iOException, z4, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374xE
    public void n(int i4, C1202tE c1202tE, C0859lE c0859lE, C1074qE c1074qE) {
        Pair z4 = z(c1202tE);
        if (z4 != null) {
            ((EC) this.f6711q).f4862i.b(new BC(this, z4, c0859lE, c1074qE, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public long o(C0757iz c0757iz) {
        this.f6711q = c0757iz.f9104a;
        Map map = Collections.EMPTY_MAP;
        Px px = (Px) this.f6710p;
        long o4 = px.o(c0757iz);
        Uri e4 = px.e();
        e4.getClass();
        this.f6711q = e4;
        px.a();
        return o4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0476cF
    public Gt p(int i4, C0997oh c0997oh, int[] iArr) {
        int i5;
        int i6;
        int i7;
        int i8;
        Point point;
        C0997oh c0997oh2 = c0997oh;
        Ft ft = C0604fF.f8695j;
        ZE ze = (ZE) this.f6710p;
        int i9 = ((int[]) this.f6711q)[i4];
        int i10 = ze.f9638a;
        int i11 = ze.f9639b;
        if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
            i5 = Integer.MAX_VALUE;
        } else {
            char c = 0;
            int i12 = Integer.MAX_VALUE;
            while (true) {
                c0997oh2.getClass();
                if (c > 0) {
                    break;
                }
                C0976o2 c0976o2 = c0997oh2.c[0];
                int i13 = c0976o2.f9818p;
                int i14 = c0976o2.f9819q;
                if (i13 > 0 && i14 > 0) {
                    if ((i13 > i14) != (i10 > i11)) {
                        i8 = i10;
                        i7 = i11;
                    } else {
                        i7 = i10;
                        i8 = i11;
                    }
                    if (i13 * i8 >= i14 * i7) {
                        int i15 = AbstractC0751is.f9071a;
                        point = new Point(i7, ((r8 + i13) - 1) / i13);
                    } else {
                        int i16 = AbstractC0751is.f9071a;
                        point = new Point(((r15 + i14) - 1) / i14, i8);
                    }
                    int i17 = c0976o2.f9818p;
                    int i18 = i17 * i14;
                    if (i17 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i18 < i12) {
                        i12 = i18;
                    }
                }
                c = 1;
            }
            i5 = i12;
        }
        Object[] objArr = new Object[4];
        char c2 = 0;
        int i19 = 0;
        while (true) {
            c0997oh2.getClass();
            if (c2 > 0) {
                return AbstractC1137rt.q(i19, objArr);
            }
            C0976o2 c0976o22 = c0997oh2.c[0];
            int i20 = c0976o22.f9818p;
            int i21 = (i20 == -1 || (i6 = c0976o22.f9819q) == -1) ? -1 : i20 * i6;
            C0561eF c0561eF = new C0561eF(i4, c0997oh2, ze, iArr[0], i5 == Integer.MAX_VALUE || (i21 != -1 && i21 <= i5));
            int i22 = i19 + 1;
            int length = objArr.length;
            if (length < i22) {
                objArr = Arrays.copyOf(objArr, AbstractC0880lt.d(length, i22));
            }
            objArr[i19] = c0561eF;
            c0997oh2 = c0997oh;
            i19 = i22;
            c2 = 1;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1577u
    public u0.g q(InterfaceC1550n interfaceC1550n) {
        u0.g k3 = ((u0.g) this.f6710p).k();
        String str = (String) this.f6711q;
        k3.H(str, interfaceC1550n);
        ((HashMap) k3.f14986s).put(str, Boolean.TRUE);
        return k3;
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public int r(byte[] bArr, int i4, int i5) {
        return ((Px) this.f6710p).r(bArr, i4, i5);
    }

    public void s(Object obj, String str) {
        ((ArrayList) this.f6710p).add(n0.a.i(str, "=", String.valueOf(obj)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory t(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Qw.t(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public String toString() {
        switch (this.f6709o) {
            case 9:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f6711q.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f6710p;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append((String) arrayList.get(i4));
                    if (i4 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public Object u() {
        C1510e1 c1510e1 = (C1510e1) this.f6710p;
        String str = (String) this.f6711q;
        ContentResolver contentResolver = ((Context) c1510e1.f11914p).getContentResolver();
        Uri uri = com.google.android.gms.internal.measurement.Z0.f11859a;
        synchronized (com.google.android.gms.internal.measurement.Z0.class) {
            try {
                int i4 = 0;
                String str2 = null;
                if (com.google.android.gms.internal.measurement.Z0.f11861e == null) {
                    com.google.android.gms.internal.measurement.Z0.d.set(false);
                    com.google.android.gms.internal.measurement.Z0.f11861e = new HashMap();
                    com.google.android.gms.internal.measurement.Z0.f11866j = new Object();
                    contentResolver.registerContentObserver(com.google.android.gms.internal.measurement.Z0.f11859a, true, new com.google.android.gms.internal.measurement.Y0(r9, i4));
                } else if (com.google.android.gms.internal.measurement.Z0.d.getAndSet(false)) {
                    com.google.android.gms.internal.measurement.Z0.f11861e.clear();
                    com.google.android.gms.internal.measurement.Z0.f11862f.clear();
                    com.google.android.gms.internal.measurement.Z0.f11863g.clear();
                    com.google.android.gms.internal.measurement.Z0.f11864h.clear();
                    com.google.android.gms.internal.measurement.Z0.f11865i.clear();
                    com.google.android.gms.internal.measurement.Z0.f11866j = new Object();
                }
                Object obj = com.google.android.gms.internal.measurement.Z0.f11866j;
                if (com.google.android.gms.internal.measurement.Z0.f11861e.containsKey(str)) {
                    String str3 = (String) com.google.android.gms.internal.measurement.Z0.f11861e.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                int length = com.google.android.gms.internal.measurement.Z0.f11867k.length;
                Cursor query = contentResolver.query(com.google.android.gms.internal.measurement.Z0.f11859a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        com.google.android.gms.internal.measurement.Z0.a(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    com.google.android.gms.internal.measurement.Z0.a(obj, str, string);
                    return string != null ? string : 0;
                } finally {
                    query.close();
                }
            } finally {
            }
        }
    }

    public void x(Ow ow) {
        Rw rw = new Rw(ow.f6540a, ow.f6541b);
        HashMap hashMap = (HashMap) this.f6710p;
        if (!hashMap.containsKey(rw)) {
            hashMap.put(rw, ow);
            return;
        }
        Ow ow2 = (Ow) hashMap.get(rw);
        if (!ow2.equals(ow) || !ow.equals(ow2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(rw.toString()));
        }
    }

    public Pair z(C1202tE c1202tE) {
        C1202tE c1202tE2;
        DC dc = (DC) this.f6710p;
        C1202tE c1202tE3 = null;
        if (c1202tE != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= dc.c.size()) {
                    c1202tE2 = null;
                    break;
                }
                if (((C1202tE) dc.c.get(i4)).d == c1202tE.d) {
                    c1202tE2 = c1202tE.a(Pair.create(dc.f4596b, c1202tE.f10688a));
                    break;
                }
                i4++;
            }
            if (c1202tE2 == null) {
                return null;
            }
            c1202tE3 = c1202tE2;
        }
        return Pair.create(Integer.valueOf(dc.d), c1202tE3);
    }
}
