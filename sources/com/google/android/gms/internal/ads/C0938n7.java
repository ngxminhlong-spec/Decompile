package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938n7 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9716a;

    public C0938n7(InterfaceC0895m7 interfaceC0895m7, int i4) {
        InterfaceC1109r7 interfaceC1109r7;
        switch (i4) {
            case 1:
                this.f9716a = new ArrayList();
                try {
                    interfaceC0895m7.h();
                } catch (RemoteException e4) {
                    Y9.q("", e4);
                }
                try {
                    ArrayList f4 = interfaceC0895m7.f();
                    int size = f4.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = f4.get(i5);
                        i5++;
                        InterfaceC1109r7 K32 = obj instanceof IBinder ? BinderC0682h7.K3((IBinder) obj) : null;
                        if (K32 != null) {
                            this.f9716a.add(new C0874ln(K32));
                        }
                    }
                    return;
                } catch (RemoteException e5) {
                    Y9.q("", e5);
                    return;
                }
            default:
                this.f9716a = new ArrayList();
                try {
                    interfaceC0895m7.h();
                } catch (RemoteException e6) {
                    Y9.q("", e6);
                }
                try {
                    ArrayList f5 = interfaceC0895m7.f();
                    int size2 = f5.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = f5.get(i6);
                        i6++;
                        if (obj2 instanceof IBinder) {
                            IBinder iBinder = (IBinder) obj2;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            interfaceC1109r7 = queryLocalInterface instanceof InterfaceC1109r7 ? (InterfaceC1109r7) queryLocalInterface : new C1067q7(iBinder);
                        } else {
                            interfaceC1109r7 = null;
                        }
                        if (interfaceC1109r7 != null) {
                            this.f9716a.add(new C1152s7(interfaceC1109r7));
                        }
                    }
                    return;
                } catch (RemoteException e7) {
                    Y9.q("", e7);
                    return;
                }
        }
    }
}
