package D;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.gms.internal.ads.C0254Cc;
import com.google.android.gms.internal.ads.C0260Dc;
import com.google.android.gms.internal.ads.Wu;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern b() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern c(int i4, int i5) {
        return new MediaCodec.CryptoInfo.Pattern(i4, i5);
    }

    public static /* bridge */ /* synthetic */ LocaleList g(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void t(C0254Cc c0254Cc) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || c0254Cc != ForkJoinPool.commonPool()) && !(isTerminated = c0254Cc.isTerminated())) {
            c0254Cc.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = c0254Cc.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        c0254Cc.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void u(C0260Dc c0260Dc) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || c0260Dc != ForkJoinPool.commonPool()) && !(isTerminated = c0260Dc.isTerminated())) {
            c0260Dc.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = c0260Dc.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        c0260Dc.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void v(Wu wu) {
        boolean isTerminated;
        ExecutorService executorService = (ExecutorService) wu.f4623p;
        if ((Build.VERSION.SDK_INT <= 23 || wu != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            wu.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        wu.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
