package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382xg implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final FB f11280a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f11281b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f11282e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f11283f;

    /* renamed from: g, reason: collision with root package name */
    public final FB f11284g;

    /* renamed from: h, reason: collision with root package name */
    public final FB f11285h;

    /* renamed from: i, reason: collision with root package name */
    public final FB f11286i;

    /* renamed from: j, reason: collision with root package name */
    public final FB f11287j;

    /* renamed from: k, reason: collision with root package name */
    public final C1414yB f11288k;

    public C1382xg(C1414yB c1414yB, C1122re c1122re, Zk zk, C0446bl c0446bl, C1414yB c1414yB2, C1414yB c1414yB3, C0822ke c0822ke, C1414yB c1414yB4, Jo jo, Eg eg, C1414yB c1414yB5) {
        this.f11280a = c1414yB;
        this.f11281b = c1122re;
        this.c = zk;
        this.d = c0446bl;
        this.f11282e = c1414yB2;
        this.f11283f = c1414yB3;
        this.f11284g = c0822ke;
        this.f11285h = c1414yB4;
        this.f11286i = jo;
        this.f11287j = eg;
        this.f11288k = c1414yB5;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, V2.j] */
    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V2.j c() {
        C1006oq c1006oq = (C1006oq) this.f11280a.c();
        C0248Bc a4 = ((C1122re) this.f11281b).a();
        ApplicationInfo c = ((Zk) this.c).c();
        String packageName = ((C0865le) ((C0446bl) this.d).f8279a).a().getPackageName();
        AbstractC0587ez.n(packageName);
        C0937n6 c0937n6 = AbstractC1066q6.f10197a;
        ArrayList m4 = O1.r.d.f1379a.m();
        PackageInfo packageInfo = (PackageInfo) this.f11282e.c();
        InterfaceC1328wB a5 = C1414yB.a(this.f11283f);
        Q1.K c2 = ((C0822ke) this.f11284g).c();
        String str = (String) this.f11285h.c();
        Io c4 = ((Jo) this.f11286i).c();
        Jp a6 = ((Eg) this.f11287j).a();
        C1469zh c1469zh = (C1469zh) this.f11288k.c();
        ?? obj = new Object();
        obj.f1892a = c1006oq;
        obj.f1893b = a4;
        obj.c = c;
        obj.d = packageName;
        obj.f1894e = m4;
        obj.f1895f = packageInfo;
        obj.f1896g = a5;
        obj.f1897h = str;
        obj.f1898i = c4;
        obj.f1899j = c2;
        obj.f1900k = a6;
        obj.f1901l = c1469zh;
        return obj;
    }
}
