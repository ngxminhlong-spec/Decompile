package b0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0199l implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final ThreadLocal f3344s = new ThreadLocal();

    /* renamed from: t, reason: collision with root package name */
    public static final C0.i0 f3345t = new C0.i0(2);

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3346o;

    /* renamed from: p, reason: collision with root package name */
    public long f3347p;

    /* renamed from: q, reason: collision with root package name */
    public long f3348q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3349r;

    public static c0 c(RecyclerView recyclerView, int i4, long j4) {
        int u2 = recyclerView.f3078s.u();
        for (int i5 = 0; i5 < u2; i5++) {
            c0 J4 = RecyclerView.J(recyclerView.f3078s.t(i5));
            if (J4.c == i4 && !J4.g()) {
                return null;
            }
        }
        C0185T c0185t = recyclerView.f3072p;
        try {
            recyclerView.Q();
            c0 i6 = c0185t.i(i4, j4);
            if (i6 != null) {
                if (!i6.f() || i6.g()) {
                    c0185t.a(i6, false);
                } else {
                    c0185t.f(i6.f3244a);
                }
            }
            recyclerView.R(false);
            return i6;
        } catch (Throwable th) {
            recyclerView.R(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.f3033E && this.f3347p == 0) {
            this.f3347p = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0197j c0197j = recyclerView.f3079s0;
        c0197j.f3326b = i4;
        c0197j.c = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j4) {
        C0198k c0198k;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0198k c0198k2;
        ArrayList arrayList = this.f3349r;
        ArrayList arrayList2 = this.f3346o;
        int size = arrayList2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i5);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C0197j c0197j = recyclerView3.f3079s0;
            if (windowVisibility == 0) {
                c0197j.c(recyclerView3, false);
                i4 += c0197j.d;
            }
        }
        arrayList.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i7);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0197j c0197j2 = recyclerView4.f3079s0;
                int abs = Math.abs(c0197j2.c) + Math.abs(c0197j2.f3326b);
                for (int i8 = 0; i8 < c0197j2.d * 2; i8 += 2) {
                    if (i6 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        c0198k2 = obj;
                    } else {
                        c0198k2 = (C0198k) arrayList.get(i6);
                    }
                    int[] iArr = c0197j2.f3325a;
                    int i9 = iArr[i8 + 1];
                    c0198k2.f3331a = i9 <= abs;
                    c0198k2.f3332b = abs;
                    c0198k2.c = i9;
                    c0198k2.d = recyclerView4;
                    c0198k2.f3333e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(arrayList, f3345t);
        for (int i10 = 0; i10 < arrayList.size() && (recyclerView = (c0198k = (C0198k) arrayList.get(i10)).d) != null; i10++) {
            c0 c = c(recyclerView, c0198k.f3333e, c0198k.f3331a ? Long.MAX_VALUE : j4);
            if (c != null && c.f3245b != null && c.f() && !c.g() && (recyclerView2 = (RecyclerView) c.f3245b.get()) != null) {
                if (recyclerView2.f3048P && recyclerView2.f3078s.u() != 0) {
                    C0185T c0185t = recyclerView2.f3072p;
                    AbstractC0175I abstractC0175I = recyclerView2.f3057b0;
                    if (abstractC0175I != null) {
                        abstractC0175I.e();
                    }
                    AbstractC0178L abstractC0178L = recyclerView2.f3025A;
                    if (abstractC0178L != null) {
                        abstractC0178L.f0(c0185t);
                        recyclerView2.f3025A.g0(c0185t);
                    }
                    c0185t.f3203a.clear();
                    c0185t.d();
                }
                C0197j c0197j3 = recyclerView2.f3079s0;
                c0197j3.c(recyclerView2, true);
                if (c0197j3.d != 0) {
                    try {
                        int i11 = D.i.f528a;
                        Trace.beginSection("RV Nested Prefetch");
                        Z z4 = recyclerView2.f3081t0;
                        AbstractC0171E abstractC0171E = recyclerView2.f3091z;
                        z4.d = 1;
                        z4.f3218e = abstractC0171E.a();
                        z4.f3220g = false;
                        z4.f3221h = false;
                        z4.f3222i = false;
                        for (int i12 = 0; i12 < c0197j3.d * 2; i12 += 2) {
                            c(recyclerView2, c0197j3.f3325a[i12], j4);
                        }
                        Trace.endSection();
                        c0198k.f3331a = false;
                        c0198k.f3332b = 0;
                        c0198k.c = 0;
                        c0198k.d = null;
                        c0198k.f3333e = 0;
                    } catch (Throwable th) {
                        int i13 = D.i.f528a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0198k.f3331a = false;
            c0198k.f3332b = 0;
            c0198k.c = 0;
            c0198k.d = null;
            c0198k.f3333e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f3346o;
        try {
            int i4 = D.i.f528a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j4) + this.f3348q);
                }
            }
            this.f3347p = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f3347p = 0L;
            int i6 = D.i.f528a;
            Trace.endSection();
            throw th;
        }
    }
}
