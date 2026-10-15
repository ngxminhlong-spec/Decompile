package B1;

import D1.h;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import java.util.logging.Logger;
import m2.AbstractC1806a;
import q1.AbstractC1959n;
import u1.C2014b;
import w1.C2045h;
import w1.C2046i;
import x1.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f124o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f125p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f126q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f127r;

    public /* synthetic */ a(c cVar, C2046i c2046i, D3.b bVar, C2045h c2045h) {
        this.f125p = cVar;
        this.f126q = c2046i;
        this.f127r = c2045h;
    }

    public /* synthetic */ a(MainActivity mainActivity, boolean[] zArr, Runnable runnable) {
        this.f125p = mainActivity;
        this.f126q = zArr;
        this.f127r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f124o) {
            case 0:
                c cVar = (c) this.f125p;
                C2046i c2046i = (C2046i) this.f126q;
                String str = c2046i.f15151a;
                C2045h c2045h = (C2045h) this.f127r;
                cVar.getClass();
                Logger logger = c.f132f;
                try {
                    e a4 = cVar.c.a(str);
                    if (a4 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((h) cVar.f135e).g(new b(cVar, c2046i, ((C2014b) a4).a(c2045h), 0));
                    }
                    return;
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    return;
                }
            default:
                MainActivity mainActivity = (MainActivity) this.f125p;
                boolean[] zArr = (boolean[]) this.f126q;
                Runnable runnable = (Runnable) this.f127r;
                if (AbstractC1806a.f14008R && AbstractC1806a.f14009S && AbstractC1806a.f14010T && AbstractC1806a.f14011U) {
                    AbstractC1959n.g(mainActivity, zArr[0]);
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
