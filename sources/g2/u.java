package g2;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.ads.Jn;
import com.google.android.gms.internal.ads.Ur;
import d2.C1652a;
import d3.AbstractC1654b;
import e2.C1664b;
import h2.y;
import j2.C1731b;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import r2.AbstractC1967a;
import s2.AbstractBinderC1979a;
import y2.AbstractC2119b;
import z2.C2133a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u extends AbstractBinderC1979a implements f2.g, f2.h {

    /* renamed from: w, reason: collision with root package name */
    public static final C1731b f13029w = AbstractC2119b.f15912a;

    /* renamed from: p, reason: collision with root package name */
    public final Context f13030p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f13031q;

    /* renamed from: r, reason: collision with root package name */
    public final C1731b f13032r;

    /* renamed from: s, reason: collision with root package name */
    public final Set f13033s;

    /* renamed from: t, reason: collision with root package name */
    public final N1.l f13034t;

    /* renamed from: u, reason: collision with root package name */
    public C2133a f13035u;

    /* renamed from: v, reason: collision with root package name */
    public B0.u f13036v;

    public u(Context context, Ur ur, N1.l lVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f13030p = context;
        this.f13031q = ur;
        this.f13034t = lVar;
        this.f13033s = (Set) lVar.f1189p;
        this.f13032r = f13029w;
    }

    @Override // f2.g
    public final void O(int i4) {
        B0.u uVar = this.f13036v;
        m mVar = (m) ((C1684d) uVar.f121t).f13000x.get((C1681a) uVar.f118q);
        if (mVar != null) {
            if (mVar.f13014w) {
                mVar.m(new C1664b(17));
            } else {
                mVar.O(i4);
            }
        }
    }

    @Override // f2.g
    public final void Q() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        C2133a c2133a = this.f13035u;
        c2133a.getClass();
        boolean z4 = false;
        try {
            c2133a.f15967O.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c2133a.f13176q;
                    ReentrantLock reentrantLock = C1652a.c;
                    y.i(context);
                    ReentrantLock reentrantLock2 = C1652a.c;
                    reentrantLock2.lock();
                    try {
                        if (C1652a.d == null) {
                            C1652a.d = new C1652a(context.getApplicationContext());
                        }
                        C1652a c1652a = C1652a.d;
                        reentrantLock2.unlock();
                        String a4 = c1652a.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a4)) {
                            String a5 = c1652a.a("googleSignInAccount:" + a4);
                            if (a5 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.h(a5);
                                } catch (JSONException unused) {
                                }
                                Integer num = c2133a.f15969Q;
                                y.i(num);
                                h2.q qVar = new h2.q(2, account, num.intValue(), googleSignInAccount);
                                z2.c cVar = (z2.c) c2133a.t();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(cVar.f10454q);
                                int i4 = AbstractC1967a.f14753a;
                                obtain.writeInt(1);
                                int a02 = AbstractC1654b.a0(obtain, 20293);
                                AbstractC1654b.f0(obtain, 1, 4);
                                obtain.writeInt(1);
                                AbstractC1654b.U(obtain, 2, qVar, 0);
                                AbstractC1654b.e0(obtain, a02);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                cVar.f10453p.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                cVar.f10453p.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = c2133a.f15969Q;
            y.i(num2);
            h2.q qVar2 = new h2.q(2, account, num2.intValue(), googleSignInAccount);
            z2.c cVar2 = (z2.c) c2133a.t();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(cVar2.f10454q);
            int i42 = AbstractC1967a.f14753a;
            obtain.writeInt(1);
            int a022 = AbstractC1654b.a0(obtain, 20293);
            AbstractC1654b.f0(obtain, 1, 4);
            obtain.writeInt(1);
            AbstractC1654b.U(obtain, 2, qVar2, 0);
            AbstractC1654b.e0(obtain, a022);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f13031q.post(new Jn(this, new z2.e(1, new C1664b(8, null), null), 18, z4));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // f2.h
    public final void a0(C1664b c1664b) {
        this.f13036v.b(c1664b);
    }
}
