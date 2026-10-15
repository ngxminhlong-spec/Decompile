package com.google.android.gms.ads.internal.overlay;

import J.i;
import N1.h;
import O1.InterfaceC0051a;
import O1.r;
import P1.b;
import P1.g;
import P1.l;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.BinderC0489cm;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0323Pd;
import com.google.android.gms.internal.ads.C0348Ud;
import com.google.android.gms.internal.ads.C0443bi;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.InterfaceC0947na;
import com.google.android.gms.internal.ads.Og;
import com.google.android.gms.internal.ads.Qk;
import com.google.android.gms.internal.ads.Sh;
import com.google.android.gms.internal.ads.Y7;
import com.google.android.gms.internal.ads.Z7;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractC1717a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new i(5);

    /* renamed from: A, reason: collision with root package name */
    public final C0248Bc f3855A;

    /* renamed from: B, reason: collision with root package name */
    public final String f3856B;

    /* renamed from: C, reason: collision with root package name */
    public final h f3857C;

    /* renamed from: D, reason: collision with root package name */
    public final Y7 f3858D;

    /* renamed from: E, reason: collision with root package name */
    public final String f3859E;

    /* renamed from: F, reason: collision with root package name */
    public final String f3860F;

    /* renamed from: G, reason: collision with root package name */
    public final String f3861G;

    /* renamed from: H, reason: collision with root package name */
    public final Og f3862H;

    /* renamed from: I, reason: collision with root package name */
    public final Sh f3863I;

    /* renamed from: J, reason: collision with root package name */
    public final InterfaceC0947na f3864J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f3865K;

    /* renamed from: o, reason: collision with root package name */
    public final b f3866o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0051a f3867p;

    /* renamed from: q, reason: collision with root package name */
    public final g f3868q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0308Md f3869r;

    /* renamed from: s, reason: collision with root package name */
    public final Z7 f3870s;

    /* renamed from: t, reason: collision with root package name */
    public final String f3871t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f3872u;

    /* renamed from: v, reason: collision with root package name */
    public final String f3873v;

    /* renamed from: w, reason: collision with root package name */
    public final l f3874w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3875x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final String f3876z;

    public AdOverlayInfoParcel(InterfaceC0051a interfaceC0051a, g gVar, l lVar, C0348Ud c0348Ud, boolean z4, int i4, C0248Bc c0248Bc, Sh sh, BinderC0489cm binderC0489cm) {
        this.f3866o = null;
        this.f3867p = interfaceC0051a;
        this.f3868q = gVar;
        this.f3869r = c0348Ud;
        this.f3858D = null;
        this.f3870s = null;
        this.f3871t = null;
        this.f3872u = z4;
        this.f3873v = null;
        this.f3874w = lVar;
        this.f3875x = i4;
        this.y = 2;
        this.f3876z = null;
        this.f3855A = c0248Bc;
        this.f3856B = null;
        this.f3857C = null;
        this.f3859E = null;
        this.f3860F = null;
        this.f3861G = null;
        this.f3862H = null;
        this.f3863I = sh;
        this.f3864J = binderC0489cm;
        this.f3865K = false;
    }

    public AdOverlayInfoParcel(InterfaceC0051a interfaceC0051a, C0323Pd c0323Pd, Y7 y7, Z7 z7, l lVar, C0348Ud c0348Ud, boolean z4, int i4, String str, C0248Bc c0248Bc, Sh sh, BinderC0489cm binderC0489cm, boolean z5) {
        this.f3866o = null;
        this.f3867p = interfaceC0051a;
        this.f3868q = c0323Pd;
        this.f3869r = c0348Ud;
        this.f3858D = y7;
        this.f3870s = z7;
        this.f3871t = null;
        this.f3872u = z4;
        this.f3873v = null;
        this.f3874w = lVar;
        this.f3875x = i4;
        this.y = 3;
        this.f3876z = str;
        this.f3855A = c0248Bc;
        this.f3856B = null;
        this.f3857C = null;
        this.f3859E = null;
        this.f3860F = null;
        this.f3861G = null;
        this.f3862H = null;
        this.f3863I = sh;
        this.f3864J = binderC0489cm;
        this.f3865K = z5;
    }

    public AdOverlayInfoParcel(InterfaceC0051a interfaceC0051a, C0323Pd c0323Pd, Y7 y7, Z7 z7, l lVar, C0348Ud c0348Ud, boolean z4, int i4, String str, String str2, C0248Bc c0248Bc, Sh sh, BinderC0489cm binderC0489cm) {
        this.f3866o = null;
        this.f3867p = interfaceC0051a;
        this.f3868q = c0323Pd;
        this.f3869r = c0348Ud;
        this.f3858D = y7;
        this.f3870s = z7;
        this.f3871t = str2;
        this.f3872u = z4;
        this.f3873v = str;
        this.f3874w = lVar;
        this.f3875x = i4;
        this.y = 3;
        this.f3876z = null;
        this.f3855A = c0248Bc;
        this.f3856B = null;
        this.f3857C = null;
        this.f3859E = null;
        this.f3860F = null;
        this.f3861G = null;
        this.f3862H = null;
        this.f3863I = sh;
        this.f3864J = binderC0489cm;
        this.f3865K = false;
    }

    public AdOverlayInfoParcel(b bVar, InterfaceC0051a interfaceC0051a, g gVar, l lVar, C0248Bc c0248Bc, C0348Ud c0348Ud, Sh sh) {
        this.f3866o = bVar;
        this.f3867p = interfaceC0051a;
        this.f3868q = gVar;
        this.f3869r = c0348Ud;
        this.f3858D = null;
        this.f3870s = null;
        this.f3871t = null;
        this.f3872u = false;
        this.f3873v = null;
        this.f3874w = lVar;
        this.f3875x = -1;
        this.y = 4;
        this.f3876z = null;
        this.f3855A = c0248Bc;
        this.f3856B = null;
        this.f3857C = null;
        this.f3859E = null;
        this.f3860F = null;
        this.f3861G = null;
        this.f3862H = null;
        this.f3863I = sh;
        this.f3864J = null;
        this.f3865K = false;
    }

    public AdOverlayInfoParcel(b bVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z4, String str2, IBinder iBinder5, int i4, int i5, String str3, C0248Bc c0248Bc, String str4, h hVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z5) {
        this.f3866o = bVar;
        this.f3867p = (InterfaceC0051a) BinderC1813b.C2(BinderC1813b.G1(iBinder));
        this.f3868q = (g) BinderC1813b.C2(BinderC1813b.G1(iBinder2));
        this.f3869r = (InterfaceC0308Md) BinderC1813b.C2(BinderC1813b.G1(iBinder3));
        this.f3858D = (Y7) BinderC1813b.C2(BinderC1813b.G1(iBinder6));
        this.f3870s = (Z7) BinderC1813b.C2(BinderC1813b.G1(iBinder4));
        this.f3871t = str;
        this.f3872u = z4;
        this.f3873v = str2;
        this.f3874w = (l) BinderC1813b.C2(BinderC1813b.G1(iBinder5));
        this.f3875x = i4;
        this.y = i5;
        this.f3876z = str3;
        this.f3855A = c0248Bc;
        this.f3856B = str4;
        this.f3857C = hVar;
        this.f3859E = str5;
        this.f3860F = str6;
        this.f3861G = str7;
        this.f3862H = (Og) BinderC1813b.C2(BinderC1813b.G1(iBinder7));
        this.f3863I = (Sh) BinderC1813b.C2(BinderC1813b.G1(iBinder8));
        this.f3864J = (InterfaceC0947na) BinderC1813b.C2(BinderC1813b.G1(iBinder9));
        this.f3865K = z5;
    }

    public AdOverlayInfoParcel(Qk qk, C0348Ud c0348Ud, C0248Bc c0248Bc) {
        this.f3868q = qk;
        this.f3869r = c0348Ud;
        this.f3875x = 1;
        this.f3855A = c0248Bc;
        this.f3866o = null;
        this.f3867p = null;
        this.f3858D = null;
        this.f3870s = null;
        this.f3871t = null;
        this.f3872u = false;
        this.f3873v = null;
        this.f3874w = null;
        this.y = 1;
        this.f3876z = null;
        this.f3856B = null;
        this.f3857C = null;
        this.f3859E = null;
        this.f3860F = null;
        this.f3861G = null;
        this.f3862H = null;
        this.f3863I = null;
        this.f3864J = null;
        this.f3865K = false;
    }

    public AdOverlayInfoParcel(C0348Ud c0348Ud, C0248Bc c0248Bc, String str, String str2, InterfaceC0947na interfaceC0947na) {
        this.f3866o = null;
        this.f3867p = null;
        this.f3868q = null;
        this.f3869r = c0348Ud;
        this.f3858D = null;
        this.f3870s = null;
        this.f3871t = null;
        this.f3872u = false;
        this.f3873v = null;
        this.f3874w = null;
        this.f3875x = 14;
        this.y = 5;
        this.f3876z = null;
        this.f3855A = c0248Bc;
        this.f3856B = null;
        this.f3857C = null;
        this.f3859E = str;
        this.f3860F = str2;
        this.f3861G = null;
        this.f3862H = null;
        this.f3863I = null;
        this.f3864J = interfaceC0947na;
        this.f3865K = false;
    }

    public AdOverlayInfoParcel(C0443bi c0443bi, InterfaceC0308Md interfaceC0308Md, int i4, C0248Bc c0248Bc, String str, h hVar, String str2, String str3, String str4, Og og, BinderC0489cm binderC0489cm) {
        this.f3866o = null;
        this.f3867p = null;
        this.f3868q = c0443bi;
        this.f3869r = interfaceC0308Md;
        this.f3858D = null;
        this.f3870s = null;
        this.f3872u = false;
        if (((Boolean) r.d.c.a(AbstractC1066q6.f10308y0)).booleanValue()) {
            this.f3871t = null;
            this.f3873v = null;
        } else {
            this.f3871t = str2;
            this.f3873v = str3;
        }
        this.f3874w = null;
        this.f3875x = i4;
        this.y = 1;
        this.f3876z = null;
        this.f3855A = c0248Bc;
        this.f3856B = str;
        this.f3857C = hVar;
        this.f3859E = null;
        this.f3860F = null;
        this.f3861G = str4;
        this.f3862H = og;
        this.f3863I = null;
        this.f3864J = binderC0489cm;
        this.f3865K = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.U(parcel, 2, this.f3866o, i4);
        AbstractC1654b.T(parcel, 3, new BinderC1813b(this.f3867p));
        AbstractC1654b.T(parcel, 4, new BinderC1813b(this.f3868q));
        AbstractC1654b.T(parcel, 5, new BinderC1813b(this.f3869r));
        AbstractC1654b.T(parcel, 6, new BinderC1813b(this.f3870s));
        AbstractC1654b.V(parcel, 7, this.f3871t);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f3872u ? 1 : 0);
        AbstractC1654b.V(parcel, 9, this.f3873v);
        AbstractC1654b.T(parcel, 10, new BinderC1813b(this.f3874w));
        AbstractC1654b.f0(parcel, 11, 4);
        parcel.writeInt(this.f3875x);
        AbstractC1654b.f0(parcel, 12, 4);
        parcel.writeInt(this.y);
        AbstractC1654b.V(parcel, 13, this.f3876z);
        AbstractC1654b.U(parcel, 14, this.f3855A, i4);
        AbstractC1654b.V(parcel, 16, this.f3856B);
        AbstractC1654b.U(parcel, 17, this.f3857C, i4);
        AbstractC1654b.T(parcel, 18, new BinderC1813b(this.f3858D));
        AbstractC1654b.V(parcel, 19, this.f3859E);
        AbstractC1654b.V(parcel, 24, this.f3860F);
        AbstractC1654b.V(parcel, 25, this.f3861G);
        AbstractC1654b.T(parcel, 26, new BinderC1813b(this.f3862H));
        AbstractC1654b.T(parcel, 27, new BinderC1813b(this.f3863I));
        AbstractC1654b.T(parcel, 28, new BinderC1813b(this.f3864J));
        AbstractC1654b.f0(parcel, 29, 4);
        parcel.writeInt(this.f3865K ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
