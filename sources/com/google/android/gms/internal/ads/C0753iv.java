package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.C1509e0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.iv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753iv implements InterfaceC0351Vb, Mu, Bh, InterfaceC0749iq {

    /* renamed from: A, reason: collision with root package name */
    public static final C0753iv f9083A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0753iv f9084B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0753iv f9085C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0753iv f9086D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0753iv f9087E;

    /* renamed from: q, reason: collision with root package name */
    public static final C0753iv f9088q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0753iv f9089r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0753iv f9090s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0753iv f9091t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0753iv f9092u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0753iv f9093v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0753iv f9094w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0753iv f9095x;
    public static final C0753iv y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0753iv f9096z;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9097o;

    /* renamed from: p, reason: collision with root package name */
    public String f9098p;

    static {
        int i4 = 0;
        f9088q = new C0753iv("ENABLED", i4);
        f9089r = new C0753iv("DISABLED", i4);
        f9090s = new C0753iv("DESTROYED", i4);
        int i5 = 1;
        f9091t = new C0753iv("TINK", i5);
        f9092u = new C0753iv("CRUNCHY", i5);
        f9093v = new C0753iv("NO_PREFIX", i5);
        int i6 = 2;
        f9094w = new C0753iv("TINK", i6);
        f9095x = new C0753iv("CRUNCHY", i6);
        y = new C0753iv("NO_PREFIX", i6);
        int i7 = 3;
        f9096z = new C0753iv("TINK", i7);
        f9083A = new C0753iv("CRUNCHY", i7);
        f9084B = new C0753iv("NO_PREFIX", i7);
        int i8 = 4;
        f9085C = new C0753iv("TINK", i8);
        f9086D = new C0753iv("CRUNCHY", i8);
        f9087E = new C0753iv("NO_PREFIX", i8);
    }

    public /* synthetic */ C0753iv() {
        this.f9097o = 10;
    }

    public /* synthetic */ C0753iv(String str, int i4) {
        this.f9097o = i4;
        this.f9098p = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0351Vb
    public void a(InterfaceC0609fe interfaceC0609fe) {
        String str = this.f9098p;
        C1509e0 c1509e0 = (C1509e0) ((BinderC0854l9) interfaceC0609fe).f9378o.f13386p;
        c1509e0.b(new com.google.android.gms.internal.measurement.T(c1509e0, str, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f9098p, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        ((Ih) obj).F(this.f9098p);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
    }

    public String toString() {
        switch (this.f9097o) {
            case 0:
                return this.f9098p;
            case 1:
                return this.f9098p;
            case 2:
                return this.f9098p;
            case 3:
                return this.f9098p;
            case 4:
                return this.f9098p;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        N1.n.f1204A.f1209g.h(this.f9098p, th);
    }
}
