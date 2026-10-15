package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import n2.BinderC1813b;
import o2.C1893d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Or {

    /* renamed from: a, reason: collision with root package name */
    public final Qr f6530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6531b = true;

    public Or(Qr qr) {
        this.f6530a = qr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.Qr] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static Or a(Context context, String str) {
        ?? r1;
        try {
            try {
                try {
                    IBinder b4 = C1893d.c(context, C1893d.f14315b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b4 == null) {
                        r1 = 0;
                    } else {
                        IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        r1 = queryLocalInterface instanceof Qr ? (Qr) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 0);
                    }
                    r1.G3(new BinderC1813b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new Or(r1);
                } catch (Exception e4) {
                    throw new Exception(e4);
                }
            } catch (Exception e5) {
                throw new Exception(e5);
            }
        } catch (RemoteException | Dr | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new Or(new Rr());
        }
    }
}
