package v0;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Notification f15024p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15025q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f15026r;

    public c(SystemForegroundService systemForegroundService, int i4, Notification notification, int i5) {
        this.f15026r = systemForegroundService;
        this.f15023o = i4;
        this.f15024p = notification;
        this.f15025q = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = Build.VERSION.SDK_INT;
        Notification notification = this.f15024p;
        int i5 = this.f15023o;
        SystemForegroundService systemForegroundService = this.f15026r;
        if (i4 >= 29) {
            systemForegroundService.startForeground(i5, notification, this.f15025q);
        } else {
            systemForegroundService.startForeground(i5, notification);
        }
    }
}
