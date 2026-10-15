package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n2.BinderC1813b;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0309Me implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6252o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BinderC0314Ne f6253p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Runnable f6254q;

    public /* synthetic */ RunnableC0309Me(BinderC0314Ne binderC0314Ne, Runnable runnable, int i4) {
        this.f6252o = i4;
        this.f6253p = binderC0314Ne;
        this.f6254q = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        switch (this.f6252o) {
            case 0:
                AbstractC0266Ec.f4899e.execute(new RunnableC0309Me(this.f6253p, this.f6254q, 1));
                return;
            default:
                h2.y.d("Adapters must be initialized on the main thread.");
                HashMap hashMap = N1.n.f1204A.f1209g.c().x().c;
                if (hashMap.isEmpty()) {
                    return;
                }
                Runnable runnable = this.f6254q;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        Y9.t("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                BinderC0314Ne binderC0314Ne = this.f6253p;
                if (((InterfaceC1069q9) ((AtomicReference) binderC0314Ne.f6342q.f7065a.f6527r).get()) != null) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        for (C0897m9 c0897m9 : ((C0940n9) it.next()).f9717a) {
                            String str = c0897m9.f9570b;
                            for (String str2 : c0897m9.f9569a) {
                                if (!hashMap2.containsKey(str2)) {
                                    hashMap2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) hashMap2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            C0873lm a4 = binderC0314Ne.f6343r.a(str3, jSONObject);
                            if (a4 != null) {
                                Pp pp = (Pp) a4.f9463b;
                                boolean a5 = pp.a();
                                InterfaceC1154s9 interfaceC1154s9 = pp.f6603a;
                                if (!a5) {
                                    try {
                                        if (interfaceC1154s9.E()) {
                                            try {
                                                interfaceC1154s9.u3(new BinderC1813b(binderC0314Ne.f6340o), (Em) a4.c, (List) entry.getValue());
                                                Y9.m("Initialized rewarded video mediation adapter " + str3);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (Kp e4) {
                            Y9.t("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e4);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
