package b0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.Tw;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172F extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0187V) ((Observable) this).mObservers.get(size)).f3209a;
            recyclerView.i(null);
            recyclerView.f3081t0.f3219f = true;
            recyclerView.V(true);
            if (!recyclerView.f3076r.k()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i4, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0187V c0187v = (C0187V) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c0187v.f3209a;
            recyclerView.i(null);
            Tw tw = recyclerView.f3076r;
            ArrayList arrayList = (ArrayList) tw.c;
            if (i4 != i5) {
                arrayList.add(tw.m(8, i4, i5, null));
                tw.f7098a |= 8;
                if (arrayList.size() == 1) {
                    c0187v.a();
                }
            }
        }
    }

    public final void d(int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0187V c0187v = (C0187V) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c0187v.f3209a;
            recyclerView.i(null);
            Tw tw = recyclerView.f3076r;
            ArrayList arrayList = (ArrayList) tw.c;
            arrayList.add(tw.m(4, i4, 1, null));
            tw.f7098a |= 4;
            if (arrayList.size() == 1) {
                c0187v.a();
            }
        }
    }

    public final void e(int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0187V c0187v = (C0187V) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c0187v.f3209a;
            recyclerView.i(null);
            Tw tw = recyclerView.f3076r;
            ArrayList arrayList = (ArrayList) tw.c;
            arrayList.add(tw.m(1, i4, 1, null));
            tw.f7098a |= 1;
            if (arrayList.size() == 1) {
                c0187v.a();
            }
        }
    }

    public final void f(int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0187V c0187v = (C0187V) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c0187v.f3209a;
            recyclerView.i(null);
            Tw tw = recyclerView.f3076r;
            ArrayList arrayList = (ArrayList) tw.c;
            arrayList.add(tw.m(2, i4, 1, null));
            tw.f7098a |= 2;
            if (arrayList.size() == 1) {
                c0187v.a();
            }
        }
    }
}
