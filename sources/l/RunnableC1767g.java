package l;

import android.graphics.Typeface;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1767g implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13753o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final Object f13754p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f13755q;

    public RunnableC1767g(WeakReference weakReference, Typeface typeface) {
        this.f13754p = weakReference;
        this.f13755q = typeface;
    }

    public RunnableC1767g(C1773j c1773j, C1763e c1763e) {
        this.f13755q = c1773j;
        this.f13754p = c1763e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.k kVar;
        switch (this.f13753o) {
            case 0:
                C1763e c1763e = (C1763e) this.f13754p;
                C1773j c1773j = (C1773j) this.f13755q;
                k.m mVar = c1773j.f13780q;
                if (mVar != null && (kVar = mVar.f13428e) != null) {
                    kVar.i(mVar);
                }
                View view = (View) c1773j.f13785v;
                if (view != null && view.getWindowToken() != null) {
                    if (!c1763e.b()) {
                        if (c1763e.f13490e != null) {
                            c1763e.d(0, 0, false, false);
                        }
                    }
                    c1773j.f13772H = c1763e;
                }
                c1773j.f13774J = null;
                return;
            default:
                L l4 = (L) ((WeakReference) this.f13754p).get();
                if (l4 == null) {
                    return;
                }
                Typeface typeface = (Typeface) this.f13755q;
                if (l4.f13658m) {
                    l4.f13648a.setTypeface(typeface);
                    l4.f13657l = typeface;
                    return;
                }
                return;
        }
    }
}
