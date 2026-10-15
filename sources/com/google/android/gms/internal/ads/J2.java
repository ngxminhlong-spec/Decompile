package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class J2 implements InterfaceC1187t, InterfaceC1132ro {

    /* renamed from: s, reason: collision with root package name */
    public static final UE f5777s = new UE(10);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5778o;

    /* renamed from: p, reason: collision with root package name */
    public int f5779p;

    /* renamed from: q, reason: collision with root package name */
    public Object f5780q;

    /* renamed from: r, reason: collision with root package name */
    public Object f5781r;

    public J2(int i4) {
        this.f5778o = 6;
        this.f5780q = new Object[i4 + i4];
        this.f5779p = 0;
    }

    public J2(int i4, byte b4) {
        this.f5778o = i4;
        switch (i4) {
            case 3:
                this.f5780q = new Object();
                this.f5781r = new LinkedList();
                return;
            default:
                this.f5780q = new ArrayList();
                this.f5781r = new ArrayList(64);
                this.f5779p = 0;
                return;
        }
    }

    public J2(int i4, Sr sr) {
        this.f5778o = 2;
        this.f5779p = i4;
        this.f5780q = sr;
        this.f5781r = new C1134rq();
    }

    public /* synthetic */ J2(int i4, C0909mf c0909mf, C0909mf c0909mf2) {
        this.f5778o = 7;
        this.f5779p = i4;
        this.f5780q = c0909mf;
        this.f5781r = c0909mf2;
    }

    public J2(int i4, Object obj, String str) {
        this.f5778o = 5;
        this.f5780q = str;
        this.f5781r = obj;
        this.f5779p = i4;
    }

    public /* synthetic */ J2(A2.o oVar, byte[] bArr) {
        this.f5778o = 4;
        this.f5781r = oVar;
        this.f5780q = bArr;
    }

    public J2(H h4, int i4) {
        this.f5778o = 1;
        this.f5780q = h4;
        this.f5779p = i4;
        this.f5781r = new Object();
    }

    public static J2 e(String str, long j4) {
        return new J2(2, Long.valueOf(j4), str);
    }

    private final /* synthetic */ void h() {
    }

    public static J2 j(String str, String str2) {
        return new J2(4, str2, str);
    }

    private final synchronized void o() {
        while (this.f5779p > 4096) {
            byte[] bArr = (byte[]) ((ArrayList) this.f5780q).remove(0);
            ((ArrayList) this.f5781r).remove(bArr);
            this.f5779p -= bArr.length;
        }
    }

    private final synchronized void p() {
        ((ExecutorService) ((A2.o) this.f5781r).f37r).execute(new D3(7, this));
    }

    public static J2 q(String str, boolean z4) {
        return new J2(1, Boolean.valueOf(z4), str);
    }

    public void a(Object obj, Object obj2) {
        int i4 = this.f5779p + 1;
        Object[] objArr = (Object[]) this.f5780q;
        int length = objArr.length;
        int i5 = i4 + i4;
        if (i5 > length) {
            this.f5780q = Arrays.copyOf(objArr, AbstractC0880lt.d(length, i5));
        }
        Bs.F(obj, obj2);
        Object[] objArr2 = (Object[]) this.f5780q;
        int i6 = this.f5779p;
        int i7 = i6 + i6;
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        this.f5779p = i6 + 1;
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f5780q).add(bArr);
                int binarySearch = Collections.binarySearch((ArrayList) this.f5781r, bArr, f5777s);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                ((ArrayList) this.f5781r).add(binarySearch, bArr);
                this.f5779p += length;
                m();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1187t
    public void c() {
        switch (this.f5778o) {
            case 1:
                return;
            default:
                byte[] bArr = AbstractC0751is.f9074f;
                int length = bArr.length;
                ((C1134rq) this.f5781r).c(0, bArr);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1187t
    public C1144s d(C c, long j4) {
        long j5;
        C1144s c1144s;
        switch (this.f5778o) {
            case 1:
                int i4 = ((H) this.f5780q).c;
                long d = c.d();
                long i5 = i(c);
                long a4 = c.a();
                ((C1316w) c).c(Math.max(6, i4), false);
                long i6 = i(c);
                return (i5 > j4 || i6 <= j4) ? i6 <= j4 ? new C1144s(-2, i6, c.a()) : new C1144s(-1, i5, d) : new C1144s(0, -9223372036854775807L, a4);
            default:
                long d4 = c.d();
                int min = (int) Math.min(112800L, c.i() - d4);
                C1134rq c1134rq = (C1134rq) this.f5781r;
                c1134rq.b(min);
                ((C1316w) c).E(c1134rq.f10536a, 0, min, false);
                int i7 = c1134rq.c;
                long j6 = -1;
                long j7 = -1;
                long j8 = -9223372036854775807L;
                while (true) {
                    if (c1134rq.g() >= 188) {
                        byte[] bArr = c1134rq.f10536a;
                        int i8 = c1134rq.f10537b;
                        while (true) {
                            if (i8 < i7) {
                                j5 = -9223372036854775807L;
                                if (bArr[i8] != 71) {
                                    i8++;
                                }
                            } else {
                                j5 = -9223372036854775807L;
                            }
                        }
                        int i9 = i8 + 188;
                        if (i9 <= i7) {
                            long t4 = AbstractC1230u.t(c1134rq, i8, this.f5779p);
                            if (t4 != j5) {
                                long b4 = ((Sr) this.f5780q).b(t4);
                                if (b4 <= j4) {
                                    long j9 = i8;
                                    if (100000 + b4 > j4) {
                                        return new C1144s(0, -9223372036854775807L, d4 + j9);
                                    }
                                    j8 = b4;
                                    j7 = j9;
                                } else {
                                    if (j8 == j5) {
                                        return new C1144s(-1, b4, d4);
                                    }
                                    c1144s = new C1144s(0, -9223372036854775807L, d4 + j7);
                                }
                            }
                            c1134rq.e(i9);
                            j6 = i9;
                        }
                    } else {
                        j5 = -9223372036854775807L;
                    }
                }
                if (j8 == j5) {
                    return C1144s.d;
                }
                c1144s = new C1144s(-2, j8, d4 + j6);
                return c1144s;
        }
    }

    public void f(E4 e4) {
        synchronized (this.f5780q) {
            try {
                if (((LinkedList) this.f5781r).size() >= 10) {
                    Y9.m("Queue is full, current size = " + ((LinkedList) this.f5781r).size());
                    ((LinkedList) this.f5781r).remove(0);
                }
                int i4 = this.f5779p;
                this.f5779p = i4 + 1;
                e4.f4844l = i4;
                e4.d();
                ((LinkedList) this.f5781r).add(e4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized byte[] g(int i4) {
        for (int i5 = 0; i5 < ((ArrayList) this.f5781r).size(); i5++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f5781r).get(i5);
            int length = bArr.length;
            if (length >= i4) {
                this.f5779p -= length;
                ((ArrayList) this.f5781r).remove(i5);
                ((ArrayList) this.f5780q).remove(bArr);
                return bArr;
            }
        }
        return new byte[i4];
    }

    public long i(C c) {
        long j4;
        int D4;
        F f4 = (F) this.f5781r;
        H h4 = (H) this.f5780q;
        while (true) {
            if (c.a() >= c.i() - 6) {
                j4 = -6;
                break;
            }
            int i4 = this.f5779p;
            long a4 = c.a();
            byte[] bArr = new byte[2];
            C1316w c1316w = (C1316w) c;
            c1316w.E(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i4) {
                c.j();
                c1316w.c((int) (a4 - c.d()), false);
            } else {
                C1134rq c1134rq = new C1134rq(16);
                System.arraycopy(bArr, 0, c1134rq.f10536a, 0, 2);
                byte[] bArr2 = c1134rq.f10536a;
                int i5 = 0;
                j4 = -6;
                while (i5 < 14 && (D4 = c.D(bArr2, 2 + i5, 14 - i5)) != -1) {
                    i5 += D4;
                }
                c1134rq.d(i5);
                c.j();
                c1316w.c((int) (a4 - c.d()), false);
                if (AbstractC1230u.M(c1134rq, h4, i4, f4)) {
                    break;
                }
            }
            c1316w.c(1, false);
        }
        if (c.a() < c.i() + j4) {
            return f4.f4964a;
        }
        ((C1316w) c).c((int) (c.i() - c.a()), false);
        return h4.f5361j;
    }

    public Lt k() {
        C1180st c1180st = (C1180st) this.f5781r;
        if (c1180st != null) {
            throw c1180st.a();
        }
        Lt c = Lt.c(this.f5779p, (Object[]) this.f5780q, this);
        C1180st c1180st2 = (C1180st) this.f5781r;
        if (c1180st2 == null) {
            return c;
        }
        throw c1180st2.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        VC vc = (VC) obj;
        int i4 = C0857lC.f9381k0;
        C0909mf c0909mf = (C0909mf) this.f5781r;
        int i5 = this.f5779p;
        C0909mf c0909mf2 = (C0909mf) this.f5780q;
        if (i5 == 1) {
            vc.f7256w = false;
            i5 = 1;
        }
        C0381a5 c0381a5 = vc.f7251r;
        AA aa = vc.f7254u;
        aa.getClass();
        c0381a5.f8080s = C0381a5.y(aa, (AbstractC1137rt) c0381a5.f8078q, (C1202tE) c0381a5.f8076o, (C1210tg) c0381a5.f8077p);
        OC b4 = vc.b();
        vc.e(b4, 11, new n0.n(b4, i5, c0909mf2, c0909mf));
    }

    public synchronized void m() {
        switch (this.f5778o) {
            case 0:
                o();
                return;
            default:
                p();
                return;
        }
    }

    public void n(E4 e4) {
        synchronized (this.f5780q) {
            try {
                Iterator it = ((LinkedList) this.f5781r).iterator();
                while (it.hasNext()) {
                    E4 e42 = (E4) it.next();
                    N1.n nVar = N1.n.f1204A;
                    if (nVar.f1209g.c().n()) {
                        if (!nVar.f1209g.c().o() && !e4.equals(e42) && e42.f4849q.equals(e4.f4849q)) {
                            it.remove();
                            return;
                        }
                    } else if (!e4.equals(e42) && e42.f4847o.equals(e4.f4847o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object r() {
        String str = (String) this.f5780q;
        Object obj = this.f5781r;
        C0980o6 c0980o6 = (C0980o6) AbstractC0511d7.f8461a.get();
        if (c0980o6 == null) {
            if (AbstractC0511d7.f8462b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        SharedPreferences sharedPreferences = c0980o6.f9828a;
        int i4 = this.f5779p - 1;
        if (i4 == 0) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(booleanValue)));
            }
        }
        if (i4 == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r3));
            }
        }
        if (i4 != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r3));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }
}
