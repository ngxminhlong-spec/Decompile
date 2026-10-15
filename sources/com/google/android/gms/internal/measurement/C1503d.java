package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0898mA;
import com.google.android.gms.internal.ads.C1199tB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503d implements Iterable, InterfaceC1550n, InterfaceC1533j {

    /* renamed from: o, reason: collision with root package name */
    public final TreeMap f11901o;

    /* renamed from: p, reason: collision with root package name */
    public final TreeMap f11902p;

    public C1503d() {
        this.f11901o = new TreeMap();
        this.f11902p = new TreeMap();
    }

    public C1503d(List list) {
        this();
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                u(i4, (InterfaceC1550n) list.get(i4));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final boolean K(String str) {
        return "length".equals(str) || this.f11902p.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1503d)) {
            return false;
        }
        C1503d c1503d = (C1503d) obj;
        if (o() != c1503d.o()) {
            return false;
        }
        TreeMap treeMap = this.f11901o;
        if (treeMap.isEmpty()) {
            return c1503d.f11901o.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!p(intValue).equals(c1503d.p(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        TreeMap treeMap = this.f11901o;
        return treeMap.size() == 1 ? p(0).f() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        return q(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f11901o.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        C1503d c1503d = new C1503d();
        for (Map.Entry entry : this.f11901o.entrySet()) {
            boolean z4 = entry.getValue() instanceof InterfaceC1533j;
            TreeMap treeMap = c1503d.f11901o;
            if (z4) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC1550n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC1550n) entry.getValue()).i());
            }
        }
        return c1503d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1199tB(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final InterfaceC1550n j(String str) {
        InterfaceC1550n interfaceC1550n;
        return "length".equals(str) ? new C1518g(Double.valueOf(o())) : (!K(str) || (interfaceC1550n = (InterfaceC1550n) this.f11902p.get(str)) == null) ? InterfaceC1550n.f11977e : interfaceC1550n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final void k(String str, InterfaceC1550n interfaceC1550n) {
        TreeMap treeMap = this.f11902p;
        if (interfaceC1550n == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC1550n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return new C0898mA(this.f11901o.keySet().iterator(), this.f11902p.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e0, code lost:
    
        if (com.google.android.gms.internal.measurement.AbstractC1515f1.j(r7, r2, (com.google.android.gms.internal.measurement.C1546m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).o() == r7.o()) goto L169;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0126. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1550n n(java.lang.String r37, u0.g r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instructions count: 2176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1503d.n(java.lang.String, u0.g, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final int o() {
        TreeMap treeMap = this.f11901o;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final InterfaceC1550n p(int i4) {
        InterfaceC1550n interfaceC1550n;
        if (i4 < o()) {
            return (!v(i4) || (interfaceC1550n = (InterfaceC1550n) this.f11901o.get(Integer.valueOf(i4))) == null) ? InterfaceC1550n.f11977e : interfaceC1550n;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String q(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f11901o.isEmpty()) {
            for (int i4 = 0; i4 < o(); i4++) {
                InterfaceC1550n p3 = p(i4);
                sb.append(str);
                if (!(p3 instanceof r) && !(p3 instanceof C1542l)) {
                    sb.append(p3.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator r() {
        return this.f11901o.keySet().iterator();
    }

    public final ArrayList s() {
        ArrayList arrayList = new ArrayList(o());
        for (int i4 = 0; i4 < o(); i4++) {
            arrayList.add(p(i4));
        }
        return arrayList;
    }

    public final void t(int i4) {
        TreeMap treeMap = this.f11901o;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i4 > intValue || i4 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i4));
        if (i4 == intValue) {
            int i5 = i4 - 1;
            Integer valueOf = Integer.valueOf(i5);
            if (treeMap.containsKey(valueOf) || i5 < 0) {
                return;
            }
            treeMap.put(valueOf, InterfaceC1550n.f11977e);
            return;
        }
        while (true) {
            i4++;
            if (i4 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i4);
            InterfaceC1550n interfaceC1550n = (InterfaceC1550n) treeMap.get(valueOf2);
            if (interfaceC1550n != null) {
                treeMap.put(Integer.valueOf(i4 - 1), interfaceC1550n);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String toString() {
        return q(",");
    }

    public final void u(int i4, InterfaceC1550n interfaceC1550n) {
        if (i4 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(U.a.i("Out of bounds index: ", i4));
        }
        TreeMap treeMap = this.f11901o;
        if (interfaceC1550n == null) {
            treeMap.remove(Integer.valueOf(i4));
        } else {
            treeMap.put(Integer.valueOf(i4), interfaceC1550n);
        }
    }

    public final boolean v(int i4) {
        if (i4 >= 0) {
            TreeMap treeMap = this.f11901o;
            if (i4 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i4));
            }
        }
        throw new IndexOutOfBoundsException(U.a.i("Out of bounds index: ", i4));
    }
}
