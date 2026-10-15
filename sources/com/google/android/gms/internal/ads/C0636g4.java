package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636g4 extends AbstractCallableC0892m4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8782h = 3;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8783i;

    public C0636g4(U3 u32, C0549e3 c0549e3, int i4, View view) {
        super(u32, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", c0549e3, i4, 57);
        this.f8783i = view;
    }

    public C0636g4(U3 u32, C0549e3 c0549e3, int i4, C0874ln c0874ln) {
        super(u32, "tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", c0549e3, i4, 94);
        this.f8783i = c0874ln;
    }

    public C0636g4(U3 u32, C0549e3 c0549e3, int i4, C1059q c1059q) {
        super(u32, "8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", c0549e3, i4, 85);
        this.f8783i = c1059q;
    }

    public C0636g4(U3 u32, C0549e3 c0549e3, int i4, StackTraceElement[] stackTraceElementArr) {
        super(u32, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", c0549e3, i4, 45);
        this.f8783i = stackTraceElementArr;
    }

    private final void c() {
        Method method = this.f9562e;
        C0874ln c0874ln = (C0874ln) this.f8783i;
        List list = (List) c0874ln.f9467p;
        c0874ln.f9467p = Collections.EMPTY_LIST;
        int intValue = ((Integer) method.invoke(null, list)).intValue();
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            int b4 = AbstractC1230u.b(intValue);
            c0549e3.d();
            C0977o3.n0((C0977o3) c0549e3.f4561p, b4);
        }
    }

    private final void d() {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.f8783i;
        if (stackTraceElementArr != null) {
            K3 k3 = new K3((String) this.f9562e.invoke(null, stackTraceElementArr));
            synchronized (this.d) {
                try {
                    C0549e3 c0549e3 = this.d;
                    long longValue = k3.c.longValue();
                    c0549e3.d();
                    C0977o3.F((C0977o3) c0549e3.f4561p, longValue);
                    if (((Boolean) k3.d).booleanValue()) {
                        C0549e3 c0549e32 = this.d;
                        int i4 = true != ((Boolean) k3.f5970e).booleanValue() ? 2 : 1;
                        c0549e32.d();
                        C0977o3.k0((C0977o3) c0549e32.f4561p, i4);
                    } else {
                        C0549e3 c0549e33 = this.d;
                        c0549e33.d();
                        C0977o3.k0((C0977o3) c0549e33.f4561p, 3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.X3, com.google.android.gms.internal.ads.u] */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        switch (this.f8782h) {
            case 0:
                long[] jArr = (long[]) this.f9562e.invoke(null, Long.valueOf(((C1059q) this.f8783i).c), Long.valueOf(((C1059q) this.f8783i).d), Long.valueOf(((C1059q) this.f8783i).f10064e), Long.valueOf(((C1059q) this.f8783i).f10065f));
                synchronized (this.d) {
                    C0549e3 c0549e3 = this.d;
                    long j4 = jArr[0];
                    c0549e3.d();
                    C0977o3.Y((C0977o3) c0549e3.f4561p, j4);
                    C0549e3 c0549e32 = this.d;
                    long j5 = jArr[1];
                    c0549e32.d();
                    C0977o3.Z((C0977o3) c0549e32.f4561p, j5);
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            default:
                View view = (View) this.f8783i;
                if (view != null) {
                    C0937n6 c0937n6 = AbstractC1066q6.f10153Q2;
                    O1.r rVar = O1.r.d;
                    Boolean bool = (Boolean) rVar.c.a(c0937n6);
                    Boolean bool2 = (Boolean) rVar.c.a(AbstractC1066q6.l9);
                    String str = (String) this.f9562e.invoke(null, view, this.f9560a.f7127a.getResources().getDisplayMetrics(), bool, bool2);
                    ?? abstractC1230u = new AbstractC1230u();
                    HashMap i4 = AbstractC1230u.i(str);
                    if (i4 != null) {
                        abstractC1230u.f7599b = (Long) i4.get(0);
                        abstractC1230u.c = (Long) i4.get(1);
                        abstractC1230u.d = (Long) i4.get(2);
                        abstractC1230u.f7600e = (Long) i4.get(3);
                        abstractC1230u.f7601f = (Long) i4.get(4);
                    }
                    C0891m3 v4 = C0934n3.v();
                    long longValue = abstractC1230u.f7599b.longValue();
                    v4.d();
                    C0934n3.x((C0934n3) v4.f4561p, longValue);
                    long longValue2 = abstractC1230u.c.longValue();
                    v4.d();
                    C0934n3.y((C0934n3) v4.f4561p, longValue2);
                    long longValue3 = abstractC1230u.d.longValue();
                    v4.d();
                    C0934n3.z((C0934n3) v4.f4561p, longValue3);
                    if (bool2.booleanValue()) {
                        long longValue4 = abstractC1230u.f7601f.longValue();
                        v4.d();
                        C0934n3.w((C0934n3) v4.f4561p, longValue4);
                    }
                    if (bool.booleanValue()) {
                        long longValue5 = abstractC1230u.f7600e.longValue();
                        v4.d();
                        C0934n3.A((C0934n3) v4.f4561p, longValue5);
                    }
                    C0549e3 c0549e33 = this.d;
                    C0934n3 c0934n3 = (C0934n3) v4.b();
                    c0549e33.d();
                    C0977o3.O((C0977o3) c0549e33.f4561p, c0934n3);
                    return;
                }
                return;
        }
    }
}
