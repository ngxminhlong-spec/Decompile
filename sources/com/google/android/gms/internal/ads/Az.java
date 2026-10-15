package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Az {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4012a = Logger.getLogger(AbstractC1229tz.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final String f4013b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static C1315vz a() {
        String str;
        ClassLoader classLoader = Az.class.getClassLoader();
        if (C1315vz.class.equals(C1315vz.class)) {
            str = f4013b;
        } else {
            if (!C1315vz.class.getPackage().equals(Az.class.getPackage())) {
                throw new IllegalArgumentException(C1315vz.class.getName());
            }
            str = C1315vz.class.getPackage().getName() + ".BlazeGenerated" + C1315vz.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    U.a.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e4) {
                    throw new IllegalStateException(e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(e5);
                }
            } catch (InstantiationException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new Az[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() != null) {
                            throw new ClassCastException();
                            break;
                        }
                        throw null;
                    } catch (ServiceConfigurationError e8) {
                        f4012a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C1315vz.class.getSimpleName()), (Throwable) e8);
                    }
                }
                if (arrayList.size() == 1) {
                    return (C1315vz) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (C1315vz) C1315vz.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(e9);
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
