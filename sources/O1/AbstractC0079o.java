package O1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.C1016p;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.I6;
import com.google.android.gms.internal.ads.W6;
import com.google.android.gms.internal.ads.Y9;
import o2.C1893d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0079o {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f1373a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.r4] */
    static {
        Q q4 = null;
        try {
            Object newInstance = C0077n.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                q4 = queryLocalInterface instanceof Q ? (Q) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 0);
            } else {
                Y9.s("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            Y9.s("Failed to instantiate ClientApi class.");
        }
        f1373a = q4;
    }

    public abstract Object a();

    public abstract Object b(Q q4);

    public abstract Object c();

    public final Object d(Context context, boolean z4) {
        boolean z5;
        Object obj;
        Object obj2;
        if (!z4) {
            C1335wc c1335wc = C0081p.f1374f.f1375a;
            if (e2.f.f12753b.c(context, 12451000) != 0) {
                Y9.m("Google Play Services is not available.");
                z4 = true;
            }
        }
        boolean z6 = false;
        boolean z7 = !(C1893d.a(context, ModuleDescriptor.MODULE_ID) <= C1893d.d(context, ModuleDescriptor.MODULE_ID, false));
        AbstractC1066q6.a(context);
        if (((Boolean) I6.f5547a.r()).booleanValue()) {
            z5 = false;
        } else if (((Boolean) I6.f5548b.r()).booleanValue()) {
            z5 = true;
            z6 = true;
        } else {
            z6 = z4 | z7;
            z5 = false;
        }
        Q q4 = f1373a;
        Object obj3 = null;
        if (z6) {
            if (q4 != null) {
                try {
                    obj2 = b(q4);
                } catch (RemoteException e4) {
                    Y9.t("Cannot invoke local loader using ClientApi class.", e4);
                }
                if (obj2 == null && !z5) {
                    try {
                        obj3 = c();
                    } catch (RemoteException e5) {
                        Y9.t("Cannot invoke remote loader.", e5);
                    }
                    obj2 = obj3;
                }
            } else {
                Y9.s("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = c();
                obj2 = obj3;
            }
        } else {
            try {
                obj = c();
            } catch (RemoteException e6) {
                Y9.t("Cannot invoke remote loader.", e6);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) W6.f7342a.r()).intValue();
                C0081p c0081p = C0081p.f1374f;
                if (c0081p.f1377e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C1335wc c1335wc2 = c0081p.f1375a;
                    String str = c0081p.d.f4084o;
                    c1335wc2.getClass();
                    C1335wc.k(context, str, bundle, new C1016p(25, c1335wc2));
                }
            }
            if (obj == null) {
                if (q4 != null) {
                    try {
                        obj3 = b(q4);
                    } catch (RemoteException e7) {
                        Y9.t("Cannot invoke local loader using ClientApi class.", e7);
                    }
                } else {
                    Y9.s("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        return obj2 == null ? a() : obj2;
    }
}
