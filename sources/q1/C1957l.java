package q1;

import B0.q;
import O1.BinderC0086s;
import O1.J;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.play_billing.B;
import d3.AbstractC1654b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1957l extends R1.b {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Activity d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f14699e;

    public C1957l(q qVar, boolean z4, Activity activity) {
        this.f14699e = qVar;
        this.c = z4;
        this.d = activity;
    }

    @Override // H1.r
    public final void b(H1.j jVar) {
        if (this.c && AbstractC1949d.f14652e == 0) {
            AbstractC1654b.E("FIRST_AD_FAILED");
        }
        B.B(this.d);
    }

    @Override // H1.r
    public final void e(Object obj) {
        R1.a aVar = (R1.a) obj;
        if (this.c && AbstractC1949d.f14652e == 0) {
            AbstractC1654b.E("FIRST_AD_LOADED");
        }
        H8 h8 = (H8) aVar;
        this.f14699e.f111p = h8;
        com.google.ads.mediation.d dVar = new com.google.ads.mediation.d(this);
        h8.getClass();
        try {
            J j4 = h8.c;
            if (j4 != null) {
                j4.H3(new BinderC0086s(dVar));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
