package com.google.android.gms.internal.ads;

import C0.C0001a0;
import android.content.Context;
import android.os.Bundle;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o2.AbstractC1895f;
import org.json.JSONArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491co implements Go {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f8407k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8408a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8409b;
    public final Jp c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8410e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8411f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8412g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8413h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8414i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8415j;

    public C0491co(Context context, String str, String str2, C0910mg c0910mg, Rp rp, Jp jp, C0572ek c0572ek, C1082qg c1082qg) {
        this.f8408a = 0;
        this.f8409b = context;
        this.d = str;
        this.f8410e = str2;
        this.f8411f = c0910mg;
        this.f8412g = rp;
        this.c = jp;
        this.f8413h = N1.n.f1204A.f1209g.c();
        this.f8414i = c0572ek;
        this.f8415j = c1082qg;
    }

    public C0491co(Su su, ScheduledExecutorService scheduledExecutorService, String str, C1131rn c1131rn, Context context, Jp jp, C1046pn c1046pn, Tj tj, Dk dk) {
        this.f8408a = 1;
        this.f8410e = su;
        this.f8411f = scheduledExecutorService;
        this.d = str;
        this.f8412g = c1131rn;
        this.f8409b = context;
        this.c = jp;
        this.f8413h = c1046pn;
        this.f8414i = tj;
        this.f8415j = dk;
    }

    public Ku a(String str, List list, Bundle bundle, boolean z4, boolean z5) {
        C0001a0 c0001a0 = new C0001a0(this, str, list, bundle, z4, z5);
        Su su = (Su) this.f8410e;
        Ku q4 = Ku.q(Bs.k0(c0001a0, su));
        C0937n6 c0937n6 = AbstractC1066q6.f10254m1;
        O1.r rVar = O1.r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            q4 = (Ku) Bs.o0(q4, ((Long) rVar.c.a(AbstractC1066q6.f10221f1)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f8411f);
        }
        return Bs.Z(q4, Throwable.class, new C0384a8(str, 3), su);
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f8408a) {
            case 0:
                return 12;
            default:
                return 32;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        switch (this.f8408a) {
            case 0:
                Bundle bundle = new Bundle();
                C0937n6 c0937n6 = AbstractC1066q6.G6;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    ((C0572ek) this.f8414i).f8633a.put("seq_num", this.d);
                }
                if (((Boolean) rVar.c.a(AbstractC1066q6.M4)).booleanValue()) {
                    ((C0910mg) this.f8411f).l(this.c.d);
                    bundle.putAll(((Rp) this.f8412g).a());
                }
                return Bs.h0(new C0449bo(0, this, bundle));
            default:
                Jp jp = this.c;
                if (jp.f5922q) {
                    if (!Arrays.asList(((String) O1.r.d.c.a(AbstractC1066q6.f10282s1)).split(",")).contains(AbstractC1895f.D(AbstractC1895f.G(jp.d)))) {
                        return Bs.h0(new C0449bo(3, new JSONArray().toString(), new Bundle()));
                    }
                }
                return Bs.k0(new C1384xi(16, this), (Su) this.f8410e);
        }
    }

    public void d(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            C1260un c1260un = (C1260un) ((Map.Entry) it.next()).getValue();
            String str = c1260un.f10939a;
            Bundle bundle = this.c.d.f1293A;
            arrayList.add(a(str, Collections.singletonList(c1260un.f10941e), bundle != null ? bundle.getBundle(str) : null, c1260un.f10940b, c1260un.c));
        }
    }
}
