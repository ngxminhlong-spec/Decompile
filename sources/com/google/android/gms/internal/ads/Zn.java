package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zn implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final O1.a1 f8043a;

    /* renamed from: b, reason: collision with root package name */
    public final C0248Bc f8044b;
    public final boolean c;

    public Zn(O1.a1 a1Var, C0248Bc c0248Bc, boolean z4) {
        this.f8043a = a1Var;
        this.f8044b = c0248Bc;
        this.c = z4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C0937n6 c0937n6 = AbstractC1066q6.z4;
        O1.r rVar = O1.r.d;
        if (this.f8044b.f4086q >= ((Integer) rVar.c.a(c0937n6)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.A4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.c);
        }
        O1.a1 a1Var = this.f8043a;
        if (a1Var != null) {
            int i4 = a1Var.f1345o;
            if (i4 == 1) {
                bundle.putString("avo", "p");
            } else if (i4 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
