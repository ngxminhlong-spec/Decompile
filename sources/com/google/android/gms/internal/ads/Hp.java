package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hp implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5511a;

    public /* synthetic */ Hp(int i4) {
        this.f5511a = i4;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.google.android.gms.internal.ads.Sp] */
    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f5511a) {
            case 0:
                return new Object();
            case 1:
                Object obj = new Object();
                try {
                    AbstractC1440yv.a();
                } catch (GeneralSecurityException e4) {
                    Q1.I.w("Failed to Configure Aead. ".concat(e4.toString()));
                    N1.n.f1204A.f1209g.h("CryptoUtils.registerAead", e4);
                }
                return obj;
            case 2:
                return new Np();
            case 3:
                return C1798a.f13957a;
            case 4:
                ?? obj2 = new Object();
                obj2.f7010a = null;
                return obj2;
            case 5:
                return new C0535dq();
            case 6:
                C0260Dc c0260Dc = AbstractC0266Ec.f4899e;
                AbstractC0587ez.n(c0260Dc);
                return c0260Dc;
            case 7:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (unconfigurableExecutorService instanceof Su) {
                    return (Su) unconfigurableExecutorService;
                }
                return unconfigurableExecutorService instanceof ScheduledExecutorService ? new Wu((ScheduledExecutorService) unconfigurableExecutorService) : new C0260Dc(unconfigurableExecutorService);
            case 8:
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4899e;
                AbstractC0587ez.n(c0260Dc2);
                return c0260Dc2;
            default:
                return new ThreadFactoryC0341Tb(1);
        }
    }
}
