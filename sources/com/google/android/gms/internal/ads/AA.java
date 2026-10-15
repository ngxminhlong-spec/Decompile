package com.google.android.gms.internal.ads;

import android.view.View;
import b0.RunnableC0203p;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class AA {

    /* renamed from: p, reason: collision with root package name */
    public static MessageDigest f3927p;

    /* renamed from: o, reason: collision with root package name */
    public final Object f3928o;

    public AA(int i4) {
        switch (i4) {
            case 5:
                this.f3928o = new Rg();
                return;
            default:
                this.f3928o = new Object();
                return;
        }
    }

    public AA(View view) {
        this.f3928o = new WeakReference(view);
    }

    public AA(Set set) {
        this.f3928o = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                i1((Ph) it.next());
            }
        }
    }

    public abstract byte R0(long j4);

    public MessageDigest S0() {
        synchronized (this.f3928o) {
            MessageDigest messageDigest = f3927p;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i4 = 0; i4 < 2; i4++) {
                try {
                    f3927p = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f3927p;
        }
    }

    public abstract void T0(int i4, long j4);

    public abstract double U0(long j4, Object obj);

    public abstract int V0();

    public abstract float W0(long j4, Object obj);

    public abstract int X0();

    public abstract int Y0();

    public abstract void Z();

    public abstract void Z0(long j4, byte[] bArr, long j5, long j6);

    public abstract int a1();

    public abstract void b1(Object obj, long j4, boolean z4);

    public abstract void c1(Object obj, long j4, byte b4);

    public abstract int d();

    public abstract void d1(Object obj, long j4, double d);

    public abstract void e1(Object obj, long j4, float f4);

    public abstract void f();

    public abstract boolean f1(long j4, Object obj);

    public abstract long g1();

    public abstract int h();

    public abstract long h1();

    public synchronized void i1(Ph ph) {
        m1(ph.f6591a, ph.f6592b);
    }

    public abstract long j1();

    public abstract AbstractC0484ch k1();

    public abstract C0486cj l1();

    public synchronized void m1(Object obj, Executor executor) {
        ((HashMap) this.f3928o).put(obj, executor);
    }

    public synchronized void n1(Bh bh) {
        for (Map.Entry entry : ((HashMap) this.f3928o).entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC0203p(21, bh, entry.getKey()));
        }
    }

    public abstract boolean o1();

    public abstract boolean p1();
}
