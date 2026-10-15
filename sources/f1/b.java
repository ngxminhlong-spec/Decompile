package f1;

import D0.o;
import android.os.Handler;
import g1.InterfaceC1680a;
import java.util.ArrayList;
import java.util.Objects;
import q1.AbstractC1955j;
import s1.C1971a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12956a;
    public final C1971a d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12960g;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12957b = new ArrayList();
    public final ArrayList c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f12958e = new Handler();

    public b(C1971a c1971a) {
        this.d = c1971a;
    }

    public final void a(InterfaceC1680a interfaceC1680a) {
        if (this.f12959f) {
            ArrayList arrayList = this.f12957b;
            if (interfaceC1680a != null) {
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    InterfaceC1680a interfaceC1680a2 = (InterfaceC1680a) obj;
                    if (Objects.equals(interfaceC1680a2.getId(), interfaceC1680a.getId())) {
                        arrayList.remove(interfaceC1680a2);
                        break;
                    }
                }
                arrayList.add(interfaceC1680a);
            }
            if ((!arrayList.isEmpty() || this.f12960g) && !this.f12956a) {
                this.f12956a = true;
                ArrayList arrayList2 = this.c;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                arrayList.clear();
                o oVar = new o(26, this);
                int i5 = AbstractC1955j.f14675a;
                this.f12958e.postDelayed(oVar, 16);
            }
        }
    }
}
