package k;

import H.InterfaceC0035j;
import H.W;
import H.a0;
import android.app.Application;
import android.app.Service;
import android.graphics.PointF;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.C0237f;
import c1.InterfaceC0235d;
import com.google.android.gms.internal.ads.Qw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import l.C1773j;
import l.InterfaceC1779m;
import p1.AbstractC1935v;
import p1.C1909G;
import p1.C1920f;
import p1.C1929o;
import p1.h0;
import p1.i0;
import q1.C1947b;
import t2.C1995b;
import t2.C1997d;
import t2.C2003j;
import t2.G;
import t2.H;
import t2.L;
import x2.C2066c0;
import x2.I;
import x2.K;
import x2.X;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o implements y, InterfaceC1779m, InterfaceC0235d, A2.a, H, t2.F, b3.c, b3.b, InterfaceC0035j {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13451o;

    /* renamed from: p, reason: collision with root package name */
    public Object f13452p;

    public o(int i4) {
        this.f13451o = i4;
        switch (i4) {
            case 16:
                return;
            default:
                this.f13452p = new HashMap();
                return;
        }
    }

    public /* synthetic */ o(int i4, Object obj) {
        this.f13451o = i4;
        this.f13452p = obj;
    }

    public static /* synthetic */ PointF g(o oVar) {
        return (PointF) oVar.f13452p;
    }

    @Override // k.y
    public void a(m mVar, boolean z4) {
        if (mVar instanceof F) {
            ((F) mVar).f13367z.k().c(false);
        }
        y yVar = ((C1773j) this.f13452p).f13782s;
        if (yVar != null) {
            yVar.a(mVar, z4);
        }
    }

    @Override // b3.c
    public void b(B0.a aVar) {
        ((C1947b) this.f13452p).a();
    }

    @Override // t2.H
    public Object c() {
        switch (this.f13451o) {
            case 12:
                return new C1748e(12, (C1995b) ((C1995b) this.f13452p).f14880o);
            case 13:
                return new C1997d((Application) ((G) this.f13452p).f14862o);
            case 14:
            default:
                t2.E e4 = (t2.E) this.f13452p;
                if (e4 != null) {
                    return e4.c();
                }
                throw new IllegalStateException();
            case 15:
                o oVar = (o) this.f13452p;
                o3.i iVar = t2.s.f14936b;
                t2.r.c(iVar);
                return new C2003j(oVar, iVar);
        }
    }

    @Override // k.y
    public boolean d(m mVar) {
        if (mVar == null) {
            return false;
        }
        C1773j c1773j = (C1773j) this.f13452p;
        c1773j.f13777M = ((F) mVar).f13366A.f13456a;
        y yVar = c1773j.f13782s;
        if (yVar != null) {
            return yVar.d(mVar);
        }
        return false;
    }

    @Override // A2.a
    public Object e(A2.h hVar) {
        Qw qw = (Qw) this.f13452p;
        if (hVar.j() || hVar.h()) {
            return hVar;
        }
        Exception f4 = hVar.f();
        if (!(f4 instanceof f2.d)) {
            return hVar;
        }
        int i4 = ((f2.d) f4).f12962o.f3898o;
        if (i4 == 43001 || i4 == 43002 || i4 == 43003 || i4 == 17) {
            return ((q2.e) qw.f6711q).f();
        }
        if (i4 == 43000) {
            Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
            A2.r rVar = new A2.r();
            rVar.k(exc);
            return rVar;
        }
        if (i4 != 15) {
            return hVar;
        }
        Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
        A2.r rVar2 = new A2.r();
        rVar2.k(exc2);
        return rVar2;
    }

    @Override // b3.b
    public void f() {
        L l4 = (L) this.f13452p;
        synchronized (l4.f14866e) {
            l4.f14868g = false;
        }
    }

    public void h(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f13452p;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i4 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = n0.g.f14089b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i4 < zArr.length) {
                            boolArr[i4] = Boolean.valueOf(zArr[i4]);
                            i4++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = n0.g.f14089b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i4 < bArr.length) {
                            bArr2[i4] = Byte.valueOf(bArr[i4]);
                            i4++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = n0.g.f14089b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i4 < iArr.length) {
                            numArr[i4] = Integer.valueOf(iArr[i4]);
                            i4++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = n0.g.f14089b;
                        Long[] lArr = new Long[jArr.length];
                        while (i4 < jArr.length) {
                            lArr[i4] = Long.valueOf(jArr[i4]);
                            i4++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = n0.g.f14089b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i4 < fArr.length) {
                            fArr2[i4] = Float.valueOf(fArr[i4]);
                            i4++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = n0.g.f14089b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i4 < dArr.length) {
                            dArr2[i4] = Double.valueOf(dArr[i4]);
                            i4++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public void i(int i4, String str, List list, boolean z4, boolean z5) {
        I i5;
        C2066c0 c2066c0 = (C2066c0) ((X) this.f13452p).f1719a;
        int i6 = i4 - 1;
        if (i6 == 0) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            i5 = k3.f15401m;
        } else if (i6 != 1) {
            if (i6 == 3) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                i5 = k4.f15402n;
            } else if (i6 != 4) {
                K k5 = c2066c0.f15568i;
                C2066c0.i(k5);
                i5 = k5.f15400l;
            } else if (z4) {
                K k6 = c2066c0.f15568i;
                C2066c0.i(k6);
                i5 = k6.f15398j;
            } else if (z5) {
                K k7 = c2066c0.f15568i;
                C2066c0.i(k7);
                i5 = k7.f15397i;
            } else {
                K k8 = c2066c0.f15568i;
                C2066c0.i(k8);
                i5 = k8.f15399k;
            }
        } else if (z4) {
            K k9 = c2066c0.f15568i;
            C2066c0.i(k9);
            i5 = k9.f15395g;
        } else if (z5) {
            K k10 = c2066c0.f15568i;
            C2066c0.i(k10);
            i5 = k10.f15394f;
        } else {
            K k11 = c2066c0.f15568i;
            C2066c0.i(k11);
            i5 = k11.f15396h;
        }
        int size = list.size();
        if (size == 1) {
            i5.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            i5.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            i5.a(str);
        } else {
            i5.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public K j() {
        K k3 = C2066c0.p((Service) this.f13452p, null, null).f15568i;
        C2066c0.i(k3);
        return k3;
    }

    @Override // c1.InterfaceC0235d
    public void k(boolean z4) {
        switch (this.f13451o) {
            case 5:
                C1929o c1929o = (C1929o) this.f13452p;
                if (c1929o.f14571T) {
                    c1929o.f14571T = false;
                    c1929o.f13118B.n(new C1920f(c1929o, 1));
                    return;
                }
                return;
            case 6:
                AbstractC1935v abstractC1935v = (AbstractC1935v) this.f13452p;
                boolean z5 = abstractC1935v.f14590R;
                boolean N = abstractC1935v.N();
                abstractC1935v.f14590R = N;
                if (z5 != N && z5 == abstractC1935v.f14589Q.f3557s) {
                    abstractC1935v.f13118B.n(new C1920f(abstractC1935v, 3));
                    return;
                }
                return;
            case 7:
                C1909G c1909g = (C1909G) this.f13452p;
                if (c1909g.f14410T) {
                    c1909g.f14410T = false;
                    c1909g.f13118B.n(new C1920f(c1909g, 5));
                    return;
                }
                return;
            default:
                i0 i0Var = (i0) this.f13452p;
                h0 h0Var = i0Var.f14544Z;
                C0237f c0237f = i0Var.f14541W;
                if (i0Var.f14543Y) {
                    Object obj = c0237f.f1252p;
                    if (obj != null && ((Boolean) obj).booleanValue()) {
                        i0Var.Q(false);
                        return;
                    } else {
                        if (!i0Var.f14546b0 && z4) {
                            i0Var.f14546b0 = true;
                            h0Var.f14534b = 0L;
                            return;
                        }
                        return;
                    }
                }
                Object obj2 = c0237f.f1252p;
                if (obj2 != null && ((Boolean) obj2).booleanValue()) {
                    i0Var.Q(false);
                    return;
                } else {
                    if (!i0Var.f14546b0 && z4) {
                        i0Var.f14546b0 = true;
                        h0Var.f14534b = 0L;
                        i0Var.Q(true);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // H.InterfaceC0035j
    public a0 m(View view, a0 a0Var) {
        W w2 = a0Var.f811a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f13452p;
        if (!Objects.equals(coordinatorLayout.f2657B, a0Var)) {
            coordinatorLayout.f2657B = a0Var;
            boolean z4 = a0Var.b() > 0;
            coordinatorLayout.f2658C = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            if (!w2.l()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    WeakHashMap weakHashMap = H.A.f779a;
                    if (childAt.getFitsSystemWindows() && ((v.e) childAt.getLayoutParams()).f14996a != null && w2.l()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return a0Var;
    }
}
