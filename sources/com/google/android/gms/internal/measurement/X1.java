package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0831kn;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X1 extends C1538k {

    /* renamed from: p, reason: collision with root package name */
    public final C1498c f11844p;

    public X1(C1498c c1498c) {
        this.f11844p = c1498c;
    }

    @Override // com.google.android.gms.internal.measurement.C1538k, com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n n(String str, u0.g gVar, ArrayList arrayList) {
        int hashCode = str.hashCode();
        C1498c c1498c = this.f11844p;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    AbstractC1515f1.A("getEventName", 0, arrayList);
                    return new C1562q(c1498c.f11890b.f11880a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    AbstractC1515f1.A("getTimestamp", 0, arrayList);
                    return new C1518g(Double.valueOf(c1498c.f11890b.f11881b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    AbstractC1515f1.A("getParamValue", 1, arrayList);
                    String g4 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) arrayList.get(0)).g();
                    HashMap hashMap = c1498c.f11890b.c;
                    return AbstractC1515f1.k(hashMap.containsKey(g4) ? hashMap.get(g4) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    AbstractC1515f1.A("getParams", 0, arrayList);
                    HashMap hashMap2 = c1498c.f11890b.c;
                    C1538k c1538k = new C1538k();
                    for (String str2 : hashMap2.keySet()) {
                        c1538k.k(str2, AbstractC1515f1.k(hashMap2.get(str2)));
                    }
                    return c1538k;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    AbstractC1515f1.A("setParamValue", 2, arrayList);
                    String g5 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) arrayList.get(0)).g();
                    InterfaceC1550n x4 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) arrayList.get(1));
                    C1493b c1493b = c1498c.f11890b;
                    Object w2 = AbstractC1515f1.w(x4);
                    HashMap hashMap3 = c1493b.c;
                    if (w2 == null) {
                        hashMap3.remove(g5);
                        return x4;
                    }
                    hashMap3.put(g5, w2);
                    return x4;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    AbstractC1515f1.A("setEventName", 1, arrayList);
                    InterfaceC1550n x5 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) arrayList.get(0));
                    if (InterfaceC1550n.f11977e.equals(x5) || InterfaceC1550n.f11978f.equals(x5)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    c1498c.f11890b.f11880a = x5.g();
                    return new C1562q(x5.g());
                }
                break;
        }
        return super.n(str, gVar, arrayList);
    }
}
