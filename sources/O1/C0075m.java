package O1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1119rb;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.C1077qb;
import com.google.android.gms.internal.ads.C1334wb;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.InterfaceC1162sb;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075m extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1367b;
    public final /* synthetic */ String c;
    public final /* synthetic */ BinderC0983o9 d;

    public C0075m(Context context, String str, BinderC0983o9 binderC0983o9) {
        this.f1367b = context;
        this.c = str;
        this.d = binderC0983o9;
    }

    @Override // O1.AbstractC0079o
    public final Object a() {
        C0077n.d(this.f1367b, "rewarded");
        return new AbstractBinderC1119rb();
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.E1(new BinderC1813b(this.f1367b), this.c, this.d, 234310000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O1.AbstractC0079o
    public final Object c() {
        C1334wb c1334wb;
        String str = this.c;
        BinderC0983o9 binderC0983o9 = this.d;
        Context context = this.f1367b;
        BinderC1813b binderC1813b = new BinderC1813b(context);
        try {
            try {
                IBinder b4 = AbstractC1230u.J(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (b4 == null) {
                    c1334wb = 0;
                } else {
                    IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    c1334wb = queryLocalInterface instanceof C1334wb ? (C1334wb) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 0);
                }
                IBinder W22 = c1334wb.W2(binderC1813b, str, binderC0983o9);
                if (W22 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = W22.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return queryLocalInterface2 instanceof InterfaceC1162sb ? (InterfaceC1162sb) queryLocalInterface2 : new C1077qb(W22);
            } catch (Exception e4) {
                throw new Exception(e4);
            }
        } catch (RemoteException e5) {
            e = e5;
            Y9.u("#007 Could not call remote method.", e);
            return null;
        } catch (C1464zc e6) {
            e = e6;
            Y9.u("#007 Could not call remote method.", e);
            return null;
        }
    }
}
