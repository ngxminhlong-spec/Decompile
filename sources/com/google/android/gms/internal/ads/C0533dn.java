package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533dn implements InterfaceC0830km {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8509a;

    /* renamed from: b, reason: collision with root package name */
    public final Tj f8510b;
    public final Object c;

    public C0533dn(Tj tj) {
        this.f8509a = 0;
        this.c = new HashMap();
        this.f8510b = tj;
    }

    public C0533dn(C1046pn c1046pn, Tj tj) {
        this.f8509a = 1;
        this.c = c1046pn;
        this.f8510b = tj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.gms.internal.ads.u9, com.google.android.gms.internal.ads.Wg] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.lb, com.google.android.gms.internal.ads.Wg] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0830km
    public final C0873lm a(String str, JSONObject jSONObject) {
        C0873lm c0873lm;
        V9 a4;
        switch (this.f8509a) {
            case 0:
                synchronized (this) {
                    try {
                        c0873lm = (C0873lm) ((HashMap) this.c).get(str);
                        if (c0873lm == null) {
                            c0873lm = new C0873lm(this.f8510b.b(str, jSONObject), new AbstractBinderC0862lb(), str);
                            ((HashMap) this.c).put(str, c0873lm);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c0873lm;
            default:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r1)).booleanValue()) {
                    try {
                        a4 = this.f8510b.a(str);
                    } catch (RemoteException e4) {
                        Y9.q("Coundn't create RTB adapter: ", e4);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((C1046pn) this.c).f10041a;
                    if (concurrentHashMap.containsKey(str)) {
                        a4 = (V9) concurrentHashMap.get(str);
                    }
                    a4 = null;
                }
                if (a4 == null) {
                    return null;
                }
                return new C0873lm(a4, new AbstractBinderC1240u9(), str);
        }
    }
}
