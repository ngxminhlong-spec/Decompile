package h2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1700B implements ServiceConnection {

    /* renamed from: o, reason: collision with root package name */
    public final int f13135o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1706e f13136p;

    public ServiceConnectionC1700B(AbstractC1706e abstractC1706e, int i4) {
        this.f13136p = abstractC1706e;
        this.f13135o = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1706e abstractC1706e = this.f13136p;
        if (iBinder == null) {
            AbstractC1706e.x(abstractC1706e);
            return;
        }
        synchronized (abstractC1706e.f13181v) {
            try {
                AbstractC1706e abstractC1706e2 = this.f13136p;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1706e2.f13182w = (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new u(iBinder) : (u) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1706e abstractC1706e3 = this.f13136p;
        int i4 = this.f13135o;
        D d = new D(abstractC1706e3, 0);
        z zVar = abstractC1706e3.f13179t;
        zVar.sendMessage(zVar.obtainMessage(7, i4, -1, d));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1706e abstractC1706e;
        synchronized (this.f13136p.f13181v) {
            abstractC1706e = this.f13136p;
            abstractC1706e.f13182w = null;
        }
        int i4 = this.f13135o;
        z zVar = abstractC1706e.f13179t;
        zVar.sendMessage(zVar.obtainMessage(6, i4, 1));
    }
}
