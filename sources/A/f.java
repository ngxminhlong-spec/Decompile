package A;

import android.content.pm.ApkChecksum;
import android.graphics.fonts.Font;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.TrackChangeEvent;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ Font.Builder d(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager i(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ TrackChangeEvent.Builder p(int i4) {
        return new TrackChangeEvent.Builder(i4);
    }
}
