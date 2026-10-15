package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class RD {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i5, double d) {
        List supportedPerformancePoints;
        boolean covers;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = AbstractC0751is.f9072b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = AbstractC0751is.d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    MediaCodecInfo.VideoCapabilities.PerformancePoint d4 = On.d(i4, i5, (int) d);
                    for (int i6 = 0; i6 < supportedPerformancePoints.size(); i6++) {
                        covers = On.e(supportedPerformancePoints.get(i6)).covers(d4);
                        if (covers) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
