package w1;

import C0.J;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import t1.C1991b;
import u1.C2013a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2052o {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C2047j f15163e;

    /* renamed from: a, reason: collision with root package name */
    public final F1.a f15164a;

    /* renamed from: b, reason: collision with root package name */
    public final F1.a f15165b;
    public final B1.d c;
    public final C1.l d;

    public C2052o(F1.a aVar, F1.a aVar2, B1.d dVar, C1.l lVar, u0.g gVar) {
        this.f15164a = aVar;
        this.f15165b = aVar2;
        this.c = dVar;
        this.d = lVar;
        ((Executor) gVar.f14983p).execute(new J(1, gVar));
    }

    public static C2052o a() {
        C2047j c2047j = f15163e;
        if (c2047j != null) {
            return (C2052o) c2047j.f15158t.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o0.f] */
    public static void b(Context context) {
        if (f15163e == null) {
            synchronized (C2052o.class) {
                try {
                    if (f15163e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f14162o = context;
                        f15163e = obj.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final t3.g c(InterfaceC2048k interfaceC2048k) {
        byte[] bytes;
        Set unmodifiableSet = interfaceC2048k != null ? Collections.unmodifiableSet(C2013a.d) : Collections.singleton(new C1991b("proto"));
        t3.g a4 = C2046i.a();
        interfaceC2048k.getClass();
        a4.f14961o = "cct";
        C2013a c2013a = (C2013a) interfaceC2048k;
        String str = c2013a.f14988a;
        String str2 = c2013a.f14989b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a4.f14962p = bytes;
        return new t3.g(unmodifiableSet, a4.a(), this);
    }
}
