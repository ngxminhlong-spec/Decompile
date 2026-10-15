package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4835a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4836b;
    public final int c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final B0.r f4837e;

    /* renamed from: f, reason: collision with root package name */
    public final T0 f4838f;

    /* renamed from: n, reason: collision with root package name */
    public int f4846n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4839g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4840h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4841i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4842j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f4843k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4844l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4845m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f4847o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f4848p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f4849q = "";

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.gms.internal.ads.T0] */
    public E4(int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z4) {
        this.f4835a = i4;
        this.f4836b = i5;
        this.c = i6;
        this.d = z4;
        this.f4837e = new B0.r(i7, 5);
        ?? obj = new Object();
        obj.f7029a = i8;
        i9 = (i9 > 64 || i9 < 0) ? 64 : i9;
        if (i10 <= 0) {
            obj.f7030b = 1;
        } else {
            obj.f7030b = i10;
        }
        obj.c = new M4(i9);
        this.f4838f = obj;
    }

    public static final String g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            sb.append((String) arrayList.get(i4));
            sb.append(' ');
            i4++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final void a() {
        synchronized (this.f4839g) {
            this.f4846n -= 100;
        }
    }

    public final void b(String str, boolean z4, float f4, float f5, float f6, float f7) {
        f(str, z4, f4, f5, f6, f7);
        synchronized (this.f4839g) {
            try {
                if (this.f4845m < 0) {
                    Y9.m("ActivityContent: negative number of WebViews.");
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f4839g) {
            try {
                int i4 = this.f4843k;
                int i5 = this.f4844l;
                int i6 = this.f4836b;
                if (!this.d) {
                    i6 = (i5 * i6) + (i4 * this.f4835a);
                }
                if (i6 > this.f4846n) {
                    this.f4846n = i6;
                    N1.n nVar = N1.n.f1204A;
                    if (!nVar.f1209g.c().n()) {
                        this.f4847o = this.f4837e.m(this.f4840h);
                        this.f4848p = this.f4837e.m(this.f4841i);
                    }
                    if (!nVar.f1209g.c().o()) {
                        this.f4849q = this.f4838f.a(this.f4841i, this.f4842j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f4839g) {
            try {
                int i4 = this.f4843k;
                int i5 = this.f4844l;
                int i6 = this.f4836b;
                if (!this.d) {
                    i6 = (i5 * i6) + (i4 * this.f4835a);
                }
                if (i6 > this.f4846n) {
                    this.f4846n = i6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.f4839g) {
            z4 = this.f4845m == 0;
        }
        return z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((E4) obj).f4847o;
        return str != null && str.equals(this.f4847o);
    }

    public final void f(String str, boolean z4, float f4, float f5, float f6, float f7) {
        if (str != null) {
            if (str.length() < this.c) {
                return;
            }
            synchronized (this.f4839g) {
                try {
                    this.f4840h.add(str);
                    this.f4843k += str.length();
                    if (z4) {
                        this.f4841i.add(str);
                        this.f4842j.add(new J4(f4, f5, f6, f7, this.f4841i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int hashCode() {
        return this.f4847o.hashCode();
    }

    public final String toString() {
        int i4 = this.f4844l;
        int i5 = this.f4846n;
        int i6 = this.f4843k;
        String g4 = g(this.f4840h);
        String g5 = g(this.f4841i);
        String str = this.f4847o;
        String str2 = this.f4848p;
        String str3 = this.f4849q;
        StringBuilder m4 = U.a.m("ActivityContent fetchId: ", i4, " score:", i5, " total_length:");
        m4.append(i6);
        m4.append("\n text: ");
        m4.append(g4);
        m4.append("\n viewableText");
        m4.append(g5);
        m4.append("\n signture: ");
        m4.append(str);
        m4.append("\n viewableSignture: ");
        m4.append(str2);
        m4.append("\n viewableSignatureForVertical: ");
        m4.append(str3);
        return m4.toString();
    }
}
