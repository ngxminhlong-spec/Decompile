package c0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import q2.AbstractC1960a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0225f extends Binder implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3513o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3514p;

    public BinderC0225f(A2.i iVar) {
        this.f3514p = iVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public BinderC0225f(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3514p = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public void O(int i4, String[] strArr) {
        synchronized (((MultiInstanceInvalidationService) this.f3514p).f3116q) {
            try {
                String str = (String) ((MultiInstanceInvalidationService) this.f3514p).f3115p.get(Integer.valueOf(i4));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = ((MultiInstanceInvalidationService) this.f3514p).f3116q.beginBroadcast();
                for (int i5 = 0; i5 < beginBroadcast; i5++) {
                    try {
                        Integer num = (Integer) ((MultiInstanceInvalidationService) this.f3514p).f3116q.getBroadcastCookie(i5);
                        int intValue = num.intValue();
                        String str2 = (String) ((MultiInstanceInvalidationService) this.f3514p).f3115p.get(num);
                        if (i4 != intValue && str.equals(str2)) {
                            try {
                                ((C0221b) ((MultiInstanceInvalidationService) this.f3514p).f3116q.getBroadcastItem(i5)).O(strArr);
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                    } finally {
                        ((MultiInstanceInvalidationService) this.f3514p).f3116q.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int Q(C0221b c0221b, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (((MultiInstanceInvalidationService) this.f3514p).f3116q) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f3514p;
                int i4 = multiInstanceInvalidationService.f3114o + 1;
                multiInstanceInvalidationService.f3114o = i4;
                if (multiInstanceInvalidationService.f3116q.register(c0221b, Integer.valueOf(i4))) {
                    ((MultiInstanceInvalidationService) this.f3514p).f3115p.put(Integer.valueOf(i4), str);
                    return i4;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.f3514p;
                multiInstanceInvalidationService2.f3114o--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i4 = this.f3513o;
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, c0.b] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, c0.b] */
    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        C0221b c0221b = null;
        C0221b c0221b2 = null;
        switch (this.f3513o) {
            case 0:
                if (i4 == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C0221b)) {
                            ?? obj = new Object();
                            obj.f3503o = readStrongBinder;
                            c0221b = obj;
                        } else {
                            c0221b = (C0221b) queryLocalInterface;
                        }
                    }
                    int Q3 = Q(c0221b, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(Q3);
                    return true;
                }
                if (i4 != 2) {
                    if (i4 == 3) {
                        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                        O(parcel.readInt(), parcel.createStringArray());
                        return true;
                    }
                    if (i4 != 1598968902) {
                        return super.onTransact(i4, parcel, parcel2, i5);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C0221b)) {
                        ?? obj2 = new Object();
                        obj2.f3503o = readStrongBinder2;
                        c0221b2 = obj2;
                    } else {
                        c0221b2 = (C0221b) queryLocalInterface2;
                    }
                }
                int readInt = parcel.readInt();
                synchronized (((MultiInstanceInvalidationService) this.f3514p).f3116q) {
                    ((MultiInstanceInvalidationService) this.f3514p).f3116q.unregister(c0221b2);
                    ((MultiInstanceInvalidationService) this.f3514p).f3115p.remove(Integer.valueOf(readInt));
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                if (i4 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i6 = AbstractC1960a.f14704a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                b2.c createFromParcel2 = parcel.readInt() == 0 ? null : b2.c.CREATOR.createFromParcel(parcel);
                b2.b bVar = createFromParcel2 != null ? new b2.b(createFromParcel2.f3493o, createFromParcel2.f3494p) : null;
                A2.i iVar = (A2.i) this.f3514p;
                if (createFromParcel.f3898o <= 0) {
                    iVar.b(bVar);
                    return true;
                }
                iVar.a(createFromParcel.f3900q != null ? new f2.d(createFromParcel) : new f2.d(createFromParcel));
                return true;
        }
    }
}
