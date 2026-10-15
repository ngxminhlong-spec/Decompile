package com.google.android.gms.internal.ads;

import a.AbstractBinderC0148b;
import a.C0147a;
import a.InterfaceC0149c;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.AbstractBinderC1597z;
import java.lang.ref.WeakReference;
import o.BinderC1821a;
import x2.C2064b0;
import x2.C2066c0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class GB implements ServiceConnection {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5140o = 0;

    /* renamed from: p, reason: collision with root package name */
    public Object f5141p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f5142q;

    public GB(C1452z6 c1452z6) {
        this.f5142q = new WeakReference(c1452z6);
    }

    public GB(x2.U u2, String str) {
        this.f5142q = u2;
        this.f5141p = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.measurement.A] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.Binder, o.a, android.os.IInterface, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0149c interfaceC0149c;
        Qw qw;
        int i4 = this.f5140o;
        Object obj = this.f5142q;
        switch (i4) {
            case 0:
                if (((Context) this.f5141p) == null) {
                    throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
                }
                int i5 = AbstractBinderC0148b.f2347o;
                if (iBinder == null) {
                    interfaceC0149c = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0149c)) {
                        ?? obj2 = new Object();
                        obj2.f2346o = iBinder;
                        interfaceC0149c = obj2;
                    } else {
                        interfaceC0149c = (InterfaceC0149c) queryLocalInterface;
                    }
                }
                C0831kn c0831kn = new C0831kn(14, interfaceC0149c, componentName);
                C1452z6 c1452z6 = (C1452z6) ((WeakReference) obj).get();
                if (c1452z6 != null) {
                    c1452z6.f11574b = c0831kn;
                    try {
                        ((C0147a) interfaceC0149c).Q();
                    } catch (RemoteException unused) {
                    }
                    q2.e eVar = c1452z6.d;
                    if (eVar != null) {
                        Context context = (Context) eVar.f14709p;
                        C1452z6 c1452z62 = (C1452z6) eVar.f14710q;
                        C0831kn c0831kn2 = c1452z62.f11574b;
                        boolean z4 = false;
                        if (c0831kn2 == null) {
                            c1452z62.f11573a = null;
                        } else if (c1452z62.f11573a == null) {
                            InterfaceC0149c interfaceC0149c2 = (InterfaceC0149c) c0831kn2.f9319p;
                            ?? binder = new Binder();
                            binder.attachInterface(binder, "android.support.customtabs.ICustomTabsCallback");
                            new Handler(Looper.getMainLooper());
                            if (((C0147a) interfaceC0149c2).O(binder)) {
                                qw = new Qw(binder, (ComponentName) c0831kn2.f9320q, 11, z4);
                                c1452z62.f11573a = qw;
                            }
                            qw = null;
                            c1452z62.f11573a = qw;
                        }
                        Qw qw2 = c1452z62.f11573a;
                        Intent intent = new Intent("android.intent.action.VIEW");
                        if (qw2 != null) {
                            intent.setPackage(((ComponentName) qw2.f6711q).getPackageName());
                            BinderC1821a binderC1821a = (BinderC1821a) qw2.f6710p;
                            Bundle bundle = new Bundle();
                            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC1821a);
                            intent.putExtras(bundle);
                        }
                        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                            intent.putExtras(bundle2);
                        }
                        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                        intent.putExtras(new Bundle());
                        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                        intent.setPackage(AbstractC0587ez.b(context));
                        intent.setData((Uri) eVar.f14711r);
                        context.startActivity(intent, null);
                        Activity activity = (Activity) context;
                        GB gb = c1452z62.c;
                        if (gb == null) {
                            return;
                        }
                        activity.unbindService(gb);
                        c1452z62.f11574b = null;
                        c1452z62.f11573a = null;
                        c1452z62.c = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                x2.U u2 = (x2.U) obj;
                if (iBinder == null) {
                    x2.K k3 = u2.f15459b.f15568i;
                    C2066c0.i(k3);
                    k3.f15397i.a("Install Referrer connection returned with null binder");
                    return;
                }
                try {
                    int i6 = AbstractBinderC1597z.f12121o;
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    ?? abstractC1106r4 = queryLocalInterface2 instanceof com.google.android.gms.internal.measurement.A ? (com.google.android.gms.internal.measurement.A) queryLocalInterface2 : new AbstractC1106r4(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 1);
                    x2.K k4 = u2.f15459b.f15568i;
                    C2066c0.i(k4);
                    k4.f15402n.a("Install Referrer Service connected");
                    C2064b0 c2064b0 = u2.f15459b.f15569j;
                    C2066c0.i(c2064b0);
                    c2064b0.o(new x0.j(this, (com.google.android.gms.internal.measurement.A) abstractC1106r4, this));
                    return;
                } catch (RuntimeException e4) {
                    x2.K k5 = u2.f15459b.f15568i;
                    C2066c0.i(k5);
                    k5.f15397i.b(e4, "Exception occurred while calling Install Referrer API");
                    return;
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f5140o) {
            case 0:
                C1452z6 c1452z6 = (C1452z6) ((WeakReference) this.f5142q).get();
                if (c1452z6 != null) {
                    c1452z6.f11574b = null;
                    c1452z6.f11573a = null;
                    return;
                }
                return;
            default:
                x2.K k3 = ((x2.U) this.f5142q).f15459b.f15568i;
                C2066c0.i(k3);
                k3.f15402n.a("Install Referrer Service disconnected");
                return;
        }
    }
}
