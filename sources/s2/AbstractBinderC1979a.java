package s2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.Jn;
import g2.u;
import r2.AbstractC1967a;
import z2.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1979a extends Binder implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14798o = 1;

    public /* synthetic */ AbstractBinderC1979a() {
    }

    public AbstractBinderC1979a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i4 = this.f14798o;
        return this;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001a. Please report as an issue. */
    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        switch (this.f14798o) {
            case 0:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return q1(i4, parcel, parcel2);
            default:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                switch (i4) {
                    case 3:
                        AbstractC1967a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        AbstractC1967a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        AbstractC1967a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        AbstractC1967a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        e eVar = (e) AbstractC1967a.a(parcel, e.CREATOR);
                        AbstractC1967a.b(parcel);
                        u uVar = (u) this;
                        uVar.f13031q.post(new Jn(uVar, eVar, 18, false));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        AbstractC1967a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                }
        }
    }

    public boolean q1(int i4, Parcel parcel, Parcel parcel2) {
        return false;
    }
}
