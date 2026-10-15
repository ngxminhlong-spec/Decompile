package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1311vv {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f11094a;

    static {
        Logger.getLogger(AbstractC1311vv.class.getName());
        f11094a = new AtomicReference(new C1226tw());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC0583ev.class);
        hashSet.add(InterfaceC0626fv.class);
        hashSet.add(InterfaceC1354wv.class);
        hashSet.add(InterfaceC0712hv.class);
        hashSet.add(InterfaceC0669gv.class);
        hashSet.add(InterfaceC1011ov.class);
        hashSet.add(InterfaceC1313vx.class);
        hashSet.add(InterfaceC1225tv.class);
        hashSet.add(InterfaceC1268uv.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static Object a(String str, AbstractC0886lz abstractC0886lz, Class cls) {
        AbstractC1441yw abstractC1441yw = ((C1226tw) f11094a.get()).b(str).f10653a;
        Map map = abstractC1441yw.f11551b;
        if (!map.keySet().contains(cls)) {
            String name = cls.getName();
            String valueOf = String.valueOf(abstractC1441yw.getClass());
            Set<Class> keySet = map.keySet();
            StringBuilder sb = new StringBuilder();
            boolean z4 = true;
            for (Class cls2 : keySet) {
                if (!z4) {
                    sb.append(", ");
                }
                sb.append(cls2.getCanonicalName());
                z4 = false;
            }
            String sb2 = sb.toString();
            StringBuilder n4 = U.a.n("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
            n4.append(sb2);
            throw new GeneralSecurityException(n4.toString());
        }
        try {
            if (!map.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1441yw.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                AbstractC0417az c = abstractC1441yw.c(abstractC0886lz);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                abstractC1441yw.e(c);
                return abstractC1441yw.g(c, cls);
            } catch (Oz e4) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(abstractC1441yw.f11550a.getName()), e4);
            }
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    public static synchronized void b(AbstractC1441yw abstractC1441yw) {
        synchronized (AbstractC1311vv.class) {
            AtomicReference atomicReference = f11094a;
            C1226tw c1226tw = new C1226tw((C1226tw) atomicReference.get());
            c1226tw.a(abstractC1441yw);
            atomicReference.set(c1226tw);
        }
    }

    public static synchronized void c(InterfaceC1182sv interfaceC1182sv) {
        synchronized (AbstractC1311vv.class) {
            Hw.f5518b.d(interfaceC1182sv);
        }
    }
}
