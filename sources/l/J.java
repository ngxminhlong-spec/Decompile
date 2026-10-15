package l;

import android.content.pm.PackageManager;
import android.view.textclassifier.TextClassificationManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class J {
    public static /* bridge */ /* synthetic */ TextClassificationManager c(Object obj) {
        return (TextClassificationManager) obj;
    }

    public static /* bridge */ /* synthetic */ boolean q(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }
}
