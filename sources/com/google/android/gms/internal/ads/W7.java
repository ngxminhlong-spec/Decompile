package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W7 extends AbstractBinderC1149s4 implements M7 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7347o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f7348p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7(int i4, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f7347o = i4;
        this.f7348p = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        T7 abstractC1106r4;
        if (i4 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            abstractC1106r4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            abstractC1106r4 = queryLocalInterface instanceof T7 ? (T7) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 0);
        }
        AbstractC1192t4.b(parcel);
        v0(abstractC1106r4);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:6|(2:7|8)|9|(2:10|11)|12|(2:13|14)|15|(2:16|17)|18|(2:19|20)|(4:(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|101)|51|52|54)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(34:6|7|8|9|(2:10|11)|12|(2:13|14)|15|16|17|18|19|20|(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|101)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|51|52|54) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:6|7|8|9|10|11|12|(2:13|14)|15|16|17|18|19|20|(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|101)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|51|52|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("Exception occurred while getting video controller", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b5, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a2, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("", r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0096, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0097, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: RemoteException -> 0x00b4, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x00b4, blocks: (B:31:0x00a9, B:33:0x00af), top: B:30:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: RemoteException -> 0x00d1, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d1, blocks: (B:37:0x00c3, B:39:0x00c9), top: B:36:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.ads.mediation.a] */
    @Override // com.google.android.gms.internal.ads.M7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(com.google.android.gms.internal.ads.T7 r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W7.v0(com.google.android.gms.internal.ads.T7):void");
    }
}
