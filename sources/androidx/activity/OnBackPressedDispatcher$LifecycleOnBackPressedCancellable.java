package androidx.activity;

import androidx.fragment.app.C0161j;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements h, a {

    /* renamed from: o, reason: collision with root package name */
    public final k f2407o;

    /* renamed from: p, reason: collision with root package name */
    public final C0161j f2408p;

    /* renamed from: q, reason: collision with root package name */
    public e f2409q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f2410r;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(f fVar, k kVar, C0161j c0161j) {
        this.f2410r = fVar;
        this.f2407o = kVar;
        this.f2408p = c0161j;
        kVar.a(this);
    }

    @Override // androidx.lifecycle.h
    public final void a(i iVar, androidx.lifecycle.f fVar) {
        if (fVar == androidx.lifecycle.f.ON_START) {
            f fVar2 = this.f2410r;
            ArrayDeque arrayDeque = fVar2.f2424b;
            C0161j c0161j = this.f2408p;
            arrayDeque.add(c0161j);
            e eVar = new e(fVar2, c0161j);
            c0161j.f2869b.add(eVar);
            this.f2409q = eVar;
            return;
        }
        if (fVar != androidx.lifecycle.f.ON_STOP) {
            if (fVar == androidx.lifecycle.f.ON_DESTROY) {
                cancel();
            }
        } else {
            e eVar2 = this.f2409q;
            if (eVar2 != null) {
                eVar2.cancel();
            }
        }
    }

    @Override // androidx.activity.a
    public final void cancel() {
        this.f2407o.f(this);
        this.f2408p.f2869b.remove(this);
        e eVar = this.f2409q;
        if (eVar != null) {
            eVar.cancel();
            this.f2409q = null;
        }
    }
}
