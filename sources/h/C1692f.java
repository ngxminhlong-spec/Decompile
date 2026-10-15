package h;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692f implements Drawable.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13098o = 0;

    /* renamed from: p, reason: collision with root package name */
    public Object f13099p;

    public /* synthetic */ C1692f() {
    }

    public C1692f(l0.c cVar) {
        this.f13099p = cVar;
    }

    private final void a(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f13098o) {
            case 0:
                return;
            default:
                ((l0.c) this.f13099p).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        switch (this.f13098o) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f13099p;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j4);
                    return;
                }
                return;
            default:
                ((l0.c) this.f13099p).scheduleSelf(runnable, j4);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f13098o) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f13099p;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((l0.c) this.f13099p).unscheduleSelf(runnable);
                return;
        }
    }
}
