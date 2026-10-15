package N3;

import L3.i;
import W3.C0124c;
import W3.InterfaceC0145y;
import W3.Y;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b implements L3.d, c, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final L3.d f1231o;

    /* renamed from: p, reason: collision with root package name */
    public final i f1232p;

    /* renamed from: q, reason: collision with root package name */
    public transient L3.d f1233q;

    public b(L3.d dVar) {
        i context = dVar != null ? dVar.getContext() : null;
        this.f1231o = dVar;
        this.f1232p = context;
    }

    @Override // N3.c
    public final c b() {
        L3.d dVar = this.f1231o;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // L3.d
    public final void c(Object obj) {
        L3.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            L3.d dVar2 = bVar.f1231o;
            S3.e.b(dVar2);
            try {
                obj = bVar.f(obj);
                if (obj == M3.a.f1150o) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC1806a.h(th);
            }
            L3.d dVar3 = bVar.f1233q;
            if (dVar3 != null && dVar3 != bVar) {
                i iVar = bVar.f1232p;
                S3.e.b(iVar);
                L3.g b4 = iVar.b(L3.e.f1100o);
                S3.e.b(b4);
                Y3.g gVar = (Y3.g) dVar3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y3.g.f2228v;
                do {
                } while (atomicReferenceFieldUpdater.get(gVar) == Y3.a.c);
                Object obj2 = atomicReferenceFieldUpdater.get(gVar);
                C0124c c0124c = obj2 instanceof C0124c ? (C0124c) obj2 : null;
                if (c0124c != null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0124c.f2091v;
                    InterfaceC0145y interfaceC0145y = (InterfaceC0145y) atomicReferenceFieldUpdater2.get(c0124c);
                    if (interfaceC0145y != null) {
                        interfaceC0145y.b();
                        atomicReferenceFieldUpdater2.set(c0124c, Y.f2085a);
                    }
                }
            }
            bVar.f1233q = a.f1230o;
            if (!(dVar2 instanceof b)) {
                dVar2.c(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public L3.d e(L3.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object f(Object obj);

    @Override // L3.d
    public final i getContext() {
        i iVar = this.f1232p;
        S3.e.b(iVar);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() {
        int i4;
        String str;
        StringBuilder sb = new StringBuilder("Continuation at ");
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar != null) {
            int v4 = dVar.v();
            if (v4 > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v4 + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i4 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i4 = -1;
            }
            int i5 = i4 >= 0 ? dVar.l()[i4] : -1;
            e eVar = f.f1237b;
            e eVar2 = f.f1236a;
            if (eVar == null) {
                try {
                    e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f1237b = eVar3;
                    eVar = eVar3;
                } catch (Exception unused2) {
                    f.f1237b = eVar2;
                    eVar = eVar2;
                }
            }
            if (eVar != eVar2) {
                Method method = eVar.f1234a;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = eVar.f1235b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = eVar.c;
                        String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = dVar.c();
            } else {
                str = str2 + '/' + dVar.c();
            }
            str2 = new StackTraceElement(str, dVar.m(), dVar.f(), i5);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }
}
