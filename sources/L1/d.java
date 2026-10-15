package L1;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public final WeakReference f1084o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1085p;

    /* renamed from: q, reason: collision with root package name */
    public final CountDownLatch f1086q = new CountDownLatch(1);

    /* renamed from: r, reason: collision with root package name */
    public boolean f1087r = false;

    public d(b bVar, long j4) {
        this.f1084o = new WeakReference(bVar);
        this.f1085p = j4;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f1084o;
        try {
            if (this.f1086q.await(this.f1085p, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.c();
            this.f1087r = true;
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
                this.f1087r = true;
            }
        }
    }
}
