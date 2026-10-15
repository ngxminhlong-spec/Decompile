package E;

import com.google.android.gms.internal.ads.C0783ji;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f691b;

    public /* synthetic */ g(int i4, Object obj) {
        this.f690a = i4;
        this.f691b = obj;
    }

    public final void a(Object obj) {
        switch (this.f690a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((C0783ji) this.f691b).s(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.c) {
                    try {
                        r.i iVar = i.d;
                        ArrayList arrayList = (ArrayList) iVar.get((String) this.f691b);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f691b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((g) arrayList.get(i4)).a(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
