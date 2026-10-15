package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jp {

    /* renamed from: a, reason: collision with root package name */
    public final O1.R0 f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final C8 f5909b;
    public final Bn c;
    public final O1.U0 d;

    /* renamed from: e, reason: collision with root package name */
    public final O1.X0 f5910e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5911f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5912g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5913h;

    /* renamed from: i, reason: collision with root package name */
    public final C0766j7 f5914i;

    /* renamed from: j, reason: collision with root package name */
    public final O1.a1 f5915j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5916k;

    /* renamed from: l, reason: collision with root package name */
    public final K1.a f5917l;

    /* renamed from: m, reason: collision with root package name */
    public final K1.d f5918m;

    /* renamed from: n, reason: collision with root package name */
    public final O1.O f5919n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.n f5920o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5921p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5922q;

    /* renamed from: r, reason: collision with root package name */
    public final O1.S f5923r;

    public Jp(Ip ip) {
        this.f5910e = ip.f5728b;
        this.f5911f = ip.c;
        this.f5923r = ip.f5743s;
        O1.U0 u02 = ip.f5727a;
        int i4 = u02.f1306o;
        long j4 = u02.f1307p;
        Bundle bundle = u02.f1308q;
        int i5 = u02.f1309r;
        List list = u02.f1310s;
        boolean z4 = u02.f1311t;
        int i6 = u02.f1312u;
        boolean z5 = true;
        if (!u02.f1313v && !ip.f5729e) {
            z5 = false;
        }
        boolean z6 = z5;
        String str = u02.f1314w;
        O1.Q0 q02 = u02.f1315x;
        Location location = u02.y;
        String str2 = u02.f1316z;
        Bundle bundle2 = u02.f1293A;
        Bundle bundle3 = u02.f1294B;
        List list2 = u02.f1295C;
        String str3 = u02.f1296D;
        String str4 = u02.f1297E;
        boolean z7 = u02.f1298F;
        O1.N n4 = u02.f1299G;
        int i7 = u02.f1300H;
        String str5 = u02.f1301I;
        List list3 = u02.f1302J;
        int t4 = Q1.N.t(u02.f1303K);
        O1.U0 u03 = ip.f5727a;
        this.d = new O1.U0(i4, j4, bundle, i5, list, z4, i6, z6, str, q02, location, str2, bundle2, bundle3, list2, str3, str4, z7, n4, i7, str5, list3, t4, u03.f1304L, u03.f1305M);
        O1.R0 r02 = ip.d;
        C0766j7 c0766j7 = null;
        if (r02 == null) {
            C0766j7 c0766j72 = ip.f5732h;
            r02 = c0766j72 != null ? c0766j72.f9130t : null;
        }
        this.f5908a = r02;
        ArrayList arrayList = ip.f5730f;
        this.f5912g = arrayList;
        this.f5913h = ip.f5731g;
        if (arrayList != null && (c0766j7 = ip.f5732h) == null) {
            c0766j7 = new C0766j7(new K1.c(new K1.c()));
        }
        this.f5914i = c0766j7;
        this.f5915j = ip.f5733i;
        this.f5916k = ip.f5737m;
        this.f5917l = ip.f5734j;
        this.f5918m = ip.f5735k;
        this.f5919n = ip.f5736l;
        this.f5909b = ip.f5738n;
        this.f5920o = new n0.n(ip.f5739o);
        this.f5921p = ip.f5740p;
        this.c = ip.f5741q;
        this.f5922q = ip.f5742r;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.P7, com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.P7, com.google.android.gms.internal.ads.r4] */
    public final P7 a() {
        K1.a aVar = this.f5917l;
        K1.d dVar = this.f5918m;
        if (dVar == null && aVar == null) {
            return null;
        }
        if (dVar != null) {
            IBinder iBinder = dVar.f1060q;
            if (iBinder == null) {
                return null;
            }
            int i4 = O7.f6436o;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
            return queryLocalInterface instanceof P7 ? (P7) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener", 0);
        }
        IBinder iBinder2 = aVar.f1052p;
        if (iBinder2 == null) {
            return null;
        }
        int i5 = O7.f6436o;
        IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface2 instanceof P7 ? (P7) queryLocalInterface2 : new AbstractC1106r4(iBinder2, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener", 0);
    }

    public final boolean b() {
        return this.f5911f.matches((String) O1.r.d.c.a(AbstractC1066q6.F2));
    }
}
