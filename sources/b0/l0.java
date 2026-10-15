package b0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.internal.ads.C1289vF;
import com.google.android.gms.internal.ads.UE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import k.C1748e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3350a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3351b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3352e;

    /* renamed from: f, reason: collision with root package name */
    public int f3353f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3354g;

    public l0() {
        this.f3350a = 1;
        this.f3354g = new C1289vF[5];
        this.f3351b = new ArrayList();
        this.c = -1;
    }

    public l0(int i4) {
        this.f3350a = 2;
        this.c = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3351b = new C1748e(10);
        this.f3354g = new V2.e(27);
    }

    public l0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f3350a = 0;
        this.f3354g = staggeredGridLayoutManager;
        this.f3351b = new ArrayList();
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.f3352e = 0;
        this.f3353f = i4;
    }

    public static void l(Object obj, Object obj2) {
        S3.e.e(obj, "key");
        S3.e.e(obj2, "value");
    }

    public void a() {
        View view = (View) ((ArrayList) this.f3351b).get(r0.size() - 1);
        i0 i0Var = (i0) view.getLayoutParams();
        this.d = ((StaggeredGridLayoutManager) this.f3354g).f3106r.b(view);
        i0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f3351b).clear();
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.f3352e = 0;
    }

    public Object c(Object obj) {
        S3.e.e(obj, "key");
        return null;
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f3354g).f3111w ? f(r0.size() - 1, -1) : f(0, ((ArrayList) this.f3351b).size());
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.f3354g).f3111w ? f(0, ((ArrayList) this.f3351b).size()) : f(r0.size() - 1, -1);
    }

    public int f(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3354g;
        int j4 = staggeredGridLayoutManager.f3106r.j();
        int g4 = staggeredGridLayoutManager.f3106r.g();
        int i6 = i5 > i4 ? 1 : -1;
        while (i4 != i5) {
            View view = (View) ((ArrayList) this.f3351b).get(i4);
            int e4 = staggeredGridLayoutManager.f3106r.e(view);
            int b4 = staggeredGridLayoutManager.f3106r.b(view);
            boolean z4 = e4 <= g4;
            boolean z5 = b4 >= j4;
            if (z4 && z5 && (e4 < j4 || b4 > g4)) {
                return AbstractC0178L.H(view);
            }
            i4 += i6;
        }
        return -1;
    }

    public Object g(Object obj) {
        Object put;
        S3.e.e(obj, "key");
        synchronized (((V2.e) this.f3354g)) {
            C1748e c1748e = (C1748e) this.f3351b;
            c1748e.getClass();
            Object obj2 = ((LinkedHashMap) c1748e.f13386p).get(obj);
            if (obj2 != null) {
                this.f3352e++;
                return obj2;
            }
            this.f3353f++;
            Object c = c(obj);
            if (c == null) {
                return null;
            }
            synchronized (((V2.e) this.f3354g)) {
                C1748e c1748e2 = (C1748e) this.f3351b;
                c1748e2.getClass();
                put = ((LinkedHashMap) c1748e2.f13386p).put(obj, c);
                if (put != null) {
                    C1748e c1748e3 = (C1748e) this.f3351b;
                    c1748e3.getClass();
                    ((LinkedHashMap) c1748e3.f13386p).put(obj, put);
                } else {
                    int i4 = this.d;
                    l(obj, c);
                    this.d = i4 + 1;
                }
            }
            if (put != null) {
                return put;
            }
            m(this.c);
            return c;
        }
    }

    public int h(int i4) {
        int i5 = this.d;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (((ArrayList) this.f3351b).size() == 0) {
            return i4;
        }
        a();
        return this.d;
    }

    public View i(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3354g;
        ArrayList arrayList = (ArrayList) this.f3351b;
        View view = null;
        if (i5 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f3111w && AbstractC0178L.H(view2) >= i4) || ((!staggeredGridLayoutManager.f3111w && AbstractC0178L.H(view2) <= i4) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            View view3 = (View) arrayList.get(i6);
            if ((staggeredGridLayoutManager.f3111w && AbstractC0178L.H(view3) <= i4) || ((!staggeredGridLayoutManager.f3111w && AbstractC0178L.H(view3) >= i4) || !view3.hasFocusable())) {
                break;
            }
            i6++;
            view = view3;
        }
        return view;
    }

    public int j(int i4) {
        ArrayList arrayList = (ArrayList) this.f3351b;
        int i5 = this.c;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (arrayList.size() == 0) {
            return i4;
        }
        View view = (View) arrayList.get(0);
        i0 i0Var = (i0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.f3354g).f3106r.e(view);
        i0Var.getClass();
        return this.c;
    }

    public Object k(Object obj, Object obj2) {
        Object put;
        S3.e.e(obj, "key");
        synchronized (((V2.e) this.f3354g)) {
            int i4 = this.d;
            l(obj, obj2);
            this.d = i4 + 1;
            C1748e c1748e = (C1748e) this.f3351b;
            c1748e.getClass();
            put = ((LinkedHashMap) c1748e.f13386p).put(obj, obj2);
            if (put != null) {
                int i5 = this.d;
                l(obj, put);
                this.d = i5 - 1;
            }
        }
        m(this.c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a3, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.f3354g
            V2.e r0 = (V2.e) r0
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L9c
            java.lang.Object r1 = r5.f3351b     // Catch: java.lang.Throwable -> L1c
            k.e r1 = (k.C1748e) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f13386p     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            int r1 = r5.d     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L9c
            goto L1f
        L1c:
            r6 = move-exception
            goto La4
        L1f:
            int r1 = r5.d     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r6) goto L9a
            java.lang.Object r1 = r5.f3351b     // Catch: java.lang.Throwable -> L1c
            k.e r1 = (k.C1748e) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f13386p     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L32
            goto L9a
        L32:
            java.lang.Object r1 = r5.f3351b     // Catch: java.lang.Throwable -> L1c
            k.e r1 = (k.C1748e) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f13386p     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "map.entries"
            S3.e.d(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L59
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L53
            goto L68
        L53:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L1c
            goto L68
        L59:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L64
            goto L68
        L64:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1c
        L68:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L6e
            monitor-exit(r0)
            return
        L6e:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r5.f3351b     // Catch: java.lang.Throwable -> L1c
            k.e r3 = (k.C1748e) r3     // Catch: java.lang.Throwable -> L1c
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            S3.e.e(r1, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.f13386p     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L1c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.d     // Catch: java.lang.Throwable -> L1c
            l(r1, r2)     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + (-1)
            r5.d = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            java.lang.String r0 = "oldValue"
            S3.e.e(r2, r0)
            goto L0
        L9a:
            monitor-exit(r0)
            return
        L9c:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        La4:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l0.m(int):void");
    }

    public float n() {
        ArrayList arrayList = (ArrayList) this.f3351b;
        if (this.c != 0) {
            Collections.sort(arrayList, UE.y);
            this.c = 0;
        }
        float f4 = this.f3352e;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            float f5 = 0.5f * f4;
            C1289vF c1289vF = (C1289vF) arrayList.get(i5);
            i4 += c1289vF.f11029b;
            if (i4 >= f5) {
                return c1289vF.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C1289vF) arrayList.get(arrayList.size() - 1)).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(int i4, float f4) {
        C1289vF c1289vF;
        C1289vF[] c1289vFArr = (C1289vF[]) this.f3354g;
        ArrayList arrayList = (ArrayList) this.f3351b;
        if (this.c != 1) {
            Collections.sort(arrayList, UE.f7162x);
            this.c = 1;
        }
        int i5 = this.f3353f;
        if (i5 > 0) {
            int i6 = i5 - 1;
            this.f3353f = i6;
            c1289vF = c1289vFArr[i6];
        } else {
            c1289vF = new Object();
        }
        int i7 = this.d;
        this.d = i7 + 1;
        c1289vF.f11028a = i7;
        c1289vF.f11029b = i4;
        c1289vF.c = f4;
        arrayList.add(c1289vF);
        this.f3352e += i4;
        while (true) {
            int i8 = this.f3352e;
            if (i8 <= 2000) {
                return;
            }
            int i9 = i8 - 2000;
            C1289vF c1289vF2 = (C1289vF) arrayList.get(0);
            int i10 = c1289vF2.f11029b;
            if (i10 <= i9) {
                this.f3352e -= i10;
                arrayList.remove(0);
                int i11 = this.f3353f;
                if (i11 < 5) {
                    this.f3353f = i11 + 1;
                    c1289vFArr[i11] = c1289vF2;
                }
            } else {
                c1289vF2.f11029b = i10 - i9;
                this.f3352e -= i9;
            }
        }
    }

    public String toString() {
        String str;
        switch (this.f3350a) {
            case 2:
                synchronized (((V2.e) this.f3354g)) {
                    try {
                        int i4 = this.f3352e;
                        int i5 = this.f3353f + i4;
                        str = "LruCache[maxSize=" + this.c + ",hits=" + this.f3352e + ",misses=" + this.f3353f + ",hitRate=" + (i5 != 0 ? (i4 * 100) / i5 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }
}
