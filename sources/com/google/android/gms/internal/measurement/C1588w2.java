package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588w2 extends AbstractC1523h {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12109q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1588w2(String str, int i4) {
        super(str);
        this.f12109q = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1523h
    public final InterfaceC1550n a(u0.g gVar, List list) {
        switch (this.f12109q) {
            case 0:
                return InterfaceC1550n.f11977e;
            case 1:
            case 2:
                return this;
            case 3:
                return new C1518g(Double.valueOf(0.0d));
            default:
                return InterfaceC1550n.f11977e;
        }
    }
}
