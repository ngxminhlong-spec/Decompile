package C0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.firebase.FirebaseCommonRegistrar;
import f.C1667b;
import i1.InterfaceC1715a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import n3.C1814a;
import n3.InterfaceC1817d;
import t1.EnumC1992c;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0003c implements InterfaceC1715a, E1.b, D1.f, InterfaceC1817d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f283o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f284p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f285q;

    public /* synthetic */ C0003c(int i4, Object obj, Object obj2) {
        this.f283o = i4;
        this.f284p = obj;
        this.f285q = obj2;
    }

    @Override // E1.b
    public Object a() {
        switch (this.f283o) {
            case 1:
                C1.l lVar = (C1.l) this.f284p;
                Iterable iterable = (Iterable) this.f285q;
                D1.h hVar = (D1.h) ((D1.d) lVar.c);
                hVar.getClass();
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                hVar.a().compileStatement("DELETE FROM events WHERE _id in " + D1.h.h(iterable)).execute();
                return null;
            default:
                C1.l lVar2 = (C1.l) this.f284p;
                for (Map.Entry entry : ((HashMap) this.f285q).entrySet()) {
                    ((D1.h) ((D1.c) lVar2.f506i)).f(((Integer) entry.getValue()).intValue(), z1.c.f15955u, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override // D1.f
    public Object apply(Object obj) {
        D1.h hVar = (D1.h) this.f284p;
        C2046i c2046i = (C2046i) this.f285q;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        D1.a aVar = hVar.f659r;
        ArrayList e4 = hVar.e(sQLiteDatabase, c2046i, aVar.f646b);
        for (EnumC1992c enumC1992c : EnumC1992c.values()) {
            if (enumC1992c != c2046i.c) {
                int size = aVar.f646b - e4.size();
                if (size <= 0) {
                    break;
                }
                t3.g a4 = C2046i.a();
                a4.h(c2046i.f15151a);
                if (enumC1992c == null) {
                    throw new NullPointerException("Null priority");
                }
                a4.f14963q = enumC1992c;
                a4.f14962p = c2046i.f15152b;
                e4.addAll(hVar.e(sQLiteDatabase, a4.a(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < e4.size(); i4++) {
            sb.append(((D1.b) e4.get(i4)).f648a);
            if (i4 < e4.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j4 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j4));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j4), set);
                }
                set.add(new D1.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = e4.listIterator();
        while (listIterator.hasNext()) {
            D1.b bVar = (D1.b) listIterator.next();
            long j5 = bVar.f648a;
            if (hashMap.containsKey(Long.valueOf(j5))) {
                N1.l c = bVar.c.c();
                for (D1.g gVar : (Set) hashMap.get(Long.valueOf(j5))) {
                    c.a(gVar.f653a, gVar.f654b);
                }
                listIterator.set(new D1.b(j5, bVar.f649b, c.d()));
            }
        }
        return e4;
    }

    @Override // n3.InterfaceC1817d
    public Object c(C0326Qb c0326Qb) {
        String valueOf;
        int i4;
        switch (this.f283o) {
            case 4:
                String str = (String) this.f284p;
                D3.b bVar = (D3.b) this.f285q;
                Context context = (Context) c0326Qb.a(Context.class);
                switch (bVar.f672o) {
                    case 5:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 6:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            i4 = applicationInfo2.minSdkVersion;
                            valueOf = String.valueOf(i4);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 7:
                        int i5 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i5 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new D3.a(str, valueOf);
            default:
                String str2 = (String) this.f284p;
                C1814a c1814a = (C1814a) this.f285q;
                try {
                    Trace.beginSection(str2);
                    return c1814a.f14115f.c(c0326Qb);
                } finally {
                    Trace.endSection();
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // i1.InterfaceC1715a
    public void k(Throwable th) {
        D d = (D) this.f284p;
        L2.b bVar = new L2.b((Context) this.f285q);
        if (th == null) {
            bVar.s(R.string.save_success);
            d.s0(R.string.save_success);
            E0.a aVar = ((e1.d) d.f202i0.f3821o.f14880o).f12684S;
            aVar.f708p = aVar.f707o;
            d.e0();
        } else {
            bVar.s(R.string.export_fail);
            ((C1667b) bVar.f113p).f12789f = th.getMessage();
        }
        bVar.q(R.string.close, new Object());
        bVar.k();
    }
}
