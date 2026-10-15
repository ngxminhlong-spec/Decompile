package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500c1 {

    /* renamed from: h, reason: collision with root package name */
    public static final r.e f11892h = new r.i(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f11893i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f11894a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f11895b;
    public final Runnable c;
    public final K.a d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11896e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f11897f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f11898g;

    public C1500c1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        K.a aVar = new K.a(this);
        this.d = aVar;
        this.f11896e = new Object();
        this.f11898g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f11894a = contentResolver;
        this.f11895b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, aVar);
    }

    public static C1500c1 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C1500c1 c1500c1;
        synchronized (C1500c1.class) {
            r.e eVar = f11892h;
            c1500c1 = (C1500c1) eVar.get(uri);
            if (c1500c1 == null) {
                try {
                    C1500c1 c1500c12 = new C1500c1(contentResolver, uri, runnable);
                    try {
                        eVar.put(uri, c1500c12);
                    } catch (SecurityException unused) {
                    }
                    c1500c1 = c1500c12;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1500c1;
    }

    public static synchronized void c() {
        synchronized (C1500c1.class) {
            try {
                Iterator it = ((r.d) f11892h.values()).iterator();
                while (it.hasNext()) {
                    C1500c1 c1500c1 = (C1500c1) it.next();
                    c1500c1.f11894a.unregisterContentObserver(c1500c1.d);
                }
                f11892h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    public final Map b() {
        Map map;
        Map map2;
        Object b4;
        Map map3 = this.f11897f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f11896e) {
                ?? r02 = this.f11897f;
                map2 = r02;
                if (r02 == 0) {
                    try {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            C1599z1 c1599z1 = new C1599z1(2, this);
                            try {
                                b4 = c1599z1.b();
                            } catch (SecurityException unused) {
                                long clearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    b4 = c1599z1.b();
                                } finally {
                                    Binder.restoreCallingIdentity(clearCallingIdentity);
                                }
                            }
                            map = (Map) b4;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.f11897f = map;
                        map2 = map;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(r02);
                        throw th;
                    }
                }
            }
            map4 = map2;
        }
        return map4 != null ? map4 : Collections.EMPTY_MAP;
    }
}
