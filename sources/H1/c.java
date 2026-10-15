package H1;

import O1.C0069j;
import O1.C0077n;
import O1.C0081p;
import O1.F;
import android.content.Context;
import com.google.android.gms.internal.ads.BinderC0983o9;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f859a;

    /* renamed from: b, reason: collision with root package name */
    public final F f860b;

    public c(Context context, String str) {
        y.j(context, "context cannot be null");
        C0077n c0077n = C0081p.f1374f.f1376b;
        BinderC0983o9 binderC0983o9 = new BinderC0983o9();
        c0077n.getClass();
        F f4 = (F) new C0069j(c0077n, context, str, binderC0983o9).d(context, false);
        this.f859a = context;
        this.f860b = f4;
    }
}
