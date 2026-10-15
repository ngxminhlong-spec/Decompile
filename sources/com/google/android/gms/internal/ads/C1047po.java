package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047po implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final String f10043a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10044b;
    public final boolean c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10045e;

    public C1047po(String str, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f10043a = str;
        this.f10044b = z4;
        this.c = z5;
        this.d = z6;
        this.f10045e = z7;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f10043a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z4 = this.f10044b;
        bundle.putInt("test_mode", z4 ? 1 : 0);
        boolean z5 = this.c;
        bundle.putInt("linked_device", z5 ? 1 : 0);
        if (z4 || z5) {
            C0937n6 c0937n6 = AbstractC1066q6.f8;
            O1.r rVar = O1.r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                bundle.putInt("risd", !this.d ? 1 : 0);
            }
            if (((Boolean) rVar.c.a(AbstractC1066q6.j8)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f10045e);
            }
        }
    }
}
