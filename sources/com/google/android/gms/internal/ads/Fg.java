package com.google.android.gms.internal.ads;

import O1.C0082p0;
import O1.InterfaceC0084q0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Fg extends AbstractBinderC1149s4 implements InterfaceC0084q0 {

    /* renamed from: o, reason: collision with root package name */
    public final String f5059o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5060p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5061q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5062r;

    /* renamed from: s, reason: collision with root package name */
    public final List f5063s;

    /* renamed from: t, reason: collision with root package name */
    public final long f5064t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5065u;

    /* renamed from: v, reason: collision with root package name */
    public final C0959nm f5066v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f5067w;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Fg(com.google.android.gms.internal.ads.C1434yp r3, java.lang.String r4, com.google.android.gms.internal.ads.C0959nm r5, com.google.android.gms.internal.ads.Ap r6, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            r2.<init>(r0)
            r0 = 0
            if (r3 != 0) goto La
            r1 = r0
            goto Lc
        La:
            java.lang.String r1 = r3.f11503b0
        Lc:
            r2.f5060p = r1
            r2.f5061q = r7
            if (r6 != 0) goto L14
            r7 = r0
            goto L16
        L14:
            java.lang.String r7 = r6.f3998b
        L16:
            r2.f5062r = r7
            java.lang.String r7 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L28
            java.lang.String r7 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L30
        L28:
            org.json.JSONObject r3 = r3.f11539v     // Catch: org.json.JSONException -> L30
            java.lang.String r7 = "class_name"
            java.lang.String r0 = r3.getString(r7)     // Catch: org.json.JSONException -> L30
        L30:
            if (r0 == 0) goto L33
            r4 = r0
        L33:
            r2.f5059o = r4
            java.util.List r3 = r5.f9773a
            r2.f5063s = r3
            r2.f5066v = r5
            N1.n r3 = N1.n.f1204A
            l2.a r3 = r3.f1212j
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r2.f5064t = r3
            com.google.android.gms.internal.ads.n6 r3 = com.google.android.gms.internal.ads.AbstractC1066q6.Y5
            O1.r r4 = O1.r.d
            com.google.android.gms.internal.ads.p6 r5 = r4.c
            java.lang.Object r3 = r5.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L64
            if (r6 == 0) goto L64
            android.os.Bundle r3 = r6.f4004j
            r2.f5067w = r3
            goto L6b
        L64:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.f5067w = r3
        L6b:
            com.google.android.gms.internal.ads.n6 r3 = com.google.android.gms.internal.ads.AbstractC1066q6.g8
            com.google.android.gms.internal.ads.p6 r4 = r4.c
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L85
            if (r6 == 0) goto L85
            java.lang.String r3 = r6.f4002h
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L87
        L85:
            java.lang.String r3 = ""
        L87:
            r2.f5065u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Fg.<init>(com.google.android.gms.internal.ads.yp, java.lang.String, com.google.android.gms.internal.ads.nm, com.google.android.gms.internal.ads.Ap, java.lang.String):void");
    }

    public static InterfaceC0084q0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof InterfaceC0084q0 ? (InterfaceC0084q0) queryLocalInterface : new C0082p0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f5059o);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f5060p);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f5063s);
                return true;
            case 4:
                O1.Z0 d = d();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, d);
                return true;
            case 5:
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, this.f5067w);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f5061q);
                return true;
            default:
                return false;
        }
    }

    @Override // O1.InterfaceC0084q0
    public final Bundle a() {
        return this.f5067w;
    }

    @Override // O1.InterfaceC0084q0
    public final O1.Z0 d() {
        C0959nm c0959nm = this.f5066v;
        if (c0959nm != null) {
            return c0959nm.f9776f;
        }
        return null;
    }

    @Override // O1.InterfaceC0084q0
    public final String f() {
        return this.f5061q;
    }

    @Override // O1.InterfaceC0084q0
    public final String g() {
        return this.f5060p;
    }

    @Override // O1.InterfaceC0084q0
    public final String h() {
        return this.f5059o;
    }

    @Override // O1.InterfaceC0084q0
    public final List j() {
        return this.f5063s;
    }
}
