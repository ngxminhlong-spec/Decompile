package com.google.android.gms.internal.ads;

import O1.InterfaceC0060e0;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818ka extends V1.c {

    /* renamed from: a, reason: collision with root package name */
    public final T7 f9289a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9290b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public C0818ka(T7 t7) {
        this.f9289a = t7;
        try {
            List s4 = t7.s();
            if (s4 != null) {
                for (Object obj : s4) {
                    InterfaceC1109r7 K32 = obj instanceof IBinder ? BinderC0682h7.K3((IBinder) obj) : null;
                    if (K32 != null) {
                        this.f9290b.add(new C0874ln(K32));
                    }
                }
            }
        } catch (RemoteException e4) {
            Y9.q("", e4);
        }
        try {
            List t4 = this.f9289a.t();
            if (t4 != null) {
                for (Object obj2 : t4) {
                    InterfaceC0060e0 K33 = obj2 instanceof IBinder ? O1.F0.K3((IBinder) obj2) : null;
                    if (K33 != null) {
                        this.c.add(new B0.f(K33));
                    }
                }
            }
        } catch (RemoteException e5) {
            Y9.q("", e5);
        }
        try {
            InterfaceC1109r7 k3 = this.f9289a.k();
            if (k3 != null) {
                new C0874ln(k3);
            }
        } catch (RemoteException e6) {
            Y9.q("", e6);
        }
        try {
            if (this.f9289a.g() != null) {
                new C0938n7(this.f9289a.g(), 1);
            }
        } catch (RemoteException e7) {
            Y9.q("", e7);
        }
    }
}
