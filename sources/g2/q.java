package g2;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Wl;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f13021a;

    public q(int i4) {
        this.f13021a = i4;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(m mVar);

    public abstract e2.d[] b(m mVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(m mVar);

    public abstract void f(Wl wl, boolean z4);
}
