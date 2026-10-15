package androidx.savedstate;

import Q1.H;
import S3.e;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import f0.C1673a;
import f0.c;
import f0.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n0.a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Recreator implements h {

    /* renamed from: o, reason: collision with root package name */
    public final Object f3118o;

    public Recreator(d dVar) {
        this.f3118o = dVar;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, f0.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, f0.d, androidx.lifecycle.i] */
    @Override // androidx.lifecycle.h
    public final void a(i iVar, f fVar) {
        Bundle bundle;
        Object obj;
        boolean z4;
        if (fVar != f.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        iVar.f().f(this);
        H a4 = this.f3118o.a();
        a4.getClass();
        if (!a4.f1634b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle2 = (Bundle) a4.f1635e;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("androidx.savedstate.Restarter");
            Bundle bundle3 = (Bundle) a4.f1635e;
            if (bundle3 != null) {
                bundle3.remove("androidx.savedstate.Restarter");
            }
            Bundle bundle4 = (Bundle) a4.f1635e;
            if (bundle4 == null || bundle4.isEmpty()) {
                a4.f1635e = null;
            }
        } else {
            bundle = null;
        }
        if (bundle == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i4 = 0;
        while (i4 < size) {
            String str = stringArrayList.get(i4);
            i4++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(c.class);
                e.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        e.d(newInstance, "{\n                constr…wInstance()\n            }");
                        ?? r32 = this.f3118o;
                        v e4 = ((w) r32).e();
                        H a5 = r32.a();
                        e4.getClass();
                        Iterator it = new HashSet(e4.f2994a.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            e.e(str3, "key");
                            s sVar = (s) e4.f2994a.get(str3);
                            e.b(sVar);
                            k f4 = r32.f();
                            e.e(a5, "registry");
                            e.e(f4, "lifecycle");
                            HashMap hashMap = sVar.f2991a;
                            if (hashMap == null) {
                                obj = null;
                            } else {
                                synchronized (hashMap) {
                                    obj = sVar.f2991a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z4 = savedStateHandleController.f2965o)) {
                                if (z4) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f2965o = true;
                                f4.a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(e4.f2994a.keySet()).isEmpty()) {
                            if (!a5.c) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C1673a c1673a = (C1673a) a5.f1636f;
                            if (c1673a == null) {
                                c1673a = new C1673a(a5);
                            }
                            a5.f1636f = c1673a;
                            try {
                                androidx.lifecycle.c.class.getDeclaredConstructor(null);
                                C1673a c1673a2 = (C1673a) a5.f1636f;
                                if (c1673a2 != null) {
                                    c1673a2.f12953a.add(androidx.lifecycle.c.class.getName());
                                }
                            } catch (NoSuchMethodException e5) {
                                throw new IllegalArgumentException("Class " + androidx.lifecycle.c.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                            }
                        }
                    } catch (Exception e6) {
                        throw new RuntimeException(a.k("Failed to instantiate ", str2), e6);
                    }
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                }
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(U.a.k("Class ", str2, " wasn't found"), e8);
            }
        }
    }
}
