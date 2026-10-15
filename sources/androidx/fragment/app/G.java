package androidx.fragment.app;

import H.AbstractC0044t;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2759o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2760p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2761q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2762r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2763s;

    public G(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2759o = i4;
        this.f2760p = arrayList;
        this.f2761q = arrayList2;
        this.f2762r = arrayList3;
        this.f2763s = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i4 = 0; i4 < this.f2759o; i4++) {
            View view = (View) this.f2760p.get(i4);
            String str = (String) this.f2761q.get(i4);
            WeakHashMap weakHashMap = H.A.f779a;
            AbstractC0044t.l(view, str);
            AbstractC0044t.l((View) this.f2762r.get(i4), (String) this.f2763s.get(i4));
        }
    }
}
