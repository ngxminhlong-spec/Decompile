package u1;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k.o;
import s3.C1984d;
import v1.AbstractC2022a;
import v1.C2023b;
import v1.C2024c;
import v1.C2025d;
import v1.C2026e;
import v1.f;
import v1.g;
import v1.h;
import v1.i;
import v1.j;
import v1.k;
import v1.l;
import v1.n;
import v1.q;
import v1.r;
import v1.s;
import v1.v;
import x1.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final o f14990a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f14991b;
    public final Context c;
    public final URL d;

    /* renamed from: e, reason: collision with root package name */
    public final F1.a f14992e;

    /* renamed from: f, reason: collision with root package name */
    public final F1.a f14993f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14994g;

    public C2014b(Context context, F1.a aVar, F1.a aVar2) {
        C1984d c1984d = new C1984d();
        C2024c c2024c = C2024c.f15038a;
        c1984d.a(v1.o.class, c2024c);
        c1984d.a(i.class, c2024c);
        f fVar = f.f15048a;
        c1984d.a(s.class, fVar);
        c1984d.a(l.class, fVar);
        C2025d c2025d = C2025d.f15040a;
        c1984d.a(q.class, c2025d);
        c1984d.a(j.class, c2025d);
        C2023b c2023b = C2023b.f15027a;
        c1984d.a(AbstractC2022a.class, c2023b);
        c1984d.a(h.class, c2023b);
        C2026e c2026e = C2026e.f15042a;
        c1984d.a(r.class, c2026e);
        c1984d.a(k.class, c2026e);
        g gVar = g.f15054a;
        c1984d.a(v.class, gVar);
        c1984d.a(n.class, gVar);
        c1984d.d = true;
        this.f14990a = new o(11, c1984d);
        this.c = context;
        this.f14991b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(C2013a.c);
        this.f14992e = aVar2;
        this.f14993f = aVar;
        this.f14994g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(n0.a.k("Invalid url: ", str), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((v1.t) v1.t.f15082o.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w1.C2045h a(w1.C2045h r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C2014b.a(w1.h):w1.h");
    }
}
