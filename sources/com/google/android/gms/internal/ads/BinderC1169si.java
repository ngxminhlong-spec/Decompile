package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1169si extends AbstractBinderC1149s4 implements InterfaceC1024p7 {

    /* renamed from: o, reason: collision with root package name */
    public final Ci f10622o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1812a f10623p;

    public BinderC1169si(Ci ci) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f10622o = ci;
    }

    public static float K3(InterfaceC1812a interfaceC1812a) {
        Drawable drawable;
        if (interfaceC1812a == null || (drawable = (Drawable) BinderC1813b.C2(interfaceC1812a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC0308Md interfaceC0308Md;
        InterfaceC1109r7 interfaceC1109r7 = null;
        J7 j7 = null;
        interfaceC1109r7 = null;
        interfaceC1109r7 = null;
        float f4 = 0.0f;
        int i5 = 0;
        switch (i4) {
            case 2:
                Ci ci = this.f10622o;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.u5)).booleanValue()) {
                    if (ci.C() != 0.0f) {
                        f4 = ci.C();
                    } else if (ci.J() != null) {
                        try {
                            f4 = ci.J().a();
                        } catch (RemoteException e4) {
                            Y9.q("Remote exception getting video controller aspect ratio.", e4);
                        }
                    } else {
                        InterfaceC1812a interfaceC1812a = this.f10623p;
                        if (interfaceC1812a != null) {
                            f4 = K3(interfaceC1812a);
                        } else {
                            List list = ci.f4504e;
                            if (list != null && !list.isEmpty()) {
                                Object obj = ci.f4504e.get(0);
                                if (obj instanceof IBinder) {
                                    interfaceC1109r7 = BinderC0682h7.K3((IBinder) obj);
                                }
                            }
                            if (interfaceC1109r7 != null) {
                                float i6 = (interfaceC1109r7.i() == -1 || interfaceC1109r7.e() == -1) ? 0.0f : interfaceC1109r7.i() / interfaceC1109r7.e();
                                f4 = i6 == 0.0f ? K3(interfaceC1109r7.d()) : i6;
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f4);
                return true;
            case 3:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                this.f10623p = G12;
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC1812a g4 = g();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, g4);
                return true;
            case 5:
                Ci ci2 = this.f10622o;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.v5)).booleanValue() && ci2.J() != null) {
                    f4 = ci2.J().h();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f4);
                return true;
            case 6:
                Ci ci3 = this.f10622o;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.v5)).booleanValue() && ci3.J() != null) {
                    f4 = ci3.J().d();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f4);
                return true;
            case 7:
                InterfaceC0089t0 J4 = ((Boolean) O1.r.d.c.a(AbstractC1066q6.v5)).booleanValue() ? this.f10622o.J() : null;
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, J4);
                return true;
            case 8:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.v5)).booleanValue() && this.f10622o.J() != null) {
                    i5 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(i5);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    j7 = queryLocalInterface instanceof J7 ? (J7) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 0);
                }
                AbstractC1192t4.b(parcel);
                L3(j7);
                parcel2.writeNoException();
                return true;
            case 10:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.v5)).booleanValue()) {
                    Ci ci4 = this.f10622o;
                    synchronized (ci4) {
                        interfaceC0308Md = ci4.f4509j;
                    }
                    if (interfaceC0308Md != null) {
                        i5 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeInt(i5);
                return true;
            default:
                return false;
        }
    }

    public final void L3(J7 j7) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.v5)).booleanValue() && (this.f10622o.J() instanceof BinderC0368Yd)) {
            BinderC0368Yd binderC0368Yd = (BinderC0368Yd) this.f10622o.J();
            synchronized (binderC0368Yd.f7846p) {
                binderC0368Yd.f7844B = j7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1024p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n2.InterfaceC1812a g() {
        /*
            r3 = this;
            n2.a r0 = r3.f10623p
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.ads.Ci r0 = r3.f10622o
            java.util.List r1 = r0.f4504e
            r2 = 0
            if (r1 == 0) goto L25
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            goto L25
        L13:
            java.util.List r0 = r0.f4504e
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof android.os.IBinder
            if (r1 == 0) goto L25
            android.os.IBinder r0 = (android.os.IBinder) r0
            com.google.android.gms.internal.ads.r7 r0 = com.google.android.gms.internal.ads.BinderC0682h7.K3(r0)
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 != 0) goto L29
            return r2
        L29:
            n2.a r0 = r0.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1169si.g():n2.a");
    }
}
