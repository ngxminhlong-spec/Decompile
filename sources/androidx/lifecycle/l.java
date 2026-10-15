package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class l extends Service implements i {

    /* renamed from: o, reason: collision with root package name */
    public final q2.e f2982o = new q2.e(this);

    @Override // androidx.lifecycle.i
    public final k f() {
        return (k) this.f2982o.f14709p;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        S3.e.e(intent, "intent");
        this.f2982o.x(f.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2982o.x(f.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = f.ON_STOP;
        q2.e eVar = this.f2982o;
        eVar.x(fVar);
        eVar.x(f.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i4) {
        this.f2982o.x(f.ON_START);
        super.onStart(intent, i4);
    }
}
