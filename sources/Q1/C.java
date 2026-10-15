package Q1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0937n6;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1620a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1621b = new ArrayList();
    public final Context c;

    public C(Context context) {
        this.c = context;
    }

    public final void a() {
        SharedPreferences defaultSharedPreferences;
        C0937n6 c0937n6 = AbstractC1066q6.O8;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            N n4 = N1.n.f1204A.c;
            HashMap F2 = N.F((String) rVar.c.a(AbstractC1066q6.S8));
            for (String str : F2.keySet()) {
                synchronized (this) {
                    try {
                        if (!this.f1620a.containsKey(str)) {
                            if (str != "__default__" && (str == null || !str.equals("__default__"))) {
                                defaultSharedPreferences = this.c.getSharedPreferences(str, 0);
                                B b4 = new B(0, this, str);
                                this.f1620a.put(str, b4);
                                defaultSharedPreferences.registerOnSharedPreferenceChangeListener(b4);
                            }
                            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
                            B b42 = new B(0, this, str);
                            this.f1620a.put(str, b42);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(b42);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            b(new A(F2));
        }
    }

    public final synchronized void b(A a4) {
        this.f1621b.add(a4);
    }
}
