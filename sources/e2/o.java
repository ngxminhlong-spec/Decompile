package e2;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h2.y;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import s2.AbstractBinderC1979a;
import s2.AbstractC1980b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class o extends AbstractBinderC1979a implements h2.t {

    /* renamed from: p, reason: collision with root package name */
    public final int f12770p;

    public o(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        y.b(bArr.length == 25);
        this.f12770p = Arrays.hashCode(bArr);
    }

    public static byte[] G1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract byte[] C2();

    @Override // h2.t
    public final int e() {
        return this.f12770p;
    }

    public final boolean equals(Object obj) {
        InterfaceC1812a i4;
        if (obj != null && (obj instanceof h2.t)) {
            try {
                h2.t tVar = (h2.t) obj;
                if (tVar.e() == this.f12770p && (i4 = tVar.i()) != null) {
                    return Arrays.equals(C2(), (byte[]) BinderC1813b.C2(i4));
                }
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12770p;
    }

    @Override // h2.t
    public final InterfaceC1812a i() {
        return new BinderC1813b(C2());
    }

    @Override // s2.AbstractBinderC1979a
    public final boolean q1(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            InterfaceC1812a i5 = i();
            parcel2.writeNoException();
            AbstractC1980b.c(parcel2, i5);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f12770p);
        return true;
    }
}
