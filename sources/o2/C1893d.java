package o2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.C0887m;
import com.google.android.gms.internal.ads.R2;
import h2.y;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l2.AbstractC1799b;
import n0.n;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1893d {

    /* renamed from: b, reason: collision with root package name */
    public static final V2.e f14315b;
    public static final C2033d c;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f14316e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f14317f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f14318g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f14319h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f14320i;

    /* renamed from: m, reason: collision with root package name */
    public static C1898i f14324m;

    /* renamed from: n, reason: collision with root package name */
    public static C1899j f14325n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14326a;

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f14321j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final R2 f14322k = new R2(7);

    /* renamed from: l, reason: collision with root package name */
    public static final C2033d f14323l = new C2033d(23);
    public static final V2.e d = new V2.e(25);

    static {
        int i4 = 24;
        f14315b = new V2.e(i4);
        c = new C2033d(i4);
    }

    public C1893d(Context context) {
        this.f14326a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (y.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, o2.h] */
    public static C1893d c(Context context, InterfaceC1892c interfaceC1892c, String str) {
        long j4;
        C0887m h4;
        C1893d c1893d;
        Boolean bool;
        InterfaceC1812a W22;
        C1893d c1893d2;
        C1899j c1899j;
        boolean z4;
        InterfaceC1812a W23;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new Exception("null application Context");
        }
        ThreadLocal threadLocal = f14321j;
        C1897h c1897h = (C1897h) threadLocal.get();
        ?? obj = new Object();
        threadLocal.set(obj);
        R2 r22 = f14322k;
        Long l4 = (Long) r22.get();
        long longValue = l4.longValue();
        try {
            r22.set(Long.valueOf(SystemClock.elapsedRealtime()));
            h4 = interfaceC1892c.h(context, str, f14323l);
            j4 = longValue;
        } catch (Throwable th) {
            th = th;
            j4 = longValue;
        }
        try {
            Log.i("DynamiteModule", "Considering local module " + str + ":" + h4.f9512a + " and remote module " + str + ":" + h4.f9513b);
            int i4 = h4.c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (h4.f9512a != 0) {
                        i4 = -1;
                    }
                }
                if (i4 != 1 || h4.f9513b != 0) {
                    if (i4 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        c1893d = new C1893d(applicationContext);
                    } else {
                        if (i4 != 1) {
                            throw new Exception("VersionPolicy returned invalid code:" + i4);
                        }
                        try {
                            int i5 = h4.f9513b;
                            try {
                                synchronized (C1893d.class) {
                                    if (!g(context)) {
                                        throw new Exception("Remote loading disabled");
                                    }
                                    bool = f14316e;
                                }
                                if (bool == null) {
                                    throw new Exception("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                    synchronized (C1893d.class) {
                                        c1899j = f14325n;
                                    }
                                    if (c1899j == null) {
                                        throw new Exception("DynamiteLoaderV2 was not cached.");
                                    }
                                    C1897h c1897h2 = (C1897h) threadLocal.get();
                                    if (c1897h2 == null || c1897h2.f14336a == null) {
                                        throw new Exception("No result cursor");
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor = c1897h2.f14336a;
                                    new BinderC1813b(null);
                                    synchronized (C1893d.class) {
                                        z4 = f14319h >= 2;
                                    }
                                    if (z4) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        W23 = c1899j.y3(new BinderC1813b(applicationContext2), str, i5, new BinderC1813b(cursor));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        W23 = c1899j.W2(new BinderC1813b(applicationContext2), str, i5, new BinderC1813b(cursor));
                                    }
                                    Context context2 = (Context) BinderC1813b.C2(W23);
                                    if (context2 == null) {
                                        throw new Exception("Failed to get module context");
                                    }
                                    c1893d2 = new C1893d(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                    C1898i h5 = h(context);
                                    if (h5 == null) {
                                        throw new Exception("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel O4 = h5.O(h5.Q(), 6);
                                    int readInt = O4.readInt();
                                    O4.recycle();
                                    if (readInt >= 3) {
                                        C1897h c1897h3 = (C1897h) threadLocal.get();
                                        if (c1897h3 == null) {
                                            throw new Exception("No cached result cursor holder");
                                        }
                                        W22 = h5.y3(new BinderC1813b(context), str, i5, new BinderC1813b(c1897h3.f14336a));
                                    } else if (readInt == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        W22 = h5.J3(new BinderC1813b(context), str, i5);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        W22 = h5.W2(new BinderC1813b(context), str, i5);
                                    }
                                    Object C22 = BinderC1813b.C2(W22);
                                    if (C22 == null) {
                                        throw new Exception("Failed to load remote module.");
                                    }
                                    c1893d2 = new C1893d((Context) C22);
                                }
                                c1893d = c1893d2;
                            } catch (RemoteException e4) {
                                throw new Exception("Failed to load remote module.", e4);
                            } catch (C1890a e5) {
                                throw e5;
                            } catch (Throwable th2) {
                                AbstractC1799b.a(context, th2);
                                throw new Exception("Failed to load remote module.", th2);
                            }
                        } catch (C1890a e6) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e6.getMessage());
                            int i6 = h4.f9512a;
                            if (i6 == 0 || interfaceC1892c.h(context, str, new n(i6, 12)).c != -1) {
                                throw new Exception("Remote load failed. No local fallback found.", e6);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            c1893d = new C1893d(applicationContext);
                        }
                    }
                    if (j4 == 0) {
                        f14322k.remove();
                    } else {
                        f14322k.set(l4);
                    }
                    Cursor cursor2 = obj.f14336a;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    f14321j.set(c1897h);
                    return c1893d;
                }
            }
            throw new Exception("No acceptable module " + str + " found. Local version is " + h4.f9512a + " and remote version is " + h4.f9513b + ".");
        } catch (Throwable th3) {
            th = th3;
            if (j4 == 0) {
                f14322k.remove();
            } else {
                f14322k.set(l4);
            }
            Cursor cursor3 = obj.f14336a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f14321j.set(c1897h);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x018b, code lost:
    
        if (r2 != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.C1893d.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(Context context, String str, boolean z4, boolean z5) {
        Throwable th;
        Exception exc;
        boolean z6;
        try {
            try {
                boolean z7 = true;
                Cursor query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f14322k.get()).longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z8 = false;
                            int i4 = query.getInt(0);
                            if (i4 > 0) {
                                synchronized (C1893d.class) {
                                    try {
                                        f14317f = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f14319h = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z6 = query.getInt(columnIndex2) != 0;
                                            f14318g = z6;
                                        } else {
                                            z6 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                C1897h c1897h = (C1897h) f14321j.get();
                                if (c1897h == null || c1897h.f14336a != null) {
                                    z7 = false;
                                } else {
                                    c1897h.f14336a = query;
                                }
                                r1 = z7 ? null : query;
                                z8 = z6;
                            } else {
                                r1 = query;
                            }
                            if (z5 && z8) {
                                throw new Exception("forcing fallback to container DynamiteLoader impl");
                            }
                            if (r1 != null) {
                                r1.close();
                            }
                            return i4;
                        }
                    } catch (Exception e4) {
                        exc = e4;
                        if (exc instanceof C1890a) {
                            throw exc;
                        }
                        throw new Exception("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th3) {
                        r1 = query;
                        th = th3;
                        if (r1 == null) {
                            throw th;
                        }
                        r1.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new Exception("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e5) {
                exc = e5;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.r4] */
    public static void f(ClassLoader classLoader) {
        try {
            C1899j c1899j = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c1899j = queryLocalInterface instanceof C1899j ? (C1899j) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 3);
            }
            f14325n = c1899j;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e4) {
            throw new Exception("Failed to instantiate dynamite loader", e4);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f14320i)) {
            return true;
        }
        boolean z4 = false;
        if (f14320i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (e2.f.f12753b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z4 = true;
            }
            f14320i = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f14318g = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1898i h(Context context) {
        C1898i c1898i;
        synchronized (C1893d.class) {
            C1898i c1898i2 = f14324m;
            if (c1898i2 != null) {
                return c1898i2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1898i = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c1898i = queryLocalInterface instanceof C1898i ? (C1898i) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 3);
                }
                if (c1898i != 0) {
                    f14324m = c1898i;
                    return c1898i;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f14326a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e4);
        }
    }
}
