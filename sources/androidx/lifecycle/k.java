package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import m.C1801a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2976a;

    /* renamed from: b, reason: collision with root package name */
    public n.a f2977b;
    public g c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f2978e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2979f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2980g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2981h;

    public k(i iVar) {
        new AtomicReference();
        this.f2976a = true;
        this.f2977b = new n.a();
        this.c = g.f2969p;
        this.f2981h = new ArrayList();
        this.d = new WeakReference(iVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.j] */
    public final void a(h hVar) {
        Object obj;
        i iVar;
        c("addObserver");
        g gVar = this.c;
        g gVar2 = g.f2968o;
        if (gVar != gVar2) {
            gVar2 = g.f2969p;
        }
        ?? obj2 = new Object();
        int i4 = m.f2983a;
        obj2.f2975b = hVar;
        obj2.f2974a = gVar2;
        n.a aVar = this.f2977b;
        n.c g4 = aVar.g(hVar);
        if (g4 != null) {
            obj = g4.f14061p;
        } else {
            HashMap hashMap = aVar.f14056s;
            n.c cVar = new n.c(hVar, obj2);
            aVar.f14070r++;
            n.c cVar2 = aVar.f14068p;
            if (cVar2 == null) {
                aVar.f14067o = cVar;
                aVar.f14068p = cVar;
            } else {
                cVar2.f14062q = cVar;
                cVar.f14063r = cVar2;
                aVar.f14068p = cVar;
            }
            hashMap.put(hVar, cVar);
            obj = null;
        }
        if (((j) obj) == null && (iVar = (i) this.d.get()) != null) {
            boolean z4 = this.f2978e != 0 || this.f2979f;
            g b4 = b(hVar);
            this.f2978e++;
            while (obj2.f2974a.compareTo(b4) < 0 && this.f2977b.f14056s.containsKey(hVar)) {
                g gVar3 = obj2.f2974a;
                ArrayList arrayList = this.f2981h;
                arrayList.add(gVar3);
                d dVar = f.Companion;
                g gVar4 = obj2.f2974a;
                dVar.getClass();
                S3.e.e(gVar4, "state");
                int ordinal = gVar4.ordinal();
                f fVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : f.ON_RESUME : f.ON_START : f.ON_CREATE;
                if (fVar == null) {
                    throw new IllegalStateException("no event up from " + obj2.f2974a);
                }
                obj2.a(iVar, fVar);
                arrayList.remove(arrayList.size() - 1);
                b4 = b(hVar);
            }
            if (!z4) {
                g();
            }
            this.f2978e--;
        }
    }

    public final g b(h hVar) {
        HashMap hashMap = this.f2977b.f14056s;
        n.c cVar = hashMap.containsKey(hVar) ? ((n.c) hashMap.get(hVar)).f14063r : null;
        g gVar = cVar != null ? ((j) cVar.f14061p).f2974a : null;
        ArrayList arrayList = this.f2981h;
        g gVar2 = arrayList.isEmpty() ? null : (g) arrayList.get(arrayList.size() - 1);
        g gVar3 = this.c;
        S3.e.e(gVar3, "state1");
        if (gVar == null || gVar.compareTo(gVar3) >= 0) {
            gVar = gVar3;
        }
        return (gVar2 == null || gVar2.compareTo(gVar) >= 0) ? gVar : gVar2;
    }

    public final void c(String str) {
        if (this.f2976a) {
            C1801a.j0().f13969h.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(U.a.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(f fVar) {
        S3.e.e(fVar, "event");
        c("handleLifecycleEvent");
        e(fVar.a());
    }

    public final void e(g gVar) {
        g gVar2 = this.c;
        if (gVar2 == gVar) {
            return;
        }
        g gVar3 = g.f2969p;
        g gVar4 = g.f2968o;
        if (gVar2 == gVar3 && gVar == gVar4) {
            throw new IllegalStateException(("no event down from " + this.c + " in component " + this.d.get()).toString());
        }
        this.c = gVar;
        if (this.f2979f || this.f2978e != 0) {
            this.f2980g = true;
            return;
        }
        this.f2979f = true;
        g();
        this.f2979f = false;
        if (this.c == gVar4) {
            this.f2977b = new n.a();
        }
    }

    public final void f(h hVar) {
        S3.e.e(hVar, "observer");
        c("removeObserver");
        this.f2977b.h(hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f2980g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.k.g():void");
    }
}
