package androidx.fragment.app;

import H.AbstractC0044t;
import android.view.View;
import com.google.android.gms.internal.ads.C0496ct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2764o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2765p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r.e f2766q;

    public /* synthetic */ H(ArrayList arrayList, r.e eVar, int i4) {
        this.f2764o = i4;
        this.f2765p = arrayList;
        this.f2766q = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i4 = this.f2764o;
        r.e eVar = this.f2766q;
        int i5 = 0;
        ArrayList arrayList = this.f2765p;
        switch (i4) {
            case 0:
                int size = arrayList.size();
                while (i5 < size) {
                    View view = (View) arrayList.get(i5);
                    WeakHashMap weakHashMap = H.A.f779a;
                    String e4 = AbstractC0044t.e(view);
                    if (e4 != null) {
                        Iterator it = ((C0496ct) eVar.entrySet()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (e4.equals(entry.getValue())) {
                                    str = (String) entry.getKey();
                                }
                            } else {
                                str = null;
                            }
                        }
                        AbstractC0044t.l(view, str);
                    }
                    i5++;
                }
                return;
            default:
                int size2 = arrayList.size();
                while (i5 < size2) {
                    View view2 = (View) arrayList.get(i5);
                    WeakHashMap weakHashMap2 = H.A.f779a;
                    AbstractC0044t.l(view2, (String) eVar.get(AbstractC0044t.e(view2)));
                    i5++;
                }
                return;
        }
    }
}
