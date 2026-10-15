package androidx.activity;

import D0.o;
import androidx.fragment.app.C0161j;
import androidx.fragment.app.s;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o f2423a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2424b = new ArrayDeque();

    public f(o oVar) {
        this.f2423a = oVar;
    }

    public final void a(i iVar, C0161j c0161j) {
        k f4 = iVar.f();
        if (f4.c == g.f2968o) {
            return;
        }
        c0161j.f2869b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, f4, c0161j));
    }

    public final void b() {
        Iterator descendingIterator = this.f2424b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0161j c0161j = (C0161j) descendingIterator.next();
            if (c0161j.f2868a) {
                s sVar = c0161j.c;
                sVar.K();
                if (sVar.y.f2868a) {
                    sVar.a0();
                    return;
                } else {
                    sVar.f2910x.b();
                    return;
                }
            }
        }
        o oVar = this.f2423a;
        if (oVar != null) {
            oVar.run();
        }
    }
}
