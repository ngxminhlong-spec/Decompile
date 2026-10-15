package x0;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2059a extends c {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0.l f15198p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ UUID f15199q;

    public C2059a(o0.l lVar, UUID uuid) {
        this.f15198p = lVar;
        this.f15199q = uuid;
    }

    @Override // x0.c
    public final void b() {
        o0.l lVar = this.f15198p;
        WorkDatabase workDatabase = lVar.f14175n;
        workDatabase.c();
        try {
            c.a(lVar, this.f15199q.toString());
            workDatabase.h();
            workDatabase.f();
            o0.d.a(lVar.f14174m, lVar.f14175n, lVar.f14177p);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
