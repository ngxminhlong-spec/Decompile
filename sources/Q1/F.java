package Q1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.Br;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.Er;
import com.google.android.gms.internal.ads.Fr;
import com.google.android.gms.internal.ads.Ir;
import e2.C1664b;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F implements InterfaceC1703b, InterfaceC1704c {

    /* renamed from: o, reason: collision with root package name */
    public boolean f1626o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1627p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f1628q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f1629r;

    /* renamed from: s, reason: collision with root package name */
    public Object f1630s;

    public F() {
        this.f1626o = false;
        this.f1629r = new WeakHashMap();
        this.f1628q = new E(0, this);
    }

    public F(int i4) {
        long[] jArr = new long[i4];
        this.f1628q = jArr;
        boolean[] zArr = new boolean[i4];
        this.f1629r = zArr;
        this.f1630s = new int[i4];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public F(Context context, Looper looper, Br br) {
        this.f1630s = new Object();
        this.f1626o = false;
        this.f1627p = false;
        this.f1629r = br;
        this.f1628q = new Fr(12800000, context, looper, this, this);
    }

    @Override // h2.InterfaceC1703b
    public void O(int i4) {
    }

    @Override // h2.InterfaceC1703b
    public void Q() {
        synchronized (this.f1630s) {
            try {
                if (this.f1627p) {
                    return;
                }
                this.f1627p = true;
                try {
                    Ir ir = (Ir) ((Fr) this.f1628q).t();
                    Er er = new Er(1, ((Br) this.f1629r).e());
                    Parcel Q3 = ir.Q();
                    AbstractC1192t4.c(Q3, er);
                    ir.G1(Q3, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (this.f1626o && !this.f1627p) {
                    int length = ((long[]) this.f1628q).length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 1;
                        if (i4 >= length) {
                            this.f1627p = true;
                            this.f1626o = false;
                            return (int[]) this.f1630s;
                        }
                        boolean z4 = ((long[]) this.f1628q)[i4] > 0;
                        boolean[] zArr = (boolean[]) this.f1629r;
                        if (z4 != zArr[i4]) {
                            int[] iArr = (int[]) this.f1630s;
                            if (!z4) {
                                i5 = 2;
                            }
                            iArr[i4] = i5;
                        } else {
                            ((int[]) this.f1630s)[i4] = 0;
                        }
                        zArr[i4] = z4;
                        i4++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    @Override // h2.InterfaceC1704c
    public void a0(C1664b c1664b) {
    }

    public synchronized void b(Context context) {
        try {
            if (this.f1626o) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f1630s = applicationContext;
            if (applicationContext == null) {
                this.f1630s = context;
            }
            AbstractC1066q6.a((Context) this.f1630s);
            C0937n6 c0937n6 = AbstractC1066q6.f10256m3;
            O1.r rVar = O1.r.d;
            this.f1627p = ((Boolean) rVar.c.a(c0937n6)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) rVar.c.a(AbstractC1066q6.n9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f1630s).registerReceiver((E) this.f1628q, intentFilter);
            } else {
                ((Context) this.f1630s).registerReceiver((E) this.f1628q, intentFilter, 4);
            }
            this.f1626o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c() {
        synchronized (this.f1630s) {
            try {
                if (!((Fr) this.f1628q).a()) {
                    if (((Fr) this.f1628q).g()) {
                    }
                    Binder.flushPendingCommands();
                }
                ((Fr) this.f1628q).k();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(Context context, E e4) {
        if (this.f1627p) {
            ((WeakHashMap) this.f1629r).remove(e4);
        } else {
            context.unregisterReceiver(e4);
        }
    }
}
