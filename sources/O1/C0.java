package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.C1325w8;
import com.google.android.gms.internal.ads.Kk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C0 extends AbstractBinderC1149s4 implements A8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1265o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1266p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(int i4, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f1265o = i4;
        this.f1266p = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C1325w8.CREATOR);
        AbstractC1192t4.b(parcel);
        Q1(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.A8
    public final void Q1(List list) {
        int i4;
        ArrayList arrayList;
        switch (this.f1265o) {
            case 0:
                synchronized (((D0) this.f1266p).f1268a) {
                    D0 d02 = (D0) this.f1266p;
                    d02.f1269b = false;
                    d02.c = true;
                    arrayList = new ArrayList((ArrayList) ((D0) this.f1266p).f1270e);
                    ((ArrayList) ((D0) this.f1266p).f1270e).clear();
                }
                D0.o(list);
                int size = arrayList.size();
                for (i4 = 0; i4 < size; i4++) {
                    ((C0.K) arrayList.get(i4)).a();
                }
                return;
            default:
                ((Kk) this.f1266p).b(list);
                return;
        }
    }
}
