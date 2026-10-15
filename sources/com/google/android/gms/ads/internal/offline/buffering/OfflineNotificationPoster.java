package com.google.android.gms.ads.internal.offline.buffering;

import O1.C0059e;
import O1.C0077n;
import O1.C0081p;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.InterfaceC0947na;
import n0.g;
import n0.j;
import n0.l;
import n0.m;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0947na f3853u;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0077n c0077n = C0081p.f1374f.f1376b;
        BinderC0983o9 binderC0983o9 = new BinderC0983o9();
        c0077n.getClass();
        this.f3853u = (InterfaceC0947na) new C0059e(context, binderC0983o9).d(context, false);
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        Object obj = getInputData().f14090a.get("uri");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = getInputData().f14090a.get("gws_query_id");
        try {
            this.f3853u.f1(new BinderC1813b(getApplicationContext()), str, obj2 instanceof String ? (String) obj2 : null);
            return new l(g.c);
        } catch (RemoteException unused) {
            return new j();
        }
    }
}
