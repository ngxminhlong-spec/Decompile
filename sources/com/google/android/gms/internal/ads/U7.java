package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U7 extends AbstractBinderC1149s4 implements G7 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Op f7144o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7(Op op) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f7144o = op;
    }

    @Override // com.google.android.gms.internal.ads.G7
    public final void G0(C7 c7, String str) {
        C0874ln c0874ln;
        Op op = this.f7144o;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) op.f6526q;
        if (eVar == null) {
            return;
        }
        synchronized (op) {
            c0874ln = (C0874ln) op.f6527r;
            if (c0874ln == null) {
                c0874ln = new C0874ln(c7);
                op.f6527r = c0874ln;
            }
        }
        Op op2 = (Op) ((S1.l) eVar.f3848q);
        op2.getClass();
        try {
            ((InterfaceC1283v9) op2.f6525p).L0((C7) c0874ln.f9467p, str);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
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
        String readString = parcel.readString();
        AbstractC1192t4.b(parcel);
        G0(b7, readString);
        parcel2.writeNoException();
        return true;
    }
}
