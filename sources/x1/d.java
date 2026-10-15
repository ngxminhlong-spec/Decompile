package x1;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.gms.internal.ads.Qw;
import java.util.HashMap;
import t3.g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Qw f15252a;

    /* renamed from: b, reason: collision with root package name */
    public final g f15253b;
    public final HashMap c;

    public d(Context context, g gVar) {
        Qw qw = new Qw(context, 17);
        this.c = new HashMap();
        this.f15252a = qw;
        this.f15253b = gVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory t4 = this.f15252a.t(str);
        if (t4 == null) {
            return null;
        }
        g gVar = this.f15253b;
        e create = t4.create(new b((Context) gVar.f14961o, (F1.a) gVar.f14962p, (F1.a) gVar.f14963q, str));
        this.c.put(str, create);
        return create;
    }
}
