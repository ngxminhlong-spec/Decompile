package H;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0038m f830a;

    public C0039n(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f830a = new C0037l(nestedScrollView);
        } else {
            this.f830a = new V2.e(7);
        }
    }
}
