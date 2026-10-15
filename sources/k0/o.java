package k0;

import H.AbstractC0044t;
import H.E;
import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o2.AbstractC1895f;
import s.AbstractC1969a;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class o implements Cloneable {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f13529G = {2, 1, 3, 4};

    /* renamed from: H, reason: collision with root package name */
    public static final C2033d f13530H = new C2033d(20);

    /* renamed from: I, reason: collision with root package name */
    public static final ThreadLocal f13531I = new ThreadLocal();

    /* renamed from: E, reason: collision with root package name */
    public AbstractC1895f f13536E;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f13546w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f13547x;

    /* renamed from: o, reason: collision with root package name */
    public final String f13538o = getClass().getName();

    /* renamed from: p, reason: collision with root package name */
    public long f13539p = -1;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f13540q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f13541r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public u0.g f13542s = new u0.g(20);

    /* renamed from: t, reason: collision with root package name */
    public u0.g f13543t = new u0.g(20);

    /* renamed from: u, reason: collision with root package name */
    public t f13544u = null;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f13545v = f13529G;
    public final ArrayList y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public int f13548z = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f13532A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13533B = false;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f13534C = null;

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f13535D = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    public C2033d f13537F = f13530H;

    public static void c(u0.g gVar, View view, v vVar) {
        r.e eVar = (r.e) gVar.f14983p;
        r.e eVar2 = (r.e) gVar.f14986s;
        SparseArray sparseArray = (SparseArray) gVar.f14984q;
        r.g gVar2 = (r.g) gVar.f14985r;
        eVar.put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = H.A.f779a;
        String e4 = AbstractC0044t.e(view);
        if (e4 != null) {
            if (eVar2.containsKey(e4)) {
                eVar2.put(e4, null);
            } else {
                eVar2.put(e4, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gVar2.f14733o) {
                    int i4 = gVar2.f14736r;
                    long[] jArr = gVar2.f14734p;
                    Object[] objArr = gVar2.f14735q;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        Object obj = objArr[i6];
                        if (obj != r.h.f14737a) {
                            if (i6 != i5) {
                                jArr[i5] = jArr[i6];
                                objArr[i5] = obj;
                                objArr[i6] = null;
                            }
                            i5++;
                        }
                    }
                    gVar2.f14733o = false;
                    gVar2.f14736r = i5;
                }
                if (AbstractC1969a.b(gVar2.f14734p, gVar2.f14736r, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar2.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar2.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar2.g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [r.e, java.lang.Object, r.i] */
    public static r.e o() {
        ThreadLocal threadLocal = f13531I;
        r.e eVar = (r.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        ?? iVar = new r.i(0);
        threadLocal.set(iVar);
        return iVar;
    }

    public static boolean t(v vVar, v vVar2, String str) {
        Object obj = vVar.f13561a.get(str);
        Object obj2 = vVar2.f13561a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
    }

    public void B(C2033d c2033d) {
        if (c2033d == null) {
            this.f13537F = f13530H;
        } else {
            this.f13537F = c2033d;
        }
    }

    public void C() {
    }

    public void D(long j4) {
        this.f13539p = j4;
    }

    public final void E() {
        if (this.f13548z == 0) {
            ArrayList arrayList = this.f13534C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13534C.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((n) arrayList2.get(i4)).a();
                }
            }
            this.f13533B = false;
        }
        this.f13548z++;
    }

    public String F(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f13539p != -1) {
            str2 = str2 + "dly(" + this.f13539p + ") ";
        }
        ArrayList arrayList = this.f13540q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f13541r;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String h4 = n0.a.h(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (i4 > 0) {
                    h4 = n0.a.h(h4, ", ");
                }
                h4 = h4 + arrayList.get(i4);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                if (i5 > 0) {
                    h4 = n0.a.h(h4, ", ");
                }
                h4 = h4 + arrayList2.get(i5);
            }
        }
        return n0.a.h(h4, ")");
    }

    public void a(n nVar) {
        if (this.f13534C == null) {
            this.f13534C = new ArrayList();
        }
        this.f13534C.add(nVar);
    }

    public void b(View view) {
        this.f13541r.add(view);
    }

    public abstract void d(v vVar);

    public final void e(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            v vVar = new v(view);
            if (z4) {
                g(vVar);
            } else {
                d(vVar);
            }
            vVar.c.add(this);
            f(vVar);
            if (z4) {
                c(this.f13542s, view, vVar);
            } else {
                c(this.f13543t, view, vVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4), z4);
            }
        }
    }

    public void f(v vVar) {
    }

    public abstract void g(v vVar);

    public final void h(ViewGroup viewGroup, boolean z4) {
        i(z4);
        ArrayList arrayList = this.f13540q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f13541r;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z4);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (findViewById != null) {
                v vVar = new v(findViewById);
                if (z4) {
                    g(vVar);
                } else {
                    d(vVar);
                }
                vVar.c.add(this);
                f(vVar);
                if (z4) {
                    c(this.f13542s, findViewById, vVar);
                } else {
                    c(this.f13543t, findViewById, vVar);
                }
            }
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            View view = (View) arrayList2.get(i5);
            v vVar2 = new v(view);
            if (z4) {
                g(vVar2);
            } else {
                d(vVar2);
            }
            vVar2.c.add(this);
            f(vVar2);
            if (z4) {
                c(this.f13542s, view, vVar2);
            } else {
                c(this.f13543t, view, vVar2);
            }
        }
    }

    public final void i(boolean z4) {
        if (z4) {
            ((r.e) this.f13542s.f14983p).clear();
            ((SparseArray) this.f13542s.f14984q).clear();
            ((r.g) this.f13542s.f14985r).b();
        } else {
            ((r.e) this.f13543t.f14983p).clear();
            ((SparseArray) this.f13543t.f14984q).clear();
            ((r.g) this.f13543t.f14985r).b();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f13535D = new ArrayList();
            oVar.f13542s = new u0.g(20);
            oVar.f13543t = new u0.g(20);
            oVar.f13546w = null;
            oVar.f13547x = null;
            return oVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [k0.m, java.lang.Object] */
    public void l(ViewGroup viewGroup, u0.g gVar, u0.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator k3;
        int i4;
        int i5;
        View view;
        v vVar;
        Animator animator;
        v vVar2;
        r.e o4 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            v vVar3 = (v) arrayList.get(i6);
            v vVar4 = (v) arrayList2.get(i6);
            if (vVar3 != null && !vVar3.c.contains(this)) {
                vVar3 = null;
            }
            if (vVar4 != null && !vVar4.c.contains(this)) {
                vVar4 = null;
            }
            if (!(vVar3 == null && vVar4 == null) && ((vVar3 == null || vVar4 == null || r(vVar3, vVar4)) && (k3 = k(viewGroup, vVar3, vVar4)) != null)) {
                String str = this.f13538o;
                if (vVar4 != null) {
                    view = vVar4.f13562b;
                    String[] p3 = p();
                    if (p3 != null && p3.length > 0) {
                        vVar2 = new v(view);
                        v vVar5 = (v) ((r.e) gVar2.f14983p).get(view);
                        i4 = size;
                        if (vVar5 != null) {
                            int i7 = 0;
                            while (i7 < p3.length) {
                                String str2 = p3[i7];
                                vVar2.f13561a.put(str2, vVar5.f13561a.get(str2));
                                i7++;
                                i6 = i6;
                                vVar5 = vVar5;
                            }
                        }
                        i5 = i6;
                        int i8 = o4.f14741q;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= i8) {
                                animator = k3;
                                break;
                            }
                            m mVar = (m) o4.get((Animator) o4.f(i9));
                            if (mVar.c != null && mVar.f13526a == view && mVar.f13527b.equals(str) && mVar.c.equals(vVar2)) {
                                animator = null;
                                break;
                            }
                            i9++;
                        }
                    } else {
                        i4 = size;
                        i5 = i6;
                        animator = k3;
                        vVar2 = null;
                    }
                    k3 = animator;
                    vVar = vVar2;
                } else {
                    i4 = size;
                    i5 = i6;
                    view = vVar3.f13562b;
                    vVar = null;
                }
                if (k3 != null) {
                    x xVar = w.f13563a;
                    B b4 = new B(viewGroup);
                    ?? obj = new Object();
                    obj.f13526a = view;
                    obj.f13527b = str;
                    obj.c = vVar;
                    obj.d = b4;
                    obj.f13528e = this;
                    o4.put(k3, obj);
                    this.f13535D.add(k3);
                }
            } else {
                i4 = size;
                i5 = i6;
            }
            i6 = i5 + 1;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                Animator animator2 = (Animator) this.f13535D.get(sparseIntArray.keyAt(i10));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i10) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i4 = this.f13548z - 1;
        this.f13548z = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.f13534C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13534C.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((n) arrayList2.get(i5)).e(this);
                }
            }
            for (int i6 = 0; i6 < ((r.g) this.f13542s.f14985r).h(); i6++) {
                View view = (View) ((r.g) this.f13542s.f14985r).i(i6);
                if (view != null) {
                    WeakHashMap weakHashMap = H.A.f779a;
                    view.setHasTransientState(false);
                }
            }
            for (int i7 = 0; i7 < ((r.g) this.f13543t.f14985r).h(); i7++) {
                View view2 = (View) ((r.g) this.f13543t.f14985r).i(i7);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = H.A.f779a;
                    view2.setHasTransientState(false);
                }
            }
            this.f13533B = true;
        }
    }

    public final v n(View view, boolean z4) {
        t tVar = this.f13544u;
        if (tVar != null) {
            return tVar.n(view, z4);
        }
        ArrayList arrayList = z4 ? this.f13546w : this.f13547x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            v vVar = (v) arrayList.get(i4);
            if (vVar == null) {
                return null;
            }
            if (vVar.f13562b == view) {
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            return (v) (z4 ? this.f13547x : this.f13546w).get(i4);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final v q(View view, boolean z4) {
        t tVar = this.f13544u;
        if (tVar != null) {
            return tVar.q(view, z4);
        }
        return (v) ((r.e) (z4 ? this.f13542s : this.f13543t).f14983p).get(view);
    }

    public boolean r(v vVar, v vVar2) {
        if (vVar != null && vVar2 != null) {
            String[] p3 = p();
            if (p3 != null) {
                for (String str : p3) {
                    if (t(vVar, vVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = vVar.f13561a.keySet().iterator();
                while (it.hasNext()) {
                    if (t(vVar, vVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f13540q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f13541r;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return F("");
    }

    public void u(ViewGroup viewGroup) {
        if (this.f13533B) {
            return;
        }
        r.e o4 = o();
        int i4 = o4.f14741q;
        x xVar = w.f13563a;
        WindowId windowId = viewGroup.getWindowId();
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            m mVar = (m) o4.i(i5);
            if (mVar.f13526a != null && mVar.d.f13501a.equals(windowId)) {
                ((Animator) o4.f(i5)).pause();
            }
        }
        ArrayList arrayList = this.f13534C;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f13534C.clone();
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((n) arrayList2.get(i6)).b();
            }
        }
        this.f13532A = true;
    }

    public void v(n nVar) {
        ArrayList arrayList = this.f13534C;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(nVar);
        if (this.f13534C.size() == 0) {
            this.f13534C = null;
        }
    }

    public void w(View view) {
        this.f13541r.remove(view);
    }

    public void x(View view) {
        if (this.f13532A) {
            if (!this.f13533B) {
                r.e o4 = o();
                int i4 = o4.f14741q;
                x xVar = w.f13563a;
                WindowId windowId = view.getWindowId();
                for (int i5 = i4 - 1; i5 >= 0; i5--) {
                    m mVar = (m) o4.i(i5);
                    if (mVar.f13526a != null && mVar.d.f13501a.equals(windowId)) {
                        ((Animator) o4.f(i5)).resume();
                    }
                }
                ArrayList arrayList = this.f13534C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f13534C.clone();
                    int size = arrayList2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((n) arrayList2.get(i6)).c();
                    }
                }
            }
            this.f13532A = false;
        }
    }

    public void y() {
        E();
        r.e o4 = o();
        ArrayList arrayList = this.f13535D;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Animator animator = (Animator) obj;
            if (o4.containsKey(animator)) {
                E();
                if (animator != null) {
                    animator.addListener(new E(this, o4));
                    long j4 = this.f13539p;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    animator.addListener(new E2.a(6, this));
                    animator.start();
                }
            }
        }
        this.f13535D.clear();
        m();
    }

    public void z(AbstractC1895f abstractC1895f) {
        this.f13536E = abstractC1895f;
    }
}
