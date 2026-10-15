package W2;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.C0326Qb;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0326Qb f2056o;

    public o(C0326Qb c0326Qb) {
        this.f2056o = c0326Qb;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0326Qb c0326Qb = this.f2056o;
        p pVar = (p) message.obj;
        synchronized (c0326Qb.f6659o) {
            if (((p) c0326Qb.f6661q) == pVar || ((p) c0326Qb.f6662r) == pVar) {
                c0326Qb.i(pVar, 2);
            }
        }
        return true;
    }
}
