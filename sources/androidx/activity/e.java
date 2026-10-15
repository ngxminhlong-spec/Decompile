package androidx.activity;

import androidx.fragment.app.C0161j;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: o, reason: collision with root package name */
    public final C0161j f2421o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f2422p;

    public e(f fVar, C0161j c0161j) {
        this.f2422p = fVar;
        this.f2421o = c0161j;
    }

    @Override // androidx.activity.a
    public final void cancel() {
        ArrayDeque arrayDeque = this.f2422p.f2424b;
        C0161j c0161j = this.f2421o;
        arrayDeque.remove(c0161j);
        c0161j.f2869b.remove(this);
    }
}
