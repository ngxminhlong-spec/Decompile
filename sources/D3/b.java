package D3;

import b3.InterfaceC0219a;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.storage.k;
import com.google.firebase.storage.l;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import l1.C1794a;
import n3.InterfaceC1817d;
import n3.m;
import q1.AbstractC1949d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1817d, k, InterfaceC0219a {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f672o;

    public /* synthetic */ b(int i4) {
        this.f672o = i4;
    }

    @Override // com.google.firebase.storage.k
    public void a(Object obj, l lVar) {
        switch (this.f672o) {
            case 3:
                ((C1794a) obj).getClass();
                return;
            default:
                obj.getClass();
                throw new ClassCastException();
        }
    }

    @Override // b3.InterfaceC0219a
    public void b() {
        Boolean bool = AbstractC1949d.f14650a;
    }

    @Override // n3.InterfaceC1817d
    public Object c(C0326Qb c0326Qb) {
        switch (this.f672o) {
            case 0:
                Set x4 = c0326Qb.x(a.class);
                d dVar = d.f675q;
                if (dVar == null) {
                    synchronized (d.class) {
                        try {
                            dVar = d.f675q;
                            if (dVar == null) {
                                dVar = new d(0);
                                d.f675q = dVar;
                            }
                        } finally {
                        }
                    }
                }
                return new c(x4, dVar);
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12545a.get();
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12546b.get();
            case 13:
                m mVar = ExecutorsRegistrar.f12545a;
                return o3.l.f14370o;
            default:
                return FirebaseInstallationsRegistrar.a(c0326Qb);
        }
    }
}
