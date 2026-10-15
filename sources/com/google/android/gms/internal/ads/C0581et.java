package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.et, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581et extends Ys {

    /* renamed from: o, reason: collision with root package name */
    public final Object f8653o;

    /* renamed from: p, reason: collision with root package name */
    public int f8654p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0624ft f8655q;

    public C0581et(C0624ft c0624ft, int i4) {
        this.f8655q = c0624ft;
        Object[] objArr = c0624ft.f8755q;
        objArr.getClass();
        this.f8653o = objArr[i4];
        this.f8654p = i4;
    }

    public final void a() {
        int i4 = this.f8654p;
        Object obj = this.f8653o;
        C0624ft c0624ft = this.f8655q;
        if (i4 != -1 && i4 < c0624ft.size()) {
            int i5 = this.f8654p;
            Object[] objArr = c0624ft.f8755q;
            objArr.getClass();
            if (Bs.r(obj, objArr[i5])) {
                return;
            }
        }
        Object obj2 = C0624ft.f8752x;
        this.f8654p = c0624ft.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8653o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0624ft c0624ft = this.f8655q;
        Map a4 = c0624ft.a();
        if (a4 != null) {
            return a4.get(this.f8653o);
        }
        a();
        int i4 = this.f8654p;
        if (i4 == -1) {
            return null;
        }
        Object[] objArr = c0624ft.f8756r;
        objArr.getClass();
        return objArr[i4];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0624ft c0624ft = this.f8655q;
        Map a4 = c0624ft.a();
        Object obj2 = this.f8653o;
        if (a4 != null) {
            return a4.put(obj2, obj);
        }
        a();
        int i4 = this.f8654p;
        if (i4 == -1) {
            c0624ft.put(obj2, obj);
            return null;
        }
        Object[] objArr = c0624ft.f8756r;
        objArr.getClass();
        Object obj3 = objArr[i4];
        objArr[i4] = obj;
        return obj3;
    }
}
