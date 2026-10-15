package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class DB implements InterfaceC1457zB {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4594b;

    static {
        AB.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ DB(List list, List list2) {
        this.f4593a = list;
        this.f4594b = list2;
    }

    public static Wl a(int i4, int i5) {
        return new Wl(i4, i5);
    }

    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set c() {
        List list = this.f4593a;
        int size = list.size();
        List list2 = this.f4594b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Collection collection = (Collection) ((FB) list2.get(i4)).c();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Object c2 = ((FB) list.get(i5)).c();
            c2.getClass();
            hashSet.add(c2);
        }
        int size4 = arrayList.size();
        for (int i6 = 0; i6 < size4; i6++) {
            for (Object obj : (Collection) arrayList.get(i6)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
