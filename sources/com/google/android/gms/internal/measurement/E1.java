package com.google.android.gms.internal.measurement;

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
public abstract class E1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f11726a = Logger.getLogger(C1595y1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final String f11727b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static A1 a() {
        String str;
        ClassLoader classLoader = E1.class.getClassLoader();
        if (A1.class.equals(A1.class)) {
            str = f11727b;
        } else {
            if (!A1.class.getPackage().equals(E1.class.getPackage())) {
                throw new IllegalArgumentException(A1.class.getName());
            }
            str = A1.class.getPackage().getName() + ".BlazeGenerated" + A1.class.getSimpleName() + "Loader";
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
                Iterator it = Arrays.asList(new E1[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() != null) {
                            throw new ClassCastException();
                            break;
                        }
                        throw null;
                    } catch (ServiceConfigurationError e8) {
                        f11726a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(A1.class.getSimpleName()), (Throwable) e8);
                    }
                }
                if (arrayList.size() == 1) {
                    return (A1) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (A1) A1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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
