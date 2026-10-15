package Q1;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0316Ob;
import com.google.android.gms.internal.ads.C0361Xb;
import com.google.android.gms.internal.ads.C0366Yb;
import com.google.android.gms.internal.ads.C0828kk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import l2.C1798a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1619b;
    public final /* synthetic */ Object c;

    public /* synthetic */ B(int i4, Object obj, String str) {
        this.f1618a = i4;
        this.c = obj;
        this.f1619b = str;
    }

    private final void a(SharedPreferences sharedPreferences, String str) {
        synchronized (((C0366Yb) this.c)) {
            try {
                ArrayList arrayList = ((C0366Yb) this.c).f7830b;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    C0361Xb c0361Xb = (C0361Xb) obj;
                    String str2 = this.f1619b;
                    C0366Yb c0366Yb = c0361Xb.f7625a;
                    HashMap hashMap = c0361Xb.f7626b;
                    c0366Yb.getClass();
                    if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                        C0258Da c0258Da = c0366Yb.d;
                        ((C1798a) c0258Da.f4618p).getClass();
                        ((C0316Ob) c0258Da.f4619q).b(-1, System.currentTimeMillis());
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f1618a) {
            case 0:
                synchronized (((C) this.c)) {
                    try {
                        ArrayList arrayList = ((C) this.c).f1621b;
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            String str2 = this.f1619b;
                            HashMap hashMap = ((A) obj).f1617a;
                            if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                                N1.n.f1204A.f1209g.c().i(false);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                a(sharedPreferences, str);
                return;
            default:
                C0828kk c0828kk = (C0828kk) this.c;
                c0828kk.f9315j.set(AbstractC1895f.F(c0828kk.f9309b, this.f1619b));
                return;
        }
    }
}
