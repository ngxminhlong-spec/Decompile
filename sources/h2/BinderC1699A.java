package h2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import q2.C1961b;
import s2.AbstractBinderC1979a;
import s2.AbstractC1980b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1699A extends AbstractBinderC1979a {

    /* renamed from: p, reason: collision with root package name */
    public AbstractC1706e f13133p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13134q;

    public BinderC1699A(AbstractC1706e abstractC1706e, int i4) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f13133p = abstractC1706e;
        this.f13134q = i4;
    }

    @Override // s2.AbstractBinderC1979a
    public final boolean q1(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC1980b.a(parcel, Bundle.CREATOR);
            AbstractC1980b.b(parcel);
            y.j(this.f13133p, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC1706e abstractC1706e = this.f13133p;
            int i5 = this.f13134q;
            abstractC1706e.getClass();
            C1701C c1701c = new C1701C(abstractC1706e, readInt, readStrongBinder, bundle);
            z zVar = abstractC1706e.f13179t;
            zVar.sendMessage(zVar.obtainMessage(1, i5, -1, c1701c));
            this.f13133p = null;
        } else if (i4 == 2) {
            parcel.readInt();
            AbstractC1980b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i4 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            E e4 = (E) AbstractC1980b.a(parcel, E.CREATOR);
            AbstractC1980b.b(parcel);
            AbstractC1706e abstractC1706e2 = this.f13133p;
            y.j(abstractC1706e2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y.i(e4);
            abstractC1706e2.f13172J = e4;
            if (abstractC1706e2 instanceof C1961b) {
                C1707f c1707f = e4.f13143r;
                k b4 = k.b();
                l lVar = c1707f == null ? null : c1707f.f13185o;
                synchronized (b4) {
                    if (lVar == null) {
                        lVar = k.f13217q;
                    } else {
                        l lVar2 = (l) b4.f13218o;
                        if (lVar2 != null) {
                            if (lVar2.f13219o < lVar.f13219o) {
                            }
                        }
                    }
                    b4.f13218o = lVar;
                }
            }
            Bundle bundle2 = e4.f13140o;
            y.j(this.f13133p, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC1706e abstractC1706e3 = this.f13133p;
            int i6 = this.f13134q;
            abstractC1706e3.getClass();
            C1701C c1701c2 = new C1701C(abstractC1706e3, readInt2, readStrongBinder2, bundle2);
            z zVar2 = abstractC1706e3.f13179t;
            zVar2.sendMessage(zVar2.obtainMessage(1, i6, -1, c1701c2));
            this.f13133p = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
