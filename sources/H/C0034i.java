package H;

import android.view.View;
import b0.c0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034i {

    /* renamed from: a, reason: collision with root package name */
    public int f824a;

    /* renamed from: b, reason: collision with root package name */
    public int f825b;

    public C0034i(int i4, int i5) {
        this.f824a = i4;
        this.f825b = i5;
    }

    public void a(c0 c0Var) {
        View view = c0Var.f3244a;
        this.f824a = view.getLeft();
        this.f825b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
