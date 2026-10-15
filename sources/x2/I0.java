package x2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0300La;
import e2.C1664b;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I0 implements ServiceConnection, InterfaceC1703b, InterfaceC1704c {

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f15384o;

    /* renamed from: p, reason: collision with root package name */
    public volatile C0300La f15385p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J0 f15386q;

    public I0(J0 j02) {
        this.f15386q = j02;
    }

    @Override // h2.InterfaceC1703b
    public final void O(int i4) {
        h2.y.d("MeasurementServiceConnection.onConnectionSuspended");
        C2066c0 c2066c0 = (C2066c0) this.f15386q.f1719a;
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15401m.a("Service connection suspended");
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new H0(this, 0));
    }

    @Override // h2.InterfaceC1703b
    public final void Q() {
        h2.y.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                h2.y.i(this.f15385p);
                D d = (D) this.f15385p.t();
                C2064b0 c2064b0 = ((C2066c0) this.f15386q.f1719a).f15569j;
                C2066c0.i(c2064b0);
                c2064b0.o(new G0(this, d, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f15385p = null;
                this.f15384o = false;
            }
        }
    }

    public final void a() {
        this.f15386q.g();
        Context context = ((C2066c0) this.f15386q.f1719a).f15562a;
        synchronized (this) {
            try {
                try {
                    if (this.f15384o) {
                        K k3 = ((C2066c0) this.f15386q.f1719a).f15568i;
                        C2066c0.i(k3);
                        k3.f15402n.a("Connection attempt already in progress");
                    } else {
                        if (this.f15385p != null && (this.f15385p.g() || this.f15385p.a())) {
                            K k4 = ((C2066c0) this.f15386q.f1719a).f15568i;
                            C2066c0.i(k4);
                            k4.f15402n.a("Already awaiting connection attempt");
                            return;
                        }
                        this.f15385p = new C0300La(context, Looper.getMainLooper(), 93, this, this, 1);
                        K k5 = ((C2066c0) this.f15386q.f1719a).f15568i;
                        C2066c0.i(k5);
                        k5.f15402n.a("Connecting to remote service");
                        this.f15384o = true;
                        h2.y.i(this.f15385p);
                        this.f15385p.n();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // h2.InterfaceC1704c
    public final void a0(C1664b c1664b) {
        h2.y.d("MeasurementServiceConnection.onConnectionFailed");
        K k3 = ((C2066c0) this.f15386q.f1719a).f15568i;
        if (k3 == null || !k3.f15673b) {
            k3 = null;
        }
        if (k3 != null) {
            k3.f15397i.b(c1664b, "Service connection failed");
        }
        synchronized (this) {
            this.f15384o = false;
            this.f15385p = null;
        }
        C2064b0 c2064b0 = ((C2066c0) this.f15386q.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new H0(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h2.y.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f15384o = false;
                K k3 = ((C2066c0) this.f15386q.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15394f.a("Service connected with null binder");
                return;
            }
            D d = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    d = queryLocalInterface instanceof D ? (D) queryLocalInterface : new C(iBinder);
                    K k4 = ((C2066c0) this.f15386q.f1719a).f15568i;
                    C2066c0.i(k4);
                    k4.f15402n.a("Bound to IMeasurementService interface");
                } else {
                    K k5 = ((C2066c0) this.f15386q.f1719a).f15568i;
                    C2066c0.i(k5);
                    k5.f15394f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                K k6 = ((C2066c0) this.f15386q.f1719a).f15568i;
                C2066c0.i(k6);
                k6.f15394f.a("Service connect failed to get IMeasurementService");
            }
            if (d == null) {
                this.f15384o = false;
                try {
                    k2.a a4 = k2.a.a();
                    J0 j02 = this.f15386q;
                    a4.b(((C2066c0) j02.f1719a).f15562a, j02.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C2064b0 c2064b0 = ((C2066c0) this.f15386q.f1719a).f15569j;
                C2066c0.i(c2064b0);
                c2064b0.o(new G0(this, d, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h2.y.d("MeasurementServiceConnection.onServiceDisconnected");
        C2066c0 c2066c0 = (C2066c0) this.f15386q.f1719a;
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15401m.a("Service disconnected");
        C2064b0 c2064b0 = c2066c0.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new x0.j(this, componentName, 8, false));
    }
}
