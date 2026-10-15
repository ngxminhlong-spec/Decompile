package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679h4 extends AbstractCallableC0892m4 {

    /* renamed from: h, reason: collision with root package name */
    public final Map f8917h;

    /* renamed from: i, reason: collision with root package name */
    public final View f8918i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f8919j;

    public C0679h4(U3 u32, C0549e3 c0549e3, int i4, HashMap hashMap, View view, Context context) {
        super(u32, "7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", c0549e3, i4, 85);
        this.f8917h = hashMap;
        this.f8918i = view;
        this.f8919j = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        Map map = this.f8917h;
        long longValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.f8917h;
        long[] jArr = {longValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.f8919j;
        if (context == null) {
            context = this.f9560a.f7127a;
        }
        long[] jArr2 = (long[]) this.f9562e.invoke(null, jArr, context, this.f8918i);
        long j4 = jArr2[0];
        this.f8917h.put(1, Long.valueOf(jArr2[1]));
        long j5 = jArr2[2];
        this.f8917h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            c0549e3.d();
            C0977o3.Y((C0977o3) c0549e3.f4561p, j4);
            C0549e3 c0549e32 = this.d;
            c0549e32.d();
            C0977o3.Z((C0977o3) c0549e32.f4561p, j5);
        }
    }
}
