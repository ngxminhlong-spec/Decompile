package O1;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.Y9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099y0 extends H1.b {

    /* renamed from: o, reason: collision with root package name */
    public final Object f1402o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public H1.b f1403p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A0 f1404q;

    public C0099y0(A0 a02) {
        this.f1404q = a02;
    }

    @Override // H1.b
    public final void D() {
        synchronized (this.f1402o) {
            try {
                H1.b bVar = this.f1403p;
                if (bVar != null) {
                    bVar.D();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H1.b
    public final void a() {
        synchronized (this.f1402o) {
            try {
                H1.b bVar = this.f1403p;
                if (bVar != null) {
                    bVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H1.b
    public final void b(H1.j jVar) {
        A0 a02 = this.f1404q;
        C0258Da c0258Da = (C0258Da) a02.c;
        J j4 = (J) a02.f1259i;
        InterfaceC0089t0 interfaceC0089t0 = null;
        if (j4 != null) {
            try {
                interfaceC0089t0 = j4.l();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
        c0258Da.o(interfaceC0089t0);
        synchronized (this.f1402o) {
            try {
                H1.b bVar = this.f1403p;
                if (bVar != null) {
                    bVar.b(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H1.b
    public final void c() {
        synchronized (this.f1402o) {
            try {
                H1.b bVar = this.f1403p;
                if (bVar != null) {
                    bVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H1.b
    public final void e() {
        A0 a02 = this.f1404q;
        C0258Da c0258Da = (C0258Da) a02.c;
        J j4 = (J) a02.f1259i;
        InterfaceC0089t0 interfaceC0089t0 = null;
        if (j4 != null) {
            try {
                interfaceC0089t0 = j4.l();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
        c0258Da.o(interfaceC0089t0);
        synchronized (this.f1402o) {
            try {
                H1.b bVar = this.f1403p;
                if (bVar != null) {
                    bVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H1.b
    public final void l() {
        synchronized (this.f1402o) {
            try {
                H1.b bVar = this.f1403p;
                if (bVar != null) {
                    bVar.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
