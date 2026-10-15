package O1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082p0 extends AbstractC1106r4 implements InterfaceC0084q0 {
    public C0082p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 0);
    }

    @Override // O1.InterfaceC0084q0
    public final Bundle a() {
        Parcel q12 = q1(Q(), 5);
        Bundle bundle = (Bundle) AbstractC1192t4.a(q12, Bundle.CREATOR);
        q12.recycle();
        return bundle;
    }

    @Override // O1.InterfaceC0084q0
    public final Z0 d() {
        Parcel q12 = q1(Q(), 4);
        Z0 z02 = (Z0) AbstractC1192t4.a(q12, Z0.CREATOR);
        q12.recycle();
        return z02;
    }

    @Override // O1.InterfaceC0084q0
    public final String f() {
        Parcel q12 = q1(Q(), 6);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // O1.InterfaceC0084q0
    public final String g() {
        Parcel q12 = q1(Q(), 2);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // O1.InterfaceC0084q0
    public final String h() {
        Parcel q12 = q1(Q(), 1);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // O1.InterfaceC0084q0
    public final List j() {
        Parcel q12 = q1(Q(), 3);
        ArrayList createTypedArrayList = q12.createTypedArrayList(Z0.CREATOR);
        q12.recycle();
        return createTypedArrayList;
    }
}
