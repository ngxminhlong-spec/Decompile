package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950nd implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f9741o = new ArrayList();

    public final boolean g(InterfaceC0308Md interfaceC0308Md) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f9741o;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            C0864ld c0864ld = (C0864ld) obj;
            if (c0864ld.f9436b == interfaceC0308Md) {
                arrayList.add(c0864ld);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ((C0864ld) obj2).c.l();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9741o.iterator();
    }
}
