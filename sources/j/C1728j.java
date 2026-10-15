package j;

import H.F;
import H.G;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728j {
    public Interpolator c;
    public G d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13324e;

    /* renamed from: b, reason: collision with root package name */
    public long f13323b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C1727i f13325f = new C1727i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13322a = new ArrayList();

    public final void a() {
        if (this.f13324e) {
            ArrayList arrayList = this.f13322a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((F) obj).b();
            }
            this.f13324e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f13324e) {
            return;
        }
        ArrayList arrayList = this.f13322a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            F f4 = (F) obj;
            long j4 = this.f13323b;
            if (j4 >= 0) {
                f4.c(j4);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) f4.f787a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                f4.d(this.f13325f);
            }
            View view2 = (View) f4.f787a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f13324e = true;
    }
}
