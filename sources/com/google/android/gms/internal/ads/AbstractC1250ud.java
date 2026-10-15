package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ud, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1250ud {

    /* renamed from: o, reason: collision with root package name */
    public final Context f10790o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10791p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f10792q;

    public AbstractC1250ud(InterfaceC0308Md interfaceC0308Md) {
        Context context = interfaceC0308Md.getContext();
        this.f10790o = context;
        this.f10791p = N1.n.f1204A.c.u(context, interfaceC0308Md.m().f4084o);
        this.f10792q = new WeakReference(interfaceC0308Md);
    }

    public static /* bridge */ /* synthetic */ void j(AbstractC1250ud abstractC1250ud, HashMap hashMap) {
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) abstractC1250ud.f10792q.get();
        if (interfaceC0308Md != null) {
            interfaceC0308Md.b("onPrecacheEvent", hashMap);
        }
    }

    public void i() {
    }

    public abstract void l();

    public final void m(String str, String str2, String str3, String str4) {
        C1335wc.f11173b.post(new RunnableC1207td(this, str, str2, str3, str4));
    }

    public void n(int i4) {
    }

    public void o(int i4) {
    }

    public void p(int i4) {
    }

    public void q(int i4) {
    }

    public abstract boolean r(String str);

    public boolean s(String str, String[] strArr) {
        return r(str);
    }

    public boolean t(String str, String[] strArr, C0864ld c0864ld) {
        return r(str);
    }
}
