package x2;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.Q8;
import java.io.IOException;
import java.util.Map;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15373o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final int f15374p;

    /* renamed from: q, reason: collision with root package name */
    public final String f15375q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f15376r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f15377s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f15378t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f15379u;

    public /* synthetic */ H(String str, M m4, int i4, IOException iOException, byte[] bArr, Map map) {
        h2.y.i(m4);
        this.f15376r = m4;
        this.f15374p = i4;
        this.f15377s = iOException;
        this.f15378t = bArr;
        this.f15375q = str;
        this.f15379u = map;
    }

    public H(K k3, int i4, String str, Object obj, Object obj2, Object obj3) {
        this.f15379u = k3;
        this.f15374p = i4;
        this.f15375q = str;
        this.f15376r = obj;
        this.f15377s = obj2;
        this.f15378t = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15373o) {
            case 0:
                T t4 = ((C2066c0) ((K) this.f15379u).f1719a).f15567h;
                C2066c0.g(t4);
                if (!t4.f15673b) {
                    Log.println(6, ((K) this.f15379u).q(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                K k3 = (K) this.f15379u;
                if (k3.c == 0) {
                    C2073g c2073g = ((C2066c0) k3.f1719a).f15566g;
                    if (c2073g.d == null) {
                        synchronized (c2073g) {
                            try {
                                if (c2073g.d == null) {
                                    ApplicationInfo applicationInfo = ((C2066c0) c2073g.f1719a).f15562a.getApplicationInfo();
                                    String e4 = AbstractC1799b.e();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c2073g.d = Boolean.valueOf(str != null && str.equals(e4));
                                    }
                                    if (c2073g.d == null) {
                                        c2073g.d = Boolean.TRUE;
                                        K k4 = ((C2066c0) c2073g.f1719a).f15568i;
                                        C2066c0.i(k4);
                                        k4.f15394f.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c2073g.d.booleanValue()) {
                        K k5 = (K) this.f15379u;
                        ((C2066c0) k5.f1719a).getClass();
                        k5.c = 'C';
                    } else {
                        K k6 = (K) this.f15379u;
                        ((C2066c0) k6.f1719a).getClass();
                        k6.c = 'c';
                    }
                }
                K k7 = (K) this.f15379u;
                if (k7.d < 0) {
                    ((C2066c0) k7.f1719a).f15566g.l();
                    k7.d = 73000L;
                }
                char charAt = "01VDIWEA?".charAt(this.f15374p);
                K k8 = (K) this.f15379u;
                char c = k8.c;
                long j4 = k8.d;
                String o4 = K.o(true, this.f15375q, this.f15376r, this.f15377s, this.f15378t);
                StringBuilder sb = new StringBuilder("2");
                sb.append(charAt);
                sb.append(c);
                sb.append(j4);
                String j5 = n0.a.j(sb, ":", o4);
                if (j5.length() > 1024) {
                    j5 = this.f15375q.substring(0, 1024);
                }
                Q8 q8 = t4.d;
                if (q8 != null) {
                    String str2 = (String) q8.d;
                    String str3 = (String) q8.c;
                    T t5 = (T) q8.f6649e;
                    t5.g();
                    if (((T) q8.f6649e).k().getLong((String) q8.f6648b, 0L) == 0) {
                        q8.b();
                    }
                    if (j5 == null) {
                        j5 = "";
                    }
                    long j6 = t5.k().getLong(str3, 0L);
                    if (j6 <= 0) {
                        SharedPreferences.Editor edit = t5.k().edit();
                        edit.putString(str2, j5);
                        edit.putLong(str3, 1L);
                        edit.apply();
                        return;
                    }
                    b1 b1Var = ((C2066c0) t5.f1719a).f15571l;
                    C2066c0.g(b1Var);
                    long nextLong = b1Var.o().nextLong();
                    long j7 = j6 + 1;
                    long j8 = Long.MAX_VALUE / j7;
                    SharedPreferences.Editor edit2 = t5.k().edit();
                    if ((Long.MAX_VALUE & nextLong) < j8) {
                        edit2.putString(str2, j5);
                    }
                    edit2.putLong(str3, j7);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((M) this.f15376r).e(this.f15375q, this.f15374p, (Throwable) this.f15377s, (byte[]) this.f15378t, (Map) this.f15379u);
                return;
        }
    }
}
