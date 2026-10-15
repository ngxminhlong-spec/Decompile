package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221tr {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10753a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f10754b;

    public C1221tr(Context context, Looper looper) {
        this.f10753a = context;
        this.f10754b = looper;
    }

    public final void a(String str) {
        Ar v4 = Br.v();
        String packageName = this.f10753a.getPackageName();
        v4.d();
        Br.w((Br) v4.f4561p, packageName);
        v4.d();
        Br.y((Br) v4.f4561p);
        C1436yr v5 = C1479zr.v();
        v5.d();
        C1479zr.w((C1479zr) v5.f4561p, str);
        v5.d();
        C1479zr.x((C1479zr) v5.f4561p);
        v4.d();
        Br.x((Br) v4.f4561p, (C1479zr) v5.b());
        Q1.F f4 = new Q1.F(this.f10753a, this.f10754b, (Br) v4.b());
        synchronized (f4.f1630s) {
            try {
                if (!f4.f1626o) {
                    f4.f1626o = true;
                    ((Fr) f4.f1628q).n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
