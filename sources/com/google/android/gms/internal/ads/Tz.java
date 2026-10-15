package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tz extends Vz {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j4, Object obj, int i4) {
        List list = (List) BA.j(j4, obj);
        if (list.isEmpty()) {
            List rz = list instanceof Sz ? new Rz(i4) : ((list instanceof InterfaceC0685hA) && (list instanceof Lz)) ? ((Lz) list).c(i4) : new ArrayList(i4);
            BA.o(j4, obj, rz);
            return rz;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i4);
            arrayList.addAll(list);
            BA.o(j4, obj, arrayList);
            return arrayList;
        }
        if (list instanceof C1327wA) {
            Rz rz2 = new Rz(list.size() + i4);
            rz2.addAll(rz2.f6872p.size(), (C1327wA) list);
            BA.o(j4, obj, rz2);
            return rz2;
        }
        if ((list instanceof InterfaceC0685hA) && (list instanceof Lz)) {
            Lz lz = (Lz) list;
            if (!((AbstractC0459bz) lz).f8310o) {
                Lz c2 = lz.c(list.size() + i4);
                BA.o(j4, obj, c2);
                return c2;
            }
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final List a(long j4, Object obj) {
        return d(j4, obj, 10);
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final void b(long j4, Object obj) {
        Object unmodifiableList;
        List list = (List) BA.j(j4, obj);
        if (list instanceof Sz) {
            unmodifiableList = ((Sz) list).a();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0685hA) && (list instanceof Lz)) {
                AbstractC0459bz abstractC0459bz = (AbstractC0459bz) ((Lz) list);
                boolean z4 = abstractC0459bz.f8310o;
                if (z4 && z4) {
                    abstractC0459bz.f8310o = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        BA.o(j4, obj, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final void c(long j4, Object obj, Object obj2) {
        List list = (List) BA.j(j4, obj2);
        List d = d(j4, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        BA.o(j4, obj, list);
    }
}
