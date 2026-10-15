package d3;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.Qw;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import g2.ComponentCallbacks2C1683c;
import h2.y;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.AbstractC1799b;
import n3.C1814a;
import n3.C1819f;
import n3.m;
import o3.l;
import v3.C2032c;
import v3.C2033d;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f12615j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final r.e f12616k = new r.i(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f12617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12618b;
    public final i c;
    public final C1819f d;

    /* renamed from: g, reason: collision with root package name */
    public final m f12621g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2053a f12622h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f12619e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f12620f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f12623i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    public g(Context context, String str, i iVar) {
        ?? arrayList;
        final int i4 = 0;
        new CopyOnWriteArrayList();
        this.f12617a = context;
        y.e(str);
        this.f12618b = str;
        this.c = iVar;
        C1653a c1653a = FirebaseInitProvider.f12547o;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new InterfaceC2053a() { // from class: n3.c
                @Override // w3.InterfaceC2053a
                public final Object get() {
                    switch (i4) {
                        case 0:
                            String str4 = (String) str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
                                throw new RuntimeException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                                return null;
                            } catch (IllegalAccessException e4) {
                                throw new RuntimeException(U.a.k("Could not instantiate ", str4, "."), e4);
                            } catch (InstantiationException e5) {
                                throw new RuntimeException(U.a.k("Could not instantiate ", str4, "."), e5);
                            } catch (NoSuchMethodException e6) {
                                throw new RuntimeException(n0.a.k("Could not instantiate ", str4), e6);
                            } catch (InvocationTargetException e7) {
                                throw new RuntimeException(n0.a.k("Could not instantiate ", str4), e7);
                            }
                        default:
                            return (ComponentRegistrar) str3;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f14370o;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        final ?? r5 = 1 == true ? 1 : 0;
        arrayList3.add(new InterfaceC2053a() { // from class: n3.c
            @Override // w3.InterfaceC2053a
            public final Object get() {
                switch (r5) {
                    case 0:
                        String str4 = (String) firebaseCommonRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new RuntimeException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e4) {
                            throw new RuntimeException(U.a.k("Could not instantiate ", str4, "."), e4);
                        } catch (InstantiationException e5) {
                            throw new RuntimeException(U.a.k("Could not instantiate ", str4, "."), e5);
                        } catch (NoSuchMethodException e6) {
                            throw new RuntimeException(n0.a.k("Could not instantiate ", str4), e6);
                        } catch (InvocationTargetException e7) {
                            throw new RuntimeException(n0.a.k("Could not instantiate ", str4), e7);
                        }
                    default:
                        return (ComponentRegistrar) firebaseCommonRegistrar;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        final ?? r52 = 1 == true ? 1 : 0;
        arrayList3.add(new InterfaceC2053a() { // from class: n3.c
            @Override // w3.InterfaceC2053a
            public final Object get() {
                switch (r52) {
                    case 0:
                        String str4 = (String) executorsRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new RuntimeException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e4) {
                            throw new RuntimeException(U.a.k("Could not instantiate ", str4, "."), e4);
                        } catch (InstantiationException e5) {
                            throw new RuntimeException(U.a.k("Could not instantiate ", str4, "."), e5);
                        } catch (NoSuchMethodException e6) {
                            throw new RuntimeException(n0.a.k("Could not instantiate ", str4), e6);
                        } catch (InvocationTargetException e7) {
                            throw new RuntimeException(n0.a.k("Could not instantiate ", str4), e7);
                        }
                    default:
                        return (ComponentRegistrar) executorsRegistrar;
                }
            }
        });
        arrayList4.add(C1814a.b(context, Context.class, new Class[0]));
        arrayList4.add(C1814a.b(this, g.class, new Class[0]));
        arrayList4.add(C1814a.b(iVar, i.class, new Class[0]));
        C2033d c2033d = new C2033d(7);
        if ((Build.VERSION.SDK_INT >= 24 ? D.b.f(context) : true) && FirebaseInitProvider.f12548p.get()) {
            arrayList4.add(C1814a.b(c1653a, C1653a.class, new Class[0]));
        }
        C1819f c1819f = new C1819f(arrayList3, arrayList4, c2033d);
        this.d = c1819f;
        Trace.endSection();
        this.f12621g = new m(new C1655c(i4, this, context));
        this.f12622h = c1819f.e(C2032c.class);
        C1656d c1656d = new C1656d(this);
        a();
        if (this.f12619e.get()) {
            ComponentCallbacks2C1683c.f12980s.f12981o.get();
        }
        this.f12623i.add(c1656d);
        Trace.endSection();
    }

    public static g b() {
        g gVar;
        synchronized (f12615j) {
            try {
                gVar = (g) f12616k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC1799b.e() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C2032c) gVar.f12622h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g e(Context context) {
        synchronized (f12615j) {
            try {
                if (f12616k.containsKey("[DEFAULT]")) {
                    return b();
                }
                i a4 = i.a(context);
                if (a4 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [g2.b, java.lang.Object] */
    public static g f(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f12612a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f12612a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        ComponentCallbacks2C1683c.b(application);
                        ComponentCallbacks2C1683c.f12980s.a(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f12615j) {
            r.e eVar = f12616k;
            y.k("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            y.j(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            eVar.put("[DEFAULT]", gVar);
        }
        gVar.d();
        return gVar;
    }

    public final void a() {
        y.k("FirebaseApp was deleted", !this.f12620f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f12618b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.f12630b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!(Build.VERSION.SDK_INT >= 24 ? D.b.f(this.f12617a) : true)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f12618b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f12617a;
            AtomicReference atomicReference = f.f12613b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f12618b);
        Log.i("FirebaseApp", sb2.toString());
        C1819f c1819f = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f12618b);
        AtomicReference atomicReference2 = c1819f.f14126t;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (c1819f) {
                    hashMap = new HashMap(c1819f.f14121o);
                }
                c1819f.c(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((C2032c) this.f12622h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f12618b.equals(gVar.f12618b);
    }

    public final boolean g() {
        boolean z4;
        a();
        B3.a aVar = (B3.a) this.f12621g.get();
        synchronized (aVar) {
            z4 = aVar.f160a;
        }
        return z4;
    }

    public final int hashCode() {
        return this.f12618b.hashCode();
    }

    public final String toString() {
        Qw qw = new Qw(this);
        qw.s(this.f12618b, "name");
        qw.s(this.c, "options");
        return qw.toString();
    }
}
