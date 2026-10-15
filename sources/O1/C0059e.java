package O1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1033pa;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.C0990oa;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.InterfaceC1076qa;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059e extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1349b;
    public final /* synthetic */ BinderC0983o9 c;

    public C0059e(Context context, BinderC0983o9 binderC0983o9) {
        this.f1349b = context;
        this.c = binderC0983o9;
    }

    @Override // O1.AbstractC0079o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.N2(new BinderC1813b(this.f1349b), this.c, 234310000);
    }

    @Override // O1.AbstractC0079o
    public final Object c() {
        IInterface abstractC1106r4;
        Context context = this.f1349b;
        BinderC1813b binderC1813b = new BinderC1813b(context);
        try {
            try {
                IBinder b4 = AbstractC1230u.J(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i4 = AbstractBinderC1033pa.f9967o;
                if (b4 == null) {
                    abstractC1106r4 = null;
                } else {
                    IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    abstractC1106r4 = queryLocalInterface instanceof InterfaceC1076qa ? (InterfaceC1076qa) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 0);
                }
                return ((C0990oa) abstractC1106r4).W2(binderC1813b, this.c);
            } catch (RemoteException | C1464zc | NullPointerException unused) {
                return null;
            }
        } catch (Exception e4) {
            throw new Exception(e4);
        }
    }
}
