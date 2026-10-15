package v3;

import A2.r;
import android.content.Context;
import android.os.Build;
import j3.C1736c;
import java.util.Set;
import java.util.concurrent.Executor;
import o2.AbstractC1895f;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032c implements InterfaceC2034e, InterfaceC2035f {

    /* renamed from: a, reason: collision with root package name */
    public final C1736c f15095a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15096b;
    public final InterfaceC2053a c;
    public final Set d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15097e;

    public C2032c(Context context, String str, Set set, InterfaceC2053a interfaceC2053a, Executor executor) {
        this.f15095a = new C1736c(1, context, str);
        this.d = set;
        this.f15097e = executor;
        this.c = interfaceC2053a;
        this.f15096b = context;
    }

    public final r a() {
        if (Build.VERSION.SDK_INT >= 24 ? D.b.f(this.f15096b) : true) {
            return AbstractC1895f.f(this.f15097e, new CallableC2031b(this, 0));
        }
        return AbstractC1895f.l("");
    }

    public final void b() {
        if (this.d.size() <= 0) {
            AbstractC1895f.l(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? D.b.f(this.f15096b) : true) {
            AbstractC1895f.f(this.f15097e, new CallableC2031b(this, 1));
        } else {
            AbstractC1895f.l(null);
        }
    }
}
