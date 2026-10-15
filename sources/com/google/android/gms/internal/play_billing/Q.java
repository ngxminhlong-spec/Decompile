package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q extends T {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.play_billing.T
    public final void a(long j4, Object obj) {
        Object unmodifiableList;
        List list = (List) AbstractC1645w0.h(j4, obj);
        if (list instanceof P) {
            unmodifiableList = ((P) list).a();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1614g0) && (list instanceof J)) {
                AbstractC1631p abstractC1631p = (AbstractC1631p) ((J) list);
                boolean z4 = abstractC1631p.f12238o;
                if (z4 && z4) {
                    abstractC1631p.f12238o = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1645w0.l(j4, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.T
    public final void b(long j4, Object obj, Object obj2) {
        O o4;
        List list = (List) AbstractC1645w0.h(j4, obj2);
        int size = list.size();
        List list2 = (List) AbstractC1645w0.h(j4, obj);
        if (list2.isEmpty()) {
            list2 = list2 instanceof P ? new O(size) : ((list2 instanceof InterfaceC1614g0) && (list2 instanceof J)) ? ((J) list2).c(size) : new ArrayList(size);
            AbstractC1645w0.l(j4, obj, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC1645w0.l(j4, obj, arrayList);
                o4 = arrayList;
            } else if (list2 instanceof C1635r0) {
                O o5 = new O(list2.size() + size);
                o5.addAll(o5.f12164p.size(), (C1635r0) list2);
                AbstractC1645w0.l(j4, obj, o5);
                o4 = o5;
            } else if ((list2 instanceof InterfaceC1614g0) && (list2 instanceof J)) {
                J j5 = (J) list2;
                if (!((AbstractC1631p) j5).f12238o) {
                    list2 = j5.c(list2.size() + size);
                    AbstractC1645w0.l(j4, obj, list2);
                }
            }
            list2 = o4;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC1645w0.l(j4, obj, list);
    }
}
