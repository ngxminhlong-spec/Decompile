package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U1 extends W1 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.measurement.W1
    public final void a(long j4, Object obj) {
        Object unmodifiableList;
        List list = (List) AbstractC1584v2.c.m(j4, obj);
        if (list instanceof T1) {
            unmodifiableList = ((T1) list).a();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1531i2) && (list instanceof N1)) {
                AbstractC1575t1 abstractC1575t1 = (AbstractC1575t1) ((N1) list);
                if (abstractC1575t1.f12028o) {
                    abstractC1575t1.f12028o = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1584v2.h(j4, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.W1
    public final void b(long j4, Object obj, Object obj2) {
        S1 s12;
        AbstractC1580u2 abstractC1580u2 = AbstractC1584v2.c;
        List list = (List) abstractC1580u2.m(j4, obj2);
        int size = list.size();
        List list2 = (List) abstractC1580u2.m(j4, obj);
        if (list2.isEmpty()) {
            list2 = list2 instanceof T1 ? new S1(size) : ((list2 instanceof InterfaceC1531i2) && (list2 instanceof N1)) ? ((N1) list2).c(size) : new ArrayList(size);
            AbstractC1584v2.h(j4, obj, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC1584v2.h(j4, obj, arrayList);
                s12 = arrayList;
            } else if (list2 instanceof C1568r2) {
                S1 s13 = new S1(list2.size() + size);
                s13.addAll(s13.f11822p.size(), (C1568r2) list2);
                AbstractC1584v2.h(j4, obj, s13);
                s12 = s13;
            } else if ((list2 instanceof InterfaceC1531i2) && (list2 instanceof N1)) {
                N1 n12 = (N1) list2;
                if (!((AbstractC1575t1) n12).f12028o) {
                    list2 = n12.c(list2.size() + size);
                    AbstractC1584v2.h(j4, obj, list2);
                }
            }
            list2 = s12;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC1584v2.h(j4, obj, list);
    }
}
