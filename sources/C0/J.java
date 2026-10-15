package C0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.Jn;
import java.lang.reflect.Method;
import x.AbstractC2056c;
import x.C2055b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f233o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f234p;

    public /* synthetic */ J(int i4, Object obj) {
        this.f233o = i4;
        this.f234p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i4 = this.f233o;
        int i5 = 3;
        Object obj2 = this.f234p;
        switch (i4) {
            case 0:
                ((ViewGroup) obj2).setVisibility(8);
                return;
            case 1:
                u0.g gVar = (u0.g) obj2;
                ((D1.h) ((E1.c) gVar.f14986s)).g(new C1.g(i5, gVar));
                return;
            case 2:
                com.google.firebase.storage.m mVar = (com.google.firebase.storage.m) obj2;
                try {
                    mVar.u();
                    return;
                } finally {
                    mVar.k();
                }
            default:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = AbstractC2056c.f15176g;
                Method method = AbstractC2056c.f15175f;
                int i6 = Build.VERSION.SDK_INT;
                int i7 = 28;
                if (i6 >= 28) {
                    activity.recreate();
                    return;
                }
                int i8 = 27;
                if (((i6 != 26 && i6 != 27) || method != null) && (AbstractC2056c.f15174e != null || AbstractC2056c.d != null)) {
                    try {
                        Object obj3 = AbstractC2056c.c.get(activity);
                        if (obj3 != null && (obj = AbstractC2056c.f15173b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C2055b c2055b = new C2055b(activity);
                            application.registerActivityLifecycleCallbacks(c2055b);
                            handler.post(new Jn(i8, c2055b, obj3));
                            try {
                                if (i6 == 26 || i6 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new Jn(i7, application, c2055b));
                                return;
                            } finally {
                                handler.post(new Jn(i7, application, c2055b));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}
