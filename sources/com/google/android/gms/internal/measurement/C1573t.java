package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573t implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1523h f12026o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u0.g f12027p;

    public C1573t(AbstractC1523h abstractC1523h, u0.g gVar) {
        this.f12026o = abstractC1523h;
        this.f12027p = gVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC1550n interfaceC1550n = (InterfaceC1550n) obj;
        InterfaceC1550n interfaceC1550n2 = (InterfaceC1550n) obj2;
        if (interfaceC1550n instanceof r) {
            return !(interfaceC1550n2 instanceof r) ? 1 : 0;
        }
        if (interfaceC1550n2 instanceof r) {
            return -1;
        }
        AbstractC1523h abstractC1523h = this.f12026o;
        return abstractC1523h == null ? interfaceC1550n.g().compareTo(interfaceC1550n2.g()) : (int) AbstractC1515f1.a(abstractC1523h.a(this.f12027p, Arrays.asList(interfaceC1550n, interfaceC1550n2)).f().doubleValue());
    }
}
