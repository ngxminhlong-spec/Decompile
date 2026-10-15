package x2;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractBinderC1585w;
import com.google.android.gms.internal.measurement.AbstractC1589x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2074g0 extends AbstractBinderC1585w implements D {

    /* renamed from: o, reason: collision with root package name */
    public final X0 f15665o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f15666p;

    /* renamed from: q, reason: collision with root package name */
    public String f15667q;

    public BinderC2074g0(X0 x02) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        h2.y.i(x02);
        this.f15665o = x02;
        this.f15667q = null;
    }

    @Override // x2.D
    public final void A2(Y0 y02, d1 d1Var) {
        h2.y.i(y02);
        q1(d1Var);
        a0(new E.n(this, y02, d1Var, 17, false));
    }

    @Override // x2.D
    public final void A3(d1 d1Var) {
        q1(d1Var);
        a0(new RunnableC2070e0(this, d1Var, 1));
    }

    public final void G1(String str, boolean z4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        X0 x02 = this.f15665o;
        if (isEmpty) {
            x02.c().f15394f.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z4) {
            try {
                if (this.f15666p == null) {
                    boolean z5 = true;
                    if (!"com.google.android.gms".equals(this.f15667q) && !AbstractC1799b.h(x02.f15491l.f15562a, Binder.getCallingUid()) && !e2.i.a(x02.f15491l.f15562a).b(Binder.getCallingUid())) {
                        z5 = false;
                    }
                    this.f15666p = Boolean.valueOf(z5);
                }
                if (this.f15666p.booleanValue()) {
                    return;
                }
            } catch (SecurityException e4) {
                x02.c().f15394f.b(K.n(str), "Measurement Service called with invalid calling package. appId");
                throw e4;
            }
        }
        if (this.f15667q == null) {
            Context context = x02.f15491l.f15562a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = e2.h.f12754a;
            if (AbstractC1799b.l(callingUid, context, str)) {
                this.f15667q = str;
            }
        }
        if (str.equals(this.f15667q)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1585w
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        switch (i4) {
            case 1:
                C2096s c2096s = (C2096s) AbstractC1589x.a(parcel, C2096s.CREATOR);
                d1 d1Var = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                s3(c2096s, d1Var);
                parcel2.writeNoException();
                return true;
            case 2:
                Y0 y02 = (Y0) AbstractC1589x.a(parcel, Y0.CREATOR);
                d1 d1Var2 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                A2(y02, d1Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                d1 d1Var3 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                z3(d1Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                C2096s c2096s2 = (C2096s) AbstractC1589x.a(parcel, C2096s.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                AbstractC1589x.b(parcel);
                h2.y.i(c2096s2);
                h2.y.e(readString);
                G1(readString, true);
                a0(new E.n(this, c2096s2, readString, 16, false));
                parcel2.writeNoException();
                return true;
            case 6:
                d1 d1Var4 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                A3(d1Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                d1 d1Var5 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                boolean z4 = parcel.readInt() != 0;
                AbstractC1589x.b(parcel);
                q1(d1Var5);
                String str = d1Var5.f15603o;
                h2.y.i(str);
                X0 x02 = this.f15665o;
                try {
                    List<Z0> list = (List) x02.t().m(new B0.v(this, str, 17, r2)).get();
                    arrayList = new ArrayList(list.size());
                    for (Z0 z02 : list) {
                        if (!z4 && b1.R(z02.c)) {
                        }
                        arrayList.add(new Y0(z02));
                    }
                } catch (InterruptedException e4) {
                    e = e4;
                    x02.c().f15394f.c(K.n(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e5) {
                    e = e5;
                    x02.c().f15394f.c(K.n(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C2096s c2096s3 = (C2096s) AbstractC1589x.a(parcel, C2096s.CREATOR);
                String readString2 = parcel.readString();
                AbstractC1589x.b(parcel);
                byte[] e12 = e1(c2096s3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(e12);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                AbstractC1589x.b(parcel);
                u0(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                d1 d1Var6 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                String U12 = U1(d1Var6);
                parcel2.writeNoException();
                parcel2.writeString(U12);
                return true;
            case 12:
                C2065c c2065c = (C2065c) AbstractC1589x.a(parcel, C2065c.CREATOR);
                d1 d1Var7 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                y0(c2065c, d1Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C2065c c2065c2 = (C2065c) AbstractC1589x.a(parcel, C2065c.CREATOR);
                AbstractC1589x.b(parcel);
                h2.y.i(c2065c2);
                h2.y.i(c2065c2.f15546q);
                h2.y.e(c2065c2.f15544o);
                G1(c2065c2.f15544o, true);
                a0(new x0.j(this, new C2065c(c2065c2), 4, false));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = AbstractC1589x.f12112a;
                r2 = parcel.readInt() != 0;
                d1 d1Var8 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                List P12 = P1(readString6, readString7, r2, d1Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(P12);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1589x.f12112a;
                r2 = parcel.readInt() != 0;
                AbstractC1589x.b(parcel);
                List V02 = V0(readString8, readString9, readString10, r2);
                parcel2.writeNoException();
                parcel2.writeTypedList(V02);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                d1 d1Var9 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                List w02 = w0(readString11, readString12, d1Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(w02);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                AbstractC1589x.b(parcel);
                List Y12 = Y1(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(Y12);
                return true;
            case 18:
                d1 d1Var10 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                y1(d1Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                d1 d1Var11 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                a3(bundle, d1Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                d1 d1Var12 = (d1) AbstractC1589x.a(parcel, d1.CREATOR);
                AbstractC1589x.b(parcel);
                b2(d1Var12);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // x2.D
    public final List P1(String str, String str2, boolean z4, d1 d1Var) {
        q1(d1Var);
        String str3 = d1Var.f15603o;
        h2.y.i(str3);
        X0 x02 = this.f15665o;
        try {
            List<Z0> list = (List) x02.t().m(new CallableC2068d0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Z0 z02 : list) {
                if (!z4 && b1.R(z02.c)) {
                }
                arrayList.add(new Y0(z02));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            x02.c().f15394f.c(K.n(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e5) {
            e = e5;
            x02.c().f15394f.c(K.n(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void Q(C2096s c2096s, d1 d1Var) {
        X0 x02 = this.f15665o;
        x02.a();
        x02.h(c2096s, d1Var);
    }

    @Override // x2.D
    public final String U1(d1 d1Var) {
        q1(d1Var);
        X0 x02 = this.f15665o;
        try {
            return (String) x02.t().m(new B0.v(x02, d1Var, 18, false)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            x02.c().f15394f.c(K.n(d1Var.f15603o), e4, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // x2.D
    public final List V0(String str, String str2, String str3, boolean z4) {
        G1(str, true);
        X0 x02 = this.f15665o;
        try {
            List<Z0> list = (List) x02.t().m(new CallableC2068d0(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Z0 z02 : list) {
                if (!z4 && b1.R(z02.c)) {
                }
                arrayList.add(new Y0(z02));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            x02.c().f15394f.c(K.n(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e5) {
            e = e5;
            x02.c().f15394f.c(K.n(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // x2.D
    public final List Y1(String str, String str2, String str3) {
        G1(str, true);
        X0 x02 = this.f15665o;
        try {
            return (List) x02.t().m(new CallableC2068d0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e4) {
            x02.c().f15394f.b(e4, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    public final void a0(Runnable runnable) {
        X0 x02 = this.f15665o;
        if (x02.t().q()) {
            runnable.run();
        } else {
            x02.t().o(runnable);
        }
    }

    @Override // x2.D
    public final void a3(Bundle bundle, d1 d1Var) {
        q1(d1Var);
        String str = d1Var.f15603o;
        h2.y.i(str);
        a0(new E.n(this, str, bundle, 13));
    }

    @Override // x2.D
    public final void b2(d1 d1Var) {
        h2.y.e(d1Var.f15603o);
        h2.y.i(d1Var.f15600J);
        RunnableC2070e0 runnableC2070e0 = new RunnableC2070e0(this, d1Var, 2);
        X0 x02 = this.f15665o;
        if (x02.t().q()) {
            runnableC2070e0.run();
        } else {
            x02.t().p(runnableC2070e0);
        }
    }

    @Override // x2.D
    public final byte[] e1(C2096s c2096s, String str) {
        h2.y.e(str);
        h2.y.i(c2096s);
        G1(str, true);
        X0 x02 = this.f15665o;
        I i4 = x02.c().f15401m;
        C2066c0 c2066c0 = x02.f15491l;
        G g4 = c2066c0.f15572m;
        String str2 = c2096s.f15781o;
        i4.b(g4.d(str2), "Log and bundle. event");
        x02.d().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        C2064b0 t4 = x02.t();
        B0.l lVar = new B0.l(this, c2096s, str);
        t4.i();
        Z z4 = new Z(t4, lVar, true);
        if (Thread.currentThread() == t4.c) {
            z4.run();
        } else {
            t4.r(z4);
        }
        try {
            byte[] bArr = (byte[]) z4.get();
            if (bArr == null) {
                x02.c().f15394f.b(K.n(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            x02.d().getClass();
            x02.c().f15401m.d("Log and bundle processed. event, size, time_ms", c2066c0.f15572m.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e4) {
            e = e4;
            x02.c().f15394f.d("Failed to log and bundle. appId, event, error", K.n(str), c2066c0.f15572m.d(str2), e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            x02.c().f15394f.d("Failed to log and bundle. appId, event, error", K.n(str), c2066c0.f15572m.d(str2), e);
            return null;
        }
    }

    public final void q1(d1 d1Var) {
        h2.y.i(d1Var);
        String str = d1Var.f15603o;
        h2.y.e(str);
        G1(str, false);
        this.f15665o.Q().H(d1Var.f15604p, d1Var.f15595E);
    }

    @Override // x2.D
    public final void s3(C2096s c2096s, d1 d1Var) {
        h2.y.i(c2096s);
        q1(d1Var);
        a0(new E.n(this, c2096s, d1Var, 15, false));
    }

    @Override // x2.D
    public final void u0(long j4, String str, String str2, String str3) {
        a0(new RunnableC2072f0(this, str2, str3, str, j4, 0));
    }

    @Override // x2.D
    public final List w0(String str, String str2, d1 d1Var) {
        q1(d1Var);
        String str3 = d1Var.f15603o;
        h2.y.i(str3);
        X0 x02 = this.f15665o;
        try {
            return (List) x02.t().m(new CallableC2068d0(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e4) {
            x02.c().f15394f.b(e4, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // x2.D
    public final void y0(C2065c c2065c, d1 d1Var) {
        h2.y.i(c2065c);
        h2.y.i(c2065c.f15546q);
        q1(d1Var);
        C2065c c2065c2 = new C2065c(c2065c);
        c2065c2.f15544o = d1Var.f15603o;
        a0(new E.n(this, c2065c2, d1Var, 14, false));
    }

    @Override // x2.D
    public final void y1(d1 d1Var) {
        h2.y.e(d1Var.f15603o);
        G1(d1Var.f15603o, false);
        a0(new RunnableC2070e0(this, d1Var, 0));
    }

    @Override // x2.D
    public final void z3(d1 d1Var) {
        q1(d1Var);
        a0(new RunnableC2070e0(this, d1Var, 3));
    }
}
