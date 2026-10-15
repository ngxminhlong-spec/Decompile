package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1540k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r.e f11958a = new r.i(0);

    public static void a() {
        UserManager userManager = AbstractC1490a1.f11875a;
        if (Build.VERSION.SDK_INT >= 24) {
            throw null;
        }
        synchronized (AbstractC1540k1.class) {
            try {
                if (f11958a.get(null) != null) {
                    throw new ClassCastException();
                }
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void b() {
        synchronized (AbstractC1540k1.class) {
            r.e eVar = f11958a;
            Iterator it = ((r.d) eVar.values()).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            eVar.clear();
        }
    }
}
