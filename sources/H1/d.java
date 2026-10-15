package H1;

import O1.C;
import O1.C0097x0;
import O1.W0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1249uc;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Y9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f861a;

    /* renamed from: b, reason: collision with root package name */
    public final C f862b;

    public d(Context context, C c) {
        this.f861a = context;
        this.f862b = c;
    }

    public final void a(e eVar) {
        C0097x0 c0097x0 = eVar.f863a;
        Context context = this.f861a;
        AbstractC1066q6.a(context);
        if (((Boolean) L6.c.r()).booleanValue()) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                AbstractC1249uc.f10789b.execute(new Nu(21, this, c0097x0));
                return;
            }
        }
        try {
            this.f862b.B0(W0.a(context, c0097x0));
        } catch (RemoteException e4) {
            Y9.q("Failed to load ad.", e4);
        }
    }
}
