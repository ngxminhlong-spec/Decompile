package e2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import h2.y;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1663a implements ServiceConnection {

    /* renamed from: o, reason: collision with root package name */
    public boolean f12739o = false;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedBlockingQueue f12740p = new LinkedBlockingQueue();

    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f12739o) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f12739o = true;
        IBinder iBinder = (IBinder) this.f12740p.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f12740p.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
