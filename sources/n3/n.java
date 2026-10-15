package n3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n implements InterfaceC2053a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f14138a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f14139b;

    public final synchronized void a() {
        try {
            Iterator it = this.f14138a.iterator();
            while (it.hasNext()) {
                this.f14139b.add(((InterfaceC2053a) it.next()).get());
            }
            this.f14138a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // w3.InterfaceC2053a
    public final Object get() {
        if (this.f14139b == null) {
            synchronized (this) {
                try {
                    if (this.f14139b == null) {
                        this.f14139b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f14139b);
    }
}
