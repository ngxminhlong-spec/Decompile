package com.google.android.material.datepicker;

import android.app.job.JobInfo;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ JobInfo.TriggerContentUri c(Uri uri, int i4) {
        return new JobInfo.TriggerContentUri(uri, i4);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void n(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        executorService.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void o(o3.f fVar) {
        if ((Build.VERSION.SDK_INT <= 23 || fVar != ForkJoinPool.commonPool()) && !fVar.f14355o.isTerminated()) {
            fVar.shutdown();
            throw null;
        }
    }
}
