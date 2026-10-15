package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Un implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7183a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7184b;
    public final Object c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7185e;

    public Un(Context context, Su su, Jp jp, C0248Bc c0248Bc) {
        this.f7183a = 6;
        this.d = context;
        this.f7184b = su;
        this.c = jp;
        this.f7185e = c0248Bc;
    }

    public /* synthetic */ Un(Su su, Object obj, Object obj2, String str, int i4) {
        this.f7183a = i4;
        this.f7184b = su;
        this.d = obj;
        this.c = obj2;
        this.f7185e = str;
    }

    public /* synthetic */ Un(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f7183a = i4;
        this.f7184b = obj;
        this.c = obj2;
        this.d = obj3;
        this.f7185e = obj4;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f7183a) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 9;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        Xn xn;
        switch (this.f7183a) {
            case 0:
                return Bs.m0(((C0832ko) this.f7184b).c(), new C0563eb(4, this), AbstractC0266Ec.f4900f);
            case 1:
                Yn yn = (Yn) this.f7185e;
                C0937n6 c0937n6 = AbstractC1066q6.R9;
                O1.r rVar = O1.r.d;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue() && (xn = yn.f7887b) != null) {
                    return Bs.h0(xn);
                }
                if (Ds.a((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10216e1)) || (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n6)).booleanValue() && (yn.f7886a.get() || !((Ck) this.d).f4526b))) {
                    return Bs.h0(new Xn(0, new Bundle()));
                }
                yn.f7886a.set(true);
                return ((C0260Dc) ((Su) this.f7184b)).b(new CallableC0336Sb(8, this));
            case 2:
                return ((C0260Dc) ((Su) this.f7184b)).b(new CallableC0336Sb(9, this));
            case 3:
                return ((C0260Dc) ((Su) this.f7184b)).b(new CallableC0336Sb(12, this));
            case 4:
                return ((C0260Dc) ((Su) this.f7184b)).b(new CallableC0336Sb(15, this));
            case 5:
                return ((C0260Dc) ((Su) this.f7184b)).b(new CallableC0336Sb(17, this));
            case 6:
                return ((C0260Dc) ((Su) this.f7184b)).b(new CallableC0336Sb(19, this));
            default:
                return ((C0260Dc) ((Su) this.f7184b)).b(new CallableC0336Sb(21, this));
        }
    }
}
