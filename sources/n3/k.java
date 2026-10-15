package n3;

import d3.AbstractC1654b;
import f3.C1676b;
import f3.ExecutorC1677c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import u3.InterfaceC2015a;
import u3.InterfaceC2016b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements InterfaceC2016b, InterfaceC2015a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14134a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f14135b;

    public k() {
        o3.l lVar = o3.l.f14370o;
        this.f14134a = new HashMap();
        this.f14135b = new ArrayDeque();
    }

    public final synchronized void a() {
        ExecutorC1677c executorC1677c = ExecutorC1677c.f12976o;
        C1676b c1676b = C1676b.f12975b;
        synchronized (this) {
            try {
                if (!this.f14134a.containsKey(AbstractC1654b.class)) {
                    this.f14134a.put(AbstractC1654b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f14134a.get(AbstractC1654b.class)).put(c1676b, executorC1677c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
