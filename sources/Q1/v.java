package Q1;

import O1.A0;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.C1147s2;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.N2;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static A0 f1733a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1734b = new Object();

    public v(Context context) {
        A0 a02;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f1734b) {
            try {
                if (f1733a == null) {
                    AbstractC1066q6.a(context);
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10136M3)).booleanValue()) {
                        a02 = new A0(new N2(new File(context.getCacheDir(), "admob_volley")), new C0114m(context));
                        a02.d();
                    } else {
                        a02 = new A0(new N2(new C1510e1(context.getApplicationContext(), 16)), new C0874ln(7));
                        a02.d();
                    }
                    f1733a = a02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Q1.t, com.google.android.gms.internal.ads.Fc, java.lang.Object] */
    public static C0120t a(int i4, String str, HashMap hashMap, byte[] bArr) {
        ?? c0272Fc = new C0272Fc();
        C0258Da c0258Da = new C0258Da(7, str, c0272Fc);
        C1421yc c1421yc = new C1421yc();
        C0119s c0119s = new C0119s(i4, str, c0272Fc, c0258Da, bArr, hashMap, c1421yc);
        if (C1421yc.c()) {
            try {
                Map c = c0119s.c();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (C1421yc.c()) {
                    c1421yc.d("onNetworkRequest", new u0.g(str, "GET", c, bArr2, 6));
                }
            } catch (C1147s2 e4) {
                Y9.s(e4.getMessage());
            }
        }
        f1733a.b(c0119s);
        return c0272Fc;
    }
}
