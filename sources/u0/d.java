package u0;

import A2.q;
import android.content.Context;
import com.google.android.gms.internal.ads.Jn;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import n0.n;
import t0.AbstractC1989c;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f14972f = n.h("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2132a f14973a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14974b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f14975e;

    public d(Context context, InterfaceC2132a interfaceC2132a) {
        this.f14974b = context.getApplicationContext();
        this.f14973a = interfaceC2132a;
    }

    public abstract Object a();

    public final void b(AbstractC1989c abstractC1989c) {
        synchronized (this.c) {
            try {
                if (this.d.remove(abstractC1989c) && this.d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.c) {
            try {
                Object obj2 = this.f14975e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f14975e = obj;
                    ((q) ((t3.g) this.f14973a).f14963q).execute(new Jn(this, new ArrayList(this.d), 26, false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
