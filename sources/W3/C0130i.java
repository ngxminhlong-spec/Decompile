package W3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0130i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2100b = AtomicIntegerFieldUpdater.newUpdater(C0130i.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2101a;

    public C0130i(Throwable th) {
        this.f2101a = th;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2101a + ']';
    }
}
