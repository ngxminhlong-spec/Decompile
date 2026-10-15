package H;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037l implements InterfaceC0038m {

    /* renamed from: o, reason: collision with root package name */
    public final ScrollFeedbackProvider f829o;

    public C0037l(NestedScrollView nestedScrollView) {
        this.f829o = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // H.InterfaceC0038m
    public final void onScrollLimit(int i4, int i5, int i6, boolean z4) {
        this.f829o.onScrollLimit(i4, i5, i6, z4);
    }

    @Override // H.InterfaceC0038m
    public final void onScrollProgress(int i4, int i5, int i6, int i7) {
        this.f829o.onScrollProgress(i4, i5, i6, i7);
    }
}
