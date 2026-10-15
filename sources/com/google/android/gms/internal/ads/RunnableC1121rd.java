package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1121rd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10479o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10480p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f10481q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f10482r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f10483s;

    public /* synthetic */ RunnableC1121rd(C0396ae c0396ae, View view, InterfaceC0301Lb interfaceC0301Lb, int i4) {
        this.f10481q = c0396ae;
        this.f10482r = view;
        this.f10483s = interfaceC0301Lb;
        this.f10480p = i4;
    }

    public RunnableC1121rd(AbstractC1250ud abstractC1250ud, String str, String str2, int i4) {
        this.f10483s = abstractC1250ud;
        this.f10481q = str;
        this.f10482r = str2;
        this.f10480p = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10479o) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f10481q);
                hashMap.put("cachedSrc", (String) this.f10482r);
                hashMap.put("totalBytes", Integer.toString(this.f10480p));
                AbstractC1250ud.j((AbstractC1250ud) this.f10483s, hashMap);
                return;
            default:
                ((C0396ae) this.f10481q).y((View) this.f10482r, (InterfaceC0301Lb) this.f10483s, this.f10480p - 1);
                return;
        }
    }
}
