package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ol implements Mu {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6512o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0749iq f6513p;

    public /* synthetic */ Ol(InterfaceC0749iq interfaceC0749iq, int i4) {
        this.f6512o = i4;
        this.f6513p = interfaceC0749iq;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ void mo4r(Object obj) {
        switch (this.f6512o) {
            case 0:
                try {
                    this.f6513p.l((SQLiteDatabase) obj);
                    return;
                } catch (Exception e4) {
                    Y9.p("Error executing function on offline signal database: ".concat(String.valueOf(e4.getMessage())));
                    return;
                }
            default:
                try {
                    this.f6513p.l((SQLiteDatabase) obj);
                    return;
                } catch (Exception e5) {
                    Y9.p("Error executing function on offline buffered ping database: ".concat(String.valueOf(e5.getMessage())));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void y(Throwable th) {
        switch (this.f6512o) {
            case 0:
                Y9.p("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
                return;
            default:
                Y9.p("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
                return;
        }
    }
}
