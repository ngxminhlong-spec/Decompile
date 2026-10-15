package x0;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15200p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o0.l f15201q;

    public /* synthetic */ b(o0.l lVar, int i4) {
        this.f15200p = i4;
        this.f15201q = lVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // x0.c
    public final void b() {
        switch (this.f15200p) {
            case 0:
                o0.l lVar = this.f15201q;
                WorkDatabase workDatabase = lVar.f14175n;
                workDatabase.c();
                try {
                    ArrayList g4 = workDatabase.n().g();
                    int size = g4.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = g4.get(i4);
                        i4++;
                        c.a(lVar, (String) obj);
                    }
                    workDatabase.h();
                    workDatabase.f();
                    o0.d.a(lVar.f14174m, lVar.f14175n, lVar.f14177p);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            default:
                o0.l lVar2 = this.f15201q;
                WorkDatabase workDatabase2 = lVar2.f14175n;
                workDatabase2.c();
                try {
                    ArrayList f4 = workDatabase2.n().f();
                    int size2 = f4.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = f4.get(i5);
                        i5++;
                        c.a(lVar2, (String) obj2);
                    }
                    workDatabase2.h();
                    workDatabase2.f();
                    return;
                } catch (Throwable th2) {
                    workDatabase2.f();
                    throw th2;
                }
        }
    }
}
