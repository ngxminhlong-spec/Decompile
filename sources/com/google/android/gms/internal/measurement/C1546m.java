package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0831kn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546m extends AbstractC1523h {

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f11967q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f11968r;

    /* renamed from: s, reason: collision with root package name */
    public final u0.g f11969s;

    public C1546m(C1546m c1546m) {
        super(c1546m.f11938o);
        ArrayList arrayList = new ArrayList(c1546m.f11967q.size());
        this.f11967q = arrayList;
        arrayList.addAll(c1546m.f11967q);
        ArrayList arrayList2 = new ArrayList(c1546m.f11968r.size());
        this.f11968r = arrayList2;
        arrayList2.addAll(c1546m.f11968r);
        this.f11969s = c1546m.f11969s;
    }

    public C1546m(String str, ArrayList arrayList, List list, u0.g gVar) {
        super(str);
        this.f11967q = new ArrayList();
        this.f11969s = gVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.f11967q.add(((InterfaceC1550n) obj).g());
            }
        }
        this.f11968r = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1523h
    public final InterfaceC1550n a(u0.g gVar, List list) {
        r rVar;
        u0.g k3 = this.f11969s.k();
        C0831kn c0831kn = (C0831kn) k3.f14984q;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f11967q;
            int size = arrayList.size();
            rVar = InterfaceC1550n.f11977e;
            if (i5 >= size) {
                break;
            }
            if (i5 < list.size()) {
                k3.H((String) arrayList.get(i5), ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(i5)));
            } else {
                k3.H((String) arrayList.get(i5), rVar);
            }
            i5++;
        }
        ArrayList arrayList2 = this.f11968r;
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj = arrayList2.get(i4);
            i4++;
            InterfaceC1550n interfaceC1550n = (InterfaceC1550n) obj;
            InterfaceC1550n x4 = c0831kn.x(k3, interfaceC1550n);
            if (x4 instanceof C1554o) {
                x4 = c0831kn.x(k3, interfaceC1550n);
            }
            if (x4 instanceof C1513f) {
                return ((C1513f) x4).f11929o;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1523h, com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        return new C1546m(this);
    }
}
