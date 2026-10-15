package g2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Wl;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: b, reason: collision with root package name */
    public final A2.i f13038b;

    public w(A2.i iVar) {
        super(4);
        this.f13038b = iVar;
    }

    @Override // g2.q
    public final boolean a(m mVar) {
        if (mVar.f13011t.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // g2.q
    public final e2.d[] b(m mVar) {
        if (mVar.f13011t.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // g2.q
    public final void c(Status status) {
        this.f13038b.c(new f2.d(status));
    }

    @Override // g2.q
    public final void d(Exception exc) {
        this.f13038b.c(exc);
    }

    @Override // g2.q
    public final void e(m mVar) {
        try {
            h(mVar);
        } catch (DeadObjectException e4) {
            c(q.g(e4));
            throw e4;
        } catch (RemoteException e5) {
            c(q.g(e5));
        } catch (RuntimeException e6) {
            this.f13038b.c(e6);
        }
    }

    @Override // g2.q
    public final /* bridge */ /* synthetic */ void f(Wl wl, boolean z4) {
    }

    public final void h(m mVar) {
        if (mVar.f13011t.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f13038b.f26a.n(Boolean.FALSE);
    }
}
