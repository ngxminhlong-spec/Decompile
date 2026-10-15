package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496ct extends AbstractSet {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8426o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Map f8427p;

    public /* synthetic */ C0496ct(int i4, Map map) {
        this.f8426o = i4;
        this.f8427p = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f8426o) {
            case 0:
                ((C0624ft) this.f8427p).clear();
                return;
            case 1:
                ((C0624ft) this.f8427p).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f8426o) {
            case 0:
                C0624ft c0624ft = (C0624ft) this.f8427p;
                Map a4 = c0624ft.a();
                if (a4 != null) {
                    return a4.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e4 = c0624ft.e(entry.getKey());
                    if (e4 != -1) {
                        Object[] objArr = c0624ft.f8756r;
                        objArr.getClass();
                        if (Bs.r(objArr[e4], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                return ((C0624ft) this.f8427p).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8426o) {
            case 0:
                C0624ft c0624ft = (C0624ft) this.f8427p;
                Map a4 = c0624ft.a();
                return a4 != null ? a4.entrySet().iterator() : new C0454bt(c0624ft, 1);
            case 1:
                C0624ft c0624ft2 = (C0624ft) this.f8427p;
                Map a5 = c0624ft2.a();
                return a5 != null ? a5.keySet().iterator() : new C0454bt(c0624ft2, 0);
            default:
                return new r.c((r.e) this.f8427p);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f8426o) {
            case 0:
                C0624ft c0624ft = (C0624ft) this.f8427p;
                Map a4 = c0624ft.a();
                if (a4 != null) {
                    return a4.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0624ft.c()) {
                        int d = c0624ft.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0624ft.f8753o;
                        obj2.getClass();
                        int[] iArr = c0624ft.f8754p;
                        iArr.getClass();
                        Object[] objArr = c0624ft.f8755q;
                        objArr.getClass();
                        Object[] objArr2 = c0624ft.f8756r;
                        objArr2.getClass();
                        int w2 = Bs.w(key, value, d, obj2, iArr, objArr, objArr2);
                        if (w2 != -1) {
                            c0624ft.b(w2, d);
                            c0624ft.f8758t--;
                            c0624ft.f8757s += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                C0624ft c0624ft2 = (C0624ft) this.f8427p;
                Map a5 = c0624ft2.a();
                return a5 != null ? a5.keySet().remove(obj) : c0624ft2.h(obj) != C0624ft.f8752x;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f8426o) {
            case 0:
                return ((C0624ft) this.f8427p).size();
            case 1:
                return ((C0624ft) this.f8427p).size();
            default:
                return ((r.e) this.f8427p).f14741q;
        }
    }
}
