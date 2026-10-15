package g2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C1094qs;
import com.google.android.gms.internal.ads.Wl;
import java.util.Map;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final j f13037b;
    public final A2.i c;
    public final C2033d d;

    public v(int i4, j jVar, A2.i iVar, C2033d c2033d) {
        super(i4);
        this.c = iVar;
        this.f13037b = jVar;
        this.d = c2033d;
        if (i4 == 2 && jVar.f13003b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // g2.q
    public final boolean a(m mVar) {
        return this.f13037b.f13003b;
    }

    @Override // g2.q
    public final e2.d[] b(m mVar) {
        return this.f13037b.f13002a;
    }

    @Override // g2.q
    public final void c(Status status) {
        this.d.getClass();
        this.c.c(status.f3900q != null ? new f2.d(status) : new f2.d(status));
    }

    @Override // g2.q
    public final void d(Exception exc) {
        this.c.c(exc);
    }

    @Override // g2.q
    public final void e(m mVar) {
        A2.i iVar = this.c;
        try {
            j jVar = this.f13037b;
            ((i) ((j) jVar.d).d).accept(mVar.f13007p, iVar);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            c(q.g(e5));
        } catch (RuntimeException e6) {
            iVar.c(e6);
        }
    }

    @Override // g2.q
    public final void f(Wl wl, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) wl.f7564q;
        A2.i iVar = this.c;
        map.put(iVar, valueOf);
        A2.r rVar = iVar.f26a;
        C1094qs c1094qs = new C1094qs(wl, iVar, 1);
        rVar.getClass();
        rVar.f41b.e(new A2.l(A2.j.f27a, c1094qs));
        rVar.p();
    }
}
