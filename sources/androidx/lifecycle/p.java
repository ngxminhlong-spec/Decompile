package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class p {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, f fVar) {
        S3.e.e(fVar, "event");
        if (activity instanceof i) {
            k f4 = ((i) activity).f();
            if (U.a.q(f4)) {
                f4.d(fVar);
            }
        }
    }

    public static void b(androidx.activity.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.a.Companion.getClass();
            dVar.registerActivityLifecycleCallbacks(new r.a());
        }
        FragmentManager fragmentManager = dVar.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
