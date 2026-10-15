package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K3 extends AbstractC1230u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5969b = 0;
    public Long c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5970e;

    public /* synthetic */ K3() {
    }

    public K3(String str) {
        HashMap i4 = AbstractC1230u.i(str);
        if (i4 != null) {
            this.c = (Long) i4.get(0);
            this.d = (Boolean) i4.get(1);
            this.f5970e = (Boolean) i4.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1230u
    public final HashMap z() {
        switch (this.f5969b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put(0, this.c);
                hashMap.put(1, (Long) this.d);
                hashMap.put(2, (Long) this.f5970e);
                return hashMap;
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put(0, this.c);
                hashMap2.put(1, (Boolean) this.d);
                hashMap2.put(2, (Boolean) this.f5970e);
                return hashMap2;
        }
    }
}
