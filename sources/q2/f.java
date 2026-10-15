package q2;

import A2.h;
import A2.r;
import android.content.Context;
import b2.InterfaceC0218a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Qw;
import g2.j;
import j2.C1731b;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends f2.f implements InterfaceC0218a {
    public static final Qw y = new Qw("AppSet.API", new C1731b(1), new V2.e(19));

    /* renamed from: w, reason: collision with root package name */
    public final Context f14712w;

    /* renamed from: x, reason: collision with root package name */
    public final e2.f f14713x;

    public f(Context context, e2.f fVar) {
        super(context, y, f2.b.f12961a, f2.e.f12963b);
        this.f14712w = context;
        this.f14713x = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [g2.j, java.lang.Object] */
    @Override // b2.InterfaceC0218a
    public final h f() {
        if (this.f14713x.c(this.f14712w, 212800000) != 0) {
            f2.d dVar = new f2.d(new Status(17, null, null, null));
            r rVar = new r();
            rVar.k(dVar);
            return rVar;
        }
        ?? obj = new Object();
        obj.f13002a = new e2.d[]{b2.d.f3495a};
        obj.d = new C2033d(this);
        obj.f13003b = false;
        obj.c = 27601;
        return b(0, new j(obj, obj.f13002a, obj.f13003b, obj.c));
    }
}
