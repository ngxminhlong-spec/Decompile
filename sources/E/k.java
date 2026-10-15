package E;

import android.os.Process;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public final int f700o;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f700o = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f700o);
        super.run();
    }
}
