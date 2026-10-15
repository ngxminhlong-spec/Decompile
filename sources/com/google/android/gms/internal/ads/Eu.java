package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Eu extends AbstractC1439yu {

    /* renamed from: D, reason: collision with root package name */
    public List f4957D;

    public Eu(AbstractC1137rt abstractC1137rt, boolean z4) {
        super(abstractC1137rt, z4, true);
        List arrayList;
        if (abstractC1137rt.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = abstractC1137rt.size();
            Bs.n("initialArraySize", size);
            arrayList = new ArrayList(size);
        }
        for (int i4 = 0; i4 < abstractC1137rt.size(); i4++) {
            arrayList.add(null);
        }
        this.f4957D = arrayList;
        v();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1439yu
    public final void t(int i4, Object obj) {
        List list = this.f4957D;
        if (list != null) {
            list.set(i4, new Fu(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1439yu
    public final void u() {
        List<Fu> list = this.f4957D;
        if (list != null) {
            int size = list.size();
            Bs.n("initialArraySize", size);
            ArrayList arrayList = new ArrayList(size);
            for (Fu fu : list) {
                arrayList.add(fu != null ? fu.f5101a : null);
            }
            f(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1439yu
    public final void w(int i4) {
        this.f11549z = null;
        this.f4957D = null;
    }
}
