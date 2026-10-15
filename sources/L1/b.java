package L1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import e2.ServiceConnectionC1663a;
import e2.f;
import h2.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p2.AbstractBinderC1942c;
import p2.AbstractC1940a;
import p2.C1941b;
import p2.InterfaceC1943d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public ServiceConnectionC1663a f1077a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1943d f1078b;
    public boolean c;
    public final Object d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public d f1079e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1080f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1081g;

    public b(Context context, long j4, boolean z4) {
        Context applicationContext;
        y.i(context);
        if (z4 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f1080f = context;
        this.c = false;
        this.f1081g = j4;
    }

    public static a a(Context context) {
        b bVar = new b(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bVar.d(false);
            a f4 = bVar.f();
            e(f4, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return f4;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z4;
        b bVar = new b(context, -1L, false);
        try {
            bVar.d(false);
            y.h("Calling this from your main thread can lead to deadlock");
            synchronized (bVar) {
                try {
                    if (!bVar.c) {
                        synchronized (bVar.d) {
                            d dVar = bVar.f1079e;
                            if (dVar == null || !dVar.f1087r) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            bVar.d(false);
                            if (!bVar.c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e4) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                        }
                    }
                    y.i(bVar.f1077a);
                    y.i(bVar.f1078b);
                    try {
                        C1941b c1941b = (C1941b) bVar.f1078b;
                        c1941b.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel O4 = c1941b.O(obtain, 6);
                        int i4 = AbstractC1940a.f14604a;
                        z4 = O4.readInt() != 0;
                        O4.recycle();
                    } catch (RemoteException e5) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar.g();
            return z4;
        } finally {
            bVar.c();
        }
    }

    public static void e(a aVar, long j4, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (aVar != null) {
                hashMap.put("limit_ad_tracking", true != aVar.f1076b ? "0" : "1");
                String str = aVar.f1075a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j4));
            new c(0, hashMap).start();
        }
    }

    public final void c() {
        y.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f1080f == null || this.f1077a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        k2.a.a().b(this.f1080f, this.f1077a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.f1078b = null;
                this.f1077a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z4) {
        y.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    c();
                }
                Context context = this.f1080f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c = f.f12753b.c(context, 12451000);
                    if (c != 0 && c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC1663a serviceConnectionC1663a = new ServiceConnectionC1663a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!k2.a.a().c(context, context.getClass().getName(), intent, serviceConnectionC1663a, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f1077a = serviceConnectionC1663a;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a4 = serviceConnectionC1663a.a();
                            int i4 = AbstractBinderC1942c.f14606o;
                            IInterface queryLocalInterface = a4.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f1078b = queryLocalInterface instanceof InterfaceC1943d ? (InterfaceC1943d) queryLocalInterface : new C1941b(a4);
                            this.c = true;
                            if (z4) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a f() {
        a aVar;
        y.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        d dVar = this.f1079e;
                        if (dVar == null || !dVar.f1087r) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e4) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                    }
                }
                y.i(this.f1077a);
                y.i(this.f1078b);
                try {
                    C1941b c1941b = (C1941b) this.f1078b;
                    c1941b.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel O4 = c1941b.O(obtain, 1);
                    String readString = O4.readString();
                    O4.recycle();
                    C1941b c1941b2 = (C1941b) this.f1078b;
                    c1941b2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i4 = AbstractC1940a.f14604a;
                    obtain2.writeInt(1);
                    Parcel O5 = c1941b2.O(obtain2, 2);
                    boolean z4 = O5.readInt() != 0;
                    O5.recycle();
                    aVar = new a(readString, z4);
                } catch (RemoteException e5) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.d) {
            d dVar = this.f1079e;
            if (dVar != null) {
                dVar.f1086q.countDown();
                try {
                    this.f1079e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j4 = this.f1081g;
            if (j4 > 0) {
                this.f1079e = new d(this, j4);
            }
        }
    }
}
