package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import c0.BinderC0225f;
import c0.RemoteCallbackListC0224e;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: o, reason: collision with root package name */
    public int f3114o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f3115p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final RemoteCallbackListC0224e f3116q = new RemoteCallbackListC0224e(this);

    /* renamed from: r, reason: collision with root package name */
    public final BinderC0225f f3117r = new BinderC0225f(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f3117r;
    }
}
