package com.google.android.gms.internal.ads;

import Q1.C0111j;
import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1253ug implements As {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10918b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C1253ug(Object obj, Object obj2, Object obj3, int i4) {
        this.f10917a = i4;
        this.f10918b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.As
    public final Object apply(Object obj) {
        switch (this.f10917a) {
            case 0:
                C1434yp c1434yp = (C1434yp) obj;
                C0111j c0111j = new C0111j((Context) this.f10918b);
                c0111j.c = c1434yp.f11476B;
                c0111j.f1706f = c1434yp.f11477C.toString();
                c0111j.f1705e = ((C0248Bc) this.c).f4084o;
                c0111j.d = ((Jp) this.d).f5911f;
                return c0111j;
            case 1:
                C0348Ud c0348Ud = (C0348Ud) this.f10918b;
                if (((C1434yp) this.c).f11487M) {
                    c0348Ud.M();
                }
                C1466ze c1466ze = (C1466ze) this.d;
                c0348Ud.B();
                c0348Ud.onPause();
                return c1466ze.f0();
            case 2:
                C0348Ud c0348Ud2 = (C0348Ud) this.f10918b;
                if (((C1434yp) this.c).f11487M) {
                    c0348Ud2.M();
                }
                C0274Fe c0274Fe = (C0274Fe) this.d;
                c0348Ud2.B();
                c0348Ud2.onPause();
                return c0274Fe.f0();
            default:
                C0348Ud c0348Ud3 = (C0348Ud) this.f10918b;
                if (((C1434yp) this.c).f11487M) {
                    c0348Ud3.M();
                }
                C0284He c0284He = (C0284He) this.d;
                c0348Ud3.B();
                c0348Ud3.onPause();
                return c0284He.f0();
        }
    }
}
