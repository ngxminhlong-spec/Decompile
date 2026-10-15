package D;

import W3.C0124c;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: o, reason: collision with root package name */
    public final C0124c f522o;

    public c(C0124c c0124c) {
        super(false);
        this.f522o = c0124c;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f522o.c(AbstractC1806a.h(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f522o.c(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
