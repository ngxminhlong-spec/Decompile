package e2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import d3.AbstractC1654b;
import h2.v;
import h2.w;
import h2.x;
import h2.y;
import n2.BinderC1813b;
import o2.C1890a;
import o2.C1893d;
import s2.AbstractC1980b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final n f12773a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f12774b;
    public static volatile x c;
    public static final Object d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f12775e;

    static {
        new n(0, o.G1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new n(1, o.G1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f12773a = new n(2, o.G1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f12774b = new n(3, o.G1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static synchronized void a(Context context) {
        synchronized (r.class) {
            if (f12775e != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f12775e = context.getApplicationContext();
            }
        }
    }

    public static u b(String str, p pVar, boolean z4, boolean z5) {
        try {
            c();
            y.i(f12775e);
            try {
                x xVar = c;
                BinderC1813b binderC1813b = new BinderC1813b(f12775e.getPackageManager());
                v vVar = (v) xVar;
                Parcel Q3 = vVar.Q();
                int i4 = AbstractC1980b.f14799a;
                boolean z6 = true;
                Q3.writeInt(1);
                int a02 = AbstractC1654b.a0(Q3, 20293);
                AbstractC1654b.V(Q3, 1, str);
                AbstractC1654b.T(Q3, 2, pVar);
                AbstractC1654b.f0(Q3, 3, 4);
                Q3.writeInt(z4 ? 1 : 0);
                AbstractC1654b.f0(Q3, 4, 4);
                Q3.writeInt(z5 ? 1 : 0);
                AbstractC1654b.e0(Q3, a02);
                AbstractC1980b.c(Q3, binderC1813b);
                Parcel O4 = vVar.O(Q3, 5);
                if (O4.readInt() == 0) {
                    z6 = false;
                }
                O4.recycle();
                return z6 ? u.d : new t(new m(z4, str, pVar));
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return new u(false, "module call", e4);
            }
        } catch (C1890a e5) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            return new u(false, "module init: ".concat(String.valueOf(e5.getMessage())), e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [h2.x] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void c() {
        ?? r1;
        if (c != null) {
            return;
        }
        y.i(f12775e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder b4 = C1893d.c(f12775e, C1893d.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i4 = w.f13246p;
                    if (b4 == null) {
                        r1 = 0;
                    } else {
                        IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        r1 = queryLocalInterface instanceof x ? (x) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    c = r1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
