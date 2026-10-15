package r;

import com.google.android.gms.internal.ads.C0496ct;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends i implements Map {

    /* renamed from: r, reason: collision with root package name */
    public C0496ct f14727r;

    /* renamed from: s, reason: collision with root package name */
    public C1965b f14728s;

    /* renamed from: t, reason: collision with root package name */
    public d f14729t;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0496ct c0496ct = this.f14727r;
        if (c0496ct != null) {
            return c0496ct;
        }
        C0496ct c0496ct2 = new C0496ct(2, this);
        this.f14727r = c0496ct2;
        return c0496ct2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i4 = this.f14741q;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i4 != this.f14741q;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1965b c1965b = this.f14728s;
        if (c1965b != null) {
            return c1965b;
        }
        C1965b c1965b2 = new C1965b(this);
        this.f14728s = c1965b2;
        return c1965b2;
    }

    public final boolean l(Collection collection) {
        int i4 = this.f14741q;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (!collection.contains(f(i5))) {
                g(i5);
            }
        }
        return i4 != this.f14741q;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f14741q);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f14729t;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f14729t = dVar2;
        return dVar2;
    }
}
