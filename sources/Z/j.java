package Z;

import android.view.Choreographer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class j {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: Z.i
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                runnable.run();
            }
        });
    }
}
