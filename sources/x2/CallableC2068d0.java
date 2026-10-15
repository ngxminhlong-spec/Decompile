package x2;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC2068d0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15589b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC2074g0 f15590e;

    public /* synthetic */ CallableC2068d0(BinderC2074g0 binderC2074g0, String str, String str2, String str3, int i4) {
        this.f15588a = i4;
        this.f15590e = binderC2074g0;
        this.f15589b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15588a) {
            case 0:
                X0 x02 = this.f15590e.f15665o;
                x02.a();
                C2083l c2083l = x02.c;
                X0.I(c2083l);
                return c2083l.L(this.f15589b, this.c, this.d);
            case 1:
                X0 x03 = this.f15590e.f15665o;
                x03.a();
                C2083l c2083l2 = x03.c;
                X0.I(c2083l2);
                return c2083l2.L(this.f15589b, this.c, this.d);
            case 2:
                X0 x04 = this.f15590e.f15665o;
                x04.a();
                C2083l c2083l3 = x04.c;
                X0.I(c2083l3);
                return c2083l3.I(this.f15589b, this.c, this.d);
            default:
                X0 x05 = this.f15590e.f15665o;
                x05.a();
                C2083l c2083l4 = x05.c;
                X0.I(c2083l4);
                return c2083l4.I(this.f15589b, this.c, this.d);
        }
    }
}
