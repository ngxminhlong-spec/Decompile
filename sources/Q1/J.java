package Q1;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.Ur;
import com.google.android.gms.internal.ads.W6;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J extends Ur {
    @Override // com.google.android.gms.internal.ads.Ur
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            N1.n nVar = N1.n.f1204A;
            N n4 = nVar.c;
            Context context = nVar.f1209g.f9970e;
            if (context != null) {
                try {
                    if (((Boolean) W6.f7343b.r()).booleanValue()) {
                        AbstractC1799b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e4) {
            N1.n.f1204A.f1209g.h("AdMobHandler.handleMessage", e4);
        }
    }
}
