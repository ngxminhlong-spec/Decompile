package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341wi implements InterfaceC1450z4 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f11185o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1427yi f11186p;

    public C1341wi(C1427yi c1427yi, String str) {
        this.f11186p = c1427yi;
        this.f11185o = str;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10301w1)).booleanValue()) {
            if (c1407y4.f11338j) {
                C1427yi c1427yi = this.f11186p;
                c1427yi.f11432E.put(this.f11185o, Boolean.TRUE);
                C1427yi c1427yi2 = this.f11186p;
                c1427yi2.b(c1427yi2.f11445u.d(), this.f11186p.f11445u.l(), this.f11186p.f11445u.q(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c1407y4.f11338j) {
                    C1427yi c1427yi3 = this.f11186p;
                    if (c1427yi3.f11445u == null) {
                        return;
                    }
                    c1427yi3.f11432E.put(this.f11185o, Boolean.TRUE);
                    C1427yi c1427yi4 = this.f11186p;
                    c1427yi4.b(c1427yi4.f11445u.d(), this.f11186p.f11445u.l(), this.f11186p.f11445u.q(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
