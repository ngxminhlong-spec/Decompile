package j3;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.ads.Qw;
import g2.ComponentCallbacks2C1683c;
import h2.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1739f {

    /* renamed from: a, reason: collision with root package name */
    public final Qw f13346a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f13347b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [g2.b, java.lang.Object] */
    public C1739f(Context context, C1735b c1735b, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        y.i(context);
        Qw qw = new Qw(c1735b, executor, scheduledExecutorService);
        new V2.e(21);
        this.f13346a = qw;
        ComponentCallbacks2C1683c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C1683c.f12980s.a(new Object());
    }
}
