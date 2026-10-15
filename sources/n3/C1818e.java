package n3;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o3.ThreadFactoryC1900a;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1818e implements InterfaceC2053a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14119a;

    @Override // w3.InterfaceC2053a
    public final Object get() {
        switch (this.f14119a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                m mVar = ExecutorsRegistrar.f12545a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i4 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i4 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new o3.f(Executors.newFixedThreadPool(4, new ThreadFactoryC1900a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                m mVar2 = ExecutorsRegistrar.f12545a;
                return new o3.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC1900a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                m mVar3 = ExecutorsRegistrar.f12545a;
                return new o3.f(Executors.newCachedThreadPool(new ThreadFactoryC1900a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                m mVar4 = ExecutorsRegistrar.f12545a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1900a("Firebase Scheduler", 0, null));
        }
    }
}
