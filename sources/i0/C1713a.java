package i0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713a {
    public static volatile C1713a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f13252e = new Object();
    public final Context c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f13254b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13253a = new HashMap();

    public C1713a(Context context) {
        this.c = context.getApplicationContext();
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f13254b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1714b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        HashMap hashMap = this.f13253a;
        if (AbstractC1806a.D()) {
            try {
                AbstractC1806a.f(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1714b interfaceC1714b = (InterfaceC1714b) cls.getDeclaredConstructor(null).newInstance(null);
                interfaceC1714b.a();
                List<Class> list = Collections.EMPTY_LIST;
                if (!list.isEmpty()) {
                    for (Class cls2 : list) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b4 = interfaceC1714b.b(this.c);
                hashSet.remove(cls);
                hashMap.put(cls, b4);
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        Trace.endSection();
    }
}
