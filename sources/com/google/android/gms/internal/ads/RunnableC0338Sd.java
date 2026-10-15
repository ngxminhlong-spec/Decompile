package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import b1.C0215b;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0338Sd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6984o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Pq f6985p;

    public /* synthetic */ RunnableC0338Sd(Pq pq, int i4) {
        this.f6984o = i4;
        this.f6985p = pq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f6984o;
        Yq yq = Yq.f7900r;
        Pq pq = this.f6985p;
        switch (i4) {
            case 0:
                N1.n.f1204A.f1224v.getClass();
                C0347Uc.s(new RunnableC0338Sd(pq, 2));
                return;
            case 1:
                Rq rq = (Rq) pq;
                if (rq.f6859e) {
                    return;
                }
                rq.f6859e = true;
                ArrayList arrayList = Zq.c.f8056b;
                boolean z4 = arrayList.size() > 0;
                arrayList.add(rq);
                if (!z4) {
                    C0215b a4 = C0215b.a();
                    a4.getClass();
                    yq.f8294q = a4;
                    yq.f8292o = true;
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    boolean z5 = runningAppProcessInfo.importance == 100 || yq.b();
                    yq.f8293p = z5;
                    yq.a(z5);
                    C0878lr.f9494g.getClass();
                    C0878lr.b();
                    Wq wq = (Wq) a4.f3458p;
                    wq.c = wq.a();
                    wq.b();
                    wq.f7573a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, wq);
                }
                Zf.B(rq.d.a(), "setDeviceVolume", Float.valueOf(C0215b.a().f3457o));
                AbstractC0579er abstractC0579er = rq.d;
                Date date = (Date) Xq.f7703s.f7706q;
                abstractC0579er.c(date != null ? (Date) date.clone() : null);
                rq.d.d(rq, rq.f6857a);
                return;
            default:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r4)).booleanValue() && Wj.f7528E.f7724p) {
                    Rq rq2 = (Rq) pq;
                    if (rq2.f6860f) {
                        return;
                    }
                    rq2.c.clear();
                    if (!rq2.f6860f) {
                        rq2.f6858b.clear();
                    }
                    rq2.f6860f = true;
                    Zf.B(rq2.d.a(), "finishSession", new Object[0]);
                    Zq zq = Zq.c;
                    ArrayList arrayList2 = zq.f8055a;
                    ArrayList arrayList3 = zq.f8056b;
                    boolean z6 = arrayList3.size() > 0;
                    arrayList2.remove(rq2);
                    arrayList3.remove(rq2);
                    if (z6 && arrayList3.size() <= 0) {
                        C0215b a5 = C0215b.a();
                        a5.getClass();
                        C0878lr c0878lr = C0878lr.f9494g;
                        c0878lr.getClass();
                        Handler handler = C0878lr.f9496i;
                        if (handler != null) {
                            handler.removeCallbacks(C0878lr.f9498k);
                            C0878lr.f9496i = null;
                        }
                        c0878lr.f9499a.clear();
                        C0878lr.f9495h.post(new RunnableC0744il(14, c0878lr));
                        yq.f8292o = false;
                        yq.f8294q = null;
                        Wq wq2 = (Wq) a5.f3458p;
                        wq2.f7573a.getContentResolver().unregisterContentObserver(wq2);
                    }
                    rq2.d.b();
                    rq2.d = null;
                    return;
                }
                return;
        }
    }
}
