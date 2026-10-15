package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0831kn;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J3 extends AbstractC1523h {

    /* renamed from: q, reason: collision with root package name */
    public final C1599z1 f11783q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f11784r;

    public J3(C1599z1 c1599z1) {
        super("require");
        this.f11784r = new HashMap();
        this.f11783q = c1599z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1523h
    public final InterfaceC1550n a(u0.g gVar, List list) {
        InterfaceC1550n interfaceC1550n;
        AbstractC1515f1.A("require", 1, list);
        String g4 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(0)).g();
        HashMap hashMap = this.f11784r;
        if (hashMap.containsKey(g4)) {
            return (InterfaceC1550n) hashMap.get(g4);
        }
        C1599z1 c1599z1 = this.f11783q;
        if (((HashMap) c1599z1.f12124p).containsKey(g4)) {
            try {
                interfaceC1550n = (InterfaceC1550n) ((Callable) ((HashMap) c1599z1.f12124p).get(g4)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(g4)));
            }
        } else {
            interfaceC1550n = InterfaceC1550n.f11977e;
        }
        if (interfaceC1550n instanceof AbstractC1523h) {
            hashMap.put(g4, (AbstractC1523h) interfaceC1550n);
        }
        return interfaceC1550n;
    }
}
