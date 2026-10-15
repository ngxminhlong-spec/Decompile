package e1;

import java.util.ArrayList;
import java.util.Collection;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1660a extends ArrayList {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1995b f12674o;

    public C1660a(C1995b c1995b) {
        this.f12674o = c1995b;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        super.add(i4, (j1.c) obj);
        C1995b.c(this.f12674o);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (!super.add((j1.c) obj)) {
            return false;
        }
        C1995b.c(this.f12674o);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (!super.addAll(i4, collection)) {
            return false;
        }
        C1995b.c(this.f12674o);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (!super.addAll(collection)) {
            return false;
        }
        C1995b.c(this.f12674o);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        super.clear();
        C1995b.c(this.f12674o);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        j1.c cVar = (j1.c) super.remove(i4);
        C1995b.c(this.f12674o);
        return cVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        if (!super.remove(obj)) {
            return false;
        }
        C1995b.c(this.f12674o);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (!super.removeAll(collection)) {
            return false;
        }
        C1995b.c(this.f12674o);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        super.removeRange(i4, i5);
        C1995b.c(this.f12674o);
    }
}
