package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Wl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G1 extends AbstractC1523h {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11734q = 4;

    /* renamed from: r, reason: collision with root package name */
    public final Object f11735r;

    public G1(Wl wl) {
        super("internal.registerCallback");
        this.f11735r = wl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(C0831kn c0831kn) {
        super("getValue");
        this.f11735r = c0831kn;
    }

    public G1(C1498c c1498c) {
        super("internal.eventLogger");
        this.f11735r = c1498c;
    }

    public G1(k.o oVar) {
        super("internal.logger");
        this.f11735r = oVar;
        this.f11939p.put("log", new I3(this, false, true));
        this.f11939p.put("silent", new C1588w2("silent", 1));
        ((AbstractC1523h) this.f11939p.get("silent")).k("log", new I3(this, true, true));
        this.f11939p.put("unmonitored", new C1588w2("unmonitored", 2));
        ((AbstractC1523h) this.f11939p.get("unmonitored")).k("log", new I3(this, false, false));
    }

    public G1(x2.V v4) {
        super("internal.appMetadata");
        this.f11735r = v4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1523h
    public final InterfaceC1550n a(u0.g gVar, List list) {
        TreeMap treeMap;
        switch (this.f11734q) {
            case 0:
                AbstractC1515f1.A(this.f11938o, 3, list);
                String g4 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(0)).g();
                InterfaceC1550n interfaceC1550n = (InterfaceC1550n) list.get(1);
                C0831kn c0831kn = (C0831kn) gVar.f14984q;
                long a4 = (long) AbstractC1515f1.a(c0831kn.x(gVar, interfaceC1550n).f().doubleValue());
                InterfaceC1550n x4 = c0831kn.x(gVar, (InterfaceC1550n) list.get(2));
                ((C1498c) this.f11735r).c.add(new C1493b(g4, a4, x4 instanceof C1538k ? AbstractC1515f1.y((C1538k) x4) : new HashMap()));
                return InterfaceC1550n.f11977e;
            case 1:
                AbstractC1515f1.A("getValue", 2, list);
                InterfaceC1550n x5 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(0));
                InterfaceC1550n x6 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(1));
                String g5 = x5.g();
                C0831kn c0831kn2 = (C0831kn) this.f11735r;
                Map map = (Map) ((x2.X) c0831kn2.f9320q).d.get((String) c0831kn2.f9319p);
                String str = (map == null || !map.containsKey(g5)) ? null : (String) map.get(g5);
                return str != null ? new C1562q(str) : x6;
            case 2:
                return InterfaceC1550n.f11977e;
            case 3:
                try {
                    return AbstractC1515f1.k(((x2.V) this.f11735r).call());
                } catch (Exception unused) {
                    return InterfaceC1550n.f11977e;
                }
            default:
                AbstractC1515f1.A(this.f11938o, 3, list);
                ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(0)).g();
                InterfaceC1550n interfaceC1550n2 = (InterfaceC1550n) list.get(1);
                C0831kn c0831kn3 = (C0831kn) gVar.f14984q;
                InterfaceC1550n x7 = c0831kn3.x(gVar, interfaceC1550n2);
                if (!(x7 instanceof C1546m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC1550n x8 = c0831kn3.x(gVar, (InterfaceC1550n) list.get(2));
                if (!(x8 instanceof C1538k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C1538k c1538k = (C1538k) x8;
                HashMap hashMap = c1538k.f11957o;
                if (!hashMap.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String g6 = c1538k.j("type").g();
                int g7 = hashMap.containsKey("priority") ? AbstractC1515f1.g(c1538k.j("priority").f().doubleValue()) : 1000;
                Wl wl = (Wl) this.f11735r;
                C1546m c1546m = (C1546m) x7;
                wl.getClass();
                if ("create".equals(g6)) {
                    treeMap = (TreeMap) wl.f7564q;
                } else {
                    if (!"edit".equals(g6)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(g6)));
                    }
                    treeMap = (TreeMap) wl.f7563p;
                }
                if (treeMap.containsKey(Integer.valueOf(g7))) {
                    g7 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(g7), c1546m);
                return InterfaceC1550n.f11977e;
        }
    }
}
