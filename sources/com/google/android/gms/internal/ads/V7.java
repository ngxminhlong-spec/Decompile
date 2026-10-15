package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V7 extends AbstractBinderC1149s4 implements I7 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Op f7235o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(Op op) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f7235o = op;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        C7 b7;
        if (i4 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            b7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            b7 = queryLocalInterface instanceof C7 ? (C7) queryLocalInterface : new B7(readStrongBinder);
        }
        AbstractC1192t4.b(parcel);
        q0(b7);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.I7
    public final void q0(C7 c7) {
        C0874ln c0874ln;
        String str;
        Op op = this.f7235o;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) op.f6525p;
        synchronized (op) {
            c0874ln = (C0874ln) op.f6527r;
            if (c0874ln == null) {
                c0874ln = new C0874ln(c7);
                op.f6527r = c0874ln;
            }
        }
        Op op2 = (Op) ((S1.l) eVar.f3848q);
        op2.getClass();
        h2.y.d("#008 Must be called on the main UI thread.");
        try {
            str = ((C7) c0874ln.f9467p).g();
        } catch (RemoteException e4) {
            Y9.q("", e4);
            str = null;
        }
        Y9.m("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        op2.f6527r = c0874ln;
        try {
            ((InterfaceC1283v9) op2.f6525p).n();
        } catch (RemoteException e5) {
            Y9.u("#007 Could not call remote method.", e5);
        }
    }
}
