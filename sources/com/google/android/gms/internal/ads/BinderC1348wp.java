package com.google.android.gms.internal.ads;

import O1.InterfaceC0084q0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1348wp extends AbstractBinderC1149s4 {

    /* renamed from: o, reason: collision with root package name */
    public final C1219tp f11208o;

    /* renamed from: p, reason: collision with root package name */
    public final C1133rp f11209p;

    /* renamed from: q, reason: collision with root package name */
    public final Fp f11210q;

    /* renamed from: r, reason: collision with root package name */
    public Hj f11211r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11212s;

    public BinderC1348wp(C1219tp c1219tp, C1133rp c1133rp, Fp fp) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f11212s = false;
        this.f11208o = c1219tp;
        this.f11209p = c1133rp;
        this.f11210q = fp;
    }

    public final synchronized void C3(InterfaceC1812a interfaceC1812a) {
        h2.y.d("pause must be called on the main UI thread.");
        if (this.f11211r != null) {
            Context context = interfaceC1812a == null ? null : (Context) BinderC1813b.C2(interfaceC1812a);
            Ug ug = this.f11211r.c;
            ug.getClass();
            ug.n1(new C0894m6(context, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        AbstractC1106r4 abstractC1106r4;
        InterfaceC0308Md interfaceC0308Md;
        if (i4 == 1) {
            C0776jb c0776jb = (C0776jb) AbstractC1192t4.a(parcel, C0776jb.CREATOR);
            AbstractC1192t4.b(parcel);
            L3(c0776jb);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 2) {
            p();
            parcel2.writeNoException();
            return true;
        }
        IInterface iInterface = null;
        if (i4 == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                iInterface = queryLocalInterface instanceof C0735ib ? (C0735ib) queryLocalInterface : new C0735ib(readStrongBinder);
            }
            AbstractC1192t4.b(parcel);
            h2.y.d("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f11209p.f10532s.set(iInterface);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 34) {
            boolean f4 = AbstractC1192t4.f(parcel);
            AbstractC1192t4.b(parcel);
            synchronized (this) {
                h2.y.d("setImmersiveMode must be called on the main UI thread.");
                this.f11212s = f4;
            }
            parcel2.writeNoException();
            return true;
        }
        int i5 = 0;
        switch (i4) {
            case 5:
                h2.y.d("isLoaded must be called on the main UI thread.");
                boolean P32 = P3();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(P32 ? 1 : 0);
                return true;
            case 6:
                C3(null);
                parcel2.writeNoException();
                return true;
            case 7:
                X1(null);
                parcel2.writeNoException();
                return true;
            case 8:
                K2(null);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                C3(G12);
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                X1(G13);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                K2(G14);
                parcel2.writeNoException();
                return true;
            case 12:
                String K32 = K3();
                parcel2.writeNoException();
                parcel2.writeString(K32);
                return true;
            case 13:
                String readString = parcel.readString();
                AbstractC1192t4.b(parcel);
                N3(readString);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    abstractC1106r4 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    abstractC1106r4 = queryLocalInterface2 instanceof O1.L ? (O1.L) queryLocalInterface2 : new AbstractC1106r4(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 0);
                }
                AbstractC1192t4.b(parcel);
                C1133rp c1133rp = this.f11209p;
                h2.y.d("setAdMetadataListener can only be called from the UI thread.");
                if (abstractC1106r4 == null) {
                    c1133rp.f10529p.set(null);
                } else {
                    c1133rp.f10529p.set(new C1262up(this, abstractC1106r4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                h2.y.d("getAdMetadata can only be called from the UI thread.");
                Hj hj = this.f11211r;
                Bundle b4 = hj != null ? hj.b() : new Bundle();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, b4);
                return true;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    iInterface = queryLocalInterface3 instanceof C0692hb ? (C0692hb) queryLocalInterface3 : new AbstractC1106r4(readStrongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 0);
                }
                AbstractC1192t4.b(parcel);
                h2.y.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f11209p.f10534u.set(iInterface);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                O3(G15);
                parcel2.writeNoException();
                return true;
            case 19:
                String readString2 = parcel.readString();
                AbstractC1192t4.b(parcel);
                M3(readString2);
                parcel2.writeNoException();
                return true;
            case 20:
                Hj hj2 = this.f11211r;
                if (hj2 != null && (interfaceC0308Md = (InterfaceC0308Md) hj2.f5481k.get()) != null && !interfaceC0308Md.l0()) {
                    i5 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeInt(i5);
                return true;
            case 21:
                InterfaceC0084q0 e4 = e();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, e4);
                return true;
            default:
                return false;
        }
    }

    public final synchronized void K2(InterfaceC1812a interfaceC1812a) {
        h2.y.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f11209p.f10529p.set(null);
        if (this.f11211r != null) {
            if (interfaceC1812a != null) {
                context = (Context) BinderC1813b.C2(interfaceC1812a);
            }
            Ug ug = this.f11211r.c;
            ug.getClass();
            ug.n1(new C0894m6(context, 3));
        }
    }

    public final synchronized String K3() {
        Fg fg;
        Hj hj = this.f11211r;
        if (hj == null || (fg = hj.f7861f) == null) {
            return null;
        }
        return fg.f5059o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.E4)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.internal.ads.Zf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void L3(com.google.android.gms.internal.ads.C0776jb r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            h2.y.d(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r6.f9162p     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.C4     // Catch: java.lang.Throwable -> L20
            O1.r r2 = O1.r.d     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.p6 r2 = r2.c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r6 = move-exception
            goto L67
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            N1.n r2 = N1.n.f1204A     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.pc r2 = r2.f1209g     // Catch: java.lang.Throwable -> L20
            r2.h(r1, r0)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r5.P3()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.E4     // Catch: java.lang.Throwable -> L20
            O1.r r1 = O1.r.d     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.p6 r1 = r1.c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r5)
            return
        L46:
            com.google.android.gms.internal.ads.Wo r0 = new com.google.android.gms.internal.ads.Wo     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r5.f11211r = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.tp r1 = r5.f11208o     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.Ip r2 = r1.f10749h     // Catch: java.lang.Throwable -> L20
            n0.n r2 = r2.f5739o     // Catch: java.lang.Throwable -> L20
            r3 = 1
            r2.f14098p = r3     // Catch: java.lang.Throwable -> L20
            O1.U0 r2 = r6.f9161o     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.f9162p     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.xi r3 = new com.google.android.gms.internal.ads.xi     // Catch: java.lang.Throwable -> L20
            r4 = 21
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r6, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return
        L67:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1348wp.L3(com.google.android.gms.internal.ads.jb):void");
    }

    public final synchronized void M3(String str) {
        h2.y.d("#008 Must be called on the main UI thread.: setCustomData");
        this.f11210q.f5087b = str;
    }

    public final synchronized void N3(String str) {
        h2.y.d("setUserId must be called on the main UI thread.");
        this.f11210q.f5086a = str;
    }

    public final synchronized void O3(InterfaceC1812a interfaceC1812a) {
        try {
            h2.y.d("showAd must be called on the main UI thread.");
            if (this.f11211r != null) {
                Activity activity = null;
                if (interfaceC1812a != null) {
                    Object C22 = BinderC1813b.C2(interfaceC1812a);
                    if (C22 instanceof Activity) {
                        activity = (Activity) C22;
                    }
                }
                this.f11211r.c(activity, this.f11212s);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean P3() {
        Hj hj = this.f11211r;
        if (hj != null) {
            if (!hj.f5486p.f8954p.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void X1(InterfaceC1812a interfaceC1812a) {
        h2.y.d("resume must be called on the main UI thread.");
        if (this.f11211r != null) {
            Context context = interfaceC1812a == null ? null : (Context) BinderC1813b.C2(interfaceC1812a);
            Ug ug = this.f11211r.c;
            ug.getClass();
            ug.n1(new C0536dr(context, 2));
        }
    }

    public final synchronized InterfaceC0084q0 e() {
        Hj hj;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.V5)).booleanValue() && (hj = this.f11211r) != null) {
            return hj.f7861f;
        }
        return null;
    }

    public final synchronized void p() {
        O3(null);
    }
}
