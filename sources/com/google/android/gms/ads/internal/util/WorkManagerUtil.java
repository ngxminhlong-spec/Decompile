package com.google.android.gms.ads.internal.util;

import Q1.x;
import V2.e;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.Y9;
import java.util.HashMap;
import java.util.HashSet;
import n0.c;
import n0.f;
import n0.g;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import o0.l;
import w0.i;
import x0.b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class WorkManagerUtil extends AbstractBinderC1149s4 implements x {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            zze(G12);
            parcel2.writeNoException();
            return true;
        }
        InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AbstractC1192t4.b(parcel);
        boolean zzf = zzf(G13, readString, readString2);
        parcel2.writeNoException();
        parcel2.writeInt(zzf ? 1 : 0);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, n0.d] */
    @Override // Q1.x
    public final void zze(InterfaceC1812a interfaceC1812a) {
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        try {
            l.O(context.getApplicationContext(), new c(new e(22)));
        } catch (IllegalStateException unused) {
        }
        try {
            l N = l.N(context);
            N.f14176o.c(new b(N, 0));
            f fVar = new f();
            ?? obj = new Object();
            obj.f14080a = 1;
            obj.f14083f = -1L;
            obj.f14084g = -1L;
            obj.f14085h = new f();
            obj.f14081b = false;
            int i4 = Build.VERSION.SDK_INT;
            obj.c = false;
            obj.f14080a = 2;
            obj.d = false;
            obj.f14082e = false;
            if (i4 >= 24) {
                obj.f14085h = fVar;
                obj.f14083f = -1L;
                obj.f14084g = -1L;
            }
            q2.e eVar = new q2.e(OfflinePingSender.class);
            ((i) eVar.f14710q).f15122j = obj;
            ((HashSet) eVar.f14711r).add("offline_ping_sender_work");
            N.k(eVar.i());
        } catch (IllegalStateException e4) {
            Y9.t("Failed to instantiate WorkManager.", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, n0.d] */
    @Override // Q1.x
    public final boolean zzf(InterfaceC1812a interfaceC1812a, String str, String str2) {
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        try {
            l.O(context.getApplicationContext(), new c(new e(22)));
        } catch (IllegalStateException unused) {
        }
        f fVar = new f();
        ?? obj = new Object();
        obj.f14080a = 1;
        obj.f14083f = -1L;
        obj.f14084g = -1L;
        obj.f14085h = new f();
        obj.f14081b = false;
        int i4 = Build.VERSION.SDK_INT;
        obj.c = false;
        obj.f14080a = 2;
        obj.d = false;
        obj.f14082e = false;
        if (i4 >= 24) {
            obj.f14085h = fVar;
            obj.f14083f = -1L;
            obj.f14084g = -1L;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        g gVar = new g(hashMap);
        g.b(gVar);
        q2.e eVar = new q2.e(OfflineNotificationPoster.class);
        i iVar = (i) eVar.f14710q;
        iVar.f15122j = obj;
        iVar.f15117e = gVar;
        ((HashSet) eVar.f14711r).add("offline_notification_work");
        try {
            l.N(context).k(eVar.i());
            return true;
        } catch (IllegalStateException e4) {
            Y9.t("Failed to instantiate WorkManager.", e4);
            return false;
        }
    }
}
