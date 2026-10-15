package h2;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import i2.AbstractC1717a;
import s2.AbstractC1980b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708g extends AbstractC1717a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f13193A;

    /* renamed from: B, reason: collision with root package name */
    public final String f13194B;

    /* renamed from: o, reason: collision with root package name */
    public final int f13195o;

    /* renamed from: p, reason: collision with root package name */
    public final int f13196p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13197q;

    /* renamed from: r, reason: collision with root package name */
    public String f13198r;

    /* renamed from: s, reason: collision with root package name */
    public IBinder f13199s;

    /* renamed from: t, reason: collision with root package name */
    public Scope[] f13200t;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f13201u;

    /* renamed from: v, reason: collision with root package name */
    public Account f13202v;

    /* renamed from: w, reason: collision with root package name */
    public e2.d[] f13203w;

    /* renamed from: x, reason: collision with root package name */
    public e2.d[] f13204x;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final int f13205z;
    public static final Parcelable.Creator<C1708g> CREATOR = new e2.l(11);

    /* renamed from: C, reason: collision with root package name */
    public static final Scope[] f13191C = new Scope[0];

    /* renamed from: D, reason: collision with root package name */
    public static final e2.d[] f13192D = new e2.d[0];

    public C1708g(int i4, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, e2.d[] dVarArr, e2.d[] dVarArr2, boolean z4, int i7, boolean z5, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f13191C : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        e2.d[] dVarArr3 = f13192D;
        e2.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f13195o = i4;
        this.f13196p = i5;
        this.f13197q = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f13198r = "com.google.android.gms";
        } else {
            this.f13198r = str;
        }
        if (i4 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC1702a.f13161p;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface abstractC1106r4 = queryLocalInterface instanceof InterfaceC1710i ? (InterfaceC1710i) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        J j4 = (J) abstractC1106r4;
                        Parcel O4 = j4.O(j4.Q(), 2);
                        Account account3 = (Account) AbstractC1980b.a(O4, Account.CREATOR);
                        O4.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
            this.f13202v = account2;
        } else {
            this.f13199s = iBinder;
            this.f13202v = account;
        }
        this.f13200t = scopeArr2;
        this.f13201u = bundle2;
        this.f13203w = dVarArr4;
        this.f13204x = dVarArr3;
        this.y = z4;
        this.f13205z = i7;
        this.f13193A = z5;
        this.f13194B = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        e2.l.a(this, parcel, i4);
    }
}
