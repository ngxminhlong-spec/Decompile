package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import x2.C2066c0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Q8 {

    /* renamed from: a, reason: collision with root package name */
    public long f6647a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6648b;
    public Serializable c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6649e;

    public /* synthetic */ Q8(Z8 z8, ArrayList arrayList, long j4, Y8 y8, M8 m8) {
        this.f6648b = z8;
        this.c = arrayList;
        this.f6647a = j4;
        this.d = y8;
        this.f6649e = m8;
    }

    public /* synthetic */ Q8(x2.T t4, long j4) {
        this.f6649e = t4;
        h2.y.e("health_monitor");
        h2.y.b(j4 > 0);
        this.f6648b = "health_monitor:start";
        this.c = "health_monitor:count";
        this.d = "health_monitor:value";
        this.f6647a = j4;
    }

    public /* synthetic */ Q8(x2.X0 x02) {
        this.f6649e = x02;
    }

    public boolean a(long j4, com.google.android.gms.internal.measurement.E0 e02) {
        x2.X0 x02 = (x2.X0) this.f6649e;
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.d).isEmpty() || ((((com.google.android.gms.internal.measurement.E0) ((ArrayList) this.d).get(0)).o() / 1000) / 60) / 60 == ((e02.o() / 1000) / 60) / 60) {
            long c = this.f6647a + e02.c();
            x02.K();
            if (c < Math.max(0, ((Integer) x2.B.f15303i.a(null)).intValue())) {
                this.f6647a = c;
                ((ArrayList) this.d).add(e02);
                ((ArrayList) this.c).add(Long.valueOf(j4));
                int size = ((ArrayList) this.d).size();
                x02.K();
                if (size < Math.max(1, ((Integer) x2.B.f15305j.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        x2.T t4 = (x2.T) this.f6649e;
        t4.g();
        ((C2066c0) t4.f1719a).f15573n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = t4.k().edit();
        edit.remove((String) this.c);
        edit.remove((String) this.d);
        edit.putLong((String) this.f6648b, currentTimeMillis);
        edit.apply();
    }
}
