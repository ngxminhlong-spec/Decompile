package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hw {

    /* renamed from: b, reason: collision with root package name */
    public static final Hw f5518b = new Hw();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5519a = new AtomicReference(new Sw(new Qw()));

    public final Class a() {
        HashMap hashMap = ((Sw) this.f5519a.get()).f7024b;
        if (hashMap.containsKey(InterfaceC0583ev.class)) {
            return ((InterfaceC1182sv) hashMap.get(InterfaceC0583ev.class)).b();
        }
        throw new GeneralSecurityException(U.a.k("No input primitive class for ", InterfaceC0583ev.class.toString(), " available"));
    }

    public final Object b(Bs bs, Class cls) {
        Sw sw = (Sw) this.f5519a.get();
        sw.getClass();
        Rw rw = new Rw(bs.getClass(), cls);
        HashMap hashMap = sw.f7023a;
        if (hashMap.containsKey(rw)) {
            return ((Ow) hashMap.get(rw)).c.a(bs);
        }
        throw new GeneralSecurityException(U.a.k("No PrimitiveConstructor for ", rw.toString(), " available"));
    }

    public final synchronized void c(Ow ow) {
        Qw qw = new Qw((Sw) this.f5519a.get());
        qw.x(ow);
        this.f5519a.set(new Sw(qw));
    }

    public final synchronized void d(InterfaceC1182sv interfaceC1182sv) {
        Qw qw = new Qw((Sw) this.f5519a.get());
        HashMap hashMap = (HashMap) qw.f6711q;
        Class c = interfaceC1182sv.c();
        if (hashMap.containsKey(c)) {
            InterfaceC1182sv interfaceC1182sv2 = (InterfaceC1182sv) hashMap.get(c);
            if (!interfaceC1182sv2.equals(interfaceC1182sv) || !interfaceC1182sv.equals(interfaceC1182sv2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(c.toString()));
            }
        } else {
            hashMap.put(c, interfaceC1182sv);
        }
        this.f5519a.set(new Sw(qw));
    }
}
