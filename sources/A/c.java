package A;

import android.app.Notification;
import android.content.Context;
import android.graphics.Insets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class c {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i4, int i5, int i6, int i7) {
        return Insets.of(i4, i5, i6, i7);
    }

    public static void c(Notification.Builder builder, boolean z4) {
        builder.setAllowSystemGeneratedContextualActions(z4);
    }

    public static void d(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
