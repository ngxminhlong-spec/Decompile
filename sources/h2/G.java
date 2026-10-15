package h2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G implements ServiceConnection {

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f13146o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public int f13147p = 2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13148q;

    /* renamed from: r, reason: collision with root package name */
    public IBinder f13149r;

    /* renamed from: s, reason: collision with root package name */
    public final F f13150s;

    /* renamed from: t, reason: collision with root package name */
    public ComponentName f13151t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I f13152u;

    public G(I i4, F f4) {
        this.f13152u = i4;
        this.f13150s = f4;
    }

    public final void a(String str, Executor executor) {
        k2.a aVar;
        Context context;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f13147p = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            I i4 = this.f13152u;
            aVar = i4.d;
            context = i4.f13158b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean c = aVar.c(context, str, this.f13150s.a(context), this, 4225, executor);
            this.f13148q = c;
            if (c) {
                this.f13152u.c.sendMessageDelayed(this.f13152u.c.obtainMessage(1, this.f13150s), this.f13152u.f13160f);
            } else {
                this.f13147p = 2;
                try {
                    I i5 = this.f13152u;
                    i5.d.b(i5.f13158b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f13152u.f13157a) {
            try {
                this.f13152u.c.removeMessages(1, this.f13150s);
                this.f13149r = iBinder;
                this.f13151t = componentName;
                Iterator it = this.f13146o.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f13147p = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f13152u.f13157a) {
            try {
                this.f13152u.c.removeMessages(1, this.f13150s);
                this.f13149r = null;
                this.f13151t = componentName;
                Iterator it = this.f13146o.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f13147p = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
