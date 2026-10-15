package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final x f13563a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1752b f13564b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k0.x] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k0.x] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f13563a = new Object();
        } else {
            f13563a = new Object();
        }
        f13564b = new C1752b(Float.class, "translationAlpha", 5);
        new C1752b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i4, int i5, int i6, int i7) {
        f13563a.j0(view, i4, i5, i6, i7);
    }
}
