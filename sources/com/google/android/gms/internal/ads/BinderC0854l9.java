package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C1509e0;
import java.util.List;
import java.util.Map;
import k.C1748e;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0854l9 extends AbstractBinderC1149s4 implements InterfaceC0609fe {

    /* renamed from: o, reason: collision with root package name */
    public final C1748e f9378o;

    public BinderC0854l9(C1748e c1748e) {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
        this.f9378o = c1748e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        int i5 = 1;
        Object[] objArr = 0;
        boolean z4 = true;
        C1748e c1748e = this.f9378o;
        switch (i4) {
            case 1:
                Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e0 = (C1509e0) c1748e.f13386p;
                c1509e0.b(new com.google.android.gms.internal.measurement.V(c1509e0, bundle, new com.google.android.gms.internal.measurement.D()));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e02 = (C1509e0) c1748e.f13386p;
                com.google.android.gms.internal.measurement.D d = new com.google.android.gms.internal.measurement.D();
                c1509e02.b(new com.google.android.gms.internal.measurement.V(c1509e02, bundle2, d));
                Bundle Q3 = d.Q(5000L);
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, Q3);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e03 = (C1509e0) c1748e.f13386p;
                c1509e03.b(new com.google.android.gms.internal.measurement.Y(c1509e03, readString, readString2, bundle3, true, 1));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                Object C22 = G12 != null ? BinderC1813b.C2(G12) : null;
                C1509e0 c1509e04 = (C1509e0) c1748e.f13386p;
                c1509e04.b(new com.google.android.gms.internal.measurement.Y(c1509e04, readString3, readString4, C22, z4, 2));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                boolean z5 = parcel.readInt() != 0;
                AbstractC1192t4.b(parcel);
                Map g4 = ((C1509e0) c1748e.f13386p).g(readString5, readString6, z5);
                parcel2.writeNoException();
                parcel2.writeMap(g4);
                return true;
            case 6:
                String readString7 = parcel.readString();
                AbstractC1192t4.b(parcel);
                int c = ((C1509e0) c1748e.f13386p).c(readString7);
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e05 = (C1509e0) c1748e.f13386p;
                c1509e05.b(new com.google.android.gms.internal.measurement.Q(c1509e05, bundle4, objArr == true ? 1 : 0));
                parcel2.writeNoException();
                return true;
            case 8:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Bundle bundle5 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e06 = (C1509e0) c1748e.f13386p;
                c1509e06.b(new com.google.android.gms.internal.measurement.S(c1509e06, readString8, readString9, bundle5, 0));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                AbstractC1192t4.b(parcel);
                List f4 = ((C1509e0) c1748e.f13386p).f(readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeList(f4);
                return true;
            case 10:
                C1509e0 c1509e07 = (C1509e0) c1748e.f13386p;
                com.google.android.gms.internal.measurement.D d4 = new com.google.android.gms.internal.measurement.D();
                c1509e07.b(new com.google.android.gms.internal.measurement.X(c1509e07, d4, 1));
                String str = (String) com.google.android.gms.internal.measurement.D.a0(d4.Q(50L), String.class);
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                C1509e0 c1509e08 = (C1509e0) c1748e.f13386p;
                com.google.android.gms.internal.measurement.D d5 = new com.google.android.gms.internal.measurement.D();
                c1509e08.b(new com.google.android.gms.internal.measurement.X(c1509e08, d5, 0));
                String str2 = (String) com.google.android.gms.internal.measurement.D.a0(d5.Q(500L), String.class);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 12:
                long d6 = ((C1509e0) c1748e.f13386p).d();
                parcel2.writeNoException();
                parcel2.writeLong(d6);
                return true;
            case 13:
                String readString12 = parcel.readString();
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e09 = (C1509e0) c1748e.f13386p;
                c1509e09.b(new com.google.android.gms.internal.measurement.T(c1509e09, readString12, i5));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString13 = parcel.readString();
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e010 = (C1509e0) c1748e.f13386p;
                c1509e010.b(new com.google.android.gms.internal.measurement.T(c1509e010, readString13, 2));
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                AbstractC1192t4.b(parcel);
                Activity activity = G13 != null ? (Activity) BinderC1813b.C2(G13) : null;
                C1509e0 c1509e011 = (C1509e0) c1748e.f13386p;
                c1509e011.b(new com.google.android.gms.internal.measurement.S(c1509e011, activity, readString14, readString15));
                parcel2.writeNoException();
                return true;
            case 16:
                C1509e0 c1509e012 = (C1509e0) c1748e.f13386p;
                com.google.android.gms.internal.measurement.D d7 = new com.google.android.gms.internal.measurement.D();
                c1509e012.b(new com.google.android.gms.internal.measurement.X(c1509e012, d7, 3));
                String str3 = (String) com.google.android.gms.internal.measurement.D.a0(d7.Q(500L), String.class);
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 17:
                C1509e0 c1509e013 = (C1509e0) c1748e.f13386p;
                com.google.android.gms.internal.measurement.D d8 = new com.google.android.gms.internal.measurement.D();
                c1509e013.b(new com.google.android.gms.internal.measurement.X(c1509e013, d8, 4));
                String str4 = (String) com.google.android.gms.internal.measurement.D.a0(d8.Q(500L), String.class);
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 18:
                String str5 = ((C1509e0) c1748e.f13386p).f11910e;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                C1509e0 c1509e014 = (C1509e0) c1748e.f13386p;
                c1509e014.b(new com.google.android.gms.internal.measurement.Q(c1509e014, bundle6, i5));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
