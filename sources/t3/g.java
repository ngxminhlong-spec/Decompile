package t3;

import N1.l;
import O1.C0077n;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0229j;
import com.google.android.gms.internal.ads.C0326Qb;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import l.J0;
import m2.AbstractC1806a;
import t1.C1990a;
import t1.C1991b;
import t1.EnumC1992c;
import v3.C2033d;
import w1.C2046i;
import w1.C2049l;
import w1.C2052o;
import x0.k;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements y1.b, InterfaceC2132a {

    /* renamed from: o, reason: collision with root package name */
    public Object f14961o;

    /* renamed from: p, reason: collision with root package name */
    public Object f14962p;

    /* renamed from: q, reason: collision with root package name */
    public Object f14963q;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3) {
        this.f14961o = obj;
        this.f14962p = obj2;
        this.f14963q = obj3;
    }

    public C2046i a() {
        String str = ((String) this.f14961o) == null ? " backendName" : "";
        if (((EnumC1992c) this.f14963q) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new C2046i((String) this.f14961o, (byte[]) this.f14962p, (EnumC1992c) this.f14963q);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void b(z1.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f14961o;
        e eVar = new e(byteArrayOutputStream, hashMap, (HashMap) this.f14962p, (q3.d) this.f14963q);
        q3.d dVar = (q3.d) hashMap.get(z1.a.class);
        if (dVar != null) {
            dVar.a(aVar, eVar);
        } else {
            throw new RuntimeException("No encoder for " + z1.a.class);
        }
    }

    public void c(Runnable runnable) {
        ((k) this.f14961o).execute(runnable);
    }

    public w0.d d(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14961o;
        C0229j d = C0229j.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            d.f(1);
        } else {
            d.g(str, 1);
        }
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            return g4.moveToFirst() ? new w0.d(g4.getString(AbstractC1806a.n(g4, "work_spec_id")), g4.getInt(AbstractC1806a.n(g4, "system_id"))) : null;
        } finally {
            g4.close();
            d.h();
        }
    }

    public void e(w0.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14961o;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((w0.b) this.f14962p).e(dVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void f(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14961o;
        workDatabase_Impl.b();
        w0.e eVar = (w0.e) this.f14963q;
        h0.f a4 = eVar.a();
        if (str == null) {
            a4.e(1);
        } else {
            a4.f(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a4.l();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a4);
        }
    }

    public void g(C1990a c1990a) {
        D3.b bVar = new D3.b(15);
        C2052o c2052o = (C2052o) this.f14963q;
        C2046i c2046i = (C2046i) this.f14961o;
        C1991b c1991b = (C1991b) this.f14962p;
        B1.d dVar = c2052o.c;
        g a4 = C2046i.a();
        a4.h(c2046i.f15151a);
        a4.f14963q = EnumC1992c.f14844o;
        a4.f14962p = c2046i.f15152b;
        C2046i a5 = a4.a();
        l lVar = new l(6);
        lVar.f1194u = new HashMap();
        lVar.f1192s = Long.valueOf(c2052o.f15164a.c());
        lVar.f1193t = Long.valueOf(c2052o.f15165b.c());
        lVar.f1190q = "PLAY_BILLING_LIBRARY";
        lVar.f1191r = new C2049l(c1991b, c1990a.f14842a.b());
        lVar.f1189p = null;
        B1.c cVar = (B1.c) dVar;
        cVar.f134b.execute(new B1.a(cVar, a5, bVar, lVar.d()));
    }

    @Override // I3.a
    public Object get() {
        return new C2052o(new V2.e(6), new C2033d(5), (B1.d) ((C0077n) this.f14961o).get(), (C1.l) ((J0) this.f14962p).get(), (u0.g) ((C0326Qb) this.f14963q).get());
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f14961o = str;
    }
}
