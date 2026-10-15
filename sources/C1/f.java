package C1;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.billingclient.api.Purchase;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m2.AbstractC1806a;
import q1.AbstractC1959n;
import q1.InterfaceC1958m;
import w1.C2046i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f479o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f480p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f481q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f482r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f483s;

    public /* synthetic */ f(int i4, B0.d dVar, MainActivity mainActivity, List list) {
        this.f480p = i4;
        this.f481q = dVar;
        this.f482r = mainActivity;
        this.f483s = list;
    }

    public /* synthetic */ f(l lVar, C2046i c2046i, int i4, Runnable runnable) {
        this.f481q = lVar;
        this.f482r = c2046i;
        this.f480p = i4;
        this.f483s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f479o;
        int i5 = 0;
        Object obj = this.f483s;
        Object obj2 = this.f482r;
        Object obj3 = this.f481q;
        final int i6 = this.f480p;
        int i7 = 1;
        switch (i4) {
            case 0:
                final l lVar = (l) obj3;
                final C2046i c2046i = (C2046i) obj2;
                Runnable runnable = (Runnable) obj;
                E1.c cVar = (E1.c) lVar.f503f;
                try {
                    try {
                        D1.d dVar = (D1.d) lVar.c;
                        Objects.requireNonNull(dVar);
                        ((D1.h) cVar).g(new g(i7, dVar));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) lVar.f500a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((D1.h) cVar).g(new E1.b() { // from class: C1.h
                                @Override // E1.b
                                public final Object a() {
                                    ((q2.e) l.this.d).z(c2046i, i6 + 1, false);
                                    return null;
                                }
                            });
                        } else {
                            lVar.j(c2046i, i6);
                        }
                    } catch (E1.a unused) {
                        ((q2.e) lVar.d).z(c2046i, i6 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
            default:
                B0.d dVar2 = (B0.d) obj3;
                MainActivity mainActivity = (MainActivity) obj2;
                List<Purchase> list = (List) obj;
                if (i6 != AbstractC1806a.f14004M) {
                    return;
                }
                int i8 = dVar2.f72b;
                if (i8 != 0) {
                    Boolean bool = AbstractC1959n.f14700a;
                    SharedPreferences.Editor edit = mainActivity.getPreferences(0).edit();
                    edit.putInt("billing_result", i8);
                    edit.apply();
                    AbstractC1959n.d = Integer.valueOf(i8);
                    ArrayList arrayList = AbstractC1959n.f14703f;
                    int size = arrayList.size();
                    while (i5 < size) {
                        Object obj4 = arrayList.get(i5);
                        i5++;
                        ((InterfaceC1958m) obj4).d();
                    }
                    return;
                }
                if (list == null) {
                    return;
                }
                for (Purchase purchase : list) {
                    if (purchase.a() == 1) {
                        AbstractC1959n.g(mainActivity, true);
                        if (!purchase.c.optBoolean("acknowledged", true) && AbstractC1806a.N.a()) {
                            AbstractC1806a.d(AbstractC1806a.N, purchase);
                        }
                    } else if (purchase.a() == 2) {
                        AbstractC1806a.f14007Q = true;
                        AbstractC1959n.e();
                    }
                }
                return;
        }
    }
}
