package t;

import com.google.android.gms.internal.play_billing.B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends B {
    @Override // com.google.android.gms.internal.play_billing.B
    public final void F(f fVar, f fVar2) {
        fVar.f14824b = fVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final void G(f fVar, Thread thread) {
        fVar.f14823a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final boolean c(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f14830p != cVar) {
                    return false;
                }
                gVar.f14830p = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f14829o != obj) {
                    return false;
                }
                gVar.f14829o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f14831q != fVar) {
                    return false;
                }
                gVar.f14831q = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
